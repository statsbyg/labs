package com.jonecx;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListViewAdapter extends BaseAdapter {

    private String[] myDataSet;

    public ListViewAdapter(String[] myDataSet) {
        this.myDataSet = myDataSet;
    }

    @Override
    public int getCount() {
        return myDataSet.length > 0 ? myDataSet.length : 0;
    }

    @Override
    public Object getItem(int position) {
        return myDataSet[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
        ViewhHolder viewHolder = new ViewhHolder(v);
        viewHolder.textView.setText(myDataSet[position]);
        return v;
    }

    class ViewhHolder {

        @BindView(R.id.txt_content)
        TextView textView;

        public ViewhHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
