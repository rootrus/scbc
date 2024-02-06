package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.DeviceServiceResponse */
public final class DeviceServiceResponse extends writeUInt64NoTag<PassportCaptureActivity> {

    /* renamed from: o.DeviceServiceResponse$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureActivity> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportCaptureActivity) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public DeviceServiceResponse(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
