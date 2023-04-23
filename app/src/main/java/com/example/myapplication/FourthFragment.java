package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FourthFragment extends Fragment {

    private TextView name,surName,age,sex,fromSchool,fromWork;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        name = requireActivity().findViewById(R.id.tv_fourthName);
        surName = requireActivity().findViewById(R.id.tv_fourthSurName);
        age = requireActivity().findViewById(R.id.tv_fourthAge);
        sex = requireActivity().findViewById(R.id.tv_fourthSex);
        fromSchool = requireActivity().findViewById(R.id.tv_fourthFromSchool);
        fromWork = requireActivity().findViewById(R.id.tv_fourthFromWork);


        String resultName = getArguments().getString("name");
        name.setText(resultName);

        String resultSurName = getArguments().getString("surName");
        surName.setText(resultSurName);

        String resultAge = getArguments().getString("age");
        age.setText(resultAge);

        String resultSex = getArguments().getString("sex");
        sex.setText(resultSex);

        String resultFromSchool = getArguments().getString("fromSchool");
        fromSchool.setText(resultFromSchool);

        String resultFromWork = getArguments().getString("fromWork");
        fromWork.setText(resultFromWork);
    }
}