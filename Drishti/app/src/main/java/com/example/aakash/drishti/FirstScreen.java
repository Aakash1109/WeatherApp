package com.example.aakash.drishti;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FirstScreen extends Fragment implements View.OnClickListener {
    private View mView;
    Button button1, button2, button3,button4;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstScreen() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView= inflater.inflate(R.layout.fragment_first_screen, container, false);
        button1=(Button)mView.findViewById(R.id.one);
        button1.setOnClickListener(this);
        button2=(Button)mView.findViewById(R.id.two);
        button2.setOnClickListener(this);
        button3=(Button)mView.findViewById(R.id.three);
        button3.setOnClickListener(this);
        button4=(Button)mView.findViewById(R.id.four);
        button4.setOnClickListener(this);
        return mView;
    }


    @Override
    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.one:
                Intent intent = new Intent(getActivity(),GestureActivity.class);
                startActivity(intent);
                break;
            case R.id.two:
                Intent intent1 = new Intent(getActivity(),CurrentDateTime.class);
                startActivity(intent1);
                break;
            case R.id.three:
                Intent intent2 = new Intent(getActivity(),LocationTracker.class);
                startActivity(intent2);
                break;
            case R.id.four:
                Intent intent3 = new Intent(getActivity(),PhoneBook.class);
                startActivity(intent3);
                break;

        }
    }
}