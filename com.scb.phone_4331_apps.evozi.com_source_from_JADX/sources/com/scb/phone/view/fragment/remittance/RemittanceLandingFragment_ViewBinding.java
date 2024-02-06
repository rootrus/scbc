package com.scb.phone.view.fragment.remittance;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RemittanceLandingFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private RemittanceLandingFragment MediaBrowserCompat$CustomActionResultReceiver;

    public RemittanceLandingFragment_ViewBinding(final RemittanceLandingFragment remittanceLandingFragment, View view) {
        super(remittanceLandingFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = remittanceLandingFragment;
        remittanceLandingFragment.rootView = (NestedScrollView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.root_view, "field 'rootView'", NestedScrollView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_get_started, "method 'buttonGetStartedClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceLandingFragment.this.buttonGetStartedClick();
            }
        });
    }

    public final void read() {
        RemittanceLandingFragment remittanceLandingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (remittanceLandingFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            remittanceLandingFragment.rootView = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
