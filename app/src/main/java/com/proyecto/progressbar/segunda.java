package com.proyecto.progressbar;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class segunda extends AppCompatActivity {

    ImageView imagen;
    RatingBar rati;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        imagen= findViewById(R.id.imageView);
        rati= findViewById(R.id.ratingBar);
        txt= findViewById(R.id.txt);

        rati.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                txt.setText("camping el encanto: ");
                Toast.makeText(segunda.this, "valoracion: " + v, Toast.LENGTH_LONG).show();
            }
        });

    }





}
