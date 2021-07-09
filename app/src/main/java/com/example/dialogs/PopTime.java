package com.example.dialogs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import androidx.fragment.app.DialogFragment;

public class PopTime extends DialogFragment implements View.OnClickListener {

    View view;
    DatePicker datePicker;
    TimePicker timePicker;
    Button button;
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.pop_time,container,false);
        datePicker=view.findViewById(R.id.datePicker);
        button=view.findViewById(R.id.button2);
        button.setOnClickListener(this::onClick);
        return view;
    }

    @Override
    public void onClick(View v) {

    this.dismiss();
    //for time
    /*String timeOn=timePicker.getHour()+""+timePicker.getMinute();*/
    //for date
    String timeOn=datePicker.getYear()+"-"+datePicker.getMonth()+"-"+datePicker.getDayOfMonth();
    MainActivity mainActivity=(MainActivity)getActivity();
    mainActivity.SetTime(timeOn);
    }


}
