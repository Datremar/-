package com.company;

public class Note {

    private String secName;
    private String number;


    public Note(String secName, String number) {
        setSecName(secName);
        setNumber(number);
    }


    public void showMeWatchaGot() {
        System.out.println(getSecName() + ", " + getNumber() + ";");
    }

    public void delete() {
        setNumber("");
        setSecName("");
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
