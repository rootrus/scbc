package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.FusedLocationProviderClient;

/* renamed from: o.zzjy$MediaBrowserCompat$ItemReceiver */
final class zzjy$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    private /* synthetic */ zzjy MediaBrowserCompat$CustomActionResultReceiver;

    zzjy$MediaBrowserCompat$ItemReceiver(zzjy zzjy) {
        this.MediaBrowserCompat$CustomActionResultReceiver = zzjy;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        setCircularRegion setcircularregion;
        FusedLocationProviderClient.zza zza;
        GeofencingEvent geofencingEvent;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        Object data = singleDataEntity.getData();
        onGetStartedClick.IconCompatParcelizer(data, "it.data");
        getStartPoint getstartpoint = (getStartPoint) data;
        onGetStartedClick.write((Object) getstartpoint, "entity");
        String str6 = getstartpoint.IconCompatParcelizer;
        String str7 = str6 == null ? "" : str6;
        String str8 = getstartpoint.write;
        if (str8 == null) {
            str = "";
        } else {
            str = str8;
        }
        String str9 = getstartpoint.RatingCompat;
        if (str9 == null) {
            str2 = "";
        } else {
            str2 = str9;
        }
        String str10 = getstartpoint.MediaDescriptionCompat;
        if (str10 == null) {
            str3 = "";
        } else {
            str3 = str10;
        }
        String str11 = getstartpoint.MediaBrowserCompat$SearchResultReceiver;
        if (str11 == null) {
            str4 = "";
        } else {
            str4 = str11;
        }
        String str12 = getstartpoint.MediaMetadataCompat;
        if (str12 == null) {
            str5 = "";
        } else {
            str5 = str12;
        }
        List<String> list = getstartpoint.MediaBrowserCompat$MediaItem;
        if (list == null) {
            list = HmlNationalIdActivity.IconCompatParcelizer;
        }
        List<String> list2 = list;
        GradientFill gradientFill = getstartpoint.MediaBrowserCompat$ItemReceiver;
        if (gradientFill != null) {
            onGetStartedClick.write((Object) gradientFill, "entity");
            setcircularregion = new setCircularRegion(gradientFill.MediaBrowserCompat$ItemReceiver, gradientFill.write, gradientFill.read, gradientFill.IconCompatParcelizer, gradientFill.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            setcircularregion = null;
        }
        getGradientType getgradienttype = getstartpoint.MediaBrowserCompat$CustomActionResultReceiver;
        if (getgradienttype != null) {
            onGetStartedClick.write((Object) getgradienttype, "entity");
            zza = new FusedLocationProviderClient.zza(getgradienttype.IconCompatParcelizer, getgradienttype.read, getgradienttype.MediaBrowserCompat$ItemReceiver, getgradienttype.write);
        } else {
            zza = null;
        }
        getDashOffset getdashoffset = getstartpoint.read;
        if (getdashoffset != null) {
            geofencingEvent = GoogleSignInOptions.MediaBrowserCompat$ItemReceiver(getdashoffset);
        } else {
            geofencingEvent = null;
        }
        return new setExpirationDuration(str7, str, str2, str3, str4, str5, list2, setcircularregion, zza, geofencingEvent);
    }
}
