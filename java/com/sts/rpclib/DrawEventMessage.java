// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: draw.proto

package com.sts.rpclib;

/**
 * Protobuf type {@code com.sts.rpclib.DrawEventMessage}
 */
public final class DrawEventMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.sts.rpclib.DrawEventMessage)
    DrawEventMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DrawEventMessage.newBuilder() to construct.
  private DrawEventMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DrawEventMessage() {
    id_ = "";
    participants_ = java.util.Collections.emptyList();
    eventsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DrawEventMessage();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DrawEventMessage(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              participants_ = new java.util.ArrayList<com.sts.rpclib.ParticipantMessage>();
              mutable_bitField0_ |= 0x00000001;
            }
            participants_.add(
                input.readMessage(com.sts.rpclib.ParticipantMessage.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              eventsIds_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            eventsIds_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        participants_ = java.util.Collections.unmodifiableList(participants_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        eventsIds_ = eventsIds_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawEventMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawEventMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sts.rpclib.DrawEventMessage.class, com.sts.rpclib.DrawEventMessage.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <code>string id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTICIPANTS_FIELD_NUMBER = 2;
  private java.util.List<com.sts.rpclib.ParticipantMessage> participants_;
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
   */
  @java.lang.Override
  public java.util.List<com.sts.rpclib.ParticipantMessage> getParticipantsList() {
    return participants_;
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sts.rpclib.ParticipantMessageOrBuilder> 
      getParticipantsOrBuilderList() {
    return participants_;
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
   */
  @java.lang.Override
  public int getParticipantsCount() {
    return participants_.size();
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.ParticipantMessage getParticipants(int index) {
    return participants_.get(index);
  }
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
   */
  @java.lang.Override
  public com.sts.rpclib.ParticipantMessageOrBuilder getParticipantsOrBuilder(
      int index) {
    return participants_.get(index);
  }

  public static final int EVENTSIDS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList eventsIds_;
  /**
   * <code>repeated string eventsIds = 3;</code>
   * @return A list containing the eventsIds.
   */
  public com.google.protobuf.ProtocolStringList
      getEventsIdsList() {
    return eventsIds_;
  }
  /**
   * <code>repeated string eventsIds = 3;</code>
   * @return The count of eventsIds.
   */
  public int getEventsIdsCount() {
    return eventsIds_.size();
  }
  /**
   * <code>repeated string eventsIds = 3;</code>
   * @param index The index of the element to return.
   * @return The eventsIds at the given index.
   */
  public java.lang.String getEventsIds(int index) {
    return eventsIds_.get(index);
  }
  /**
   * <code>repeated string eventsIds = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the eventsIds at the given index.
   */
  public com.google.protobuf.ByteString
      getEventsIdsBytes(int index) {
    return eventsIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    for (int i = 0; i < participants_.size(); i++) {
      output.writeMessage(2, participants_.get(i));
    }
    for (int i = 0; i < eventsIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, eventsIds_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    for (int i = 0; i < participants_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, participants_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < eventsIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(eventsIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEventsIdsList().size();
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
    if (!(obj instanceof com.sts.rpclib.DrawEventMessage)) {
      return super.equals(obj);
    }
    com.sts.rpclib.DrawEventMessage other = (com.sts.rpclib.DrawEventMessage) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getParticipantsList()
        .equals(other.getParticipantsList())) return false;
    if (!getEventsIdsList()
        .equals(other.getEventsIdsList())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (getParticipantsCount() > 0) {
      hash = (37 * hash) + PARTICIPANTS_FIELD_NUMBER;
      hash = (53 * hash) + getParticipantsList().hashCode();
    }
    if (getEventsIdsCount() > 0) {
      hash = (37 * hash) + EVENTSIDS_FIELD_NUMBER;
      hash = (53 * hash) + getEventsIdsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sts.rpclib.DrawEventMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.DrawEventMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.DrawEventMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sts.rpclib.DrawEventMessage parseFrom(
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
  public static Builder newBuilder(com.sts.rpclib.DrawEventMessage prototype) {
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
   * Protobuf type {@code com.sts.rpclib.DrawEventMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.sts.rpclib.DrawEventMessage)
      com.sts.rpclib.DrawEventMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawEventMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawEventMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sts.rpclib.DrawEventMessage.class, com.sts.rpclib.DrawEventMessage.Builder.class);
    }

    // Construct using com.sts.rpclib.DrawEventMessage.newBuilder()
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
        getParticipantsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = "";

      if (participantsBuilder_ == null) {
        participants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        participantsBuilder_.clear();
      }
      eventsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sts.rpclib.Draw.internal_static_com_sts_rpclib_DrawEventMessage_descriptor;
    }

    @java.lang.Override
    public com.sts.rpclib.DrawEventMessage getDefaultInstanceForType() {
      return com.sts.rpclib.DrawEventMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.sts.rpclib.DrawEventMessage build() {
      com.sts.rpclib.DrawEventMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sts.rpclib.DrawEventMessage buildPartial() {
      com.sts.rpclib.DrawEventMessage result = new com.sts.rpclib.DrawEventMessage(this);
      int from_bitField0_ = bitField0_;
      result.id_ = id_;
      if (participantsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          participants_ = java.util.Collections.unmodifiableList(participants_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.participants_ = participants_;
      } else {
        result.participants_ = participantsBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        eventsIds_ = eventsIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.eventsIds_ = eventsIds_;
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
      if (other instanceof com.sts.rpclib.DrawEventMessage) {
        return mergeFrom((com.sts.rpclib.DrawEventMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sts.rpclib.DrawEventMessage other) {
      if (other == com.sts.rpclib.DrawEventMessage.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (participantsBuilder_ == null) {
        if (!other.participants_.isEmpty()) {
          if (participants_.isEmpty()) {
            participants_ = other.participants_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureParticipantsIsMutable();
            participants_.addAll(other.participants_);
          }
          onChanged();
        }
      } else {
        if (!other.participants_.isEmpty()) {
          if (participantsBuilder_.isEmpty()) {
            participantsBuilder_.dispose();
            participantsBuilder_ = null;
            participants_ = other.participants_;
            bitField0_ = (bitField0_ & ~0x00000001);
            participantsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getParticipantsFieldBuilder() : null;
          } else {
            participantsBuilder_.addAllMessages(other.participants_);
          }
        }
      }
      if (!other.eventsIds_.isEmpty()) {
        if (eventsIds_.isEmpty()) {
          eventsIds_ = other.eventsIds_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureEventsIdsIsMutable();
          eventsIds_.addAll(other.eventsIds_);
        }
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
      com.sts.rpclib.DrawEventMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.sts.rpclib.DrawEventMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1;</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1;</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.sts.rpclib.ParticipantMessage> participants_ =
      java.util.Collections.emptyList();
    private void ensureParticipantsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        participants_ = new java.util.ArrayList<com.sts.rpclib.ParticipantMessage>(participants_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.ParticipantMessage, com.sts.rpclib.ParticipantMessage.Builder, com.sts.rpclib.ParticipantMessageOrBuilder> participantsBuilder_;

    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public java.util.List<com.sts.rpclib.ParticipantMessage> getParticipantsList() {
      if (participantsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(participants_);
      } else {
        return participantsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public int getParticipantsCount() {
      if (participantsBuilder_ == null) {
        return participants_.size();
      } else {
        return participantsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public com.sts.rpclib.ParticipantMessage getParticipants(int index) {
      if (participantsBuilder_ == null) {
        return participants_.get(index);
      } else {
        return participantsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder setParticipants(
        int index, com.sts.rpclib.ParticipantMessage value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.set(index, value);
        onChanged();
      } else {
        participantsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder setParticipants(
        int index, com.sts.rpclib.ParticipantMessage.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.set(index, builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder addParticipants(com.sts.rpclib.ParticipantMessage value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.add(value);
        onChanged();
      } else {
        participantsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder addParticipants(
        int index, com.sts.rpclib.ParticipantMessage value) {
      if (participantsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureParticipantsIsMutable();
        participants_.add(index, value);
        onChanged();
      } else {
        participantsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder addParticipants(
        com.sts.rpclib.ParticipantMessage.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.add(builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder addParticipants(
        int index, com.sts.rpclib.ParticipantMessage.Builder builderForValue) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.add(index, builderForValue.build());
        onChanged();
      } else {
        participantsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder addAllParticipants(
        java.lang.Iterable<? extends com.sts.rpclib.ParticipantMessage> values) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, participants_);
        onChanged();
      } else {
        participantsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder clearParticipants() {
      if (participantsBuilder_ == null) {
        participants_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        participantsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public Builder removeParticipants(int index) {
      if (participantsBuilder_ == null) {
        ensureParticipantsIsMutable();
        participants_.remove(index);
        onChanged();
      } else {
        participantsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public com.sts.rpclib.ParticipantMessage.Builder getParticipantsBuilder(
        int index) {
      return getParticipantsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public com.sts.rpclib.ParticipantMessageOrBuilder getParticipantsOrBuilder(
        int index) {
      if (participantsBuilder_ == null) {
        return participants_.get(index);  } else {
        return participantsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public java.util.List<? extends com.sts.rpclib.ParticipantMessageOrBuilder> 
         getParticipantsOrBuilderList() {
      if (participantsBuilder_ != null) {
        return participantsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(participants_);
      }
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public com.sts.rpclib.ParticipantMessage.Builder addParticipantsBuilder() {
      return getParticipantsFieldBuilder().addBuilder(
          com.sts.rpclib.ParticipantMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public com.sts.rpclib.ParticipantMessage.Builder addParticipantsBuilder(
        int index) {
      return getParticipantsFieldBuilder().addBuilder(
          index, com.sts.rpclib.ParticipantMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 2;</code>
     */
    public java.util.List<com.sts.rpclib.ParticipantMessage.Builder> 
         getParticipantsBuilderList() {
      return getParticipantsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sts.rpclib.ParticipantMessage, com.sts.rpclib.ParticipantMessage.Builder, com.sts.rpclib.ParticipantMessageOrBuilder> 
        getParticipantsFieldBuilder() {
      if (participantsBuilder_ == null) {
        participantsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sts.rpclib.ParticipantMessage, com.sts.rpclib.ParticipantMessage.Builder, com.sts.rpclib.ParticipantMessageOrBuilder>(
                participants_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        participants_ = null;
      }
      return participantsBuilder_;
    }

    private com.google.protobuf.LazyStringList eventsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEventsIdsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        eventsIds_ = new com.google.protobuf.LazyStringArrayList(eventsIds_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @return A list containing the eventsIds.
     */
    public com.google.protobuf.ProtocolStringList
        getEventsIdsList() {
      return eventsIds_.getUnmodifiableView();
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @return The count of eventsIds.
     */
    public int getEventsIdsCount() {
      return eventsIds_.size();
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @param index The index of the element to return.
     * @return The eventsIds at the given index.
     */
    public java.lang.String getEventsIds(int index) {
      return eventsIds_.get(index);
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the eventsIds at the given index.
     */
    public com.google.protobuf.ByteString
        getEventsIdsBytes(int index) {
      return eventsIds_.getByteString(index);
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @param index The index to set the value at.
     * @param value The eventsIds to set.
     * @return This builder for chaining.
     */
    public Builder setEventsIds(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEventsIdsIsMutable();
      eventsIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @param value The eventsIds to add.
     * @return This builder for chaining.
     */
    public Builder addEventsIds(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEventsIdsIsMutable();
      eventsIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @param values The eventsIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllEventsIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureEventsIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, eventsIds_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEventsIds() {
      eventsIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string eventsIds = 3;</code>
     * @param value The bytes of the eventsIds to add.
     * @return This builder for chaining.
     */
    public Builder addEventsIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEventsIdsIsMutable();
      eventsIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:com.sts.rpclib.DrawEventMessage)
  }

  // @@protoc_insertion_point(class_scope:com.sts.rpclib.DrawEventMessage)
  private static final com.sts.rpclib.DrawEventMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sts.rpclib.DrawEventMessage();
  }

  public static com.sts.rpclib.DrawEventMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DrawEventMessage>
      PARSER = new com.google.protobuf.AbstractParser<DrawEventMessage>() {
    @java.lang.Override
    public DrawEventMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DrawEventMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DrawEventMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DrawEventMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.sts.rpclib.DrawEventMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
