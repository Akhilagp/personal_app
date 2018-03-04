package com.example.lenovo.resumae;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class About extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void openezhu(View view)
    {
        Runnable runnable=new Runnable(){
            @Override
            public void run() {
                Intent browser=new Intent(Intent.ACTION_VIEW, Uri.parse("https://ezhuthanithepioneer.wordpress.com"));
                startActivity(browser);
            }
        };
        Thread t=new Thread(runnable);
        t.start();

    }

};






