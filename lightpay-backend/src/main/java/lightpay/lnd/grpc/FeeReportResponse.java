// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.FeeReportResponse}
 */
public  final class FeeReportResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.FeeReportResponse)
    FeeReportResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeeReportResponse.newBuilder() to construct.
  private FeeReportResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeeReportResponse() {
    channelFees_ = java.util.Collections.emptyList();
    dayFeeSum_ = 0L;
    weekFeeSum_ = 0L;
    monthFeeSum_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FeeReportResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              channelFees_ = new java.util.ArrayList<lightpay.lnd.grpc.ChannelFeeReport>();
              mutable_bitField0_ |= 0x00000001;
            }
            channelFees_.add(
                input.readMessage(lightpay.lnd.grpc.ChannelFeeReport.parser(), extensionRegistry));
            break;
          }
          case 16: {

            dayFeeSum_ = input.readUInt64();
            break;
          }
          case 24: {

            weekFeeSum_ = input.readUInt64();
            break;
          }
          case 32: {

            monthFeeSum_ = input.readUInt64();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        channelFees_ = java.util.Collections.unmodifiableList(channelFees_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_FeeReportResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_FeeReportResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.FeeReportResponse.class, lightpay.lnd.grpc.FeeReportResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CHANNEL_FEES_FIELD_NUMBER = 1;
  private java.util.List<lightpay.lnd.grpc.ChannelFeeReport> channelFees_;
  /**
   * <pre>
   *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
   * </pre>
   *
   * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
   */
  public java.util.List<lightpay.lnd.grpc.ChannelFeeReport> getChannelFeesList() {
    return channelFees_;
  }
  /**
   * <pre>
   *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
   * </pre>
   *
   * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
   */
  public java.util.List<? extends lightpay.lnd.grpc.ChannelFeeReportOrBuilder> 
      getChannelFeesOrBuilderList() {
    return channelFees_;
  }
  /**
   * <pre>
   *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
   * </pre>
   *
   * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
   */
  public int getChannelFeesCount() {
    return channelFees_.size();
  }
  /**
   * <pre>
   *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
   * </pre>
   *
   * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
   */
  public lightpay.lnd.grpc.ChannelFeeReport getChannelFees(int index) {
    return channelFees_.get(index);
  }
  /**
   * <pre>
   *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
   * </pre>
   *
   * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
   */
  public lightpay.lnd.grpc.ChannelFeeReportOrBuilder getChannelFeesOrBuilder(
      int index) {
    return channelFees_.get(index);
  }

  public static final int DAY_FEE_SUM_FIELD_NUMBER = 2;
  private long dayFeeSum_;
  /**
   * <pre>
   *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 24 hrs.
   * </pre>
   *
   * <code>uint64 day_fee_sum = 2[json_name = "day_fee_sum"];</code>
   */
  public long getDayFeeSum() {
    return dayFeeSum_;
  }

  public static final int WEEK_FEE_SUM_FIELD_NUMBER = 3;
  private long weekFeeSum_;
  /**
   * <pre>
   *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 week.
   * </pre>
   *
   * <code>uint64 week_fee_sum = 3[json_name = "week_fee_sum"];</code>
   */
  public long getWeekFeeSum() {
    return weekFeeSum_;
  }

  public static final int MONTH_FEE_SUM_FIELD_NUMBER = 4;
  private long monthFeeSum_;
  /**
   * <pre>
   *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 month.
   * </pre>
   *
   * <code>uint64 month_fee_sum = 4[json_name = "month_fee_sum"];</code>
   */
  public long getMonthFeeSum() {
    return monthFeeSum_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < channelFees_.size(); i++) {
      output.writeMessage(1, channelFees_.get(i));
    }
    if (dayFeeSum_ != 0L) {
      output.writeUInt64(2, dayFeeSum_);
    }
    if (weekFeeSum_ != 0L) {
      output.writeUInt64(3, weekFeeSum_);
    }
    if (monthFeeSum_ != 0L) {
      output.writeUInt64(4, monthFeeSum_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < channelFees_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, channelFees_.get(i));
    }
    if (dayFeeSum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, dayFeeSum_);
    }
    if (weekFeeSum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, weekFeeSum_);
    }
    if (monthFeeSum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, monthFeeSum_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof lightpay.lnd.grpc.FeeReportResponse)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.FeeReportResponse other = (lightpay.lnd.grpc.FeeReportResponse) obj;

    boolean result = true;
    result = result && getChannelFeesList()
        .equals(other.getChannelFeesList());
    result = result && (getDayFeeSum()
        == other.getDayFeeSum());
    result = result && (getWeekFeeSum()
        == other.getWeekFeeSum());
    result = result && (getMonthFeeSum()
        == other.getMonthFeeSum());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getChannelFeesCount() > 0) {
      hash = (37 * hash) + CHANNEL_FEES_FIELD_NUMBER;
      hash = (53 * hash) + getChannelFeesList().hashCode();
    }
    hash = (37 * hash) + DAY_FEE_SUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDayFeeSum());
    hash = (37 * hash) + WEEK_FEE_SUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWeekFeeSum());
    hash = (37 * hash) + MONTH_FEE_SUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getMonthFeeSum());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.FeeReportResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(lightpay.lnd.grpc.FeeReportResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code lnrpc.FeeReportResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.FeeReportResponse)
      lightpay.lnd.grpc.FeeReportResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_FeeReportResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_FeeReportResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.FeeReportResponse.class, lightpay.lnd.grpc.FeeReportResponse.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.FeeReportResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getChannelFeesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (channelFeesBuilder_ == null) {
        channelFees_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        channelFeesBuilder_.clear();
      }
      dayFeeSum_ = 0L;

      weekFeeSum_ = 0L;

      monthFeeSum_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_FeeReportResponse_descriptor;
    }

    public lightpay.lnd.grpc.FeeReportResponse getDefaultInstanceForType() {
      return lightpay.lnd.grpc.FeeReportResponse.getDefaultInstance();
    }

    public lightpay.lnd.grpc.FeeReportResponse build() {
      lightpay.lnd.grpc.FeeReportResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.FeeReportResponse buildPartial() {
      lightpay.lnd.grpc.FeeReportResponse result = new lightpay.lnd.grpc.FeeReportResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (channelFeesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          channelFees_ = java.util.Collections.unmodifiableList(channelFees_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.channelFees_ = channelFees_;
      } else {
        result.channelFees_ = channelFeesBuilder_.build();
      }
      result.dayFeeSum_ = dayFeeSum_;
      result.weekFeeSum_ = weekFeeSum_;
      result.monthFeeSum_ = monthFeeSum_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof lightpay.lnd.grpc.FeeReportResponse) {
        return mergeFrom((lightpay.lnd.grpc.FeeReportResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.FeeReportResponse other) {
      if (other == lightpay.lnd.grpc.FeeReportResponse.getDefaultInstance()) return this;
      if (channelFeesBuilder_ == null) {
        if (!other.channelFees_.isEmpty()) {
          if (channelFees_.isEmpty()) {
            channelFees_ = other.channelFees_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChannelFeesIsMutable();
            channelFees_.addAll(other.channelFees_);
          }
          onChanged();
        }
      } else {
        if (!other.channelFees_.isEmpty()) {
          if (channelFeesBuilder_.isEmpty()) {
            channelFeesBuilder_.dispose();
            channelFeesBuilder_ = null;
            channelFees_ = other.channelFees_;
            bitField0_ = (bitField0_ & ~0x00000001);
            channelFeesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChannelFeesFieldBuilder() : null;
          } else {
            channelFeesBuilder_.addAllMessages(other.channelFees_);
          }
        }
      }
      if (other.getDayFeeSum() != 0L) {
        setDayFeeSum(other.getDayFeeSum());
      }
      if (other.getWeekFeeSum() != 0L) {
        setWeekFeeSum(other.getWeekFeeSum());
      }
      if (other.getMonthFeeSum() != 0L) {
        setMonthFeeSum(other.getMonthFeeSum());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      lightpay.lnd.grpc.FeeReportResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.FeeReportResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<lightpay.lnd.grpc.ChannelFeeReport> channelFees_ =
      java.util.Collections.emptyList();
    private void ensureChannelFeesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        channelFees_ = new java.util.ArrayList<lightpay.lnd.grpc.ChannelFeeReport>(channelFees_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.ChannelFeeReport, lightpay.lnd.grpc.ChannelFeeReport.Builder, lightpay.lnd.grpc.ChannelFeeReportOrBuilder> channelFeesBuilder_;

    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.ChannelFeeReport> getChannelFeesList() {
      if (channelFeesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(channelFees_);
      } else {
        return channelFeesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public int getChannelFeesCount() {
      if (channelFeesBuilder_ == null) {
        return channelFees_.size();
      } else {
        return channelFeesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public lightpay.lnd.grpc.ChannelFeeReport getChannelFees(int index) {
      if (channelFeesBuilder_ == null) {
        return channelFees_.get(index);
      } else {
        return channelFeesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder setChannelFees(
        int index, lightpay.lnd.grpc.ChannelFeeReport value) {
      if (channelFeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChannelFeesIsMutable();
        channelFees_.set(index, value);
        onChanged();
      } else {
        channelFeesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder setChannelFees(
        int index, lightpay.lnd.grpc.ChannelFeeReport.Builder builderForValue) {
      if (channelFeesBuilder_ == null) {
        ensureChannelFeesIsMutable();
        channelFees_.set(index, builderForValue.build());
        onChanged();
      } else {
        channelFeesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder addChannelFees(lightpay.lnd.grpc.ChannelFeeReport value) {
      if (channelFeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChannelFeesIsMutable();
        channelFees_.add(value);
        onChanged();
      } else {
        channelFeesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder addChannelFees(
        int index, lightpay.lnd.grpc.ChannelFeeReport value) {
      if (channelFeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChannelFeesIsMutable();
        channelFees_.add(index, value);
        onChanged();
      } else {
        channelFeesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder addChannelFees(
        lightpay.lnd.grpc.ChannelFeeReport.Builder builderForValue) {
      if (channelFeesBuilder_ == null) {
        ensureChannelFeesIsMutable();
        channelFees_.add(builderForValue.build());
        onChanged();
      } else {
        channelFeesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder addChannelFees(
        int index, lightpay.lnd.grpc.ChannelFeeReport.Builder builderForValue) {
      if (channelFeesBuilder_ == null) {
        ensureChannelFeesIsMutable();
        channelFees_.add(index, builderForValue.build());
        onChanged();
      } else {
        channelFeesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder addAllChannelFees(
        java.lang.Iterable<? extends lightpay.lnd.grpc.ChannelFeeReport> values) {
      if (channelFeesBuilder_ == null) {
        ensureChannelFeesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, channelFees_);
        onChanged();
      } else {
        channelFeesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder clearChannelFees() {
      if (channelFeesBuilder_ == null) {
        channelFees_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        channelFeesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public Builder removeChannelFees(int index) {
      if (channelFeesBuilder_ == null) {
        ensureChannelFeesIsMutable();
        channelFees_.remove(index);
        onChanged();
      } else {
        channelFeesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public lightpay.lnd.grpc.ChannelFeeReport.Builder getChannelFeesBuilder(
        int index) {
      return getChannelFeesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public lightpay.lnd.grpc.ChannelFeeReportOrBuilder getChannelFeesOrBuilder(
        int index) {
      if (channelFeesBuilder_ == null) {
        return channelFees_.get(index);  } else {
        return channelFeesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public java.util.List<? extends lightpay.lnd.grpc.ChannelFeeReportOrBuilder> 
         getChannelFeesOrBuilderList() {
      if (channelFeesBuilder_ != null) {
        return channelFeesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(channelFees_);
      }
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public lightpay.lnd.grpc.ChannelFeeReport.Builder addChannelFeesBuilder() {
      return getChannelFeesFieldBuilder().addBuilder(
          lightpay.lnd.grpc.ChannelFeeReport.getDefaultInstance());
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public lightpay.lnd.grpc.ChannelFeeReport.Builder addChannelFeesBuilder(
        int index) {
      return getChannelFeesFieldBuilder().addBuilder(
          index, lightpay.lnd.grpc.ChannelFeeReport.getDefaultInstance());
    }
    /**
     * <pre>
     *&#47; An array of channel fee reports which describes the current fee schedule for each channel.
     * </pre>
     *
     * <code>repeated .lnrpc.ChannelFeeReport channel_fees = 1[json_name = "channel_fees"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.ChannelFeeReport.Builder> 
         getChannelFeesBuilderList() {
      return getChannelFeesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.ChannelFeeReport, lightpay.lnd.grpc.ChannelFeeReport.Builder, lightpay.lnd.grpc.ChannelFeeReportOrBuilder> 
        getChannelFeesFieldBuilder() {
      if (channelFeesBuilder_ == null) {
        channelFeesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            lightpay.lnd.grpc.ChannelFeeReport, lightpay.lnd.grpc.ChannelFeeReport.Builder, lightpay.lnd.grpc.ChannelFeeReportOrBuilder>(
                channelFees_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        channelFees_ = null;
      }
      return channelFeesBuilder_;
    }

    private long dayFeeSum_ ;
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 24 hrs.
     * </pre>
     *
     * <code>uint64 day_fee_sum = 2[json_name = "day_fee_sum"];</code>
     */
    public long getDayFeeSum() {
      return dayFeeSum_;
    }
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 24 hrs.
     * </pre>
     *
     * <code>uint64 day_fee_sum = 2[json_name = "day_fee_sum"];</code>
     */
    public Builder setDayFeeSum(long value) {
      
      dayFeeSum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 24 hrs.
     * </pre>
     *
     * <code>uint64 day_fee_sum = 2[json_name = "day_fee_sum"];</code>
     */
    public Builder clearDayFeeSum() {
      
      dayFeeSum_ = 0L;
      onChanged();
      return this;
    }

    private long weekFeeSum_ ;
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 week.
     * </pre>
     *
     * <code>uint64 week_fee_sum = 3[json_name = "week_fee_sum"];</code>
     */
    public long getWeekFeeSum() {
      return weekFeeSum_;
    }
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 week.
     * </pre>
     *
     * <code>uint64 week_fee_sum = 3[json_name = "week_fee_sum"];</code>
     */
    public Builder setWeekFeeSum(long value) {
      
      weekFeeSum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 week.
     * </pre>
     *
     * <code>uint64 week_fee_sum = 3[json_name = "week_fee_sum"];</code>
     */
    public Builder clearWeekFeeSum() {
      
      weekFeeSum_ = 0L;
      onChanged();
      return this;
    }

    private long monthFeeSum_ ;
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 month.
     * </pre>
     *
     * <code>uint64 month_fee_sum = 4[json_name = "month_fee_sum"];</code>
     */
    public long getMonthFeeSum() {
      return monthFeeSum_;
    }
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 month.
     * </pre>
     *
     * <code>uint64 month_fee_sum = 4[json_name = "month_fee_sum"];</code>
     */
    public Builder setMonthFeeSum(long value) {
      
      monthFeeSum_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The total amount of fee revenue (in satoshis) the switch has collected over the past 1 month.
     * </pre>
     *
     * <code>uint64 month_fee_sum = 4[json_name = "month_fee_sum"];</code>
     */
    public Builder clearMonthFeeSum() {
      
      monthFeeSum_ = 0L;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lnrpc.FeeReportResponse)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.FeeReportResponse)
  private static final lightpay.lnd.grpc.FeeReportResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.FeeReportResponse();
  }

  public static lightpay.lnd.grpc.FeeReportResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeeReportResponse>
      PARSER = new com.google.protobuf.AbstractParser<FeeReportResponse>() {
    public FeeReportResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FeeReportResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FeeReportResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeeReportResponse> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.FeeReportResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

