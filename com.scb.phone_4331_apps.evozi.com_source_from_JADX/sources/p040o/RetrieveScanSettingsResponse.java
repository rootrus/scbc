package p040o;

import p040o.access$2300;
import p040o.writeUInt32;
import p040o.writeUInt64NoTag;

/* renamed from: o.RetrieveScanSettingsResponse */
public final class RetrieveScanSettingsResponse extends writeUInt32<PassportCaptureModule_GetIPassportDeserializerKtaFactory> {
    private final setCustomSize write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public RetrieveScanSettingsResponse(performActionWithResponse performactionwithresponse, RegularImmutableBiMap regularImmutableBiMap, FileBackedOutputStream fileBackedOutputStream, setCustomSize setcustomsize) {
        super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
        onGetStartedClick.write((Object) performactionwithresponse, "validatePinCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) fileBackedOutputStream, "pinStrengthMapper");
        onGetStartedClick.write((Object) setcustomsize, "setNTBPinCase");
        this.write = setcustomsize;
    }

    /* renamed from: o.RetrieveScanSettingsResponse$read */
    public static final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Void> {
        private /* synthetic */ RetrieveScanSettingsResponse read;

        /* renamed from: o.RetrieveScanSettingsResponse$read$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule_GetIPassportDeserializerKtaFactory> {
            public static final write MediaBrowserCompat$ItemReceiver = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((PassportCaptureModule_GetIPassportDeserializerKtaFactory) obj).MediaBrowserCompat$MediaItem();
            }
        }

        read(RetrieveScanSettingsResponse retrieveScanSettingsResponse) {
            this.read = retrieveScanSettingsResponse;
        }

        public final void onComplete() {
            RetrieveScanSettingsResponse.write(this.read);
            RetrieveScanSettingsResponse retrieveScanSettingsResponse = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.MediaBrowserCompat$ItemReceiver;
            if (retrieveScanSettingsResponse.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(retrieveScanSettingsResponse.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            RetrieveScanSettingsResponse.write(this.read);
            this.read.write();
            RetrieveScanSettingsResponse retrieveScanSettingsResponse = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C9811x36d6a359.write;
            if (retrieveScanSettingsResponse.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(retrieveScanSettingsResponse.RatingCompat);
            }
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public static final /* synthetic */ void write(RetrieveScanSettingsResponse retrieveScanSettingsResponse) {
        if (retrieveScanSettingsResponse.RatingCompat != null) {
            retrieveScanSettingsResponse.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        setCustomSize setcustomsize = this.write;
        if (str == null) {
            str = "";
        }
        this.write.write(setcustomsize.IconCompatParcelizer(str), new read(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = true;
        if (this.read == writeUInt32.read.CONFIRM) {
            writeUInt64NoTag.IconCompatParcelizer retrieveScanSettingsResponse$MediaBrowserCompat$CustomActionResultReceiver = new C3760xae940a6a(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                retrieveScanSettingsResponse$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = RetrieveScanSettingsResponse$MediaBrowserCompat$ItemReceiver.write;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
