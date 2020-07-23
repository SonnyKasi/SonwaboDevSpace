package za.cput.ict3.sonwabodevspace;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/**
 * Author: Sonwabo Kasi
 * Class: Part Time
 * Student number: 214293939
 * Class Description: Custom Adapter
 */
public class Adapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String [] myHandle;
    private final Integer[] handleImages;

    public Adapter(Activity context, String[] myHandle, Integer[] handleImages)
    {
        super(context,R.layout.activity_list_view,myHandle);
        this.context = context;
        this.myHandle = myHandle;
        this.handleImages = handleImages;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = context.getLayoutInflater();
        View rowView = layoutInflater.inflate(R.layout.activity_list_view,null,true);
        TextView textTitle = (TextView) rowView.findViewById(R.id.textView7);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView2);
        textTitle.setText(myHandle[position]);
        imageView.setImageResource(handleImages[position]);
        return rowView;
    }

}
