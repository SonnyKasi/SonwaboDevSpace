package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: Home screen
 */

public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.buttonNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent =new Intent(v.getContext(),SecondActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText1);
        message = editText.getText().toString();
        Intent sendName = new Intent(MainActivity.this, SecondActivity.class);
        sendName.putExtra("EXTRA_MESSAGE",message);
        startActivity(intent);

            }
        });

    }
}
