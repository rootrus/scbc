package com.scb.phone.view.fragment.registration.preregistration;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PreregistrationLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private PreregistrationLandingFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public PreregistrationLandingFragment_ViewBinding(final PreregistrationLandingFragment preregistrationLandingFragment, View view) {
        super(preregistrationLandingFragment, view);
        this.MediaBrowserCompat$ItemReceiver = preregistrationLandingFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.continue_th_button, "method 'onThaiButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregistrationLandingFragment.this.onThaiButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.continue_en_button, "method 'onEnglishButtonClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PreregistrationLandingFragment.this.onEnglishButtonClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
