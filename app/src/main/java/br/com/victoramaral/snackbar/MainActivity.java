package br.com.victoramaral.snackbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button buttonSnackbar;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSnackbar = findViewById(R.id.buttonSnackbar);
        textResultado = findViewById(R.id.textResultado);

        buttonSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,
                        "Confirme para realizar a alteração ->",
                        Snackbar.LENGTH_INDEFINITE)
                        .setAction("CONFIRMAR", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                textResultado.setText("Você realizou o teste com sucesso!");
                                textResultado.setVisibility(View.VISIBLE);
                            }
                        }).show();
            }
        });
    }
}
