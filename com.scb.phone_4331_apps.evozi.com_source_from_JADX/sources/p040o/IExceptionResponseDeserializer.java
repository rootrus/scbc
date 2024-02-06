package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.IExceptionResponseDeserializer */
public final class IExceptionResponseDeserializer extends writeUInt64NoTag<tZ$MediaBrowserCompat$ItemReceiver> {

    /* renamed from: o.IExceptionResponseDeserializer$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<tZ$MediaBrowserCompat$ItemReceiver> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((tZ$MediaBrowserCompat$ItemReceiver) obj).write();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IExceptionResponseDeserializer(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
