import { OnInit, HostBinding } from "@angular/core";

export abstract class PageBaseComponent {

  @HostBinding('style.display')
  display: string = "block";

  @HostBinding('style.width.%')
  width: number = 100;

  @HostBinding('style.height.%')
  height: number = 100;

  @HostBinding('style.background-color')
  backgroundColor: string = "#f7f7f7";

  pageData: any;

}