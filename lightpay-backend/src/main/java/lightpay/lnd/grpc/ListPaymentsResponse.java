// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.ListPaymentsResponse}
 */
public  final class ListPaymentsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.ListPaymentsResponse)
    ListPaymentsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListPaymentsResponse.newBuilder() to construct.
  private ListPaymentsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListPaymentsResponse() {
    payments_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListPaymentsResponse(
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
              payments_ = new java.util.ArrayList<lightpay.lnd.grpc.Payment>();
              mutable_bitField0_ |= 0x00000001;
            }
            payments_.add(
                input.readMessage(lightpay.lnd.grpc.Payment.parser(), extensionRegistry));
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
        payments_ = java.util.Collections.unmodifiableList(payments_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ListPaymentsResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ListPaymentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.ListPaymentsResponse.class, lightpay.lnd.grpc.ListPaymentsResponse.Builder.class);
  }

  public static final int PAYMENTS_FIELD_NUMBER = 1;
  private java.util.List<lightpay.lnd.grpc.Payment> payments_;
  /**
   * <pre>
   *&#47; The list of payments
   * </pre>
   *
   * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
   */
  public java.util.List<lightpay.lnd.grpc.Payment> getPaymentsList() {
    return payments_;
  }
  /**
   * <pre>
   *&#47; The list of payments
   * </pre>
   *
   * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
   */
  public java.util.List<? extends lightpay.lnd.grpc.PaymentOrBuilder> 
      getPaymentsOrBuilderList() {
    return payments_;
  }
  /**
   * <pre>
   *&#47; The list of payments
   * </pre>
   *
   * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
   */
  public int getPaymentsCount() {
    return payments_.size();
  }
  /**
   * <pre>
   *&#47; The list of payments
   * </pre>
   *
   * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
   */
  public lightpay.lnd.grpc.Payment getPayments(int index) {
    return payments_.get(index);
  }
  /**
   * <pre>
   *&#47; The list of payments
   * </pre>
   *
   * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
   */
  public lightpay.lnd.grpc.PaymentOrBuilder getPaymentsOrBuilder(
      int index) {
    return payments_.get(index);
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
    for (int i = 0; i < payments_.size(); i++) {
      output.writeMessage(1, payments_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < payments_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, payments_.get(i));
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
    if (!(obj instanceof lightpay.lnd.grpc.ListPaymentsResponse)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.ListPaymentsResponse other = (lightpay.lnd.grpc.ListPaymentsResponse) obj;

    boolean result = true;
    result = result && getPaymentsList()
        .equals(other.getPaymentsList());
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
    if (getPaymentsCount() > 0) {
      hash = (37 * hash) + PAYMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getPaymentsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.ListPaymentsResponse parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.ListPaymentsResponse prototype) {
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
   * Protobuf type {@code lnrpc.ListPaymentsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.ListPaymentsResponse)
      lightpay.lnd.grpc.ListPaymentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ListPaymentsResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ListPaymentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.ListPaymentsResponse.class, lightpay.lnd.grpc.ListPaymentsResponse.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.ListPaymentsResponse.newBuilder()
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
        getPaymentsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (paymentsBuilder_ == null) {
        payments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        paymentsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_ListPaymentsResponse_descriptor;
    }

    public lightpay.lnd.grpc.ListPaymentsResponse getDefaultInstanceForType() {
      return lightpay.lnd.grpc.ListPaymentsResponse.getDefaultInstance();
    }

    public lightpay.lnd.grpc.ListPaymentsResponse build() {
      lightpay.lnd.grpc.ListPaymentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.ListPaymentsResponse buildPartial() {
      lightpay.lnd.grpc.ListPaymentsResponse result = new lightpay.lnd.grpc.ListPaymentsResponse(this);
      int from_bitField0_ = bitField0_;
      if (paymentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          payments_ = java.util.Collections.unmodifiableList(payments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.payments_ = payments_;
      } else {
        result.payments_ = paymentsBuilder_.build();
      }
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
      if (other instanceof lightpay.lnd.grpc.ListPaymentsResponse) {
        return mergeFrom((lightpay.lnd.grpc.ListPaymentsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.ListPaymentsResponse other) {
      if (other == lightpay.lnd.grpc.ListPaymentsResponse.getDefaultInstance()) return this;
      if (paymentsBuilder_ == null) {
        if (!other.payments_.isEmpty()) {
          if (payments_.isEmpty()) {
            payments_ = other.payments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePaymentsIsMutable();
            payments_.addAll(other.payments_);
          }
          onChanged();
        }
      } else {
        if (!other.payments_.isEmpty()) {
          if (paymentsBuilder_.isEmpty()) {
            paymentsBuilder_.dispose();
            paymentsBuilder_ = null;
            payments_ = other.payments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            paymentsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPaymentsFieldBuilder() : null;
          } else {
            paymentsBuilder_.addAllMessages(other.payments_);
          }
        }
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
      lightpay.lnd.grpc.ListPaymentsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.ListPaymentsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<lightpay.lnd.grpc.Payment> payments_ =
      java.util.Collections.emptyList();
    private void ensurePaymentsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        payments_ = new java.util.ArrayList<lightpay.lnd.grpc.Payment>(payments_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.Payment, lightpay.lnd.grpc.Payment.Builder, lightpay.lnd.grpc.PaymentOrBuilder> paymentsBuilder_;

    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.Payment> getPaymentsList() {
      if (paymentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(payments_);
      } else {
        return paymentsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public int getPaymentsCount() {
      if (paymentsBuilder_ == null) {
        return payments_.size();
      } else {
        return paymentsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public lightpay.lnd.grpc.Payment getPayments(int index) {
      if (paymentsBuilder_ == null) {
        return payments_.get(index);
      } else {
        return paymentsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder setPayments(
        int index, lightpay.lnd.grpc.Payment value) {
      if (paymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsIsMutable();
        payments_.set(index, value);
        onChanged();
      } else {
        paymentsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder setPayments(
        int index, lightpay.lnd.grpc.Payment.Builder builderForValue) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.set(index, builderForValue.build());
        onChanged();
      } else {
        paymentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder addPayments(lightpay.lnd.grpc.Payment value) {
      if (paymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsIsMutable();
        payments_.add(value);
        onChanged();
      } else {
        paymentsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder addPayments(
        int index, lightpay.lnd.grpc.Payment value) {
      if (paymentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePaymentsIsMutable();
        payments_.add(index, value);
        onChanged();
      } else {
        paymentsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder addPayments(
        lightpay.lnd.grpc.Payment.Builder builderForValue) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.add(builderForValue.build());
        onChanged();
      } else {
        paymentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder addPayments(
        int index, lightpay.lnd.grpc.Payment.Builder builderForValue) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.add(index, builderForValue.build());
        onChanged();
      } else {
        paymentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder addAllPayments(
        java.lang.Iterable<? extends lightpay.lnd.grpc.Payment> values) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, payments_);
        onChanged();
      } else {
        paymentsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder clearPayments() {
      if (paymentsBuilder_ == null) {
        payments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        paymentsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public Builder removePayments(int index) {
      if (paymentsBuilder_ == null) {
        ensurePaymentsIsMutable();
        payments_.remove(index);
        onChanged();
      } else {
        paymentsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public lightpay.lnd.grpc.Payment.Builder getPaymentsBuilder(
        int index) {
      return getPaymentsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public lightpay.lnd.grpc.PaymentOrBuilder getPaymentsOrBuilder(
        int index) {
      if (paymentsBuilder_ == null) {
        return payments_.get(index);  } else {
        return paymentsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public java.util.List<? extends lightpay.lnd.grpc.PaymentOrBuilder> 
         getPaymentsOrBuilderList() {
      if (paymentsBuilder_ != null) {
        return paymentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(payments_);
      }
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public lightpay.lnd.grpc.Payment.Builder addPaymentsBuilder() {
      return getPaymentsFieldBuilder().addBuilder(
          lightpay.lnd.grpc.Payment.getDefaultInstance());
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public lightpay.lnd.grpc.Payment.Builder addPaymentsBuilder(
        int index) {
      return getPaymentsFieldBuilder().addBuilder(
          index, lightpay.lnd.grpc.Payment.getDefaultInstance());
    }
    /**
     * <pre>
     *&#47; The list of payments
     * </pre>
     *
     * <code>repeated .lnrpc.Payment payments = 1[json_name = "payments"];</code>
     */
    public java.util.List<lightpay.lnd.grpc.Payment.Builder> 
         getPaymentsBuilderList() {
      return getPaymentsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        lightpay.lnd.grpc.Payment, lightpay.lnd.grpc.Payment.Builder, lightpay.lnd.grpc.PaymentOrBuilder> 
        getPaymentsFieldBuilder() {
      if (paymentsBuilder_ == null) {
        paymentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            lightpay.lnd.grpc.Payment, lightpay.lnd.grpc.Payment.Builder, lightpay.lnd.grpc.PaymentOrBuilder>(
                payments_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        payments_ = null;
      }
      return paymentsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lnrpc.ListPaymentsResponse)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.ListPaymentsResponse)
  private static final lightpay.lnd.grpc.ListPaymentsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.ListPaymentsResponse();
  }

  public static lightpay.lnd.grpc.ListPaymentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPaymentsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListPaymentsResponse>() {
    public ListPaymentsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListPaymentsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListPaymentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPaymentsResponse> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.ListPaymentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

