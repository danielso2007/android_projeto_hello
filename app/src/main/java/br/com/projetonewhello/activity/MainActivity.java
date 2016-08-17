package br.com.projetonewhello.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edLogin, edSenha;

    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recupera os componentes do XML: activity_main.xml que está dentro do diretório res/layout
        edLogin     = (EditText) findViewById(R.id.edLogin);
        edSenha     = (EditText) findViewById(R.id.edSenha);
        btnEntrar   = (Button) findViewById(R.id.btnEntrar);

        //Registra um evento para o click no componente
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(isValido(edLogin) && isValido(edSenha)) {

                    //Fazer alguma coisa
                    Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private Boolean isValido(EditText ed) {

        Boolean flagRetorno = false;

        if(ed.getText().toString().trim() != null && ed.getText().toString().trim().length() > 0) {

            flagRetorno = true;
        } else {

            ed.setError("Campo Obrigatório");
        }

        return flagRetorno;
    }
}
