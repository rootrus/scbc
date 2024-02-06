package com.scb.phone.view.fragment.mailingaddress;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class MailingAddressReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private MailingAddressReviewFragment MediaBrowserCompat$CustomActionResultReceiver;

    public MailingAddressReviewFragment_ViewBinding(final MailingAddressReviewFragment mailingAddressReviewFragment, View view) {
        super(mailingAddressReviewFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mailingAddressReviewFragment;
        mailingAddressReviewFragment.tvNewAddressUsage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_new_address_usage, "field 'tvNewAddressUsage'", TextView.class);
        mailingAddressReviewFragment.tvNewAddress = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_new_address_content, "field 'tvNewAddress'", TextView.class);
        mailingAddressReviewFragment.llRelatedAccount = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_related_account_content, "field 'llRelatedAccount'", LinearLayout.class);
        mailingAddressReviewFragment.llRemarks = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_remarks, "field 'llRemarks'", LinearLayout.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_next, "field 'btnNext' and method 'onNextClick'");
        mailingAddressReviewFragment.btnNext = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_next, "field 'btnNext'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MailingAddressReviewFragment.this.onNextClick();
            }
        });
    }

    public final void read() {
        MailingAddressReviewFragment mailingAddressReviewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mailingAddressReviewFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mailingAddressReviewFragment.tvNewAddressUsage = null;
            mailingAddressReviewFragment.tvNewAddress = null;
            mailingAddressReviewFragment.llRelatedAccount = null;
            mailingAddressReviewFragment.llRemarks = null;
            mailingAddressReviewFragment.btnNext = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
