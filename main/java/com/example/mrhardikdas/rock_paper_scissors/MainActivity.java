package com.example.mrhardikdas.rock_paper_scissors;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button ROCK, PAPER,SCISSORS;
    ImageView im_cpu, im_user;
    String User,CPU,result;

    Random R;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        im_cpu=(ImageView) findViewById(R.id.im_cpu);
        im_user=(ImageView) findViewById(R.id.im_user);

        ROCK=(Button) findViewById(R.id.rocks_png);
        PAPER=(Button) findViewById(R.id.paper_png);
        SCISSORS=(Button) findViewById(R.id.scissors_png);

        R=new Random();

        ROCK.setOnClickListener(new View.OnClickListener(){
            @Override
                public void OnClick(View v){
                            User="rock";
                            calculate();

            }

            )};
        PAPER.setOnClickListener(new View.OnClickListener(){
            @Override
                public void OnClick(View v){
                            User="paper";
                            calculate();
                    }

            )};


        SCISSORS.setOnClickListener(new View.OnClickListener(){
            @Override
                 public void OnClick(View v){
                            User="scissors";
                            calculate();
                            }

            )};


        public void calculate(){
                int cpu = R.nextInt(3)
                if(cpu == 0){
                    CPU="rock";
                    im_cpu.setImageResource(R.drawable.rock);
                }
                if(cpu == 1){
                    CPU="paper";
                    im_cpu.setImageResource(R.drawable.paper);
                }

                if(cpu == 2){
                    CPU="scissors";
                    im_cpu.setImageResource(R.drawable.scissors);
                }
                if(User.equals("rock") && CPU.equals("scissors"))
                {
                    result="You win!!";
                }
                if(User.equals("rock") && CPU.equals("paper"))
                {
                    result="You lose!!";
                }
                if(User.equals("scissors") && CPU.equals("paper"))
                {
                    result="You win!!";
                }
                if(User.equals("scissors") && CPU.equals("rock"))
                {
                    result="You lose!!";
                }
                if(User.equals("paper") && CPU.equals("rock"))
                {
                    result="You win!!";
                }
                if(User.equals("paper") && CPU.equals("scissors"))
                {
                    result="You lose!!";
                }
                if(User.equals("rock") && CPU.equals("rock"))
                {
                    result="Draw!!";
                }
                if(User.equals("scissors") && CPU.equals("scissors"))
                {
                    result="Draw!!";
                }
                if(User.equals("paper") && CPU.equals("paper"))
                {
                    result="You win!!";
                }

    }

    Toast.makeTest(MainActivity.this, result,Toast.LENGTH_SHORT).show


    }

}
