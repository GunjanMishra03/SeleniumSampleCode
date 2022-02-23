package com.Java.PracticePrograms;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import org.testng.annotations.Test;

public class Palindrome{
    String str = "gunjanmishra";
    int len=str.length();
    String rev = "";
    @Test
    void reverse(){
        for(int i= len-1; i >=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
    }





}
