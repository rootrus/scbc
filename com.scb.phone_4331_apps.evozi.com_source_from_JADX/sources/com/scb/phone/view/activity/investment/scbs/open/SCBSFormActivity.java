package com.scb.phone.view.activity.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.onboarding.C5651x86e48d5c;
import com.scb.phone.view.activity.investment.onboarding.FundAppFormActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$902;
import p040o.getDarkThr;
import p040o.getExtensionMap;
import p040o.getFaceCenterThr;
import p040o.getFaceCloseThr;
import p040o.getFaceFarThr;
import p040o.getFeatureCompareThr;
import p040o.getGravityThr;
import p040o.getLightLivingThr;
import p040o.getMinFaceThr;
import p040o.getPitchThr;
import p040o.getRollThr;
import p040o.setFaceFarThr;
import p040o.setTapText;

public class SCBSFormActivity extends FundAppFormActivity {
    private static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void write(Context context, int i) {
        Intent intent = new Intent(context, SCBSFormActivity.class);
        intent.putExtra("EXTRA_STEP", i);
        IntentTidInjectionContextAspect.aspectOf();
        MediaBrowserCompat$ItemReceiver(context, intent);
    }

    public final void setIcon() {
        int intExtra = getIntent() != null ? getIntent().getIntExtra("EXTRA_STEP", 584) : 584;
        if (intExtra == 584) {
            this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(0, getString(R.string.mf_onboarding_page_personal_information), true, new setFaceFarThr(this)));
            this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(0, getString(R.string.mf_onboarding_page_address), true, new getExtensionMap(this)));
            this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(0, getString(R.string.mf_onboarding_page_marital_status), true, new getRollThr(this)));
        }
        if (intExtra != 946) {
            this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(0, getString(R.string.career_info_activity_title), true, new getPitchThr(this)));
            this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.investment_information_title), true, new getFaceFarThr(this)));
            this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.investment_information_title), true, new getFaceCenterThr(this)));
        }
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.risk_level_title), true, new getFeatureCompareThr(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.risk_level_title), true, new getGravityThr(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.risk_level_title), true, new access$902(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.auto_scbs_onboarding_suitability_summary_title), true, new getFaceCloseThr(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(1, getString(R.string.auto_scbs_onboarding_suitability_summary_title), true, new getDarkThr(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(2, getString(R.string.scbs_select_account_form_title), true, new getMinFaceThr(this)));
        this.MediaBrowserCompat$SearchResultReceiver.add(new C5651x86e48d5c(3, getString(R.string.onboarding_review_information_title), true, new getLightLivingThr(this)));
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent intent = new Intent(context, SCBSFormActivity.class);
        intent.putExtra("EXTRA_STEP", 584);
        IntentTidInjectionContextAspect.aspectOf();
        MediaBrowserCompat$ItemReceiver(context, intent);
    }
}
