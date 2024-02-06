package p040o;

import java.util.List;
import p040o.OnDeviceIdExtractor;
import p040o.access$2300;
import p040o.checkPositionIndexes;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress6FieldName */
public final class getAddress6FieldName extends writeUInt64NoTag<OnDeviceIdExtractor.C6966a.C69693.write> {
    private final newArrayListWithExpectedSize IconCompatParcelizer;

    /* renamed from: o.getAddress6FieldName$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.C69693.write> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor.C6966a.C69693.write) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.getAddress6FieldName$MediaMetadataCompat */
    static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.C69693.write> {
        public static final MediaMetadataCompat MediaBrowserCompat$ItemReceiver = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            OnDeviceIdExtractor.C6966a.C69693.write write = (OnDeviceIdExtractor.C6966a.C69693.write) obj;
            write.write();
            write.IconCompatParcelizer(false);
        }
    }

    /* renamed from: o.getAddress6FieldName$RatingCompat */
    static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.C69693.write> {
        public static final RatingCompat read = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            OnDeviceIdExtractor.C6966a.C69693.write write = (OnDeviceIdExtractor.C6966a.C69693.write) obj;
            write.read();
            write.IconCompatParcelizer(false);
        }
    }

    /* renamed from: o.getAddress6FieldName$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getAddress6FieldName MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(getAddress6FieldName getaddress6fieldname) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = getaddress6fieldname;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getAddress6FieldName$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.C69693.write> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor.C6966a.C69693.write) obj).MediaMetadataCompat();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getAddress6FieldName(RegularImmutableBiMap regularImmutableBiMap, newArrayListWithExpectedSize newarraylistwithexpectedsize) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) newarraylistwithexpectedsize, "controller");
        this.IconCompatParcelizer = newarraylistwithexpectedsize;
    }

    public final void MediaBrowserCompat$ItemReceiver(List<String> list) {
        onGetStartedClick.write((Object) list, "allowTag");
        boolean z = false;
        if (!(list.contains("CARD_LOCK") || list.contains("CARD_UNLOCK"))) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (list.contains("CARD_LOCK")) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = RatingCompat.read;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = getAddress6FieldName$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                iconCompatParcelizer3.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void write(List<String> list) {
        onGetStartedClick.write((Object) list, "allowTag");
        boolean z = true;
        if (list.contains("RESET_PIN")) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4497xe2aeb31a.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void onDestroy() {
        this.IconCompatParcelizer.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getAddress6FieldName getaddress6fieldname) {
        if (getaddress6fieldname.RatingCompat != null) {
            getaddress6fieldname.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "cardRefNo");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        newArrayListWithExpectedSize newarraylistwithexpectedsize = this.IconCompatParcelizer;
        FundFactSheetActivity getaddress6fieldname_mediabrowsercompat_itemreceiver = new getAddress6FieldName$MediaBrowserCompat$ItemReceiver(this);
        FundFactSheetActivity read2 = new read(this);
        ImmutableEnumSet immutableEnumSet = new ImmutableEnumSet(str);
        onGetStartedClick.write((Object) getaddress6fieldname_mediabrowsercompat_itemreceiver, "onSuccess");
        onGetStartedClick.write((Object) read2, "onError");
        onGetStartedClick.write((Object) immutableEnumSet, "request");
        newarraylistwithexpectedsize.IconCompatParcelizer(newarraylistwithexpectedsize.MediaBrowserCompat$CustomActionResultReceiver, getaddress6fieldname_mediabrowsercompat_itemreceiver, read2, new checkPositionIndexes.IconCompatParcelizer(immutableEnumSet));
    }
}
