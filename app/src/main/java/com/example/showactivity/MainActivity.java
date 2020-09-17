package com.example.showactivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View.OnClickListener;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private Button show;
    EditText male,female;
    TextView fi;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowResult();
            }
        });
        show = (Button)findViewById(R.id.btnid);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, secondactivity.class);
                startActivity(intent);
    }
            });
    }
    @SuppressLint("ResourceType")
    public void ShowResult(){

        male = (EditText)findViewById(R.id.editText);
        female = (EditText)findViewById(R.id.editText2);
        fi = (TextView)findViewById(R.id.textView);
        String f = female.getText().toString().toLowerCase();
        String m = male.getText().toString().toLowerCase();

        if(f.equals("tirtha") && m.equals("sagar"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else if(f.equals("riya") && m.equals("shashank"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else if (f.equals("jay") && m.equals("messi"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else if(f.equals("dhwani") && m.equals("dharven"))
        {
            fi.setVisibility(View.VISIBLE);
            fi.setText(R.integer.show_integer);
        }
        else
        {


            String sum = m + f;
            sum = sum.toLowerCase();
            int value = sum.hashCode();

            Random random = new Random(value);
            if (f.equals("") || m.equals("")) {
                Toast.makeText(MainActivity.this, "ENTER NAME", Toast.LENGTH_LONG).show();
            }
            else{
                fi.setVisibility(View.VISIBLE);
                fi.setText(String.valueOf(random.nextInt(100)));

            }
        }

    }

        }

