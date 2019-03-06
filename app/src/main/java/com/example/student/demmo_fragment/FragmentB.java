package com.example.student.demmo_fragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentB extends Fragment {
    EditText edtfb;
    Button btnfb;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b,container,false);
        edtfb = (EditText)view.findViewById(R.id.edt_fragb);
        btnfb = (Button) view.findViewById(R.id.btn_fragb);

        btnfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edta = (EditText)getActivity().findViewById(R.id.edt_fraga);
                edta.setText(edtfb.getText());
            }
        });
        return view;
    }
}
