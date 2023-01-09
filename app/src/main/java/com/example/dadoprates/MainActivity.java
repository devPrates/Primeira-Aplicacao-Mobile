package com.example.dadoprates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btnJogar;
    TextView txtResul;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnJogar = findViewById(R.id.btnJogar);
        btnJogar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                jogar();
            }

        });
    }
    private void jogar(){
        int resultado = new Random().nextInt(6)+1;
        txtResul = findViewById(R.id.txtResul);
        txtResul.setText("O numero sorteado foi: "+ resultado);
        img = findViewById(R.id.img);

        switch (resultado){
            case 1:
                img.setImageResource(R.drawable.d6_1);
                break;
            case 2:
                img.setImageResource(R.drawable.d6_2);
                break;
            case 3:
                img.setImageResource(R.drawable.d6_3);
                break;
            case 4:
                img.setImageResource(R.drawable.d6_4);
                break;
            case 5:
                img.setImageResource(R.drawable.d6_5);
                break;
            case 6:
                img.setImageResource(R.drawable.d6_6);
                break;
        }

    }

}