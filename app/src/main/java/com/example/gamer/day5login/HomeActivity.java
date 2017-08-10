package com.example.gamer.day5login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomeActivity extends AppCompatActivity {

    private EditText username,password;
    private Button log;
    public static final String mystring = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username = (EditText)findViewById(R.id.Username);
        password = (EditText)findViewById(R.id.Password);
        log = (Button)findViewById(R.id.loginbt);
    }
    public void Onclick(View view)
    {
        String uname = username.getText().toString();
        Intent myintent = new Intent(this,WelcomeActivity.class);
        myintent.putExtra(mystring,uname);
        startActivity(myintent);
    }
}
