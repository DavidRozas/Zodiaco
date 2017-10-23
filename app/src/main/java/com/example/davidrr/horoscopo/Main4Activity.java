package com.example.davidrr.horoscopo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {
    Button button4,button5,button6,button7,button8,button9,
          button10,button11,button12,button13,button14,button15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button10=(Button)findViewById(R.id.button10);
        button11=(Button)findViewById(R.id.button11);
        button12=(Button)findViewById(R.id.button12);
        button13=(Button)findViewById(R.id.button13);
        button14=(Button)findViewById(R.id.button14);
        button15=(Button)findViewById(R.id.button15);




        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a=new Intent(Main4Activity.this,Main5Activity.class);
                a.putExtra("signo","Acuario");
                startActivity(a);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b=new Intent(Main4Activity.this,Main5Activity.class);
                b.putExtra("signo","Piscis");
                startActivity(b);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c=new Intent(Main4Activity.this,Main5Activity.class);
                c.putExtra("signo","Aries");
                startActivity(c);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d=new Intent(Main4Activity.this,Main5Activity.class);
                d.putExtra("signo","Tauro");
                startActivity(d);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f=new Intent(Main4Activity.this,Main5Activity.class);
                f.putExtra("signo","Geminis");
                startActivity(f);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g=new Intent(Main4Activity.this,Main5Activity.class);
                g.putExtra("signo","Cancer");
                startActivity(g);
            }
        });
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent h = new Intent(Main4Activity.this, Main5Activity.class);
                h.putExtra("signo", "Leo");
                startActivity(h);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this,Main5Activity.class);
                i.putExtra("signo","Virgo");
                startActivity(i);
            }
        });
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Main4Activity.this,Main5Activity.class);
                j.putExtra("signo","Libra");
                startActivity(j);
            }
        });
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k=new Intent(Main4Activity.this,Main5Activity.class);
                k.putExtra("signo","Escorpio");
                startActivity(k);
            }
        });
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(Main4Activity.this,Main5Activity.class);
                l.putExtra("signo","Sagitario");
                startActivity(l);
            }
        });
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(Main4Activity.this,Main5Activity.class);
                m.putExtra("signo","Capricornio");
                startActivity(m);
            }
        });

    }
}
