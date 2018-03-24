// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

public interface PendingChannelsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lnrpc.PendingChannelsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *&#47; The balance in satoshis encumbered in pending channels
   * </pre>
   *
   * <code>int64 total_limbo_balance = 1[json_name = "total_limbo_balance"];</code>
   */
  long getTotalLimboBalance();

  /**
   * <pre>
   *&#47; Channels pending opening
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.PendingOpenChannel pending_open_channels = 2[json_name = "pending_open_channels"];</code>
   */
  java.util.List<lightpay.lnd.grpc.PendingChannelsResponse.PendingOpenChannel> 
      getPendingOpenChannelsList();
  /**
   * <pre>
   *&#47; Channels pending opening
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.PendingOpenChannel pending_open_channels = 2[json_name = "pending_open_channels"];</code>
   */
  lightpay.lnd.grpc.PendingChannelsResponse.PendingOpenChannel getPendingOpenChannels(int index);
  /**
   * <pre>
   *&#47; Channels pending opening
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.PendingOpenChannel pending_open_channels = 2[json_name = "pending_open_channels"];</code>
   */
  int getPendingOpenChannelsCount();
  /**
   * <pre>
   *&#47; Channels pending opening
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.PendingOpenChannel pending_open_channels = 2[json_name = "pending_open_channels"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.PendingChannelsResponse.PendingOpenChannelOrBuilder> 
      getPendingOpenChannelsOrBuilderList();
  /**
   * <pre>
   *&#47; Channels pending opening
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.PendingOpenChannel pending_open_channels = 2[json_name = "pending_open_channels"];</code>
   */
  lightpay.lnd.grpc.PendingChannelsResponse.PendingOpenChannelOrBuilder getPendingOpenChannelsOrBuilder(
      int index);

  /**
   * <pre>
   *&#47; Channels pending closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ClosedChannel pending_closing_channels = 3[json_name = "pending_closing_channels"];</code>
   */
  java.util.List<lightpay.lnd.grpc.PendingChannelsResponse.ClosedChannel> 
      getPendingClosingChannelsList();
  /**
   * <pre>
   *&#47; Channels pending closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ClosedChannel pending_closing_channels = 3[json_name = "pending_closing_channels"];</code>
   */
  lightpay.lnd.grpc.PendingChannelsResponse.ClosedChannel getPendingClosingChannels(int index);
  /**
   * <pre>
   *&#47; Channels pending closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ClosedChannel pending_closing_channels = 3[json_name = "pending_closing_channels"];</code>
   */
  int getPendingClosingChannelsCount();
  /**
   * <pre>
   *&#47; Channels pending closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ClosedChannel pending_closing_channels = 3[json_name = "pending_closing_channels"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.PendingChannelsResponse.ClosedChannelOrBuilder> 
      getPendingClosingChannelsOrBuilderList();
  /**
   * <pre>
   *&#47; Channels pending closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ClosedChannel pending_closing_channels = 3[json_name = "pending_closing_channels"];</code>
   */
  lightpay.lnd.grpc.PendingChannelsResponse.ClosedChannelOrBuilder getPendingClosingChannelsOrBuilder(
      int index);

  /**
   * <pre>
   *&#47; Channels pending force closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ForceClosedChannel pending_force_closing_channels = 4[json_name = "pending_force_closing_channels"];</code>
   */
  java.util.List<lightpay.lnd.grpc.PendingChannelsResponse.ForceClosedChannel> 
      getPendingForceClosingChannelsList();
  /**
   * <pre>
   *&#47; Channels pending force closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ForceClosedChannel pending_force_closing_channels = 4[json_name = "pending_force_closing_channels"];</code>
   */
  lightpay.lnd.grpc.PendingChannelsResponse.ForceClosedChannel getPendingForceClosingChannels(int index);
  /**
   * <pre>
   *&#47; Channels pending force closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ForceClosedChannel pending_force_closing_channels = 4[json_name = "pending_force_closing_channels"];</code>
   */
  int getPendingForceClosingChannelsCount();
  /**
   * <pre>
   *&#47; Channels pending force closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ForceClosedChannel pending_force_closing_channels = 4[json_name = "pending_force_closing_channels"];</code>
   */
  java.util.List<? extends lightpay.lnd.grpc.PendingChannelsResponse.ForceClosedChannelOrBuilder> 
      getPendingForceClosingChannelsOrBuilderList();
  /**
   * <pre>
   *&#47; Channels pending force closing
   * </pre>
   *
   * <code>repeated .lnrpc.PendingChannelsResponse.ForceClosedChannel pending_force_closing_channels = 4[json_name = "pending_force_closing_channels"];</code>
   */
  lightpay.lnd.grpc.PendingChannelsResponse.ForceClosedChannelOrBuilder getPendingForceClosingChannelsOrBuilder(
      int index);
}
