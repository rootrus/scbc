package com.scb.phone.view.fragment.easycash.landing;

import android.view.View;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onStart;

public class EasycashBaseLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private EasycashBaseLandingFragment write;

    public EasycashBaseLandingFragment_ViewBinding(EasycashBaseLandingFragment easycashBaseLandingFragment, View view) {
        super(easycashBaseLandingFragment, view);
        this.write = easycashBaseLandingFragment;
        easycashBaseLandingFragment.footerLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.easycash_footer_layout, "field 'footerLayout'", LinearLayout.class);
    }

    public void read() {
        EasycashBaseLandingFragment easycashBaseLandingFragment = this.write;
        if (easycashBaseLandingFragment != null) {
            this.write = null;
            easycashBaseLandingFragment.footerLayout = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
