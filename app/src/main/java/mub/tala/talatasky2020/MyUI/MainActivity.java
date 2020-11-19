package mub.tala.talatasky2020.MyUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import mub.tala.talatasky2020.Data.MyTaskAdapte;
import mub.tala.talatasky2020.R;

public class MainActivity extends AppCompatActivity {
    private ImageButton ibtnAdd;
    //1 after building the arry adapter
    ListView lstTask;
    //adapter
    MyTaskAdapte taskAdapte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ibtnAdd=findViewById(R.id.btnAdd);
        //LISTNER
        ibtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,AddTaskActivity.class);
                startActivity(i);
            }
        });
        //3.
        lstTask=findViewById(R.id.listTask);
        //4.
        taskAdapte=new MyTaskAdapte(getBaseContext(),R.layout.item_task_view);
        //5.
        lstTask.setAdapter(taskAdapte);
    }

}

