package com.example.salscrudato.taskmanager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by salscrudato on 2/4/15.
 */
public class TaskAdapter extends ArrayAdapter<String>{
    private Context mContext;
    private ArrayList<String> mtasks;
    public TaskAdapter(Context context, ArrayList<String> tasks){
        super(context, R.layout.row_layout, tasks);
        mContext = context;
        mtasks = tasks;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        if(convertView == null) {
            LayoutInflater inflator = LayoutInflater.from(mContext);
            rowView = inflator.inflate(R.layout.row_layout, parent, false);
        }else {
            rowView = convertView;
        }

        TextView taskItem = (TextView) rowView.findViewById(R.id.textView1);
        taskItem.setText(mtasks.get(position));

        return rowView;
    }

}
