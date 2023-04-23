package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    private EditText et_name, et_surName;
    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @SuppressLint("CutPasteId")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et_name = requireActivity().findViewById(R.id.et_firstName);
        et_surName = requireActivity().findViewById(R.id.et_first_surName);
        button = requireActivity().findViewById(R.id.btn_first);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("name",et_name.getText().toString());
                bundle.putString("surName",et_surName.getText().toString());
                SecondFragment fragment = new SecondFragment();
                fragment.setArguments(bundle);
                requireActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.conteinaer,fragment)
                        .addToBackStack(null)
                        .commit();

            }
        });

    }
}