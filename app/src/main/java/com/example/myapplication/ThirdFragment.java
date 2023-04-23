package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThirdFragment extends Fragment {

    private EditText fromSchool, fromWork;
    private Button button;
    private TextView name,surName,age,sex;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fromSchool = requireActivity().findViewById(R.id.et_fromSchool);
        fromWork = requireActivity().findViewById(R.id.et_fromWork);
        button = requireActivity().findViewById(R.id.btn_third);
        name = requireActivity().findViewById(R.id.tv_thirdName);
        surName = requireActivity().findViewById(R.id.tv_thirdSurName);
        age = requireActivity().findViewById(R.id.tv_thirdAge);
        sex = requireActivity().findViewById(R.id.tv_thirdSex);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                bundle.putString("fromSchool",fromSchool.getText().toString());
                bundle.putString("fromWork",fromWork.getText().toString());
                bundle.putString("age", age.getText().toString());
                bundle.putString("sex", sex.getText().toString());
                bundle.putString("name",name.getText().toString());
                bundle.putString("surName",surName.getText().toString());
                FourthFragment fragment = new FourthFragment();
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
        String resultAge = getArguments().getString("age");
        age.setText(resultAge);
        String resultSex = getArguments().getString("sex");
        sex.setText(resultSex);



    }
}