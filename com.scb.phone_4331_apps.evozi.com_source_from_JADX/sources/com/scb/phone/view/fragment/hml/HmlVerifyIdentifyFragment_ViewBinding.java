package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlVerifyIdentifyFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlVerifyIdentifyFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public HmlVerifyIdentifyFragment_ViewBinding(final HmlVerifyIdentifyFragment hmlVerifyIdentifyFragment, View view) {
        super(hmlVerifyIdentifyFragment, view);
        this.IconCompatParcelizer = hmlVerifyIdentifyFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_find_uss, "method 'submit'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlVerifyIdentifyFragment.this.submit(view);
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
