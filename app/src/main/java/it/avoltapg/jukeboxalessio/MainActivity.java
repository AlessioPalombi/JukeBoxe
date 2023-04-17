package it.avoltapg.jukeboxalessio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    final String TAG="Main Activity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        int num = random.nextInt(10)+1;

        Button btnSuccessivo= findViewById(R.id.btnSuccessivo);
        btnSuccessivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(), MainActivity2.class);
              intent.putExtra("numero", num);
                startActivity(intent);
            }
        });

       // int numero = bundle.getInit(key "Numero")
        Log.d(TAG, "onClick");
    }





}