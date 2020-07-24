package za.cput.ict3.sonwabodevspace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: Menu screen
 */

public class SecondActivity extends AppCompatActivity{

   Button button1,button2,button3,button4;
   TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Intent intent = getIntent();
        //String getName = intent.getStringExtra("EXTRA_MESSAGE");

        textView1 = findViewById(R.id.textView4);
        textView1.setText("Greetings ");

        textView3 = findViewById(R.id.textView);
        textView3.setText(getIntent().getStringExtra("EXTRA_MESSAGE"));

        textView2 = findViewById(R.id.textView5);

        Button button1 = findViewById(R.id.buttonHome);
        Button button2 = findViewById(R.id.buttonCalculate);
        Button button3 = findViewById(R.id.buttonAbout);
        Button button4 = findViewById(R.id.buttonDevProfile);


        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, FirthActivity.class);
                startActivity(intent);

            }
        });

    }

}
/*
 * @Override public void onClick(View v) {
 * switch (v.getId()) {
 * case R.id.buttonHome:
 * Intent intent = new Intent(SecondActivity.this, MainActivity.class);
 * startActivity(intent);
 * break;
 * case R.id.buttonCalculate:
 * intent = new Intent(SecondActivity.this, ThirdActivity.class);
 * startActivity(intent);
 * break;
 * case R.id.buttonAbout:
 * intent = new Intent(SecondActivity.this, FourthActivity.class);
 * startActivity(intent);
 * break;
 * case R.id.buttonDevProfile:
 * intent = new Intent(SecondActivity.this, FirthActivity.class);
 * startActivity(intent);
 * break;
 * default:
 * throw new IllegalStateException("Unexpected value: " + v.getId());
 * }
 * }
 * }*/
