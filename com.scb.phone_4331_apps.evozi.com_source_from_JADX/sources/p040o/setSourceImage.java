package p040o;

import com.scb.phone.view.activity.juristic.JuristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.setSourceImage */
public final /* synthetic */ class setSourceImage implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ getErrDesc read;

    public /* synthetic */ setSourceImage(getErrDesc geterrdesc) {
        this.read = geterrdesc;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        getErrDesc geterrdesc = this.read;
        JuristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver = (JuristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver) obj;
        boolean z = true;
        if (geterrdesc.RatingCompat != null) {
            geterrdesc.RatingCompat.aj_();
        }
        onGetStartedClick.write((Object) juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver, "model");
        String str9 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.read;
        String str10 = str9 == null ? "" : str9;
        String str11 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.write;
        if (str11 == null) {
            str = "";
        } else {
            str = str11;
        }
        String str12 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        if (str12 == null) {
            str2 = "";
        } else {
            str2 = str12;
        }
        String str13 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
        if (str13 == null) {
            str3 = "";
        } else {
            str3 = str13;
        }
        String str14 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
        if (str14 == null) {
            str4 = "";
        } else {
            str4 = str14;
        }
        String str15 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem;
        if (str15 == null) {
            str5 = "";
        } else {
            str5 = str15;
        }
        String str16 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (str16 == null) {
            str6 = "";
        } else {
            str6 = str16;
        }
        String str17 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (str17 == null) {
            str7 = "";
        } else {
            str7 = str17;
        }
        String str18 = juristicResetPinLandingActivity$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (str18 == null) {
            str8 = "";
        } else {
            str8 = str18;
        }
        getSourceImage getsourceimage = new getSourceImage(new getDisplayVersion(str10, str, str2, str3, str4, str5, str6, str7, str8));
        if (geterrdesc.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getsourceimage.IconCompatParcelizer(geterrdesc.RatingCompat);
        }
    }
}
