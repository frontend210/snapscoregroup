// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: providers.proto

package com.sts.rpclib;

public final class Providers {
  private Providers() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_sts_rpclib_ProviderStatusMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_sts_rpclib_ProviderStatusMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017providers.proto\022\016com.sts.rpclib\032\013enums" +
      ".proto\"K\n\025ProviderStatusMessage\0222\n\006statu" +
      "s\030\001 \001(\0162\".com.sts.rpclib.ProviderConnect" +
      "ion*\242\004\n\010Provider\022\024\n\020UNKNOWN_PROVIDER\020\000\022\014" +
      "\n\010INTERNAL\020\001\022\010\n\004ENET\020\002\022\016\n\nSPORTRADAR\020\003\022\t" +
      "\n\005RBALL\020\004\022\021\n\rPERFORM_GROUP\020\005\022\010\n\004OPTA\020\006\022\021" +
      "\n\rWATCH_AND_BET\020\007\022\016\n\nBET_GENIUS\020\010\022\007\n\003SCC" +
      "\020\t\022\017\n\013CRICTRACKER\020\n\022\n\n\006BETWAY\020\013\022\n\n\006RIVAL" +
      "S\020\014\022\n\n\006CROWDY\020\r\022\014\n\010PA_MEDIA\020\016\022\016\n\nBOOKMAK" +
      "ERS\020\017\022\r\n\tACCUSCORE\020\020\022\r\n\tSOFASCORE\020\021\022\r\n\tS" +
      "OCCERWAY\020\022\022\013\n\007BETSAPI\020\023\022\n\n\006BET365\020\024\022\"\n\036E" +
      "UROPEAN_TOUR_OFFICIAL_WEBSITE\020\025\022\035\n\031PGA_T" +
      "OUR_OFFICIAL_WEBSITE\020\026\022\r\n\tSCORESPRO\020\027\022\014\n" +
      "\010ATP_TOUR\020\030\022\014\n\010WTA_TOUR\020\031\022\r\n\tWHOSCORED\020\032" +
      "\022\010\n\004ESPN\020\033\022\036\n\032ULTIMATE_TENNIS_STATISTICS" +
      "\020\034\022\017\n\013FOOTBALL365\020\035\022\021\n\rBETWAY_AFRICA\020\036\022\014" +
      "\n\010GAZZETTA\020\037\022\022\n\016CESKA_TELEVIZE\020 B\rP\001Z\t/g" +
      "orpclibb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.sts.rpclib.Enums.getDescriptor(),
        });
    internal_static_com_sts_rpclib_ProviderStatusMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_sts_rpclib_ProviderStatusMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_sts_rpclib_ProviderStatusMessage_descriptor,
        new java.lang.String[] { "Status", });
    com.sts.rpclib.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
