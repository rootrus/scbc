package p040o;

import p040o.CrashlyticsController;
import p040o.writeUInt64NoTag;

/* renamed from: o.setIconType */
public final class setIconType extends writeUInt64NoTag<C7384x357a71ef> {
    public CrashlyticsController.CodedOutputStreamWriteAction IconCompatParcelizer;
    public final union MediaBrowserCompat$ItemReceiver;
    public boolean read = true;
    public boolean write;

    /* renamed from: o.setIconType$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7384x357a71ef> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7384x357a71ef) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.setIconType$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7384x357a71ef> {
        private /* synthetic */ setIconType MediaBrowserCompat$CustomActionResultReceiver;

        public write(setIconType seticontype) {
            this.MediaBrowserCompat$CustomActionResultReceiver = seticontype;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C7384x357a71ef proxygetondevicepassportdeserializer_mediabrowsercompat_customactionresultreceiver = (C7384x357a71ef) obj;
            proxygetondevicepassportdeserializer_mediabrowsercompat_customactionresultreceiver.RatingCompat();
            proxygetondevicepassportdeserializer_mediabrowsercompat_customactionresultreceiver.read(setIconType.read(this.MediaBrowserCompat$CustomActionResultReceiver));
            proxygetondevicepassportdeserializer_mediabrowsercompat_customactionresultreceiver.read();
        }
    }

    /* renamed from: o.setIconType$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C7384x357a71ef> {
        private /* synthetic */ setIconType IconCompatParcelizer;

        IconCompatParcelizer(setIconType seticontype) {
            this.IconCompatParcelizer = seticontype;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7384x357a71ef) obj).IconCompatParcelizer(setIconType.read(this.IconCompatParcelizer).MediaBrowserCompat$ItemReceiver);
        }
    }

    public static final /* synthetic */ CrashlyticsController.CodedOutputStreamWriteAction read(setIconType seticontype) {
        CrashlyticsController.CodedOutputStreamWriteAction codedOutputStreamWriteAction = seticontype.IconCompatParcelizer;
        if (codedOutputStreamWriteAction == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("display");
        }
        return codedOutputStreamWriteAction;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setIconType(RegularImmutableBiMap regularImmutableBiMap, union union) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) union, "displayMapper");
        this.MediaBrowserCompat$ItemReceiver = union;
    }

    public final void write() {
        boolean z = true;
        if (!this.write) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
            if (this.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
            this.write = true;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = setIconType$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
        }
        this.read = false;
    }
}
