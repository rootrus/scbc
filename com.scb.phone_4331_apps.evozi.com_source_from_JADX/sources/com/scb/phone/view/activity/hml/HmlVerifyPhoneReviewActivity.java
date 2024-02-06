package com.scb.phone.view.activity.hml;

import android.os.Build;
import java.io.Serializable;
import java.util.HashMap;
import kotlin.TypeCastException;
import p040o.FundFactSheetActivity;
import p040o.LinkedListMultimap;
import p040o.getWscClientIp;
import p040o.getWscClientIp$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setHorizontalPadding;
import p040o.zzfe;

public final class HmlVerifyPhoneReviewActivity extends HmlVerifyPhoneActivity {
    public static final write MediaMetadataCompat = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        getWscClientIp getwscclientip = this.presenter;
        String str3 = Build.MODEL;
        onGetStartedClick.IconCompatParcelizer((Object) str3, "Build.MODEL");
        Serializable serializableExtra = getIntent().getSerializableExtra("com.scb.phone.EXTRA_DISPLAY");
        if (serializableExtra != null) {
            HashMap hashMap = (HashMap) serializableExtra;
            onGetStartedClick.write((Object) str2, "otp");
            onGetStartedClick.write((Object) str, "tokenUuid");
            onGetStartedClick.write((Object) str3, "deviceModel");
            onGetStartedClick.write((Object) hashMap, "consents");
            if (getwscclientip.RatingCompat != null) {
                getwscclientip.RatingCompat.AlertController$RecycleListView();
            }
            LinkedListMultimap.C35722 r9 = getwscclientip.read;
            FundFactSheetActivity getwscclientip_mediabrowsercompat_customactionresultreceiver = new getWscClientIp$MediaBrowserCompat$CustomActionResultReceiver(getwscclientip);
            FundFactSheetActivity ratingCompat = new getWscClientIp.RatingCompat(getwscclientip);
            onGetStartedClick.write((Object) getwscclientip_mediabrowsercompat_customactionresultreceiver, "onSuccess");
            onGetStartedClick.write((Object) ratingCompat, "onError");
            onGetStartedClick.write((Object) str2, "otp");
            onGetStartedClick.write((Object) str, "tokenUuid");
            onGetStartedClick.write((Object) str3, "deviceModel");
            onGetStartedClick.write((Object) hashMap, "consents");
            r9.MediaBrowserCompat$MediaItem.IconCompatParcelizer(getwscclientip_mediabrowsercompat_customactionresultreceiver, ratingCompat, new setHorizontalPadding.write(str2, str, str3, (Boolean) hashMap.get(zzfe.zza.TERMS_N_CONDITIONS), (Boolean) hashMap.get(zzfe.zza.MODEL_CONSENT), (Boolean) hashMap.get(zzfe.zza.CROSS_SELL_CONSENT)), r9.MediaBrowserCompat$ItemReceiver);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.util.HashMap<com.scb.phone.domain.entity.hml.HmlConsent, kotlin.Boolean>");
    }
}
