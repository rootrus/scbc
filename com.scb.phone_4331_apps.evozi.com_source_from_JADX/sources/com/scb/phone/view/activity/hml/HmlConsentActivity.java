package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.hml.HmlETBReviewActivity;
import com.scb.phone.view.activity.hml.businessowner.C5625x9ac9705b;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerReviewSubmissionActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C10864setUsername;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setReadOnly;
import p040o.setTapText;
import p040o.zzfe;

public class HmlConsentActivity extends HmlBaseConsentActivity {
    public static final read MediaMetadataCompat = new read((byte) 0);
    @HmlPinActivity
    public C10864setUsername presenter;

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent write(Context context, zzfe.zza zza, immediateFailedFuture immediatefailedfuture) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) zza, "type");
            Intent intent = new Intent(context, HmlConsentActivity.class);
            intent.putExtra("HML_CONSENT_TYPE", zza);
            intent.putExtra("HML_TERM_AND_CONDITION_DISPLAY", immediatefailedfuture);
            return intent;
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        C10864setUsername setusername = this.presenter;
        if (setusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setusername.MediaBrowserCompat$ItemReceiver(this);
    }

    public final setReadOnly<?> MediaSessionCompat$QueueItem() {
        C10864setUsername setusername = this.presenter;
        if (setusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return setusername;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10864setUsername setusername = this.presenter;
        if (setusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setusername.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlETBReviewActivity.read read2 = HmlETBReviewActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlETBReviewActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read3 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read3.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read3);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read() {
        C5625x9ac9705b hmlBusinessOwnerReviewSubmissionActivity$MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, HmlBusinessOwnerReviewSubmissionActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlPinActivity.MediaBrowserCompat$CustomActionResultReceiver(this, Boolean.valueOf(z));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_IS_ACCEPTED", z);
        zzfe.zza zza = this.MediaDescriptionCompat;
        if (zza == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("consentType");
        }
        intent.putExtra("HML_CONSENT_TYPE", zza);
        setResult(-1, intent);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7134 && i2 == -1) {
            C10864setUsername setusername = this.presenter;
            if (setusername == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setusername.read();
        }
    }

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, zzfe.zza zza) {
        return read.write(context, zza, (immediateFailedFuture) null);
    }
}
