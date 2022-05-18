package com.estm.ilocate;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

public class iLocateFragment extends Fragment {
    private ImageView earth;
    private ImageButton buttonSettings;
    private ImageButton buttonLocate;
    private ImageButton buttonSearch;
    private ImageButton buttonServiceCar;
    private ConstraintLayout constraintLayoutiLocate;

    public iLocateFragment() {
        super(R.layout.fragment_ilocate);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_ilocate,
                container,false);
        constraintLayoutiLocate=(ConstraintLayout) rootView.
                findViewById(R.id.constraintLayoutiLocate);
        earth =(ImageView)rootView.findViewById(R.id.imageViewEarth);
        buttonSettings=(ImageButton)rootView.findViewById(R.id.imageButtonSettings);
        buttonLocate=(ImageButton)rootView.findViewById(R.id.imageButtonLocate);
        buttonSearch=(ImageButton)rootView.findViewById(R.id.imageButtonSearch);
        buttonServiceCar=(ImageButton)rootView.findViewById(R.id.imageButtonServiceCar);

        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
