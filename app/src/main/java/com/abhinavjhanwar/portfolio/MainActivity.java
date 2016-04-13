package com.abhinavjhanwar.portfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Toast.makeText(this, "This button will launch my " + String.valueOf(view.getTag()) + " app!", Toast.LENGTH_SHORT).show();
    }
}