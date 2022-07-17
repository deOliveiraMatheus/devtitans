package com.example.lembretematheus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView user;
    private Button enter;

    public TextView getUser() {
        return user;
    }

    public void setUser(TextView user) {
        this.user = user;
    }

    public Button getEnter() {
        return enter;
    }

    public void setEnter(Button enter) {
        this.enter = enter;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Associando os elementos do layout as variaveis
        setEnter(findViewById(R.id.botaoEntrar));
        setUser(findViewById(R.id.caixaNome));
    }

    public void entrarApp(View view)
    {
        Intent nextActivity = new Intent(MainActivity.this, TelaLembrete.class);
        nextActivity.putExtra("nomeUsuario", getUser().getText().toString());
        startActivity(nextActivity);
    }
}