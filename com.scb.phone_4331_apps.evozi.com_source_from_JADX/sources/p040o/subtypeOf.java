package p040o;

import p040o.C3080xc2f5febc;
import p040o.writeUInt64NoTag;

/* renamed from: o.subtypeOf */
public final class subtypeOf extends writeUInt64NoTag<C1337x357be685> {

    /* renamed from: o.subtypeOf$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C1337x357be685> {
        private /* synthetic */ C3080xc2f5febc.C30811 read;

        public read(C3080xc2f5febc.C30811 r1) {
            this.read = r1;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1337x357be685) obj).write(this.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public subtypeOf(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
