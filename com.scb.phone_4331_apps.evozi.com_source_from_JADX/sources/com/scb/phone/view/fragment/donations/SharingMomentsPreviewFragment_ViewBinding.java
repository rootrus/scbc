package com.scb.phone.view.fragment.donations;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class SharingMomentsPreviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private SharingMomentsPreviewFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public SharingMomentsPreviewFragment_ViewBinding(final SharingMomentsPreviewFragment sharingMomentsPreviewFragment, View view) {
        super(sharingMomentsPreviewFragment, view);
        this.IconCompatParcelizer = sharingMomentsPreviewFragment;
        sharingMomentsPreviewFragment.mTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text, "field 'mTitle'", TextView.class);
        sharingMomentsPreviewFragment.mSubText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sub_text, "field 'mSubText'", TextView.class);
        sharingMomentsPreviewFragment.mSharingImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sharing_image, "field 'mSharingImage'", ImageView.class);
        sharingMomentsPreviewFragment.mSharingLogo = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sharing_logo, "field 'mSharingLogo'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.share_button, "method 'shareMoment'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                SharingMomentsPreviewFragment.this.shareMoment();
            }
        });
    }

    public final void read() {
        SharingMomentsPreviewFragment sharingMomentsPreviewFragment = this.IconCompatParcelizer;
        if (sharingMomentsPreviewFragment != null) {
            this.IconCompatParcelizer = null;
            sharingMomentsPreviewFragment.mTitle = null;
            sharingMomentsPreviewFragment.mSubText = null;
            sharingMomentsPreviewFragment.mSharingImage = null;
            sharingMomentsPreviewFragment.mSharingLogo = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
