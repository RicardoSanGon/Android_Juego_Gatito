package com.example.juego_gatito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView Casilla1;
    TextView Casilla2;
    TextView Casilla3;
    TextView Casilla4;
    TextView Casilla5;
    TextView Casilla6;
    TextView Casilla7;
    TextView Casilla8;
    TextView Casilla9;
    TextView Turnos;
    TextView winner;
    Button btnReiniciar;
    TextView winP1;
    TextView winP2;

    Button info;

    int P1wins=0;
    int P2wins=0;
    int NoEmpate=0;


    char [] tablero= {' ',' ',' ',' ',' ',' ',' ',' ',' '};
    static char turno='X';
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Turnos=findViewById(R.id.turno);
        Casilla1=findViewById(R.id.Cas1);
        Casilla2=findViewById(R.id.Cas2);
        Casilla3=findViewById(R.id.Cas3);
        Casilla4=findViewById(R.id.Cas4);
        Casilla5=findViewById(R.id.Cas5);
        Casilla6=findViewById(R.id.Cas6);
        Casilla7=findViewById(R.id.Cas7);
        Casilla8=findViewById(R.id.Cas8);
        Casilla9=findViewById(R.id.Cas9);
        winner=findViewById(R.id.turnoywinner);
        btnReiniciar=findViewById(R.id.ReiniciarJuego);
        winP1=findViewById(R.id.winsP1);
        winP2=findViewById(R.id.winsP2);
        info=findViewById(R.id.btnInfo);

        Casilla1.setOnClickListener(this);
        Casilla2.setOnClickListener(this);
        Casilla3.setOnClickListener(this);
        Casilla4.setOnClickListener(this);
        Casilla5.setOnClickListener(this);
        Casilla6.setOnClickListener(this);
        Casilla7.setOnClickListener(this);
        Casilla8.setOnClickListener(this);
        Casilla9.setOnClickListener(this);
        btnReiniciar.setOnClickListener(this);

        Turnos.setText(Character.toString(turno));

        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,tablerowins.class);
                i.putExtra("P1Wins",P1wins);
                i.putExtra("P2Wins",P2wins);
                startActivity(i);
            }
        });
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.Cas1)
        {
            if(turno=='X')
            {
                tablero[0]=turno;
                Casilla1.setText(Character.toString(turno));
                Casilla1.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[0]=turno;
                Casilla1.setText(Character.toString(turno));
                Casilla1.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla1.setEnabled(false);
            VerificarGanador();
        }
        else if (view.getId()==R.id.Cas2)
        {
            if(turno=='X')
            {
                tablero[1]=turno;
                Casilla2.setText(Character.toString(turno));
                Casilla2.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[1]=turno;
                Casilla2.setText(Character.toString(turno));
                Casilla2.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla2.setEnabled(false);
            VerificarGanador();
        }
        else if (view.getId()==R.id.Cas3)
        {
            if(turno=='X')
            {
                tablero[2]=turno;
                Casilla3.setText(Character.toString(turno));
                Casilla3.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[2]=turno;
                Casilla3.setText(Character.toString(turno));
                Casilla3.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla3.setEnabled(false);
            VerificarGanador();
        }
        else if (view.getId()==R.id.Cas4)
        {
            if(turno=='X')
            {
                tablero[3]=turno;
                Casilla4.setText(Character.toString(turno));
                Casilla4.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[3]=turno;
                Casilla4.setText(Character.toString(turno));
                Casilla4.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla4.setEnabled(false);
            VerificarGanador();
        }
        else if (view.getId()==R.id.Cas5)
        {
            if(turno=='X')
            {
                tablero[4]=turno;
                Casilla5.setText(Character.toString(turno));
                Casilla5.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[4]=turno;
                Casilla5.setText(Character.toString(turno));
                Casilla5.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla5.setEnabled(false);
            VerificarGanador();
        }
        else if (view.getId()==R.id.Cas6)
        {
            if(turno=='X')
            {
                tablero[5]=turno;
                Casilla6.setText(Character.toString(turno));
                Casilla6.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[5]=turno;
                Casilla6.setText(Character.toString(turno));
                Casilla6.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla6.setEnabled(false);
            VerificarGanador();
        }
        else if (view.getId()==R.id.Cas7)
        {
            if(turno=='X')
            {
                tablero[6]=turno;
                Casilla7.setText(Character.toString(turno));
                Casilla7.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[6]=turno;
                Casilla7.setText(Character.toString(turno));
                Casilla7.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla7.setEnabled(false);
            VerificarGanador();
        }
        else if (view.getId()==R.id.Cas8)
        {
            if(turno=='X')
            {
                tablero[7]=turno;
                Casilla8.setText(Character.toString(turno));
                Casilla8.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[7]=turno;
                Casilla8.setText(Character.toString(turno));
                Casilla8.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla8.setEnabled(false);
            VerificarGanador();
        }
        else if(view.getId()==R.id.Cas9)
        {
            if(turno=='X')
            {
                tablero[8]=turno;
                Casilla9.setText(Character.toString(turno));
                Casilla9.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turnx));
                turno='O';
                Turnos.setText(Character.toString(turno));
            }
            else
            {
                tablero[8]=turno;
                Casilla9.setText(Character.toString(turno));
                Casilla9.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_color_turn_o));
                turno='X';
                Turnos.setText(Character.toString(turno));
            }
            Casilla9.setEnabled(false);
            VerificarGanador();
        }
        else
        {
            Turnos.setText("");
            BloquearBotones();
            Reiniciar();
        }
    }

    private void VerificarGanador()
    {
        if(tablero[0]==tablero[1] && tablero[1]==tablero[2] && tablero[0]!=' ' && tablero[1]!=' ' && tablero[2]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[0]);
            NoEmpate=1;
            if(tablero[0]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        else if (tablero[3]==tablero[4] && tablero[4]==tablero[5] && tablero[3]!=' ' && tablero[4]!=' ' && tablero[5]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[3]);
            NoEmpate=1;
            if(tablero[3]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        else if (tablero[6]==tablero[7] && tablero[7]==tablero[8] && tablero[6]!=' ' && tablero[7]!=' ' && tablero[8]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[6]);
            NoEmpate=1;
            if(tablero[6]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        else if (tablero[0]==tablero[3] && tablero[3]==tablero[6] && tablero[0]!=' ' && tablero[3]!=' ' && tablero[6]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[0]);
            NoEmpate=1;
            if(tablero[0]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        else if (tablero[1]==tablero[4] && tablero[4]==tablero[7] && tablero[1]!=' ' && tablero[4]!=' ' && tablero[7]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[1]);
            NoEmpate=1;
            if(tablero[1]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        else if (tablero[2]==tablero[5] && tablero[5]==tablero[8] && tablero[2]!=' ' && tablero[5]!=' ' && tablero[8]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[2]);
            NoEmpate=1;
            if(tablero[2]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        else if (tablero[0]==tablero[4] && tablero[4]==tablero[8] && tablero[0]!=' ' && tablero[4]!=' ' && tablero[8]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[0]);
            NoEmpate=1;
            if(tablero[0]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        else if (tablero[2]==tablero[4] && tablero[4]==tablero[6] && tablero[2]!=' ' && tablero[4]!=' ' && tablero[6]!=' ')
        {
            Turnos.setText("");
            winner.setText("Ganador: "+tablero[2]);
            NoEmpate=1;
            if(tablero[2]=='X') {
                P1wins++;
                winP1.setText(String.valueOf(P1wins));
            }
            else {
                P2wins++;
                winP2.setText(String.valueOf(P2wins));
            }
        }
        Empate();
    }

    private void Empate()
    {
        if(NoEmpate==0)
        {
            if(tablero[0]!=' '&&tablero[1]!=' '&&tablero[2]!=' '&&tablero[3]!=' '&&tablero[4]!=' '&&tablero[5]!=' '&&tablero[6]!=' '&&tablero[7]!=' '&&tablero[8]!=' ')
            {
                Turnos.setText("");
                winner.setText("Empate");
                new CountDownTimer(2000, 1000) {

                    public void onTick(long milisegundos) {
                        winner.setText("Empate");
                    }
                    public void onFinish() {
                        Reiniciar();
                    }
                }.start();
            }
        }
        else
        {
            BloquearBotones();
        }
    }

    private void Reiniciar()
    {

        new CountDownTimer(3000, 1000) {

            public void onTick(long l) {
                winner.setText("Reiniciando: "+l/1000);
            }

            public void onFinish() {
                Casilla1.setText("");
                Casilla2.setText("");
                Casilla3.setText("");
                Casilla4.setText("");
                Casilla5.setText("");
                Casilla6.setText("");
                Casilla7.setText("");
                Casilla8.setText("");
                Casilla9.setText("");

                Casilla1.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla2.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla3.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla4.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla5.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla6.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla7.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla8.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                Casilla9.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_background));
                turno='X';
                for (int i = 0; i <9; i++)
                {
                    tablero[i]=' ';
                }
                Casilla1.setEnabled(true);
                Casilla2.setEnabled(true);
                Casilla3.setEnabled(true);
                Casilla4.setEnabled(true);
                Casilla5.setEnabled(true);
                Casilla6.setEnabled(true);
                Casilla7.setEnabled(true);
                Casilla8.setEnabled(true);
                Casilla9.setEnabled(true);
                winner.setText("Turno: ");
                Turnos.setText(Character.toString(turno));
                NoEmpate=0;
            }
            }.start();
        }

        private void BloquearBotones()
        {
            Casilla1.setEnabled(false);
            Casilla2.setEnabled(false);
            Casilla3.setEnabled(false);
            Casilla4.setEnabled(false);
            Casilla5.setEnabled(false);
            Casilla6.setEnabled(false);
            Casilla7.setEnabled(false);
            Casilla8.setEnabled(false);
            Casilla9.setEnabled(false);
        }


}