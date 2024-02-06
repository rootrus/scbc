package com.scb.phone.view.adapter.easycash.viewholder;

import android.view.View;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.easycash.CustomCreditCardPageSelector;
import p040o.onStart;

public final class AccountDebitSelectorViewHolder_ViewBinding implements Unbinder {
    private AccountDebitSelectorViewHolder MediaBrowserCompat$ItemReceiver;

    public AccountDebitSelectorViewHolder_ViewBinding(AccountDebitSelectorViewHolder accountDebitSelectorViewHolder, View view) {
        this.MediaBrowserCompat$ItemReceiver = accountDebitSelectorViewHolder;
        accountDebitSelectorViewHolder.cardSelector = (CustomCreditCardPageSelector) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_selector, "field 'cardSelector'", CustomCreditCardPageSelector.class);
    }

    public final void read() {
        AccountDebitSelectorViewHolder accountDebitSelectorViewHolder = this.MediaBrowserCompat$ItemReceiver;
        if (accountDebitSelectorViewHolder != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            accountDebitSelectorViewHolder.cardSelector = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
