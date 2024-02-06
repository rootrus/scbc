package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ProgressStateBar;
import com.scb.phone.view.fragment.hml.HmlNTBDocumentUploadFragment;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.onGetStartedClick;

public final class HmlNTBAdditionalDocumentActivity extends HmlAdditionalDocumentActivity {
    @BindView
    public ProgressStateBar breadcrumbsNtb;

    /* access modifiers changed from: protected */
    public final String AppCompatDelegateImpl$ListMenuDecorView() {
        return "ntb";
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProgressStateBar progressStateBar = this.breadcrumbsNtb;
        if (progressStateBar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbsNtb");
        }
        String[] stringArray = getResources().getStringArray(R.array.f64702130903049);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "resources.getStringArray…rray.hml_breadcrumbs_ntb)");
        progressStateBar.setStates(HmlBusinessOwnerReviewSubmissionActivity.write((T[]) stringArray));
        ProgressStateBar progressStateBar2 = this.breadcrumbsNtb;
        if (progressStateBar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbsNtb");
        }
        progressStateBar2.setVisibility(0);
        ProgressStateBar progressStateBar3 = this.breadcrumbsNtb;
        if (progressStateBar3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("breadcrumbsNtb");
        }
        progressStateBar3.setCurrentState(2);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new HmlNTBDocumentUploadFragment();
    }
}
