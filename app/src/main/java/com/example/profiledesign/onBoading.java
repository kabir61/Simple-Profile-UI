package com.example.profiledesign;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;



public class onBoading extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //first slider
        addSlide(AppIntroFragment.newInstance(
                "Welcome Mission Travel 2020 App Intro",
                "Amazing Mission Travel 2020 App with Amazing Cool Features",
                R.drawable.first,ContextCompat.getColor(getApplicationContext(),R.color.first_color)));
//second slider
        addSlide(AppIntroFragment.newInstance(
                "All Features in one App",
                "Add Your App Features and What's new in Your App",
                R.drawable.second, ContextCompat.getColor(getApplicationContext(),R.color.second_color)));
//third slider
        addSlide(AppIntroFragment.newInstance(
                "Get Started",
                "Enjoy Your App",
                R.drawable.third, ContextCompat.getColor(getApplicationContext(),R.color.third_color)));

    }
    @Override
    public void onSkipPressed( Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        startActivity(new Intent(getApplicationContext(), SignIn.class));
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        startActivity(new Intent(getApplicationContext(), SignIn.class));
        finish();
    }
}