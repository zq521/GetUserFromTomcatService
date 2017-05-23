package com.example.getuser;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.getuser.models.User;
import com.example.getuser.models.UserListViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaoqiang on 2017/5/23.
 */

public class UserListAdapter extends BaseAdapter {

    private List<User> users = new ArrayList<>();
    private Context context;

    public UserListAdapter(Context context) {
        this.context = context;
    }

    public void add(User user) {
        users.add(user);
        notifyDataSetChanged();
    }

    public Context getContext() {
        return context;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public User getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_list_item, null);
            convertView.setTag(new UserListViewHolder((TextView) convertView.findViewById(R.id.tv_username), (TextView) convertView.findViewById(R.id.tv_description)));

        }

        UserListViewHolder holder = (UserListViewHolder) convertView.getTag();
        User user = getItem(position);

        holder.getTv_username().setText(String.format("名字:%s", user.getName()));
        holder.getTv_description().setText(String.format("年龄:%d,性别:%s", user.getAge(), user.getGender()));

        return convertView;
    }


}
