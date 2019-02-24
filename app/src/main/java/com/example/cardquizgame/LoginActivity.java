package com.example.cardquizgame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void loginApp(View view)  //go to loginpage
    {
        Intent intent = new Intent(this, CredentialsActivity.class);
        startActivity(intent);
    }

    public void registerApp(View view)  // go to register page
    {
        Intent intent = new Intent(this, RegisterAcitivity.class);
        startActivity(intent);
    }
}
