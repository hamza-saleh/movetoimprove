package ch.zli.m335.movetoimprove;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;

import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    private Button mapbutton;
    private Intent mapIntent;
    private Button timebutton;
    private Intent timeIntent;
    private Intent locationIntent;
    private Button locationbutton;
    private Button points;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapbutton = (Button) findViewById(R.id.mapbutton);
        timebutton = (Button) findViewById(R.id.timebutton);
        locationbutton = (Button) findViewById(R.id.locationbutton);




        locationbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                locationIntent = new Intent(MainActivity.this, Location.class);
                startActivity(locationIntent);
            }
        });

        timebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timeIntent = new Intent(MainActivity.this, TimeActivity.class);
                startActivity(timeIntent);
            }
        });
        mapbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mapIntent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(mapIntent);
            }
        });
    }

}