package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.zzge$zzd$zza$MediaBrowserCompat$ItemReceiver */
final class zzge$zzd$zza$MediaBrowserCompat$ItemReceiver<T, R> implements DirectDebitDeepLinkActivity<T, R> {
    public static final zzge$zzd$zza$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new zzge$zzd$zza$MediaBrowserCompat$ItemReceiver();

    zzge$zzd$zza$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ Object write(Object obj) {
        boolean z;
        int i;
        List<setExpirationTime> list;
        SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
        onGetStartedClick.write((Object) singleDataEntity, "it");
        getCurves getcurves = (getCurves) singleDataEntity.getData();
        isFastestIntervalExplicitlySet isfastestintervalexplicitlyset = new isFastestIntervalExplicitlySet();
        if (getcurves != null) {
            isfastestintervalexplicitlyset.MediaMetadataCompat = getcurves.RatingCompat;
            Boolean bool = getcurves.write;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = true;
            }
            isfastestintervalexplicitlyset.read = z;
            Integer num = getcurves.MediaBrowserCompat$CustomActionResultReceiver;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            isfastestintervalexplicitlyset.MediaBrowserCompat$CustomActionResultReceiver = i;
            isfastestintervalexplicitlyset.RatingCompat = getcurves.MediaBrowserCompat$SearchResultReceiver;
            String str = getcurves.MediaMetadataCompat;
            if (str != null) {
                isfastestintervalexplicitlyset.MediaBrowserCompat$MediaItem = new HmlVerifyEmailSuccessfulActivity<>(str, getcurves.MediaBrowserCompat$MediaItem);
            }
            String str2 = getcurves.MediaDescriptionCompat;
            if (str2 != null) {
                isfastestintervalexplicitlyset.write = new HmlVerifyEmailSuccessfulActivity<>(str2, getcurves.read);
            }
            isfastestintervalexplicitlyset.IconCompatParcelizer = getcurves.MediaBrowserCompat$ItemReceiver;
            List<setInitialPoint> list2 = getcurves.IconCompatParcelizer;
            if (list2 != null) {
                Iterable<setInitialPoint> iterable = list2;
                int i2 = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i2 = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i2);
                for (setInitialPoint write : iterable) {
                    arrayList.add(AlertController$RecycleListView.write(write));
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            isfastestintervalexplicitlyset.MediaBrowserCompat$ItemReceiver = list;
        }
        return isfastestintervalexplicitlyset;
    }
}
