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
        Toast.makeText(this, String.format(getString(R.string.button_message)) + " " + String.valueOf(view.getTag()) + " " + String.format(getString(R.string.button_message_sub)), Toast.LENGTH_SHORT).show();
    }
}