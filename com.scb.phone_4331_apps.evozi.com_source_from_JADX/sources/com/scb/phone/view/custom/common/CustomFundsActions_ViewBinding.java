package com.scb.phone.view.custom.common;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomFundsActions_ViewBinding implements Unbinder {
    private CustomFundsActions MediaBrowserCompat$CustomActionResultReceiver;

    public CustomFundsActions_ViewBinding(CustomFundsActions customFundsActions, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customFundsActions;
        customFundsActions.purchaseButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.funds_purchase_button, "field 'purchaseButton'", DefaultButton.class);
        customFundsActions.redeemButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.funds_redeem_button, "field 'redeemButton'", DefaultButton.class);
        customFundsActions.switchButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.funds_switch_button, "field 'switchButton'", DefaultButton.class);
    }

    public final void read() {
        CustomFundsActions customFundsActions = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customFundsActions != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customFundsActions.purchaseButton = null;
            customFundsActions.redeemButton = null;
            customFundsActions.switchButton = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
