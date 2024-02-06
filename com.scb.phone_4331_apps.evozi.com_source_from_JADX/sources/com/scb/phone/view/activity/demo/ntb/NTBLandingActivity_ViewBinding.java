package com.scb.phone.view.activity.demo.ntb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.roughike.bottombar.BottomBar;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.DraggableFloatingActionButton;
import p040o.onStart;

public class NTBLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private NTBLandingActivity MediaBrowserCompat$CustomActionResultReceiver;

    public NTBLandingActivity_ViewBinding(NTBLandingActivity nTBLandingActivity, View view) {
        super(nTBLandingActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = nTBLandingActivity;
        nTBLandingActivity.mBottomNavigationView = (BottomBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bottom_nav, "field 'mBottomNavigationView'", BottomBar.class);
        nTBLandingActivity.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root, "field 'mRootView'", RelativeLayout.class);
        nTBLandingActivity.mFragmentContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fragment_container_home, "field 'mFragmentContainer'", FrameLayout.class);
        nTBLandingActivity.tutorialView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tutorial_view, "field 'tutorialView'", FrameLayout.class);
        nTBLandingActivity.tutorialImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tutorial_image_view, "field 'tutorialImageView'", ImageView.class);
        nTBLandingActivity.mBlurBackgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.blur_background_image_view, "field 'mBlurBackgroundImageView'", ImageView.class);
        nTBLandingActivity.ntbButton = (DraggableFloatingActionButton) onStart.IconCompatParcelizer(view, R.id.fab, "field 'ntbButton'", DraggableFloatingActionButton.class);
    }

    public final void read() {
        NTBLandingActivity nTBLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (nTBLandingActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            nTBLandingActivity.mBottomNavigationView = null;
            nTBLandingActivity.mRootView = null;
            nTBLandingActivity.mFragmentContainer = null;
            nTBLandingActivity.tutorialView = null;
            nTBLandingActivity.tutorialImageView = null;
            nTBLandingActivity.mBlurBackgroundImageView = null;
            nTBLandingActivity.ntbButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
