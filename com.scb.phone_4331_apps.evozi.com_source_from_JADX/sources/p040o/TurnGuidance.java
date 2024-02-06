package p040o;

import p040o.getUsable;

/* renamed from: o.TurnGuidance */
public class TurnGuidance extends writeUInt64NoTag<getUsable.read> {
    public final getTileProvider write;

    @HmlPinActivity
    public TurnGuidance(RegularImmutableBiMap regularImmutableBiMap, getTileProvider gettileprovider) {
        super(regularImmutableBiMap);
        this.write = gettileprovider;
    }
}
