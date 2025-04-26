package com.example.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CalendarAdapter extends BaseAdapter {

    private Context context;
    private String[] dates;

    public CalendarAdapter(Context context, String[] dates) {
        this.context = context;
        this.dates = dates;
    }

    @Override
    public int getCount() {
        return dates != null ? dates.length : 0; // Safe check for null dates
    }

    @Override
    public Object getItem(int position) {
        return dates != null ? dates[position] : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            // Make sure to inflate the correct item layout
            convertView = LayoutInflater.from(context).inflate(R.layout.item_calendar_date, parent, false);
        }

        TextView textViewDate = convertView.findViewById(R.id.textViewDate);
        String date = dates != null && position < dates.length ? dates[position] : "";

        if (date.isEmpty()) {
            textViewDate.setVisibility(View.INVISIBLE); // Hide empty spaces
        } else {
            textViewDate.setVisibility(View.VISIBLE);
            textViewDate.setText(date);
        }

        return convertView;
    }
}
