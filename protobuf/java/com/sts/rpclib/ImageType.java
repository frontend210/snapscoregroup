// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: image.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.ImageType}
 */
public enum ImageType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>IMAGE_TYPE_UNKNOWN = 0;</code>
   */
  IMAGE_TYPE_UNKNOWN(0),
  /**
   * <code>IMAGE_TYPE_FLAG = 1;</code>
   */
  IMAGE_TYPE_FLAG(1),
  /**
   * <code>IMAGE_TYPE_LOGO = 2;</code>
   */
  IMAGE_TYPE_LOGO(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>IMAGE_TYPE_UNKNOWN = 0;</code>
   */
  public static final int IMAGE_TYPE_UNKNOWN_VALUE = 0;
  /**
   * <code>IMAGE_TYPE_FLAG = 1;</code>
   */
  public static final int IMAGE_TYPE_FLAG_VALUE = 1;
  /**
   * <code>IMAGE_TYPE_LOGO = 2;</code>
   */
  public static final int IMAGE_TYPE_LOGO_VALUE = 2;


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
  public static ImageType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ImageType forNumber(int value) {
    switch (value) {
      case 0: return IMAGE_TYPE_UNKNOWN;
      case 1: return IMAGE_TYPE_FLAG;
      case 2: return IMAGE_TYPE_LOGO;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImageType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImageType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImageType>() {
          public ImageType findValueByNumber(int number) {
            return ImageType.forNumber(number);
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
    return com.sts.rpclib.Image.getDescriptor().getEnumTypes().get(0);
  }

  private static final ImageType[] VALUES = values();

  public static ImageType valueOf(
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

  private ImageType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.ImageType)
}

