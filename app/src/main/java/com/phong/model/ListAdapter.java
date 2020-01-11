package com.phong.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayList;

import com.phong.btrl_listdatabinding.R;
import com.phong.btrl_listdatabinding.databinding.ItemBinding;

public class ListAdapter extends BaseAdapter {
    private ObservableArrayList<Contact> list;
    private LayoutInflater inflater;
    public ListAdapter(ObservableArrayList<Contact> list){
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null){
            inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        ItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.item,viewGroup,false);
        binding.setInfo(list.get(i));
        return binding.getRoot();
    }
}
