package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ThirdActivity extends AppCompatActivity {
    Button button,button2;
    EditText num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button = (Button)findViewById(R.id.buttonCalculate);
        num1 = (EditText) findViewById(R.id.editText3);
        num2 = (EditText) findViewById(R.id.editText2);



        button2 = (Button)findViewById(R.id.buttonBack) ;
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
                ;
            }
        });

               button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        try
                        {
                            int result = Integer.parseInt(num1.getText().toString())/Integer.parseInt(num2.getText().toString());
                            // show it to them
                            Log.v("EditText", "result is "+result);

                            Toast.makeText(getApplicationContext(),"result is "+result,
                                    Toast.LENGTH_LONG).show();
                        }
                        catch (final NumberFormatException e)
                        {
                            // tell them they didn't enter a valid number
                            Toast.makeText(getApplicationContext(),"Please Enter a valid number",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
    });
}}

   /* private void openPreviousActivity() {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }/**/


