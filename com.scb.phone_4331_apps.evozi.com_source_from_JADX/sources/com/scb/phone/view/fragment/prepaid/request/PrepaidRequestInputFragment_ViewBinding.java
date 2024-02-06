package com.scb.phone.view.fragment.prepaid.request;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidRequestInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PrepaidRequestInputFragment MediaBrowserCompat$ItemReceiver;

    public PrepaidRequestInputFragment_ViewBinding(final PrepaidRequestInputFragment prepaidRequestInputFragment, View view) {
        super(prepaidRequestInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = prepaidRequestInputFragment;
        prepaidRequestInputFragment.prepaidLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_layout, "field 'prepaidLayout'", ConstraintLayout.class);
        prepaidRequestInputFragment.mailingAddressText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.mailing_address_text, "field 'mailingAddressText'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.reviewButton, "method 'onReviewButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidRequestInputFragment.this.onReviewButtonClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.mailing_address_tab, "method 'onClickedChangeMailingAddress'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidRequestInputFragment.this.onClickedChangeMailingAddress();
            }
        });
    }

    public final void read() {
        PrepaidRequestInputFragment prepaidRequestInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (prepaidRequestInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            prepaidRequestInputFragment.prepaidLayout = null;
            prepaidRequestInputFragment.mailingAddressText = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
