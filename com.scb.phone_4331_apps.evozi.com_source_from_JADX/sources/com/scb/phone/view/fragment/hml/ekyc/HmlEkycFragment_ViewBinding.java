package com.scb.phone.view.fragment.hml.ekyc;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.ekyc.EkycFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlEkycFragment_ViewBinding extends EkycFragment_ViewBinding {
    private HmlEkycFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlEkycFragment_ViewBinding(final HmlEkycFragment hmlEkycFragment, View view) {
        super(hmlEkycFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlEkycFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_next, "method 'onNextButtonClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlEkycFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
