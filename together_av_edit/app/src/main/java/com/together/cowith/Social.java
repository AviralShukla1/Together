package com.together.cowith;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Social extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
    }

    public void callUsername1(View view){
        openurl("https://instagram.com/plasmadonors.delhi?igshid=vmgpwseyno5z");
    }

    public void callUsername2(View view){
        openurl("https://instagram.com/plasmadonor.lucknow?igshid=g80ww2iatfcy");
    }

    public void callUsername3(View view){
        openurl("https://instagram.com/findplasmadonor?igshid=1ika9py5dbzmj");
    }

    public void callUsername4(View view){
        openurl("https://instagram.com/plasmadonors.mumbai?igshid=1ky6k8vfsjea3");
    }

    public void callUsername5(View view){
        openurl("https://instagram.com/needplasma?igshid=1m3xyu5ual7fn");
    }

    public void callUsername6(View view){
        openurl("https://instagram.com/plasmadonors.allahabad?igshid=1erptqhapxdqa");
    }

    public void callUsername7(View view){
        openurl("https://instagram.com/plasmadonors.vadodara?igshid=rgpx66tp2pxh");
    }

    public void callUsername8(View view){
        openurl("https://instagram.com/bangaloreplasmadonor?igshid=1mq37zbdmp4c0");
    }

    public void callUsername9(View view){
        openurl("https://instagram.com/covidaidresources?igshid=2hcmsggow8qq");
    }

    public void callUsername10(View view){
        openurl("https://instagram.com/preventcovid19?igshid=1gqd98bdekrqr");
    }

    public void callUsername11(View view){
        openurl("https://instagram.com/puneplasmadonors?igshid=1017t2d3jyye1");
    }

    public void callUsername12(View view){
        openurl("https://instagram.com/bangaloreplasmadonor?igshid=1wky8lxrlvat5");
    }

    public void callUsername13(View view){
        openurl("https://www.instagram.com/p/CN940PnnRKj/?igshid=1f3v84vqdn91n");
    }

    public void callUsername14(View view){
        openurl("https://instagram.com/covid_helpcentre?igshid=16sb0zaomcq3n");
    }

    public void callUsername15(View view){
        openurl("https://instagram.com/covidsupport2021?igshid=tqg4xadivwks");
    }

    public void callUsername16(View view){
        openurl("https://instagram.com/covid19help2021?igshid=1bq2w3va82s3n");
    }

    public void callUsername17(View view){
        openurl("https://instagram.com/coronahelps19?igshid=knnfndidm3jp");
    }

    public void callUsername18(View view){
        openurl("https://instagram.com/cov.id911?igshid=6492f44bpo0s");
    }

    public void callUsername19(View view){
        openurl("https://instagram.com/covid_resources?igshid=p487lh9v227k");
    }

    public void callUsername20(View view){
        openurl("https://instagram.com/covidverifiedleads?igshid=18r1zz3oi9tsq");
    }

    public void callUsername21(View view){
        openurl("https://instagram.com/covidhelpindia?igshid=hbmu26l2qzpj");
    }

    public void callUsername22(View view){
        openurl("https://instagram.com/humanity_fights_covid?igshid=dum2y6cy07r9");
    }

    public void callUsername23(View view){
        openurl("https://instagram.com/covid_upin?igshid=1o1vusc4w4kzs");
    }

    public void callUsername24(View view){
        openurl("https://instagram.com/covid_kanpur?igshid=693r8ckyxwt1");
    }

    public void callUsername25(View view){
        openurl("https://instagram.com/kanpuriyabhaiya?igshid=m41w57x8htrv");
    }

    public void callUsername26(View view){
        openurl("https://instagram.com/kanpurbeautiful?igshid=1cyuibrzd6yqv");
    }

    public void callUsername27(View view){
        openurl("https://instagram.com/kolkatafightscovid19?igshid=1vv1pybk3s72h");
    }

    public void callUsername28(View view){
        openurl("https://instagram.com/covid.delhi?igshid=jov4d1no1l11");
    }

    public void callUsername29(View view){
        openurl("https://instagram.com/delhicovidhelpline?igshid=pew8abamqbqw");
    }

    public void callUsername30(View view){
        openurl("https://instagram.com/covidresourcesdelhi?igshid=ag7x6bbg5a4k");
    }


    public void openurl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}