// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player_profile.proto

package com.sts.rpclib;

public final class PlayerProfile {
  private PlayerProfile() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_PlayerProfileMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_PlayerProfileMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_PlayerMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_PlayerMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_PlayerTeamMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_PlayerTeamMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_PlayerProfileFullMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_PlayerProfileFullMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024player_profile.proto\022\016com.sts.rpclib\032\014" +
      "sports.proto\032\017languages.proto\032\013enums.pro" +
      "to\"\235\001\n\024PlayerProfileMessage\022-\n\006player\030\001 " +
      "\001(\0132\035.com.sts.rpclib.PlayerMessage\0220\n\005te" +
      "ams\030\002 \003(\0132!.com.sts.rpclib.PlayerTeamMes" +
      "sage\022$\n\005sport\030\003 \001(\0162\025.com.sts.rpclib.Spo" +
      "rt\"\264\001\n\rPlayerMessage\022\n\n\002id\030\001 \001(\t\022+\n\004name" +
      "\030\002 \003(\0132\035.com.sts.rpclib.LocalizedName\022\023\n" +
      "\013dateOfBirth\030\003 \001(\003\022\016\n\006height\030\004 \001(\001\022\016\n\006we" +
      "ight\030\005 \001(\001\0225\n\010position\030\006 \001(\0162#.com.sts.r" +
      "pclib.ParticipantPosition\"r\n\021PlayerTeamM" +
      "essage\022\020\n\010dateFrom\030\001 \001(\003\022\016\n\006dateTo\030\002 \001(\003" +
      "\022\016\n\006active\030\003 \001(\010\022+\n\004name\030\004 \003(\0132\035.com.sts" +
      ".rpclib.LocalizedName\"4\n\030PlayerProfileFu" +
      "llMessage\022\014\n\004data\030\001 \001(\014\022\n\n\002id\030\002 \001(\tB/P\001Z" +
      "+github.com/frontend210/protobuf/gorp" +
      "clibb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sts.rpclib.Sports.getDescriptor(),
          com.sts.rpclib.Languages.getDescriptor(),
          com.sts.rpclib.Enums.getDescriptor(),
        });
    internal_static_com_sts_rpclib_PlayerProfileMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_PlayerProfileMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_PlayerProfileMessage_descriptor,
        new java.lang.String[] { "Player", "Teams", "Sport", });
    internal_static_com_sts_rpclib_PlayerMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sts_rpclib_PlayerMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_PlayerMessage_descriptor,
        new java.lang.String[] { "Id", "Name", "DateOfBirth", "Height", "Weight", "Position", });
    internal_static_com_sts_rpclib_PlayerTeamMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_sts_rpclib_PlayerTeamMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_PlayerTeamMessage_descriptor,
        new java.lang.String[] { "DateFrom", "DateTo", "Active", "Name", });
    internal_static_com_sts_rpclib_PlayerProfileFullMessage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_sts_rpclib_PlayerProfileFullMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_PlayerProfileFullMessage_descriptor,
        new java.lang.String[] { "Data", "Id", });
    com.sts.rpclib.Sports.getDescriptor();
    com.sts.rpclib.Languages.getDescriptor();
    com.sts.rpclib.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}