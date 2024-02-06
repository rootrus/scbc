package p040o;

import android.graphics.Bitmap;
import p040o.setAutoFocusEnabled;
import p040o.writeUInt64NoTag;

/* renamed from: o.buildFromJson */
public final class buildFromJson extends writeUInt64NoTag<getUndersizeImage> {
    public boolean IconCompatParcelizer = true;
    public String MediaBrowserCompat$ItemReceiver;
    public long MediaBrowserCompat$MediaItem;
    public String MediaDescriptionCompat;
    public String read;
    public String write;

    /* renamed from: o.buildFromJson$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getUndersizeImage) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.buildFromJson$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
        private /* synthetic */ buildFromJson MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ Bitmap read;

        public MediaDescriptionCompat(buildFromJson buildfromjson, Bitmap bitmap) {
            this.MediaBrowserCompat$CustomActionResultReceiver = buildfromjson;
            this.read = bitmap;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getUndersizeImage) obj).MediaBrowserCompat$ItemReceiver(this.read, buildFromJson.write(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* renamed from: o.buildFromJson$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ buildFromJson read;

        public MediaMetadataCompat(buildFromJson buildfromjson, String str) {
            this.read = buildfromjson;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getUndersizeImage) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, buildFromJson.MediaBrowserCompat$ItemReceiver(this.read), buildFromJson.write(this.read), buildFromJson.IconCompatParcelizer(this.read));
        }
    }

    /* renamed from: o.buildFromJson$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
        public static final ParcelableVolumeInfo write = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getUndersizeImage getundersizeimage = (getUndersizeImage) obj;
            getundersizeimage.write(true);
            getundersizeimage.MediaBrowserCompat$MediaItem();
        }
    }

    /* renamed from: o.buildFromJson$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
        public static final RatingCompat MediaBrowserCompat$CustomActionResultReceiver = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getUndersizeImage) obj).write(false);
        }
    }

    /* renamed from: o.buildFromJson$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
        private /* synthetic */ buildFromJson read;

        public read(buildFromJson buildfromjson) {
            this.read = buildfromjson;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            getUndersizeImage getundersizeimage = (getUndersizeImage) obj;
            if (this.read.MediaBrowserCompat$MediaItem > 0) {
                long unused = this.read.MediaBrowserCompat$MediaItem;
                getundersizeimage.RatingCompat();
            } else if (this.read.MediaBrowserCompat$MediaItem == 0) {
                getundersizeimage.write();
            }
        }
    }

    /* renamed from: o.buildFromJson$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getUndersizeImage> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getUndersizeImage) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    public static final /* synthetic */ String IconCompatParcelizer(buildFromJson buildfromjson) {
        String str = buildfromjson.MediaDescriptionCompat;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("productType");
        }
        return str;
    }

    public static final /* synthetic */ String MediaBrowserCompat$ItemReceiver(buildFromJson buildfromjson) {
        String str = buildfromjson.read;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("applicationId");
        }
        return str;
    }

    public static final /* synthetic */ String write(buildFromJson buildfromjson) {
        String str = buildfromjson.write;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
        }
        return str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public buildFromJson(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    public final void read() {
        String name = setAutoFocusEnabled.IconCompatParcelizer.HML.name();
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("flow");
        }
        boolean z = true;
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(name, str, true)) {
            String str2 = this.write;
            if (str2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("documentType");
            }
            if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver("SALARY", str2, true)) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = buildFromJson$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                if (this.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
