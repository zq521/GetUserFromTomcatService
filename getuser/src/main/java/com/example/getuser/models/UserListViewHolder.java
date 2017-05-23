package com.example.getuser.models;

import android.widget.TextView;

/**
 * Created by zhaoqiang on 2017/5/23.
 */

public class UserListViewHolder {
    private TextView tv_username,tv_description;

    public UserListViewHolder(TextView tv_username, TextView tv_description) {
        this.tv_username = tv_username;
        this.tv_description = tv_description;
    }

    public TextView getTv_description() {
        return tv_description;
    }

    public TextView getTv_username() {
        return tv_username;
    }
}
