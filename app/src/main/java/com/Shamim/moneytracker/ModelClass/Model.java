package com.Shamim.moneytracker.ModelClass;

import java.io.Serializable;

public class Model implements Serializable {

    private  int ID;
    private  String Amount;
    private  String Column2;
    private  String Column3;
    private  String Column4;
    private  String Note;
    private  byte[] Image;
    private  String Type;
    private  String Month;
    private  String Year;

    public Model(int id,String amount, String column2, String column3, String column4, String note, byte[] image, String type,String month,String year) {
        ID=id;
        Amount = amount;
        Column2 = column2;
        Column3 = column3;
        Column4 = column4;
        Note = note;
        Image = image;
        Type = type;
        Month=month;
        Year=year;
    }

    public int getID() {
        return ID;
    }
    public String getAmount() {
        return Amount;
    }

    public String getColumn2() {
        return Column2;
    }

    public String getColumn3() {
        return Column3;
    }

    public String getColumn4() {
        return Column4;
    }

    public String getNote() {
        return Note;
    }

    public byte[] getImage() {
        return Image;
    }

    public String getType() {
        return Type;
    }

    public String getMonth() {
        return Month;
    }

    public String getYear() {
        return Year;
    }
}
