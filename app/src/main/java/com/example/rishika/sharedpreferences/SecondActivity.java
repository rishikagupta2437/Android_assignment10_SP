package com.example.rishika.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

        TextView text1, text2, text3;
    SharedPreferences sharedPreferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreferences=getSharedPreferences("myPrefs", Context.MODE_PRIVATE);

        Log.i("name",""+sharedPreferences.getString("userName","Default"));

        text1 = (TextView)findViewById(R.id.textView6);
        text2 = (TextView)findViewById(R.id.textView3);
        text3 = (TextView)findViewById(R.id.textView7);

       if(sharedPreferences.contains("userName")) {
            text1.setText(sharedPreferences.getString("userName", "Default"));
    }
        if (sharedPreferences.contains("PhoneNo")) {
            text2.setText(sharedPreferences.getString("PhoneNo", "Default"));
       }
       if(sharedPreferences.contains("Email")) {
            text3.setText(sharedPreferences.getString("Email","Default"));

        Toast.makeText(SecondActivity.this, "Details Saved", Toast.LENGTH_SHORT).show();
        }
    }
}
