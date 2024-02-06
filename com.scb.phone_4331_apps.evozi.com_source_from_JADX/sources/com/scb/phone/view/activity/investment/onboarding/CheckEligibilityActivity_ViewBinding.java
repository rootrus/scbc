package com.scb.phone.view.activity.investment.onboarding;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CheckEligibilityActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private CheckEligibilityActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public CheckEligibilityActivity_ViewBinding(final CheckEligibilityActivity checkEligibilityActivity, View view) {
        super(checkEligibilityActivity, view);
        this.MediaBrowserCompat$ItemReceiver = checkEligibilityActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_get_started, "method 'onGetStartedClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CheckEligibilityActivity.this.onGetStartedClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.link_find_us, "method 'onFindUsClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CheckEligibilityActivity.this.onFindUsClick();
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
