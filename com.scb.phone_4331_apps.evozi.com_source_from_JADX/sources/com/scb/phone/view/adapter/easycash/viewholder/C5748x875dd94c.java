package com.scb.phone.view.adapter.easycash.viewholder;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.scb.phone.view.adapter.easycash.viewholder.BusinessAndMaritalInfoInputViewHolder$MediaBrowserCompat$ItemReceiver */
public final class C5748x875dd94c implements TextWatcher {
    private /* synthetic */ BusinessAndMaritalInfoInputViewHolder MediaBrowserCompat$ItemReceiver;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    C5748x875dd94c(BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = businessAndMaritalInfoInputViewHolder;
    }

    public final void afterTextChanged(Editable editable) {
        BusinessAndMaritalInfoInputViewHolder.read(this.MediaBrowserCompat$ItemReceiver, String.valueOf(editable));
    }
}
