// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: top_scorer.proto

package com.sts.rpclib;

public interface TopScorerEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sts.rpclib.TopScorerEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 ranking = 1;</code>
   * @return The ranking.
   */
  int getRanking();

  /**
   * <code>string player_id = 2;</code>
   * @return The playerId.
   */
  java.lang.String getPlayerId();
  /**
   * <code>string player_id = 2;</code>
   * @return The bytes for playerId.
   */
  com.google.protobuf.ByteString
      getPlayerIdBytes();

  /**
   * <code>repeated .com.sts.rpclib.LocalizedName player_name = 3;</code>
   */
  java.util.List<com.sts.rpclib.LocalizedName> 
      getPlayerNameList();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName player_name = 3;</code>
   */
  com.sts.rpclib.LocalizedName getPlayerName(int index);
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName player_name = 3;</code>
   */
  int getPlayerNameCount();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName player_name = 3;</code>
   */
  java.util.List<? extends com.sts.rpclib.LocalizedNameOrBuilder> 
      getPlayerNameOrBuilderList();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName player_name = 3;</code>
   */
  com.sts.rpclib.LocalizedNameOrBuilder getPlayerNameOrBuilder(
      int index);

  /**
   * <code>string goals = 4;</code>
   * @return The goals.
   */
  java.lang.String getGoals();
  /**
   * <code>string goals = 4;</code>
   * @return The bytes for goals.
   */
  com.google.protobuf.ByteString
      getGoalsBytes();

  /**
   * <code>string penalties = 5;</code>
   * @return The penalties.
   */
  java.lang.String getPenalties();
  /**
   * <code>string penalties = 5;</code>
   * @return The bytes for penalties.
   */
  com.google.protobuf.ByteString
      getPenaltiesBytes();

  /**
   * <code>string first_scorer = 6;</code>
   * @return The firstScorer.
   */
  java.lang.String getFirstScorer();
  /**
   * <code>string first_scorer = 6;</code>
   * @return The bytes for firstScorer.
   */
  com.google.protobuf.ByteString
      getFirstScorerBytes();

  /**
   * <code>string participantId = 7;</code>
   * @return The participantId.
   */
  java.lang.String getParticipantId();
  /**
   * <code>string participantId = 7;</code>
   * @return The bytes for participantId.
   */
  com.google.protobuf.ByteString
      getParticipantIdBytes();

  /**
   * <code>repeated .com.sts.rpclib.LocalizedName participantName = 8;</code>
   */
  java.util.List<com.sts.rpclib.LocalizedName> 
      getParticipantNameList();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName participantName = 8;</code>
   */
  com.sts.rpclib.LocalizedName getParticipantName(int index);
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName participantName = 8;</code>
   */
  int getParticipantNameCount();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName participantName = 8;</code>
   */
  java.util.List<? extends com.sts.rpclib.LocalizedNameOrBuilder> 
      getParticipantNameOrBuilderList();
  /**
   * <code>repeated .com.sts.rpclib.LocalizedName participantName = 8;</code>
   */
  com.sts.rpclib.LocalizedNameOrBuilder getParticipantNameOrBuilder(
      int index);

  /**
   * <code>string assists = 9;</code>
   * @return The assists.
   */
  java.lang.String getAssists();
  /**
   * <code>string assists = 9;</code>
   * @return The bytes for assists.
   */
  com.google.protobuf.ByteString
      getAssistsBytes();
}
