package com.example.intentputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

   TextView name;
   TextView location;
   TextView mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name=findViewById(R.id.textView);
        location=findViewById(R.id.textView2);
        mobile=findViewById(R.id.textView3);

        name.setText(getIntent().getStringExtra("name"));
        location.setText(getIntent().getStringExtra("location"));
        mobile.setText(getIntent().getStringExtra("mobile "));
    }
}