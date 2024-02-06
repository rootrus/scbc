package com.scb.phone.view.fragment.easycash;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashReferralSendDfwFragment_ViewBinding extends BaseEasycashReferralSendFragment_ViewBinding {
    private EasycashReferralSendDfwFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public EasycashReferralSendDfwFragment_ViewBinding(final EasycashReferralSendDfwFragment easycashReferralSendDfwFragment, View view) {
        super(easycashReferralSendDfwFragment, view);
        this.IconCompatParcelizer = easycashReferralSendDfwFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_send, "method 'onSendButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashReferralSendDfwFragment.this.onSendButtonClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
