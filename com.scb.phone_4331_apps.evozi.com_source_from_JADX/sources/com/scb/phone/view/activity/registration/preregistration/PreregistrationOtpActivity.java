package com.scb.phone.view.activity.registration.preregistration;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.fragment.otppin.OtpPinFragment;
import p040o.ActivateChequeDeepLinkActivity;
import p040o.C4098bg;
import p040o.C4261dN;
import p040o.HmlPinActivity;
import p040o.ServerProjectProvider;
import p040o.ZSYR2K;
import p040o.forcePut;
import p040o.getContents;
import p040o.onGetStartedClick;

public final class PreregistrationOtpActivity extends BaseOtpActivity implements ServerProjectProvider.IconCompatParcelizer {
    public static final write MediaDescriptionCompat = new write((byte) 0);
    private getContents MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public C4098bg preregistrationOTPPresenter;

    public final boolean MediaSessionCompat$QueueItem() {
        return false;
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        String str;
        String str2;
        super.onCreate(bundle);
        this.scbAnalytics.write("registration_otp", new ZSYR2K("feature", "pre_register"));
        C4098bg bgVar = this.preregistrationOTPPresenter;
        if (bgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("preregistrationOTPPresenter");
        }
        bgVar.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            getContents getcontents = (getContents) extras.getParcelable("EXTRA_MOBILE_NUMBER_DISPLAY");
            this.MediaBrowserCompat$SearchResultReceiver = getcontents;
            if (getcontents != null) {
                str = getcontents.write;
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = str3;
            }
            getContents getcontents2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (getcontents2 != null) {
                str2 = getcontents2.MediaBrowserCompat$CustomActionResultReceiver;
            } else {
                str2 = null;
            }
            if (str2 != null) {
                str3 = str2;
            }
            MediaBrowserCompat$CustomActionResultReceiver((String) null, str, str3);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        String MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver = mo13724x50fd9e4a();
        onGetStartedClick.IconCompatParcelizer((Object) MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, "otpPolicyId");
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, OtpPinFragment.read(C4261dN.read.DEFAULT, str2, str3, MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver, MediaSessionCompat$Token())).write();
        AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void write(String str, String str2) {
        String str3;
        C4098bg bgVar = this.preregistrationOTPPresenter;
        if (bgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("preregistrationOTPPresenter");
        }
        getContents getcontents = this.MediaBrowserCompat$SearchResultReceiver;
        if (getcontents != null) {
            str3 = getcontents.write;
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        }
        onGetStartedClick.write((Object) str3, "mobileNo");
        if (bgVar.RatingCompat != null) {
            bgVar.RatingCompat.AlertController$RecycleListView();
        }
        forcePut forceput = bgVar.IconCompatParcelizer;
        ActivateChequeDeepLinkActivity iconCompatParcelizer = new C4098bg.IconCompatParcelizer(bgVar, str3);
        if (str2 == null) {
            str2 = "";
        }
        if (str == null) {
            str = "";
        }
        forceput.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, new forcePut.IconCompatParcelizer(str2, str), bgVar.read);
    }

    public final void read() {
        PreregistrationPinActivity.IconCompatParcelizer(this, Boolean.TRUE);
        finish();
    }

    public final void onDestroy() {
        C4098bg bgVar = this.preregistrationOTPPresenter;
        if (bgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("preregistrationOTPPresenter");
        }
        bgVar.onDestroy();
        super.onDestroy();
    }
}
