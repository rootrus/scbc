package com.scb.phone.view.activity.bscanc;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public final class QRPaymentCoachMarkActivity_ViewBinding extends BaseActivity_ViewBinding {
    private QRPaymentCoachMarkActivity MediaBrowserCompat$CustomActionResultReceiver;

    public QRPaymentCoachMarkActivity_ViewBinding(QRPaymentCoachMarkActivity qRPaymentCoachMarkActivity, View view) {
        super(qRPaymentCoachMarkActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = qRPaymentCoachMarkActivity;
        qRPaymentCoachMarkActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.vp_coach_mark, "field 'viewPager'", ViewPager.class);
    }

    public final void read() {
        QRPaymentCoachMarkActivity qRPaymentCoachMarkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (qRPaymentCoachMarkActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            qRPaymentCoachMarkActivity.viewPager = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
