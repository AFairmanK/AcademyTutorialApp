package com.example.adam.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mNameField;
    private TextView mTextView;
   // private TextView mTextViewForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText)findViewById(R.id.enter_name_field);
        mTextView = (TextView)findViewById(R.id.berserk_title);


        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/butcherman_regular.ttf");
        mTextView.setTypeface(tf);


    }
    public void onButtonClicked(View view){
        String enteredName = mNameField.getText().toString();
        Toast.makeText(this,"Hello there "+ enteredName, Toast.LENGTH_LONG).show(); //button method to show user name on click

    }
    public void onViewImageButton(View view) {
        // this code will start a new activity, will be triggered when the appropiate button has been pressed
        Intent intent = new Intent(this, DisplayImageActivity.class);

        //intent object taking two arguments, one the activity that is currently active and the second is the .class field with the activity that to be changed to

        startActivity(intent); //start new activity.
    }

    public void onSignUpButton(View view){
        Intent intent = new Intent(this, FormFillActivity.class);
        startActivity(intent);
    }

    public void omGalleryButtonClicked(View view) {
        Intent intent = new Intent(this, ImageGridActivity.class);
        startActivity(intent);
    }
}
