package p040o;

import java.util.HashMap;
import p040o.IdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getEventAppExecutionSize */
public final class getEventAppExecutionSize extends writeUInt64NoTag<IdExtractor.C69123> {

    /* renamed from: o.getEventAppExecutionSize$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdExtractor.C69123> {
        private /* synthetic */ HashMap read;

        public read(HashMap hashMap) {
            this.read = hashMap;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdExtractor.C69123) obj).IconCompatParcelizer(this.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getEventAppExecutionSize(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
