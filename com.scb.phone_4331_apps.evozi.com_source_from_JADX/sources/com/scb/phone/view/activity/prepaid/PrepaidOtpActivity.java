package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4750hg;
import p040o.ForwardingService;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableBiMap;
import p040o.ImmutableClassToInstanceMap;
import p040o.ImmutableCollection;
import p040o.LocalProjectProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Platform$MediaBrowserCompat$ItemReceiver;
import p040o.equalsImpl;
import p040o.hg$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.hg$MediaBrowserCompat$MediaItem;
import p040o.hg$MediaBrowserCompat$SearchResultReceiver;
import p040o.isSimulator;
import p040o.onGetStartedClick;
import p040o.precomputeCharMatcher;
import p040o.setModel;
import p040o.setTapText;
import p040o.standardStartAndWait;
import p040o.writeUInt64NoTag;

public final class PrepaidOtpActivity extends BaseOtpActivity implements LocalProjectProvider.VersionTable.VersionList.read {
    public static final PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new PrepaidOtpActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    @HmlPinActivity
    public C4750hg presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4750hg hgVar = this.presenter;
        if (hgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hgVar.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        setModel setmodel = (setModel) getIntent().getParcelableExtra("EXTRA_PREPAID_ACTIVATION_VERIFICATION");
        C4750hg hgVar = this.presenter;
        if (hgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        boolean z = true;
        if (setmodel != null) {
            writeUInt64NoTag.IconCompatParcelizer hg_mediabrowsercompat_searchresultreceiver = new hg$MediaBrowserCompat$SearchResultReceiver(str, str2);
            if (hgVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                hg_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(hgVar.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer hg_mediabrowsercompat_mediaitem = new hg$MediaBrowserCompat$MediaItem(str, str2);
        if (hgVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            hg_mediabrowsercompat_mediaitem.IconCompatParcelizer(hgVar.RatingCompat);
        }
    }

    public final void write(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_PREPAID_SUCCESS", standardstartandwait);
        setResult(-1, intent);
        finish();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        mo13730i_(str);
    }

    public final void write() {
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
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
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        finish();
    }

    public final void IconCompatParcelizer() {
        setResult(1);
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        onGetStartedClick.write((Object) str3, "tokenUUID");
        onGetStartedClick.write((Object) str4, "otp");
        isSimulator issimulator = (isSimulator) getIntent().getParcelableExtra("EXTRA_PREPAID_CARD");
        ImmutableBiMap.SerializedForm serializedForm = (ImmutableBiMap.SerializedForm) getIntent().getParcelableExtra("EXTRA_PREPAID_ENCRYPT_PIN");
        setModel setmodel = (setModel) getIntent().getParcelableExtra("EXTRA_PREPAID_ACTIVATION_VERIFICATION");
        C4750hg hgVar = this.presenter;
        if (hgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) issimulator, "landingDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) setmodel, "verificationDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) serializedForm, "encryptPin");
        onGetStartedClick.write((Object) str3, "tokenUUID");
        onGetStartedClick.write((Object) str4, "otp");
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        onGetStartedClick.write((Object) setmodel, "verificationDisplay");
        onGetStartedClick.write((Object) serializedForm, "encryptPin");
        if (hgVar.RatingCompat != null) {
            hgVar.RatingCompat.AlertController$RecycleListView();
        }
        ImmutableClassToInstanceMap.Builder builder = new ImmutableClassToInstanceMap.Builder(setmodel.read, serializedForm.write, serializedForm.MediaBrowserCompat$CustomActionResultReceiver, serializedForm.read, serializedForm.IconCompatParcelizer, serializedForm.MediaBrowserCompat$ItemReceiver);
        equalsImpl equalsimpl = hgVar.IconCompatParcelizer;
        FundFactSheetActivity hg_mediabrowsercompat_customactionresultreceiver = new hg$MediaBrowserCompat$CustomActionResultReceiver(hgVar, issimulator, setmodel);
        FundFactSheetActivity iconCompatParcelizer = new C4750hg.IconCompatParcelizer(hgVar);
        onGetStartedClick.write((Object) hg_mediabrowsercompat_customactionresultreceiver, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        onGetStartedClick.write((Object) builder, "request");
        onGetStartedClick.write((Object) str3, "tokenUUID");
        onGetStartedClick.write((Object) str4, "otp");
        equalsimpl.IconCompatParcelizer(equalsimpl.read, hg_mediabrowsercompat_customactionresultreceiver, iconCompatParcelizer, new Platform$MediaBrowserCompat$ItemReceiver(builder, str3, str4));
    }

    public final void IconCompatParcelizer(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        ForwardingService forwardingService = (ForwardingService) getIntent().getParcelableExtra("EXTRA_PREPAID_REVIEW");
        String stringExtra = getIntent().getStringExtra("EXTRA_PREPAID_TRANSACTION_TOKEN");
        C4750hg hgVar = this.presenter;
        if (hgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "transactionToken");
        onGetStartedClick.IconCompatParcelizer((Object) forwardingService, "reviewDisplay");
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) stringExtra, "transactionToken");
        onGetStartedClick.write((Object) forwardingService, "reviewDisplay");
        if (hgVar.RatingCompat != null) {
            hgVar.RatingCompat.AlertController$RecycleListView();
        }
        ImmutableCollection.SerializedForm serializedForm = new ImmutableCollection.SerializedForm(stringExtra);
        equalsImpl equalsimpl = hgVar.IconCompatParcelizer;
        FundFactSheetActivity ratingCompat = new C4750hg.RatingCompat(hgVar, forwardingService);
        FundFactSheetActivity mediaDescriptionCompat = new C4750hg.MediaDescriptionCompat(hgVar);
        onGetStartedClick.write((Object) ratingCompat, "onSuccess");
        onGetStartedClick.write((Object) mediaDescriptionCompat, "onError");
        onGetStartedClick.write((Object) serializedForm, "request");
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        equalsimpl.IconCompatParcelizer(equalsimpl.MediaBrowserCompat$CustomActionResultReceiver, ratingCompat, mediaDescriptionCompat, new precomputeCharMatcher.read(serializedForm, str, str2));
    }

    public final void onBackPressed() {
        setResult(1);
        super.onBackPressed();
    }

    public final void onDestroy() {
        C4750hg hgVar = this.presenter;
        if (hgVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hgVar.onDestroy();
        super.onDestroy();
    }
}
