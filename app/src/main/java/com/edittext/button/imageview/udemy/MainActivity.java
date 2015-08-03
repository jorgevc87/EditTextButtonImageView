package com.edittext.button.imageview.udemy;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    private Button btnCalcular;
    private EditText edtNombre;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        edtNombre = (EditText) findViewById(R.id.edtNombre);
        txtResultado = (TextView) findViewById(R.id.txtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResultado.setText("Hola, " + edtNombre.getText().toString().trim()+" como estas?");
            }
        });

    }
}
