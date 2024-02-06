package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.mwpartner.MwChangeCasaSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.C10833element;
import p040o.Charsets;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingObject;
import p040o.ForwardingSortedMap;
import p040o.HmlPinActivity;
import p040o.ICompletionListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TaskRunner;
import p040o.getShortName;
import p040o.immediateCheckedFuture;
import p040o.newLatLng;
import p040o.onGetStartedClick;
import p040o.setDimensions;
import p040o.setTapText;
import p040o.standardElementSet;
import p040o.standardPoll;

public final class MwCasaOtpActivity extends BaseOtpActivity implements ICompletionListener {
    public static final MwCasaOtpActivity$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new MwCasaOtpActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public TaskRunner presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TaskRunner taskRunner = this.presenter;
        if (taskRunner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        taskRunner.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        ForwardingSortedMap forwardingSortedMap;
        TaskRunner taskRunner = this.presenter;
        if (taskRunner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Parcelable parcelableExtra = getIntent().getParcelableExtra("depositDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(KEY_DEPOSIT_DISPLAY)");
        immediateCheckedFuture immediatecheckedfuture = (immediateCheckedFuture) parcelableExtra;
        onGetStartedClick.write((Object) immediatecheckedfuture, "depositDisplay");
        if (taskRunner.RatingCompat != null) {
            taskRunner.RatingCompat.AlertController$RecycleListView();
        }
        standardElementSet write = standardElementSet.write();
        write.write = immediatecheckedfuture.setPopupCallback;
        write.read = immediatecheckedfuture.read;
        setDimensions setdimensions = immediatecheckedfuture.IconCompatParcelizer;
        onGetStartedClick.IconCompatParcelizer((Object) setdimensions, "depositDisplay.accountStatus");
        write.MediaBrowserCompat$ItemReceiver = setdimensions.status;
        getShortName getshortname = immediatecheckedfuture.setBackgroundResource;
        onGetStartedClick.IconCompatParcelizer((Object) getshortname, "depositDisplay.productType");
        write.IconCompatParcelizer = getshortname.value;
        Charsets charsets = taskRunner.write;
        onGetStartedClick.IconCompatParcelizer((Object) write, "bankAccountRequest");
        onGetStartedClick.write((Object) write, "bankAccountRequest");
        C10833element write2 = charsets.MediaBrowserCompat$ItemReceiver.write();
        onGetStartedClick.IconCompatParcelizer((Object) write2, "merchantWalletCase.requestBuilder");
        ForwardingObject forwardingObject = write2.read;
        C10833element write3 = charsets.MediaBrowserCompat$ItemReceiver.write();
        onGetStartedClick.IconCompatParcelizer((Object) write3, "merchantWalletCase.requestBuilder");
        standardPoll standardpoll = new standardPoll("CHANGE_ACCOUNT", forwardingObject, write3.write, charsets.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        List<ForwardingSortedMap> list = standardpoll.read;
        if (!(list == null || (forwardingSortedMap = list.get(0)) == null)) {
            forwardingSortedMap.IconCompatParcelizer = write;
        }
        DebitCardResetOtpActivity<newLatLng> MediaBrowserCompat$CustomActionResultReceiver = charsets.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(str, "", str2, standardpoll);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "mwRepository.changeMerch…ID, otpKey, otp, request)");
        charsets.read(MediaBrowserCompat$CustomActionResultReceiver, new TaskRunner.write(taskRunner), new TaskRunner.IconCompatParcelizer(taskRunner));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoCrashlyticsReportEncoder.C3050xc3999712 crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder) {
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder, "display");
        MwChangeCasaSuccessActivity.write write = MwChangeCasaSuccessActivity.MediaDescriptionCompat;
        Context context = this;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("depositDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtra(KEY_DEPOSIT_DISPLAY)");
        immediateCheckedFuture immediatecheckedfuture = (immediateCheckedFuture) parcelableExtra;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) immediatecheckedfuture, "depositDisplay");
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder, "merchantOtpDisplay");
        Intent intent = new Intent(context, MwChangeCasaSuccessActivity.class);
        intent.putExtra("depositDisplay", immediatecheckedfuture);
        intent.putExtra("merchantOtpDisplay", crashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        mo13677k_(str);
    }

    public final void write() {
        finish();
    }

    public final void onDestroy() {
        super.onDestroy();
        TaskRunner taskRunner = this.presenter;
        if (taskRunner == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        taskRunner.onDestroy();
    }
}
