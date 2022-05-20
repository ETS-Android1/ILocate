package com.fpk.ilocate;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("ILOCATEFRAGMENT","onCreateView accessed");
        return inflater.inflate(R.layout.fragment_ilocate,
                container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("ILOCATEFRAGMENT","onViewCreated accessed");
        constraintLayoutiLocate=(ConstraintLayout) view.
                findViewById(R.id.constraintLayoutiLocate);
        earth =(ImageView)view.findViewById(R.id.imageViewEarth);
        buttonSettings=(ImageButton)view.findViewById(R.id.imageButtonSettings);
        buttonLocate=(ImageButton)view.findViewById(R.id.imageButtonLocate);
        buttonSearch=(ImageButton)view.findViewById(R.id.imageButtonSearch);
        buttonServiceCar=(ImageButton)view.findViewById(R.id.imageButtonServiceCar);

        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "button settings clicked",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
