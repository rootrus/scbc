package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.logSettings */
public final class logSettings extends writeUInt64NoTag<getTopLeftCornerHeight> {
    public zzwd read = zzwd.CAMERA;

    /* renamed from: o.logSettings$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerHeight> {
        private /* synthetic */ logSettings read;

        public write(logSettings logsettings) {
            this.read = logsettings;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerHeight) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public logSettings(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
