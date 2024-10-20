package com.multi;


import java.util.Objects;

public class CityVO {
    private int ID;
    private String Name;
    private String CountryCode;
    private String District;
    private int Population;

    public CityVO(int getID, String getName, String getCountryCode, String getGetDistrict, int getPopulation) {
    }

    //문제 4-1. 각 필드에 대한 GET/SET/toString메서드를 구현하시오.
    //          단, toString()메서드는 오버라이드하여 구현하고,
    //          모든 필드의 값이 "하나의 String타입"으로 반환되어야 함.

        /***********************************************
     * 구현 코드
     *
     *
     *
     */

    public int getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public String getDistrict() {
        return District;
    }

    public int getPopulation() {
        return Population;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    @Override
    public String toString() {
        return "CityVO{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", District='" + District + '\'' +
                ", Population=" + Population +
                '}';
    }
}