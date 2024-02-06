package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import p040o.C9774x220c19b5;
import p040o.FundFactSheetActivity;
import p040o.LinkedListMultimap;
import p040o.getFiles;
import p040o.getWscClientIp;
import p040o.getWscClientIp$MediaBrowserCompat$SearchResultReceiver;
import p040o.onGetStartedClick;
import p040o.setShowMotionSpecResource;

public class HmlVerifyPhoneTermsConditionsActivity extends HmlVerifyPhoneActivity {
    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, HmlVerifyPhoneTermsConditionsActivity.class);
    }

    public final void IconCompatParcelizer(getFiles getfiles) {
        setResult(-1, new Intent().putExtra("com.scb.phone.EXTRA_DISPLAY", getfiles));
        finish();
    }

    public final void write(String str, String str2) {
        getWscClientIp getwscclientip = this.presenter;
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) str, "tokenUuid");
        if (getwscclientip.RatingCompat != null) {
            getwscclientip.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35722 r3 = getwscclientip.read;
        FundFactSheetActivity mediaMetadataCompat = new getWscClientIp.MediaMetadataCompat(getwscclientip);
        FundFactSheetActivity getwscclientip_mediabrowsercompat_searchresultreceiver = new getWscClientIp$MediaBrowserCompat$SearchResultReceiver(getwscclientip);
        onGetStartedClick.write((Object) mediaMetadataCompat, "onSuccess");
        onGetStartedClick.write((Object) getwscclientip_mediabrowsercompat_searchresultreceiver, "onError");
        onGetStartedClick.write((Object) str, "tokenUuid");
        onGetStartedClick.write((Object) str2, "otp");
        setShowMotionSpecResource setshowmotionspecresource = r3.IconCompatParcelizer;
        setshowmotionspecresource.write(setshowmotionspecresource.IconCompatParcelizer(str2, str), new C9774x220c19b5(getwscclientip_mediabrowsercompat_searchresultreceiver, mediaMetadataCompat));
    }
}
