package com.scb.phone.view.activity.hml;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class HmlSimulatorTutorialActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private HmlSimulatorTutorialActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlSimulatorTutorialActivity_ViewBinding(final HmlSimulatorTutorialActivity hmlSimulatorTutorialActivity, View view) {
        super(hmlSimulatorTutorialActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlSimulatorTutorialActivity;
        hmlSimulatorTutorialActivity.mRootLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'mRootLayout'", RelativeLayout.class);
        hmlSimulatorTutorialActivity.mSimulatorTutorialViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.simulator_tutorial_view_pager, "field 'mSimulatorTutorialViewPager'", ViewPager.class);
        hmlSimulatorTutorialActivity.mSimulatorTutorialIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.simulator_tutorial_indicator, "field 'mSimulatorTutorialIndicator'", CircleIndicator.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.skip_tutorial_image_view, "field 'mSkipImageView' and method 'closeTutorial'");
        hmlSimulatorTutorialActivity.mSkipImageView = (ImageView) onStart.write(IconCompatParcelizer2, R.id.skip_tutorial_image_view, "field 'mSkipImageView'", ImageView.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlSimulatorTutorialActivity.this.closeTutorial();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.next_tutorial_image_view, "field 'mNextTutorialImageView' and method 'onNextTutorialButtonClick'");
        hmlSimulatorTutorialActivity.mNextTutorialImageView = (ImageView) onStart.write(IconCompatParcelizer3, R.id.next_tutorial_image_view, "field 'mNextTutorialImageView'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlSimulatorTutorialActivity.this.onNextTutorialButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.previous_tutorial_image_view, "field 'mPreviousTutorialImageView' and method 'onPreviousTutorialButtonClick'");
        hmlSimulatorTutorialActivity.mPreviousTutorialImageView = (ImageView) onStart.write(IconCompatParcelizer4, R.id.previous_tutorial_image_view, "field 'mPreviousTutorialImageView'", ImageView.class);
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlSimulatorTutorialActivity.this.onPreviousTutorialButtonClick();
            }
        });
    }

    public final void read() {
        HmlSimulatorTutorialActivity hmlSimulatorTutorialActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlSimulatorTutorialActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlSimulatorTutorialActivity.mRootLayout = null;
            hmlSimulatorTutorialActivity.mSimulatorTutorialViewPager = null;
            hmlSimulatorTutorialActivity.mSimulatorTutorialIndicator = null;
            hmlSimulatorTutorialActivity.mSkipImageView = null;
            hmlSimulatorTutorialActivity.mNextTutorialImageView = null;
            hmlSimulatorTutorialActivity.mPreviousTutorialImageView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
