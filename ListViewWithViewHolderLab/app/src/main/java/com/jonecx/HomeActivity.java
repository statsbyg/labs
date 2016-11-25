package com.jonecx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.list_view)
    ListView list;

    private String[] myDataSet;
    private ListViewAdapter listViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        myDataSet = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupitor", "Saturn"};

        listViewAdapter = new ListViewAdapter(myDataSet);
        list.setAdapter(listViewAdapter);
    }
}
