
package com.example.savingdataapplication;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sharedPreferences = this.getSharedPreferences(SavingDataMainActivity.SHARED_PREFS_KEY, Context.MODE_PRIVATE);
        String value = sharedPreferences.getString("hello", "");

        Toast.makeText(this, "The value is: " + value, Toast.LENGTH_LONG).show();
    }
}
