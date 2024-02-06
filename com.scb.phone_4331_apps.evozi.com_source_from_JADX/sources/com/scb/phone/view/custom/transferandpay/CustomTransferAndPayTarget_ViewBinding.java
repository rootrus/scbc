package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.ImageTextView;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onStart;

public class CustomTransferAndPayTarget_ViewBinding implements Unbinder {
    private CustomTransferAndPayTarget MediaBrowserCompat$CustomActionResultReceiver;

    public CustomTransferAndPayTarget_ViewBinding(CustomTransferAndPayTarget customTransferAndPayTarget, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customTransferAndPayTarget;
        customTransferAndPayTarget.mTargetNameTextView = (ImageTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_name_text_view, "field 'mTargetNameTextView'", ImageTextView.class);
        customTransferAndPayTarget.mTargetTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_label, "field 'mTargetTextView'", TextView.class);
        customTransferAndPayTarget.mDividerView = onStart.IconCompatParcelizer(view, R.id.target_divider_view, "field 'mDividerView'");
        customTransferAndPayTarget.mReferenceNumberTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_references_text_view, "field 'mReferenceNumberTextView'", TextView.class);
        customTransferAndPayTarget.mFavouriteIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_favourite_icon, "field 'mFavouriteIcon'", ImageView.class);
        customTransferAndPayTarget.mAddFavouriteButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_favourite_button, "field 'mAddFavouriteButton'", DefaultButton.class);
        customTransferAndPayTarget.mFavouriteName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_favourite_name_text_view, "field 'mFavouriteName'", TextView.class);
        customTransferAndPayTarget.targetInfoLayout = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.target_info_layout, "field 'targetInfoLayout'", FrameLayout.class);
        customTransferAndPayTarget.refNo1TextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_no_1_text_view, "field 'refNo1TextView'", TextView.class);
        customTransferAndPayTarget.refNo2TextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_no_2_text_view, "field 'refNo2TextView'", TextView.class);
        customTransferAndPayTarget.refNo3TextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_no_3_text_view, "field 'refNo3TextView'", TextView.class);
        customTransferAndPayTarget.mDividerSpace = onStart.IconCompatParcelizer(view, R.id.target_divider_space, "field 'mDividerSpace'");
    }

    public final void read() {
        CustomTransferAndPayTarget customTransferAndPayTarget = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customTransferAndPayTarget != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customTransferAndPayTarget.mTargetNameTextView = null;
            customTransferAndPayTarget.mTargetTextView = null;
            customTransferAndPayTarget.mDividerView = null;
            customTransferAndPayTarget.mReferenceNumberTextView = null;
            customTransferAndPayTarget.mFavouriteIcon = null;
            customTransferAndPayTarget.mAddFavouriteButton = null;
            customTransferAndPayTarget.mFavouriteName = null;
            customTransferAndPayTarget.targetInfoLayout = null;
            customTransferAndPayTarget.refNo1TextView = null;
            customTransferAndPayTarget.refNo2TextView = null;
            customTransferAndPayTarget.refNo3TextView = null;
            customTransferAndPayTarget.mDividerSpace = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
