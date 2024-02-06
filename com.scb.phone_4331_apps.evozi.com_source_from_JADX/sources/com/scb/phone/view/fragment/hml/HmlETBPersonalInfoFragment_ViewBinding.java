package com.scb.phone.view.fragment.hml;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlETBPersonalInfoFragment_ViewBinding extends HmlBasePersonalInfoFragment_ViewBinding {
    private HmlETBPersonalInfoFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public HmlETBPersonalInfoFragment_ViewBinding(final HmlETBPersonalInfoFragment hmlETBPersonalInfoFragment, View view) {
        super(hmlETBPersonalInfoFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlETBPersonalInfoFragment;
        hmlETBPersonalInfoFragment.tvETBExpiryDateTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_national_id_expiry_date_title, "field 'tvETBExpiryDateTitle'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.iv_about, "method 'onAboutClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlETBPersonalInfoFragment.this.onAboutClicked(view);
            }
        });
    }

    public void read() {
        HmlETBPersonalInfoFragment hmlETBPersonalInfoFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (hmlETBPersonalInfoFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            hmlETBPersonalInfoFragment.tvETBExpiryDateTitle = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
