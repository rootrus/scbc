package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.C6000xa959713a;
import com.scb.phone.view.fragment.hml.HmlNTBOutcomeApproveFragment;
import com.scb.phone.view.fragment.hml.HmlNTBOutcomeCounterOfferFragment;
import com.scb.phone.view.fragment.hml.HmlNTBOutcomePendingFragment;
import com.scb.phone.view.fragment.hml.HmlNTBOutcomeRejectFragment;
import com.scb.phone.view.fragment.hml.HmlNTBOutcomeResubmissionFragment;
import p040o.getNonFatalSessionFilesDir;
import p040o.handleUncaughtException;
import p040o.isHandlingException;
import p040o.onGetStartedClick;
import p040o.registerAnalyticsListener;
import p040o.submitAllReports;
import p040o.zzct;

public final class HmlNTBApplicationOutcomeActivity extends HmlApplicationOutcomeActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo14478x50fd9e4a() {
        return "ntb";
    }

    public final /* synthetic */ void IconCompatParcelizer(getNonFatalSessionFilesDir getnonfatalsessionfilesdir, Boolean bool, zzct.zza zza) {
        boolean booleanValue = bool.booleanValue();
        onGetStartedClick.write((Object) getnonfatalsessionfilesdir, "display");
        onGetStartedClick.write((Object) zza, "type");
        IconCompatParcelizer("approved_loan", Boolean.valueOf(booleanValue));
        HmlNTBOutcomeApproveFragment.IconCompatParcelizer iconCompatParcelizer = HmlNTBOutcomeApproveFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) getnonfatalsessionfilesdir, "display");
        HmlNTBOutcomeApproveFragment hmlNTBOutcomeApproveFragment = new HmlNTBOutcomeApproveFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_APPROVE_EXTRA", getnonfatalsessionfilesdir);
        hmlNTBOutcomeApproveFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlNTBOutcomeApproveFragment).write();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(registerAnalyticsListener registeranalyticslistener, zzct.zza zza, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        onGetStartedClick.write((Object) registeranalyticslistener, "display");
        onGetStartedClick.write((Object) zza, "type");
        IconCompatParcelizer("document_resubmission", Boolean.valueOf(booleanValue));
        HmlNTBOutcomeResubmissionFragment.write write = HmlNTBOutcomeResubmissionFragment.IconCompatParcelizer;
        onGetStartedClick.write((Object) registeranalyticslistener, "display");
        HmlNTBOutcomeResubmissionFragment hmlNTBOutcomeResubmissionFragment = new HmlNTBOutcomeResubmissionFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_RESUBMISSION_EXTRA", registeranalyticslistener);
        hmlNTBOutcomeResubmissionFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlNTBOutcomeResubmissionFragment).write();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(submitAllReports submitallreports, zzct.zza zza, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        onGetStartedClick.write((Object) submitallreports, "display");
        onGetStartedClick.write((Object) zza, "type");
        IconCompatParcelizer("rejected_loan", Boolean.valueOf(booleanValue));
        HmlNTBOutcomeRejectFragment.IconCompatParcelizer iconCompatParcelizer = HmlNTBOutcomeRejectFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) submitallreports, "display");
        HmlNTBOutcomeRejectFragment hmlNTBOutcomeRejectFragment = new HmlNTBOutcomeRejectFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_REJECT_EXTRA", submitallreports);
        hmlNTBOutcomeRejectFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlNTBOutcomeRejectFragment).write();
    }

    public final /* synthetic */ void read(handleUncaughtException handleuncaughtexception, Boolean bool) {
        IconCompatParcelizer("counter_offer", Boolean.valueOf(bool.booleanValue()));
        C6000xa959713a hmlNTBOutcomeCounterOfferFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBOutcomeCounterOfferFragment.MediaBrowserCompat$CustomActionResultReceiver;
        HmlNTBOutcomeCounterOfferFragment hmlNTBOutcomeCounterOfferFragment = new HmlNTBOutcomeCounterOfferFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_COUNTER_EXTRA", handleuncaughtexception);
        hmlNTBOutcomeCounterOfferFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlNTBOutcomeCounterOfferFragment).write();
    }

    public final /* synthetic */ void write(isHandlingException ishandlingexception, zzct.zza zza, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        onGetStartedClick.write((Object) ishandlingexception, "display");
        onGetStartedClick.write((Object) zza, "type");
        IconCompatParcelizer("pending_application", Boolean.valueOf(booleanValue));
        HmlNTBOutcomePendingFragment.read read = HmlNTBOutcomePendingFragment.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) ishandlingexception, "hmlOutcomePendingDisplay");
        HmlNTBOutcomePendingFragment hmlNTBOutcomePendingFragment = new HmlNTBOutcomePendingFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("HML_OUTCOME_PENDING_EXTRA", ishandlingexception);
        hmlNTBOutcomePendingFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, hmlNTBOutcomePendingFragment).write();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        RatingCompat(true);
    }
}
