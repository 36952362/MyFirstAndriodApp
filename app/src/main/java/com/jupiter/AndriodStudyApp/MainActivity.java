package com.jupiter.andriodstudyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jupiter.andriodstudyapp.gettingstarted.fragmentdemo.FragmentDemoActivity;
import com.jupiter.andriodstudyapp.gettingstarted.interactingwithotherapps.InteractingWithOtherAppsActivity;
import com.jupiter.andriodstudyapp.gettingstarted.launchanotheractivity.LaunchAnotherActivity;
import com.jupiter.andriodstudyapp.gettingstarted.savingdata.SavingDataDemoActivity;
import com.jupiter.andriodstudyapp.buildingappswithcontentsharing.sharingsimpledata.SharingSimpleDataActivity;
import com.jupiter.androidstudyapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onLaunchAnotherActivityDemo(View view) {
        Intent intent = new Intent(this, LaunchAnotherActivity.class);
        startActivity(intent);
    }

    public void onFragmentDemo(View view) {
        Intent intent = new Intent(this, FragmentDemoActivity.class);
        startActivity(intent);
    }

    public void onSavingDataDemo(View view) {
        Intent intent = new Intent(this, SavingDataDemoActivity.class);
        startActivity(intent);
    }

    public void onInteractingWithOtherApps(View view) {
        Intent intent = new Intent(this, InteractingWithOtherAppsActivity.class);
        startActivity(intent);
    }

    public void onSharingSimpleData(View view) {
        Intent intent = new Intent(this, SharingSimpleDataActivity.class);
        startActivity(intent);
    }
}
