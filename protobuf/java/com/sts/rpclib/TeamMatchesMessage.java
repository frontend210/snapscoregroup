// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: h2h.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.TeamMatchesMessage}
 */
public final class TeamMatchesMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.TeamMatchesMessage)
    TeamMatchesMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TeamMatchesMessage.newBuilder() to construct.
  private TeamMatchesMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TeamMatchesMessage() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TeamMatchesMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TeamMatchesMessage(
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
            com.sts.rpclib.H2HParticipantMessage.Builder subBuilder = null;
            if (h2HParticipants_ != null) {
              subBuilder = h2HParticipants_.toBuilder();
            }
            h2HParticipants_ = input.readMessage(com.sts.rpclib.H2HParticipantMessage.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(h2HParticipants_);
              h2HParticipants_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {

            data_ = input.readBytes();
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
    return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_TeamMatchesMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_TeamMatchesMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.TeamMatchesMessage.class, com.sts.rpclib.TeamMatchesMessage.Builder.class);
  }

  public static final int H2HPARTICIPANTS_FIELD_NUMBER = 1;
  private com.sts.rpclib.H2HParticipantMessage h2HParticipants_;
  /**
   * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   * @return Whether the h2hParticipants field is set.
   */
  @java.lang.Override
  public boolean hasH2HParticipants() {
    return h2HParticipants_ != null;
  }
  /**
   * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   * @return The h2hParticipants.
   */
  @java.lang.Override
  public com.sts.rpclib.H2HParticipantMessage getH2HParticipants() {
    return h2HParticipants_ == null ? com.sts.rpclib.H2HParticipantMessage.getDefaultInstance() : h2HParticipants_;
  }
  /**
   * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.H2HParticipantMessageOrBuilder getH2HParticipantsOrBuilder() {
    return getH2HParticipants();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 2;</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    if (h2HParticipants_ != null) {
      output.writeMessage(1, getH2HParticipants());
    }
    if (!data_.isEmpty()) {
      output.writeBytes(2, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (h2HParticipants_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getH2HParticipants());
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, data_);
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
    if (!(obj instanceof com.sts.rpclib.TeamMatchesMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.TeamMatchesMessage other = (com.sts.rpclib.TeamMatchesMessage) obj;

    if (hasH2HParticipants() != other.hasH2HParticipants()) return false;
    if (hasH2HParticipants()) {
      if (!getH2HParticipants()
          .equals(other.getH2HParticipants())) return false;
    }
    if (!getData()
        .equals(other.getData())) return false;
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
    if (hasH2HParticipants()) {
      hash = (37 * hash) + H2HPARTICIPANTS_FIELD_NUMBER;
      hash = (53 * hash) + getH2HParticipants().hashCode();
    }
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.TeamMatchesMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.TeamMatchesMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.TeamMatchesMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.TeamMatchesMessage)
      com.sts.rpclib.TeamMatchesMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_TeamMatchesMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_TeamMatchesMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.TeamMatchesMessage.class, com.sts.rpclib.TeamMatchesMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.TeamMatchesMessage.newBuilder()
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
      if (h2HParticipantsBuilder_ == null) {
        h2HParticipants_ = null;
      } else {
        h2HParticipants_ = null;
        h2HParticipantsBuilder_ = null;
      }
      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.H2H.internal_static_com_sts_rpclib_TeamMatchesMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.TeamMatchesMessage getDefaultInstanceForType() {
      return com.sts.rpclib.TeamMatchesMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.TeamMatchesMessage build() {
      com.sts.rpclib.TeamMatchesMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.TeamMatchesMessage buildPartial() {
      com.sts.rpclib.TeamMatchesMessage result = new com.sts.rpclib.TeamMatchesMessage(this);
      if (h2HParticipantsBuilder_ == null) {
        result.h2HParticipants_ = h2HParticipants_;
      } else {
        result.h2HParticipants_ = h2HParticipantsBuilder_.build();
      }
      result.data_ = data_;
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
      if (other instanceof com.sts.rpclib.TeamMatchesMessage) {
        return mergeFrom((com.sts.rpclib.TeamMatchesMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.TeamMatchesMessage other) {
      if (other == com.sts.rpclib.TeamMatchesMessage.getDefaultInstance()) return this;
      if (other.hasH2HParticipants()) {
        mergeH2HParticipants(other.getH2HParticipants());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
      com.sts.rpclib.TeamMatchesMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.TeamMatchesMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.sts.rpclib.H2HParticipantMessage h2HParticipants_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sts.rpclib.H2HParticipantMessage, com.sts.rpclib.H2HParticipantMessage.Builder, com.sts.rpclib.H2HParticipantMessageOrBuilder> h2HParticipantsBuilder_;
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     * @return Whether the h2hParticipants field is set.
     */
    public boolean hasH2HParticipants() {
      return h2HParticipantsBuilder_ != null || h2HParticipants_ != null;
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     * @return The h2hParticipants.
     */
    public com.sts.rpclib.H2HParticipantMessage getH2HParticipants() {
      if (h2HParticipantsBuilder_ == null) {
        return h2HParticipants_ == null ? com.sts.rpclib.H2HParticipantMessage.getDefaultInstance() : h2HParticipants_;
      } else {
        return h2HParticipantsBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder setH2HParticipants(com.sts.rpclib.H2HParticipantMessage value) {
      if (h2HParticipantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        h2HParticipants_ = value;
        onChanged();
      } else {
        h2HParticipantsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder setH2HParticipants(
        com.sts.rpclib.H2HParticipantMessage.Builder builderForValue) {
      if (h2HParticipantsBuilder_ == null) {
        h2HParticipants_ = builderForValue.build();
        onChanged();
      } else {
        h2HParticipantsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder mergeH2HParticipants(com.sts.rpclib.H2HParticipantMessage value) {
      if (h2HParticipantsBuilder_ == null) {
        if (h2HParticipants_ != null) {
          h2HParticipants_ =
            com.sts.rpclib.H2HParticipantMessage.newBuilder(h2HParticipants_).mergeFrom(value).buildPartial();
        } else {
          h2HParticipants_ = value;
        }
        onChanged();
      } else {
        h2HParticipantsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public Builder clearH2HParticipants() {
      if (h2HParticipantsBuilder_ == null) {
        h2HParticipants_ = null;
        onChanged();
      } else {
        h2HParticipants_ = null;
        h2HParticipantsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public com.sts.rpclib.H2HParticipantMessage.Builder getH2HParticipantsBuilder() {
      
      onChanged();
      return getH2HParticipantsFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    public com.sts.rpclib.H2HParticipantMessageOrBuilder getH2HParticipantsOrBuilder() {
      if (h2HParticipantsBuilder_ != null) {
        return h2HParticipantsBuilder_.getMessageOrBuilder();
      } else {
        return h2HParticipants_ == null ?
            com.sts.rpclib.H2HParticipantMessage.getDefaultInstance() : h2HParticipants_;
      }
    }
    /**
     * <code>.com.sts.rpclib.H2HParticipantMessage h2hParticipants = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.sts.rpclib.H2HParticipantMessage, com.sts.rpclib.H2HParticipantMessage.Builder, com.sts.rpclib.H2HParticipantMessageOrBuilder> 
        getH2HParticipantsFieldBuilder() {
      if (h2HParticipantsBuilder_ == null) {
        h2HParticipantsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.sts.rpclib.H2HParticipantMessage, com.sts.rpclib.H2HParticipantMessage.Builder, com.sts.rpclib.H2HParticipantMessageOrBuilder>(
                getH2HParticipants(),
                getParentForChildren(),
                isClean());
        h2HParticipants_ = null;
      }
      return h2HParticipantsBuilder_;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 2;</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 2;</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.TeamMatchesMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.TeamMatchesMessage)
  private static final com.sts.rpclib.TeamMatchesMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.TeamMatchesMessage();
  }

  public static com.sts.rpclib.TeamMatchesMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TeamMatchesMessage>
      PARSER = new com.google.protobuf.AbstractParser<TeamMatchesMessage>() {
    @java.lang.Override
    public TeamMatchesMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TeamMatchesMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TeamMatchesMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TeamMatchesMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.TeamMatchesMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

