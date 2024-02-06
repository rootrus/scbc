package com.scb.phone.view.activity.demo.ntb;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class IntroductionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private IntroductionActivity MediaBrowserCompat$ItemReceiver;

    public IntroductionActivity_ViewBinding(final IntroductionActivity introductionActivity, View view) {
        super(introductionActivity, view);
        this.MediaBrowserCompat$ItemReceiver = introductionActivity;
        introductionActivity.introductionContainer = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.introduction_overlay, "field 'introductionContainer'", RelativeLayout.class);
        introductionActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.introduction_view_pager, "field 'viewPager'", ViewPager.class);
        introductionActivity.indicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.introduction_indicator, "field 'indicator'", CircleIndicator.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.skip_tutorial_image_view, "method 'closeIntroduction'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                IntroductionActivity.this.closeIntroduction();
            }
        });
    }

    public final void read() {
        IntroductionActivity introductionActivity = this.MediaBrowserCompat$ItemReceiver;
        if (introductionActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            introductionActivity.introductionContainer = null;
            introductionActivity.viewPager = null;
            introductionActivity.indicator = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
