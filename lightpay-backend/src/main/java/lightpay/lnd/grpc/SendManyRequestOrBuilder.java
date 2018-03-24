// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface SendManyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.SendManyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */
  int getAddrToAmountCount();
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */
  boolean containsAddrToAmount(
      java.lang.String key);
  /**
   * Use {@link #getAddrToAmountMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Long>
  getAddrToAmount();
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Long>
  getAddrToAmountMap();
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */

  long getAddrToAmountOrDefault(
      java.lang.String key,
      long defaultValue);
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */

  long getAddrToAmountOrThrow(
      java.lang.String key);

  /**
   * <pre>
   *&#47; The target number of blocks that this transaction should be confirmed by.
   * </pre>
   *
   * <code>int32 target_conf = 3;</code>
   */
  int getTargetConf();

  /**
   * <pre>
   *&#47; A manual fee rate set in sat/byte that should be used when crafting the transaction.
   * </pre>
   *
   * <code>int64 sat_per_byte = 5;</code>
   */
  long getSatPerByte();
}
