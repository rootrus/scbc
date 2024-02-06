package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.zzcb;

/* renamed from: o.zzfj */
public final /* synthetic */ class zzfj implements DirectDebitDeepLinkActivity {
    public static final /* synthetic */ zzfj read = new zzfj();

    private /* synthetic */ zzfj() {
    }

    public final Object write(Object obj) {
        getIntrinsicWidth getintrinsicwidth = (getIntrinsicWidth) obj;
        String str = getintrinsicwidth.write;
        String str2 = getintrinsicwidth.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = getintrinsicwidth.MediaMetadataCompat;
        String str4 = getintrinsicwidth.MediaBrowserCompat$MediaItem;
        String str5 = getintrinsicwidth.read;
        String str6 = getintrinsicwidth.MediaBrowserCompat$ItemReceiver;
        Iterable<getMaxScale> iterable = getintrinsicwidth.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getMaxScale IconCompatParcelizer : iterable) {
            arrayList.add(IconCompatParcelizer.IconCompatParcelizer());
        }
        return new zzcb.zze(str, str2, str3, str4, str5, str6, (List) arrayList);
    }
}
