// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.SendManyRequest}
 */
public  final class SendManyRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.SendManyRequest)
    SendManyRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SendManyRequest.newBuilder() to construct.
  private SendManyRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SendManyRequest() {
    targetConf_ = 0;
    satPerByte_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SendManyRequest(
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
              addrToAmount_ = com.google.protobuf.MapField.newMapField(
                  AddrToAmountDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
            addrToAmount__ = input.readMessage(
                AddrToAmountDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            addrToAmount_.getMutableMap().put(
                addrToAmount__.getKey(), addrToAmount__.getValue());
            break;
          }
          case 24: {

            targetConf_ = input.readInt32();
            break;
          }
          case 40: {

            satPerByte_ = input.readInt64();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendManyRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetAddrToAmount();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendManyRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.SendManyRequest.class, lightpay.lnd.grpc.SendManyRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ADDRTOAMOUNT_FIELD_NUMBER = 1;
  private static final class AddrToAmountDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.Long> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.Long>newDefaultInstance(
                lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendManyRequest_AddrToAmountEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.INT64,
                0L);
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.Long> addrToAmount_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
  internalGetAddrToAmount() {
    if (addrToAmount_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AddrToAmountDefaultEntryHolder.defaultEntry);
    }
    return addrToAmount_;
  }

  public int getAddrToAmountCount() {
    return internalGetAddrToAmount().getMap().size();
  }
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */

  public boolean containsAddrToAmount(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetAddrToAmount().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAddrToAmountMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.Long> getAddrToAmount() {
    return getAddrToAmountMap();
  }
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */

  public java.util.Map<java.lang.String, java.lang.Long> getAddrToAmountMap() {
    return internalGetAddrToAmount().getMap();
  }
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */

  public long getAddrToAmountOrDefault(
      java.lang.String key,
      long defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetAddrToAmount().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   *&#47; The map from addresses to amounts
   * </pre>
   *
   * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
   */

  public long getAddrToAmountOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.Long> map =
        internalGetAddrToAmount().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int TARGET_CONF_FIELD_NUMBER = 3;
  private int targetConf_;
  /**
   * <pre>
   *&#47; The target number of blocks that this transaction should be confirmed by.
   * </pre>
   *
   * <code>int32 target_conf = 3;</code>
   */
  public int getTargetConf() {
    return targetConf_;
  }

  public static final int SAT_PER_BYTE_FIELD_NUMBER = 5;
  private long satPerByte_;
  /**
   * <pre>
   *&#47; A manual fee rate set in sat/byte that should be used when crafting the transaction.
   * </pre>
   *
   * <code>int64 sat_per_byte = 5;</code>
   */
  public long getSatPerByte() {
    return satPerByte_;
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAddrToAmount(),
        AddrToAmountDefaultEntryHolder.defaultEntry,
        1);
    if (targetConf_ != 0) {
      output.writeInt32(3, targetConf_);
    }
    if (satPerByte_ != 0L) {
      output.writeInt64(5, satPerByte_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.Long> entry
         : internalGetAddrToAmount().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.Long>
      addrToAmount__ = AddrToAmountDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, addrToAmount__);
    }
    if (targetConf_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, targetConf_);
    }
    if (satPerByte_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, satPerByte_);
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
    if (!(obj instanceof lightpay.lnd.grpc.SendManyRequest)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.SendManyRequest other = (lightpay.lnd.grpc.SendManyRequest) obj;

    boolean result = true;
    result = result && internalGetAddrToAmount().equals(
        other.internalGetAddrToAmount());
    result = result && (getTargetConf()
        == other.getTargetConf());
    result = result && (getSatPerByte()
        == other.getSatPerByte());
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
    if (!internalGetAddrToAmount().getMap().isEmpty()) {
      hash = (37 * hash) + ADDRTOAMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAddrToAmount().hashCode();
    }
    hash = (37 * hash) + TARGET_CONF_FIELD_NUMBER;
    hash = (53 * hash) + getTargetConf();
    hash = (37 * hash) + SAT_PER_BYTE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSatPerByte());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.SendManyRequest parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.SendManyRequest prototype) {
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
   * Protobuf type {@code lnrpc.SendManyRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.SendManyRequest)
      lightpay.lnd.grpc.SendManyRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendManyRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetAddrToAmount();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableAddrToAmount();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendManyRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.SendManyRequest.class, lightpay.lnd.grpc.SendManyRequest.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.SendManyRequest.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      internalGetMutableAddrToAmount().clear();
      targetConf_ = 0;

      satPerByte_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_SendManyRequest_descriptor;
    }

    public lightpay.lnd.grpc.SendManyRequest getDefaultInstanceForType() {
      return lightpay.lnd.grpc.SendManyRequest.getDefaultInstance();
    }

    public lightpay.lnd.grpc.SendManyRequest build() {
      lightpay.lnd.grpc.SendManyRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.SendManyRequest buildPartial() {
      lightpay.lnd.grpc.SendManyRequest result = new lightpay.lnd.grpc.SendManyRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.addrToAmount_ = internalGetAddrToAmount();
      result.addrToAmount_.makeImmutable();
      result.targetConf_ = targetConf_;
      result.satPerByte_ = satPerByte_;
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
      if (other instanceof lightpay.lnd.grpc.SendManyRequest) {
        return mergeFrom((lightpay.lnd.grpc.SendManyRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.SendManyRequest other) {
      if (other == lightpay.lnd.grpc.SendManyRequest.getDefaultInstance()) return this;
      internalGetMutableAddrToAmount().mergeFrom(
          other.internalGetAddrToAmount());
      if (other.getTargetConf() != 0) {
        setTargetConf(other.getTargetConf());
      }
      if (other.getSatPerByte() != 0L) {
        setSatPerByte(other.getSatPerByte());
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
      lightpay.lnd.grpc.SendManyRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.SendManyRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.Long> addrToAmount_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetAddrToAmount() {
      if (addrToAmount_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            AddrToAmountDefaultEntryHolder.defaultEntry);
      }
      return addrToAmount_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.Long>
    internalGetMutableAddrToAmount() {
      onChanged();;
      if (addrToAmount_ == null) {
        addrToAmount_ = com.google.protobuf.MapField.newMapField(
            AddrToAmountDefaultEntryHolder.defaultEntry);
      }
      if (!addrToAmount_.isMutable()) {
        addrToAmount_ = addrToAmount_.copy();
      }
      return addrToAmount_;
    }

    public int getAddrToAmountCount() {
      return internalGetAddrToAmount().getMap().size();
    }
    /**
     * <pre>
     *&#47; The map from addresses to amounts
     * </pre>
     *
     * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
     */

    public boolean containsAddrToAmount(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetAddrToAmount().getMap().containsKey(key);
    }
    /**
     * Use {@link #getAddrToAmountMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long> getAddrToAmount() {
      return getAddrToAmountMap();
    }
    /**
     * <pre>
     *&#47; The map from addresses to amounts
     * </pre>
     *
     * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
     */

    public java.util.Map<java.lang.String, java.lang.Long> getAddrToAmountMap() {
      return internalGetAddrToAmount().getMap();
    }
    /**
     * <pre>
     *&#47; The map from addresses to amounts
     * </pre>
     *
     * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
     */

    public long getAddrToAmountOrDefault(
        java.lang.String key,
        long defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetAddrToAmount().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     *&#47; The map from addresses to amounts
     * </pre>
     *
     * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
     */

    public long getAddrToAmountOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.Long> map =
          internalGetAddrToAmount().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearAddrToAmount() {
      internalGetMutableAddrToAmount().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     *&#47; The map from addresses to amounts
     * </pre>
     *
     * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
     */

    public Builder removeAddrToAmount(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableAddrToAmount().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.Long>
    getMutableAddrToAmount() {
      return internalGetMutableAddrToAmount().getMutableMap();
    }
    /**
     * <pre>
     *&#47; The map from addresses to amounts
     * </pre>
     *
     * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
     */
    public Builder putAddrToAmount(
        java.lang.String key,
        long value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      
      internalGetMutableAddrToAmount().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     *&#47; The map from addresses to amounts
     * </pre>
     *
     * <code>map&lt;string, int64&gt; AddrToAmount = 1;</code>
     */

    public Builder putAllAddrToAmount(
        java.util.Map<java.lang.String, java.lang.Long> values) {
      internalGetMutableAddrToAmount().getMutableMap()
          .putAll(values);
      return this;
    }

    private int targetConf_ ;
    /**
     * <pre>
     *&#47; The target number of blocks that this transaction should be confirmed by.
     * </pre>
     *
     * <code>int32 target_conf = 3;</code>
     */
    public int getTargetConf() {
      return targetConf_;
    }
    /**
     * <pre>
     *&#47; The target number of blocks that this transaction should be confirmed by.
     * </pre>
     *
     * <code>int32 target_conf = 3;</code>
     */
    public Builder setTargetConf(int value) {
      
      targetConf_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The target number of blocks that this transaction should be confirmed by.
     * </pre>
     *
     * <code>int32 target_conf = 3;</code>
     */
    public Builder clearTargetConf() {
      
      targetConf_ = 0;
      onChanged();
      return this;
    }

    private long satPerByte_ ;
    /**
     * <pre>
     *&#47; A manual fee rate set in sat/byte that should be used when crafting the transaction.
     * </pre>
     *
     * <code>int64 sat_per_byte = 5;</code>
     */
    public long getSatPerByte() {
      return satPerByte_;
    }
    /**
     * <pre>
     *&#47; A manual fee rate set in sat/byte that should be used when crafting the transaction.
     * </pre>
     *
     * <code>int64 sat_per_byte = 5;</code>
     */
    public Builder setSatPerByte(long value) {
      
      satPerByte_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; A manual fee rate set in sat/byte that should be used when crafting the transaction.
     * </pre>
     *
     * <code>int64 sat_per_byte = 5;</code>
     */
    public Builder clearSatPerByte() {
      
      satPerByte_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.SendManyRequest)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.SendManyRequest)
  private static final lightpay.lnd.grpc.SendManyRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.SendManyRequest();
  }

  public static lightpay.lnd.grpc.SendManyRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendManyRequest>
      PARSER = new com.google.protobuf.AbstractParser<SendManyRequest>() {
    public SendManyRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SendManyRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SendManyRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendManyRequest> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.SendManyRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

