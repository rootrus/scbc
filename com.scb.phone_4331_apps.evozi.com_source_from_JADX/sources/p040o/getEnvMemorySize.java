package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvMemorySize */
public final class getEnvMemorySize extends writeUInt64NoTag<DataField> {

    /* renamed from: o.getEnvMemorySize$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<DataField> {
        private /* synthetic */ readElement IconCompatParcelizer;

        public write(readElement readelement) {
            this.IconCompatParcelizer = readelement;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((DataField) obj).write(this.IconCompatParcelizer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getEnvMemorySize(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
