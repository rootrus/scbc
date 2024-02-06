package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.fragment.hml.C5991xba8fa764;
import com.scb.phone.view.fragment.hml.HmlMobileListFragment;
import com.scb.phone.view.fragment.otppin.MobileListFragment;
import p040o.C9701x28a40384;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.CrashlyticsController;
import p040o.CustomAdvertisingIdClient;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.addNode;
import p040o.onGetStartedClick;
import p040o.setHorizontalPadding;

public final class HmlEtbSubmissionOtpActivity extends BaseOtpActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    @HmlPinActivity
    public CustomAdvertisingIdClient.C3280b presenter;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, String str3, String str4, String str5) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "appuid");
            Intent intent = new Intent(context, HmlEtbSubmissionOtpActivity.class);
            if (bool != null) {
                intent.putExtra("TNC_ACCEPTED", bool.booleanValue());
            }
            if (bool2 != null) {
                intent.putExtra("MODEL_ACCEPTED", bool2.booleanValue());
            }
            if (bool3 != null) {
                intent.putExtra("CROSS_ACCEPTED", bool3.booleanValue());
            }
            intent.putExtra("APP_UID", str);
            intent.putExtra("INTENT_INFO", str2);
            intent.putExtra("REQUESTED_LOAN_AMOUNT", str3);
            intent.putExtra("REQUESTED_REPAYMENT_AMOUNT", str4);
            intent.putExtra("REQUESTED_REPAYMENT_TERM", str5);
            return intent;
        }
    }

    public final MobileListFragment RatingCompat(String str) {
        onGetStartedClick.write((Object) str, "labelBelow");
        C5991xba8fa764 hmlMobileListFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlMobileListFragment.IconCompatParcelizer;
        HmlMobileListFragment hmlMobileListFragment = new HmlMobileListFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_LABEL_BELOW", str);
        hmlMobileListFragment.setArguments(bundle);
        return hmlMobileListFragment;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CustomAdvertisingIdClient.C3280b bVar = this.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bVar.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        CustomAdvertisingIdClient.C3280b bVar = this.presenter;
        if (bVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str3 = Build.MODEL;
        onGetStartedClick.IconCompatParcelizer((Object) str3, "Build.MODEL");
        Boolean bool = null;
        boolean z = false;
        Boolean valueOf = getIntent().hasExtra("TNC_ACCEPTED") ? Boolean.valueOf(getIntent().getBooleanExtra("TNC_ACCEPTED", false)) : null;
        Boolean valueOf2 = getIntent().hasExtra("MODEL_ACCEPTED") ? Boolean.valueOf(getIntent().getBooleanExtra("MODEL_ACCEPTED", false)) : null;
        if (getIntent().hasExtra("CROSS_ACCEPTED")) {
            bool = Boolean.valueOf(getIntent().getBooleanExtra("CROSS_ACCEPTED", false));
        }
        onGetStartedClick.write((Object) str, "tokenUuid");
        onGetStartedClick.write((Object) str3, "deviceModel");
        onGetStartedClick.write((Object) str2, "otp");
        if (bVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            bVar.RatingCompat.AlertController$RecycleListView();
        }
        addNode addnode = bVar.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity read = new CustomAdvertisingIdClient.C3280b.read(bVar);
        FundFactSheetActivity customAdvertisingIdClient$b$MediaBrowserCompat$CustomActionResultReceiver = new C9701x28a40384(bVar);
        CrashlyticsController.C324112 r5 = new Object(valueOf, valueOf2, bool) {
            public final Boolean MediaBrowserCompat$CustomActionResultReceiver;
            public final Boolean MediaBrowserCompat$ItemReceiver;
            public final Boolean read;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C324112)) {
                    return false;
                }
                C324112 r3 = (C324112) obj;
                return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
            }

            public final int hashCode() {
                Boolean bool = this.read;
                int i = 0;
                int hashCode = bool != null ? bool.hashCode() : 0;
                Boolean bool2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                int hashCode2 = bool2 != null ? bool2.hashCode() : 0;
                Boolean bool3 = this.MediaBrowserCompat$ItemReceiver;
                if (bool3 != null) {
                    i = bool3.hashCode();
                }
                return (((hashCode * 31) + hashCode2) * 31) + i;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("HmlSubmissionConsents(tnc=");
                sb.append(this.read);
                sb.append(", model=");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(", crossSell=");
                sb.append(this.MediaBrowserCompat$ItemReceiver);
                sb.append(")");
                return sb.toString();
            }

            {
                this.read = r1;
                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                this.MediaBrowserCompat$ItemReceiver = r3;
            }
        };
        onGetStartedClick.write((Object) read, "onSuccess");
        onGetStartedClick.write((Object) customAdvertisingIdClient$b$MediaBrowserCompat$CustomActionResultReceiver, "onError");
        onGetStartedClick.write((Object) str, "tokenUuid");
        onGetStartedClick.write((Object) str3, "deviceModel");
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) r5, "consents");
        addnode.IconCompatParcelizer.IconCompatParcelizer(read, customAdvertisingIdClient$b$MediaBrowserCompat$CustomActionResultReceiver, new setHorizontalPadding.write(str2, str, str3, r5.read, r5.MediaBrowserCompat$CustomActionResultReceiver, r5.MediaBrowserCompat$ItemReceiver), addnode.MediaBrowserCompat$ItemReceiver);
    }

    public final String MediaSessionCompat$Token() {
        String string = getString(R.string.hml_otp_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.hml_otp_title)");
        return string;
    }
}
