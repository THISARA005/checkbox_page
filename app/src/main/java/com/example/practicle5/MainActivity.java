package com.example.practicle5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    CheckBox pizza,sandwich,pasta,burger;
    Button Odernow;
    ArrayList<String> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pizza=findViewById(R.id.checkBox1);
        sandwich=findViewById(R.id.checkBox2);
        pasta=findViewById(R.id.checkBox3);
        burger=findViewById(R.id.checkBox4);
        Odernow=findViewById(R.id.button);


//     pizza.setOnClickListener(new View.OnClickListener() {
//         @Override
//         public void onClick(View v) {
//             if (pizza.isChecked())
//                 list.add("Pizza");
//             else
//                 list.remove("Pizza");
//         }
//     });
//        sandwich.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (sandwich.isChecked())
//                    list.add("Sandwich");
//                else
//                    list.remove("Sandwich");
//            }
//        });
//        pasta.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (pasta.isChecked())
//                    list.add("Pasta");
//                else
//                    list.remove("Pasta");
//            }
//        });
//        burger.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (burger.isChecked())
//                    list.add("Burger");
//                else
//                    list.remove("Burger");
//            }
//        });
        if (pizza.isChecked()) {


            //list.add("pizza");
        }
        else {
            list.remove("Pizza");
        }

        Odernow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Your Orderd list is"+list, Toast.LENGTH_SHORT).show();
            }
        });

    }
}


