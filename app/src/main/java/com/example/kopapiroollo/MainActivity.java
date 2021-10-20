package com.example.kopapiroollo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button btnKo, btnPapir, btnOllo;
    private ImageView kep, gepKep;
    private TextView eredmeny;
    private Random rnd;
    static int gep = 0;
    static int ember = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


        btnKo.setOnClickListener(view -> {
            kep.setImageResource(R.drawable.rock);
            int i1 = rnd.nextInt(3);
            if(i1 == 0){
                gepKep.setImageResource(R.drawable.rock);
                Toast.makeText(getApplicationContext(),"Döntetlen", Toast.LENGTH_SHORT).show();
            }
            else if(i1 == 1){
                gepKep.setImageResource(R.drawable.paper);
                Toast.makeText(getApplicationContext(),"A gép nyert!", Toast.LENGTH_SHORT).show();
                gep ++;
                eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
            }
            else{
                gepKep.setImageResource(R.drawable.scissors);
                Toast.makeText(getApplicationContext(),"Az ember nyert!", Toast.LENGTH_SHORT).show();
                ember++;
                eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
            }
            if(ember == 3 || gep == 3){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                if(ember == 3){
                    builder.setTitle("Győzelem");
                }
                else {
                    builder.setTitle("Vereség");
                }
                builder.setMessage("Szeretne új játékot játszani?").setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ember = 0;
                        gep = 0;
                        eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
                    }
                }).setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }

        });
        btnPapir.setOnClickListener(view -> {
            int i2 = rnd.nextInt(3);
            if(i2 == 0){
                gepKep.setImageResource(R.drawable.rock);
                ember++;
                Toast.makeText(getApplicationContext(),"Az ember nyert!", Toast.LENGTH_SHORT).show();
                eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
            }
            else if(i2 == 1){
                gepKep.setImageResource(R.drawable.paper);
                Toast.makeText(getApplicationContext(),"Döntetlen", Toast.LENGTH_SHORT).show();
            }
            else{
                gepKep.setImageResource(R.drawable.scissors);
                Toast.makeText(getApplicationContext(),"A gép nyert!", Toast.LENGTH_SHORT).show();
                gep ++;
                eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
            }
            kep.setImageResource(R.drawable.paper);
            if(ember == 3 || gep == 3){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                if(ember == 3){
                    builder.setTitle("Győzelem");
                }
                else {
                    builder.setTitle("Vereség");
                }
                builder.setMessage("Szeretne új játékot játszani?").setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ember = 0;
                        gep = 0;
                        eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
                    }
                }).setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });
        btnOllo.setOnClickListener(view -> {
            int i3 = rnd.nextInt(3);
            if(i3 == 0){
                gepKep.setImageResource(R.drawable.rock);
                Toast.makeText(getApplicationContext(),"A gép nyert!", Toast.LENGTH_SHORT).show();
                gep ++;
                eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
            }
            else if(i3 == 1){
                gepKep.setImageResource(R.drawable.paper);
                Toast.makeText(getApplicationContext(),"Az ember nyert!", Toast.LENGTH_SHORT).show();
                ember++;
                eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
            }
            else{
                gepKep.setImageResource(R.drawable.scissors);
                Toast.makeText(getApplicationContext(),"Döntetlen", Toast.LENGTH_SHORT).show();
            }
            kep.setImageResource(R.drawable.scissors);
            if(ember == 3 || gep == 3){
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                if(ember == 3){
                    builder.setTitle("Győzelem");
                }
                else {
                    builder.setTitle("Vereség");
                }
                builder.setMessage("Szeretne új játékot játszani?").setPositiveButton("Igen", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ember = 0;
                        gep = 0;
                        eredmeny.setText("Eredmény: Ember: "+ember+" Computer: "+gep);
                    }
                }).setNegativeButton("Nem", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });




    }
    private void init(){
        btnKo = findViewById(R.id.btnko);
        btnPapir = findViewById(R.id.btnpapir);
        btnOllo = findViewById(R.id.btnollo);
        eredmeny = findViewById(R.id.eredmenySzoveg);
        kep = findViewById(R.id.valasztasKep);
        gepKep = findViewById(R.id.gepValasztas);
        rnd = new Random();
    }
}