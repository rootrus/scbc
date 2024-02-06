package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwCurrentUserEwalletActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwCurrentUserEwalletActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public MwCurrentUserEwalletActivity_ViewBinding(final MwCurrentUserEwalletActivity mwCurrentUserEwalletActivity, View view) {
        super(mwCurrentUserEwalletActivity, view);
        this.MediaBrowserCompat$ItemReceiver = mwCurrentUserEwalletActivity;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_mw_add_wallet, "method 'onAddWalletClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwCurrentUserEwalletActivity.this.onAddWalletClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
