package com.scb.phone.view.activity.donations;

import android.view.View;
import android.widget.FrameLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class SharingMomentsPreviewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private SharingMomentsPreviewActivity write;

    public SharingMomentsPreviewActivity_ViewBinding(SharingMomentsPreviewActivity sharingMomentsPreviewActivity, View view) {
        super(sharingMomentsPreviewActivity, view);
        this.write = sharingMomentsPreviewActivity;
        sharingMomentsPreviewActivity.fragmentContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fragment_container, "field 'fragmentContainer'", FrameLayout.class);
    }

    public final void read() {
        SharingMomentsPreviewActivity sharingMomentsPreviewActivity = this.write;
        if (sharingMomentsPreviewActivity != null) {
            this.write = null;
            sharingMomentsPreviewActivity.fragmentContainer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
