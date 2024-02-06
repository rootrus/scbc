package com.scb.phone.view.activity.hml.businessowner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.hml.businessowner.C6019xdde7963c;
import com.scb.phone.view.fragment.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoFragment;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.onUncaughtException;

public final class HmlBusinessOwnerSubmissionReviewStepTwoActivity extends BaseActivityWithFragment {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private final HmlVerifyEmailActivity MediaMetadataCompat;

    public HmlBusinessOwnerSubmissionReviewStepTwoActivity() {
        FundActionsSuccessActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        onGetStartedClick.write((Object) iconCompatParcelizer, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(iconCompatParcelizer);
        FundActionsSuccessActivity hmlBusinessOwnerSubmissionReviewStepTwoActivity$MediaBrowserCompat$CustomActionResultReceiver = new C5626x39066f2c(this);
        onGetStartedClick.write((Object) hmlBusinessOwnerSubmissionReviewStepTwoActivity$MediaBrowserCompat$CustomActionResultReceiver, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(hmlBusinessOwnerSubmissionReviewStepTwoActivity$MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public final String au_() {
        String string = getString(R.string.hml_business_owner_review_2_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_b…ess_owner_review_2_title)");
        return string;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.scbAnalytics.write("p10x1_business_review_submission_2", new ZSYR2K("user_type", "etb"));
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<onUncaughtException> {
        private /* synthetic */ HmlBusinessOwnerSubmissionReviewStepTwoActivity MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(HmlBusinessOwnerSubmissionReviewStepTwoActivity hmlBusinessOwnerSubmissionReviewStepTwoActivity) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerSubmissionReviewStepTwoActivity;
        }

        public final /* synthetic */ Object invoke() {
            Intent intent = this.MediaBrowserCompat$CustomActionResultReceiver.getIntent();
            if (intent != null) {
                return (onUncaughtException) intent.getParcelableExtra("EXTRA_DISPLAY");
            }
            return null;
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        onUncaughtException onuncaughtexception = (onUncaughtException) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (onuncaughtexception != null) {
            C6019xdde7963c hmlBusinessOwnerSubmissionReviewStepTwoFragment$MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerSubmissionReviewStepTwoFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) onuncaughtexception, "initialDataDisplay");
            HmlBusinessOwnerSubmissionReviewStepTwoFragment hmlBusinessOwnerSubmissionReviewStepTwoFragment = new HmlBusinessOwnerSubmissionReviewStepTwoFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_DISPLAY", onuncaughtexception);
            bundle.putString("INTENT_VALUE", (String) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver());
            hmlBusinessOwnerSubmissionReviewStepTwoFragment.setArguments(bundle);
            return hmlBusinessOwnerSubmissionReviewStepTwoFragment;
        }
        finish();
        return null;
    }
}
