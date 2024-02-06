package com.scb.phone.view.activity.ntb;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.ekyc.EkycFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import p039io.beid.beidk.definitions.BeIDParams;
import p039io.beid.beidk.processor.FaceProcessor;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C4196cl;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;

public class NTBActivity extends BaseNtbInstructionActivity implements FragmentBuilder_BindChangeChannelStatementReviewFragment.IconCompatParcelizer {
    @HmlPinActivity
    public C4196cl ntbPresenter;

    public String read() {
        return "ekyc";
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.ntbPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.ntbPresenter.IconCompatParcelizer();
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public EkycFragment mo33978x50fd9e4a() {
        return new EkycFragment();
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_CustomAttribute.Builder builder) {
        EkycFragment MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo33978x50fd9e4a();
        Bundle bundle = new Bundle();
        bundle.putString(BeIDParams.BEID_TRANSACTION_ID, builder.MediaSessionCompat$QueueItem);
        MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.setArguments(bundle);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.getClass().getName()).write();
        MediaSessionCompat$ResultReceiverWrapper();
    }

    /* access modifiers changed from: protected */
    public void MediaSessionCompat$ResultReceiverWrapper() {
        this.progressStateBar.setCurrentState(0);
    }

    public void AppCompatDelegateImpl$ListMenuDecorView() {
        MediaSessionCompat$QueueItem(getString(R.string.ntb_ekyc_title));
        MediaSessionCompat$ResultReceiverWrapper();
        this.progressStateBar.requestLayout();
    }

    public void setContentView() {
        FatcaLandingQuestionFragment fatcaLandingQuestionFragment = new FatcaLandingQuestionFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("BUNDLE_FATCA_TYPE", 0);
        fatcaLandingQuestionFragment.setArguments(bundle);
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, fatcaLandingQuestionFragment, fatcaLandingQuestionFragment.getClass().getName()).write();
    }

    public final void read(String str, AutoValue_CrashlyticsReport_CustomAttribute.Builder builder) {
        if (str == null || "0".equals(str) || "RP_INITIAL".equals(str)) {
            MediaBrowserCompat$CustomActionResultReceiver(builder);
        } else {
            IconCompatParcelizer(str);
        }
    }

    public void onDestroy() {
        this.ntbPresenter.onDestroy();
        super.onDestroy();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == FaceProcessor.FACE_CAPTURE.intValue() || i == 1) {
            Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
            if (findFragmentById instanceof EkycFragment) {
                EkycFragment ekycFragment = (EkycFragment) findFragmentById;
                if (i2 != -1) {
                    return;
                }
                if (i == FaceProcessor.FACE_CAPTURE.intValue()) {
                    ekycFragment.read(intent);
                } else if (i == 1) {
                    ekycFragment.write(intent);
                }
            }
        }
    }
}
