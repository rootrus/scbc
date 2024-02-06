package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.LocationSettingsRequest;
import p040o.ShapeTrimPath;
import p040o.zzmd;

/* renamed from: o.createFailedResult */
public final class createFailedResult extends FragmentBuilder_BindSummaryFragment {
    public final List<LocationSettingsRequest.Builder> MediaBrowserCompat$CustomActionResultReceiver(List<ShapeTrimPath.Type> list) {
        int i;
        zzmd.zzk zzk;
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        double d8;
        if (list == null) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        Iterable<ShapeTrimPath.Type> iterable = list;
        int i2 = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i2 = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i2);
        for (ShapeTrimPath.Type type : iterable) {
            onGetStartedClick.write((Object) type, "entity");
            LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder();
            Integer num = type.MediaSessionCompat$Token;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            builder.ParcelableVolumeInfo = i;
            String str = type.MediaMetadataCompat;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) zzmd.zzk.MATURED.name())) {
                zzk = zzmd.zzk.MATURED;
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) zzmd.zzk.PARTIAL_MATURED.name())) {
                zzk = zzmd.zzk.PARTIAL_MATURED;
            } else {
                zzk = zzmd.zzk.NOT_MATURED;
            }
            builder.RatingCompat = zzk;
            builder.read = FragmentBuilder_BindSummaryFragment.write(type.read, OffsetDateTime.now());
            builder.IconCompatParcelizer = FragmentBuilder_BindSummaryFragment.write(type.IconCompatParcelizer, OffsetDateTime.now());
            String str2 = type.MediaSessionCompat$QueueItem;
            if (str2 == null) {
                str2 = "";
            }
            builder.f2752x50fd9e4a = str2;
            builder.MediaBrowserCompat$SearchResultReceiver = FragmentBuilder_BindSummaryFragment.write(type.RatingCompat, OffsetDateTime.now());
            Double d9 = type.f2782x50fd9e4a;
            double d10 = 0.0d;
            if (d9 != null) {
                d = d9.doubleValue();
            } else {
                d = 0.0d;
            }
            builder.setHasDecor = d;
            Double d11 = type.ParcelableVolumeInfo;
            if (d11 != null) {
                d2 = d11.doubleValue();
            } else {
                d2 = 0.0d;
            }
            builder.MediaSessionCompat$QueueItem = d2;
            Double d12 = type.MediaBrowserCompat$SearchResultReceiver;
            if (d12 != null) {
                d3 = d12.doubleValue();
            } else {
                d3 = 0.0d;
            }
            builder.MediaBrowserCompat$MediaItem = d3;
            Double d13 = type.MediaBrowserCompat$MediaItem;
            if (d13 != null) {
                d4 = d13.doubleValue();
            } else {
                d4 = 0.0d;
            }
            builder.MediaMetadataCompat = d4;
            Double d14 = type.MediaBrowserCompat$SearchResultReceiver;
            if (d14 == null) {
                d14 = Double.valueOf(0.0d);
            }
            builder.MediaSessionCompat$Token = IconCompatParcelizer(d14);
            Double d15 = type.MediaSessionCompat$ResultReceiverWrapper;
            if (d15 != null) {
                d5 = d15.doubleValue();
            } else {
                d5 = 0.0d;
            }
            builder.MediaSessionCompat$ResultReceiverWrapper = d5;
            Double d16 = type.MediaBrowserCompat$CustomActionResultReceiver;
            if (d16 != null) {
                d6 = d16.doubleValue();
            } else {
                d6 = 0.0d;
            }
            builder.MediaBrowserCompat$ItemReceiver = d6;
            Double d17 = type.MediaDescriptionCompat;
            if (d17 != null) {
                d7 = d17.doubleValue();
            } else {
                d7 = 0.0d;
            }
            builder.MediaDescriptionCompat = d7;
            Double d18 = type.MediaBrowserCompat$ItemReceiver;
            if (d18 != null) {
                d8 = d18.doubleValue();
            } else {
                d8 = 0.0d;
            }
            builder.MediaBrowserCompat$CustomActionResultReceiver = d8;
            Double d19 = type.write;
            if (d19 != null) {
                d10 = d19.doubleValue();
            }
            builder.write = d10;
            onGetStartedClick.IconCompatParcelizer((Object) builder, "FundDetailsLtf.create()\n…Percent ?: DEFAULT_VALUE)");
            arrayList.add(builder);
        }
        return (List) arrayList;
    }
}
