package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.shouldSendGlobalHeartBeat */
public final class shouldSendGlobalHeartBeat extends writeUInt64NoTag<CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver> {

    /* renamed from: o.shouldSendGlobalHeartBeat$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ int read;

        public IconCompatParcelizer(int i) {
            this.read = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
        }
    }

    /* renamed from: o.shouldSendGlobalHeartBeat$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.shouldSendGlobalHeartBeat$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((CardIoWrapperActivity$MediaBrowserCompat$ItemReceiver) obj).write();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public shouldSendGlobalHeartBeat(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
