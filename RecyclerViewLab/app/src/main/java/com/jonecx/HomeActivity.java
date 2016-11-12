package com.jonecx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView recyclerView;

    RecyclerView.Adapter recyclerAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        String[] myDataSet = {"Mercury", "Venus", "Earth", "Mars", "Jupitor", "Saturn"};

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        // user a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // specify and adapter
        recyclerAdapter = new MyAdapter(myDataSet);
        recyclerView.setAdapter(recyclerAdapter);

    }
}
