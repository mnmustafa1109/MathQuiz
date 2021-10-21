package com.example.mustafa.mathquiz;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Random;

public class Subtraction extends AppCompatActivity {





    int answer =0 ;
    int score;
    int position;
    MainActivity main = new MainActivity();
    ProgressBar mProgressBar;
    int i=0;















    CountDownTimer countDownTimere = new CountDownTimer(6000, 1) {
        public void onTick(long millisUntilFinished) {
            setOnclick_button();
            i++;
            mProgressBar.setProgress((int) i * 100 / (2350));
        }
        public void onFinish() {
            if(get_button_1()==answer){
                set_button1_right();
            }
            if(get_button_2()==answer){
                set_button2_right();
            }
            if(get_button_3()==answer){
                set_button3_right();
            }
            if(get_button_4()==answer){
                set_button4_right();
            }
            setOnclick_nothing_button();
            i++;
            mProgressBar.setProgress(100);
            new CountDownTimer(1000, 500) {
                public void onTick(long millisUntilFinished) {
                    display_totalscore("Times out");
                }
                public void onFinish() {
                    display_totalscore("your total score is " + score);
                    setOnclick_rootView();
                    display_info("touch anywhere to continue");
                }
            }.start();
        }
    };






    CountDownTimer countDownTimerd = new CountDownTimer(5000, 1) {
        public void onTick(long millisUntilFinished) {
            setOnclick_button();
            i++;
            mProgressBar.setProgress((int) i * 100 / (1840 ));
        }
        public void onFinish() {
            if(get_button_1()==answer){
                set_button1_right();
            }
            if(get_button_2()==answer){
                set_button2_right();
            }
            if(get_button_3()==answer){
                set_button3_right();
            }
            if(get_button_4()==answer){
                set_button4_right();
            }
            setOnclick_nothing_button();
            i++;
            mProgressBar.setProgress(100);
            new CountDownTimer(1000, 500) {
                public void onTick(long millisUntilFinished) {
                    display_totalscore("Times out");
                }
                public void onFinish() {
                    display_totalscore("your total score is " + score);
                    setOnclick_rootView();
                    display_info("touch anywhere to continue");
                }
            }.start();
        }
    };







    @Override
    protected void onCreate(Bundle savedInstanceState) {













        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_page);





