package com.example.sidezetap2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public static final String NUMBER_ONE = "param_one";
    public static final String NUMBER_TWO = "param_two";
    public static final String OPERATION = "OPERATION";
    public static final String ADD = "Add";
    public static final String SUB = "sub";
    public static final int RES_CODE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        int input1 = intent.getIntExtra(NUMBER_ONE,0);
        int input2 = intent.getIntExtra(NUMBER_TWO,0);
        String action = intent.getStringExtra(OPERATION);

        if (intent!=null && action != null){

            int result = 0;

            if (action.equals(ADD)){
                result = input1+input2;
            }
            else if (action.equals(SUB)){
                result = input1 - input2;
            }

            Intent resultIntent = new Intent();
            resultIntent.putExtra("RESULT",result);
            setResult(RESULT_OK,resultIntent);
            finish();

        }
    }
}