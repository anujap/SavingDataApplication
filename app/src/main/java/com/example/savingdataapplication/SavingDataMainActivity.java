package com.example.savingdataapplication;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SavingDataMainActivity extends AppCompatActivity implements View.OnClickListener {

    protected static final String SHARED_PREFS_KEY = "shared_prefs_key";

    SharedPreferences sharedPrefs = null;
    SharedPreferences.Editor editor = null;

    Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saving_data_main);

        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(this);

        writeToSharedPreferences();
    }

    @Override
    public void onClick(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    private void writeToSharedPreferences()
    {
        sharedPrefs = this.getSharedPreferences(SHARED_PREFS_KEY, Context.MODE_PRIVATE);
        editor = sharedPrefs.edit();

        editor.putString("hello", "this is a test application");
        editor.commit();
    }
}
