package com.example.android.dataulesanne;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etData = (EditText)findViewById(R.id.etData);
        final EditText etAge = (EditText)findViewById(R.id.etAge);
        Button btnPass = (Button)findViewById(R.id.btnPass);

        btnPass.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), TeineActivity.class);
                intent.putExtra("data",etData.getText().toString());
                int age = Integer.parseInt(etAge.getText().toString());
                intent.putExtra("age", age);
                startActivity(intent);
            }
        });
    }
}
