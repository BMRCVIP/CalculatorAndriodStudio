package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import  android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText primeraEntrada, segundaEntrada;
    private TextView txtv1, txtv2;
    private RadioButton rbs1, rbr2, rbd3, rbm4;
    private RadioGroup rg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        primeraEntrada=(EditText)findViewById(R.id.txt_primervalor);
        segundaEntrada=(EditText)findViewById(R.id.txt_segundovalor);
        txtv1=(TextView) findViewById(R.id.textView);
        rbs1=(RadioButton)findViewById(R.id.btn_sumar);
        rbr2=(RadioButton)findViewById(R.id.btn_restar);
        rbd3=(RadioButton)findViewById(R.id.btn_division);
        rbm4=(RadioButton)findViewById(R.id.btn_multiplicacion);
        txtv2= findViewById(R.id.textView2);
        rg1= (RadioGroup)findViewById(R.id.RDG);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (rbs1.isChecked()){
                    txtv2.setText("SUMA");
                }
                if (rbr2.isChecked()){
                    txtv2.setText("RESTA");
                }
                if (rbd3.isChecked()){
                    txtv2.setText("DIVISION");
                }
                if (rbm4.isChecked()){
                    txtv2.setText("MULTIPLICACIÓN");
                }
            }
        });
    }
    public void Calcular(View view){
        String primerValor_String =primeraEntrada.getText().toString();
        String segundoValor_String =segundaEntrada.getText().toString();
        double primerValor_int =Double.parseDouble(primerValor_String);
        double segundoValor_int =Double.parseDouble(segundoValor_String);
        if(rbs1.isChecked()==true){
            double suma= primerValor_int+segundoValor_int;
            String resultado = String.valueOf(suma);
            txtv1.setText(resultado);
        } else if(rbr2.isChecked()==true){
            double resta= primerValor_int-segundoValor_int;
            String resultado = String.valueOf(resta);
            txtv1.setText(resultado);
        } else if(rbd3.isChecked()==true){
            double divicion= primerValor_int/segundoValor_int;
            String resultado = String.valueOf(divicion);
            txtv1.setText(resultado);
        } else if(rbm4.isChecked()==true){
            double multi= primerValor_int*segundoValor_int;
            String resultado = String.valueOf(multi);
            txtv1.setText(resultado);
        }
    }
}