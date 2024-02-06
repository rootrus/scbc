package p040o;

import android.text.TextUtils;
import p040o.PlaceFilter;

/* renamed from: o.getInt */
public final /* synthetic */ class getInt implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ zaad MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getInt(zaad zaad) {
        this.MediaBrowserCompat$ItemReceiver = zaad;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        PlaceFilter.zzb zzb;
        PlaceReport placeReport;
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow;
        zzwn zzwn;
        zzwl zzwl;
        zzwl zzwl2;
        zzwo zzwo;
        String str3;
        String str4;
        zzwu zzwu;
        zzwu zzwu2;
        zzxc zzxc;
        zzwm zzwm;
        zzwp zzwp;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        OnCheckedChanged onCheckedChanged = (OnCheckedChanged) obj;
        if (onCheckedChanged.getStatus().write().equals(PlaceAutocompleteFragment.SYSTEM_MAINTENANCE.code)) {
            return new zzwi((String) null, 0, (String) null, (PlaceFilter.zzb) null, (PlaceReport) null, (isRestrictedToPlacesOpenNow) null, (zzws) null, (getLikelihood) null, (getLikelihood) null, (zzwn) null, (zzwl) null, (zzwl) null, (zzwo) null, (String) null, (zzxc) null, (String) null, (String) null, (String) null, (zzwu) null, (zzwm) null, (zzwp) null);
        }
        ButterKnife butterKnife = onCheckedChanged.write;
        if (butterKnife.Keep != null) {
            if (TextUtils.isEmpty(butterKnife.Keep.IconCompatParcelizer)) {
                str2 = "";
            } else {
                str2 = butterKnife.Keep.IconCompatParcelizer;
            }
            if (TextUtils.isEmpty(butterKnife.Keep.read)) {
                str9 = "";
            } else {
                str9 = butterKnife.Keep.read;
            }
            str = str9;
        } else {
            str2 = "";
            str = str2;
        }
        String str10 = (str2 == null || !str2.contains("/")) ? null : str2.split("/")[0];
        int MediaBrowserCompat$ItemReceiver2 = zaad.MediaBrowserCompat$ItemReceiver(str2);
        isSkewIdentity isskewidentity = butterKnife.MediaSessionCompat$Token;
        if (isskewidentity != null) {
            zzb = new PlaceFilter.zzb(isskewidentity.IconCompatParcelizer == 1, isskewidentity.PlaybackStateCompat == 1, isskewidentity.AppCompatActivity == 1, isskewidentity.MediaBrowserCompat$ItemReceiver == 1, isskewidentity.setHasDecor == 1, isskewidentity.AppCompatDialogFragment == 1, isskewidentity.MediaBrowserCompat$CustomActionResultReceiver == 1, isskewidentity.MediaBrowserCompat$SearchResultReceiver == 1, isskewidentity.MediaMetadataCompat == 1, isskewidentity.MediaDescriptionCompat == 1, isskewidentity.MediaSessionCompat$Token == 1, isskewidentity.MediaSessionCompat$ResultReceiverWrapper == 1, isskewidentity.MediaBrowserCompat$MediaItem == 1, isskewidentity.write == 1, isskewidentity.ParcelableVolumeInfo == 1, isskewidentity.MediaSessionCompat$QueueItem == 1, isskewidentity.f2879x50fd9e4a == 1, isskewidentity.setBackgroundResource == 1, isskewidentity.PlaybackStateCompat$CustomAction == 1, isskewidentity.AlertController$RecycleListView == 1, isskewidentity.RatingCompat == 1, isskewidentity.read == 1, isskewidentity.Keep == 1);
        } else {
            zzb = null;
        }
        valueFromObject valuefromobject = butterKnife.setHasDecor;
        if (valuefromobject == null) {
            placeReport = null;
        } else {
            if (TextUtils.isEmpty(valuefromobject.MediaBrowserCompat$CustomActionResultReceiver)) {
                str8 = "";
            } else {
                str8 = valuefromobject.MediaBrowserCompat$CustomActionResultReceiver;
            }
            placeReport = new PlaceReport(valuefromobject.IconCompatParcelizer, str8);
        }
        parseSplitPath parsesplitpath = butterKnife.MediaBrowserCompat$ItemReceiver;
        if (parsesplitpath != null) {
            if (TextUtils.isEmpty(parsesplitpath.RatingCompat)) {
                str5 = "";
            } else {
                str5 = parsesplitpath.RatingCompat;
            }
            if (TextUtils.isEmpty(parsesplitpath.write)) {
                str6 = "";
            } else {
                str6 = parsesplitpath.write;
            }
            String str11 = parsesplitpath.MediaDescriptionCompat;
            String str12 = parsesplitpath.MediaBrowserCompat$MediaItem;
            if (!TextUtils.isEmpty(parsesplitpath.read)) {
                str7 = parsesplitpath.read;
            } else {
                str7 = "";
            }
            isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow2 = new isRestrictedToPlacesOpenNow(str5, str6, str11, str12, str7);
            isrestrictedtoplacesopennow2.write = parsesplitpath.MediaBrowserCompat$ItemReceiver;
            isrestrictedtoplacesopennow2.MediaBrowserCompat$MediaItem = parsesplitpath.IconCompatParcelizer;
            isrestrictedtoplacesopennow2.MediaBrowserCompat$CustomActionResultReceiver = parsesplitpath.MediaBrowserCompat$CustomActionResultReceiver;
            isrestrictedtoplacesopennow2.RatingCompat = parsesplitpath.MediaBrowserCompat$SearchResultReceiver;
            isrestrictedtoplacesopennow = isrestrictedtoplacesopennow2;
        } else {
            isrestrictedtoplacesopennow = null;
        }
        zzws zzws = new zzws(butterKnife.MediaMetadataCompat.write);
        getLikelihood getlikelihood = butterKnife.MediaSessionCompat$QueueItem == null ? null : new getLikelihood(butterKnife.MediaSessionCompat$QueueItem.IconCompatParcelizer, butterKnife.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver);
        getLikelihood getlikelihood2 = butterKnife.f2538x50fd9e4a == null ? null : new getLikelihood(butterKnife.f2538x50fd9e4a.IconCompatParcelizer, butterKnife.f2538x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver);
        if (butterKnife.IconCompatParcelizer == null) {
            zzwn = new zzwn("");
        } else {
            zzwn = new zzwn(butterKnife.IconCompatParcelizer.write);
        }
        zzwn zzwn2 = zzwn;
        if (butterKnife.MediaBrowserCompat$SearchResultReceiver == null) {
            zzwl = new zzwl("", "");
        } else {
            zzwl = new zzwl(butterKnife.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer, butterKnife.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        }
        zzwl zzwl3 = zzwl;
        if (butterKnife.read == null) {
            zzwl2 = new zzwl("", "");
        } else {
            zzwl2 = new zzwl(butterKnife.read.IconCompatParcelizer, butterKnife.read.MediaBrowserCompat$CustomActionResultReceiver);
        }
        zzwl zzwl4 = zzwl2;
        if (butterKnife.MediaDescriptionCompat == null) {
            zzwo = new zzwo("");
        } else {
            zzwo = new zzwo(butterKnife.MediaDescriptionCompat.IconCompatParcelizer);
        }
        zzwo zzwo2 = zzwo;
        if (butterKnife.MediaSessionCompat$ResultReceiverWrapper != null) {
            str3 = butterKnife.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer;
        } else {
            str3 = null;
        }
        zzxc zzxc2 = new zzxc(butterKnife.RatingCompat.read, butterKnife.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver);
        String str13 = butterKnife.MediaBrowserCompat$MediaItem;
        String str14 = butterKnife.RatingCompat.write;
        String str15 = butterKnife.RatingCompat.IconCompatParcelizer;
        if (butterKnife.ParcelableVolumeInfo == null) {
            zzwu = new zzwu("", "");
            str4 = str13;
        } else {
            str4 = str13;
            zzwu = new zzwu(butterKnife.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver, butterKnife.ParcelableVolumeInfo.write);
        }
        if (butterKnife.write == null) {
            zzxc = zzxc2;
            zzwu2 = zzwu;
            zzwm = new zzwm(0, 0, Boolean.FALSE);
        } else {
            zzwu2 = zzwu;
            zzxc = zzxc2;
            zzwm = new zzwm(butterKnife.write.MediaBrowserCompat$CustomActionResultReceiver, butterKnife.write.MediaBrowserCompat$ItemReceiver, butterKnife.write.write);
        }
        if (butterKnife.MediaBrowserCompat$CustomActionResultReceiver != null) {
            OnEditorAction onEditorAction = butterKnife.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) onEditorAction, "entity");
            zzwp = new zzwp(onEditorAction.MediaBrowserCompat$ItemReceiver, onEditorAction.IconCompatParcelizer, onEditorAction.write);
        } else {
            zzwp = null;
        }
        return new zzwi(str10, MediaBrowserCompat$ItemReceiver2, str, zzb, placeReport, isrestrictedtoplacesopennow, zzws, getlikelihood, getlikelihood2, zzwn2, zzwl3, zzwl4, zzwo2, str3, zzxc, str4, str14, str15, zzwu2, zzwm, zzwp);
    }
}
