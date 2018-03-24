package com.progetto.amici.giochinotps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button pvp;
    Button pvc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pvp = (Button) findViewById(R.id.button_pvp);
        pvc = (Button) findViewById(R.id.button_pvc);

        pvp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, PlayersActivity.class);
                next.putExtra("mode","0");
                startActivity(next);
            }
        });

        pvc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Cooming Soon", Toast.LENGTH_SHORT).show();
                /*Intent next = new Intent(MainActivity.this, PlayersActivity.class);
                next.putExtra("mode","1");
                startActivity(next);*/
            }
        });
    }
}
