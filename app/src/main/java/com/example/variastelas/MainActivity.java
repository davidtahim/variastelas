package com.example.variastelas;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    //Declarar os botões
    Button bt2, bt3;

    //Método para abrir a tela 2
    public void abreTela2() {
        setContentView(R.layout.tela2);
    //Botao para a tela principal
        Button vbtv2 = findViewById(R.id.bt2);
        vbtv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voltaPrincipal();
            }
        });
        //Método para abrir a tela 3
        public void abreTela3() {
            setContentView(R.layout.tela3);
            //Botao para a tela principal
            Button vbtv3 = findViewById(R.id.bt3);
            vbtv2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    voltaPrincipal();
                }
            });
            {
            }
            }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}