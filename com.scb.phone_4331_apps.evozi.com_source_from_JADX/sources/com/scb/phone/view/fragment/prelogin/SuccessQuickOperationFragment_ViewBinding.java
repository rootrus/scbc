package com.scb.phone.view.fragment.prelogin;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.SuccessFragment_ViewBinding;
import p040o.onCreateDialog;

public class SuccessQuickOperationFragment_ViewBinding extends SuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private SuccessQuickOperationFragment MediaBrowserCompat$CustomActionResultReceiver;

    public SuccessQuickOperationFragment_ViewBinding(final SuccessQuickOperationFragment successQuickOperationFragment, View view) {
        super(successQuickOperationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = successQuickOperationFragment;
        View findViewById = view.findViewById(R.id.return_button);
        if (findViewById != null) {
            this.IconCompatParcelizer = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    SuccessQuickOperationFragment.this.onReturnHomeClick();
                }
            });
        }
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            View view = this.IconCompatParcelizer;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.IconCompatParcelizer = null;
            }
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
