package com.scb.phone.view.custom.transferandpay;

import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onStart;

public class CustomCardlessWithdrawCodeItem_ViewBinding implements Unbinder {
    private CustomCardlessWithdrawCodeItem MediaBrowserCompat$CustomActionResultReceiver;

    public CustomCardlessWithdrawCodeItem_ViewBinding(CustomCardlessWithdrawCodeItem customCardlessWithdrawCodeItem, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customCardlessWithdrawCodeItem;
        customCardlessWithdrawCodeItem.mWithdrawTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.withdraw_text_view, "field 'mWithdrawTextView'", TextView.class);
        customCardlessWithdrawCodeItem.mCodeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.code_text_view, "field 'mCodeTextView'", TextView.class);
        customCardlessWithdrawCodeItem.mDateExpireTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.date_expire_text_view, "field 'mDateExpireTextView'", TextView.class);
    }

    public final void read() {
        CustomCardlessWithdrawCodeItem customCardlessWithdrawCodeItem = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (customCardlessWithdrawCodeItem != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            customCardlessWithdrawCodeItem.mWithdrawTextView = null;
            customCardlessWithdrawCodeItem.mCodeTextView = null;
            customCardlessWithdrawCodeItem.mDateExpireTextView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
