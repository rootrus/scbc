package p040o;

import p040o.proxyGetOnDevicePassportDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.setFormTypeId */
public final class setFormTypeId extends writeUInt64NoTag<proxyGetOnDevicePassportDeserializer.write> {
    final union read;

    /* renamed from: o.setFormTypeId$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetOnDevicePassportDeserializer.write> {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((proxyGetOnDevicePassportDeserializer.write) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setFormTypeId(RegularImmutableBiMap regularImmutableBiMap, union union) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) union, "displayMapper");
        this.read = union;
    }
}
