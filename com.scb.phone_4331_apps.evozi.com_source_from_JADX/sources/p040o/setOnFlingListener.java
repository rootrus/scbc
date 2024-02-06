package p040o;

import com.drew.imaging.png.PngProcessingException;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.setOnFlingListener */
public final class setOnFlingListener {
    private static final byte[] MediaBrowserCompat$CustomActionResultReceiver = {-119, 80, 78, 71, 13, 10, Ascii.SUB, 10};

    public static Iterable<getViewLifecycleOwnerLiveData> IconCompatParcelizer(copy1DRangeFromUnchecked copy1drangefromunchecked, Set<setOnScrollListener> set) throws PngProcessingException, IOException {
        copy1drangefromunchecked.IconCompatParcelizer = true;
        byte[] bArr = MediaBrowserCompat$CustomActionResultReceiver;
        if (Arrays.equals(bArr, copy1drangefromunchecked.IconCompatParcelizer(bArr.length))) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                int MediaBrowserCompat$CustomActionResultReceiver2 = copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver();
                setOnScrollListener setonscrolllistener = new setOnScrollListener(copy1drangefromunchecked.IconCompatParcelizer(4));
                boolean z3 = set == null || set.contains(setonscrolllistener);
                byte[] IconCompatParcelizer = copy1drangefromunchecked.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2);
                copy1drangefromunchecked.write(4);
                if (!z3 || !hashSet.contains(setonscrolllistener) || setonscrolllistener.PlaybackStateCompat) {
                    if (setonscrolllistener.equals(setOnScrollListener.MediaBrowserCompat$ItemReceiver)) {
                        z2 = true;
                    } else if (!z2) {
                        throw new PngProcessingException(String.format("First chunk should be '%s', but '%s' was observed", new Object[]{setOnScrollListener.MediaBrowserCompat$ItemReceiver, setonscrolllistener}));
                    }
                    if (setonscrolllistener.equals(setOnScrollListener.write)) {
                        z = true;
                    }
                    if (z3) {
                        arrayList.add(new getViewLifecycleOwnerLiveData(setonscrolllistener, IconCompatParcelizer));
                    }
                    hashSet.add(setonscrolllistener);
                } else {
                    throw new PngProcessingException(String.format("Observed multiple instances of PNG chunk '%s', for which multiples are not allowed", new Object[]{setonscrolllistener}));
                }
            }
            return arrayList;
        }
        throw new PngProcessingException("PNG signature mismatch");
    }
}
