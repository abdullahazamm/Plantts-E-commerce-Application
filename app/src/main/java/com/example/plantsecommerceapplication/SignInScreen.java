package com.example.plantsecommerceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SignInScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in_screen);

        Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
startActivity(new Intent(SignInScreen.this,MainActivity.class));
                }
            },3000);
    }
}