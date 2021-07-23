package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlay = findViewById(R.id.btn_play);
        btnPlay.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_play) {
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

            TextInputLayout editTextNumber;
            editTextNumber = findViewById(R.id.til_number);
            String numberMax = Objects.requireNonNull(editTextNumber.getEditText()).getText().toString();

            int number = Integer.parseInt(numberMax);
            int randomNumber = new Random().nextInt(number);

            intent.putExtra("numberRandom", randomNumber);
            startActivity(intent);
        }
    }
}