package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import p040o.CrashlyticsController;
import p040o.zzcz;

/* renamed from: o.complementOf */
public final class complementOf extends RegularImmutableSet {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public complementOf(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public final CrashlyticsController.C322216 IconCompatParcelizer(zzcz.zzg zzg) {
        String str;
        String str2;
        List list;
        zzcz.zzb zzb;
        zzcz.zzg zzg2 = zzg;
        onGetStartedClick.write((Object) zzg2, "data");
        String replaceAll = constrainedListMultimap.write(Double.valueOf(zzg2.MediaDescriptionCompat)).replaceAll("\\.0*$", "");
        onGetStartedClick.IconCompatParcelizer((Object) replaceAll, "transformFundWithNoDecimal(data.principal)");
        String str3 = zzg2.MediaBrowserCompat$ItemReceiver;
        if (str3 == null) {
            str = "";
        } else {
            str = str3;
        }
        Double d = zzg2.IconCompatParcelizer.write;
        if (d == null) {
            d = Double.valueOf(0.0d);
        }
        String replaceAll2 = constrainedListMultimap.write(d).replaceAll("\\.0*$", "");
        onGetStartedClick.IconCompatParcelizer((Object) replaceAll2, "transformFundWithNoDecim…nstallment.amount ?: 0.0)");
        String str4 = zzg2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (str4 == null) {
            str4 = "";
        }
        writeToCosFromFile writetocosfromfile = new writeToCosFromFile(replaceAll2, str4, zzg2.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver, zzg2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy", zzg2.ParcelableVolumeInfo);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthStri…(data.repaymentStartDate)");
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(zzg2.MediaBrowserCompat$CustomActionResultReceiver)}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(this, *args)");
        String RatingCompat = RatingCompat(format);
        if (RatingCompat == null) {
            str2 = "";
        } else {
            str2 = RatingCompat;
        }
        List<Geofence> list2 = zzg2.MediaBrowserCompat$SearchResultReceiver;
        if (list2 != null) {
            Iterable<Geofence> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (Geofence geofence : iterable) {
                arrayList.add(RegularImmutableSet.MediaBrowserCompat$CustomActionResultReceiver(this, geofence.write, geofence.read, 0, 0, 12));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        zzcz.zzb zzb2 = zzg2.write;
        if (zzb2 != null) {
            String MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(Double.parseDouble(zzb2.read));
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "com.scb.phone.presentati…                        )");
            String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(Double.parseDouble(zzb2.IconCompatParcelizer));
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "com.scb.phone.presentati…                        )");
            zzb = new zzcz.zzb(MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            zzb = null;
        }
        return new CrashlyticsController.C322216(replaceAll, str, writetocosfromfile, IconCompatParcelizer, str2, list, zzb);
    }
}
