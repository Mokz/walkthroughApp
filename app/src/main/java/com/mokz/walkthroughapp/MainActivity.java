package com.mokz.walkthroughapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button btn_Repetir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Repetir = (Button) findViewById(R.id.btn_play_again);

        btn_Repetir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Para ejecutar varias veces el walkthrough
                PrefManager prefManager = new PrefManager(getApplicationContext());

                // le da TRUE la primera vez que lo ejecuta
                prefManager.setFirstTimeLaunch(true);

                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                finish();
            }
        });

    }
}

