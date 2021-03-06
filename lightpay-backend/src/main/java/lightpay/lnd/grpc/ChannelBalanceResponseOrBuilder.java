// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface ChannelBalanceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.ChannelBalanceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; Sum of channels balances denominated in satoshis
   * </pre>
   *
   * <code>int64 balance = 1[json_name = "balance"];</code>
   */
  long getBalance();

  /**
   * <pre>
   *&#47; Sum of channels pending balances denominated in satoshis
   * </pre>
   *
   * <code>int64 pending_open_balance = 2[json_name = "pending_open_balance"];</code>
   */
  long getPendingOpenBalance();
}
