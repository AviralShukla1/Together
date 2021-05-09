package com.together.cowith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Dashboard extends AppCompatActivity {

    ImageView backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

    }

    public void callOxygen(View view){
        openurl("https://drive.google.com/drive/folders/1paCFq3_G-4TMXKjRAwsYn4vKKmyyoXxk?usp=sharing");
    }

    public void callPlasma(View view){
        openurl("https://drive.google.com/drive/folders/1IK3EMO5WAoVtlwKrEOm0NXY2GwsTHi_7?usp=sharing");
    }

    public void callWeb(View view){
       // openurl("https://drive.google.com/drive/folders/1IK3EMO5WAoVtlwKrEOm0NXY2GwsTHi_7?usp=sharing");
        startActivity(new Intent(this, Web.class));
    }

    public void callSocial(View view){
       // openurl("https://docs.google.com/spreadsheets/d/1JdXLqr2TQpZDsTZM7yR_iHvXsi2I1FtKhaoE1iaRp20/edit?usp=sharing");
        startActivity(new Intent(this, Social.class));
    }

    public void callDonor(View view){
         openurl("https://forms.gle/tW2Sqwfdwiq6nsNa8");
       // startActivity(new Intent(this, Social.class));
    }

    public void callAvlResources(View view){
        openurl("https://drive.google.com/drive/folders/16NXZamhCIGsDHYNdzZYptwr9XQz9ppH7?usp=sharing");
        // startActivity(new Intent(this, Social.class));
    }

    public void callContactUs(View view){
         startActivity(new Intent(this, ContactUs.class));
    }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}