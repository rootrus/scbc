package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.D */
public final /* synthetic */ class C3308D implements FundFactSheetActivity {
    private final /* synthetic */ setImageBitmapInternal read;

    public /* synthetic */ C3308D(setImageBitmapInternal setimagebitmapinternal) {
        this.read = setimagebitmapinternal;
    }

    public final Object invoke(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.read;
        endAdUnitExposure endadunitexposure = (endAdUnitExposure) obj;
        boolean z = true;
        if (setimagebitmapinternal.RatingCompat != null) {
            setimagebitmapinternal.RatingCompat.aj_();
        }
        setimagebitmapinternal.IconCompatParcelizer = endadunitexposure;
        nullsLast nullslast = setimagebitmapinternal.MediaDescriptionCompat;
        onGetStartedClick.write((Object) endadunitexposure, "mortgageLoan");
        Iterable<initForTests> iterable = endadunitexposure.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (initForTests MediaBrowserCompat$ItemReceiver : iterable) {
            arrayList.add(nullsLast.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
        }
        getResourcesIdentifier getresourcesidentifier = new getResourcesIdentifier((List) arrayList, nullslast.MediaBrowserCompat$CustomActionResultReceiver(endadunitexposure.MediaBrowserCompat$ItemReceiver));
        if (getresourcesidentifier.MediaBrowserCompat$CustomActionResultReceiver != null && !getresourcesidentifier.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            setimagebitmapinternal.read = getresourcesidentifier;
            getSharedPrefs getsharedprefs = getresourcesidentifier.MediaBrowserCompat$CustomActionResultReceiver.get(0);
            setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver = getsharedprefs.f2854x50fd9e4a;
            C3418G g = new C3418G(setimagebitmapinternal, getsharedprefs, getresourcesidentifier);
            if (setimagebitmapinternal.RatingCompat == null) {
                z = false;
            }
            if (z) {
                g.IconCompatParcelizer(setimagebitmapinternal.RatingCompat);
            }
            setimagebitmapinternal.MediaMetadataCompat = setimagebitmapinternal.write;
            setimagebitmapinternal.MediaBrowserCompat$MediaItem = Double.parseDouble(setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
