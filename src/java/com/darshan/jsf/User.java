package com.darshan.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Darshan Patel
 */
@ManagedBean
@SessionScoped
public class User {

    private String name;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void check() {
        if ("".equals(name)) {
            msg = "Plz enter user name";
        } else if ("java".equals(name)) {
            msg = "Valid User";
        } else {
            msg = "Invalid User..Plz try again";
        }
    }

    public String sayHello() {
        //check if null?
        if ("".equals(name) || name == null) {
            return "";
        } else {
            return "Ajax message : Welcome " + name;
        }
    }

}
