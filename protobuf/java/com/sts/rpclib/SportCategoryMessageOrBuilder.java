// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: categories.proto

package com.sts.rpclib;

public interface SportCategoryMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.sts.rpclib.SportCategoryMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string season = 1;</code>
   * @return The season.
   */
  java.lang.String getSeason();
  /**
   * <code>string season = 1;</code>
   * @return The bytes for season.
   */
  com.google.protobuf.ByteString
      getSeasonBytes();

  /**
   * <code>.com.sts.rpclib.Sport sport = 2;</code>
   * @return The enum numeric value on the wire for sport.
   */
  int getSportValue();
  /**
   * <code>.com.sts.rpclib.Sport sport = 2;</code>
   * @return The sport.
   */
  com.sts.rpclib.Sport getSport();

  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  java.util.List<com.sts.rpclib.CategoryMessage> 
      getCategoryList();
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  com.sts.rpclib.CategoryMessage getCategory(int index);
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  int getCategoryCount();
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  java.util.List<? extends com.sts.rpclib.CategoryMessageOrBuilder> 
      getCategoryOrBuilderList();
  /**
   * <code>repeated .com.sts.rpclib.CategoryMessage category = 3;</code>
   */
  com.sts.rpclib.CategoryMessageOrBuilder getCategoryOrBuilder(
      int index);
}