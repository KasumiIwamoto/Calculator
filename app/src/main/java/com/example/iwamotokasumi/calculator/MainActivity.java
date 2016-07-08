package com.example.iwamotokasumi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int number1;
    int number2;
    int ansewer;
    int ope;
    TextView num1Text;
    TextView opeText;
    TextView num2Text;
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //各変数を初期化
        number1 = 0;
        number2 = 0;
        ansewer = 0;
        ope = 0;
        //ラベルを関連付け
        num1Text = (TextView)findViewById(R.id.num1);
        opeText = (TextView)findViewById(R.id.ope);
        num2Text = (TextView)findViewById(R.id.num2);
        answerText = (TextView)findViewById(R.id.answer);
        //ラベルの値を初期状態に
        num1Text.setText("0");
        opeText.setText("");
        num2Text.setText("");
        answerText.setText("");
    }
    public void bt1(View v){
        if(ope == 0){
            number1 = number1*10 + 1;
            num1Text.setText(number1+ "");
        }
       else if(ope > 0){
            number2 = number2*10 + 1;
            num2Text.setText(number1+ "");
        }
    }
    public void bt2(View v){
        number1 = number1*10 + 2;
        num1Text.setText(number1+ "");
    }
    public void bt3(View v){
        number1 = number1*10 + 3;
        num1Text.setText(number1+ "");
    }
    public void bt4(View v){
        number1 = number1*10 + 4;
        num1Text.setText(number1+ "");
    }
    public void bt5(View v){
        number1 = number1*10 + 5;
        num1Text.setText(number1+ "");
    }
    public void bt6(View v){
        number1 = number1*10 + 6;
        num1Text.setText(number1+ "");
    }
    public void bt7(View v){
        number1 = number1*10 + 7;
        num1Text.setText(number1+ "");
    }
    public void bt8(View v){
        number1 = number1*10 + 8;
        num1Text.setText(number1+ "");
    }
    public void bt9(View v){
        number1 = number1*10 + 9;
        num1Text.setText(number1+ "");
    }
    public void btclear(View v){
        num1Text.setText("");
        num2Text.setText("");
        opeText.setText("");
       answerText.setText("");
        ope = -1;
    }
    //+ボタンが押された時
    public void btplus(View v){
        ope = 1;
        opeText.setText("+");
        num2Text.setText("");
    }
    //-ボタンが押された時
    public void btminus(View v){
        ope = 2;
        opeText.setText("-");
        num2Text.setText("");
    }
    //＝ボタンが押された時
    public void btequal(View v){
        if(ope == 1) {
            ansewer = number1 + number2;
            answerText.setText("=" + ansewer);
            ope = -1;
        }else if(ope == 2){
                ansewer = number1 - number2;
                answerText.setText("=" + ansewer);
                ope = -1;
        }
    }
}
