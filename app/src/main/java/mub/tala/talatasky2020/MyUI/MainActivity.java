package mub.tala.talatasky2020.MyUI;

import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import mub.tala.talatasky2020.R;

public class MainActivity extends AppCompatActivity {
    private ImageButton ibtnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibtnAdd=findViewById(R.id.btn);
    }

}

