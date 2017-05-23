package com.example.zhaoqiang.getuserfromtomcatservice.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by zhaoqiang on 2017/5/22.
 */
public abstract class AbstractModel {

    private JSONObject jsonObject;

    public AbstractModel() {
        jsonObject = new JSONObject();
    }

    public AbstractModel(String json) throws JSONException {
        this.jsonObject = new JSONObject(json);
    }

    public AbstractModel(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public JSONObject getJsonObject() {
        return jsonObject;
    }

    @Override
    public String toString() {
        return getJsonObject().toString();
    }


}
