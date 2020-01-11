package com.phong.model;

import android.widget.ListView;

import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableArrayList;

public class ListBinder {
    @BindingAdapter("bind:item")
    public static void bindList(ListView listView, ObservableArrayList<Contact> list){
        ListAdapter adapter = new ListAdapter(list);
        listView.setAdapter(adapter);
    }
}
