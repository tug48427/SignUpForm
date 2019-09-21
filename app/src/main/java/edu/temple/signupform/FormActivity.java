package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText uName = findViewById(R.id.userName);
        final EditText email = findViewById(R.id.email);
        final EditText password = findViewById(R.id.pass);
        final EditText conPassword= findViewById(R.id.conPass);




        Button clickSave = findViewById(R.id.saveButton);

        clickSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getUName = uName.getText().toString();
                String getEmail = email.getText().toString();
                String getPass = password.getText().toString();
                String getConPass = conPassword.getText().toString();
                if (getUName.equals("")){
                    Toast.makeText(FormActivity.this,"Missing Username",Toast.LENGTH_SHORT).show();
                }
                else if (getEmail.equals("")){
                    Toast.makeText(FormActivity.this,"Missing Email",Toast.LENGTH_SHORT).show();
                }else if (getPass.equals("")){
                    Toast.makeText(FormActivity.this,"Missing Password",Toast.LENGTH_SHORT).show();
                }else if (getConPass.equals("")){
                    Toast.makeText(FormActivity.this,"Missing Confirm Password",Toast.LENGTH_SHORT).show();
                }


                else if(getPass.equals(getConPass)==false){
                    Toast.makeText(FormActivity.this,"Missing Confirm Password",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(FormActivity.this,"Welcome, "+getUName+", to the SignUpForm App"
                            ,Toast.LENGTH_LONG).show();

                }




            }


        });






    }
}