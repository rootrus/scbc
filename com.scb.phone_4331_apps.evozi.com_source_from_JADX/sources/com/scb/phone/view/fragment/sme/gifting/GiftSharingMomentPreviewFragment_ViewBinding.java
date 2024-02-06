package com.scb.phone.view.fragment.sme.gifting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class GiftSharingMomentPreviewFragment_ViewBinding implements Unbinder {
    private GiftSharingMomentPreviewFragment IconCompatParcelizer;
    private View write;

    public GiftSharingMomentPreviewFragment_ViewBinding(final GiftSharingMomentPreviewFragment giftSharingMomentPreviewFragment, View view) {
        this.IconCompatParcelizer = giftSharingMomentPreviewFragment;
        giftSharingMomentPreviewFragment.previewImg = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_share_moment_preview_img, "field 'previewImg'", ImageView.class);
        giftSharingMomentPreviewFragment.previewMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_share_moment_preview_msg, "field 'previewMsg'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.close, "method 'closeFragment'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GiftSharingMomentPreviewFragment.this.closeFragment();
            }
        });
    }

    public final void read() {
        GiftSharingMomentPreviewFragment giftSharingMomentPreviewFragment = this.IconCompatParcelizer;
        if (giftSharingMomentPreviewFragment != null) {
            this.IconCompatParcelizer = null;
            giftSharingMomentPreviewFragment.previewImg = null;
            giftSharingMomentPreviewFragment.previewMsg = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
