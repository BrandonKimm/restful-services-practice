package com.example.myrestfulservices.user;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;

//@JsonIgnoreProperties(value={"password", "ssn"})
//@JsonFilter("UserInfo")

@Data
@AllArgsConstructor
@ApiModel(description = "사용자 상세 정보를 위한체 도메인 객체")
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min=2, message="이름은 2글자 이상 입력해주세요.")
    @ApiModelProperty(notes = "사용자 이름을 입력해 주세요")
    private String name;

    @Past
    private Date joinDate;

    //@JsonIgnore
    private String password;

    //@JsonIgnore
    private String ssn;
}
