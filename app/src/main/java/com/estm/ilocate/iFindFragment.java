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

public class iFindFragment extends Fragment {
    private ImageView earth2;
    private ImageButton buttonServiceCar2;
    private ImageButton buttonNearBy;
    private ImageButton buttonMyLocations;
    private ConstraintLayout constraintLayoutiFind;

    public iFindFragment() {
        super(R.layout.fragment_ifind);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_ifind,container,
                false);
        constraintLayoutiFind=(ConstraintLayout)rootView.findViewById(R.id.constraintLayoutiFind);
        earth2=(ImageView)rootView.findViewById(R.id.imageViewEarth2);
        buttonServiceCar2=(ImageButton) rootView.findViewById(R.id.imageButtonServiceCar2);
        buttonNearBy=(ImageButton)rootView.findViewById(R.id.imageButtonNearBy);
        buttonMyLocations=(ImageButton)rootView.findViewById(R.id.imageButtonMyLocations);

        return (ViewGroup) inflater.inflate(
                R.layout.fragment_ifind, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState); }
}
