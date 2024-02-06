package com.scb.phone.view.fragment.prepaid.activation;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidActivationSuccessFragment_ViewBinding extends PurchaseSuccessFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private PrepaidActivationSuccessFragment write;

    public PrepaidActivationSuccessFragment_ViewBinding(final PrepaidActivationSuccessFragment prepaidActivationSuccessFragment, View view) {
        super(prepaidActivationSuccessFragment, view);
        this.write = prepaidActivationSuccessFragment;
        prepaidActivationSuccessFragment.tvRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remark, "field 'tvRemark'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onClickReturnButton'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidActivationSuccessFragment.this.onClickReturnButton();
            }
        });
    }

    public final void read() {
        PrepaidActivationSuccessFragment prepaidActivationSuccessFragment = this.write;
        if (prepaidActivationSuccessFragment != null) {
            this.write = null;
            prepaidActivationSuccessFragment.tvRemark = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
