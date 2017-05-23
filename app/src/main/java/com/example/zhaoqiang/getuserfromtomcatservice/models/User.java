package com.example.zhaoqiang.getuserfromtomcatservice.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhaoqiang on 2017/5/22.
 */
public class User extends AbstractModel {

    private String name;
    private int age;
    private String gender;

    public User(JSONObject jsonObject) {
        super(jsonObject);
    }

    public User() {

    }

    public User(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public User(String json) throws JSONException {
        super(json);
    }

    public String getName() {
        try {
            return getJsonObject().getString("name");
        } catch (JSONException e) {
            return null;
        }
    }

    public void setName(String name) {
        try {
            getJsonObject().put("name", name);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取用户名，如果没有该字段，则返回-1
     *
     * @return
     */
    public int getAge() {
        try {
            return getJsonObject().getInt("age");
        } catch (JSONException e) {
            return -1;
        }
    }

    public void setAge(int age) {
        try {
            getJsonObject().put("age", age);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public String getGender() {
        try {
            return getJsonObject().getString("gender");
        } catch (JSONException e) {
            return null;
        }
    }

    public void setGender(String gender) {
        try {
            getJsonObject().put("gender", gender);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
