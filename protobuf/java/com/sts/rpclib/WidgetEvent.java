// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: widget_event.proto

package com.sts.rpclib;

public final class WidgetEvent {
  private WidgetEvent() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_WidgetEventMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_WidgetEventMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022widget_event.proto\022\016com.sts.rpclib\032\013en" +
      "ums.proto\"\244\001\n\022WidgetEventMessage\022\n\n\002id\030\001" +
      " \001(\t\0222\n\teventType\030\002 \001(\0162\037.com.sts.rpclib" +
      ".WidgetEventType\022\022\n\nrefEventId\030\003 \001(\t\022\'\n\004" +
      "zone\030\004 \001(\0162\031.com.sts.rpclib.PitchZone\022\021\n" +
      "\ttimestamp\030\005 \001(\003B\rP\001Z\t/gorpclibb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sts.rpclib.Enums.getDescriptor(),
        });
    internal_static_com_sts_rpclib_WidgetEventMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_WidgetEventMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_WidgetEventMessage_descriptor,
        new java.lang.String[] { "Id", "EventType", "RefEventId", "Zone", "Timestamp", });
    com.sts.rpclib.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
