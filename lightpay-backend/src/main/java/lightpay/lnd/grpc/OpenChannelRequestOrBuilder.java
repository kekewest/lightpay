// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface OpenChannelRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.OpenChannelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The pubkey of the node to open a channel with
   * </pre>
   *
   * <code>bytes node_pubkey = 2[json_name = "node_pubkey"];</code>
   */
  com.google.protobuf.ByteString getNodePubkey();

  /**
   * <pre>
   *&#47; The hex encoded pubkey of the node to open a channel with
   * </pre>
   *
   * <code>string node_pubkey_string = 3[json_name = "node_pubkey_string"];</code>
   */
  java.lang.String getNodePubkeyString();
  /**
   * <pre>
   *&#47; The hex encoded pubkey of the node to open a channel with
   * </pre>
   *
   * <code>string node_pubkey_string = 3[json_name = "node_pubkey_string"];</code>
   */
  com.google.protobuf.ByteString
      getNodePubkeyStringBytes();

  /**
   * <pre>
   *&#47; The number of satoshis the wallet should commit to the channel
   * </pre>
   *
   * <code>int64 local_funding_amount = 4[json_name = "local_funding_amount"];</code>
   */
  long getLocalFundingAmount();

  /**
   * <pre>
   *&#47; The number of satoshis to push to the remote side as part of the initial commitment state
   * </pre>
   *
   * <code>int64 push_sat = 5[json_name = "push_sat"];</code>
   */
  long getPushSat();

  /**
   * <pre>
   *&#47; The target number of blocks that the closure transaction should be confirmed by.
   * </pre>
   *
   * <code>int32 target_conf = 6;</code>
   */
  int getTargetConf();

  /**
   * <pre>
   *&#47; A manual fee rate set in sat/byte that should be used when crafting the closure transaction.
   * </pre>
   *
   * <code>int64 sat_per_byte = 7;</code>
   */
  long getSatPerByte();

  /**
   * <pre>
   *&#47; Whether this channel should be private, not announced to the greater network.
   * </pre>
   *
   * <code>bool private = 8[json_name = "private"];</code>
   */
  boolean getPrivate();

  /**
   * <pre>
   *&#47; The minimum value in millisatoshi we will require for incoming HTLCs on the channel.
   * </pre>
   *
   * <code>int64 min_htlc_msat = 9[json_name = "min_htlc_msat"];</code>
   */
  long getMinHtlcMsat();
}
