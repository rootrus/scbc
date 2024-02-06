package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hf */
public final class C4749hf extends writeUInt64NoTag<LocalProjectProvider.C69386.write> {

    /* renamed from: o.hf$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C69386.write> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.C69386.write) obj).write();
        }
    }

    /* renamed from: o.hf$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.C69386.write> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.C69386.write) obj).read();
        }
    }

    @HmlPinActivity
    public C4749hf(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }
}
