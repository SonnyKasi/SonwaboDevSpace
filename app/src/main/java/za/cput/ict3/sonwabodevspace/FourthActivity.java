package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: About screen
 */

public class FourthActivity extends AppCompatActivity {
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        button = (Button)findViewById(R.id.buttonBack2) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FourthActivity.this, SecondActivity.class);
                startActivity(intent);


    }
});

        textView= findViewById(R.id.textViewAbt);
        textView.setText(String.format("Hi, my name is Sonwabo Kasi. I am 3rd year student at CPUT, studying Applications Development. I have a passion for developing apps. I enjoy coding and resolving issues within a code.I have experience in web development, photoshop designing, video production. Also Javascript, Html and Java languages.I have worked with Inkathalo Foundation,Mzoli's and my own profile,creating websites,logos,and business cards.Besides codind I enjoy being outdoor,long drives along the coast. I also enjoy playing console game and also sportsI wish to open my own development company and a non-profit organisation to teach disadvantaged children codingThis world would be a better place if we look out for each other."));

    }
}