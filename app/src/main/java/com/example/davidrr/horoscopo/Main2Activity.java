package com.example.davidrr.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView nom;
    Button btnf;
    Button btnz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nom=(TextView) findViewById(R.id.nombre);
        Bundle bundle=getIntent().getExtras();
        nom.setText(bundle.getString("nombre"));
        btnf=(Button)findViewById(R.id.button2);
        btnz=(Button)findViewById(R.id.button3);

        btnf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f= new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(f);
            }
        });

        btnz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent z= new Intent(Main2Activity.this,Main4Activity.class);
                startActivity(z);
            }
        });
    }
}
