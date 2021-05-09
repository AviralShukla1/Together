package com.together.cowith;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Web extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
    }

    public void callWeb1(View view){
        openurl("https://external.sprinklr.com/insights/explorer/dashboard/601b9e214c7a6b689d76f493/tab/10?id=DASHBOARD_601b9e214c7a6b689d76f493");
    }

    public void callWeb2(View view){
        openurl("https://covid-resources-chi.vercel.app/");
    }

    public void callWeb3(View view){
        openurl("https://covid19.uk.gov.in/bedssummary.aspx");
    }

    public void callWeb4(View view){
        openurl("https://u07.ihxpro.in/");
    }

    public void callWeb5(View view){
        openurl("https://plasmadonors.thebetterindia.com/");
    }

    public void callWeb6(View view){
        openurl("https://covidplasma.online/");
    }

    public void callWeb7(View view){
        openurl("https://rahatup.in/Home/NodalOfficerControlRoom");
    }

    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}