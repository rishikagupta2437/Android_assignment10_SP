package com.example.rishika.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userName,PassWord,PhoneNo, Email ;
    Button saveButton;
    SharedPreferences sharedPreferences;
    TextView text;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userName = (EditText)findViewById(R.id.editText);
        PassWord = (EditText)findViewById(R.id.editText2);
        PhoneNo = (EditText)findViewById(R.id.editText3);
        Email = (EditText)findViewById(R.id.editText4);

        sharedPreferences=getSharedPreferences("myPrefs", Context.MODE_PRIVATE);


        saveButton = (Button)findViewById(R.id.button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(MainActivity.this, "Save Button Clicked", Toast.LENGTH_SHORT).show();

                String userN =userName.getText().toString();
                String phone = PhoneNo.getText().toString();
                String email = Email.getText().toString();


                sharedPreferences.edit().putString("userName",userN).apply();
                sharedPreferences.edit().putString("PhoneNo",phone).apply();
                sharedPreferences.edit().putString("Email",email).apply();


                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(i);




            }
        });

    }
}
