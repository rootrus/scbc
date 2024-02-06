package p040o;

import p040o.CheckCaptureModule;
import p040o.writeUInt64NoTag;

/* renamed from: o.writeUInt64 */
public final class writeUInt64 extends writeUInt64NoTag<CheckCaptureModule.C1151b> {

    /* renamed from: o.writeUInt64$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule.C1151b> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule.C1151b) obj).mo13731v_();
        }
    }

    /* renamed from: o.writeUInt64$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule.C1151b> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CheckCaptureModule.C1151b) obj).mo13721L_();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public writeUInt64(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
