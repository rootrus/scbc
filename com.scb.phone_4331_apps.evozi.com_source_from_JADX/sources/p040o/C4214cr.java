package p040o;

import android.content.res.Resources;
import p040o.IdType;
import p040o.setFilename;
import p040o.writeUInt64NoTag;

/* renamed from: o.cr */
public final class C4214cr extends writeUInt64NoTag<IdType.IconCompatParcelizer> {
    final Resources MediaBrowserCompat$ItemReceiver;
    public setFilename read;
    public String write;

    /* renamed from: o.cr$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<IdType.IconCompatParcelizer> {
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ C4214cr MediaDescriptionCompat;
        private /* synthetic */ boolean read;
        private /* synthetic */ String write;

        public read(C4214cr crVar, String str, String str2, int i, boolean z, boolean z2) {
            this.MediaDescriptionCompat = crVar;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.IconCompatParcelizer = z;
            this.read = z2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            IdType.IconCompatParcelizer iconCompatParcelizer = (IdType.IconCompatParcelizer) obj;
            iconCompatParcelizer.write(this.MediaDescriptionCompat.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.find_us));
            iconCompatParcelizer.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, -1);
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
            iconCompatParcelizer.read(!this.read);
        }
    }

    /* renamed from: o.cr$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<IdType.IconCompatParcelizer> {
        private /* synthetic */ setFilename.IconCompatParcelizer write;

        public write(setFilename.IconCompatParcelizer iconCompatParcelizer) {
            this.write = iconCompatParcelizer;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((IdType.IconCompatParcelizer) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4214cr(RegularImmutableBiMap regularImmutableBiMap, Resources resources) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) resources, "resources");
        this.MediaBrowserCompat$ItemReceiver = resources;
    }
}
