package p040o;

import p040o.inject_extractorProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCountryFieldName */
public final class getCountryFieldName extends writeUInt64NoTag<inject_extractorProvider.IconCompatParcelizer> {

    /* renamed from: o.getCountryFieldName$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<inject_extractorProvider.IconCompatParcelizer> {
        private /* synthetic */ String write;

        public write(String str) {
            this.write = str;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((inject_extractorProvider.IconCompatParcelizer) obj).IconCompatParcelizer(this.write);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getCountryFieldName(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
