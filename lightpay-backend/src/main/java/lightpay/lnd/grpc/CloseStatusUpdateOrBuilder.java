// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface CloseStatusUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.CloseStatusUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.lnrpc.PendingUpdate close_pending = 1[json_name = "close_pending"];</code>
   */
  boolean hasClosePending();
  /**
   * <code>.lnrpc.PendingUpdate close_pending = 1[json_name = "close_pending"];</code>
   */
  lightpay.lnd.grpc.PendingUpdate getClosePending();
  /**
   * <code>.lnrpc.PendingUpdate close_pending = 1[json_name = "close_pending"];</code>
   */
  lightpay.lnd.grpc.PendingUpdateOrBuilder getClosePendingOrBuilder();

  /**
   * <code>.lnrpc.ConfirmationUpdate confirmation = 2[json_name = "confirmation"];</code>
   */
  boolean hasConfirmation();
  /**
   * <code>.lnrpc.ConfirmationUpdate confirmation = 2[json_name = "confirmation"];</code>
   */
  lightpay.lnd.grpc.ConfirmationUpdate getConfirmation();
  /**
   * <code>.lnrpc.ConfirmationUpdate confirmation = 2[json_name = "confirmation"];</code>
   */
  lightpay.lnd.grpc.ConfirmationUpdateOrBuilder getConfirmationOrBuilder();

  /**
   * <code>.lnrpc.ChannelCloseUpdate chan_close = 3[json_name = "chan_close"];</code>
   */
  boolean hasChanClose();
  /**
   * <code>.lnrpc.ChannelCloseUpdate chan_close = 3[json_name = "chan_close"];</code>
   */
  lightpay.lnd.grpc.ChannelCloseUpdate getChanClose();
  /**
   * <code>.lnrpc.ChannelCloseUpdate chan_close = 3[json_name = "chan_close"];</code>
   */
  lightpay.lnd.grpc.ChannelCloseUpdateOrBuilder getChanCloseOrBuilder();

  public lightpay.lnd.grpc.CloseStatusUpdate.UpdateCase getUpdateCase();
}
