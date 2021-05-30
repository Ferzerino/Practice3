package ru.mirea.zgarbov.intentapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String date = (String) getIntent().getSerializableExtra("Date");
        TextView textView = findViewById(R.id.textView);
        textView.setText(date);
    }
}
