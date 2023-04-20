// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: match.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.MatchDeletedMessage}
 */
public final class MatchDeletedMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.MatchDeletedMessage)
    MatchDeletedMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MatchDeletedMessage.newBuilder() to construct.
  private MatchDeletedMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MatchDeletedMessage() {
    stageId_ = "";
    matchId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MatchDeletedMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MatchDeletedMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            stageId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            matchId_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchDeletedMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchDeletedMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.MatchDeletedMessage.class, com.sts.rpclib.MatchDeletedMessage.Builder.class);
  }

  public static final int STAGEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object stageId_;
  /**
   * <code>string stageId = 1;</code>
   * @return The stageId.
   */
  @java.lang.Override
  public java.lang.String getStageId() {
    java.lang.Object ref = stageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      stageId_ = s;
      return s;
    }
  }
  /**
   * <code>string stageId = 1;</code>
   * @return The bytes for stageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStageIdBytes() {
    java.lang.Object ref = stageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      stageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MATCHID_FIELD_NUMBER = 2;
  private volatile java.lang.Object matchId_;
  /**
   * <code>string matchId = 2;</code>
   * @return The matchId.
   */
  @java.lang.Override
  public java.lang.String getMatchId() {
    java.lang.Object ref = matchId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      matchId_ = s;
      return s;
    }
  }
  /**
   * <code>string matchId = 2;</code>
   * @return The bytes for matchId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMatchIdBytes() {
    java.lang.Object ref = matchId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      matchId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, matchId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(stageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, stageId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(matchId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, matchId_);
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
    if (!(obj instanceof com.sts.rpclib.MatchDeletedMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.MatchDeletedMessage other = (com.sts.rpclib.MatchDeletedMessage) obj;

    if (!getStageId()
        .equals(other.getStageId())) return false;
    if (!getMatchId()
        .equals(other.getMatchId())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + STAGEID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId().hashCode();
    hash = (37 * hash) + MATCHID_FIELD_NUMBER;
    hash = (53 * hash) + getMatchId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.MatchDeletedMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.sts.rpclib.MatchDeletedMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code com.sts.rpclib.MatchDeletedMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.MatchDeletedMessage)
      com.sts.rpclib.MatchDeletedMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchDeletedMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchDeletedMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.MatchDeletedMessage.class, com.sts.rpclib.MatchDeletedMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.MatchDeletedMessage.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      stageId_ = "";

      matchId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Match.internal_static_com_sts_rpclib_MatchDeletedMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.MatchDeletedMessage getDefaultInstanceForType() {
      return com.sts.rpclib.MatchDeletedMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.MatchDeletedMessage build() {
      com.sts.rpclib.MatchDeletedMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.MatchDeletedMessage buildPartial() {
      com.sts.rpclib.MatchDeletedMessage result = new com.sts.rpclib.MatchDeletedMessage(this);
      result.stageId_ = stageId_;
      result.matchId_ = matchId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sts.rpclib.MatchDeletedMessage) {
        return mergeFrom((com.sts.rpclib.MatchDeletedMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.MatchDeletedMessage other) {
      if (other == com.sts.rpclib.MatchDeletedMessage.getDefaultInstance()) return this;
      if (!other.getStageId().isEmpty()) {
        stageId_ = other.stageId_;
        onChanged();
      }
      if (!other.getMatchId().isEmpty()) {
        matchId_ = other.matchId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.sts.rpclib.MatchDeletedMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.MatchDeletedMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object stageId_ = "";
    /**
     * <code>string stageId = 1;</code>
     * @return The stageId.
     */
    public java.lang.String getStageId() {
      java.lang.Object ref = stageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        stageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string stageId = 1;</code>
     * @return The bytes for stageId.
     */
    public com.google.protobuf.ByteString
        getStageIdBytes() {
      java.lang.Object ref = stageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        stageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string stageId = 1;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      stageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      
      stageId_ = getDefaultInstance().getStageId();
      onChanged();
      return this;
    }
    /**
     * <code>string stageId = 1;</code>
     * @param value The bytes for stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      stageId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object matchId_ = "";
    /**
     * <code>string matchId = 2;</code>
     * @return The matchId.
     */
    public java.lang.String getMatchId() {
      java.lang.Object ref = matchId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        matchId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string matchId = 2;</code>
     * @return The bytes for matchId.
     */
    public com.google.protobuf.ByteString
        getMatchIdBytes() {
      java.lang.Object ref = matchId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        matchId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string matchId = 2;</code>
     * @param value The matchId to set.
     * @return This builder for chaining.
     */
    public Builder setMatchId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      matchId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string matchId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMatchId() {
      
      matchId_ = getDefaultInstance().getMatchId();
      onChanged();
      return this;
    }
    /**
     * <code>string matchId = 2;</code>
     * @param value The bytes for matchId to set.
     * @return This builder for chaining.
     */
    public Builder setMatchIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      matchId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.MatchDeletedMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.MatchDeletedMessage)
  private static final com.sts.rpclib.MatchDeletedMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.MatchDeletedMessage();
  }

  public static com.sts.rpclib.MatchDeletedMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchDeletedMessage>
      PARSER = new com.google.protobuf.AbstractParser<MatchDeletedMessage>() {
    @java.lang.Override
    public MatchDeletedMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MatchDeletedMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MatchDeletedMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchDeletedMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.MatchDeletedMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
