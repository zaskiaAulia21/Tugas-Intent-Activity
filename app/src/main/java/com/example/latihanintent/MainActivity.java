package com.example.latihanintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnBuka1, btnBuka2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnBuka1 = (Button) findViewById(R.id.btnBuka1);
        btnBuka2 = (Button) findViewById(R.id.btnBuka2);

        btnBuka1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaAct1 = new Intent(getApplicationContext(), SatuActivity.class);
                startActivity(BukaAct1);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnBuka2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Buka2();

            }
        });
    }

    public void Buka2(){
        Intent BukaAct2 = new Intent(getApplicationContext(), DuaActivity.class);
        startActivity(BukaAct2);
    }
}