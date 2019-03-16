package com.example.eje2_labo2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.i1);
        img2 = findViewById(R.id.i2);
        img3 = findViewById(R.id.i3);
        img4 = findViewById(R.id.i4);
        img5 = findViewById(R.id.i5);
        img6 = findViewById(R.id.i6);
        img7 = findViewById(R.id.i7);
        img8 = findViewById(R.id.i8);
        img9 = findViewById(R.id.i9);

        final int drawables[] = {R.drawable.img1, R.drawable.img2, R.drawable.img3};

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img1.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img2.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img3.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img4.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img5.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img6.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img7.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img8.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                img9.setImageResource(drawables[r.nextInt(3 - 0)]);
            }
        });
    }
}