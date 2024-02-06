package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ocrSucceeded */
public final class ocrSucceeded extends writeUInt64NoTag<Passport> {

    /* renamed from: o.ocrSucceeded$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<Passport> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((Passport) obj).write();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public ocrSucceeded(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
