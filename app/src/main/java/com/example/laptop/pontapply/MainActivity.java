package com.example.laptop.pontapply;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;

    private Typeface typeface1,typeface2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView1 = findViewById(R.id.firstTextId);
        textView2 = findViewById(R.id.secondTextId);





        typeface2 = Typeface.createFromAsset(getAssets(),"font/youmurdererbb_reg.ttf");

        textView2.setTypeface(typeface2);


        typeface1 = Typeface.createFromAsset(getAssets(),"font/raleway_semibold.ttf");

        textView1.setTypeface(typeface1);


    }
}
