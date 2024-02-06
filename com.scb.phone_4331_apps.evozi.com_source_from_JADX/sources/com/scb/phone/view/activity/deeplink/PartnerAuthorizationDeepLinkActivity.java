package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity;
import com.scb.phone.view.activity.partner.PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver;
import java.util.HashMap;
import java.util.Set;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBEkycVerifyIdentifyBranchActivity;
import p040o.HmlPinActivity;
import p040o.IdExtractor;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.access$2300;
import p040o.getEventAppExecutionSize;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;
import p040o.zzmd;

public final class PartnerAuthorizationDeepLinkActivity extends BaseDeepLinkActivity implements IdExtractor.C69123 {
    @HmlPinActivity
    public getEventAppExecutionSize presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 3;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        Set<String> set;
        onGetStartedClick.write((Object) intent, "data");
        getEventAppExecutionSize geteventappexecutionsize = this.presenter;
        if (geteventappexecutionsize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        geteventappexecutionsize.MediaBrowserCompat$ItemReceiver(this);
        getEventAppExecutionSize geteventappexecutionsize2 = this.presenter;
        if (geteventappexecutionsize2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Uri data = intent.getData();
        CharSequence charSequence = str;
        boolean z = false;
        if (charSequence == null || GoodToKnowActivity.read(charSequence)) {
            geteventappexecutionsize2.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic, access$2300.write.NAVIGATE_BACK);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(zzmd.zzm.zza.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, str);
        if (data == null || (set = data.getQueryParameterNames()) == null) {
            set = HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        for (String str2 : set) {
            String queryParameter = data != null ? data.getQueryParameter(str2) : null;
            onGetStartedClick.IconCompatParcelizer((Object) str2, "key");
            hashMap.put(str2, queryParameter);
        }
        writeUInt64NoTag.IconCompatParcelizer read = new getEventAppExecutionSize.read(hashMap);
        if (geteventappexecutionsize2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            read.IconCompatParcelizer(geteventappexecutionsize2.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(HashMap<String, Object> hashMap) {
        onGetStartedClick.write((Object) hashMap, "params");
        PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver partnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver = PartnerAuthorizationActivity.MediaDescriptionCompat;
        Context context = this;
        Intent intent = getIntent();
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("IS_NEED_HISTORY_STACK", false);
        }
        read(PartnerAuthorizationActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(context, hashMap, z, getIntent()));
    }
}
