// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface AddInvoiceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.AddInvoiceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes r_hash = 1[json_name = "r_hash"];</code>
   */
  com.google.protobuf.ByteString getRHash();

  /**
   * <pre>
   **
   *A bare-bones invoice for a payment within the Lightning Network.  With the
   *details of the invoice, the sender has all the data necessary to send a
   *payment to the recipient.
   * </pre>
   *
   * <code>string payment_request = 2[json_name = "payment_request"];</code>
   */
  java.lang.String getPaymentRequest();
  /**
   * <pre>
   **
   *A bare-bones invoice for a payment within the Lightning Network.  With the
   *details of the invoice, the sender has all the data necessary to send a
   *payment to the recipient.
   * </pre>
   *
   * <code>string payment_request = 2[json_name = "payment_request"];</code>
   */
  com.google.protobuf.ByteString
      getPaymentRequestBytes();
}
