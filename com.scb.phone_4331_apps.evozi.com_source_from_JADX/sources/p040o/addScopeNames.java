package p040o;

import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.addScopeNames */
public final class addScopeNames extends FragmentBuilder_BindSummaryFragment {
    public static setTrafficEnabled MediaBrowserCompat$ItemReceiver(saveLayerCompat savelayercompat, List<zzry> list) {
        String str;
        Object obj;
        String str2;
        BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        zzrz zzrz;
        zzrz zzrz2;
        saveLayerCompat savelayercompat2 = savelayercompat;
        Iterator it = list.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((zzry) obj).write, (Object) savelayercompat2.IconCompatParcelizer)) {
                break;
            }
        }
        zzry zzry = (zzry) obj;
        int i = savelayercompat2.Keep;
        if (zzry != null) {
            str2 = zzry.MediaBrowserCompat$ItemReceiver;
        } else {
            str2 = null;
        }
        String str7 = str2 != null ? str2 : "";
        if (savelayercompat2.MediaSessionCompat$QueueItem != null) {
            if (zzry == null || (zzrz2 = zzry.read) == null) {
                str5 = null;
            } else {
                str5 = zzrz2.MediaBrowserCompat$CustomActionResultReceiver;
            }
            if (str5 == null) {
                str5 = "";
            }
            if (zzry == null || (zzrz = zzry.read) == null) {
                str6 = null;
            } else {
                str6 = zzrz.read;
            }
            if (str6 == null) {
                str6 = "";
            }
            billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver = new BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver(str5, str6);
        } else {
            billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver = new BillPaymentSearchActivity$MediaBrowserCompat$ItemReceiver("", "");
        }
        String str8 = savelayercompat2.IconCompatParcelizer;
        if (zzry != null) {
            str = zzry.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        String str9 = savelayercompat2.MediaMetadataCompat;
        List<String> list2 = savelayercompat2.write;
        if (list2 == null) {
            list2 = HmlNationalIdActivity.IconCompatParcelizer;
        }
        List<String> list3 = list2;
        String str10 = savelayercompat2.MediaBrowserCompat$MediaItem;
        String str11 = savelayercompat2.AlertController$RecycleListView;
        String str12 = savelayercompat2.ParcelableVolumeInfo;
        if (str12 == null) {
            str12 = "0";
        }
        String str13 = str12;
        String str14 = savelayercompat2.MediaBrowserCompat$CustomActionResultReceiver;
        String str15 = savelayercompat2.MediaSessionCompat$ResultReceiverWrapper;
        int i2 = savelayercompat2.PlaybackStateCompat$CustomAction;
        int i3 = savelayercompat2.setHasDecor;
        int i4 = savelayercompat2.MediaDescriptionCompat;
        String str16 = savelayercompat2.MediaSessionCompat$Token;
        String str17 = savelayercompat2.RatingCompat;
        String str18 = savelayercompat2.MediaBrowserCompat$ItemReceiver;
        String str19 = savelayercompat2.f2931x50fd9e4a;
        String str20 = savelayercompat2.MediaBrowserCompat$SearchResultReceiver;
        if (str20 == null) {
            str4 = "";
        } else {
            str4 = str20;
        }
        return new setTrafficEnabled(i, str7, billPaymentSearchActivity$MediaBrowserCompat$ItemReceiver, str8, str3, str9, list3, str10, str11, str13, str14, str15, i2, i3, i4, str16, str17, str18, str19, str4);
    }
}
