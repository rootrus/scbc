package com.scb.phone.view.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class OnBoardingTutorialActivity_ViewBinding extends BaseActivity_ViewBinding {
    private OnBoardingTutorialActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public OnBoardingTutorialActivity_ViewBinding(final OnBoardingTutorialActivity onBoardingTutorialActivity, View view) {
        super(onBoardingTutorialActivity, view);
        this.IconCompatParcelizer = onBoardingTutorialActivity;
        onBoardingTutorialActivity.mRootLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'mRootLayout'", RelativeLayout.class);
        onBoardingTutorialActivity.mOnBoardingTutorialViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.on_boarding_tutorial_view_pager, "field 'mOnBoardingTutorialViewPager'", ViewPager.class);
        onBoardingTutorialActivity.mOnBoardingTutorialIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.on_boarding_tutorial_indicator, "field 'mOnBoardingTutorialIndicator'", CircleIndicator.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.skip_tutorial_image_view, "field 'mSkipImageView' and method 'closeTutorial'");
        onBoardingTutorialActivity.mSkipImageView = (ImageView) onStart.write(IconCompatParcelizer2, R.id.skip_tutorial_image_view, "field 'mSkipImageView'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnBoardingTutorialActivity.this.closeTutorial();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.next_tutorial_image_view, "field 'mNextTutorialImageView' and method 'onNextTutorialButtonClick'");
        onBoardingTutorialActivity.mNextTutorialImageView = (ImageView) onStart.write(IconCompatParcelizer3, R.id.next_tutorial_image_view, "field 'mNextTutorialImageView'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnBoardingTutorialActivity.this.onNextTutorialButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.previous_tutorial_image_view, "field 'mPreviousTutorialImageView' and method 'onPreviousTutorialButtonClick'");
        onBoardingTutorialActivity.mPreviousTutorialImageView = (ImageView) onStart.write(IconCompatParcelizer4, R.id.previous_tutorial_image_view, "field 'mPreviousTutorialImageView'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                OnBoardingTutorialActivity.this.onPreviousTutorialButtonClick();
            }
        });
    }

    public final void read() {
        OnBoardingTutorialActivity onBoardingTutorialActivity = this.IconCompatParcelizer;
        if (onBoardingTutorialActivity != null) {
            this.IconCompatParcelizer = null;
            onBoardingTutorialActivity.mRootLayout = null;
            onBoardingTutorialActivity.mOnBoardingTutorialViewPager = null;
            onBoardingTutorialActivity.mOnBoardingTutorialIndicator = null;
            onBoardingTutorialActivity.mSkipImageView = null;
            onBoardingTutorialActivity.mNextTutorialImageView = null;
            onBoardingTutorialActivity.mPreviousTutorialImageView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
