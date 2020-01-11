package com.phong.model;

import android.view.View;

import androidx.databinding.ObservableArrayList;

import java.util.Random;

public class ContactInforList {
    public ObservableArrayList<Contact> list = new ObservableArrayList<>();
    private int totalContact = 500;
    Random random = new Random();
    public ContactInforList(){
        for (int i = 0; i < totalContact; i ++){
            Contact c = new Contact();
            String ten = "Tên " + i;
            String phone ="098";
            for (int p = 0; p < 7;p ++){
                phone += random.nextInt(10);
            }
            c.setName(ten);
            c.setPhone(phone);
            add(c);
        }
    }
    private void add(Contact c){
        list.add(c);
    }
    public void add(View view){
        String ten = "Tên " + (++totalContact);
        String phone ="098";
        for (int p = 0; p < 7;p ++){
            phone += random.nextInt(10);
        }
        Contact c = new Contact();
        c.setName(ten);
        c.setPhone(phone);
        add(c);
    }
    public void remove(View view){
        if (!list.isEmpty())
        {
            list.remove(0);
        }
    }
}
