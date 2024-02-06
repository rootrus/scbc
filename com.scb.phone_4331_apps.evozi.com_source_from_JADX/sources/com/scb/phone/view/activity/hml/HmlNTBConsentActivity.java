package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.hml.HmlNTBPinConsentActivity;
import com.scb.phone.view.activity.hml.HmlNTBReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addPersonalShortCut;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setReadOnly;
import p040o.setTapText;
import p040o.zzfe;

public final class HmlNTBConsentActivity extends HmlBaseConsentActivity {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public addPersonalShortCut presenter;

    public final String MediaSessionCompat$Token() {
        return "ntb";
    }

    public final void read() {
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, zzfe.zza zza, immediateFailedFuture immediatefailedfuture) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) zza, "type");
            Intent intent = new Intent(context, HmlNTBConsentActivity.class);
            intent.putExtra("HML_CONSENT_TYPE", zza);
            intent.putExtra("HML_TERM_AND_CONDITION_DISPLAY", immediatefailedfuture);
            return intent;
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        addPersonalShortCut addpersonalshortcut = this.presenter;
        if (addpersonalshortcut == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        addpersonalshortcut.MediaBrowserCompat$ItemReceiver(this);
    }

    public final setReadOnly<?> MediaSessionCompat$QueueItem() {
        addPersonalShortCut addpersonalshortcut = this.presenter;
        if (addpersonalshortcut == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return addpersonalshortcut;
    }

    public final void write() {
        HmlNTBPinConsentActivity.read read = HmlNTBPinConsentActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBPinConsentActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 5658);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlVerifyPhoneActivity.MediaBrowserCompat$CustomActionResultReceiver(this, Boolean.valueOf(z));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 5658);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBReviewActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBReviewActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlNTBReviewActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Intent putExtra = new Intent().putExtra("EXTRA_IS_ACCEPTED", z);
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
        }
        setResult(-1, putExtra.putExtra("HML_CONSENT_TYPE", zza));
        finish();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 5658 && i2 == -1) {
            addPersonalShortCut addpersonalshortcut = this.presenter;
            if (addpersonalshortcut == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            addpersonalshortcut.read();
        } else if (i == 5658 && i2 == 0) {
            finish();
        }
    }
}
