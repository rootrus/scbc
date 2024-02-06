package com.scb.phone.view.fragment.mailingaddress;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MailingAddressSuccessfulFragment_ViewBinding extends BaseFragment_ViewBinding {
    private MailingAddressSuccessfulFragment IconCompatParcelizer;
    private View write;

    public MailingAddressSuccessfulFragment_ViewBinding(final MailingAddressSuccessfulFragment mailingAddressSuccessfulFragment, View view) {
        super(mailingAddressSuccessfulFragment, view);
        this.IconCompatParcelizer = mailingAddressSuccessfulFragment;
        mailingAddressSuccessfulFragment.tvTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_successful_time, "field 'tvTime'", TextView.class);
        mailingAddressSuccessfulFragment.tvRef = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_successful_ref, "field 'tvRef'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_done, "method 'onDoneClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressSuccessfulFragment.this.onDoneClick();
            }
        });
    }

    public final void read() {
        MailingAddressSuccessfulFragment mailingAddressSuccessfulFragment = this.IconCompatParcelizer;
        if (mailingAddressSuccessfulFragment != null) {
            this.IconCompatParcelizer = null;
            mailingAddressSuccessfulFragment.tvTime = null;
            mailingAddressSuccessfulFragment.tvRef = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
