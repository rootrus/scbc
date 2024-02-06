package com.scb.phone.view.activity.mwpartner;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MwOnboardInfoActivity_ViewBinding extends BaseActivity_ViewBinding {
    private MwOnboardInfoActivity IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public MwOnboardInfoActivity_ViewBinding(final MwOnboardInfoActivity mwOnboardInfoActivity, View view) {
        super(mwOnboardInfoActivity, view);
        this.IconCompatParcelizer = mwOnboardInfoActivity;
        mwOnboardInfoActivity.tvPrivacyConsent = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_onboard_privacy_consent, "field 'tvPrivacyConsent'", TextView.class);
        mwOnboardInfoActivity.llQualification = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_mw_qualification, "field 'llQualification'", LinearLayout.class);
        mwOnboardInfoActivity.tvQualificationList = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_mw_qualification_list, "field 'tvQualificationList'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_mw_new_user_inapp, "method 'onBoardingInAppClick'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnboardInfoActivity.this.onBoardingInAppClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_mw_onboard_download, "method 'onDownloadClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MwOnboardInfoActivity.this.onDownloadClick();
            }
        });
    }

    public final void read() {
        MwOnboardInfoActivity mwOnboardInfoActivity = this.IconCompatParcelizer;
        if (mwOnboardInfoActivity != null) {
            this.IconCompatParcelizer = null;
            mwOnboardInfoActivity.tvPrivacyConsent = null;
            mwOnboardInfoActivity.llQualification = null;
            mwOnboardInfoActivity.tvQualificationList = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
