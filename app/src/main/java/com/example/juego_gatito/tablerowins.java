package com.example.juego_gatito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tablerowins extends AppCompatActivity {
    Button btnRegresar;

    TextView wins1;
    TextView wins2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablerowins);
        Bundle p1w= getIntent().getExtras();
        int w1=p1w.getInt("P1Wins");
        int w2=p1w.getInt("P2Wins");
        wins1=findViewById(R.id.winsP1);
        wins2=findViewById(R.id.winsP2);
        wins1.setText(String.valueOf(w1));
        wins2.setText(String.valueOf(w2));
        btnRegresar=findViewById(R.id.Regresar);
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}