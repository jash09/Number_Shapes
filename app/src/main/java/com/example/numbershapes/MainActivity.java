package com.example.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    class Number{


    int number;

    public boolean isSquare() {

        double sqroot = Math.sqrt(number);
        if (sqroot == Math.floor(sqroot)) {

            return true;
        } else {

            return false;
        }

    }

    public boolean isTriangular() {

        int x = 1;
        int triangularNumber = 1;
        while (triangularNumber < number) {

            x++;
            triangularNumber = triangularNumber + x;

        }
        if (triangularNumber == number) {
            return true;

        } else {

            return false;
        }

    }

}

    public void test(View view){

        Log.i("Info","Button Pressed");
        EditText editText=(EditText) findViewById(R.id.editText);
        String message;
        if(editText.getText().toString().isEmpty()){

            message ="Please enter a number";

        }else{

        Number myNumber = new Number();
        myNumber.number = Integer.parseInt(editText.getText().toString());
        message = editText.getText().toString();
        if(myNumber.isSquare() && myNumber.isSquare()){

            message +=" is Square and Triangular";
        }else if(myNumber.isSquare()){

            message+=" is a Square Number";

        }else if(myNumber.isTriangular()){

            message+=" is a triangular number";
        }else{

            message+=" is not square or triangular";
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();




    }}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
