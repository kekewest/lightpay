// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface PaymentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.Payment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The payment hash
   * </pre>
   *
   * <code>string payment_hash = 1[json_name = "payment_hash"];</code>
   */
  java.lang.String getPaymentHash();
  /**
   * <pre>
   *&#47; The payment hash
   * </pre>
   *
   * <code>string payment_hash = 1[json_name = "payment_hash"];</code>
   */
  com.google.protobuf.ByteString
      getPaymentHashBytes();

  /**
   * <pre>
   *&#47; The value of the payment in satoshis
   * </pre>
   *
   * <code>int64 value = 2[json_name = "value"];</code>
   */
  long getValue();

  /**
   * <pre>
   *&#47; The date of this payment
   * </pre>
   *
   * <code>int64 creation_date = 3[json_name = "creation_date"];</code>
   */
  long getCreationDate();

  /**
   * <pre>
   *&#47; The path this payment took
   * </pre>
   *
   * <code>repeated string path = 4[json_name = "path"];</code>
   */
  java.util.List<java.lang.String>
      getPathList();
  /**
   * <pre>
   *&#47; The path this payment took
   * </pre>
   *
   * <code>repeated string path = 4[json_name = "path"];</code>
   */
  int getPathCount();
  /**
   * <pre>
   *&#47; The path this payment took
   * </pre>
   *
   * <code>repeated string path = 4[json_name = "path"];</code>
   */
  java.lang.String getPath(int index);
  /**
   * <pre>
   *&#47; The path this payment took
   * </pre>
   *
   * <code>repeated string path = 4[json_name = "path"];</code>
   */
  com.google.protobuf.ByteString
      getPathBytes(int index);

  /**
   * <pre>
   *&#47; The fee paid for this payment in satoshis
   * </pre>
   *
   * <code>int64 fee = 5[json_name = "fee"];</code>
   */
  long getFee();

  /**
   * <pre>
   *&#47; The payment preimage
   * </pre>
   *
   * <code>string payment_preimage = 6[json_name = "payment_preimage"];</code>
   */
  java.lang.String getPaymentPreimage();
  /**
   * <pre>
   *&#47; The payment preimage
   * </pre>
   *
   * <code>string payment_preimage = 6[json_name = "payment_preimage"];</code>
   */
  com.google.protobuf.ByteString
      getPaymentPreimageBytes();
}
