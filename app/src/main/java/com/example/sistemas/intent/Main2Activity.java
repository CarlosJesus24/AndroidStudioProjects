package com.example.sistemas.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView xtv1, xtv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        xtv1 = findViewById(R.id.tv1);
        xtv2 = findViewById(R.id.tv2);
        String xdato1 = getIntent().getStringExtra("Dato1");
        String xdato2 = getIntent().getStringExtra("Dato2");
        xtv1.setText(xdato1);
        xtv2.setText(xdato2);
    }

    public void  Retorno(View view){
        Intent intento =new Intent(this,MainActivity.class);
        startActivity(intento);

    }
}
