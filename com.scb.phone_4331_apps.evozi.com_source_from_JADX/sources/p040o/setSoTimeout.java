package p040o;

import java.util.List;
import p040o.StreetViewPanorama;

/* renamed from: o.setSoTimeout */
public final /* synthetic */ class setSoTimeout implements ChequeManagementDeepLinkActivity {
    private final /* synthetic */ Configuration read;

    public /* synthetic */ setSoTimeout(Configuration configuration) {
        this.read = configuration;
    }

    public final Object read(Object obj, Object obj2) {
        isSupportFragmentClass issupportfragmentclass;
        isSupportFragmentClass issupportfragmentclass2;
        String str = (String) obj;
        List list = (List) obj2;
        show show = new show(this.read.IconCompatParcelizer.RatingCompat().MediaBrowserCompat$ItemReceiver);
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new setSendBufferSize(str)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        T t = issupportfragmentclass.MediaBrowserCompat$ItemReceiver(setSoLinger.IconCompatParcelizer).IconCompatParcelizer;
        T t2 = null;
        if (t == null) {
            t = null;
        }
        String str2 = (String) t;
        show show3 = new show(list);
        show show4 = new show(show3.write, new getNextTransition(show3.IconCompatParcelizer, new setTrafficClass(str)));
        if (show4.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass2 = isSupportFragmentClass.read(show4.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass2 = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        T t3 = issupportfragmentclass2.IconCompatParcelizer;
        if (t3 != null) {
            t2 = t3;
        }
        zzvo zzvo = (zzvo) t2;
        StreetViewPanorama.OnStreetViewPanoramaLongClickListener write = StreetViewPanorama.OnStreetViewPanoramaLongClickListener.write();
        write.MediaDescriptionCompat = str2;
        write.f2789x50fd9e4a = zzvo.f3002x50fd9e4a;
        write.ParcelableVolumeInfo = zzvo.PlaybackStateCompat;
        write.write = zzvo.write;
        write.MediaBrowserCompat$ItemReceiver = zzvo.RatingCompat;
        write.MediaSessionCompat$ResultReceiverWrapper = zzvo.setHasDecor;
        write.MediaBrowserCompat$MediaItem = zzvo.read;
        return write;
    }
}
