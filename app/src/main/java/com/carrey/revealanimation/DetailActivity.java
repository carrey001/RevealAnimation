package com.carrey.revealanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.carrey.revealanimation.lib.RevealActivityAnimationHelper;
import com.carrey.revealanimation.lib.RevealAnimationHelper;
import com.carrey.revealanimation.lib.ViewLocationHelp;
import com.carrey.revealanimation.lib.circularReveal.widget.RevealFrameLayout;


/**
 * 类描述：
 * 创建人：angelo
 * 创建时间：10/16/15 3:34 PM
 */
public class DetailActivity extends AppCompatActivity {
    private RevealAnimationHelper mHelper;
    private ViewLocationHelp help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (getIntent().getExtras() != null) {
            help = (ViewLocationHelp) getIntent().getSerializableExtra(RevealActivityAnimationHelper.KEY_REVEAL_ACTIVITY_HELPER);
//            if (mHelper != null) {
//                setTheme(R.style.AppThemeTransparentActivity);
//            }
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

//        if (mHelper != null) {
        RevealFrameLayout rootView = (RevealFrameLayout) findViewById(R.id.root_layout);
        mHelper = new RevealAnimationHelper(help);
        mHelper.onActivityCreate(rootView, (ImageView) rootView.findViewById(R.id.targetView), null);
//        }
    }

}
