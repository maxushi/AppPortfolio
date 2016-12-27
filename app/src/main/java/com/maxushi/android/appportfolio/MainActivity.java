package com.maxushi.android.appportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view)
    {
        Button button = (Button) view;
        String appName = button.getText().toString();

        Context context = getApplicationContext();
        Toast.makeText(context, appName, Toast.LENGTH_SHORT).show();
    }
}
