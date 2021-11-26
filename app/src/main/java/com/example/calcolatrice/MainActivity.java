package com.example.calcolatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNumber1;
    EditText edtNumber2;
    Button btnSomma;
    Button btnSottrazione;
    TextView txtRis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = findViewById(R.id.edtNumber1);
        edtNumber2 = findViewById(R.id.edtNumber2);
        txtRis = findViewById(R.id.txtRis);
        btnSomma = findViewById(R.id.btnSomma);
        btnSottrazione = findViewById(R.id.btnSottrazione);
    }

    public void Operation(View v)
    {
        if(edtNumber1.getText().toString().equals("") || edtNumber2.getText().toString().equals(""))
        {
            txtRis.setText("Campo vuoto, inserisci un valore");
        }
        else
        {
            int a = Integer.parseInt(edtNumber1.getText().toString());
            int b = Integer.parseInt(edtNumber2.getText().toString());
            int viewId = v.getId();
            int result = 0;

            switch(viewId){

                case R.id.btnSomma: result = a + b; break;
                case R.id.btnSottrazione: result = a - b; break;

            }

            txtRis.setText("Il risultato è: "+ result);
        }
    }
}