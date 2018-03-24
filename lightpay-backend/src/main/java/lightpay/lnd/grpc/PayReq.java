// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.PayReq}
 */
public  final class PayReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.PayReq)
    PayReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PayReq.newBuilder() to construct.
  private PayReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PayReq() {
    destination_ = "";
    paymentHash_ = "";
    numSatoshis_ = 0L;
    timestamp_ = 0L;
    expiry_ = 0L;
    description_ = "";
    descriptionHash_ = "";
    fallbackAddr_ = "";
    cltvExpiry_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PayReq(
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
            java.lang.String s = input.readStringRequireUtf8();

            destination_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            paymentHash_ = s;
            break;
          }
          case 24: {

            numSatoshis_ = input.readInt64();
            break;
          }
          case 32: {

            timestamp_ = input.readInt64();
            break;
          }
          case 40: {

            expiry_ = input.readInt64();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            descriptionHash_ = s;
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            fallbackAddr_ = s;
            break;
          }
          case 72: {

            cltvExpiry_ = input.readInt64();
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
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_PayReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_PayReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.PayReq.class, lightpay.lnd.grpc.PayReq.Builder.class);
  }

  public static final int DESTINATION_FIELD_NUMBER = 1;
  private volatile java.lang.Object destination_;
  /**
   * <code>string destination = 1[json_name = "destination"];</code>
   */
  public java.lang.String getDestination() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destination_ = s;
      return s;
    }
  }
  /**
   * <code>string destination = 1[json_name = "destination"];</code>
   */
  public com.google.protobuf.ByteString
      getDestinationBytes() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      destination_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYMENT_HASH_FIELD_NUMBER = 2;
  private volatile java.lang.Object paymentHash_;
  /**
   * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
   */
  public java.lang.String getPaymentHash() {
    java.lang.Object ref = paymentHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      paymentHash_ = s;
      return s;
    }
  }
  /**
   * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
   */
  public com.google.protobuf.ByteString
      getPaymentHashBytes() {
    java.lang.Object ref = paymentHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      paymentHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NUM_SATOSHIS_FIELD_NUMBER = 3;
  private long numSatoshis_;
  /**
   * <code>int64 num_satoshis = 3[json_name = "num_satoshis"];</code>
   */
  public long getNumSatoshis() {
    return numSatoshis_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 4;
  private long timestamp_;
  /**
   * <code>int64 timestamp = 4[json_name = "timestamp"];</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int EXPIRY_FIELD_NUMBER = 5;
  private long expiry_;
  /**
   * <code>int64 expiry = 5[json_name = "expiry"];</code>
   */
  public long getExpiry() {
    return expiry_;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 6;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 6[json_name = "description"];</code>
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 6[json_name = "description"];</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_HASH_FIELD_NUMBER = 7;
  private volatile java.lang.Object descriptionHash_;
  /**
   * <code>string description_hash = 7[json_name = "description_hash"];</code>
   */
  public java.lang.String getDescriptionHash() {
    java.lang.Object ref = descriptionHash_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      descriptionHash_ = s;
      return s;
    }
  }
  /**
   * <code>string description_hash = 7[json_name = "description_hash"];</code>
   */
  public com.google.protobuf.ByteString
      getDescriptionHashBytes() {
    java.lang.Object ref = descriptionHash_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      descriptionHash_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FALLBACK_ADDR_FIELD_NUMBER = 8;
  private volatile java.lang.Object fallbackAddr_;
  /**
   * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
   */
  public java.lang.String getFallbackAddr() {
    java.lang.Object ref = fallbackAddr_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fallbackAddr_ = s;
      return s;
    }
  }
  /**
   * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
   */
  public com.google.protobuf.ByteString
      getFallbackAddrBytes() {
    java.lang.Object ref = fallbackAddr_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fallbackAddr_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLTV_EXPIRY_FIELD_NUMBER = 9;
  private long cltvExpiry_;
  /**
   * <code>int64 cltv_expiry = 9[json_name = "cltv_expiry"];</code>
   */
  public long getCltvExpiry() {
    return cltvExpiry_;
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
    if (!getDestinationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destination_);
    }
    if (!getPaymentHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, paymentHash_);
    }
    if (numSatoshis_ != 0L) {
      output.writeInt64(3, numSatoshis_);
    }
    if (timestamp_ != 0L) {
      output.writeInt64(4, timestamp_);
    }
    if (expiry_ != 0L) {
      output.writeInt64(5, expiry_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, description_);
    }
    if (!getDescriptionHashBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, descriptionHash_);
    }
    if (!getFallbackAddrBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, fallbackAddr_);
    }
    if (cltvExpiry_ != 0L) {
      output.writeInt64(9, cltvExpiry_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDestinationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, destination_);
    }
    if (!getPaymentHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, paymentHash_);
    }
    if (numSatoshis_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, numSatoshis_);
    }
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, timestamp_);
    }
    if (expiry_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, expiry_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, description_);
    }
    if (!getDescriptionHashBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, descriptionHash_);
    }
    if (!getFallbackAddrBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, fallbackAddr_);
    }
    if (cltvExpiry_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, cltvExpiry_);
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
    if (!(obj instanceof lightpay.lnd.grpc.PayReq)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.PayReq other = (lightpay.lnd.grpc.PayReq) obj;

    boolean result = true;
    result = result && getDestination()
        .equals(other.getDestination());
    result = result && getPaymentHash()
        .equals(other.getPaymentHash());
    result = result && (getNumSatoshis()
        == other.getNumSatoshis());
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && (getExpiry()
        == other.getExpiry());
    result = result && getDescription()
        .equals(other.getDescription());
    result = result && getDescriptionHash()
        .equals(other.getDescriptionHash());
    result = result && getFallbackAddr()
        .equals(other.getFallbackAddr());
    result = result && (getCltvExpiry()
        == other.getCltvExpiry());
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
    hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + getDestination().hashCode();
    hash = (37 * hash) + PAYMENT_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getPaymentHash().hashCode();
    hash = (37 * hash) + NUM_SATOSHIS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumSatoshis());
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + EXPIRY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getExpiry());
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + DESCRIPTION_HASH_FIELD_NUMBER;
    hash = (53 * hash) + getDescriptionHash().hashCode();
    hash = (37 * hash) + FALLBACK_ADDR_FIELD_NUMBER;
    hash = (53 * hash) + getFallbackAddr().hashCode();
    hash = (37 * hash) + CLTV_EXPIRY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCltvExpiry());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.PayReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.PayReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.PayReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.PayReq parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.PayReq prototype) {
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
   * Protobuf type {@code lnrpc.PayReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.PayReq)
      lightpay.lnd.grpc.PayReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_PayReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_PayReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.PayReq.class, lightpay.lnd.grpc.PayReq.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.PayReq.newBuilder()
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
      destination_ = "";

      paymentHash_ = "";

      numSatoshis_ = 0L;

      timestamp_ = 0L;

      expiry_ = 0L;

      description_ = "";

      descriptionHash_ = "";

      fallbackAddr_ = "";

      cltvExpiry_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_PayReq_descriptor;
    }

    public lightpay.lnd.grpc.PayReq getDefaultInstanceForType() {
      return lightpay.lnd.grpc.PayReq.getDefaultInstance();
    }

    public lightpay.lnd.grpc.PayReq build() {
      lightpay.lnd.grpc.PayReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.PayReq buildPartial() {
      lightpay.lnd.grpc.PayReq result = new lightpay.lnd.grpc.PayReq(this);
      result.destination_ = destination_;
      result.paymentHash_ = paymentHash_;
      result.numSatoshis_ = numSatoshis_;
      result.timestamp_ = timestamp_;
      result.expiry_ = expiry_;
      result.description_ = description_;
      result.descriptionHash_ = descriptionHash_;
      result.fallbackAddr_ = fallbackAddr_;
      result.cltvExpiry_ = cltvExpiry_;
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
      if (other instanceof lightpay.lnd.grpc.PayReq) {
        return mergeFrom((lightpay.lnd.grpc.PayReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.PayReq other) {
      if (other == lightpay.lnd.grpc.PayReq.getDefaultInstance()) return this;
      if (!other.getDestination().isEmpty()) {
        destination_ = other.destination_;
        onChanged();
      }
      if (!other.getPaymentHash().isEmpty()) {
        paymentHash_ = other.paymentHash_;
        onChanged();
      }
      if (other.getNumSatoshis() != 0L) {
        setNumSatoshis(other.getNumSatoshis());
      }
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getExpiry() != 0L) {
        setExpiry(other.getExpiry());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      if (!other.getDescriptionHash().isEmpty()) {
        descriptionHash_ = other.descriptionHash_;
        onChanged();
      }
      if (!other.getFallbackAddr().isEmpty()) {
        fallbackAddr_ = other.fallbackAddr_;
        onChanged();
      }
      if (other.getCltvExpiry() != 0L) {
        setCltvExpiry(other.getCltvExpiry());
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
      lightpay.lnd.grpc.PayReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.PayReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object destination_ = "";
    /**
     * <code>string destination = 1[json_name = "destination"];</code>
     */
    public java.lang.String getDestination() {
      java.lang.Object ref = destination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string destination = 1[json_name = "destination"];</code>
     */
    public com.google.protobuf.ByteString
        getDestinationBytes() {
      java.lang.Object ref = destination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        destination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string destination = 1[json_name = "destination"];</code>
     */
    public Builder setDestination(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      destination_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string destination = 1[json_name = "destination"];</code>
     */
    public Builder clearDestination() {
      
      destination_ = getDefaultInstance().getDestination();
      onChanged();
      return this;
    }
    /**
     * <code>string destination = 1[json_name = "destination"];</code>
     */
    public Builder setDestinationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      destination_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object paymentHash_ = "";
    /**
     * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
     */
    public java.lang.String getPaymentHash() {
      java.lang.Object ref = paymentHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        paymentHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
     */
    public com.google.protobuf.ByteString
        getPaymentHashBytes() {
      java.lang.Object ref = paymentHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        paymentHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
     */
    public Builder setPaymentHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      paymentHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
     */
    public Builder clearPaymentHash() {
      
      paymentHash_ = getDefaultInstance().getPaymentHash();
      onChanged();
      return this;
    }
    /**
     * <code>string payment_hash = 2[json_name = "payment_hash"];</code>
     */
    public Builder setPaymentHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      paymentHash_ = value;
      onChanged();
      return this;
    }

    private long numSatoshis_ ;
    /**
     * <code>int64 num_satoshis = 3[json_name = "num_satoshis"];</code>
     */
    public long getNumSatoshis() {
      return numSatoshis_;
    }
    /**
     * <code>int64 num_satoshis = 3[json_name = "num_satoshis"];</code>
     */
    public Builder setNumSatoshis(long value) {
      
      numSatoshis_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 num_satoshis = 3[json_name = "num_satoshis"];</code>
     */
    public Builder clearNumSatoshis() {
      
      numSatoshis_ = 0L;
      onChanged();
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>int64 timestamp = 4[json_name = "timestamp"];</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>int64 timestamp = 4[json_name = "timestamp"];</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 timestamp = 4[json_name = "timestamp"];</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private long expiry_ ;
    /**
     * <code>int64 expiry = 5[json_name = "expiry"];</code>
     */
    public long getExpiry() {
      return expiry_;
    }
    /**
     * <code>int64 expiry = 5[json_name = "expiry"];</code>
     */
    public Builder setExpiry(long value) {
      
      expiry_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 expiry = 5[json_name = "expiry"];</code>
     */
    public Builder clearExpiry() {
      
      expiry_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 6[json_name = "description"];</code>
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 6[json_name = "description"];</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 6[json_name = "description"];</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 6[json_name = "description"];</code>
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 6[json_name = "description"];</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object descriptionHash_ = "";
    /**
     * <code>string description_hash = 7[json_name = "description_hash"];</code>
     */
    public java.lang.String getDescriptionHash() {
      java.lang.Object ref = descriptionHash_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        descriptionHash_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description_hash = 7[json_name = "description_hash"];</code>
     */
    public com.google.protobuf.ByteString
        getDescriptionHashBytes() {
      java.lang.Object ref = descriptionHash_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        descriptionHash_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description_hash = 7[json_name = "description_hash"];</code>
     */
    public Builder setDescriptionHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      descriptionHash_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description_hash = 7[json_name = "description_hash"];</code>
     */
    public Builder clearDescriptionHash() {
      
      descriptionHash_ = getDefaultInstance().getDescriptionHash();
      onChanged();
      return this;
    }
    /**
     * <code>string description_hash = 7[json_name = "description_hash"];</code>
     */
    public Builder setDescriptionHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      descriptionHash_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object fallbackAddr_ = "";
    /**
     * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
     */
    public java.lang.String getFallbackAddr() {
      java.lang.Object ref = fallbackAddr_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fallbackAddr_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
     */
    public com.google.protobuf.ByteString
        getFallbackAddrBytes() {
      java.lang.Object ref = fallbackAddr_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fallbackAddr_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
     */
    public Builder setFallbackAddr(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fallbackAddr_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
     */
    public Builder clearFallbackAddr() {
      
      fallbackAddr_ = getDefaultInstance().getFallbackAddr();
      onChanged();
      return this;
    }
    /**
     * <code>string fallback_addr = 8[json_name = "fallback_addr"];</code>
     */
    public Builder setFallbackAddrBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fallbackAddr_ = value;
      onChanged();
      return this;
    }

    private long cltvExpiry_ ;
    /**
     * <code>int64 cltv_expiry = 9[json_name = "cltv_expiry"];</code>
     */
    public long getCltvExpiry() {
      return cltvExpiry_;
    }
    /**
     * <code>int64 cltv_expiry = 9[json_name = "cltv_expiry"];</code>
     */
    public Builder setCltvExpiry(long value) {
      
      cltvExpiry_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 cltv_expiry = 9[json_name = "cltv_expiry"];</code>
     */
    public Builder clearCltvExpiry() {
      
      cltvExpiry_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.PayReq)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.PayReq)
  private static final lightpay.lnd.grpc.PayReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.PayReq();
  }

  public static lightpay.lnd.grpc.PayReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PayReq>
      PARSER = new com.google.protobuf.AbstractParser<PayReq>() {
    public PayReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PayReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PayReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PayReq> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.PayReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

