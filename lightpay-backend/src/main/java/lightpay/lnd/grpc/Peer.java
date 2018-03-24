// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: rpc.proto

package lightpay.lnd.grpc;

/**
 * Protobuf type {@code lnrpc.Peer}
 */
public  final class Peer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lnrpc.Peer)
    PeerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Peer.newBuilder() to construct.
  private Peer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Peer() {
    pubKey_ = "";
    address_ = "";
    bytesSent_ = 0L;
    bytesRecv_ = 0L;
    satSent_ = 0L;
    satRecv_ = 0L;
    inbound_ = false;
    pingTime_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Peer(
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

            pubKey_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            address_ = s;
            break;
          }
          case 32: {

            bytesSent_ = input.readUInt64();
            break;
          }
          case 40: {

            bytesRecv_ = input.readUInt64();
            break;
          }
          case 48: {

            satSent_ = input.readInt64();
            break;
          }
          case 56: {

            satRecv_ = input.readInt64();
            break;
          }
          case 64: {

            inbound_ = input.readBool();
            break;
          }
          case 72: {

            pingTime_ = input.readInt64();
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
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_Peer_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_Peer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lightpay.lnd.grpc.Peer.class, lightpay.lnd.grpc.Peer.Builder.class);
  }

  public static final int PUB_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object pubKey_;
  /**
   * <pre>
   *&#47; The identity pubkey of the peer
   * </pre>
   *
   * <code>string pub_key = 1[json_name = "pub_key"];</code>
   */
  public java.lang.String getPubKey() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *&#47; The identity pubkey of the peer
   * </pre>
   *
   * <code>string pub_key = 1[json_name = "pub_key"];</code>
   */
  public com.google.protobuf.ByteString
      getPubKeyBytes() {
    java.lang.Object ref = pubKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pubKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object address_;
  /**
   * <pre>
   *&#47; Network address of the peer; eg `127.0.0.1:10011`
   * </pre>
   *
   * <code>string address = 3[json_name = "address"];</code>
   */
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *&#47; Network address of the peer; eg `127.0.0.1:10011`
   * </pre>
   *
   * <code>string address = 3[json_name = "address"];</code>
   */
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BYTES_SENT_FIELD_NUMBER = 4;
  private long bytesSent_;
  /**
   * <pre>
   *&#47; Bytes of data transmitted to this peer
   * </pre>
   *
   * <code>uint64 bytes_sent = 4[json_name = "bytes_sent"];</code>
   */
  public long getBytesSent() {
    return bytesSent_;
  }

  public static final int BYTES_RECV_FIELD_NUMBER = 5;
  private long bytesRecv_;
  /**
   * <pre>
   *&#47; Bytes of data transmitted from this peer
   * </pre>
   *
   * <code>uint64 bytes_recv = 5[json_name = "bytes_recv"];</code>
   */
  public long getBytesRecv() {
    return bytesRecv_;
  }

  public static final int SAT_SENT_FIELD_NUMBER = 6;
  private long satSent_;
  /**
   * <pre>
   *&#47; Satoshis sent to this peer
   * </pre>
   *
   * <code>int64 sat_sent = 6[json_name = "sat_sent"];</code>
   */
  public long getSatSent() {
    return satSent_;
  }

  public static final int SAT_RECV_FIELD_NUMBER = 7;
  private long satRecv_;
  /**
   * <pre>
   *&#47; Satoshis received from this peer
   * </pre>
   *
   * <code>int64 sat_recv = 7[json_name = "sat_recv"];</code>
   */
  public long getSatRecv() {
    return satRecv_;
  }

  public static final int INBOUND_FIELD_NUMBER = 8;
  private boolean inbound_;
  /**
   * <pre>
   *&#47; A channel is inbound if the counterparty initiated the channel
   * </pre>
   *
   * <code>bool inbound = 8[json_name = "inbound"];</code>
   */
  public boolean getInbound() {
    return inbound_;
  }

  public static final int PING_TIME_FIELD_NUMBER = 9;
  private long pingTime_;
  /**
   * <pre>
   *&#47; Ping time to this peer
   * </pre>
   *
   * <code>int64 ping_time = 9[json_name = "ping_time"];</code>
   */
  public long getPingTime() {
    return pingTime_;
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
    if (!getPubKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubKey_);
    }
    if (!getAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, address_);
    }
    if (bytesSent_ != 0L) {
      output.writeUInt64(4, bytesSent_);
    }
    if (bytesRecv_ != 0L) {
      output.writeUInt64(5, bytesRecv_);
    }
    if (satSent_ != 0L) {
      output.writeInt64(6, satSent_);
    }
    if (satRecv_ != 0L) {
      output.writeInt64(7, satRecv_);
    }
    if (inbound_ != false) {
      output.writeBool(8, inbound_);
    }
    if (pingTime_ != 0L) {
      output.writeInt64(9, pingTime_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPubKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pubKey_);
    }
    if (!getAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, address_);
    }
    if (bytesSent_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, bytesSent_);
    }
    if (bytesRecv_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, bytesRecv_);
    }
    if (satSent_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, satSent_);
    }
    if (satRecv_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, satRecv_);
    }
    if (inbound_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, inbound_);
    }
    if (pingTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(9, pingTime_);
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
    if (!(obj instanceof lightpay.lnd.grpc.Peer)) {
      return super.equals(obj);
    }
    lightpay.lnd.grpc.Peer other = (lightpay.lnd.grpc.Peer) obj;

    boolean result = true;
    result = result && getPubKey()
        .equals(other.getPubKey());
    result = result && getAddress()
        .equals(other.getAddress());
    result = result && (getBytesSent()
        == other.getBytesSent());
    result = result && (getBytesRecv()
        == other.getBytesRecv());
    result = result && (getSatSent()
        == other.getSatSent());
    result = result && (getSatRecv()
        == other.getSatRecv());
    result = result && (getInbound()
        == other.getInbound());
    result = result && (getPingTime()
        == other.getPingTime());
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
    hash = (37 * hash) + PUB_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPubKey().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (37 * hash) + BYTES_SENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBytesSent());
    hash = (37 * hash) + BYTES_RECV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBytesRecv());
    hash = (37 * hash) + SAT_SENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSatSent());
    hash = (37 * hash) + SAT_RECV_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSatRecv());
    hash = (37 * hash) + INBOUND_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getInbound());
    hash = (37 * hash) + PING_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPingTime());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lightpay.lnd.grpc.Peer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.Peer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.Peer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lightpay.lnd.grpc.Peer parseFrom(
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
  public static Builder newBuilder(lightpay.lnd.grpc.Peer prototype) {
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
   * Protobuf type {@code lnrpc.Peer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lnrpc.Peer)
      lightpay.lnd.grpc.PeerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_Peer_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_Peer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lightpay.lnd.grpc.Peer.class, lightpay.lnd.grpc.Peer.Builder.class);
    }

    // Construct using lightpay.lnd.grpc.Peer.newBuilder()
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
      pubKey_ = "";

      address_ = "";

      bytesSent_ = 0L;

      bytesRecv_ = 0L;

      satSent_ = 0L;

      satRecv_ = 0L;

      inbound_ = false;

      pingTime_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lightpay.lnd.grpc.Rpc.internal_static_lnrpc_Peer_descriptor;
    }

    public lightpay.lnd.grpc.Peer getDefaultInstanceForType() {
      return lightpay.lnd.grpc.Peer.getDefaultInstance();
    }

    public lightpay.lnd.grpc.Peer build() {
      lightpay.lnd.grpc.Peer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public lightpay.lnd.grpc.Peer buildPartial() {
      lightpay.lnd.grpc.Peer result = new lightpay.lnd.grpc.Peer(this);
      result.pubKey_ = pubKey_;
      result.address_ = address_;
      result.bytesSent_ = bytesSent_;
      result.bytesRecv_ = bytesRecv_;
      result.satSent_ = satSent_;
      result.satRecv_ = satRecv_;
      result.inbound_ = inbound_;
      result.pingTime_ = pingTime_;
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
      if (other instanceof lightpay.lnd.grpc.Peer) {
        return mergeFrom((lightpay.lnd.grpc.Peer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lightpay.lnd.grpc.Peer other) {
      if (other == lightpay.lnd.grpc.Peer.getDefaultInstance()) return this;
      if (!other.getPubKey().isEmpty()) {
        pubKey_ = other.pubKey_;
        onChanged();
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        onChanged();
      }
      if (other.getBytesSent() != 0L) {
        setBytesSent(other.getBytesSent());
      }
      if (other.getBytesRecv() != 0L) {
        setBytesRecv(other.getBytesRecv());
      }
      if (other.getSatSent() != 0L) {
        setSatSent(other.getSatSent());
      }
      if (other.getSatRecv() != 0L) {
        setSatRecv(other.getSatRecv());
      }
      if (other.getInbound() != false) {
        setInbound(other.getInbound());
      }
      if (other.getPingTime() != 0L) {
        setPingTime(other.getPingTime());
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
      lightpay.lnd.grpc.Peer parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lightpay.lnd.grpc.Peer) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object pubKey_ = "";
    /**
     * <pre>
     *&#47; The identity pubkey of the peer
     * </pre>
     *
     * <code>string pub_key = 1[json_name = "pub_key"];</code>
     */
    public java.lang.String getPubKey() {
      java.lang.Object ref = pubKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *&#47; The identity pubkey of the peer
     * </pre>
     *
     * <code>string pub_key = 1[json_name = "pub_key"];</code>
     */
    public com.google.protobuf.ByteString
        getPubKeyBytes() {
      java.lang.Object ref = pubKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pubKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *&#47; The identity pubkey of the peer
     * </pre>
     *
     * <code>string pub_key = 1[json_name = "pub_key"];</code>
     */
    public Builder setPubKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      pubKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The identity pubkey of the peer
     * </pre>
     *
     * <code>string pub_key = 1[json_name = "pub_key"];</code>
     */
    public Builder clearPubKey() {
      
      pubKey_ = getDefaultInstance().getPubKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; The identity pubkey of the peer
     * </pre>
     *
     * <code>string pub_key = 1[json_name = "pub_key"];</code>
     */
    public Builder setPubKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      pubKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <pre>
     *&#47; Network address of the peer; eg `127.0.0.1:10011`
     * </pre>
     *
     * <code>string address = 3[json_name = "address"];</code>
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *&#47; Network address of the peer; eg `127.0.0.1:10011`
     * </pre>
     *
     * <code>string address = 3[json_name = "address"];</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *&#47; Network address of the peer; eg `127.0.0.1:10011`
     * </pre>
     *
     * <code>string address = 3[json_name = "address"];</code>
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      address_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Network address of the peer; eg `127.0.0.1:10011`
     * </pre>
     *
     * <code>string address = 3[json_name = "address"];</code>
     */
    public Builder clearAddress() {
      
      address_ = getDefaultInstance().getAddress();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Network address of the peer; eg `127.0.0.1:10011`
     * </pre>
     *
     * <code>string address = 3[json_name = "address"];</code>
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      address_ = value;
      onChanged();
      return this;
    }

    private long bytesSent_ ;
    /**
     * <pre>
     *&#47; Bytes of data transmitted to this peer
     * </pre>
     *
     * <code>uint64 bytes_sent = 4[json_name = "bytes_sent"];</code>
     */
    public long getBytesSent() {
      return bytesSent_;
    }
    /**
     * <pre>
     *&#47; Bytes of data transmitted to this peer
     * </pre>
     *
     * <code>uint64 bytes_sent = 4[json_name = "bytes_sent"];</code>
     */
    public Builder setBytesSent(long value) {
      
      bytesSent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Bytes of data transmitted to this peer
     * </pre>
     *
     * <code>uint64 bytes_sent = 4[json_name = "bytes_sent"];</code>
     */
    public Builder clearBytesSent() {
      
      bytesSent_ = 0L;
      onChanged();
      return this;
    }

    private long bytesRecv_ ;
    /**
     * <pre>
     *&#47; Bytes of data transmitted from this peer
     * </pre>
     *
     * <code>uint64 bytes_recv = 5[json_name = "bytes_recv"];</code>
     */
    public long getBytesRecv() {
      return bytesRecv_;
    }
    /**
     * <pre>
     *&#47; Bytes of data transmitted from this peer
     * </pre>
     *
     * <code>uint64 bytes_recv = 5[json_name = "bytes_recv"];</code>
     */
    public Builder setBytesRecv(long value) {
      
      bytesRecv_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Bytes of data transmitted from this peer
     * </pre>
     *
     * <code>uint64 bytes_recv = 5[json_name = "bytes_recv"];</code>
     */
    public Builder clearBytesRecv() {
      
      bytesRecv_ = 0L;
      onChanged();
      return this;
    }

    private long satSent_ ;
    /**
     * <pre>
     *&#47; Satoshis sent to this peer
     * </pre>
     *
     * <code>int64 sat_sent = 6[json_name = "sat_sent"];</code>
     */
    public long getSatSent() {
      return satSent_;
    }
    /**
     * <pre>
     *&#47; Satoshis sent to this peer
     * </pre>
     *
     * <code>int64 sat_sent = 6[json_name = "sat_sent"];</code>
     */
    public Builder setSatSent(long value) {
      
      satSent_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Satoshis sent to this peer
     * </pre>
     *
     * <code>int64 sat_sent = 6[json_name = "sat_sent"];</code>
     */
    public Builder clearSatSent() {
      
      satSent_ = 0L;
      onChanged();
      return this;
    }

    private long satRecv_ ;
    /**
     * <pre>
     *&#47; Satoshis received from this peer
     * </pre>
     *
     * <code>int64 sat_recv = 7[json_name = "sat_recv"];</code>
     */
    public long getSatRecv() {
      return satRecv_;
    }
    /**
     * <pre>
     *&#47; Satoshis received from this peer
     * </pre>
     *
     * <code>int64 sat_recv = 7[json_name = "sat_recv"];</code>
     */
    public Builder setSatRecv(long value) {
      
      satRecv_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Satoshis received from this peer
     * </pre>
     *
     * <code>int64 sat_recv = 7[json_name = "sat_recv"];</code>
     */
    public Builder clearSatRecv() {
      
      satRecv_ = 0L;
      onChanged();
      return this;
    }

    private boolean inbound_ ;
    /**
     * <pre>
     *&#47; A channel is inbound if the counterparty initiated the channel
     * </pre>
     *
     * <code>bool inbound = 8[json_name = "inbound"];</code>
     */
    public boolean getInbound() {
      return inbound_;
    }
    /**
     * <pre>
     *&#47; A channel is inbound if the counterparty initiated the channel
     * </pre>
     *
     * <code>bool inbound = 8[json_name = "inbound"];</code>
     */
    public Builder setInbound(boolean value) {
      
      inbound_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; A channel is inbound if the counterparty initiated the channel
     * </pre>
     *
     * <code>bool inbound = 8[json_name = "inbound"];</code>
     */
    public Builder clearInbound() {
      
      inbound_ = false;
      onChanged();
      return this;
    }

    private long pingTime_ ;
    /**
     * <pre>
     *&#47; Ping time to this peer
     * </pre>
     *
     * <code>int64 ping_time = 9[json_name = "ping_time"];</code>
     */
    public long getPingTime() {
      return pingTime_;
    }
    /**
     * <pre>
     *&#47; Ping time to this peer
     * </pre>
     *
     * <code>int64 ping_time = 9[json_name = "ping_time"];</code>
     */
    public Builder setPingTime(long value) {
      
      pingTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *&#47; Ping time to this peer
     * </pre>
     *
     * <code>int64 ping_time = 9[json_name = "ping_time"];</code>
     */
    public Builder clearPingTime() {
      
      pingTime_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:lnrpc.Peer)
  }

  // @@protoc_insertion_point(class_scope:lnrpc.Peer)
  private static final lightpay.lnd.grpc.Peer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lightpay.lnd.grpc.Peer();
  }

  public static lightpay.lnd.grpc.Peer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Peer>
      PARSER = new com.google.protobuf.AbstractParser<Peer>() {
    public Peer parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Peer(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Peer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Peer> getParserForType() {
    return PARSER;
  }

  public lightpay.lnd.grpc.Peer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

