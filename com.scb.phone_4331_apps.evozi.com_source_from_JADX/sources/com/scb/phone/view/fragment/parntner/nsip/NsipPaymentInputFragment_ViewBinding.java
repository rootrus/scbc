package com.scb.phone.view.fragment.parntner.nsip;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class NsipPaymentInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private NsipPaymentInputFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public NsipPaymentInputFragment_ViewBinding(final NsipPaymentInputFragment nsipPaymentInputFragment, View view) {
        super(nsipPaymentInputFragment, view);
        this.IconCompatParcelizer = nsipPaymentInputFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btnReview, "method 'onClickBtnReview'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NsipPaymentInputFragment.this.onClickBtnReview();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
