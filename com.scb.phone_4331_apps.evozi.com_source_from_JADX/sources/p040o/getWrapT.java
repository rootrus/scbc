package p040o;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: o.getWrapT */
public final class getWrapT extends getMinification {
    private final setMinification[] read;

    public getWrapT(Map<rsnIncContextCreate, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(rsnIncContextCreate.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(rsnIncAllocationCreateTyped.EAN_13)) {
                arrayList.add(new C10822Sampler());
            } else if (collection.contains(rsnIncAllocationCreateTyped.UPC_A)) {
                arrayList.add(new getMagnification());
            }
            if (collection.contains(rsnIncAllocationCreateTyped.EAN_8)) {
                arrayList.add(new WRAP_LINEAR_MIP_LINEAR());
            }
            if (collection.contains(rsnIncAllocationCreateTyped.UPC_E)) {
                arrayList.add(new setWrapS());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C10822Sampler());
            arrayList.add(new WRAP_LINEAR_MIP_LINEAR());
            arrayList.add(new setWrapS());
        }
        this.read = (setMinification[]) arrayList.toArray(new setMinification[arrayList.size()]);
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException {
        Collection collection;
        boolean z;
        int[] MediaBrowserCompat$ItemReceiver = setMinification.MediaBrowserCompat$ItemReceiver(rsnscriptintrinsiccreate);
        setMinification[] setminificationArr = this.read;
        int i2 = 0;
        while (i2 < setminificationArr.length) {
            try {
                getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver = setminificationArr[i2].MediaBrowserCompat$CustomActionResultReceiver(i, rsnscriptintrinsiccreate, MediaBrowserCompat$ItemReceiver, map);
                boolean z2 = MediaBrowserCompat$CustomActionResultReceiver.write == rsnIncAllocationCreateTyped.EAN_13 && MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.charAt(0) == '0';
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(rsnIncContextCreate.POSSIBLE_FORMATS);
                }
                if (collection != null) {
                    if (!collection.contains(rsnIncAllocationCreateTyped.UPC_A)) {
                        z = false;
                        if (z2 || !z) {
                            return MediaBrowserCompat$CustomActionResultReceiver;
                        }
                        getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver = new getLayers$MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.substring(1), MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, rsnIncAllocationCreateTyped.UPC_A);
                        Map<rsnInvokeClosureCreate, Object> map2 = MediaBrowserCompat$CustomActionResultReceiver.read;
                        if (map2 != null) {
                            Map<rsnInvokeClosureCreate, Object> map3 = getlayers_mediabrowsercompat_customactionresultreceiver.read;
                            if (map3 == null) {
                                getlayers_mediabrowsercompat_customactionresultreceiver.read = map2;
                            } else {
                                map3.putAll(map2);
                            }
                        }
                        return getlayers_mediabrowsercompat_customactionresultreceiver;
                    }
                }
                z = true;
                if (z2) {
                }
                return MediaBrowserCompat$CustomActionResultReceiver;
            } catch (ReaderException unused) {
                i2++;
            }
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        for (setMinification MediaBrowserCompat$CustomActionResultReceiver : this.read) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
