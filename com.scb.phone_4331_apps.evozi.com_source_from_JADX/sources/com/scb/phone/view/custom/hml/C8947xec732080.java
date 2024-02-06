package com.scb.phone.view.custom.hml;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.hml.CustomDecimalAmountVerification;

/* renamed from: com.scb.phone.view.custom.hml.CustomDecimalAmountVerification$MediaBrowserCompat$CustomActionResultReceiver */
final class C8947xec732080 implements TextView.OnEditorActionListener {
    private /* synthetic */ CustomDecimalAmountVerification MediaBrowserCompat$CustomActionResultReceiver;

    C8947xec732080(CustomDecimalAmountVerification customDecimalAmountVerification) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDecimalAmountVerification;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CustomDecimalAmountVerification.IconCompatParcelizer IconCompatParcelizer;
        if (i != 6 || (IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver.read) == null) {
            return false;
        }
        IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        return false;
    }
}
