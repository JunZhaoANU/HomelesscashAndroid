package com.example.mac.homelesscash;

import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import top.androidman.SuperButton;

public class TY extends AppCompatActivity {
    TextView text_DR;
    SuperButton btMoney;
    String Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ty);

        Intent intent = getIntent();
        btMoney = (SuperButton)findViewById(R.id.donated_money);
        btMoney.setText(intent.getStringExtra("data"));
        Name = getIntent().getStringExtra("Name");

        text_DR = (TextView)findViewById(R.id.DR_TEXT);
        text_DR.setText("Donate Regularly To "+Name);
        text_DR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(TY.this, DR.class );
                startActivity(intent1);
            }
        });
    }

    @Override
    public void onBackPressed() {

        // Put your own code here which you want to run on back button click.

        Intent intent2 = new Intent(TY.this,HomePage.class);
        startActivity(intent2);

        super.onBackPressed();
    }


}
