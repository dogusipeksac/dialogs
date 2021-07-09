package com.example.dialogs;

import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void SetTime(String time){
        Toast.makeText(getApplicationContext(),time,Toast.LENGTH_LONG).show();

    }

    public void buttonShow(View view) {
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setMessage("Are you sure you want learn time").setTitle("Conformation").
        setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                FragmentManager fragmentManager=getFragmentManager();
                PopTime popTime=new PopTime();
                popTime.show(getSupportFragmentManager(),"Show fragment");
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "is canceled", Toast.LENGTH_SHORT).show();
            }
        }).show();

    }
}