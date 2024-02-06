package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.BindView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.custom.easycash.CustomAccountSelector;
import p040o.onGetStartedClick;

public abstract class AccountSelectorViewHolder extends AccountHeaderViewHolder {
    public boolean PlaybackStateCompat = true;
    @BindView
    public CustomAccountSelector accountSelector;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountSelectorViewHolder(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
    }
}
