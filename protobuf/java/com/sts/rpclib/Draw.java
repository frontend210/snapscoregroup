// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: draw.proto

package com.sts.rpclib;

public final class Draw {
  private Draw() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_DrawFullMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_DrawFullMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_DrawMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_DrawMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_DrawEventMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_DrawEventMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\ndraw.proto\022\016com.sts.rpclib\032\013match.prot" +
      "o\032\013enums.proto\"@\n\017DrawFullMessage\022\014\n\004dat" +
      "a\030\001 \001(\014\022\017\n\007stageId\030\002 \001(\t\022\016\n\006season\030\003 \001(\t" +
      "\"\221\001\n\013DrawMessage\022\017\n\007stageId\030\001 \001(\t\022\016\n\006sea" +
      "son\030\002 \001(\t\022+\n\010drawType\030\003 \001(\0162\031.com.sts.rp" +
      "clib.EventType\0224\n\ndrawEvents\030\004 \003(\0132 .com" +
      ".sts.rpclib.DrawEventMessage\"k\n\020DrawEven" +
      "tMessage\022\n\n\002id\030\001 \001(\t\0228\n\014participants\030\002 \003" +
      "(\0132\".com.sts.rpclib.ParticipantMessage\022\021" +
      "\n\teventsIds\030\003 \003(\t*\335\001\n\010DrawType\022\024\n\020MALE_S" +
      "INGLE_DRAW\020\000\022\024\n\020MALE_DOUBLE_DRAW\020\001\022\026\n\022FE" +
      "MALE_SINGLE_DRAW\020\002\022\026\n\022FEMALE_DOUBLE_DRAW" +
      "\020\003\022\025\n\021MIXED_DOUBLE_DRAW\020\004\022\r\n\tTEAM_DRAW\020\005" +
      "\022\022\n\016MALE_TEAM_DRAW\020\006\022\024\n\020FEMALE_TEAM_DRAW" +
      "\020\007\022\026\n\022QUALIFICATION_DRAW\020\010\022\r\n\tMAIN_DRAW\020" +
      "\tB\rP\001Z\t/gorpclibb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sts.rpclib.Match.getDescriptor(),
          com.sts.rpclib.Enums.getDescriptor(),
        });
    internal_static_com_sts_rpclib_DrawFullMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_DrawFullMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_DrawFullMessage_descriptor,
        new java.lang.String[] { "Data", "StageId", "Season", });
    internal_static_com_sts_rpclib_DrawMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_sts_rpclib_DrawMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_DrawMessage_descriptor,
        new java.lang.String[] { "StageId", "Season", "DrawType", "DrawEvents", });
    internal_static_com_sts_rpclib_DrawEventMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_sts_rpclib_DrawEventMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_DrawEventMessage_descriptor,
        new java.lang.String[] { "Id", "Participants", "EventsIds", });
    com.sts.rpclib.Match.getDescriptor();
    com.sts.rpclib.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}