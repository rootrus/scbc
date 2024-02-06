package com.scb.phone.view.activity.investment.onboarding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundOnboardingSuccessActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private FundOnboardingSuccessActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public FundOnboardingSuccessActivity_ViewBinding(final FundOnboardingSuccessActivity fundOnboardingSuccessActivity, View view) {
        super(fundOnboardingSuccessActivity, view);
        this.MediaBrowserCompat$ItemReceiver = fundOnboardingSuccessActivity;
        fundOnboardingSuccessActivity.textDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_date_time, "field 'textDateTime'", TextView.class);
        fundOnboardingSuccessActivity.tvMfosNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_name_value, "field 'tvMfosNameValue'", TextView.class);
        fundOnboardingSuccessActivity.tvMfosClientNoValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_client_no_value, "field 'tvMfosClientNoValue'", TextView.class);
        fundOnboardingSuccessActivity.tvMfosBranchValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_branch_value, "field 'tvMfosBranchValue'", TextView.class);
        fundOnboardingSuccessActivity.tvMfosAccountNameValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_account_name_value, "field 'tvMfosAccountNameValue'", TextView.class);
        fundOnboardingSuccessActivity.tvMfosAccountNoValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mfos_account_no_value, "field 'tvMfosAccountNoValue'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.save_button, "field 'saveButton' and method 'onSaveButtonClicked'");
        fundOnboardingSuccessActivity.saveButton = (Button) onStart.write(IconCompatParcelizer, R.id.save_button, "field 'saveButton'", Button.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundOnboardingSuccessActivity.this.onSaveButtonClicked();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onReturnButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundOnboardingSuccessActivity.this.onReturnButtonClicked();
            }
        });
    }

    public final void read() {
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = this.MediaBrowserCompat$ItemReceiver;
        if (fundOnboardingSuccessActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fundOnboardingSuccessActivity.textDateTime = null;
            fundOnboardingSuccessActivity.tvMfosNameValue = null;
            fundOnboardingSuccessActivity.tvMfosClientNoValue = null;
            fundOnboardingSuccessActivity.tvMfosBranchValue = null;
            fundOnboardingSuccessActivity.tvMfosAccountNameValue = null;
            fundOnboardingSuccessActivity.tvMfosAccountNoValue = null;
            fundOnboardingSuccessActivity.saveButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
