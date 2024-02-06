package p040o;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: o.validateTRMV */
public final class validateTRMV implements validateTRSM {
    private Map<rsnIncContextCreate, ?> MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private int read;
    private Collection<rsnIncAllocationCreateTyped> write;

    public validateTRMV() {
    }

    public validateTRMV(Collection<rsnIncAllocationCreateTyped> collection, Map<rsnIncContextCreate, ?> map, String str, int i) {
        this.write = collection;
        this.MediaBrowserCompat$CustomActionResultReceiver = map;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.read = i;
    }

    public final zzma MediaBrowserCompat$CustomActionResultReceiver(Map<rsnIncContextCreate, ?> map) {
        EnumMap enumMap = new EnumMap(rsnIncContextCreate.class);
        enumMap.putAll(map);
        Map<rsnIncContextCreate, ?> map2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (map2 != null) {
            enumMap.putAll(map2);
        }
        if (this.write != null) {
            enumMap.put(rsnIncContextCreate.POSSIBLE_FORMATS, this.write);
        }
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            enumMap.put(rsnIncContextCreate.CHARACTER_SET, this.MediaBrowserCompat$ItemReceiver);
        }
        rsnSamplerCreate rsnsamplercreate = new rsnSamplerCreate();
        rsnsamplercreate.MediaBrowserCompat$ItemReceiver((Map<rsnIncContextCreate, ?>) enumMap);
        int i = this.read;
        if (i == 0) {
            return new zzma(rsnsamplercreate);
        }
        if (i == 1) {
            return new CGEMM(rsnsamplercreate);
        }
        if (i != 2) {
            return new zzma(rsnsamplercreate);
        }
        return new CGERC(rsnsamplercreate);
    }
}
