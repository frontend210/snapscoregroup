// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: match.proto

package com.sts.rpclib;

public interface MatchParticipantsChangeMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sts.rpclib.MatchParticipantsChangeMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  java.util.List<com.sts.rpclib.ParticipantMessage> 
      getParticipantsList();
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  com.sts.rpclib.ParticipantMessage getParticipants(int index);
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  int getParticipantsCount();
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  java.util.List<? extends com.sts.rpclib.ParticipantMessageOrBuilder> 
      getParticipantsOrBuilderList();
  /**
   * <code>repeated .com.sts.rpclib.ParticipantMessage participants = 1;</code>
   */
  com.sts.rpclib.ParticipantMessageOrBuilder getParticipantsOrBuilder(
      int index);
}
