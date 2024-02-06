package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomProxyNumber;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class EnterProxyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EnterProxyFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public EnterProxyFragment_ViewBinding(final EnterProxyFragment enterProxyFragment, View view) {
        super(enterProxyFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = enterProxyFragment;
        enterProxyFragment.customProxyNumber = (CustomProxyNumber) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.proxy_number, "field 'customProxyNumber'", CustomProxyNumber.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_proxy_next, "field 'buttonNext' and method 'onReviewButtonClick'");
        enterProxyFragment.buttonNext = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_proxy_next, "field 'buttonNext'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EnterProxyFragment.this.onReviewButtonClick();
            }
        });
    }

    public final void read() {
        EnterProxyFragment enterProxyFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (enterProxyFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            enterProxyFragment.customProxyNumber = null;
            enterProxyFragment.buttonNext = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
