package com.example.adam.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FormFillActivity extends AppCompatActivity {

    public static final String USERNAME_KEY = "USERNAME";
    public static final String AGE_KEY = "USERAGE";
    public static final String EMAIL_KEY = "USEREMAIL";
    public static final String USERPHONENUM ="USERPHONENUM";



    private TextView mTextViewForm;
    private EditText mNameField;
    private EditText mAgeField;
    private EditText mEmailField;
    private EditText mPhoneField;
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_fill);

        mNameField = (EditText)findViewById(R.id.form_fill_name);
        mAgeField = (EditText)findViewById(R.id.form_fill_age);
        mEmailField = (EditText)findViewById(R.id.form_fill_email);
        mPhoneField = (EditText)findViewById(R.id.form_fill_phone);
        mSubmitButton = (Button)findViewById(R.id.form_submit_button);


        mTextViewForm =(TextView)findViewById(R.id.berserk_title_form);
        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/butcherman_regular.ttf");
        mTextViewForm.setTypeface(tf);
    }
    public void onSubmitPressed(View view){
        String userName = mNameField.getText().toString();
        String userAge = mAgeField.getText().toString();
        String userEmail = mEmailField.getText().toString();
        String userPhoneNumber = mPhoneField.getText().toString();

       // String output = "Hello "+userName+ " you are "+userAge+" your phone number is "+userPhoneNumber+" and your email is "+userEmail+".\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t I am coming to kill you.";

        //Toast.makeText(this, output, Toast.LENGTH_LONG).show();

        Bundle bundle = new Bundle();
        bundle.putString(USERNAME_KEY, userName);
        bundle.putString(AGE_KEY, userAge);
        bundle.putString(EMAIL_KEY, userEmail);
        bundle.putString(USERPHONENUM, userPhoneNumber);

        //create the intent and adding the bundle
        Intent intent = new Intent(this, DisplayInfoActivity.class);

        //starting the intent
        intent.putExtras(bundle);

        startActivity(intent);
    }
}
