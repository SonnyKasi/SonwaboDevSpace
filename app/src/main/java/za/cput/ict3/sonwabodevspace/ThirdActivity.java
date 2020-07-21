package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class ThirdActivity extends AppCompatActivity {
    Button button;
    TextInputEditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        button = (Button)findViewById(R.id.buttonCalc);
        text  = (TextInputEditText) findViewById(R.id.numInput);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        try
                        {
                            int result = Integer.parseInt(text.getText().toString())/Integer.parseInt(text.getText().toString());
                            // show it to them
                            Log.v("EditText", "result is "+result);

                            Toast.makeText(getApplicationContext(),"result is "+result,
                                    Toast.LENGTH_LONG).show();
                        }
                        catch (final NumberFormatException e)
                        {
                            // tell them they didnt enter a valid number
                            Toast.makeText(getApplicationContext(),"Please Enter a valid number",
                                    Toast.LENGTH_LONG).show();
                        }
                    }
    });
}
}

