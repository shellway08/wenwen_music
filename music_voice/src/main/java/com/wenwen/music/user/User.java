package com.wenwen.music.user;

import com.wenwen.music.model.BaseModel;

/**
 * 用户数据协议
 */
public class User extends BaseModel {
  public int ecode;
  public String emsg;
  public UserContent data;
}