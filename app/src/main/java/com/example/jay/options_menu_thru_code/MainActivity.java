package com.example.jay.options_menu_thru_code;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.comp:
                //Showing toast on selecting any one of the options
                Toast.makeText(MainActivity.this, "Computer is Selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.game:

                Toast.makeText(MainActivity.this, "Gamepad is Selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.lap:

                Toast.makeText(MainActivity.this, "Laptop is Selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.cam:

                Toast.makeText(MainActivity.this, "Camera is Selected", Toast.LENGTH_SHORT).show();

                return true;

            case R.id.ema:

                Toast.makeText(MainActivity.this, "Email is Selected", Toast.LENGTH_SHORT).show();

                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }

}
