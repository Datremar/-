package com.company;

public class Person {

    private int code;
    private String name;
    private boolean gender;
    private float height;


    public static float avgHeight(Person[] people) {
        float result = 0;
        int k = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].getGender()) {
                result += people[i].getHeight();
                k++;
            }
        }

        result /= k;

        return result;
    }


    //  SETTERS AND GETTERS //

    public void setCode(int code){
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getCode() {
        return this.code;
    }
    public String getName() {
        return this.name;
    }
    public boolean getGender() {
        return this.gender;
    }
    public float getHeight() {
        return this.height;
    }

}
