package com.phong.btrl_listdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.phong.btrl_listdatabinding.databinding.ActivityMainBinding;
import com.phong.model.Contact;
import com.phong.model.ContactInforList;
import com.phong.model.ListHeading;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        ListHeading heading = new ListHeading("Danh sách Contact");
        binding.setHeading(heading);
        ContactInforList infos = new ContactInforList();
        binding.setInfos(infos);
    }
}
