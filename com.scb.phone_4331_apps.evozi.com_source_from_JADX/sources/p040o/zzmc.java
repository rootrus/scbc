package p040o;

import java.util.EnumSet;
import java.util.Set;

/* renamed from: o.zzmc */
public final class zzmc {
    private static final Set<rsnIncAllocationCreateTyped> IconCompatParcelizer = EnumSet.of(rsnIncAllocationCreateTyped.PDF_417);
    private static final Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$CustomActionResultReceiver = EnumSet.of(rsnIncAllocationCreateTyped.CODE_39, rsnIncAllocationCreateTyped.CODE_93, rsnIncAllocationCreateTyped.CODE_128, rsnIncAllocationCreateTyped.ITF, rsnIncAllocationCreateTyped.CODABAR);
    private static final Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$ItemReceiver = EnumSet.of(rsnIncAllocationCreateTyped.MAXICODE);
    private static final Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$MediaItem = EnumSet.of(rsnIncAllocationCreateTyped.UPC_A, new rsnIncAllocationCreateTyped[]{rsnIncAllocationCreateTyped.UPC_E, rsnIncAllocationCreateTyped.EAN_13, rsnIncAllocationCreateTyped.EAN_8, rsnIncAllocationCreateTyped.RSS_14, rsnIncAllocationCreateTyped.RSS_EXPANDED});
    private static final Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$SearchResultReceiver = EnumSet.of(rsnIncAllocationCreateTyped.QR_CODE);
    private static final Set<rsnIncAllocationCreateTyped> read = EnumSet.of(rsnIncAllocationCreateTyped.DATA_MATRIX);
    private static final Set<rsnIncAllocationCreateTyped> write = EnumSet.of(rsnIncAllocationCreateTyped.AZTEC);

    static {
        EnumSet.copyOf(MediaBrowserCompat$MediaItem).addAll(MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static Set<rsnIncAllocationCreateTyped> write() {
        return write;
    }

    public static Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$ItemReceiver() {
        return read;
    }

    public static Set<rsnIncAllocationCreateTyped> IconCompatParcelizer() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public static Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$MediaItem() {
        return MediaBrowserCompat$MediaItem;
    }

    public static Set<rsnIncAllocationCreateTyped> read() {
        return IconCompatParcelizer;
    }

    public static Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$SearchResultReceiver() {
        return MediaBrowserCompat$SearchResultReceiver;
    }
}
