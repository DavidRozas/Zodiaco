package com.example.davidrr.horoscopo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main3Activity extends AppCompatActivity {
    Spinner dias,mes;
    Button boton;
    String dia;
    String meses;
    int diaseleccionado;
    String signo;
    String fecha;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        dias=(Spinner)findViewById(R.id.spinner);
        mes=(Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.combo_dias,android.R.layout.simple_spinner_item);
        ArrayAdapter<CharSequence> adapter1= ArrayAdapter.createFromResource(this,R.array.combo_mes,android.R.layout.simple_spinner_item);
        dias.setAdapter(adapter);
        mes.setAdapter(adapter1);

        boton=(Button)findViewById(R.id.button16);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dia=dias.getSelectedItem().toString();
                meses=mes.getSelectedItem().toString();
                diaseleccionado= Integer.parseInt(dia);
                switch (meses){
                    case "Enero":
                        if(diaseleccionado<20){
                            signo ="Capricornio";
                        }
                        else{
                            signo="Acuario";
                        }
                        break;
                    case "Febrero":
                        if(diaseleccionado<18){
                            signo ="Acuario";
                        }
                        else{
                            signo="Piscis";
                        }
                        break;
                    case "Marzo":
                        if(diaseleccionado<20){
                            signo ="Piscis";
                        }
                        else{
                            signo="Aries";
                        }
                        break;
                    case "Abril":
                        if(diaseleccionado<21){
                            signo ="Aries";
                        }
                        else{
                            signo="Tauro";
                        }
                        break;
                    case "Mayo":
                        if(diaseleccionado<21){
                            signo ="Tauro";
                        }
                        else{
                            signo="Geminis";
                        }
                        break;
                    case "Junio":
                        if(diaseleccionado<21){
                            signo ="Geminis";
                        }
                        else{
                            signo="Cancer";
                        }
                        break;
                    case "Julio":
                        if(diaseleccionado<21){
                            signo ="Cancer";
                        }
                        else{
                            signo="Leo";
                        }
                        break;
                    case "Agosto":
                        if(diaseleccionado<22){
                            signo ="Leo";
                        }
                        else{
                            signo="Virgo";
                        }
                        break;
                    case "Septiembre":
                        if(diaseleccionado<23){
                            signo ="Virgo";
                        }
                        else{
                            signo="Libra";
                        }
                        break;
                    case "Octubre":
                        if(diaseleccionado<23){
                            signo ="Libra";
                        }
                        else{
                            signo="Escorpio";
                        }
                        break;
                    case "Noviembre":
                        if(diaseleccionado<23){
                            signo ="Escorpio";
                        }
                        else{
                            signo="Sagitario";
                        }
                        break;
                    case "Diciembre":
                        if(diaseleccionado<21){
                            signo ="Sagitario";
                        }
                        else{
                            signo="Capricornio";
                        }
                        break;
                }
                fecha = "" +dia +" / "+ meses ;
                Intent b=new Intent(Main3Activity.this,Main5Activity.class);
                b.putExtra("signo",signo.toString());
                b.putExtra("fecha",fecha);
                startActivity(b);
            }
        });


    }
}
