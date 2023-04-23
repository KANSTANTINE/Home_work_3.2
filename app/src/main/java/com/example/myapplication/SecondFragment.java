package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.TaskExecutor;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondFragment extends Fragment {

    private EditText age, sex;
    private TextView name, surName;
    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        age = requireActivity().findViewById(R.id.et_age);
        sex = requireActivity().findViewById(R.id.et_Sex);
        name = requireActivity().findViewById(R.id.tv_secondName);
        surName = requireActivity().findViewById(R.id.tv_secondSurName);
        button = requireActivity().findViewById(R.id.btn_second);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("age", age.getText().toString());
                bundle.putString("sex", sex.getText().toString());
                bundle.putString("name",name.getText().toString());
                bundle.putString("surName",surName.getText().toString());
                ThirdFragment fragment = new ThirdFragment();
                fragment.setArguments(bundle);
                requireActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.conteinaer,fragment)
                        .addToBackStack(null)
                        .commit();
            }
        });


        String resultName = getArguments().getString("name");
        name.setText(resultName);
        String resultSurName = getArguments().getString("surName");
        surName.setText(resultSurName);


    }
}