package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.Contacts.SettingsColumns.KEY;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message = intent.getStringExtra("KEY");

        TextView view = findViewById(R.id.textView4);
        view.setText(message);


        Button button = findViewById(R.id.buttonHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();
            }
        });
    }

         public void openNewActivity() {
            Intent intent1 = new Intent(SecondActivity.this, ThirdActivity.class);
        }


        Button button2 = findViewById(R.id.buttonAbout);

        Intent intent2 = new Intent(SecondActivity.this,FourthActivity.class);



    }
