package p040o;

import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* renamed from: o.getMagnification */
public final class getMagnification extends setMinification {
    private final setMinification MediaBrowserCompat$ItemReceiver = new C10822Sampler();

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, Map<rsnIncContextCreate, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(i, rsnscriptintrinsiccreate, iArr, map));
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(int i, rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, Map<rsnIncContextCreate, ?> map) throws NotFoundException, FormatException, ChecksumException {
        return MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(i, rsnscriptintrinsiccreate, map));
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver read(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver) throws NotFoundException, FormatException {
        return MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.read(setfontassetdelegate_mediabrowsercompat_itemreceiver));
    }

    public final getLayers$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(setFontAssetDelegate$MediaBrowserCompat$ItemReceiver setfontassetdelegate_mediabrowsercompat_itemreceiver, Map<rsnIncContextCreate, ?> map) throws NotFoundException, FormatException {
        return MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(setfontassetdelegate_mediabrowsercompat_itemreceiver, map));
    }

    /* access modifiers changed from: package-private */
    public final rsnIncAllocationCreateTyped IconCompatParcelizer() {
        return rsnIncAllocationCreateTyped.UPC_A;
    }

    /* access modifiers changed from: protected */
    public final int read(rsnScriptIntrinsicCreate rsnscriptintrinsiccreate, int[] iArr, StringBuilder sb) throws NotFoundException {
        return this.MediaBrowserCompat$ItemReceiver.read(rsnscriptintrinsiccreate, iArr, sb);
    }

    private static getLayers$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver(getLayers$MediaBrowserCompat$CustomActionResultReceiver getlayers_mediabrowsercompat_customactionresultreceiver) throws FormatException {
        String str = getlayers_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
        if (str.charAt(0) == '0') {
            return new getLayers$MediaBrowserCompat$CustomActionResultReceiver(str.substring(1), (byte[]) null, getlayers_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver, rsnIncAllocationCreateTyped.UPC_A);
        }
        throw FormatException.read();
    }
}
