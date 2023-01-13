package com.mri.pojo;

import lombok.Builder;
import lombok.Getter;

@Builder(setterPrefix = "set")
@Getter
public class Employee {

    private String fname;
    private String lname;
    private int id;

}
