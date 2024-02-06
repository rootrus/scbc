package p040o;

import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.OptionalPendingResultImpl */
public final class OptionalPendingResultImpl extends FragmentBuilder_BindSummaryFragment {
    public static getStreetViewPanoramaAsync MediaBrowserCompat$ItemReceiver(zzvo zzvo, zzvf zzvf) {
        isSupportFragmentClass issupportfragmentclass;
        zzup zzup;
        String str;
        List<zzup> list = zzvf.MediaBrowserCompat$ItemReceiver;
        String str2 = zzvo.write;
        show show = new show(list);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new C3391xf56ec9cc(str2)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (issupportfragmentclass.IconCompatParcelizer != null) {
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                zzup = (zzup) t;
            } else {
                throw new NoSuchElementException("No value present");
            }
        } else {
            zzup = null;
        }
        if (zzup != null) {
            str = zzup.MediaBrowserCompat$ItemReceiver;
        } else {
            str = "";
        }
        getStreetViewPanoramaAsync getstreetviewpanoramaasync = new getStreetViewPanoramaAsync();
        getstreetviewpanoramaasync.MediaBrowserCompat$ItemReceiver = zzvo.f3002x50fd9e4a;
        getstreetviewpanoramaasync.MediaBrowserCompat$SearchResultReceiver = zzvo.PlaybackStateCompat;
        getstreetviewpanoramaasync.read = zzvo.MediaSessionCompat$QueueItem;
        getstreetviewpanoramaasync.write = zzvo.write;
        getstreetviewpanoramaasync.MediaBrowserCompat$CustomActionResultReceiver = str;
        return getstreetviewpanoramaasync;
    }
}
