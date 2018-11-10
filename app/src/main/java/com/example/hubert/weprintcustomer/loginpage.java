package com.example.hubert.weprintcustomer;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class loginpage extends Activity{

    private EditText Email;
    private EditText Password;
    private TextView Info;
    private Button Login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);

        Email = (EditText)findViewById(R.id.inputemail);
        Password = (EditText)findViewById(R.id.inputpassword);
        Info = (TextView)findViewById(R.id.errLabel);
        Login = (Button)findViewById(R.id.Blogin);

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View view)
            {
                validate(Email.getText().toString(), Password.getText().toString());
            }
        });

    }


    private void validate(String userEmail, String userPassword)
    {
        if((userEmail.equals("admin@weprint.com")) && (userPassword.equals("1234")))
        {
            Intent intent = new Intent(loginpage.this, Home.class);
            startActivity(intent);
        }
        else
        {
            Info.setVisibility(View.VISIBLE);
        }
    }

}
