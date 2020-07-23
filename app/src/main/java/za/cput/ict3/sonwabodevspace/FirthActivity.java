package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class FirthActivity extends AppCompatActivity {
    Button button;
    ListView lv;
    Context context;
    ArrayList myHandles;

        public static final Integer [] handleImages = {
                R.drawable.avata,R.drawable.telephone,R.drawable.email,R.drawable.linkedin,R.drawable.github,
        };

        public static String [] myHandle = {
             "Sonwabo Kasi", "0826811442", "glanzo3@gmail.com","https://www.linkedin.com/in/sonwabo-kasi-751b6741/","https://github.com/SonnyKasi/SonwaboDevSpace"
        };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firth);

        button = (Button)findViewById(R.id.buttonBack3) ;
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirthActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });

        //calls my adapter
        Adapter myListAdapter = new Adapter(this, myHandle, handleImages);
        lv = (ListView) findViewById(R.id.ListView2);
        lv.setAdapter(myListAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(FirthActivity.this, "You clicked:" + handleImages[position], Toast.LENGTH_SHORT).show();

            }
        });



       /* ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("https://www.instagram.com/slicksolly/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        ImageView imageView1 = (ImageView) findViewById(R.id.imageView);
        imageView1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri uri = Uri.parse("");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });*/


    }

}
