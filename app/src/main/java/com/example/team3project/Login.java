package com.example.team3project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText usuario,senha;
    Button btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);



    }
    public void clicarBotao (View view){

        if(usuario.getText().toString().equals("Alu") && senha.getText().toString().equals("1234"))
            startActivity(new Intent(Login.this,MainActivity.class));
        if(usuario.getText().toString().equals("professor") && senha.getText().toString().equals("1234"))
            startActivity(new Intent(Login.this,TelaProfessor.class));

        else
            Toast.makeText(this,"Usuario ou senha invalidos",Toast.LENGTH_SHORT).show();


    }
}