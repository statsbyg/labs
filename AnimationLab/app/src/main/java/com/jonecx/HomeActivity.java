package com.jonecx;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        imageView.setVisibility(View.VISIBLE);
        fadeOut(imageView);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
        isFirstImage = true;
    }

    private void fadeOut(final ImageView imageView){
        imageView.animate()
                .alpha(0f)
                .setDuration(1800)
                .setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        imageView.setVisibility(View.INVISIBLE);
                        imageView.setAlpha(1f);
                    }
                }).start();
    }
}