        new CountDownTimer(4000, 1000) {
            public void onTick(long millisUntilFinished) {
                display_question("" + millisUntilFinished / 1000 );
            }
            public void onFinish() {
                main_block();
            }
        }.start();




    }





    public void main_block(){



        if(main.getposition()==1 ||main.getposition()==0){
            countDownTimere.cancel();}
        if(main.getposition()==2){
            countDownTimerd.cancel();
        }
        int ans=question_generator();
        displaying_button(ans);
        i=0;
        mProgressBar=(ProgressBar)findViewById(R.id.progressBar);
        mProgressBar.setProgress(i);
        if(main.getposition()==1 ||main.getposition()==0){
            countDownTimere.start();}
        if(main.getposition()==2){
            countDownTimerd.start();
        }


    }











    public void displaying_button(int ans){




        final int button_number = new Random().nextInt((4 - 1) + 1) + 1;
        if (button_number==1){
            display_button_1(""+ans);
        }
        if (button_number==2){
            display_button_2(""+ans);
        }
        if (button_number==3){
            display_button_3(""+ans);
        }
        if (button_number==4){
            display_button_4(""+ans);
        }




        if (main.getposition()==0) {
            if (button_number != 1) {
                display_button_1("" + (new Random().nextInt(23 - 6 + 1) + 6));
            }
            if (button_number != 2) {
                display_button_2("" + (new Random().nextInt(23 - 6 + 1) + 6));
            }
            if (button_number != 3) {
                display_button_3("" + (new Random().nextInt(23 - 6 + 1) + 6));
            }
            if (button_number != 4) {
                display_button_4("" + (new Random().nextInt(23 - 6 + 1) + 6));
            }
            if(button_number==1){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_4("" + (ans - 10));
                }else {
                    display_button_4("" + (ans + 10));
                }
            }else if(button_number==2){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_3("" + (ans - 10));
                }else {
                    display_button_3("" + (ans + 10));
                }
            }else if(button_number==3){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_2("" + (ans - 10));
                }else {
                    display_button_2("" + (ans + 10));
                }
            }else {
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if (diff == 1) {
                    display_button_1("" + (ans - 10));
                } else {
                    display_button_1("" + (ans + 10));
                }
            }
            if(button_number==1){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_3("" + (ans - 1));
                }else {
                    display_button_3("" + (ans + 1));
                }
            }else if(button_number==2){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_4("" + (ans - 1));
                }else {
                    display_button_4("" + (ans + 1));
                }
            }else if(button_number==3){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_1("" + (ans - 1));
                }else {
                    display_button_1("" + (ans + 1));
                }
            }else {
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if (diff == 1) {
                    display_button_2("" + (ans - 1));
                } else {
                    display_button_2("" + (ans + 1));
                }
            }
        }



        if (main.getposition()==1) {
            if (button_number != 1) {
                display_button_1("" + (new Random().nextInt(60 - 20 + 1) + 20));
            }
            if (button_number != 2) {
                display_button_2("" + (new Random().nextInt(60 - 20 + 1) + 20));
            }
            if (button_number != 3) {
                display_button_3("" + (new Random().nextInt(60 - 20 + 1) + 20));
            }
            if (button_number != 4) {
                display_button_4("" + (new Random().nextInt(60 - 20 + 1) + 20));
            }
            if(button_number==1){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_4("" + (ans - 10));
                }else {
                    display_button_4("" + (ans + 10));
                }
            }else if(button_number==2){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_3("" + (ans - 10));
                }else {
                    display_button_3("" + (ans + 10));
                }
            }else if(button_number==3){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_2("" + (ans - 10));
                }else {
                    display_button_2("" + (ans + 10));
                }
            }else {
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if (diff == 1) {
                    display_button_1("" + (ans - 10));
                } else {
                    display_button_1("" + (ans + 10));
                }
            }
            if(button_number==1){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_3("" + (ans - 1));
                }else {
                    display_button_3("" + (ans + 1));
                }
            }else if(button_number==2){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_4("" + (ans - 1));
                }else {
                    display_button_4("" + (ans + 1));
                }
            }else if(button_number==3){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_1("" + (ans - 1));
                }else {
                    display_button_1("" + (ans + 1));
                }
            }else {
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if (diff == 1) {
                    display_button_2("" + (ans - 1));
                } else {
                    display_button_2("" + (ans + 1));
                }
            }
        }



        if (main.getposition()==2) {
            if (button_number != 1) {
                display_button_1("" + (new Random().nextInt(130 - 30 + 1) + 30));
            }
            if (button_number != 2) {
                display_button_2("" + (new Random().nextInt(130 - 30 + 1) + 30));
            }
            if (button_number != 3) {
                display_button_3("" + (new Random().nextInt(130 - 30 + 1) + 30));
            }
            if (button_number != 4) {
                display_button_4("" + (new Random().nextInt(130 - 30 + 1) + 30));
            }
            if(button_number==1){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_4("" + (ans - 10));
                }else {
                    display_button_4("" + (ans + 10));
                }
            }else if(button_number==2){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_3("" + (ans - 10));
                }else {
                    display_button_3("" + (ans + 10));
                }
            }else if(button_number==3){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_2("" + (ans - 10));
                }else {
                    display_button_2("" + (ans + 10));
                }
            }else {
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if (diff == 1) {
                    display_button_1("" + (ans - 10));
                } else {
                    display_button_1("" + (ans + 10));
                }
            }
            if(button_number==1){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_3("" + (ans - 1));
                }else {
                    display_button_3("" + (ans + 1));
                }
            }else if(button_number==2){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_4("" + (ans - 1));
                }else {
                    display_button_4("" + (ans + 1));
                }
            }else if(button_number==3){
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if(diff==1){
                    display_button_1("" + (ans - 1));
                }else {
                    display_button_1("" + (ans + 1));
                }
            }else {
                int diff = new Random().nextInt(2 - 1 + 1) + 1;
                if (diff == 1) {
                    display_button_2("" + (ans - 1));
                } else {
                    display_button_2("" + (ans + 1));
                }
            }
        }




    }


    public int question_generator() {




        if (main.getposition()==0){
            int numb1 = new Random().nextInt((30-20) + 0)+20;
            int numb2 = new Random().nextInt((-1 -(-20)) + 1)+(-20);
            display_question(numb1 + " " + numb2);
            answer = numb1 + numb2;}




        else if (main.getposition()==1){
            int numb1 = new Random().nextInt((100 - 60) + 1)+60;
            int numb2 = new Random().nextInt((-30 -(-50)) + 1)+(-50);
            display_question(numb1 + " " + numb2);
            answer = numb1 + numb2; }





        else {  int numb1 = new Random().nextInt((200 - 100) + 1)+100;
            int numb2 = new Random().nextInt((-50 -(-90)) + 1)+(-90);
            display_question(numb1 + " " + numb2);
            answer = numb1 + numb2;}





        return answer;


    }










    public void checking_button_1(View view){


        setOnclick_nothing_button();


        if(main.getposition()==1 || main.getposition()==0){
            countDownTimere.cancel();
        }

        if(main.getposition()==2){
            countDownTimerd.cancel();
        }



        int check = get_button_1();



        if(answer==check){
            set_button1_right();
            displaying_right_answer();
        }
        if(answer!=check){
            set_button1_wrong();
            displaying_wrong_answer();
        }



    }


    public void checking_button_2(View view){


        setOnclick_nothing_button();


        if(main.getposition()==1 || main.getposition()==0){
            countDownTimere.cancel();
        }
        if(main.getposition()==2){
            countDownTimerd.cancel();
        }



        int check = get_button_2();


        if(answer==check){
            set_button2_right();
            displaying_right_answer();
        } if(answer!=check){
            set_button2_wrong();
            displaying_wrong_answer();

        }



    }




    public void checking_button_3(View view){



        setOnclick_nothing_button();


        if(main.getposition()==1 || main.getposition()==0){
            countDownTimere.cancel();
        }

        if(main.getposition()==2){
            countDownTimerd.cancel();
        }

        int check = get_button_3();
        if(answer==check){
            set_button3_right();
            displaying_right_answer();
        } if(answer!=check){
            set_button3_wrong();
            displaying_wrong_answer();

        }
    }



    public void checking_button_4(View view){

        setOnclick_nothing_button();



        if(main.getposition()==1 || main.getposition()==0){
            countDownTimere.cancel();
        }
        if(main.getposition()==2){
            countDownTimerd.cancel();
        }


        int check = get_button_4();


        if(answer==check){
            set_button4_right();
            displaying_right_answer();
        } if(answer!=check){
            set_button4_wrong();
            displaying_wrong_answer();

        }




    }







    public void displaying_right_answer(){
        score++;
        new CountDownTimer(1000, 500) {
            public void onTick(long millisUntilFinished) {
                display_question("true");
            }
            public void onFinish() {
                set_button1_original();
                set_button2_original();
                set_button3_original();
                set_button4_original();
                main_block();
            }
        }.start();
        display_score(""+score);
    }




    public void displaying_wrong_answer(){
        setOnclick_nothing_button();
        new CountDownTimer(1000, 500) {
            public void onTick(long millisUntilFinished) {

                if(get_button_1()==answer){
                    set_button1_right();
                }
                if(get_button_2()==answer){
                    set_button2_right();
                }
                if(get_button_3()==answer){
                    set_button3_right();
                }
                if(get_button_4()==answer){
                    set_button4_right();
                }display_totalscore("false");
            }
            public void onFinish() {
                display_totalscore("your total score is "+score);
                setOnclick_rootView();
                display_info("touch anywhere to continue");
            }
        }.start();
    }




    public void display_button_1 (String number){
        TextView button = (TextView) findViewById(R.id.button1);
        button.setText(number);
    }
    public void display_button_2 (String number){
        TextView button = (TextView) findViewById(R.id.button2);
        button.setText(number);
    }
    public void display_button_3 (String number){
        TextView button = (TextView) findViewById(R.id.button3);
        button.setText(number);
    }
    public void display_button_4 (String number){
        TextView button = (TextView) findViewById(R.id.button4);
        button.setText(number);
    }
    public void display_score (String number){
        TextView score = (TextView) findViewById(R.id.score);
        score.setText(number);
    }
    public void display_totalscore (String question){
        TextView total_view = (TextView) findViewById(R.id.total_score);
        total_view.setText(question);
    }
    public void display_question (String question){
        TextView question_view = (TextView) findViewById(R.id.question);
        question_view.setText(question);
    }
    public void display_info (String question){
        TextView info_view = (TextView) findViewById(R.id.info);
        info_view.setText(question);
    }





    public int get_button_1 (){
        TextView button = (TextView) findViewById(R.id.button1);
        return Integer.parseInt(button.getText().toString());
    }
    public int get_button_2 (){
        TextView button =  (TextView) findViewById(R.id.button2);
        return Integer.parseInt(button.getText().toString());
    }
    public int get_button_3 (){
        TextView button = (TextView) findViewById(R.id.button3);
        return Integer.parseInt(button.getText().toString());
    }
    public int get_button_4 (){
        TextView button =  (TextView) findViewById(R.id.button4);
        return Integer.parseInt(button.getText().toString());
    }


    private View.OnClickListener onclick_button1 = new View.OnClickListener() {
        public void onClick(View v) {
            checking_button_1(v);
        }
    };

    private View.OnClickListener onclick_button2 = new View.OnClickListener() {
        public void onClick(View v) {
            checking_button_2(v);
        }
    };
    private View.OnClickListener onclick_button3 = new View.OnClickListener() {
        public void onClick(View v) {
            checking_button_3(v);
        }
    };
    private View.OnClickListener onclick_button4 = new View.OnClickListener() {
        public void onClick(View v) {
            checking_button_4(v);
        }
    };




    private View.OnClickListener onclick_nothing = new View.OnClickListener() {
        public void onClick(View v) {

        }
    };





    public void setOnclick_button(){
        Button button1=(Button) findViewById(R.id.button1);
        button1.setOnClickListener(onclick_button1);
        Button button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(onclick_button2);
        Button button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(onclick_button3);
        Button button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(onclick_button4);
    }




    public void setOnclick_nothing_button(){
        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(onclick_nothing);
        Button button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(onclick_nothing);
        Button button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(onclick_nothing);
        Button button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(onclick_nothing);
    }




    public void goto_home(View view){
        Intent go_to_home = new Intent(this ,MainActivity.class);
        startActivity(go_to_home);

    }






    private View.OnClickListener onclick_home = new View.OnClickListener() {
        public void onClick(View v) {
            goto_home(v);
        }
    };






    public void setOnclick_rootView(){
        View main =(View) findViewById(R.id.main);
        main.setOnClickListener(onclick_home);


    }



    public void set_button1_right(){
        Button button = (Button) findViewById(R.id.button1);
        button.setBackground(getResources().getDrawable(R.drawable.right_button));
    }
    public void set_button2_right(){
        Button button = (Button) findViewById(R.id.button2);
        button.setBackground(getResources().getDrawable(R.drawable.right_button));
    }
    public void set_button3_right(){
        Button button = (Button) findViewById(R.id.button3);
        button.setBackground(getResources().getDrawable(R.drawable.right_button));
    }
    public void set_button4_right(){
        Button button = (Button) findViewById(R.id.button4);
        button.setBackground(getResources().getDrawable(R.drawable.right_button));
    }





    public void set_button1_wrong(){
        Button button = (Button) findViewById(R.id.button1);
        button.setBackground(getResources().getDrawable(R.drawable.wrong_button));
    }
    public void set_button2_wrong(){
        Button button = (Button) findViewById(R.id.button2);
        button.setBackground(getResources().getDrawable(R.drawable.wrong_button));
    }
    public void set_button3_wrong(){
        Button button = (Button) findViewById(R.id.button3);
        button.setBackground(getResources().getDrawable(R.drawable.wrong_button));
    }
    public void set_button4_wrong(){
        Button button = (Button) findViewById(R.id.button4);
        button.setBackground(getResources().getDrawable(R.drawable.wrong_button));
    }






    public void set_button1_original(){
        Button button = (Button) findViewById(R.id.button1);
        button.setBackground(getResources().getDrawable(R.drawable.buttons));
    }
    public void set_button2_original(){
        Button button = (Button) findViewById(R.id.button2);
        button.setBackground(getResources().getDrawable(R.drawable.buttons));
    }
    public void set_button3_original(){
        Button button = (Button) findViewById(R.id.button3);
        button.setBackground(getResources().getDrawable(R.drawable.buttons));
    }
    public void set_button4_original(){
        Button button = (Button) findViewById(R.id.button4);
        button.setBackground(getResources().getDrawable(R.drawable.buttons));
    }




}
