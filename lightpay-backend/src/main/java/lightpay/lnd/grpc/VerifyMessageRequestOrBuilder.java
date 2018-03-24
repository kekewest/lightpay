// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface VerifyMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.VerifyMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The message over which the signature is to be verified
   * </pre>
   *
   * <code>bytes msg = 1[json_name = "msg"];</code>
   */
  com.google.protobuf.ByteString getMsg();

  /**
   * <pre>
   *&#47; The signature to be verified over the given message
   * </pre>
   *
   * <code>string signature = 2[json_name = "signature"];</code>
   */
  java.lang.String getSignature();
  /**
   * <pre>
   *&#47; The signature to be verified over the given message
   * </pre>
   *
   * <code>string signature = 2[json_name = "signature"];</code>
   */
  com.google.protobuf.ByteString
      getSignatureBytes();
}
