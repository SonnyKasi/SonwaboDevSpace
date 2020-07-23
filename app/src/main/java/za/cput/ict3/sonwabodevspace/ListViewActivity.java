package za.cput.ict3.sonwabodevspace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    Button button;
    ListView lv;
    Context context;
    ArrayList myHandles;

    public static final Integer [] handleImages = {
            R.drawable.avata,R.drawable.telephone,R.drawable.email,R.drawable.linkedin,R.drawable.github,
    };

    public static String [] myHandle = new String[]{
            "Sonwabo Kasi", "0826811442", "glanzo3@gmail.com", "https://www.linkedin.com/in/sonwabo-kasi-751b6741/", "https://github.com/SonnyKasi/SonwaboDevSpace"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        button = (Button)findViewById(R.id.buttonBack3) ;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListViewActivity.this, SecondActivity.class);
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
                Toast.makeText(ListViewActivity.this, "You clicked:" + handleImages[position], Toast.LENGTH_SHORT).show();

            }
        });
    }
}
