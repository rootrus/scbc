package com.scb.phone.view.activity.ndid;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ntb.BaseNtbInstructionActivity;
import com.scb.phone.view.fragment.ndid.NdidInstructionFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import java.util.ArrayList;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4196cl;
import p040o.C6486xe34110e2;
import p040o.HmlPinActivity;

public class NdidLandingActivity extends BaseNtbInstructionActivity implements C6486xe34110e2 {
    @HmlPinActivity
    public C4196cl ntbPresenter;

    public String read() {
        return "ndid";
    }

    public static Intent read(Context context) {
        return new Intent(context, NdidLandingActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ntbPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.ntbPresenter.IconCompatParcelizer();
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public NdidInstructionFragment mo33978x50fd9e4a() {
        return new NdidInstructionFragment();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_CustomAttribute.Builder builder) {
        NdidInstructionFragment MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo33978x50fd9e4a();
        Bundle bundle = new Bundle();
        bundle.putString("com.scb.phone.view.fragment.ndid.STAGE_TAG", builder.MediaSessionCompat$Token);
        if (builder.RatingCompat != null) {
            bundle.putStringArrayList("com.scb.phone.view.fragment.ndid.EXTRA_REMARK", new ArrayList(builder.RatingCompat));
        }
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.setArguments(bundle);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.getClass().getName()).write();
        MediaSessionCompat$ResultReceiverWrapper();
    }

    /* access modifiers changed from: protected */
    public void MediaSessionCompat$ResultReceiverWrapper() {
        this.progressStateBar.setCurrentState(0);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void AppCompatActivity() {
        MediaSessionCompat$QueueItem(getString(R.string.ntb_ekyc_title));
        MediaSessionCompat$ResultReceiverWrapper();
        this.progressStateBar.requestLayout();
    }

    public void AppCompatDelegateImpl$ListMenuDecorView() {
        FatcaLandingQuestionFragment fatcaLandingQuestionFragment = new FatcaLandingQuestionFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("BUNDLE_FATCA_TYPE", 0);
        fatcaLandingQuestionFragment.setArguments(bundle);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, fatcaLandingQuestionFragment, fatcaLandingQuestionFragment.getClass().getName()).write();
    }

    public final void read(String str, AutoValue_CrashlyticsReport_CustomAttribute.Builder builder) {
        if (str == null || "0".equals(str) || "RP_INITIAL".equals(str) || "RP_CID_VERIFIED".equals(str) || "RP_PENDING".equals(str) || "RP_LIVENESS".equals(str)) {
            MediaBrowserCompat$CustomActionResultReceiver(builder);
        } else {
            IconCompatParcelizer(str);
        }
    }

    public void onDestroy() {
        this.ntbPresenter.onDestroy();
        super.onDestroy();
    }
}
