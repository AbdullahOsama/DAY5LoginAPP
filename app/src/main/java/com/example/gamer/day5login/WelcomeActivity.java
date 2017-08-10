package com.example.gamer.day5login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    TextView myUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent = getIntent();
        String USERname = intent.getStringExtra(HomeActivity.mystring);
        myUserName = (TextView)findViewById(R.id.weluser);
        myUserName.setText(USERname);
    }
}
