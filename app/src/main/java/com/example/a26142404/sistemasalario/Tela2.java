package com.example.a26142404.sistemasalario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    private TextView resultado;
    private Button btn_voltar;

    Intent i = getIntent();
    Intent c = new Intent(this, MainActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        resultado = findViewById(R.id.resultado);
        btn_voltar = findViewById(R.id.btn_voltar);

        Bundle dados = getIntent().getExtras();​
        String resposta = dados.getString("resultado");

        resultado.setText("Seu novo salario é: " + resposta);
    }

    public void voltar(View v){
        startActivity(c);
    }
}
