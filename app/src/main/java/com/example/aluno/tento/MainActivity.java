package com.example.aluno.tento;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textNome1;
    private TextView textNome2;
    private EditText editTento1;
    private EditText editTento2;
    private TextView textValor1;
    private TextView textValor2;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textNome1 = (TextView) findViewById(R.id.textNome1);
        textNome2 = (TextView) findViewById(R.id.textNome2);
        editTento1 = (EditText) findViewById(R.id.editTento1);
        editTento2 = (EditText) findViewById(R.id.editTento2);
        textValor1 = (TextView) findViewById(R.id.textValor1);
        textValor2 = (TextView) findViewById(R.id.textValor2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int valor1 = Integer.parseInt(textValor1.getText().toString());
                    if (valor1<12){
                        valor1++;
                        textValor1.setText(""+valor1);
                    }else if(valor1>=12){
                        Toast.makeText(MainActivity.this, "Seu time ganhou o jogo!", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Ocorreu um erro, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textValor1.setText("0");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Ocorreu um erro, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int valor2 = Integer.parseInt(textValor2.getText().toString());
                    if (valor2<12){
                        valor2++;
                        textValor2.setText(""+valor2);
                    }else if(valor2>=12){
                        Toast.makeText(MainActivity.this, "Seu time ganhou o jogo!", Toast.LENGTH_SHORT).show();

                    }
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Ocorreu um erro, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    textValor2.setText("0");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Ocorreu um erro, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    editTento1.setText("");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Ocorreu um erro, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    editTento2.setText("");
                }catch (Exception e){
                    Toast.makeText(MainActivity.this, "Ocorreu um erro, tente novamente!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
