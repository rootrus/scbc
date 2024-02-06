package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.scb.phone.view.activity.forgotpin.ForgotPinOtpActivity;
import com.scb.phone.view.activity.ndid.BaseLivenessCheckActivity;
import com.scb.phone.view.activity.registration.RegistrationTermsAndConsActivity;
import com.scb.phone.view.fragment.registration.RegistrationFacialVerificationLockedActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.Serializable;
import kotlin.TypeCastException;
import p040o.C4066bA;
import p040o.C4982my;
import p040o.HmlPinActivity;
import p040o.IOException;
import p040o.MaterialCalendarView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickExtractorAgent;
import p040o.getKernelIDDstOver;
import p040o.mB$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.onMarkerClick;
import p040o.parseProcMapsJsonFromStream;
import p040o.setTapText;

public final class RegistrationLivenessCheckActivity extends BaseLivenessCheckActivity implements QuickExtractorAgent.C7021a {
    public static final C5709xe487f1a8 MediaBrowserCompat$MediaItem = new C5709xe487f1a8((byte) 0);
    /* access modifiers changed from: private */
    public static final String MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public static final String MediaMetadataCompat = MediaMetadataCompat;
    private getKernelIDDstOver MediaSessionCompat$ResultReceiverWrapper;
    @HmlPinActivity
    public C4982my registrationLivenessCheckPresenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaSessionCompat$ResultReceiverWrapper = new getKernelIDDstOver();
        C4982my myVar = this.registrationLivenessCheckPresenter;
        if (myVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("registrationLivenessCheckPresenter");
        }
        Serializable serializableExtra = getIntent().getSerializableExtra(MediaMetadataCompat);
        if (serializableExtra != null) {
            parseProcMapsJsonFromStream parseprocmapsjsonfromstream = (parseProcMapsJsonFromStream) serializableExtra;
            Parcelable parcelableExtra = getIntent().getParcelableExtra(MediaBrowserCompat$SearchResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(EXTRA_VERIFIED_METHOD)");
            onMarkerClick onmarkerclick = (onMarkerClick) parcelableExtra;
            onGetStartedClick.write((Object) parseprocmapsjsonfromstream, "flowType");
            onGetStartedClick.write((Object) onmarkerclick, "verifiedMethod");
            IOException iOException = IOException.MediaBrowserCompat$CustomActionResultReceiver;
            if (myVar.RatingCompat != null) {
                iOException.IconCompatParcelizer(myVar.RatingCompat);
            }
            myVar.MediaBrowserCompat$ItemReceiver = parseprocmapsjsonfromstream;
            myVar.read = onmarkerclick;
            getKernelIDDstOver getkerneliddstover = this.MediaSessionCompat$ResultReceiverWrapper;
            if (getkerneliddstover == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("registrationTracker");
            }
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "registration_face_recognition");
            MaterialCalendarView.SelectionMode.write(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.enums.RegistrationCardDetailFlow");
    }

    public final C4066bA<?> MediaSessionCompat$Token() {
        C4982my myVar = this.registrationLivenessCheckPresenter;
        if (myVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("registrationLivenessCheckPresenter");
        }
        return myVar;
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
    }

    public final void MediaSessionCompat$QueueItem() {
        super.MediaSessionCompat$QueueItem();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        super.AppCompatDelegateImpl$ListMenuDecorView();
    }

    public final void read() {
        RegistrationTermsAndConsActivity.write write = RegistrationTermsAndConsActivity.MediaBrowserCompat$MediaItem;
        Intent write2 = RegistrationTermsAndConsActivity.write.write(this, mB$MediaBrowserCompat$ItemReceiver.EASYAPP);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write2).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(onMarkerClick onmarkerclick) {
        onGetStartedClick.write((Object) onmarkerclick, "verifiedMethod");
        RegistrationFacialVerificationLockedActivity.read read = RegistrationFacialVerificationLockedActivity.MediaDescriptionCompat;
        Context context = this;
        Intent intent = getIntent();
        Serializable serializableExtra = intent != null ? intent.getSerializableExtra(MediaMetadataCompat) : null;
        if (serializableExtra != null) {
            Intent IconCompatParcelizer = RegistrationFacialVerificationLockedActivity.read.IconCompatParcelizer(context, onmarkerclick, (parseProcMapsJsonFromStream) serializableExtra);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, IconCompatParcelizer).read();
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
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.enums.RegistrationCardDetailFlow");
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        mo13803Z_();
    }

    public final void IconCompatParcelizer(parseProcMapsJsonFromStream parseprocmapsjsonfromstream) {
        onGetStartedClick.write((Object) parseprocmapsjsonfromstream, "flowType");
        if (parseprocmapsjsonfromstream == parseProcMapsJsonFromStream.FAST_EASY) {
            Intent intent = new Intent(this, RegistrationOtpActivity.class);
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
        } else {
            Intent intent2 = new Intent(this, ForgotPinOtpActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, intent2).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read2.getData());
                sb2.append("\n with context ");
                sb2.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                startActivity(read2);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }
}
