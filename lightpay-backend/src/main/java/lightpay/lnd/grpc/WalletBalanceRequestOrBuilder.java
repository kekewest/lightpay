// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface WalletBalanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.WalletBalanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; If only witness outputs should be considered when calculating the wallet's balance
   * </pre>
   *
   * <code>bool witness_only = 1;</code>
   */
  boolean getWitnessOnly();
}
