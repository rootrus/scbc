package p040o;

import com.google.android.gms.common.internal.ImagesContract;
import p040o.getBundleVersion;
import p040o.writeUInt64NoTag;

/* renamed from: o.dv */
public final class C4303dv extends writeUInt64NoTag<getBundleVersion.IconCompatParcelizer> {

    /* renamed from: o.dv$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getBundleVersion.IconCompatParcelizer> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getBundleVersion.IconCompatParcelizer) obj).mo15012n_(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* renamed from: o.dv$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getBundleVersion.IconCompatParcelizer> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        read(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getBundleVersion.IconCompatParcelizer) obj).MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4303dv(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, boolean z) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        boolean z2 = true;
        if (z) {
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(str);
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                read2.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(str);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static boolean read(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        return GoodToKnowActivity.read(str, "scbeasy://", false);
    }
}
