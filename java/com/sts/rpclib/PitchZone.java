// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.PitchZone}
 */
public enum PitchZone
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_PITCH_ZONE = 0;</code>
   */
  UNKNOWN_PITCH_ZONE(0),
  /**
   * <code>CORNER_HOME_LEFT = 1;</code>
   */
  CORNER_HOME_LEFT(1),
  /**
   * <code>CORNER_HOME_RIGHT = 2;</code>
   */
  CORNER_HOME_RIGHT(2),
  /**
   * <code>CORNER_AWAY_LEFT = 3;</code>
   */
  CORNER_AWAY_LEFT(3),
  /**
   * <code>CORNER_AWAY_RIGHT = 4;</code>
   */
  CORNER_AWAY_RIGHT(4),
  /**
   * <code>FREE_KICK_HOME_1 = 5;</code>
   */
  FREE_KICK_HOME_1(5),
  /**
   * <code>FREE_KICK_HOME_2 = 6;</code>
   */
  FREE_KICK_HOME_2(6),
  /**
   * <code>FREE_KICK_HOME_3_LEFT = 7;</code>
   */
  FREE_KICK_HOME_3_LEFT(7),
  /**
   * <code>FREE_KICK_HOME_3_RIGHT = 8;</code>
   */
  FREE_KICK_HOME_3_RIGHT(8),
  /**
   * <code>FREE_KICK_HOME_4 = 9;</code>
   */
  FREE_KICK_HOME_4(9),
  /**
   * <code>FREE_KICK_HOME_5 = 10;</code>
   */
  FREE_KICK_HOME_5(10),
  /**
   * <code>FREE_KICK_AWAY_1 = 11;</code>
   */
  FREE_KICK_AWAY_1(11),
  /**
   * <code>FREE_KICK_AWAY_2 = 12;</code>
   */
  FREE_KICK_AWAY_2(12),
  /**
   * <code>FREE_KICK_AWAY_3_LEFT = 13;</code>
   */
  FREE_KICK_AWAY_3_LEFT(13),
  /**
   * <code>FREE_KICK_AWAY_3_RIGHT = 14;</code>
   */
  FREE_KICK_AWAY_3_RIGHT(14),
  /**
   * <code>FREE_KICK_AWAY_4 = 15;</code>
   */
  FREE_KICK_AWAY_4(15),
  /**
   * <code>FREE_KICK_AWAY_5 = 16;</code>
   */
  FREE_KICK_AWAY_5(16),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_PITCH_ZONE = 0;</code>
   */
  public static final int UNKNOWN_PITCH_ZONE_VALUE = 0;
  /**
   * <code>CORNER_HOME_LEFT = 1;</code>
   */
  public static final int CORNER_HOME_LEFT_VALUE = 1;
  /**
   * <code>CORNER_HOME_RIGHT = 2;</code>
   */
  public static final int CORNER_HOME_RIGHT_VALUE = 2;
  /**
   * <code>CORNER_AWAY_LEFT = 3;</code>
   */
  public static final int CORNER_AWAY_LEFT_VALUE = 3;
  /**
   * <code>CORNER_AWAY_RIGHT = 4;</code>
   */
  public static final int CORNER_AWAY_RIGHT_VALUE = 4;
  /**
   * <code>FREE_KICK_HOME_1 = 5;</code>
   */
  public static final int FREE_KICK_HOME_1_VALUE = 5;
  /**
   * <code>FREE_KICK_HOME_2 = 6;</code>
   */
  public static final int FREE_KICK_HOME_2_VALUE = 6;
  /**
   * <code>FREE_KICK_HOME_3_LEFT = 7;</code>
   */
  public static final int FREE_KICK_HOME_3_LEFT_VALUE = 7;
  /**
   * <code>FREE_KICK_HOME_3_RIGHT = 8;</code>
   */
  public static final int FREE_KICK_HOME_3_RIGHT_VALUE = 8;
  /**
   * <code>FREE_KICK_HOME_4 = 9;</code>
   */
  public static final int FREE_KICK_HOME_4_VALUE = 9;
  /**
   * <code>FREE_KICK_HOME_5 = 10;</code>
   */
  public static final int FREE_KICK_HOME_5_VALUE = 10;
  /**
   * <code>FREE_KICK_AWAY_1 = 11;</code>
   */
  public static final int FREE_KICK_AWAY_1_VALUE = 11;
  /**
   * <code>FREE_KICK_AWAY_2 = 12;</code>
   */
  public static final int FREE_KICK_AWAY_2_VALUE = 12;
  /**
   * <code>FREE_KICK_AWAY_3_LEFT = 13;</code>
   */
  public static final int FREE_KICK_AWAY_3_LEFT_VALUE = 13;
  /**
   * <code>FREE_KICK_AWAY_3_RIGHT = 14;</code>
   */
  public static final int FREE_KICK_AWAY_3_RIGHT_VALUE = 14;
  /**
   * <code>FREE_KICK_AWAY_4 = 15;</code>
   */
  public static final int FREE_KICK_AWAY_4_VALUE = 15;
  /**
   * <code>FREE_KICK_AWAY_5 = 16;</code>
   */
  public static final int FREE_KICK_AWAY_5_VALUE = 16;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PitchZone valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PitchZone forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_PITCH_ZONE;
      case 1: return CORNER_HOME_LEFT;
      case 2: return CORNER_HOME_RIGHT;
      case 3: return CORNER_AWAY_LEFT;
      case 4: return CORNER_AWAY_RIGHT;
      case 5: return FREE_KICK_HOME_1;
      case 6: return FREE_KICK_HOME_2;
      case 7: return FREE_KICK_HOME_3_LEFT;
      case 8: return FREE_KICK_HOME_3_RIGHT;
      case 9: return FREE_KICK_HOME_4;
      case 10: return FREE_KICK_HOME_5;
      case 11: return FREE_KICK_AWAY_1;
      case 12: return FREE_KICK_AWAY_2;
      case 13: return FREE_KICK_AWAY_3_LEFT;
      case 14: return FREE_KICK_AWAY_3_RIGHT;
      case 15: return FREE_KICK_AWAY_4;
      case 16: return FREE_KICK_AWAY_5;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PitchZone>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      PitchZone> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<PitchZone>() {
          public PitchZone findValueByNumber(int number) {
            return PitchZone.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.sts.rpclib.Enums.getDescriptor().getEnumTypes().get(24);
  }

  private static final PitchZone[] VALUES = values();

  public static PitchZone valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PitchZone(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.PitchZone)
}
