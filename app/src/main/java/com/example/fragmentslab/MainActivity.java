package com.example.fragmentslab;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    private Button btnFragmentOne;
    private Button btnFragmentTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragmentOne = findViewById(R.id.btn_fragment_one);
        btnFragmentTwo = findViewById(R.id.btn_fragment_two);

        if (savedInstanceState == null) {
            loadFragment(new FragmentOne());
        }

        btnFragmentOne.setOnClickListener(v -> loadFragment(new FragmentOne()));
        btnFragmentTwo.setOnClickListener(v -> loadFragment(new FragmentTwo()));
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .addToBackStack(null)
                .commit();
    }
}