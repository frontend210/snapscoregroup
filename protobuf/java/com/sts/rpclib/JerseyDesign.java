// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.JerseyDesign}
 */
public enum JerseyDesign
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_JERSEY_DESIGN = 0;</code>
   */
  UNKNOWN_JERSEY_DESIGN(0),
  /**
   * <code>SOLID_JERSEY_DESIGN = 1;</code>
   */
  SOLID_JERSEY_DESIGN(1),
  /**
   * <code>HORIZONTAL_STRIPES_JERSEY_DESIGN = 2;</code>
   */
  HORIZONTAL_STRIPES_JERSEY_DESIGN(2),
  /**
   * <code>VERTICAL_STRIPES_JERSEY_DESIGN = 3;</code>
   */
  VERTICAL_STRIPES_JERSEY_DESIGN(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_JERSEY_DESIGN = 0;</code>
   */
  public static final int UNKNOWN_JERSEY_DESIGN_VALUE = 0;
  /**
   * <code>SOLID_JERSEY_DESIGN = 1;</code>
   */
  public static final int SOLID_JERSEY_DESIGN_VALUE = 1;
  /**
   * <code>HORIZONTAL_STRIPES_JERSEY_DESIGN = 2;</code>
   */
  public static final int HORIZONTAL_STRIPES_JERSEY_DESIGN_VALUE = 2;
  /**
   * <code>VERTICAL_STRIPES_JERSEY_DESIGN = 3;</code>
   */
  public static final int VERTICAL_STRIPES_JERSEY_DESIGN_VALUE = 3;


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
  public static JerseyDesign valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JerseyDesign forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_JERSEY_DESIGN;
      case 1: return SOLID_JERSEY_DESIGN;
      case 2: return HORIZONTAL_STRIPES_JERSEY_DESIGN;
      case 3: return VERTICAL_STRIPES_JERSEY_DESIGN;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JerseyDesign>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      JerseyDesign> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<JerseyDesign>() {
          public JerseyDesign findValueByNumber(int number) {
            return JerseyDesign.forNumber(number);
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
    return com.sts.rpclib.Enums.getDescriptor().getEnumTypes().get(2);
  }

  private static final JerseyDesign[] VALUES = values();

  public static JerseyDesign valueOf(
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

  private JerseyDesign(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.JerseyDesign)
}

