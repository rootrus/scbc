package com.scb.phone.view.fragment.prepaid.activation;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidActivationInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PrepaidActivationInputFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public PrepaidActivationInputFragment_ViewBinding(final PrepaidActivationInputFragment prepaidActivationInputFragment, View view) {
        super(prepaidActivationInputFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidActivationInputFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.activateButton, "method 'onActivateButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidActivationInputFragment.this.onActivateButtonClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
