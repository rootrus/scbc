package p040o;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p040o.RenderScript;

/* renamed from: o.Sampler  reason: case insensitive filesystem */
public final class C10822Sampler extends setMinification {
    static final int[] MediaBrowserCompat$ItemReceiver = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] MediaBrowserCompat$SearchResultReceiver = new int[4];

    /* renamed from: o.Sampler$Value */
    final class Value extends C10823Script {
        final createInvokeID IconCompatParcelizer;
        int MediaBrowserCompat$ItemReceiver;

        Value(int i, int i2, createInvokeID createinvokeid) {
            super(i, i2);
            this.IconCompatParcelizer = createinvokeid;
        }
    }

    /* renamed from: o.Sampler$Builder */
    public final class Builder extends getMinification {
        private final getMinification[] write;

        public Builder(Map<rsnIncContextCreate, ?> map) {
            Collection collection;
            if (map == null) {
                collection = null;
            } else {
                collection = (Collection) map.get(rsnIncContextCreate.POSSIBLE_FORMATS);
            }
            boolean z = (map == null || map.get(rsnIncContextCreate.ASSUME_CODE_39_CHECK_DIGIT) == null) ? false : true;
            ArrayList arrayList = new ArrayList();
            if (collection != null) {
                if (collection.contains(rsnIncAllocationCreateTyped.EAN_13) || collection.contains(rsnIncAllocationCreateTyped.UPC_A) || collection.contains(rsnIncAllocationCreateTyped.EAN_8) || collection.contains(rsnIncAllocationCreateTyped.UPC_E)) {
                    arrayList.add(new getWrapT(map));
                }
                if (collection.contains(rsnIncAllocationCreateTyped.CODE_39)) {
                    arrayList.add(new CLAMP_LINEAR_MIP_LINEAR(z));
                }
                if (collection.contains(rsnIncAllocationCreateTyped.CODE_93)) {
                    arrayList.add(new MIRRORED_REPEAT_LINEAR());
                }
                if (collection.contains(rsnIncAllocationCreateTyped.CODE_128)) {
                    arrayList.add(new RenderScript.RSErrorHandler());
                }
                if (collection.contains(rsnIncAllocationCreateTyped.ITF)) {
                    arrayList.add(new WRAP_LINEAR());
                }
                if (collection.contains(rsnIncAllocationCreateTyped.CODABAR)) {
                    arrayList.add(new run());
                }
                if (collection.contains(rsnIncAllocationCreateTyped.RSS_14)) {
                    arrayList.add(new invoke());
                }
                if (collection.contains(rsnIncAllocationCreateTyped.RSS_EXPANDED)) {
                    arrayList.add(new isIncSupp());
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.add(new getWrapT(map));
                arrayList.add(new CLAMP_LINEAR_MIP_LINEAR());
                arrayList.add(new run());
                arrayList.add(new MIRRORED_REPEAT_LINEAR());
                arrayList.add(new RenderScript.RSErrorHandler());
                arrayList.add(new WRAP_LINEAR());
                arrayList.add(new invoke());
                arrayList.add(new isIncSupp());
            }
            this.write = (getMinification[]) arrayList.toArray(new getMinification[arrayList.size()]);
        }

        public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException {
            getMinification[] getminificationArr = this.write;
            int i2 = 0;
            while (i2 < getminificationArr.length) {
                try {
                    return getminificationArr[i2].IconCompatParcelizer(i, rsnscriptintrinsiccreate, map);
                } catch (ReaderException unused) {
                    i2++;
                }
            }
            throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            for (getMinification MediaBrowserCompat$CustomActionResultReceiver : this.write) {
                MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int read(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, StringBuilder sb) throws NotFoundException {
        int[] iArr2 = this.MediaBrowserCompat$SearchResultReceiver;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int i = rsnscriptintrinsiccreate.read;
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < i; i4++) {
            int IconCompatParcelizer = IconCompatParcelizer(rsnscriptintrinsiccreate, iArr2, i2, read);
            sb.append((char) ((IconCompatParcelizer % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (IconCompatParcelizer >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        for (int i6 = 0; i6 < 10; i6++) {
            if (i3 == MediaBrowserCompat$ItemReceiver[i6]) {
                sb.insert(0, (char) (i6 + 48));
                int i7 = write(rsnscriptintrinsiccreate, i2, true, MediaBrowserCompat$CustomActionResultReceiver)[1];
                for (int i8 = 0; i8 < 6 && i7 < i; i8++) {
                    sb.append((char) (IconCompatParcelizer(rsnscriptintrinsiccreate, iArr2, i7, IconCompatParcelizer) + 48));
                    for (int i9 : iArr2) {
                        i7 += i9;
                    }
                }
                return i7;
            }
        }
        throw NotFoundException.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    public final rsnIncAllocationCreateTyped IconCompatParcelizer() {
        return rsnIncAllocationCreateTyped.EAN_13;
    }
}
