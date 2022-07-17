package com.example.contacliquematheus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botaoIncrementa;
    private TextView displayValor;
    private TextView valueIncrementa;
    private int acumulador;


    /*
            Getters and Setters
     */
    public Button getBotaoIncrementa()
    {
        return botaoIncrementa;
    }

    public void setBotaoIncrementa(Button botaoIncrementa)
    {
        this.botaoIncrementa = botaoIncrementa;
    }

    public TextView getDisplayValor()
    {
        return displayValor;
    }

    public void setDisplayValor(TextView displayValor)
    {
        this.displayValor = displayValor;
    }

    public int getAcumulador()
    {
        return acumulador;
    }

    public void setAcumulador(int acumulador)
    {
        this.acumulador = acumulador;
    }

    public TextView getValueIncrementa() {
        return valueIncrementa;
    }

    public void setValueIncrementa(TextView valueIncrementa) {
        this.valueIncrementa = valueIncrementa;
    }

    /************************************************/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setBotaoIncrementa(findViewById(R.id.botaoIncrementa));
        this.setDisplayValor(findViewById(R.id.displayValorAcumulado));
        this.setValueIncrementa(findViewById(R.id.valorIncrementa));

        this.setAcumulador(10000);
        this.getDisplayValor().setText(String.valueOf(this.getAcumulador()));

    }

    public void incrementaValor(View view)
    {
        if(this.getValueIncrementa().getText().length() == 0)
        {
            this.getValueIncrementa().setError("Campo Vazio");
        }
        else
        {
            if(this.getAcumulador() > 30000)
            {
                //Avaliar porque aparece o erro
                this.getBotaoIncrementa().setBackgroundColor(R.color.black);
                this.setAcumulador(this.getAcumulador() + Integer.parseInt(String.valueOf(this.getValueIncrementa().getText())));
                this.getDisplayValor().setText(String.valueOf(this.getAcumulador()));
            }
            else
            {
                this.setAcumulador(this.getAcumulador() + Integer.parseInt(String.valueOf(this.getValueIncrementa().getText())));
                this.getDisplayValor().setText(String.valueOf(this.getAcumulador()));
            }

        }

    }

}