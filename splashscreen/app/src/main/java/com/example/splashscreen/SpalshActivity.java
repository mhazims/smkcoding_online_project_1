package com.example.splashscreen;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;

public class SpalshActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spalsh);
        Thread thread = new Thread(){
            public void run() {
                try{
                    sleep(2000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(SpalshActivity.this, MainActivity.class));
                }

            }
        };
        thread.start();
    }
}
