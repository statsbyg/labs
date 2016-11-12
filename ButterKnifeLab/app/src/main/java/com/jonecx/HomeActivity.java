package com.jonecx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeActivity extends AppCompatActivity {

    private boolean isFirstImage;

    @BindView(R.id.img_view)
    ImageView imageView;

    @OnClick(R.id.btn_change_img)
    public void changeImageClicked(){
        if(isFirstImage) {
            isFirstImage = false;
            imageView.setImageResource(R.drawable.img_one);
        } else {
            isFirstImage = true;
            imageView.setImageResource(R.drawable.img_two);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        isFirstImage = true;
    }
}
