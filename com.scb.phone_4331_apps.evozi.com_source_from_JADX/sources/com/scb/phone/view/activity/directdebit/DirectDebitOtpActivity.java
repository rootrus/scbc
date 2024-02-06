package com.scb.phone.view.activity.directdebit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C10827Iterators;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IdWorkflowActivity;
import p040o.MissingNativeComponent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Tasks$zza$MediaBrowserCompat$ItemReceiver;
import p040o.nativeGetImage;
import p040o.onGetStartedClick;
import p040o.readEntries;
import p040o.setTapText;
import p040o.standardStartAndWait;

public final class DirectDebitOtpActivity extends BaseOtpActivity implements IdWorkflowActivity.C1222a {
    public static final DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = new DirectDebitOtpActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public nativeGetImage presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        nativeGetImage nativegetimage = this.presenter;
        if (nativegetimage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nativegetimage.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        Intent intent = getIntent();
        String str3 = null;
        MissingNativeComponent.MissingNativeSessionFileProvider missingNativeSessionFileProvider = intent != null ? (MissingNativeComponent.MissingNativeSessionFileProvider) intent.getParcelableExtra("EXTRA_DIRECT_DEBIT_INPUT_DISPLAY") : null;
        nativeGetImage nativegetimage = this.presenter;
        if (nativegetimage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (missingNativeSessionFileProvider != null) {
            str3 = missingNativeSessionFileProvider.write;
        }
        if (str3 != null && str != null && str2 != null) {
            if (nativegetimage.RatingCompat != null) {
                nativegetimage.RatingCompat.AlertController$RecycleListView();
            }
            C10827Iterators.C35445 r1 = nativegetimage.read;
            FundFactSheetActivity write = new nativeGetImage.write(nativegetimage, missingNativeSessionFileProvider);
            FundFactSheetActivity read = new nativeGetImage.read(nativegetimage);
            readEntries readentries = new readEntries(missingNativeSessionFileProvider.write);
            onGetStartedClick.write((Object) write, "onSuccess");
            onGetStartedClick.write((Object) read, "onError");
            onGetStartedClick.write((Object) readentries, "request");
            onGetStartedClick.write((Object) str, "tokenUUID");
            onGetStartedClick.write((Object) str2, "otp");
            r1.IconCompatParcelizer(r1.read, write, read, new Tasks$zza$MediaBrowserCompat$ItemReceiver(readentries, str, str2));
        }
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        C5595x840cad9c directDebitSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = DirectDebitSuccessActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) standardstartandwait, "successDisplay");
        Intent intent = new Intent(context, DirectDebitSuccessActivity.class);
        intent.putExtra("EXTRA_DIRECT_DEBIT_SUCCESS_DISPLAY", standardstartandwait);
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
        finish();
    }
}
