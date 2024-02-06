package com.scb.phone.view.fragment.remittance;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public final class RemittanceSenderAddressReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RemittanceSenderAddressReviewFragment MediaBrowserCompat$ItemReceiver;

    public RemittanceSenderAddressReviewFragment_ViewBinding(RemittanceSenderAddressReviewFragment remittanceSenderAddressReviewFragment, View view) {
        super(remittanceSenderAddressReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = remittanceSenderAddressReviewFragment;
        remittanceSenderAddressReviewFragment.llSenderAddressInputContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_sender_address_input_container, "field 'llSenderAddressInputContainer'", LinearLayout.class);
        remittanceSenderAddressReviewFragment.tvSenderAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_sender_address, "field 'tvSenderAddress'", TextView.class);
        remittanceSenderAddressReviewFragment.btNext = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_next, "field 'btNext'", Button.class);
    }

    public final void read() {
        RemittanceSenderAddressReviewFragment remittanceSenderAddressReviewFragment = this.MediaBrowserCompat$ItemReceiver;
        if (remittanceSenderAddressReviewFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            remittanceSenderAddressReviewFragment.llSenderAddressInputContainer = null;
            remittanceSenderAddressReviewFragment.tvSenderAddress = null;
            remittanceSenderAddressReviewFragment.btNext = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
