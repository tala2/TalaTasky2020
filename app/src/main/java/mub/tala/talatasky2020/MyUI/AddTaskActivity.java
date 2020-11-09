package mub.tala.talatasky2020.MyUI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import mub.tala.talatasky2020.Data.MyTask;
import mub.tala.talatasky2020.R;
//1. design addTask XML
public class AddTaskActivity extends AppCompatActivity {
    //2.
    private EditText etitTitle, etSubject;
    private SeekBar skbrImportant, skbrNeccesary;
    private Button btnSave;
    private ImageButton imgBtn1;
    private Button btnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //3. find view by id
        setContentView(R.layout.activity_add_task2);
        etitTitle = findViewById(R.id.etTittle);
        etSubject = findViewById(R.id.etSubject);
        //etDueDate=findViewById(R.id.etDueDate);
        skbrImportant = findViewById(R.id.skrbrImportant);
        //skbrNeccesary=findViewById(R.id.skbrNeccesry);
        btnSave = findViewById(R.id.btnSave);
        imgBtn1 = findViewById(R.id.imgBtn);
        btnUpload = findViewById(R.id.btnUpload);
        //4. listeners
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //5
    public void validateForm() {
        String title = etitTitle.getText().toString();
        String subject = etSubject.getText().toString();
        int imp = skbrImportant.getProgress();
        int nec = skbrNeccesary.getProgress();
        boolean isOk = true;
        if (title.length() == 0) {
            isOk = false;
            etitTitle.setError("at least one char");
        }
        if (isOk) {
            //6. save on firebase
            //6.1 build your data object
            MyTask myTask = new MyTask();
            myTask.setTitle(title);
            myTask.setSub(subject);
            myTask.setNecessary(nec);
            myTask.setImportant(imp);
            //6.2
            saveTask(myTask);
        }
    }
    //6.3 request to save my task (firebase database)
    private void saveTask(MyTask myTask){
        //1.
        FirebaseDatabase database=FirebaseDatabase.getInstance();
        //2.
        DatabaseReference reference= database.getReference();
        //3.User id
        FirebaseAuth auth=FirebaseAuth.getInstance();
        String uid=auth.getCurrentUser().getUid();
        //4. My Object key
        String key=reference.child("All Task").push().getKey();
        //5.
        myTask.setOwner(uid);
        myTask.setKey(key);

    }
}