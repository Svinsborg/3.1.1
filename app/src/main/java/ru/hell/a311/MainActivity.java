package ru.hell.a311;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView lcd;
    private Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btC, btDot, btAdd, btSub, btMul, btDiv, btRes, btPM, btPrc;

    private float valueOne, valueTwo;

    private boolean addition, subtract, multiplication, division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "9");
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + "0");
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (lcd == null) {
                    lcd.setText("");
                } else {
                    valueOne = Float.parseFloat(lcd.getText() + "");
                    addition = true;
                    lcd.setText(null);
                }
            }
        });

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(lcd.getText() + "");
                subtract = true;
                lcd.setText(null);
            }
        });

        btMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(lcd.getText() + "");
                multiplication = true;
                lcd.setText(null);
            }
        });

        btDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(lcd.getText() + "");
                division = true;
                lcd.setText(null);
            }
        });

        btRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(lcd.getText() + "");

                if (addition == true) {
                    lcd.setText(valueOne + valueTwo + "");
                    addition = false;
                }

                if (subtract == true) {
                    lcd.setText(valueOne - valueTwo + "");
                    subtract = false;
                }

                if (multiplication == true) {
                    lcd.setText(valueOne * valueTwo + "");
                    multiplication = false;
                }

                if (division == true) {
                    lcd.setText(valueOne / valueTwo + "");
                    division = false;
                }
            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText("");
            }
        });

        btDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lcd.setText(lcd.getText() + ".");
            }
        });

        btPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(String.valueOf(lcd.getText())) ;
                valueOne = valueOne * -1;
                lcd.setText(valueOne + "");
            }

        });

        btPrc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueTwo = Float.parseFloat(lcd.getText() + "");

                if (addition == true) {
                    lcd.setText(valueTwo + ((valueOne / 100) * valueTwo) + "");
                    addition = false;
                }

                if (subtract == true) {
                    lcd.setText(valueOne - ((valueOne / 100) * valueTwo) + "");
                    subtract = false;
                }

                if (multiplication == true) {
                    lcd.setText(valueOne * ((valueOne / 100) * valueTwo) + "");
                    multiplication = false;
                }

                if (division == true) {
                    lcd.setText(valueOne / ((valueOne / 100) * valueTwo) + "");
                    division = false;
                }
            }


        });
    }



    private void init() {
        bt1 = findViewById(R.id.button1);
        bt2 = findViewById(R.id.button2);
        bt3 = findViewById(R.id.button3);
        bt4 = findViewById(R.id.button4);
        bt5 = findViewById(R.id.button5);
        bt6 = findViewById(R.id.button6);
        bt7 = findViewById(R.id.button7);
        bt8 = findViewById(R.id.button8);
        bt9 = findViewById(R.id.button9);
        bt0 = findViewById(R.id.button0);
        btC = findViewById(R.id.buttonC);
        btPM  = findViewById(R.id.buttonPlusMinus);
        btPrc  = findViewById(R.id.buttonPercent);
        btDot = findViewById(R.id.buttonDot);
        btAdd = findViewById(R.id.buttonAdd);
        btSub = findViewById(R.id.buttonSub);
        btMul = findViewById(R.id.buttonMul);
        btDiv = findViewById(R.id.buttonDiv);
        btRes = findViewById(R.id.buttonResult);
        lcd = findViewById(R.id.numberLcd);
    }


}
