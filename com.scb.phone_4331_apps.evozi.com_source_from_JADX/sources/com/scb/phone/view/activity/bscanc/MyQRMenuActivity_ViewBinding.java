package com.scb.phone.view.activity.bscanc;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class MyQRMenuActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MyQRMenuActivity MediaBrowserCompat$CustomActionResultReceiver;

    public MyQRMenuActivity_ViewBinding(MyQRMenuActivity myQRMenuActivity, View view) {
        super(myQRMenuActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = myQRMenuActivity;
        myQRMenuActivity.qrReceivingMoneyButton = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qrReceivingMoneyButton, "field 'qrReceivingMoneyButton'", TextView.class);
        myQRMenuActivity.qrPaymentButton = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qrPaymentButton, "field 'qrPaymentButton'", TextView.class);
    }

    public final void read() {
        MyQRMenuActivity myQRMenuActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (myQRMenuActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            myQRMenuActivity.qrReceivingMoneyButton = null;
            myQRMenuActivity.qrPaymentButton = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
