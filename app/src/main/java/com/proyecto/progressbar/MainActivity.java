package com.proyecto.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ProgressBar p;
    Button b;
    TextView t;
    Handler h = new Handler();
    boolean isActivo = false;
    int i = 0;
    Intent x;
    ImageView imagen;
    RatingBar rati;
    TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p = (ProgressBar) findViewById(R.id.progressBar);
        b = (Button) findViewById(R.id.button);
        t = (TextView) findViewById(R.id.textView);
        b.setOnClickListener(this);
        imagen = findViewById(R.id.imageView);
        rati = findViewById(R.id.ratingBar);
        txt= findViewById(R.id.txt);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.button) {
            if (!isActivo) {
                Thread hilo = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (i <= 100) {
                            h.post(new Runnable() {
                                @Override
                                public void run() {
                                    t.setText(i + " %");
                                    p.setProgress(i);
                                }
                            });
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            if (i == 100) {

                                x = new Intent(MainActivity.this, segunda.class);
                                startActivity(x);
                            }
                            i++;
                            isActivo = true;
                        }

                    }
                });

                hilo.start();



            }


            };


        }

    }


