package com.sinus.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnSimpleAlert, btnAlertWithTwoButton, btnAlertWithThreeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSimpleAlert = (Button) findViewById(R.id.button1);
        btnAlertWithTwoButton = (Button) findViewById(R.id.button2);
        btnAlertWithThreeButton = (Button) findViewById(R.id.button3);

        btnSimpleAlert.setOnClickListener(this);
        btnAlertWithTwoButton.setOnClickListener(this);
        btnAlertWithThreeButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnSimpleAlert) {
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();

            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Simple Alert Dialog")
                    .setMessage("Welcome to SiNus")
                    .setIcon(R.drawable.success)
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Anda memilih OK", Toast.LENGTH_SHORT).show();
                        }
                    });
            alertDialog = builder.create();
            alertDialog.show();
        }

        if (v == btnAlertWithTwoButton) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

            alertDialog.setTitle("Confirm Delete...");
            alertDialog.setMessage("Are you sure you want delete this?");
            alertDialog.setIcon(R.drawable.delete);
            alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "You clicked on No", Toast.LENGTH_SHORT).show();
                    dialog.cancel();
                }
            });
            alertDialog.show();
        }

        if (v == btnAlertWithThreeButton) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

            alertDialog.setTitle("Save File...");
            alertDialog.setMessage("Do you want to save this file?");
            alertDialog.setIcon(R.drawable.save);
            alertDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "You clicked on YES", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "You clicked on No", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(getApplicationContext(), "You clicked on Cancel", Toast.LENGTH_SHORT).show();
                }
            });
            alertDialog.show();
        }
    }
}