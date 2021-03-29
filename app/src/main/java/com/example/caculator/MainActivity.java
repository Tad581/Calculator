package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.app.Activity;
import android.view.Menu;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

        private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn00, btn0, btnCE, btnC, btnBS, btnPnt, btnDiv, btnMul, btnSub, btnAdd, btnEql;
        private TextView textCalculation, textResult;
    
        String calculation = "";
        private int state = 1;
        private int sign = 0;
        private int operater1, operater2;


        @Override
        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn00 = findViewById(R.id.btn00);
        btnBS = findViewById(R.id.btnBS);
        btnCE = findViewById(R.id.btnCE);
        btnC = findViewById(R.id.btnC);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);
        btnSub = findViewById(R.id.btnSub);
        btnAdd = findViewById(R.id.btnAdd);
        btnEql = findViewById(R.id.btnEql);
        btnPnt = findViewById(R.id.btnPnt);

        textCalculation = findViewById(R.id.textCalculation);
        textResult = findViewById((R.id.textResult));


        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn00.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnCE.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnEql.setOnClickListener(this);
        btnBS.setOnClickListener(this);
        btnPnt.setOnClickListener(this);
    }


        @Override
        public void onClick (View v){
        int id = v.getId();

            switch (id) {
                case R.id.btn0:
                case R.id.btn1:
                case R.id.btn2:
                case R.id.btn3:
                case R.id.btn4:
                case R.id.btn5:
                case R.id.btn6:
                case R.id.btn7:
                case R.id.btn8:
                case R.id.btn9:
                    Button temp = (Button) v;
                    calculation = calculation + temp.getText();
                    textCalculation.setText(calculation);
                    break;
                case R.id.btnAdd:
                    sign = 1; 
                    if (state == 1)
                    {
                        state = 2;
                        operater1 = Integer.parseInt(calculation);
                    }
                    calculation = "";
                    textCalculation.setText(calculation);   
                    break;           
                case R.id.btnSub:
                    sign = 2;
                    if (state == 1)
                    {
                        state = 2;
                        operater1 = Integer.parseInt(calculation);
                    }
                    calculation = "";
                    textCalculation.setText(calculation);   
                    break;
                case R.id.btnMul:
                    sign = 3;
                    if (state == 1)
                    {
                        state = 2;
                        operater1 = Integer.parseInt(calculation);
                    }
                    calculation = "";
                    textCalculation.setText(calculation);   
                    break;
                case R.id.btnDiv:
                    sign = 4;
                    if (state == 1)
                    {
                        state = 2;
                        operater1 = Integer.parseInt(calculation);
                    }
                    calculation = "";
                    textCalculation.setText(calculation);   
                    break;
                case R.id.btnEql:
                    operater2 = Integer.parseInt(calculation);
                    state = 1;
                    calculation = "";
                    textCalculation.setText(calculation);
                    switch (sign){
                        case 1:
                            textResult.setText(operater1 + operater2);
                            break;
                        case 2:
                            textResult.setText(operater1 - operater2);
                            break;
                        case 3:
                            textResult.setText(operater1 * operater2);
                            break;
                        case 4:
                            textResult.setText(operater1 / operater2);      
                            break;
                    }
                case R.id.btnBS:
                case R.id.btnCE:
                case R.id.btnC:
            default:
                break;
            }
    }
}
