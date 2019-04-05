package com.example.a26142404.sistemasalario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private Button btn_mostrarSalario;
    private RadioGroup rb_group;
    private EditText txt_salario;

    Intent i = new Intent(this, Tela2.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mostrarSalario = findViewById(R.id.btn_mostrarSalario);
        rb_group = findViewById(R.id.rb_group);
        txt_salario = findViewById(R.id.txt_salario);
    }

    public void calcSalario(View v){
        double salario = Double.parseDouble(txt_salario.getText().toString());
        double resultado;

        switch (rb_group.getCheckedRadioButtonId()){
            case R.id.rb1:
                resultado = salario*40/100;
                i.putExtra("resultado", resultado);
                startActivity(i);
                break;
            case R.id.rb2:
                resultado = salario*45/100;
                i.putExtra("resultado", resultado);
                startActivity(i);
                break;
            case R.id.rb3:
                resultado = salario*50/100;
                i.putExtra("resultado", resultado);
                startActivity(i);
                break;
        }
    }
}
