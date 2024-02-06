package com.scb.phone.view.activity.debitcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewCommonActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import org.bouncycastle.asn1.eac.EACTags;
import p040o.CheckCaptureModule_GetIParametersFactory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.isCancellationRequested;
import p040o.nativeGetId;
import p040o.nativeGetLabel;
import p040o.nativeGetRectangle;
import p040o.nativeLoadModel;
import p040o.setTapText;
import p040o.sortFields;

public class DebitCardRequestReviewActivity extends ReviewCommonActivity implements CheckCaptureModule_GetIParametersFactory {
    @HmlPinActivity
    public nativeLoadModel presenter;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        Intent intent = new Intent(context, DebitCardRequestReviewActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
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

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("atm_request_confirmation_screen");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        nativeLoadModel nativeloadmodel = this.presenter;
        isCancellationRequested iscancellationrequested = nativeloadmodel.read;
        iscancellationrequested.read(iscancellationrequested.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(), new nativeGetId(nativeloadmodel), new nativeGetRectangle(nativeloadmodel));
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo13826x50fd9e4a() {
        return getString(R.string.debit_card_review_function);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        nativeLoadModel nativeloadmodel = this.presenter;
        sortFields sortfields = new sortFields(nativeloadmodel);
        if (nativeloadmodel.RatingCompat != null) {
            sortfields.IconCompatParcelizer(nativeloadmodel.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(String str) {
        Intent read = DebitCardRequestPayOtpActivity.read(this, str);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        DebitCardRequestSuccessActivity.MediaBrowserCompat$ItemReceiver(this);
        finish();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 123) {
            boolean z = true;
            if (i2 == -1) {
                nativeLoadModel nativeloadmodel = this.presenter;
                nativeGetLabel nativegetlabel = nativeGetLabel.write;
                if (nativeloadmodel.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    nativegetlabel.IconCompatParcelizer(nativeloadmodel.RatingCompat);
                }
            } else if (intent != null) {
                nativeLoadModel nativeloadmodel2 = this.presenter;
                String stringExtra = intent.getStringExtra("OTP_ERROR_TITLE");
                String stringExtra2 = intent.getStringExtra("OTP_ERROR_MESSAGE");
                if (stringExtra != null && stringExtra2 != null) {
                    nativeloadmodel2.read(stringExtra, stringExtra2);
                }
            } else if (i2 == 0) {
                nativeLoadModel nativeloadmodel3 = this.presenter;
                if (nativeloadmodel3.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    nativeloadmodel3.RatingCompat.aj_();
                }
            }
        }
    }
}
