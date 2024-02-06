package p040o;

import p040o.CustomAdvertisingIdClient;
import p040o.ExtractionParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.sha256Hash */
public final class sha256Hash<T extends ExtractionParameters> extends setCurrentImageIndex<ProcessingParameters> {

    /* renamed from: o.sha256Hash$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters) obj).write();
        }
    }

    /* renamed from: o.sha256Hash$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.sha256Hash$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters> {
        public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public sha256Hash(RegularImmutableBiMap regularImmutableBiMap, getComponents getcomponents, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap, getcomponents, setitemicontintlist);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getcomponents, "checkPrerequisitesCase");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
    }

    public final boolean read() {
        return IconCompatParcelizer().IconCompatParcelizer;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        int i = CustomAdvertisingIdClient.C32821.MediaBrowserCompat$ItemReceiver[MediaBrowserCompat$ItemReceiver().ordinal()];
        boolean z = false;
        if (i == 1) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.read;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 2) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = sha256Hash$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 3) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 4) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = write.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer4.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}
