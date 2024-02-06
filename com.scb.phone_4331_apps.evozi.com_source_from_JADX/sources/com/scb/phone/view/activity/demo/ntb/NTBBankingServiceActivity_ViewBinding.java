package com.scb.phone.view.activity.demo.ntb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.DraggableFloatingActionButton;
import p040o.onStart;

public class NTBBankingServiceActivity_ViewBinding extends BaseActivity_ViewBinding {
    private NTBBankingServiceActivity MediaBrowserCompat$CustomActionResultReceiver;

    public NTBBankingServiceActivity_ViewBinding(NTBBankingServiceActivity nTBBankingServiceActivity, View view) {
        super(nTBBankingServiceActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = nTBBankingServiceActivity;
        nTBBankingServiceActivity.mRootView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root, "field 'mRootView'", FrameLayout.class);
        nTBBankingServiceActivity.tutorialView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tutorial_view, "field 'tutorialView'", FrameLayout.class);
        nTBBankingServiceActivity.tutorialImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tutorial_image_view, "field 'tutorialImageView'", ImageView.class);
        nTBBankingServiceActivity.ntbButton = (DraggableFloatingActionButton) onStart.IconCompatParcelizer(view, R.id.fab, "field 'ntbButton'", DraggableFloatingActionButton.class);
    }

    public final void read() {
        NTBBankingServiceActivity nTBBankingServiceActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (nTBBankingServiceActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            nTBBankingServiceActivity.mRootView = null;
            nTBBankingServiceActivity.tutorialView = null;
            nTBBankingServiceActivity.tutorialImageView = null;
            nTBBankingServiceActivity.ntbButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
