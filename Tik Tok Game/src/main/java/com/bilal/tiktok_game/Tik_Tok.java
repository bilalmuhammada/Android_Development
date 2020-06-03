package com.bilal.tiktok_game;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Tik_Tok extends AppCompatActivity implements View.OnClickListener {
    String start = "X";
    private int x= 0;
    private int y=0;
     TextView v,v1;
     Button b,b1,b2,b3,b4,b5,b6,b7,b8,b9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tik__tok);
        v= (TextView)findViewById(R.id.t4);
        v1= (TextView)findViewById(R.id.t5);
        b=(Button)findViewById(R.id.b4);
        b1=(Button)findViewById(R.id.b5);
        b2=(Button)findViewById(R.id.b);



        b3=(Button)findViewById(R.id.b2);
        b4=(Button)findViewById(R.id.b3);
        b5=(Button)findViewById(R.id.b6);

        b6=(Button)findViewById(R.id.b8);
        b7=(Button)findViewById(R.id.b9);
        b8=(Button)findViewById(R.id.b10);
        b9=(Button)findViewById(R.id.b11);

        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        v.setText(String.valueOf(x));
        v1.setText(String.valueOf(y));

    }
    public void chooseplay()
    {
        if(start.equalsIgnoreCase("X"))
        {
            start="0";

        }
        else {


            start="X";
        }


    }
    public void wingame()
    {
        String s1= b.getText().toString();
        String s2= b1.getText().toString();
        String s3= b2.getText().toString();

        String s4= b3.getText().toString();
        String s5= b4.getText().toString();
        String s6= b5.getText().toString();

        String s7= b6.getText().toString();
        String s8= b7.getText().toString();
        String s9= b8.getText().toString();
        if(s1.equals("X")&& s2.equals("X") && s3.equals("X")){

            Toast.makeText(this,"win game of Player X" ,Toast.LENGTH_LONG).show();
             b.setBackgroundColor(Color.GRAY);
            b1.setBackgroundColor(Color.GRAY);
            b2.setBackgroundColor(Color.GRAY);

              x++;

            v.setText(String.valueOf(x));
              // b.setBackground(R.id.homeAsUp);
//            b1.setBackgroundColor(Integer.parseInt(null));
//            b2.setBackgroundColor(Integer.parseInt(null));




    }
        else if(s7.equals("0")&& s8.equals("0") && s9.equals("0")){

            Toast.makeText(this,"win game of Player 0" ,Toast.LENGTH_LONG).show();
            b.setBackgroundColor(Color.TRANSPARENT);
            b1.setBackgroundColor(Color.TRANSPARENT);
            b2.setBackgroundColor(Color.TRANSPARENT);

            y++;

            v1.setText(String.valueOf(y));




        }
        else if(s1.equals("X")&& s5.equals("X") && s9.equals("X")){

            Toast.makeText(this,"win game of Player X" ,Toast.LENGTH_LONG).show();
            b.setBackgroundColor(Color.GRAY);
            b1.setBackgroundColor(Color.GRAY);
            b2.setBackgroundColor(Color.GRAY);

            x++;

            v.setText(String.valueOf(x));



        }
        else if(s3.equals("0")&& s5.equals("0") && s7.equals("0")){

            Toast.makeText(this,"win game of Player 0" ,Toast.LENGTH_LONG).show();
            b.setBackgroundColor(Color.TRANSPARENT);
            b1.setBackgroundColor(Color.TRANSPARENT);
            b2.setBackgroundColor(Color.TRANSPARENT);

            y++;

            v1.setText(String.valueOf(y));



        }



    }

    @Override
    public void onClick(View v) {
        int i=v.getId();
        if(i==R.id.b4) {
            b.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b.setTextColor(Color.GREEN);

            }
            else {


                b.setTextColor(Color.RED);
            }
               chooseplay();
               wingame();



        }
        else if(i==R.id.b5) {
            b1.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b1.setTextColor(Color.GREEN);

            }
            else {


                b1.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b) {
            b2.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b2.setTextColor(Color.GREEN);

            }
            else {


                b2.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b2) {
            b3.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b3.setTextColor(Color.GREEN);

            }
            else {


                b3.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b3) {
            b4.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b4.setTextColor(Color.GREEN);

            }
            else {


                b4.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b6) {
            b5.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b5.setTextColor(Color.GREEN);

            }
            else {


                b5.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b8) {
            b6.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b6.setTextColor(Color.GREEN);

            }
            else {


                b6.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b9) {
            b7.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b7.setTextColor(Color.GREEN);

            }
            else {


                b7.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b10) {
            b8.setText(start);
            if(start.equalsIgnoreCase("X"))
            {

                b8.setTextColor(Color.GREEN);

            }
            else {


                b8.setTextColor(Color.RED);
            }
            chooseplay();
            wingame();



        }
        else if(i==R.id.b11)
        {
            b.setText("");
            b1.setText("");
            b2.setText("");
            b3.setText("");
            b4.setText("");
            b5.setText("");
            b6.setText("");
            b7.setText("");
            b8.setText("");


        }//score();
    }
}
