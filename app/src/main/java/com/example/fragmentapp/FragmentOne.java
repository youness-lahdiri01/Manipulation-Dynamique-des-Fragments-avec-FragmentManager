package com.example.fragmentslab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    public FragmentOne() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, container, false);

        Button btnOne = view.findViewById(R.id.btn_one);
        btnOne.setOnClickListener(v ->
                Toast.makeText(getActivity(), "Bouton de Fragment One cliqué", Toast.LENGTH_SHORT).show()
        );

        return view;
    }
}