package robfernandes.xyz.newchat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private TextView signUpText;
    private Button logInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        setClickListeners();
    }

    private void initializeViews() {
        email = findViewById(R.id.activity_main_email);
        password = findViewById(R.id.activity_main_password);
        signUpText = findViewById(R.id.activity_main_sign_up_text);
        logInBtn = findViewById(R.id.activity_main_log_in_btn);
    }


    private void setClickListeners() {
        signUpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}
