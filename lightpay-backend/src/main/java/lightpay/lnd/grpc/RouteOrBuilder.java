// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface RouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.Route)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   **
   *The cumulative (final) time lock across the entire route.  This is the CLTV
   *value that should be extended to the first hop in the route. All other hops
   *will decrement the time-lock as advertised, leaving enough time for all
   *hops to wait for or present the payment preimage to complete the payment.
   * </pre>
   *
   * <code>uint32 total_time_lock = 1[json_name = "total_time_lock"];</code>
   */
  int getTotalTimeLock();

  /**
   * <pre>
   **
   *The sum of the fees paid at each hop within the final route.  In the case
   *of a one-hop payment, this value will be zero as we don't need to pay a fee
   *it ourself.
   * </pre>
   *
   * <code>int64 total_fees = 2[json_name = "total_fees"];</code>
   */
  long getTotalFees();

  /**
   * <pre>
   **
   *The total amount of funds required to complete a payment over this route.
   *This value includes the cumulative fees at each hop. As a result, the HTLC
   *extended to the first-hop in the route will need to have at least this many
   *satoshis, otherwise the route will fail at an intermediate node due to an
   *insufficient amount of fees.
   * </pre>
   *
   * <code>int64 total_amt = 3[json_name = "total_amt"];</code>
   */
  long getTotalAmt();

  /**
   * <pre>
   **
   *Contains details concerning the specific forwarding details at each hop.
   * </pre>
   *
   * <code>repeated .lnrpc.Hop hops = 4[json_name = "hops"];</code>
   */
  java.util.List<lightpay.lnd.grpc.Hop> 
      getHopsList();
  /**
   * <pre>
   **
   *Contains details concerning the specific forwarding details at each hop.
   * </pre>
   *
   * <code>repeated .lnrpc.Hop hops = 4[json_name = "hops"];</code>
   */
  lightpay.lnd.grpc.Hop getHops(int index);
  /**
   * <pre>
   **
   *Contains details concerning the specific forwarding details at each hop.
   * </pre>
   *
   * <code>repeated .lnrpc.Hop hops = 4[json_name = "hops"];</code>
   */
  int getHopsCount();
  /**
   * <pre>
   **
   *Contains details concerning the specific forwarding details at each hop.
   * </pre>
   *
   * <code>repeated .lnrpc.Hop hops = 4[json_name = "hops"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.HopOrBuilder> 
      getHopsOrBuilderList();
  /**
   * <pre>
   **
   *Contains details concerning the specific forwarding details at each hop.
   * </pre>
   *
   * <code>repeated .lnrpc.Hop hops = 4[json_name = "hops"];</code>
   */
  lightpay.lnd.grpc.HopOrBuilder getHopsOrBuilder(
      int index);
}
