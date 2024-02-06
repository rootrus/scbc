package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.makeAccessibleWithUnsafe */
public final class makeAccessibleWithUnsafe extends writeUInt64NoTag<C1221xe3d724bd> {

    /* renamed from: o.makeAccessibleWithUnsafe$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C1221xe3d724bd> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1221xe3d724bd) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.makeAccessibleWithUnsafe$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C1221xe3d724bd> {
        public static final read IconCompatParcelizer = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1221xe3d724bd) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    @HmlPinActivity
    public makeAccessibleWithUnsafe(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }
}
