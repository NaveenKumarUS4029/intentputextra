package com.example.intentputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button send;
    EditText name;
    EditText location;
    EditText mobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        send=findViewById(R.id.button);
        name=findViewById(R.id.editTextTextPersonName);
        location=findViewById(R.id.editTextTextPersonName2);
        mobile=findViewById(R.id.editTextPhone);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nav = new Intent(MainActivity.this,MainActivity2.class);
                nav.putExtra("name",name.getText().toString());
                nav.putExtra("location",location.getText().toString());
                nav.putExtra("mobile",mobile.getText().toString());
                startActivity(nav);
            }
        });

    }
}