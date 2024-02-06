package com.scb.phone.view.activity.paynow;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.paynow.C6116x87d6f0a3;
import com.scb.phone.view.fragment.paynow.PayNowReviewFragment;
import p040o.AutoValue_CrashlyticsReport_Session_Application;
import p040o.onGetStartedClick;

public final class PayNowReviewActivity extends BaseActivityWithFragment {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final String au_() {
        String string = getString(R.string.remittance_review_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.remittance_review_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        C6116x87d6f0a3 payNowReviewFragment$MediaBrowserCompat$CustomActionResultReceiver = PayNowReviewFragment.IconCompatParcelizer;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_PAYNOW_REVIEW_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…RA_PAYNOW_REVIEW_DISPLAY)");
        AutoValue_CrashlyticsReport_Session_Application.Builder builder = (AutoValue_CrashlyticsReport_Session_Application.Builder) parcelableExtra;
        onGetStartedClick.write((Object) builder, "display");
        PayNowReviewFragment payNowReviewFragment = new PayNowReviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_REVIEW_REMITTANCE_DISPLAY", builder);
        payNowReviewFragment.setArguments(bundle);
        return payNowReviewFragment;
    }
}
