package com.example.adam.academytutorialapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayInfoActivity extends AppCompatActivity {

    private TextView mTextInfoActivity;
    private TextView mTextInfoActivityEnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_info);


        mTextInfoActivity =(TextView)findViewById(R.id.berserk_title_form);
        mTextInfoActivityEnd =(TextView)findViewById(R.id.berserk_end_form);

        Typeface tf = Typeface.createFromAsset(getAssets(),"fonts/butcherman_regular.ttf");
        mTextInfoActivity.setTypeface(tf);
        mTextInfoActivityEnd.setTypeface(tf);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String userName = bundle.getString(FormFillActivity.USERNAME_KEY);
        String userAge = bundle.getString(FormFillActivity.AGE_KEY);
        String userEmail = bundle.getString(FormFillActivity.EMAIL_KEY);
        String userPhonenum = bundle.getString(FormFillActivity.USERPHONENUM);

        TextView displayName = (TextView) findViewById(R.id.name_view_display);
        displayName.setText(userName);

        TextView displayAge = (TextView) findViewById(R.id.age_view_display);
        displayAge.setText(userAge);

        TextView displayEmail = (TextView) findViewById(R.id.email_view_display);
        displayEmail.setText(userEmail);

        TextView displayPhonenum = (TextView) findViewById(R.id.phonenum_view_display);
        displayPhonenum.setText(userPhonenum);

    }
}
