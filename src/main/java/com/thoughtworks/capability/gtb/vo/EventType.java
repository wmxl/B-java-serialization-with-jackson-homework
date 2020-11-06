package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EventType {
  UPLOAD("U"), DOWNLOAD("D");

  private String code;

  EventType(String code) {
    this.code = code;
  }

//  这个不写也可以，写了可以自定义一些东西
//  @JsonCreator
//  public static EventType from(String code) {
//    for (EventType et : values()) {
//      if (et.code.equals(code)) {
//        return et;
//      }
//    }
//    return null;
//  }

  @JsonValue
  public String getValue() {
    return code;
  }
}