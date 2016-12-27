package com.maxushi.android.appportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void popularMovies(View view) {
        toast("This button will launch: popular movies");
    }

    public void stockHawk(View view) {
        toast("This button will launch: stock hawk");
    }

    public void buildItBigger(View view) {
        toast("This button will launch: build it bigger");
    }

    public void makeYourAppMaterial(View view) {
        toast("This button will launch: make your app material");
    }

    public void goUbiquitous(View view) {
        toast("This button will launch: go ubiquitous");
    }

    public void capstone(View view) {
        toast("This button will launch my capstone project");
    }

    private void toast(String text) {
        Context context = getApplicationContext();
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
