package mub.tala.talatasky2020.Data;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

//Adapter
public class MyTaskAdapte extends ArrayAdapter<MyTask>
{
    public MyTaskAdapte(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
