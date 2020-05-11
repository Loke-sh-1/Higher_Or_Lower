package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;
    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
public void guess(View view){
    EditText ed1=findViewById(R.id.ed1);
    int guessIn=Integer.parseInt(ed1.getText().toString());
    if(guessIn>randomnumber)
        makeToast("Lower");
    else if(guessIn<randomnumber)
        makeToast("Higher");
    else {makeToast("That's right!");
        Random rand = new Random();
        randomnumber=rand.nextInt(20)+1;
    }


}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randomnumber=rand.nextInt(20)+1;
    }
}
