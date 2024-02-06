package p040o;

import p040o.ExtractionParameters;
import p040o.writeUInt64NoTag;

/* renamed from: o.setProfileShortCuts */
public final class setProfileShortCuts<T extends ExtractionParameters> extends setCurrentImageIndex<getIPassportDeserializerKta> {

    /* renamed from: o.setProfileShortCuts$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getIPassportDeserializerKta> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIPassportDeserializerKta) obj).write();
        }
    }

    /* renamed from: o.setProfileShortCuts$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getIPassportDeserializerKta> {
        public static final read write = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIPassportDeserializerKta) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.setProfileShortCuts$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getIPassportDeserializerKta> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getIPassportDeserializerKta) obj).MediaDescriptionCompat();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setProfileShortCuts(RegularImmutableBiMap regularImmutableBiMap, getComponents getcomponents, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap, getcomponents, setitemicontintlist);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getcomponents, "checkPrerequisitesCase");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
    }

    public final boolean read() {
        return IconCompatParcelizer().IconCompatParcelizer && IconCompatParcelizer().write;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        int i = GetIndexFieldsResponse.MediaBrowserCompat$CustomActionResultReceiver[MediaBrowserCompat$ItemReceiver().ordinal()];
        boolean z = false;
        if (i == 1) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setProfileShortCuts$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 2) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i != 3) {
            if (i == 4) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = C10150x39bdcff3.read;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer3.IconCompatParcelizer(this.RatingCompat);
                }
            }
        } else if (IconCompatParcelizer().write) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer4 = read.write;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer4.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer5 = write.read;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer5.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}
