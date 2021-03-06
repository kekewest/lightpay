// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.NodeUpdate}
 */
public  final class NodeUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.NodeUpdate)
    NodeUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NodeUpdate.newBuilder() to construct.
  private NodeUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NodeUpdate() {
    addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    identityKey_ = "";
    globalFeatures_ = com.google.protobuf.ByteString.EMPTY;
    alias_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NodeUpdate(
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
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              addresses_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            addresses_.add(s);
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            identityKey_ = s;
            break;
          }
          case 26: {

            globalFeatures_ = input.readBytes();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            alias_ = s;
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
        addresses_ = addresses_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeUpdate_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.NodeUpdate.class, lightpay.lnd.grpc.NodeUpdate.Builder.class);
  }

  private int bitField0_;
  public static final int ADDRESSES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList addresses_;
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getAddressesList() {
    return addresses_;
  }
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public int getAddressesCount() {
    return addresses_.size();
  }
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public java.lang.String getAddresses(int index) {
    return addresses_.get(index);
  }
  /**
   * <code>repeated string addresses = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddressesBytes(int index) {
    return addresses_.getByteString(index);
  }

  public static final int IDENTITY_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object identityKey_;
  /**
   * <code>string identity_key = 2;</code>
   */
  public java.lang.String getIdentityKey() {
    java.lang.Object ref = identityKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      identityKey_ = s;
      return s;
    }
  }
  /**
   * <code>string identity_key = 2;</code>
   */
  public com.google.protobuf.ByteString
      getIdentityKeyBytes() {
    java.lang.Object ref = identityKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      identityKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GLOBAL_FEATURES_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString globalFeatures_;
  /**
   * <code>bytes global_features = 3;</code>
   */
  public com.google.protobuf.ByteString getGlobalFeatures() {
    return globalFeatures_;
  }

  public static final int ALIAS_FIELD_NUMBER = 4;
  private volatile java.lang.Object alias_;
  /**
   * <code>string alias = 4;</code>
   */
  public java.lang.String getAlias() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      alias_ = s;
      return s;
    }
  }
  /**
   * <code>string alias = 4;</code>
   */
  public com.google.protobuf.ByteString
      getAliasBytes() {
    java.lang.Object ref = alias_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      alias_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < addresses_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addresses_.getRaw(i));
    }
    if (!getIdentityKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, identityKey_);
    }
    if (!globalFeatures_.isEmpty()) {
      output.writeBytes(3, globalFeatures_);
    }
    if (!getAliasBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, alias_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < addresses_.size(); i++) {
        dataSize += computeStringSizeNoTag(addresses_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAddressesList().size();
    }
    if (!getIdentityKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, identityKey_);
    }
    if (!globalFeatures_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, globalFeatures_);
    }
    if (!getAliasBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, alias_);
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
    if (!(obj instanceof lightpay.lnd.grpc.NodeUpdate)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.NodeUpdate other = (lightpay.lnd.grpc.NodeUpdate) obj;

    boolean result = true;
    result = result && getAddressesList()
        .equals(other.getAddressesList());
    result = result && getIdentityKey()
        .equals(other.getIdentityKey());
    result = result && getGlobalFeatures()
        .equals(other.getGlobalFeatures());
    result = result && getAlias()
        .equals(other.getAlias());
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
    if (getAddressesCount() > 0) {
      hash = (37 * hash) + ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getAddressesList().hashCode();
    }
    hash = (37 * hash) + IDENTITY_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getIdentityKey().hashCode();
    hash = (37 * hash) + GLOBAL_FEATURES_FIELD_NUMBER;
    hash = (53 * hash) + getGlobalFeatures().hashCode();
    hash = (37 * hash) + ALIAS_FIELD_NUMBER;
    hash = (53 * hash) + getAlias().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.NodeUpdate parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.NodeUpdate prototype) {
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
   * Protobuf type {@code lnrpc.NodeUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.NodeUpdate)
      lightpay.lnd.grpc.NodeUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeUpdate_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.NodeUpdate.class, lightpay.lnd.grpc.NodeUpdate.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.NodeUpdate.newBuilder()
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
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      identityKey_ = "";

      globalFeatures_ = com.google.protobuf.ByteString.EMPTY;

      alias_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_NodeUpdate_descriptor;
    }

    public lightpay.lnd.grpc.NodeUpdate getDefaultInstanceForType() {
      return lightpay.lnd.grpc.NodeUpdate.getDefaultInstance();
    }

    public lightpay.lnd.grpc.NodeUpdate build() {
      lightpay.lnd.grpc.NodeUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.NodeUpdate buildPartial() {
      lightpay.lnd.grpc.NodeUpdate result = new lightpay.lnd.grpc.NodeUpdate(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        addresses_ = addresses_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.addresses_ = addresses_;
      result.identityKey_ = identityKey_;
      result.globalFeatures_ = globalFeatures_;
      result.alias_ = alias_;
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
      if (other instanceof lightpay.lnd.grpc.NodeUpdate) {
        return mergeFrom((lightpay.lnd.grpc.NodeUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.NodeUpdate other) {
      if (other == lightpay.lnd.grpc.NodeUpdate.getDefaultInstance()) return this;
      if (!other.addresses_.isEmpty()) {
        if (addresses_.isEmpty()) {
          addresses_ = other.addresses_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAddressesIsMutable();
          addresses_.addAll(other.addresses_);
        }
        onChanged();
      }
      if (!other.getIdentityKey().isEmpty()) {
        identityKey_ = other.identityKey_;
        onChanged();
      }
      if (other.getGlobalFeatures() != com.google.protobuf.ByteString.EMPTY) {
        setGlobalFeatures(other.getGlobalFeatures());
      }
      if (!other.getAlias().isEmpty()) {
        alias_ = other.alias_;
        onChanged();
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
      lightpay.lnd.grpc.NodeUpdate parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.NodeUpdate) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        addresses_ = new com.google.protobuf.LazyStringArrayList(addresses_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getAddressesList() {
      return addresses_.getUnmodifiableView();
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public int getAddressesCount() {
      return addresses_.size();
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public java.lang.String getAddresses(int index) {
      return addresses_.get(index);
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddressesBytes(int index) {
      return addresses_.getByteString(index);
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder setAddresses(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
      addresses_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder addAddresses(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressesIsMutable();
      addresses_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder addAllAddresses(
        java.lang.Iterable<java.lang.String> values) {
      ensureAddressesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, addresses_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder clearAddresses() {
      addresses_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string addresses = 1;</code>
     */
    public Builder addAddressesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureAddressesIsMutable();
      addresses_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object identityKey_ = "";
    /**
     * <code>string identity_key = 2;</code>
     */
    public java.lang.String getIdentityKey() {
      java.lang.Object ref = identityKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        identityKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string identity_key = 2;</code>
     */
    public com.google.protobuf.ByteString
        getIdentityKeyBytes() {
      java.lang.Object ref = identityKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        identityKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string identity_key = 2;</code>
     */
    public Builder setIdentityKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      identityKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string identity_key = 2;</code>
     */
    public Builder clearIdentityKey() {
      
      identityKey_ = getDefaultInstance().getIdentityKey();
      onChanged();
      return this;
    }
    /**
     * <code>string identity_key = 2;</code>
     */
    public Builder setIdentityKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      identityKey_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString globalFeatures_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes global_features = 3;</code>
     */
    public com.google.protobuf.ByteString getGlobalFeatures() {
      return globalFeatures_;
    }
    /**
     * <code>bytes global_features = 3;</code>
     */
    public Builder setGlobalFeatures(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      globalFeatures_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes global_features = 3;</code>
     */
    public Builder clearGlobalFeatures() {
      
      globalFeatures_ = getDefaultInstance().getGlobalFeatures();
      onChanged();
      return this;
    }

    private java.lang.Object alias_ = "";
    /**
     * <code>string alias = 4;</code>
     */
    public java.lang.String getAlias() {
      java.lang.Object ref = alias_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        alias_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string alias = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAliasBytes() {
      java.lang.Object ref = alias_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        alias_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string alias = 4;</code>
     */
    public Builder setAlias(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      alias_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 4;</code>
     */
    public Builder clearAlias() {
      
      alias_ = getDefaultInstance().getAlias();
      onChanged();
      return this;
    }
    /**
     * <code>string alias = 4;</code>
     */
    public Builder setAliasBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      alias_ = value;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.NodeUpdate)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.NodeUpdate)
  private static final lightpay.lnd.grpc.NodeUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.NodeUpdate();
  }

  public static lightpay.lnd.grpc.NodeUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NodeUpdate>
      PARSER = new com.google.protobuf.AbstractParser<NodeUpdate>() {
    public NodeUpdate parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NodeUpdate(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NodeUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NodeUpdate> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.NodeUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

