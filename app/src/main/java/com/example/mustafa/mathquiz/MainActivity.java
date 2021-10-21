package com.example.mustafa.mathquiz;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public static int position;
    SeekBar seekbar;














    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







        startService(new Intent(MainActivity.this, Main_Music_Service.class));



            position=1;
        seekbar=(SeekBar)findViewById(R.id.seekBar);
        // perform seek bar change listener event used for getting the progress value
        seekbar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {







            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                position = progress;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });





    }









    public  int getposition(){
        return position;
    }

    public void goto_multiplication(View view){
        Intent go_to_multiplication = new Intent(this ,Multiplication.class);
        startActivity(go_to_multiplication);

    }




    public void goto_addition(View view){




            Intent goto_addition = new Intent(this, Addition.class);
            startActivity(goto_addition);


    }





    public void goto_subtraction(View view){
        Intent goto_subtraction = new Intent(this ,Subtraction.class);
        startActivity(goto_subtraction);

    }





    public void goto_division(View view){
        Intent goto_division = new Intent(this ,Division.class);
        startActivity(goto_division);

    }



    @Override
    public void onStart () {
        startService(new Intent(MainActivity.this, Main_Music_Service.class));
        super.onStart();
    }





    @Override
    public void onDestroy () {
        stopService(new Intent(MainActivity.this, Main_Music_Service.class));
        super.onDestroy();
    }


    }

