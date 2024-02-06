package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwManageWalletActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwManageWalletActivity IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public MwManageWalletActivity_ViewBinding(final MwManageWalletActivity mwManageWalletActivity, View view) {
        super(mwManageWalletActivity, view);
        this.IconCompatParcelizer = mwManageWalletActivity;
        mwManageWalletActivity.tvPrivacyConsent = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_wallet_privacy_consent, "field 'tvPrivacyConsent'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tv_mw_manage_shop_info, "method 'clickManageShopInfo'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwManageWalletActivity.this.clickManageShopInfo();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.tv_mw_manage_pin, "method 'clickManagePin'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwManageWalletActivity.this.clickManagePin();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.tv_mw_manage_shop_account, "method 'clickManageShopAccount'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwManageWalletActivity.this.clickManageShopAccount();
            }
        });
    }

    public final void read() {
        MwManageWalletActivity mwManageWalletActivity = this.IconCompatParcelizer;
        if (mwManageWalletActivity != null) {
            this.IconCompatParcelizer = null;
            mwManageWalletActivity.tvPrivacyConsent = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
