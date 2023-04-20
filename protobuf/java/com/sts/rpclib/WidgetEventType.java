// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.WidgetEventType}
 */
public enum WidgetEventType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNKNOWN_WIDGET_EVENT = 0;</code>
   */
  UNKNOWN_WIDGET_EVENT(0),
  /**
   * <code>PLAYERS_COMING_OUT = 1;</code>
   */
  PLAYERS_COMING_OUT(1),
  /**
   * <code>PLAYERS_LINED_UP = 2;</code>
   */
  PLAYERS_LINED_UP(2),
  /**
   * <code>NATIONAL_ANTHEM_SINGING = 3;</code>
   */
  NATIONAL_ANTHEM_SINGING(3),
  /**
   * <code>SHAKE_HANDS = 4;</code>
   */
  SHAKE_HANDS(4),
  /**
   * <code>FLIP_COIN = 5;</code>
   */
  FLIP_COIN(5),
  /**
   * <code>MINUTE_SILENCE = 6;</code>
   */
  MINUTE_SILENCE(6),
  /**
   * <code>PRICE_GIVING_CEREMONY = 7;</code>
   */
  PRICE_GIVING_CEREMONY(7),
  /**
   * <code>PHOTO_TAKING = 8;</code>
   */
  PHOTO_TAKING(8),
  /**
   * <code>JERSEY_CHANGED = 9;</code>
   */
  JERSEY_CHANGED(9),
  /**
   * <code>FORMATION_CHANGED = 10;</code>
   */
  FORMATION_CHANGED(10),
  /**
   * <code>GAME_ABOUT_TO_START = 11;</code>
   */
  GAME_ABOUT_TO_START(11),
  /**
   * <code>RESTART_GAME = 12;</code>
   */
  RESTART_GAME(12),
  /**
   * <code>INJURY_BREAK = 13;</code>
   */
  INJURY_BREAK(13),
  /**
   * <code>PLAYER_INJURED_AWAY = 14;</code>
   */
  PLAYER_INJURED_AWAY(14),
  /**
   * <code>PLAYER_INJURED_HOME = 15;</code>
   */
  PLAYER_INJURED_HOME(15),
  /**
   * <code>NEXT_PENALTY_HOME = 16;</code>
   */
  NEXT_PENALTY_HOME(16),
  /**
   * <code>NEXT_PENALTY_AWAY = 17;</code>
   */
  NEXT_PENALTY_AWAY(17),
  /**
   * <code>NEXT_PENALTY_SCORER = 18;</code>
   */
  NEXT_PENALTY_SCORER(18),
  /**
   * <code>REFEREE_BALL = 19;</code>
   */
  REFEREE_BALL(19),
  /**
   * <code>ATTACK_HOME = 20;</code>
   */
  ATTACK_HOME(20),
  /**
   * <code>ATTACK_AWAY = 21;</code>
   */
  ATTACK_AWAY(21),
  /**
   * <code>DANGER = 22;</code>
   */
  DANGER(22),
  /**
   * <code>DANGER_AWAY = 23;</code>
   */
  DANGER_AWAY(23),
  /**
   * <code>DANGER_HOME = 24;</code>
   */
  DANGER_HOME(24),
  /**
   * <code>DANGEROUS_ATTACK_AWAY = 25;</code>
   */
  DANGEROUS_ATTACK_AWAY(25),
  /**
   * <code>DANGEROUS_ATTACK_HOME = 26;</code>
   */
  DANGEROUS_ATTACK_HOME(26),
  /**
   * <code>DANGEROUS_FREE_KICK_AWAY = 27;</code>
   */
  DANGEROUS_FREE_KICK_AWAY(27),
  /**
   * <code>DANGEROUS_FREE_KICK_HOME = 28;</code>
   */
  DANGEROUS_FREE_KICK_HOME(28),
  /**
   * <code>SAFE = 29;</code>
   */
  SAFE(29),
  /**
   * <code>SAFE_AWAY = 30;</code>
   */
  SAFE_AWAY(30),
  /**
   * <code>SAFE_HOME = 31;</code>
   */
  SAFE_HOME(31),
  /**
   * <code>SHOT_ON_TARGET_AWAY = 32;</code>
   */
  SHOT_ON_TARGET_AWAY(32),
  /**
   * <code>SHOT_ON_TARGET_HOME = 33;</code>
   */
  SHOT_ON_TARGET_HOME(33),
  /**
   * <code>SHOT_OFF_TARGET_AWAY = 34;</code>
   */
  SHOT_OFF_TARGET_AWAY(34),
  /**
   * <code>SHOT_OFF_TARGET_HOME = 35;</code>
   */
  SHOT_OFF_TARGET_HOME(35),
  /**
   * <code>SHOT_WOODWORK_AWAY = 36;</code>
   */
  SHOT_WOODWORK_AWAY(36),
  /**
   * <code>SHOT_WOODWORK_HOME = 37;</code>
   */
  SHOT_WOODWORK_HOME(37),
  /**
   * <code>SHOT_BLOCKED_AWAY = 38;</code>
   */
  SHOT_BLOCKED_AWAY(38),
  /**
   * <code>SHOT_BLOCKED_HOME = 39;</code>
   */
  SHOT_BLOCKED_HOME(39),
  /**
   * <code>THROW_IN_AWAY = 40;</code>
   */
  THROW_IN_AWAY(40),
  /**
   * <code>THROW_IN_HOME = 41;</code>
   */
  THROW_IN_HOME(41),
  /**
   * <code>FREE_KICK_AWAY = 42;</code>
   */
  FREE_KICK_AWAY(42),
  /**
   * <code>FREE_KICK_HOME = 43;</code>
   */
  FREE_KICK_HOME(43),
  /**
   * <code>FOUL_AWAY = 44;</code>
   */
  FOUL_AWAY(44),
  /**
   * <code>FOUL_HOME = 45;</code>
   */
  FOUL_HOME(45),
  /**
   * <code>OFFSIDE_AWAY = 46;</code>
   */
  OFFSIDE_AWAY(46),
  /**
   * <code>OFFSIDE_HOME = 47;</code>
   */
  OFFSIDE_HOME(47),
  /**
   * <code>KICK_OFF_AWAY = 48;</code>
   */
  KICK_OFF_AWAY(48),
  /**
   * <code>KICK_OFF_HOME = 49;</code>
   */
  KICK_OFF_HOME(49),
  /**
   * <code>GOAL_KICK_AWAY = 50;</code>
   */
  GOAL_KICK_AWAY(50),
  /**
   * <code>GOAL_KICK_HOME = 51;</code>
   */
  GOAL_KICK_HOME(51),
  /**
   * <code>BREAKAWAY_AWAY = 52;</code>
   */
  BREAKAWAY_AWAY(52),
  /**
   * <code>BREAKAWAY_HOME = 53;</code>
   */
  BREAKAWAY_HOME(53),
  /**
   * <code>BALL_POSITION = 54;</code>
   */
  BALL_POSITION(54),
  /**
   * <code>NO_FREE_KICK = 55;</code>
   */
  NO_FREE_KICK(55),
  /**
   * <code>NO_THROW_IN = 56;</code>
   */
  NO_THROW_IN(56),
  /**
   * <code>CORNER_HOME = 57;</code>
   */
  CORNER_HOME(57),
  /**
   * <code>CORNER_AWAY = 58;</code>
   */
  CORNER_AWAY(58),
  /**
   * <code>CANCEL_CORNER_HOME = 59;</code>
   */
  CANCEL_CORNER_HOME(59),
  /**
   * <code>CANCEL_CORNER_AWAY = 60;</code>
   */
  CANCEL_CORNER_AWAY(60),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>UNKNOWN_WIDGET_EVENT = 0;</code>
   */
  public static final int UNKNOWN_WIDGET_EVENT_VALUE = 0;
  /**
   * <code>PLAYERS_COMING_OUT = 1;</code>
   */
  public static final int PLAYERS_COMING_OUT_VALUE = 1;
  /**
   * <code>PLAYERS_LINED_UP = 2;</code>
   */
  public static final int PLAYERS_LINED_UP_VALUE = 2;
  /**
   * <code>NATIONAL_ANTHEM_SINGING = 3;</code>
   */
  public static final int NATIONAL_ANTHEM_SINGING_VALUE = 3;
  /**
   * <code>SHAKE_HANDS = 4;</code>
   */
  public static final int SHAKE_HANDS_VALUE = 4;
  /**
   * <code>FLIP_COIN = 5;</code>
   */
  public static final int FLIP_COIN_VALUE = 5;
  /**
   * <code>MINUTE_SILENCE = 6;</code>
   */
  public static final int MINUTE_SILENCE_VALUE = 6;
  /**
   * <code>PRICE_GIVING_CEREMONY = 7;</code>
   */
  public static final int PRICE_GIVING_CEREMONY_VALUE = 7;
  /**
   * <code>PHOTO_TAKING = 8;</code>
   */
  public static final int PHOTO_TAKING_VALUE = 8;
  /**
   * <code>JERSEY_CHANGED = 9;</code>
   */
  public static final int JERSEY_CHANGED_VALUE = 9;
  /**
   * <code>FORMATION_CHANGED = 10;</code>
   */
  public static final int FORMATION_CHANGED_VALUE = 10;
  /**
   * <code>GAME_ABOUT_TO_START = 11;</code>
   */
  public static final int GAME_ABOUT_TO_START_VALUE = 11;
  /**
   * <code>RESTART_GAME = 12;</code>
   */
  public static final int RESTART_GAME_VALUE = 12;
  /**
   * <code>INJURY_BREAK = 13;</code>
   */
  public static final int INJURY_BREAK_VALUE = 13;
  /**
   * <code>PLAYER_INJURED_AWAY = 14;</code>
   */
  public static final int PLAYER_INJURED_AWAY_VALUE = 14;
  /**
   * <code>PLAYER_INJURED_HOME = 15;</code>
   */
  public static final int PLAYER_INJURED_HOME_VALUE = 15;
  /**
   * <code>NEXT_PENALTY_HOME = 16;</code>
   */
  public static final int NEXT_PENALTY_HOME_VALUE = 16;
  /**
   * <code>NEXT_PENALTY_AWAY = 17;</code>
   */
  public static final int NEXT_PENALTY_AWAY_VALUE = 17;
  /**
   * <code>NEXT_PENALTY_SCORER = 18;</code>
   */
  public static final int NEXT_PENALTY_SCORER_VALUE = 18;
  /**
   * <code>REFEREE_BALL = 19;</code>
   */
  public static final int REFEREE_BALL_VALUE = 19;
  /**
   * <code>ATTACK_HOME = 20;</code>
   */
  public static final int ATTACK_HOME_VALUE = 20;
  /**
   * <code>ATTACK_AWAY = 21;</code>
   */
  public static final int ATTACK_AWAY_VALUE = 21;
  /**
   * <code>DANGER = 22;</code>
   */
  public static final int DANGER_VALUE = 22;
  /**
   * <code>DANGER_AWAY = 23;</code>
   */
  public static final int DANGER_AWAY_VALUE = 23;
  /**
   * <code>DANGER_HOME = 24;</code>
   */
  public static final int DANGER_HOME_VALUE = 24;
  /**
   * <code>DANGEROUS_ATTACK_AWAY = 25;</code>
   */
  public static final int DANGEROUS_ATTACK_AWAY_VALUE = 25;
  /**
   * <code>DANGEROUS_ATTACK_HOME = 26;</code>
   */
  public static final int DANGEROUS_ATTACK_HOME_VALUE = 26;
  /**
   * <code>DANGEROUS_FREE_KICK_AWAY = 27;</code>
   */
  public static final int DANGEROUS_FREE_KICK_AWAY_VALUE = 27;
  /**
   * <code>DANGEROUS_FREE_KICK_HOME = 28;</code>
   */
  public static final int DANGEROUS_FREE_KICK_HOME_VALUE = 28;
  /**
   * <code>SAFE = 29;</code>
   */
  public static final int SAFE_VALUE = 29;
  /**
   * <code>SAFE_AWAY = 30;</code>
   */
  public static final int SAFE_AWAY_VALUE = 30;
  /**
   * <code>SAFE_HOME = 31;</code>
   */
  public static final int SAFE_HOME_VALUE = 31;
  /**
   * <code>SHOT_ON_TARGET_AWAY = 32;</code>
   */
  public static final int SHOT_ON_TARGET_AWAY_VALUE = 32;
  /**
   * <code>SHOT_ON_TARGET_HOME = 33;</code>
   */
  public static final int SHOT_ON_TARGET_HOME_VALUE = 33;
  /**
   * <code>SHOT_OFF_TARGET_AWAY = 34;</code>
   */
  public static final int SHOT_OFF_TARGET_AWAY_VALUE = 34;
  /**
   * <code>SHOT_OFF_TARGET_HOME = 35;</code>
   */
  public static final int SHOT_OFF_TARGET_HOME_VALUE = 35;
  /**
   * <code>SHOT_WOODWORK_AWAY = 36;</code>
   */
  public static final int SHOT_WOODWORK_AWAY_VALUE = 36;
  /**
   * <code>SHOT_WOODWORK_HOME = 37;</code>
   */
  public static final int SHOT_WOODWORK_HOME_VALUE = 37;
  /**
   * <code>SHOT_BLOCKED_AWAY = 38;</code>
   */
  public static final int SHOT_BLOCKED_AWAY_VALUE = 38;
  /**
   * <code>SHOT_BLOCKED_HOME = 39;</code>
   */
  public static final int SHOT_BLOCKED_HOME_VALUE = 39;
  /**
   * <code>THROW_IN_AWAY = 40;</code>
   */
  public static final int THROW_IN_AWAY_VALUE = 40;
  /**
   * <code>THROW_IN_HOME = 41;</code>
   */
  public static final int THROW_IN_HOME_VALUE = 41;
  /**
   * <code>FREE_KICK_AWAY = 42;</code>
   */
  public static final int FREE_KICK_AWAY_VALUE = 42;
  /**
   * <code>FREE_KICK_HOME = 43;</code>
   */
  public static final int FREE_KICK_HOME_VALUE = 43;
  /**
   * <code>FOUL_AWAY = 44;</code>
   */
  public static final int FOUL_AWAY_VALUE = 44;
  /**
   * <code>FOUL_HOME = 45;</code>
   */
  public static final int FOUL_HOME_VALUE = 45;
  /**
   * <code>OFFSIDE_AWAY = 46;</code>
   */
  public static final int OFFSIDE_AWAY_VALUE = 46;
  /**
   * <code>OFFSIDE_HOME = 47;</code>
   */
  public static final int OFFSIDE_HOME_VALUE = 47;
  /**
   * <code>KICK_OFF_AWAY = 48;</code>
   */
  public static final int KICK_OFF_AWAY_VALUE = 48;
  /**
   * <code>KICK_OFF_HOME = 49;</code>
   */
  public static final int KICK_OFF_HOME_VALUE = 49;
  /**
   * <code>GOAL_KICK_AWAY = 50;</code>
   */
  public static final int GOAL_KICK_AWAY_VALUE = 50;
  /**
   * <code>GOAL_KICK_HOME = 51;</code>
   */
  public static final int GOAL_KICK_HOME_VALUE = 51;
  /**
   * <code>BREAKAWAY_AWAY = 52;</code>
   */
  public static final int BREAKAWAY_AWAY_VALUE = 52;
  /**
   * <code>BREAKAWAY_HOME = 53;</code>
   */
  public static final int BREAKAWAY_HOME_VALUE = 53;
  /**
   * <code>BALL_POSITION = 54;</code>
   */
  public static final int BALL_POSITION_VALUE = 54;
  /**
   * <code>NO_FREE_KICK = 55;</code>
   */
  public static final int NO_FREE_KICK_VALUE = 55;
  /**
   * <code>NO_THROW_IN = 56;</code>
   */
  public static final int NO_THROW_IN_VALUE = 56;
  /**
   * <code>CORNER_HOME = 57;</code>
   */
  public static final int CORNER_HOME_VALUE = 57;
  /**
   * <code>CORNER_AWAY = 58;</code>
   */
  public static final int CORNER_AWAY_VALUE = 58;
  /**
   * <code>CANCEL_CORNER_HOME = 59;</code>
   */
  public static final int CANCEL_CORNER_HOME_VALUE = 59;
  /**
   * <code>CANCEL_CORNER_AWAY = 60;</code>
   */
  public static final int CANCEL_CORNER_AWAY_VALUE = 60;


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
  public static WidgetEventType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WidgetEventType forNumber(int value) {
    switch (value) {
      case 0: return UNKNOWN_WIDGET_EVENT;
      case 1: return PLAYERS_COMING_OUT;
      case 2: return PLAYERS_LINED_UP;
      case 3: return NATIONAL_ANTHEM_SINGING;
      case 4: return SHAKE_HANDS;
      case 5: return FLIP_COIN;
      case 6: return MINUTE_SILENCE;
      case 7: return PRICE_GIVING_CEREMONY;
      case 8: return PHOTO_TAKING;
      case 9: return JERSEY_CHANGED;
      case 10: return FORMATION_CHANGED;
      case 11: return GAME_ABOUT_TO_START;
      case 12: return RESTART_GAME;
      case 13: return INJURY_BREAK;
      case 14: return PLAYER_INJURED_AWAY;
      case 15: return PLAYER_INJURED_HOME;
      case 16: return NEXT_PENALTY_HOME;
      case 17: return NEXT_PENALTY_AWAY;
      case 18: return NEXT_PENALTY_SCORER;
      case 19: return REFEREE_BALL;
      case 20: return ATTACK_HOME;
      case 21: return ATTACK_AWAY;
      case 22: return DANGER;
      case 23: return DANGER_AWAY;
      case 24: return DANGER_HOME;
      case 25: return DANGEROUS_ATTACK_AWAY;
      case 26: return DANGEROUS_ATTACK_HOME;
      case 27: return DANGEROUS_FREE_KICK_AWAY;
      case 28: return DANGEROUS_FREE_KICK_HOME;
      case 29: return SAFE;
      case 30: return SAFE_AWAY;
      case 31: return SAFE_HOME;
      case 32: return SHOT_ON_TARGET_AWAY;
      case 33: return SHOT_ON_TARGET_HOME;
      case 34: return SHOT_OFF_TARGET_AWAY;
      case 35: return SHOT_OFF_TARGET_HOME;
      case 36: return SHOT_WOODWORK_AWAY;
      case 37: return SHOT_WOODWORK_HOME;
      case 38: return SHOT_BLOCKED_AWAY;
      case 39: return SHOT_BLOCKED_HOME;
      case 40: return THROW_IN_AWAY;
      case 41: return THROW_IN_HOME;
      case 42: return FREE_KICK_AWAY;
      case 43: return FREE_KICK_HOME;
      case 44: return FOUL_AWAY;
      case 45: return FOUL_HOME;
      case 46: return OFFSIDE_AWAY;
      case 47: return OFFSIDE_HOME;
      case 48: return KICK_OFF_AWAY;
      case 49: return KICK_OFF_HOME;
      case 50: return GOAL_KICK_AWAY;
      case 51: return GOAL_KICK_HOME;
      case 52: return BREAKAWAY_AWAY;
      case 53: return BREAKAWAY_HOME;
      case 54: return BALL_POSITION;
      case 55: return NO_FREE_KICK;
      case 56: return NO_THROW_IN;
      case 57: return CORNER_HOME;
      case 58: return CORNER_AWAY;
      case 59: return CANCEL_CORNER_HOME;
      case 60: return CANCEL_CORNER_AWAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WidgetEventType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      WidgetEventType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<WidgetEventType>() {
          public WidgetEventType findValueByNumber(int number) {
            return WidgetEventType.forNumber(number);
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
    return com.sts.rpclib.Enums.getDescriptor().getEnumTypes().get(23);
  }

  private static final WidgetEventType[] VALUES = values();

  public static WidgetEventType valueOf(
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

  private WidgetEventType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.WidgetEventType)
}

