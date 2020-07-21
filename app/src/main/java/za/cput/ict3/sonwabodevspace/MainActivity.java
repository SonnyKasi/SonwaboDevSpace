package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String message = getIntent().getStringExtra("KEY");
        EditText editText1 = findViewById(R.id.editText1);
        //TextView textView2 = findViewById(R.id.textView2);
       // TextView textView3 = findViewById(R.id.textView3);
        editText1.setText(message);
       // textView2.setText(name);
       // textView3.setText(name);

        final Button button = findViewById(R.id.button1);
        final EditText text = findViewById(R.id.editText1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                String message = text.getText().toString();
                intent.putExtra("KEY",message);
                startActivity(intent);

            }
        });

    }
}
