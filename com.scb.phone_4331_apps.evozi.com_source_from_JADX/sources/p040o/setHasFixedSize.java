package p040o;

import com.drew.imaging.jpeg.JpegProcessingException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import p040o.nAllocationSetSurface;
import p040o.nClosureCreate;

/* renamed from: o.setHasFixedSize */
public final class setHasFixedSize {
    private static Iterable<getCarbonStrip> MediaBrowserCompat$ItemReceiver = Arrays.asList(new getCarbonStrip[]{new nAllocationSetSurface$MediaBrowserCompat$MediaItem(), new nAllocationSetSurface$MediaBrowserCompat$ItemReceiver(), new nAllocationSetSurface.write(), new nAllocationSetSurface.IconCompatParcelizer(), new nClosureCreate.IconCompatParcelizer(), new nScriptIntrinsicCreate(), new nAllocationSetSurface(), new nAllocationSetSurface$MediaSessionCompat$Token(), new nAllocationSetSurface$MediaBrowserCompat$SearchResultReceiver(), new nAllocationSetSurface.read(), new nClosureCreate(), new nAllocationSetSurface.MediaDescriptionCompat(), new nAllocationSetSurface.MediaMetadataCompat()});

    private static void MediaBrowserCompat$CustomActionResultReceiver(getSubElementOffsetBytes getsubelementoffsetbytes, Iterable<getCarbonStrip> iterable, getHost gethost) {
        for (getCarbonStrip next : iterable) {
            for (setItemAnimator next2 : next.MediaBrowserCompat$ItemReceiver()) {
                Iterable iterable2 = gethost.MediaBrowserCompat$CustomActionResultReceiver.get(Byte.valueOf(next2.byteValue));
                if (iterable2 == null) {
                    iterable2 = new ArrayList();
                }
                next.IconCompatParcelizer(iterable2, getsubelementoffsetbytes, next2);
            }
        }
    }

    public static getSubElementOffsetBytes MediaBrowserCompat$ItemReceiver(InputStream inputStream) throws JpegProcessingException, IOException {
        getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
        Iterable<getCarbonStrip> iterable = MediaBrowserCompat$ItemReceiver;
        HashSet hashSet = new HashSet();
        for (getCarbonStrip MediaBrowserCompat$ItemReceiver2 : iterable) {
            for (setItemAnimator add : MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver()) {
                hashSet.add(add);
            }
        }
        MediaBrowserCompat$CustomActionResultReceiver(getsubelementoffsetbytes, iterable, AlertController$RecycleListView.write((copy1DRangeFromUnchecked) new copyFromUnchecked(inputStream), (Iterable<setItemAnimator>) hashSet));
        return getsubelementoffsetbytes;
    }
}
