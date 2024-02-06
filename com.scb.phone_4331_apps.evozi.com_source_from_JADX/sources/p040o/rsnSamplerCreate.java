package p040o;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p040o.C10822Sampler;
import p040o.RttiJsonBill_MembersInjector;

/* renamed from: o.rsnSamplerCreate */
public final class rsnSamplerCreate implements getIIdDeserializerKta {
    public getIIdDeserializerKta[] read;
    private Map<rsnIncContextCreate, ?> write;

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException {
        MediaBrowserCompat$ItemReceiver((Map<rsnIncContextCreate, ?>) null);
        return MediaBrowserCompat$ItemReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver);
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, Map<rsnIncContextCreate, ?> map) throws NotFoundException {
        MediaBrowserCompat$ItemReceiver(map);
        return MediaBrowserCompat$ItemReceiver(setfontassetdelegate_mediabrowsercompat_itemreceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(Map<rsnIncContextCreate, ?> map) {
        Collection collection;
        this.write = map;
        boolean z = false;
        boolean z2 = map != null && map.containsKey(rsnIncContextCreate.TRY_HARDER);
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(rsnIncContextCreate.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(rsnIncAllocationCreateTyped.UPC_A) || collection.contains(rsnIncAllocationCreateTyped.UPC_E) || collection.contains(rsnIncAllocationCreateTyped.EAN_13) || collection.contains(rsnIncAllocationCreateTyped.EAN_8) || collection.contains(rsnIncAllocationCreateTyped.CODABAR) || collection.contains(rsnIncAllocationCreateTyped.CODE_39) || collection.contains(rsnIncAllocationCreateTyped.CODE_93) || collection.contains(rsnIncAllocationCreateTyped.CODE_128) || collection.contains(rsnIncAllocationCreateTyped.ITF) || collection.contains(rsnIncAllocationCreateTyped.RSS_14) || collection.contains(rsnIncAllocationCreateTyped.RSS_EXPANDED)) {
                z = true;
            }
            if (z && !z2) {
                arrayList.add(new C10822Sampler.Builder(map));
            }
            if (collection.contains(rsnIncAllocationCreateTyped.QR_CODE)) {
                arrayList.add(new setY());
            }
            if (collection.contains(rsnIncAllocationCreateTyped.DATA_MATRIX)) {
                arrayList.add(new rsnTypeCreate());
            }
            if (collection.contains(rsnIncAllocationCreateTyped.AZTEC)) {
                arrayList.add(new RttiJsonBill_MembersInjector.write());
            }
            if (collection.contains(rsnIncAllocationCreateTyped.PDF_417)) {
                arrayList.add(new C7383x8a61e826());
            }
            if (collection.contains(rsnIncAllocationCreateTyped.MAXICODE)) {
                arrayList.add(new setPriority());
            }
            if (z && z2) {
                arrayList.add(new C10822Sampler.Builder(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z2) {
                arrayList.add(new C10822Sampler.Builder(map));
            }
            arrayList.add(new setY());
            arrayList.add(new rsnTypeCreate());
            arrayList.add(new RttiJsonBill_MembersInjector.write());
            arrayList.add(new C7383x8a61e826());
            arrayList.add(new setPriority());
            if (z2) {
                arrayList.add(new C10822Sampler.Builder(map));
            }
        }
        this.read = (getIIdDeserializerKta[]) arrayList.toArray(new getIIdDeserializerKta[arrayList.size()]);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        getIIdDeserializerKta[] getiiddeserializerktaArr = this.read;
        if (getiiddeserializerktaArr != null) {
            for (getIIdDeserializerKta MediaBrowserCompat$CustomActionResultReceiver : getiiddeserializerktaArr) {
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException {
        getIIdDeserializerKta[] getiiddeserializerktaArr = this.read;
        if (getiiddeserializerktaArr != null) {
            int length = getiiddeserializerktaArr.length;
            int i = 0;
            while (i < length) {
                try {
                    return getiiddeserializerktaArr[i].IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, this.write);
                } catch (ReaderException unused) {
                    i++;
                }
            }
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
