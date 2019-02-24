package com.example.cardquizgame;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;

public class RegisterAcitivity extends AppCompatActivity {
    TextView g1;
    TextView g2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_acitivity);
        g1 = (TextView)findViewById(R.id.editText3);
        g2 = (TextView)findViewById(R.id.editText4);
    }

    public void enterApp(View view)
    { //check if first and last name have more than 3 and less than 30 characters
       if(g1.length() < 3 || g1.length() > 30)
       {
           g1.setText("Please enter name more than 3 characters and less than 30");
       }
       else if(g2.length() < 3 || g2.length() > 30)
       {
           g2.setText("Please enter name more than 3 characters and less than 30");
       }
       else
       {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
       }

    }

}
