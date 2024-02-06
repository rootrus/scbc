package p040o;

import android.content.Intent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: o.rsnScriptIntrinsicBLAS_BNNM */
public final class rsnScriptIntrinsicBLAS_BNNM {
    private static final Map<String, Set<rsnIncAllocationCreateTyped>> IconCompatParcelizer;
    private static Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$CustomActionResultReceiver = EnumSet.of(rsnIncAllocationCreateTyped.DATA_MATRIX);
    private static final Pattern MediaBrowserCompat$ItemReceiver = Pattern.compile(",");
    private static Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$MediaItem = EnumSet.of(rsnIncAllocationCreateTyped.UPC_A, new rsnIncAllocationCreateTyped[]{rsnIncAllocationCreateTyped.UPC_E, rsnIncAllocationCreateTyped.EAN_13, rsnIncAllocationCreateTyped.EAN_8, rsnIncAllocationCreateTyped.RSS_14, rsnIncAllocationCreateTyped.RSS_EXPANDED});
    private static final Set<rsnIncAllocationCreateTyped> MediaBrowserCompat$SearchResultReceiver;
    private static Set<rsnIncAllocationCreateTyped> MediaDescriptionCompat = EnumSet.of(rsnIncAllocationCreateTyped.PDF_417);
    private static Set<rsnIncAllocationCreateTyped> MediaMetadataCompat = EnumSet.of(rsnIncAllocationCreateTyped.QR_CODE);
    private static Set<rsnIncAllocationCreateTyped> read = EnumSet.of(rsnIncAllocationCreateTyped.CODE_39, rsnIncAllocationCreateTyped.CODE_93, rsnIncAllocationCreateTyped.CODE_128, rsnIncAllocationCreateTyped.ITF, rsnIncAllocationCreateTyped.CODABAR);
    private static Set<rsnIncAllocationCreateTyped> write = EnumSet.of(rsnIncAllocationCreateTyped.AZTEC);

    static {
        EnumSet<rsnIncAllocationCreateTyped> copyOf = EnumSet.copyOf(MediaBrowserCompat$MediaItem);
        MediaBrowserCompat$SearchResultReceiver = copyOf;
        copyOf.addAll(read);
        HashMap hashMap = new HashMap();
        IconCompatParcelizer = hashMap;
        hashMap.put("ONE_D_MODE", MediaBrowserCompat$SearchResultReceiver);
        IconCompatParcelizer.put("PRODUCT_MODE", MediaBrowserCompat$MediaItem);
        IconCompatParcelizer.put("QR_CODE_MODE", MediaMetadataCompat);
        IconCompatParcelizer.put("DATA_MATRIX_MODE", MediaBrowserCompat$CustomActionResultReceiver);
        IconCompatParcelizer.put("AZTEC_MODE", write);
        IconCompatParcelizer.put("PDF417_MODE", MediaDescriptionCompat);
    }

    public static Set<rsnIncAllocationCreateTyped> IconCompatParcelizer(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return write(stringExtra != null ? Arrays.asList(MediaBrowserCompat$ItemReceiver.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    private static Set<rsnIncAllocationCreateTyped> write(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet<E> noneOf = EnumSet.noneOf(rsnIncAllocationCreateTyped.class);
            try {
                for (String valueOf : iterable) {
                    noneOf.add(rsnIncAllocationCreateTyped.valueOf(valueOf));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return IconCompatParcelizer.get(str);
        }
        return null;
    }
}
