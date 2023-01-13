package com.mri.excel;

import com.creditdatamw.zerocell.annotation.Column;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class TestData {


    @Column(name = "testRunId", index = 0)
    private String testRunId;
    @Column(name = "testCaseId", index = 1)
    private String testCaseId;


    @Column(name = "testCaseName", index = 2)
    private String testCaseName;

}
