import { Component, OnInit, AfterViewInit, ViewChild, OnDestroy } from '@angular/core';
import { PagingActionService } from '../paging/paging-action.service';
import { PaymentComponent } from './payment/payment.component';
import { AccountComponent } from './account/account.component';
import { ReceivingComponent } from './receiving/receiving.component';
import { DispatcherService } from '../common/services/dispatcher.service';
import { _ } from 'app';
import { Payload } from 'app/common/base/emitter';
import { ReceiveCoinsComponent } from './receive-coins/receive-coins.component';
import { PagingAction } from 'app/paging/paging-action';
import { SendCoinsComponent } from 'app/wallet/send-coins/send-coins.component';
import { WalletHistoryComponent } from './wallet-history/wallet-history.component';
import { WalletMenuComponent } from './wallet-menu/wallet-menu.component';
import { ApplicationSettingComponent } from './application-setting/application-setting.component';
import { ChannelListComponent } from './channel-list/channel-list.component';

@Component({
  selector: 'lp-wallet',
  templateUrl: './wallet.component.html',
  styleUrls: ['./wallet.component.scss']
})
export class WalletComponent implements OnInit, AfterViewInit, OnDestroy {

  static readonly EVENT_PREFIX: string = "WalletComponent.";
  static readonly SELECT_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "select-page";
  static readonly MOVE_RECEIVE_COINS_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "move-receive-coins-page";
  static readonly CLOSE_RECEIVE_COINS_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "close-receive-coins-page";
  static readonly MOVE_SEND_COINS_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "move-send-coins-page";
  static readonly CLOSE_SEND_COINS_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "close-send-coins-page";
  static readonly MOVE_WALLET_HISTORY_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "move-wallet-history-page";
  static readonly CLOSE_WALLET_HISTORY_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "close-wallet-history-page";
  static readonly CLOSE_WALLET_MENU_EVENT: string = WalletComponent.EVENT_PREFIX + "close-wallet-menu";
  static readonly MOVE_APPLICATION_SETTING_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "move-application-setting-page";
  static readonly CLOSE_APPLICATION_SETTING_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "close-application-setting-page";
  static readonly MOVE_CHANNEL_LIST_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "move-channel-list-page";
  static readonly CLOSE_CHANNEL_LIST_PAGE_EVENT: string = WalletComponent.EVENT_PREFIX + "close-channel-list-page";

  static readonly PAGING_NAME: string = "wallet";
  pagingName: string = WalletComponent.PAGING_NAME;

  @ViewChild(ReceivingComponent)
  receivingComponent: ReceivingComponent;

  @ViewChild(PaymentComponent)
  paymentComponent: PaymentComponent;

  @ViewChild(AccountComponent)
  accountComponent: AccountComponent;

  pageNameAccount: string = AccountComponent.PAGE_NAME;
  pageNamePayment: string = PaymentComponent.PAGE_NAME;
  pageNameReceiving: string = ReceivingComponent.PAGE_NAME;

  currentPage: string;

  displayPaging: boolean;

  private registerId: string;

  constructor(
    private dispatcherService: DispatcherService,
    private pagingActionService: PagingActionService
  ) { }

  ngOnInit() {
    this.registerId = this.dispatcherService.register(
      (payload: Payload) => {
        switch (payload.eventType) {
          case WalletComponent.MOVE_RECEIVE_COINS_PAGE_EVENT:
            this.moveReceiveCoinsPage();
            break;
          case WalletComponent.CLOSE_RECEIVE_COINS_PAGE_EVENT:
            this.closeReceiveCoinsPage();
            break;
          case WalletComponent.MOVE_SEND_COINS_PAGE_EVENT:
            this.moveSendCoinsPage();
            break;
          case WalletComponent.CLOSE_SEND_COINS_PAGE_EVENT:
            this.closeSendCoinsPage();
            break;
          case WalletComponent.MOVE_WALLET_HISTORY_PAGE_EVENT:
            this.moveWalletHistoryPage();
            break;
          case WalletComponent.CLOSE_WALLET_HISTORY_PAGE_EVENT:
            this.closeWalletHistoryPage();
            break;
          case WalletComponent.CLOSE_WALLET_MENU_EVENT:
            this.closeWalletMenu();
            break;
          case WalletComponent.MOVE_APPLICATION_SETTING_PAGE_EVENT:
            this.moveApplicationSettingPage();
            break;
          case WalletComponent.CLOSE_APPLICATION_SETTING_PAGE_EVENT:
            this.closeApplicationSettingPage();
            break;
          case WalletComponent.MOVE_CHANNEL_LIST_PAGE_EVENT:
            this.moveChannelListPage();
            break;
          case WalletComponent.CLOSE_CHANNEL_LIST_PAGE_EVENT:
            this.closeChannelListPage();
            break;
        }
      }
    );
  }

