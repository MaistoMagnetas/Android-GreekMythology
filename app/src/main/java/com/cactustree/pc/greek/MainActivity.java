package com.cactustree.pc.greek;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MainActivity extends AppCompatActivity {
    public static Boolean isScrolling = true;
    InterstitialAd mInterstitialAd;
    GridView gridView;
    int titles[] = {R.string.main_gods,R.string.main_heroes,R.string.main_titans,R.string.main_creatures,R.string.main_myths,R.string.main_places,
            R.string.main_items,R.string.main_gigantes,R.string.main_zodiac,R.string.main_planets};

    int icons[] = {R.drawable.gods,R.drawable.heroes,R.drawable.titans,R.drawable.creatures,R.drawable.myths,R.drawable.places,
            R.drawable.items, R.drawable.gigantes,R.drawable.zodiac,R.drawable.planets};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().penaltyLog().build());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //banner ad
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        ///quit add
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-8551404096447570/2134295635");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdClosed() {
                super.onAdClosed();
                finish();
            }
        });


        gridView = (GridView) findViewById(R.id.gridview);
        final CustomAdapter adapter = new CustomAdapter(getApplicationContext(),titles,icons);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intentGods = new Intent(MainActivity.this,GodsActivity.class);
                        startActivity(intentGods);
                        break;
                    case 1:
                        Intent intentHeroes = new Intent(MainActivity.this,HeroesActivity.class);
                        startActivity(intentHeroes);
                        break;
                    case 2:
                        Intent intentTitans = new Intent(MainActivity.this,Titans.class);
                        startActivity(intentTitans);
                        break;
                    case 3:
                        Intent intentCreatures = new Intent(MainActivity.this,Creatures.class);
                        startActivity(intentCreatures);
                        break;
                    case 4:
                        Intent intentMyths = new Intent(MainActivity.this,MythsActivity.class);
                        startActivity(intentMyths);
                        break;
                    case 5:
                        Intent intentPlaces = new Intent(MainActivity.this,Places.class);
                        startActivity(intentPlaces);
                        break;
                    case 6:
                        Intent intentItems = new Intent(MainActivity.this,Items.class);
                        startActivity(intentItems);
                        break;
                    case 7:
                        Intent intentGigantes = new Intent(MainActivity.this,Gigantes.class);
                        startActivity(intentGigantes);
                        break;
                    case 8:
                        Intent intentZodiac = new Intent(MainActivity.this,Zodiac.class);
                        startActivity(intentZodiac);
                        break;
                    case 9:
                        Intent intentPlanets = new Intent(MainActivity.this,Planets.class);
                        startActivity(intentPlanets);
                        break;
                    default:
                        Toast.makeText(MainActivity.this, "NO intent found", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    public void showInterstitial(){
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {
            Log.d("TAG", "The interstitial wasn't loaded yet.");
        }
    }

    @Override
    public void onBackPressed() {
        showInterstitial();
    }

}
