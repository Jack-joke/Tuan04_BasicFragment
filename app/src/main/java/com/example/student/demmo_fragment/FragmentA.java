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

public class FragmentA extends Fragment {
    EditText edtfa;
    Button btnfa;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        edtfa = (EditText) view.findViewById(R.id.edt_fraga);
        btnfa = (Button) view.findViewById(R.id.btn_fraga);

        btnfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtMain = (EditText) getActivity().findViewById(R.id.edt_change);
                edtMain.setText(edtfa.getText());

            }
        });
        return view;

    }
}
