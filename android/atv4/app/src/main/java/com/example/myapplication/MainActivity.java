package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView displayTexto;
    private Button botaoClica;

    public TextView getDisplayTexto() {
        return displayTexto;
    }

    public void setDisplayTexto(TextView displayTexto) {
        this.displayTexto = displayTexto;
    }

    public Button getBotaoClica() {
        return botaoClica;
    }

    public void setBotaoClica(Button botaoClica) {
        this.botaoClica = botaoClica;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setDisplayTexto(findViewById(R.id.textInicial));
        this.setBotaoClica(findViewById(R.id.botaoInicial));

    }

    public void clicaBotao(View view){
        this.getDisplayTexto().setText("Clicou botao");
    }

    protected void onStart(){
        super.onStart();
        Log.d("Cycle", "onStart");
        Toast.makeText(MainActivity.this, "onStart() called",
            Toast.LENGTH_SHORT)
            .show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Cycle", "onResume");
        Toast.makeText(MainActivity.this, "onResume() called",
                Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Cycle", "onPause");
        Toast.makeText(MainActivity.this, "onPause() called",
                        Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Cycle", "onStop");
        Toast.makeText(MainActivity.this, "onStop() called",
                        Toast.LENGTH_SHORT)
                .show();
    }
}