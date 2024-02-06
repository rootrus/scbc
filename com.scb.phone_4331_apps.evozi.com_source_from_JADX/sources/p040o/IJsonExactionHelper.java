package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.IJsonExactionHelper */
public final class IJsonExactionHelper extends writeUInt64NoTag<inject_cacheProvider$MediaBrowserCompat$ItemReceiver> {

    /* renamed from: o.IJsonExactionHelper$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<inject_cacheProvider$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ List IconCompatParcelizer;
        private /* synthetic */ getCustomAttributes read;

        public IconCompatParcelizer(getCustomAttributes getcustomattributes, List list) {
            this.read = getcustomattributes;
            this.IconCompatParcelizer = list;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((inject_cacheProvider$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer(this.read, this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.IJsonExactionHelper$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<inject_cacheProvider$MediaBrowserCompat$ItemReceiver> {
        private /* synthetic */ IJsonExactionHelper MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ List read;

        public read(IJsonExactionHelper iJsonExactionHelper, List list) {
            this.MediaBrowserCompat$ItemReceiver = iJsonExactionHelper;
            this.read = list;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((inject_cacheProvider$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read.contains("TOP_UP_TARGET"));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IJsonExactionHelper(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }
}
