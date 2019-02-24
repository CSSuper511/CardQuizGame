package com.example.cardquizgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;

public class CredentialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credentials);

    }

    public void enterApp(View view)  //go to main page
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}
