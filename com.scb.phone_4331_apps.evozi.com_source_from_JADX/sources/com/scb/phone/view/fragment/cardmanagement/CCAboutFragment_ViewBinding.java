package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CCAboutFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CCAboutFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public CCAboutFragment_ViewBinding(final CCAboutFragment cCAboutFragment, View view) {
        super(cCAboutFragment, view);
        this.MediaBrowserCompat$ItemReceiver = cCAboutFragment;
        cCAboutFragment.txvCCAbout = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_deejung_about, "field 'txvCCAbout'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_view_terms_and_conditions, "method 'onTermsAndConditionsClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CCAboutFragment.this.onTermsAndConditionsClick();
            }
        });
    }

    public final void read() {
        CCAboutFragment cCAboutFragment = this.MediaBrowserCompat$ItemReceiver;
        if (cCAboutFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            cCAboutFragment.txvCCAbout = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
