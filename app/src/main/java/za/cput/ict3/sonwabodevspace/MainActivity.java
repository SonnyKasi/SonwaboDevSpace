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
    public static final String EXTRA_MESSAGE = "za\\cput\\ict3\\sonwabodevspace" ;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //final String message = getIntent().getStringExtra("KEY");
        //EditText editText = findViewById(R.id.editText1);
       // editText.setText(message);
        Intent intent = new Intent(this, SecondActivity.class);
        final EditText editText = (EditText) findViewById(R.id.editText1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        //startActivity(intent);

        final Button button = findViewById(R.id.buttonNext);
        //final EditText text = findViewById(R.id.editText1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                String message =  editText.getText().toString();
                intent.putExtra("KEY",message);
                startActivity(intent);

            }
        });

    }
}
