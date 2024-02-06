package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import p040o.onStart;

public class AccountHeaderViewHolder_ViewBinding implements Unbinder {
    private AccountHeaderViewHolder IconCompatParcelizer;

    public AccountHeaderViewHolder_ViewBinding(AccountHeaderViewHolder accountHeaderViewHolder, View view) {
        this.IconCompatParcelizer = accountHeaderViewHolder;
        accountHeaderViewHolder.textHeader = (CustomEasyCashSectionLabel) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_header, "field 'textHeader'", CustomEasyCashSectionLabel.class);
    }

    public void read() {
        AccountHeaderViewHolder accountHeaderViewHolder = this.IconCompatParcelizer;
        if (accountHeaderViewHolder != null) {
            this.IconCompatParcelizer = null;
            accountHeaderViewHolder.textHeader = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
