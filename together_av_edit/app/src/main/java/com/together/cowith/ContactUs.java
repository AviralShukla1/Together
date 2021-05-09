package com.together.cowith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ContactUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);
    }

    public void callInsta(View view){
        openurl("https://www.instagram.com/aurtisticservices/");
        // startActivity(new Intent(this, Social.class));
    }

    public void callYoutube(View view){
        openurl("https://www.youtube.com/channel/UCDduqjscyySZk0sLRrLa5iQ");
        // startActivity(new Intent(this, Social.class));
    }

    public void callFacebook(View view){
        openurl("https://www.facebook.com/aurtisticservices/");
        // startActivity(new Intent(this, Social.class));
    }

    public void callLinkedin(View view){
        openurl("https://www.linkedin.com/company/aurtistic-services/?viewAsMember=true");
        // startActivity(new Intent(this, Social.class));
    }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}