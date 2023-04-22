package com.violet_ve;

import lombok.Builder;
import lombok.Data;
import lombok.extern.java.Log;

import java.util.Date;

@Log
@Data
@Builder
public class User {
    private Integer Id;
    private String Name;
    private String Sex;
    private String Password;
    private Date Birthday;

    int getAge(){
        Date currentDate = new Date();
        long days = (currentDate.getTime()-Birthday.getTime())*1000*60*60*24;
        return (int)(days/365);
    }

}
