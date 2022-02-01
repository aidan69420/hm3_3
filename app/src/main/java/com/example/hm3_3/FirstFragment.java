package com.example.hm3_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hm3_3.databinding.FragmentFifthBinding;
import com.example.hm3_3.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {
    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.buttonOfFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = binding.etoffirst.getText().toString();
                Bundle bundle= new Bundle();
                Log.d("Ray", a);
                bundle.putString("fragment", a);
                SecondFragment secondFragment = new SecondFragment();
                secondFragment.setArguments(bundle);
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container_fragment, secondFragment).commit();
            }
        });
    }
}