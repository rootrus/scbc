package p040o;

import p040o.Analytics;

/* renamed from: o.writeField */
public class writeField extends writeUInt64NoTag<getIIdExtractionServerOnDevice> {
    public final Analytics.Param read;

    @HmlPinActivity
    public writeField(RegularImmutableBiMap regularImmutableBiMap, Analytics.Param param) {
        super(regularImmutableBiMap);
        this.read = param;
    }
}
