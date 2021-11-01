package com.m1ue0.joquempo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void selecionadoPedra (View view){

        this.opcaoSelecionada("Pedra");

    }

    public void selecionadoPapel (View view){

        this.opcaoSelecionada("Papel");

    }

    public void selecionadoTesoura (View view){

        this.opcaoSelecionada("Tesoura");

    }

    public void opcaoSelecionada (String opcaoSelecionada){
        ImageView imagResultado = findViewById(R.id.imageResultado);

        TextView textoresultado = findViewById(R.id.Resultado);
        int numero = new Random().nextInt(3);
        String [] opcoes = {"Pedra", "Papel", "Tesoura"};

        String  opcoesJogo = opcoes[numero];

        switch ( opcoesJogo){
            case "Pedra":
                imagResultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imagResultado.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imagResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        if(

                        (opcoesJogo == "Tesoura" && opcaoSelecionada =="Papel") ||
                        (opcoesJogo == "Papel" && opcaoSelecionada =="Pedra") ||
                        (opcoesJogo == "Pedra" && opcaoSelecionada =="Tesoura")


        ){
            textoresultado.setText("Você Perdeu");
        }else if (

                        (opcaoSelecionada == "Tesoura" && opcoesJogo =="Papel") ||
                        (opcaoSelecionada == "Papel" && opcoesJogo =="Pedra") ||
                        (opcaoSelecionada == "Pedra" && opcoesJogo =="Tesoura")

        ){

            textoresultado.setText("Você Ganhou");
        }else{
            textoresultado.setText("Empate");
        }
        System.out.println(numero);
    }

}