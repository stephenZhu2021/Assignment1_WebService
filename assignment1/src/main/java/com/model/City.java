package com.model;

public class City {
    private String name;
    private String province;

    public City() {
    }

    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
