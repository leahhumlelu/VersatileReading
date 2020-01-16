package com.example.versatilereading;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MainFragment extends Fragment implements View.OnClickListener {
    NavController navController;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController = Navigation.findNavController(view);
        view.findViewById(R.id.one_time_btn).setOnClickListener(this);
        view.findViewById(R.id.subscription_btn).setOnClickListener(this);
    }

    public void purchaseOneArticle(){
        navController.navigate(R.id.action_mainFragment_to_oneTImeFragment);
    }


    public void createSubscription(){
        navController.navigate(R.id.action_mainFragment_to_subscriptionFragment);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one_time_btn:
                purchaseOneArticle();
                break;
            case R.id.subscription_btn:
                createSubscription();
                break;
        }
    }
}
