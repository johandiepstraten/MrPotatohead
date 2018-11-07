package com.example.johan.mr_potatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState); // always call super
        outState.putInt("Hat", findViewById(R.id.Hat).getVisibility());
        outState.putInt("Eyebrows", findViewById(R.id.Eyebrows).getVisibility());
        outState.putInt("Nose", findViewById(R.id.Nose).getVisibility());
        outState.putInt("Arms", findViewById(R.id.Arms).getVisibility());
        outState.putInt("Mustache", findViewById(R.id.Mustache).getVisibility());
        outState.putInt("Eyes", findViewById(R.id.Eyes).getVisibility());
        outState.putInt("Glasses", findViewById(R.id.Glasses).getVisibility());
        outState.putInt("Mouth", findViewById(R.id.Mouth).getVisibility());
        outState.putInt("Ears", findViewById(R.id.Ears).getVisibility());
        outState.putInt("Shoes", findViewById(R.id.Shoes).getVisibility());
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            int sHat = savedInstanceState.getInt("Hat");
            if (sHat == 0)   {
                ImageView Hat = (ImageView) findViewById(R.id.Hat);
                Hat.setVisibility(View.VISIBLE);
            }
            int sEyebrows = savedInstanceState.getInt("Eyebrows");
            if (sEyebrows == 0)   {
                ImageView Eyebrows = (ImageView) findViewById(R.id.Eyebrows);
                Eyebrows.setVisibility(View.VISIBLE);
            }
            int sNose = savedInstanceState.getInt("Nose");
            if (sNose == 0)   {
                ImageView Nose = (ImageView) findViewById(R.id.Nose);
                Nose.setVisibility(View.VISIBLE);
            }
            int sArms = savedInstanceState.getInt("Arms");
            if (sArms == 0)   {
                ImageView Arms = (ImageView) findViewById(R.id.Arms);
                Arms.setVisibility(View.VISIBLE);
            }
            int sMustache = savedInstanceState.getInt("Mustache");
            if (sMustache == 0)   {
                ImageView Mustache = (ImageView) findViewById(R.id.Mustache);
                Mustache.setVisibility(View.VISIBLE);
            }
            int sEyes = savedInstanceState.getInt("Eyes");
            if (sEyes == 0)   {
                ImageView Eyes = (ImageView) findViewById(R.id.Eyes);
                Eyes.setVisibility(View.VISIBLE);
            }
            int sGlasses = savedInstanceState.getInt("Glasses");
            if (sGlasses == 0)   {
                ImageView Glasses = (ImageView) findViewById(R.id.Glasses);
                Glasses.setVisibility(View.VISIBLE);
            }
            int sMouth = savedInstanceState.getInt("Mouth");
            if (sMouth == 0)   {
                ImageView Mouth = (ImageView) findViewById(R.id.Mouth);
                Mouth.setVisibility(View.VISIBLE);
            }
            int sEars = savedInstanceState.getInt("Ears");
            if (sEars == 0)   {
                ImageView Ears = (ImageView) findViewById(R.id.Ears);
                Ears.setVisibility(View.VISIBLE);
            }
            int sShoes = savedInstanceState.getInt("Shoes");
            if (sShoes == 0)   {
                ImageView Shoes = (ImageView) findViewById(R.id.Shoes);
                Shoes.setVisibility(View.VISIBLE);
            }
        }
    }

    public void checkClicked(View v) {
        CheckBox checkbox = (CheckBox) v;

        if (checkbox.isChecked()) {
            Log.d("potato", "checkClicked: " + String.valueOf(v.getId()));
            String part = checkbox.getText().toString();
            switch (part)   {
                case "Hat":
                    ImageView Hat = (ImageView) findViewById(R.id.Hat);
                    Hat.setVisibility(View.VISIBLE);
                    break;
                case "Eyebrows":
                    ImageView Eyebrows = (ImageView) findViewById(R.id.Eyebrows);
                    Eyebrows.setVisibility(View.VISIBLE);
                    break;
                case "Nose":
                    ImageView Nose = (ImageView) findViewById(R.id.Nose);
                    Nose.setVisibility(View.VISIBLE);
                    break;
                case "Arms":
                    ImageView Arms = (ImageView) findViewById(R.id.Arms);
                    Arms.setVisibility(View.VISIBLE);
                    break;
                case "Mustache":
                    ImageView Mustache = (ImageView) findViewById(R.id.Mustache);
                    Mustache.setVisibility(View.VISIBLE);
                    break;
                case "Eyes":
                    ImageView Eyes = (ImageView) findViewById(R.id.Eyes);
                    Eyes.setVisibility(View.VISIBLE);
                    break;
                case "Glasses":
                    ImageView Glasses = (ImageView) findViewById(R.id.Glasses);
                    Glasses.setVisibility(View.VISIBLE);
                    break;
                case "Mouth":
                    ImageView Mouth = (ImageView) findViewById(R.id.Mouth);
                    Mouth.setVisibility(View.VISIBLE);
                    break;
                case "Ears":
                    ImageView Ears = (ImageView) findViewById(R.id.Ears);
                    Ears.setVisibility(View.VISIBLE);
                    break;
                case "Shoes":
                    ImageView Shoes = (ImageView) findViewById(R.id.Shoes);
                    Shoes.setVisibility(View.VISIBLE);
                    break;
            }
        } else {
            Log.d("potato", "checkClicked: " + String.valueOf(v.getId()));
            String part = checkbox.getText().toString();
            switch (part)   {
                case "Hat":
                    ImageView Hat = (ImageView) findViewById(R.id.Hat);
                    Hat.setVisibility(View.INVISIBLE);
                    break;
                case "Eyebrows":
                    ImageView Eyebrows = (ImageView) findViewById(R.id.Eyebrows);
                    Eyebrows.setVisibility(View.INVISIBLE);
                    break;
                case "Nose":
                    ImageView Nose = (ImageView) findViewById(R.id.Nose);
                    Nose.setVisibility(View.INVISIBLE);
                    break;
                case "Arms":
                    ImageView Arms = (ImageView) findViewById(R.id.Arms);
                    Arms.setVisibility(View.INVISIBLE);
                    break;
                case "Mustache":
                    ImageView Mustache = (ImageView) findViewById(R.id.Mustache);
                    Mustache.setVisibility(View.INVISIBLE);
                    break;
                case "Eyes":
                    ImageView Eyes = (ImageView) findViewById(R.id.Eyes);
                    Eyes.setVisibility(View.INVISIBLE);
                    break;
                case "Glasses":
                    ImageView Glasses = (ImageView) findViewById(R.id.Glasses);
                    Glasses.setVisibility(View.INVISIBLE);
                    break;
                case "Mouth":
                    ImageView Mouth = (ImageView) findViewById(R.id.Mouth);
                    Mouth.setVisibility(View.INVISIBLE);
                    break;
                case "Ears":
                    ImageView Ears = (ImageView) findViewById(R.id.Ears);
                    Ears.setVisibility(View.INVISIBLE);
                    break;
                case "Shoes":
                    ImageView Shoes = (ImageView) findViewById(R.id.Shoes);
                    Shoes.setVisibility(View.INVISIBLE);
                    break;
            }
        }
    }
}
