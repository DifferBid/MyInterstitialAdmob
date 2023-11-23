package com.interstitial.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OneClass extends Activity {
    Button button02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_one_class);

        button02 = findViewById(R.id.button_02);
        button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Код, который будет выполнен при нажатии на кнопку
                Intent intent = new Intent(OneClass.this, Main.class);
                startActivity(intent);
            }
        });
    }
}
