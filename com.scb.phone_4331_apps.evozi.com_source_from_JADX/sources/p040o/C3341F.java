package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzin;

/* renamed from: o.F */
public final /* synthetic */ class C3341F implements FundFactSheetActivity {
    private final /* synthetic */ setImageBitmapInternal MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C3341F(setImageBitmapInternal setimagebitmapinternal) {
        this.MediaBrowserCompat$ItemReceiver = setimagebitmapinternal;
    }

    public final Object invoke(Object obj) {
        setImageBitmapInternal setimagebitmapinternal = this.MediaBrowserCompat$ItemReceiver;
        zzin.zzc zzc = (zzin.zzc) obj;
        boolean z = true;
        if (setimagebitmapinternal.RatingCompat != null) {
            setimagebitmapinternal.RatingCompat.aj_();
        }
        nullsLast nullslast = setimagebitmapinternal.MediaDescriptionCompat;
        endAdUnitExposure endadunitexposure = setimagebitmapinternal.IconCompatParcelizer;
        onGetStartedClick.write((Object) endadunitexposure, "mortgageLoan");
        onGetStartedClick.write((Object) zzc, "mhmcCalculation");
        Iterable<initForTests> iterable = endadunitexposure.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (initForTests read : iterable) {
            arrayList.add(nullsLast.read(read, zzc));
        }
        setimagebitmapinternal.read = new getResourcesIdentifier((List) arrayList, nullslast.MediaBrowserCompat$CustomActionResultReceiver(zzc.MediaBrowserCompat$CustomActionResultReceiver));
        setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver = zzc.MediaBrowserCompat$ItemReceiver;
        setimagebitmapinternal.write = zzc.IconCompatParcelizer;
        setimagebitmapinternal.MediaBrowserCompat$MediaItem = Double.parseDouble(setimagebitmapinternal.MediaBrowserCompat$SearchResultReceiver);
        setimagebitmapinternal.MediaMetadataCompat = setimagebitmapinternal.write;
        C3138C c = new C3138C(setimagebitmapinternal, setimagebitmapinternal.read.MediaBrowserCompat$ItemReceiver);
        if (setimagebitmapinternal.RatingCompat == null) {
            z = false;
        }
        if (z) {
            c.IconCompatParcelizer(setimagebitmapinternal.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
