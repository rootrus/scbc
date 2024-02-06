package com.scb.phone.view.fragment.investment.scbs.open;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CheckSCBSEligibilityFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CheckSCBSEligibilityFragment MediaBrowserCompat$ItemReceiver;

    public CheckSCBSEligibilityFragment_ViewBinding(final CheckSCBSEligibilityFragment checkSCBSEligibilityFragment, View view) {
        super(checkSCBSEligibilityFragment, view);
        this.MediaBrowserCompat$ItemReceiver = checkSCBSEligibilityFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_get_started, "method 'onGetStartedButton'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CheckSCBSEligibilityFragment.this.onGetStartedButton();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.find_us_text_view, "method 'onFindUsClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CheckSCBSEligibilityFragment.this.onFindUsClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
