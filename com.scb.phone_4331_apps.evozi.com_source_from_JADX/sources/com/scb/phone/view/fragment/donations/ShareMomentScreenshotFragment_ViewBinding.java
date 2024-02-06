package com.scb.phone.view.fragment.donations;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class ShareMomentScreenshotFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ShareMomentScreenshotFragment write;

    public ShareMomentScreenshotFragment_ViewBinding(ShareMomentScreenshotFragment shareMomentScreenshotFragment, View view) {
        super(shareMomentScreenshotFragment, view);
        this.write = shareMomentScreenshotFragment;
        shareMomentScreenshotFragment.mTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'mTitle'", TextView.class);
        shareMomentScreenshotFragment.mSubText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_text, "field 'mSubText'", TextView.class);
        shareMomentScreenshotFragment.mSharingImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sharing_image, "field 'mSharingImage'", ImageView.class);
        shareMomentScreenshotFragment.mSharingLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sharing_logo, "field 'mSharingLogo'", ImageView.class);
    }

    public final void read() {
        ShareMomentScreenshotFragment shareMomentScreenshotFragment = this.write;
        if (shareMomentScreenshotFragment != null) {
            this.write = null;
            shareMomentScreenshotFragment.mTitle = null;
            shareMomentScreenshotFragment.mSubText = null;
            shareMomentScreenshotFragment.mSharingImage = null;
            shareMomentScreenshotFragment.mSharingLogo = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
