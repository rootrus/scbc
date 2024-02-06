package com.scb.phone.view.activity.bankingagent;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class GenerateQRActivity_ViewBinding extends BaseActivity_ViewBinding {
    private GenerateQRActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public GenerateQRActivity_ViewBinding(final GenerateQRActivity generateQRActivity, View view) {
        super(generateQRActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = generateQRActivity;
        generateQRActivity.barcodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_barcode, "field 'barcodeImageView'", ImageView.class);
        generateQRActivity.barcodeLabelTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_barcode_label, "field 'barcodeLabelTextView'", TextView.class);
        generateQRActivity.qrImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_qr, "field 'qrImageView'", ImageView.class);
        generateQRActivity.expireTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_qr_expire, "field 'expireTextView'", TextView.class);
        generateQRActivity.amountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amountTextView'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.tv_return_to_account, "method 'clickReturnToAccount'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GenerateQRActivity.this.clickReturnToAccount();
            }
        });
    }

    public final void read() {
        GenerateQRActivity generateQRActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (generateQRActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            generateQRActivity.barcodeImageView = null;
            generateQRActivity.barcodeLabelTextView = null;
            generateQRActivity.qrImageView = null;
            generateQRActivity.expireTextView = null;
            generateQRActivity.amountTextView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
