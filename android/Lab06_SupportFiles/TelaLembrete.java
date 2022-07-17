package com.example.intentssql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.intentssql.data.DataBaseHandler;
import com.example.intentssql.model.UsuarioLembrete;

public class TelaLembrete extends AppCompatActivity {
    private TextView nomeUsuario;
    private TextView lembretesSalvos;
    private Button botaoSalvar;
    private DataBaseHandler db;
    private String nomeChave;
    private EditText lembreteParaSalvar;
    private CheckBox dropCheck;


    public CheckBox getDropCheck() {
        return dropCheck;
    }

    public void setDropCheck(CheckBox dropCheck) {
        this.dropCheck = dropCheck;
    }

    public EditText getLembreteParaSalvar() {
        return lembreteParaSalvar;
    }

    public void setLembreteParaSalvar(EditText lembreteParaSalvar) {
        this.lembreteParaSalvar = lembreteParaSalvar;
    }

    public TextView getLembretesSalvos() {
        return lembretesSalvos;
    }

    public void setLembretesSalvos(TextView lembretesSalvos) {
        this.lembretesSalvos = lembretesSalvos;
    }

    public String getNomeChave() {
        return nomeChave;
    }

    public void setNomeChave(String nomeChave) {
        this.nomeChave = nomeChave;
    }

    public Button getBotaoSalvar() {
        return botaoSalvar;
    }

    public void setBotaoSalvar(Button botaoSalvar) {
        this.botaoSalvar = botaoSalvar;
    }

    public TextView getNomeUsuario() {
        return this.nomeUsuario;
    }

    public void setNomeUsuario(TextView nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }


    public void salvarLembrete(View v) {

        if (this.getDropCheck().isChecked()) {
            db.dropDB();
            db.criarTabela();
            this.finish(); //volta para a tela anterior!
        } else {
            UsuarioLembrete lembrete = new UsuarioLembrete();
            lembrete.setNomeCompleto(this.getNomeChave());
            lembrete.setLembrete(this.getLembreteParaSalvar().getText().toString() + "\n");
            db.addLembrete(lembrete);
            this.atualizaCaixaTexto();
        }

    }

    private void atualizaCaixaTexto() {
        String resposta = db.getLembretes(this.getNomeChave());
        this.getLembretesSalvos().setText(resposta);
    }


}
