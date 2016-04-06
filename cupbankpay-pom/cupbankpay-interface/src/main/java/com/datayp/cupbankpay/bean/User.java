package com.datayp.cupbankpay.bean;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String number;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [id=");
        builder.append(id);
        builder.append(", number=");
        builder.append(number);
        builder.append(", name=");
        builder.append(name);
        builder.append("]");
        return builder.toString();
    }

}
