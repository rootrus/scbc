package com.scb.phone.view.fragment.promptpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import p040o.onStart;

public class PromptPayQRScreenshotFragment_ViewBinding implements Unbinder {
    private PromptPayQRScreenshotFragment MediaBrowserCompat$CustomActionResultReceiver;

    public PromptPayQRScreenshotFragment_ViewBinding(PromptPayQRScreenshotFragment promptPayQRScreenshotFragment, View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver = promptPayQRScreenshotFragment;
        promptPayQRScreenshotFragment.accountNumberCustomTarget = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number, "field 'accountNumberCustomTarget'", CustomTransferAndPayItem.class);
        promptPayQRScreenshotFragment.amountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_text_view, "field 'amountTextView'", TextView.class);
        promptPayQRScreenshotFragment.payerSpecifyAmountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.payer_specify_amount_text_view, "field 'payerSpecifyAmountTextView'", TextView.class);
        promptPayQRScreenshotFragment.qrCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_qr_code, "field 'qrCodeImageView'", ImageView.class);
    }

    public final void read() {
        PromptPayQRScreenshotFragment promptPayQRScreenshotFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (promptPayQRScreenshotFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            promptPayQRScreenshotFragment.accountNumberCustomTarget = null;
            promptPayQRScreenshotFragment.amountTextView = null;
            promptPayQRScreenshotFragment.payerSpecifyAmountTextView = null;
            promptPayQRScreenshotFragment.qrCodeImageView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
