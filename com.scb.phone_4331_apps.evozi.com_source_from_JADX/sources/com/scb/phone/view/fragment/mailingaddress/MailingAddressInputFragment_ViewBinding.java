package com.scb.phone.view.fragment.mailingaddress;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MailingAddressInputFragment_ViewBinding extends BaseMailingAddressFragment_ViewBinding {
    private MailingAddressInputFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public MailingAddressInputFragment_ViewBinding(final MailingAddressInputFragment mailingAddressInputFragment, View view) {
        super(mailingAddressInputFragment, view);
        this.IconCompatParcelizer = mailingAddressInputFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextButtonClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressInputFragment.this.onNextButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.confirm_button, "method 'onConfirmButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressInputFragment.this.onConfirmButtonClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