  ngOnDestroy() {
    this.dispatcherService.unregister(this.registerId);
  }

  ngAfterViewInit() {
    _.defer(() => {
      this.selectAccount();
    });
  }

  selectAccount() {
    this.currentPage = AccountComponent.PAGE_NAME;
    this.dispatcherService.emit({
      eventType: WalletComponent.SELECT_PAGE_EVENT,
      data: this.currentPage
    });
  }

  selectPayment() {
    this.currentPage = PaymentComponent.PAGE_NAME;
    this.dispatcherService.emit({
      eventType: WalletComponent.SELECT_PAGE_EVENT,
      data: this.currentPage
    });
  }

  selectReceiving() {
    this.currentPage = ReceivingComponent.PAGE_NAME;
    this.dispatcherService.emit({
      eventType: WalletComponent.SELECT_PAGE_EVENT,
      data: this.currentPage
    });
  }

  selectWalletMenu() {
    this.displayPaging = true;
    this.pagingActionService.move(WalletComponent.PAGING_NAME, WalletMenuComponent, null, PagingAction.PageAnimation.IMMEDIATE);
  }

  private closeWalletMenu() {
    this.pagingActionService.move(WalletComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.IMMEDIATE, () => {
      this.displayPaging = false;
    });
  }

  private moveReceiveCoinsPage() {
    this.displayPaging = true;
    this.pagingActionService.move(WalletComponent.PAGING_NAME, ReceiveCoinsComponent, null, PagingAction.PageAnimation.UP);
  }

  private closeReceiveCoinsPage() {
    this.pagingActionService.move(WalletComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.DOWN, () => {
      this.displayPaging = false;
    });
  }

  private moveSendCoinsPage() {
    this.displayPaging = true;
    this.pagingActionService.move(WalletComponent.PAGING_NAME, SendCoinsComponent, null, PagingAction.PageAnimation.UP);
  }

  private closeSendCoinsPage() {
    this.pagingActionService.move(WalletComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.DOWN, () => {
      this.displayPaging = false;
    });
  }

  private moveWalletHistoryPage() {
    this.displayPaging = true;
    this.pagingActionService.move(WalletComponent.PAGING_NAME, WalletHistoryComponent, null, PagingAction.PageAnimation.UP);
  }

  private closeWalletHistoryPage() {
    this.pagingActionService.move(WalletComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.DOWN, () => {
      this.displayPaging = false;
    });
  }

  private moveApplicationSettingPage() {
    this.displayPaging = true;
    this.pagingActionService.move(WalletComponent.PAGING_NAME, ApplicationSettingComponent, null, PagingAction.PageAnimation.UP);
  }

  private closeApplicationSettingPage() {
    this.pagingActionService.move(WalletComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.DOWN, () => {
      this.displayPaging = false;
    });
  }

  private moveChannelListPage() {
    this.displayPaging = true;
    this.pagingActionService.move(WalletComponent.PAGING_NAME, ChannelListComponent, null, PagingAction.PageAnimation.UP);
  }

  private closeChannelListPage() {
    this.pagingActionService.move(WalletComponent.PAGING_NAME, null, null, PagingAction.PageAnimation.DOWN, () => {
      this.displayPaging = false;
    });
  }

}
