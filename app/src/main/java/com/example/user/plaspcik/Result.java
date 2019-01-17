package com.example.user.plaspcik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    String pred;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle bundle = getIntent().getExtras();
        pred = bundle.getString("pred");
        TextView textView = (TextView) findViewById(R.id.texter);
        textView.setText(pred);
        Button button =  (Button) findViewById(R.id.backit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Result.this,Upload.class);
                startActivity(intent);
            }
        });
    }
}
