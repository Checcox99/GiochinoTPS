package com.progetto.amici.giochinotps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PlayersActivity extends AppCompatActivity {

    Button play;
    EditText player1;
    EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players);

        play = (Button) findViewById(R.id.button_play);
        player1 = (EditText) findViewById(R.id.EditText_1);
        player2 = (EditText) findViewById(R.id.EditText_2);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String p1 = player1.getText().toString();
                String p2 = player2.getText().toString();
                Intent next = new Intent(PlayersActivity.this, PVPActivity.class);
                next.putExtra("player1", p1);
                next.putExtra("player2", p2);
                startActivity(next);
            }
        });
    }
}
