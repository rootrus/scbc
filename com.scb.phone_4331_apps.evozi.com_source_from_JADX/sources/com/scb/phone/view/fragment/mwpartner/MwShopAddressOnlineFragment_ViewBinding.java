package com.scb.phone.view.fragment.mwpartner;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomAddressInput;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwShopAddressOnlineFragment_ViewBinding extends BaseShopAddressFragment_ViewBinding {
    private MwShopAddressOnlineFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;

    public MwShopAddressOnlineFragment_ViewBinding(final MwShopAddressOnlineFragment mwShopAddressOnlineFragment, View view) {
        super(mwShopAddressOnlineFragment, view);
        this.IconCompatParcelizer = mwShopAddressOnlineFragment;
        mwShopAddressOnlineFragment.facebookInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.facebook_input, "field 'facebookInput'", CustomAddressInput.class);
        mwShopAddressOnlineFragment.instagramInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.instagram_input, "field 'instagramInput'", CustomAddressInput.class);
        mwShopAddressOnlineFragment.lineInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.line_input, "field 'lineInput'", CustomAddressInput.class);
        mwShopAddressOnlineFragment.webInput = (CustomAddressInput) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.website_input, "field 'webInput'", CustomAddressInput.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_done, "method 'onDoneClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwShopAddressOnlineFragment.this.onDoneClick();
            }
        });
    }

    public final void read() {
        MwShopAddressOnlineFragment mwShopAddressOnlineFragment = this.IconCompatParcelizer;
        if (mwShopAddressOnlineFragment != null) {
            this.IconCompatParcelizer = null;
            mwShopAddressOnlineFragment.facebookInput = null;
            mwShopAddressOnlineFragment.instagramInput = null;
            mwShopAddressOnlineFragment.lineInput = null;
            mwShopAddressOnlineFragment.webInput = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
