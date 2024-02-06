package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.StreetViewPanorama;

/* renamed from: o.flushQuietly */
public final class flushQuietly extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public flushQuietly(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final List<setRam> read(List<? extends StreetViewPanorama.OnStreetViewPanoramaLongClickListener> list, boolean z, boolean z2, boolean z3) {
        String str;
        onGetStartedClick.write((Object) list, "accountSourceList");
        Iterable<StreetViewPanorama.OnStreetViewPanoramaLongClickListener> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener : iterable) {
            if (onStreetViewPanoramaLongClickListener.MediaDescriptionCompat != null) {
                String str2 = onStreetViewPanoramaLongClickListener.MediaDescriptionCompat;
                onGetStartedClick.IconCompatParcelizer((Object) str2, "accountSource.nickname");
                if (!(str2.length() == 0)) {
                    str = onStreetViewPanoramaLongClickListener.MediaDescriptionCompat;
                    onGetStartedClick.IconCompatParcelizer((Object) str, "accountName");
                    String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(onStreetViewPanoramaLongClickListener.write, z);
                    onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "transformDepositAccountN….accountNumber, isMasked)");
                    arrayList.add(new setRam(z2, z3, MediaBrowserCompat$CustomActionResultReceiver, str));
                }
            }
            str = onStreetViewPanoramaLongClickListener.ParcelableVolumeInfo;
            onGetStartedClick.IconCompatParcelizer((Object) str, "accountName");
            String MediaBrowserCompat$CustomActionResultReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(onStreetViewPanoramaLongClickListener.write, z);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "transformDepositAccountN….accountNumber, isMasked)");
            arrayList.add(new setRam(z2, z3, MediaBrowserCompat$CustomActionResultReceiver2, str));
        }
        return (List) arrayList;
    }
}
