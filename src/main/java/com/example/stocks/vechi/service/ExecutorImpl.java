package com.example.stocks.vechi.service;

import java.io.IOException;

public class ExecutorImpl  {
 public  ExecutorImpl(){}


    public static Process execute(String file) throws IOException {
        String s="python C:\\Users\\aalex\\source\\repos\\DataTest\\"+file;
        Process p = Runtime.getRuntime().exec("python C:\\Users\\aalex\\source\\repos\\DataTest\\"+file);
        System.out.println(s);
        return p;
    }
}
