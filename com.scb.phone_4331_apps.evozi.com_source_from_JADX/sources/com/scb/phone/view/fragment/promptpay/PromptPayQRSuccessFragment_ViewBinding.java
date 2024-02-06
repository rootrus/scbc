package com.scb.phone.view.fragment.promptpay;

import android.view.View;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PromptPayQRSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PromptPayQRSuccessFragment MediaBrowserCompat$ItemReceiver;
    private View RatingCompat;
    private View write;

    public PromptPayQRSuccessFragment_ViewBinding(final PromptPayQRSuccessFragment promptPayQRSuccessFragment, View view) {
        super(promptPayQRSuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = promptPayQRSuccessFragment;
        promptPayQRSuccessFragment.qrCodeImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_qr_code, "field 'qrCodeImageView'", ImageView.class);
        promptPayQRSuccessFragment.accountNumberCustomTarget = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_number, "field 'accountNumberCustomTarget'", CustomTransferAndPayItem.class);
        promptPayQRSuccessFragment.amountCustomTarget = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount, "field 'amountCustomTarget'", CustomTransferAndPayItem.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.save_qr_button, "method 'saveSlipButton'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PromptPayQRSuccessFragment.this.saveSlipButton();
            }
        });
        View findViewById = view.findViewById(R.id.share_button);
        if (findViewById != null) {
            this.RatingCompat = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    PromptPayQRSuccessFragment.this.onShareButtonClick();
                }
            });
        }
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.create_qr_code_button, "method 'onCreateQRCodeButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PromptPayQRSuccessFragment.this.onCreateQRCodeButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnHomeClick'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PromptPayQRSuccessFragment.this.onReturnHomeClick();
            }
        });
    }

    public final void read() {
        PromptPayQRSuccessFragment promptPayQRSuccessFragment = this.MediaBrowserCompat$ItemReceiver;
        if (promptPayQRSuccessFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            promptPayQRSuccessFragment.qrCodeImageView = null;
            promptPayQRSuccessFragment.accountNumberCustomTarget = null;
            promptPayQRSuccessFragment.amountCustomTarget = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            View view = this.RatingCompat;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.RatingCompat = null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
