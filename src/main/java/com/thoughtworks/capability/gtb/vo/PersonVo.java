package com.thoughtworks.capability.gtb.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonVo {

  public PersonVo(String id, Integer age, String name, String hobby) {
    this.id = id;
    this.age = age;
    this.name = name;
    this.hobby = hobby;

    if(age == null){
      this.age = 0;
    }
  }

  private String id;

  private Integer age ;
  private String name;
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private String hobby;
}