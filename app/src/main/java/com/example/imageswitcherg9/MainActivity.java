package com.example.imageswitcherg9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {
    ImageSwitcher imgsw;
    Button sage,reyna;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                                   WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);

        imgsw = findViewById(R.id.imgsw);
        sage = findViewById(R.id.btnSage);
        reyna = findViewById(R.id.btnReyna);

        imgsw.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return imageView;
            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsw.setImageResource(R.drawable.sage);
            }
        });
        reyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imgsw.setImageResource(R.drawable.reyna);
            }
        });
    }
}