// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface TransactionDetailsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.TransactionDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The list of transactions relevant to the wallet.
   * </pre>
   *
   * <code>repeated .lnrpc.Transaction transactions = 1[json_name = "transactions"];</code>
   */
  java.util.List<lightpay.lnd.grpc.Transaction> 
      getTransactionsList();
  /**
   * <pre>
   *&#47; The list of transactions relevant to the wallet.
   * </pre>
   *
   * <code>repeated .lnrpc.Transaction transactions = 1[json_name = "transactions"];</code>
   */
  lightpay.lnd.grpc.Transaction getTransactions(int index);
  /**
   * <pre>
   *&#47; The list of transactions relevant to the wallet.
   * </pre>
   *
   * <code>repeated .lnrpc.Transaction transactions = 1[json_name = "transactions"];</code>
   */
  int getTransactionsCount();
  /**
   * <pre>
   *&#47; The list of transactions relevant to the wallet.
   * </pre>
   *
   * <code>repeated .lnrpc.Transaction transactions = 1[json_name = "transactions"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.TransactionOrBuilder> 
      getTransactionsOrBuilderList();
  /**
   * <pre>
   *&#47; The list of transactions relevant to the wallet.
   * </pre>
   *
   * <code>repeated .lnrpc.Transaction transactions = 1[json_name = "transactions"];</code>
   */
  lightpay.lnd.grpc.TransactionOrBuilder getTransactionsOrBuilder(
      int index);
}
