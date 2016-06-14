package com.leon.event_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class TextEditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text__edit);

        Button saveButton = (Button) findViewById(R.id.button_save);
        assert saveButton != null;
        saveButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Log.d("TextEditActivity", "saveButton press");
                Intent intentsave = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentsave);

            }
        });

    }

}
