package com.scb.phone.view.activity.investment.onboarding;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundOnboardingLandingActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private FundOnboardingLandingActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public FundOnboardingLandingActivity_ViewBinding(final FundOnboardingLandingActivity fundOnboardingLandingActivity, View view) {
        super(fundOnboardingLandingActivity, view);
        this.MediaBrowserCompat$ItemReceiver = fundOnboardingLandingActivity;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_not_now, "method 'onNotNowClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundOnboardingLandingActivity.this.onNotNowClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_open_account, "method 'onOpenAccountClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundOnboardingLandingActivity.this.onOpenAccountClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.button_add_account, "method 'onAddAccountClick'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundOnboardingLandingActivity.this.onAddAccountClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
