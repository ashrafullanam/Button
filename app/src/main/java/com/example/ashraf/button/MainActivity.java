package com.example.ashraf.button;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()) {
                    case R.id.button:
                        if (true)
                            Log.e("Button is select:", "one");
                            // Put some meat on the sandwich
                        else
                            Log.e("Button is select:", "Two");
                        break;
                }
            }
        });
    }

   /* @Override
    public void onClick(View v) {

    }*/
}
