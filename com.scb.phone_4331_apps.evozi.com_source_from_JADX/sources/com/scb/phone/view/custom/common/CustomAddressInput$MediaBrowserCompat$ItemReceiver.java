package com.scb.phone.view.custom.common;

import android.text.InputFilter;
import android.text.Spanned;

class CustomAddressInput$MediaBrowserCompat$ItemReceiver implements InputFilter {
    private CustomAddressInput$MediaBrowserCompat$ItemReceiver() {
    }

    /* synthetic */ CustomAddressInput$MediaBrowserCompat$ItemReceiver(CustomAddressInput customAddressInput) {
        this();
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        while (i < i2) {
            int type = Character.getType(charSequence.charAt(i));
            if (type == 19 || type == 28) {
                return "";
            }
            i++;
        }
        return null;
    }
}
