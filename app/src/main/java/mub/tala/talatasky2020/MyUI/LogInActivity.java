package mub.tala.talatasky2020.MyUI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import mub.tala.talatasky2020.R;

public class LogInActivity extends AppCompatActivity {

    private EditText etEmail,etPassword;
    private Button btnLogin,btnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassWord);
        btnLogin=findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);
    }
}