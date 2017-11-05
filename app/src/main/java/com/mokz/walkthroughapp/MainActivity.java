package com.mokz.walkthroughapp;

//import android.content.SharedPreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.support.v7.widget.Toolbar;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //    boolean firstStart;
    Button btn_Repetir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Repetir = (Button) findViewById(R.id.btn_play_again);

        btn_Repetir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // We normally won't show the welcome slider again in real app
                // but this is for testing
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // make first time launch TRUE
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();
            }
        });

//        findViewById(R.id.btn_play_again).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // We normally won't show the welcome slider again in real app
//                // but this is for testing
//                PrefManager prefManager = new PrefManager(getApplicationContext());
//
//                // make first time launch TRUE
//                prefManager.setFirstTimeLaunch(true);
//
//                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
//                finish();
//            }
//        });

       /* SharedPreferences settings = getSharedPreferences("PREFS",0);
        firstStart = settings.getBoolean("first_time_start",true);

        if (firstStart) {
            SharedPreferences.Editor editor = settings.edit();
            editor.putBoolean("first_time_start",false);
            editor.commit();

            Toast.makeText(this,"Ojala funcione :'v", Toast.LENGTH_LONG).show();
        }*/
    }
}

