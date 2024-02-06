package com.scb.phone.view.fragment.transferandpay.transfer;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomProxyNumber;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TransferToPromptPayStep1Fragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private TransferToPromptPayStep1Fragment MediaBrowserCompat$ItemReceiver;

    public TransferToPromptPayStep1Fragment_ViewBinding(final TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment, View view) {
        super(transferToPromptPayStep1Fragment, view);
        this.MediaBrowserCompat$ItemReceiver = transferToPromptPayStep1Fragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "method 'onNextButtonClick'");
        transferToPromptPayStep1Fragment.mContinueButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_continue, "field 'mContinueButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferToPromptPayStep1Fragment.this.onNextButtonClick();
            }
        });
        transferToPromptPayStep1Fragment.mCustomProxyNumber = (CustomProxyNumber) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_proxy_number, "field 'mCustomProxyNumber'", CustomProxyNumber.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_contacts, "method 'onContactsButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferToPromptPayStep1Fragment.this.onContactsButtonClick();
            }
        });
    }

    public void read() {
        TransferToPromptPayStep1Fragment transferToPromptPayStep1Fragment = this.MediaBrowserCompat$ItemReceiver;
        if (transferToPromptPayStep1Fragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            transferToPromptPayStep1Fragment.mContinueButton = null;
            transferToPromptPayStep1Fragment.mCustomProxyNumber = null;
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
