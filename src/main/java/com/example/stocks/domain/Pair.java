package com.example.stocks.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pair {
//    @JsonSerialize(as = Date.class)
////    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
   // @DateTimeFormat(pattern="dd/MM/yyyy")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date name;
    private Float value;

   public Pair(){}

    public Pair(Date name, Float value) {
        this.name = name;
        this.value = value;
    }
    public Pair(String name, String value) throws ParseException {
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(name);
        this.name =date1 ;
        this.value = Float.parseFloat(value);
    }
  // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date getName() {
        return name;
    }

    public void setName(Date name) {
        this.name = name;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");

        return "Pair{" +

                "name=" + name +
                ", value=" + value +

                '}';
    }
}
