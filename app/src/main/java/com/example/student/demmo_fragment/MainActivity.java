package com.example.student.demmo_fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.nio.BufferUnderflowException;

public class MainActivity extends AppCompatActivity {
    Button btnchange;
    EditText edtchange;
    FragmentA fragmentA;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnchange = findViewById(R.id.btn_change);
        edtchange = findViewById(R.id.edt_change);

        btnchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentA = (FragmentA) getFragmentManager().findFragmentById(R.id.fragmenta);
                fragmentA.edtfa.setText(edtchange.getText());
            }
        });
    }
}
