package com.example.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText userid;
    EditText userpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userid = findViewById(R.id.userid);
        userpass = findViewById(R.id.userpass);
        Button loginBtn = findViewById(R.id.loginBtn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginProcess(view);
            }
        });
    }
    public void loginProcess(View v){
        String uid = userid.getText().toString();
        String upass = userpass.getText().toString();
        if(uid.equals("soosu") && upass.equals("0713")){
            Toast.makeText(this, " " + uid, Toast.LENGTH_SHORT).show();
        }
        Button imageButton = (Button) findViewById(R.id.loginBtn);
        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}

