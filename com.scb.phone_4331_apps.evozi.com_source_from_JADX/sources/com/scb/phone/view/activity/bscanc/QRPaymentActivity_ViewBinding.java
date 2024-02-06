package com.scb.phone.view.activity.bscanc;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class QRPaymentActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private QRPaymentActivity write;

    public QRPaymentActivity_ViewBinding(final QRPaymentActivity qRPaymentActivity, View view) {
        super(qRPaymentActivity, view);
        this.write = qRPaymentActivity;
        qRPaymentActivity.imgQR = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.img_qr, "field 'imgQR'", ImageView.class);
        qRPaymentActivity.tvValidDuration = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_valid_duration, "field 'tvValidDuration'", TextView.class);
        qRPaymentActivity.tvExpiryDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_expiry_date_time, "field 'tvExpiryDateTime'", TextView.class);
        qRPaymentActivity.tvRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remaining_limit, "field 'tvRemainingLimit'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_manage_qr, "method 'navigateToManageQR'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QRPaymentActivity.this.navigateToManageQR();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_return_to_account, "method 'navigateToAccountSummary'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QRPaymentActivity.this.navigateToAccountSummary();
            }
        });
    }

    public final void read() {
        QRPaymentActivity qRPaymentActivity = this.write;
        if (qRPaymentActivity != null) {
            this.write = null;
            qRPaymentActivity.imgQR = null;
            qRPaymentActivity.tvValidDuration = null;
            qRPaymentActivity.tvExpiryDateTime = null;
            qRPaymentActivity.tvRemainingLimit = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
