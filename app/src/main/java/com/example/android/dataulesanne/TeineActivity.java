package com.example.android.dataulesanne;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class TeineActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teineactivity);

        TextView txtReceivedData = (TextView)findViewById(R.id.txtReceivedData);

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String data = bundle.getString("data");
            int age = bundle.getInt("age", 0);
            txtReceivedData.setText(data + " vanus on " + age);
        }
    }
}
