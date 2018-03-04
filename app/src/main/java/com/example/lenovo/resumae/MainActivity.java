package com.example.lenovo.resumae;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAbout(View view) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(getBaseContext(),About.class);
                startActivity(in);

            }
        };
        Thread th=new Thread(runnable);
        th.start();
    }

    public void buttonEdu(View view)
    {
        Intent in=new Intent(this,Edu_proj.class);
        startActivity(in);
    }
    public void buttonskill(View view)
    {
        Intent in=new Intent(this,Skill.class);
        startActivity(in);
    }
    public void buttongit(View view)
    {
            Intent browser=new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Akhilagp"));
            startActivity(browser);
     }
    public void buttonlinkedin(View view)
    {
        Intent browser=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/akhila-padmanaban-143702153"));
        startActivity(browser);
    }
    public void buttonfb(View view)
    {
        Intent browser=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/akhila.padmanabhan.90"));
        startActivity(browser);
    }
}
