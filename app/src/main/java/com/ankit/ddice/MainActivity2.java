package com.ankit.ddice;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    public Button btn2;
    private ImageView img2,img3;
    private TextView txt,txt2;
    private Button button;
    public Random myrandom =new Random();


    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img2 =findViewById(R.id.imageView);
        img3 =findViewById(R.id.imageView2);
        txt = findViewById(R.id.textView2);
        txt2 = findViewById(R.id.textView3);
        button= findViewById(R.id.button2);
        
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myRan = myrandom.nextInt(6)+1; 
                int myRan2 = myrandom.nextInt(6)+1;
                switch (myRan){
                    case 1:
                        img2.setImageResource(R.drawable.dice1);
                        txt.setText("one");
                        break;
                    case 2:
                        img2.setImageResource(R.drawable.dice2);
                        txt.setText("two");
                        break;
                    case 3:
                        img2.setImageResource(R.drawable.dice3);
                        txt.setText("three");
                        break;
                    case 4:
                        img2.setImageResource(R.drawable.dice4);
                        txt.setText("four");
                        break;
                    case 5:
                        img2.setImageResource(R.drawable.dice5);
                        txt.setText("five");
                        break;
                    case 6:
                        img2.setImageResource(R.drawable.dice6);
                        txt.setText("six");
                        break;

                }

                switch (myRan2) {
                    case 1:
                        img3.setImageResource(R.drawable.dice1);
                        txt2.setText("one");
                        break;
                    case 2:
                        img3.setImageResource(R.drawable.dice2);
                        txt2.setText("two");
                        break;
                    case 3:
                        img3.setImageResource(R.drawable.dice3);
                        txt2.setText("three");
                        break;
                    case 4:
                        img3.setImageResource(R.drawable.dice4);
                        txt2.setText("four");
                        break;
                    case 5:
                        img3.setImageResource(R.drawable.dice5);
                        txt2.setText("five");
                        break;
                    case 6:
                        img3.setImageResource(R.drawable.dice6);
                        txt2.setText("six");
                        break;
                }
                
            }
        });








        btn2 =findViewById(R.id.button3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity2.this, "if you want to exit perss back buton minimum 3 times",Toast.LENGTH_SHORT).show();
                Intent intent =new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}