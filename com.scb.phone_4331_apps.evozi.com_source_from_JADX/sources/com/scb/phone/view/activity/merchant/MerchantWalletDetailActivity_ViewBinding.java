package com.scb.phone.view.activity.merchant;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class MerchantWalletDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MerchantWalletDetailActivity MediaBrowserCompat$CustomActionResultReceiver;

    public MerchantWalletDetailActivity_ViewBinding(MerchantWalletDetailActivity merchantWalletDetailActivity, View view) {
        super(merchantWalletDetailActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = merchantWalletDetailActivity;
        merchantWalletDetailActivity.scrollView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.scroll_view, "field 'scrollView'", NestedScrollView.class);
    }

    public final void read() {
        MerchantWalletDetailActivity merchantWalletDetailActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (merchantWalletDetailActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            merchantWalletDetailActivity.scrollView = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
