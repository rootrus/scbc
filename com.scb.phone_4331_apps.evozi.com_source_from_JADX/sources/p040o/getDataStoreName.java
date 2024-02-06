package p040o;

import java.io.File;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.Barcode;
import p040o.ByteStreams;
import p040o.KtaJsonCheck;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDataStoreName */
public final class getDataStoreName extends getFrameSize {
    private final setSelectedTabIndicator MediaBrowserCompat$MediaItem;
    private final setInlineLabelResource MediaDescriptionCompat;
    private final addOnTabSelectedListener read;

    /* renamed from: o.getDataStoreName$IconCompatParcelizer */
    static final class IconCompatParcelizer<T1, T2, R> implements ChequeManagementDeepLinkActivity<String, String, AutoValue_CrashlyticsReport_FilesPayload.Builder> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Object read(Object obj, Object obj2) {
            String str = (String) obj;
            String str2 = (String) obj2;
            onGetStartedClick.write((Object) str, "date");
            onGetStartedClick.write((Object) str2, "laserId");
            return new AutoValue_CrashlyticsReport_FilesPayload.Builder(str2, str);
        }
    }

    /* renamed from: o.getDataStoreName$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonCheck.C6928a> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((KtaJsonCheck.C6928a) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.getDataStoreName$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaJsonCheck.C6928a> {
        private /* synthetic */ int MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ getDataStoreName write;

        write(getDataStoreName getdatastorename, int i) {
            this.write = getdatastorename;
            this.MediaBrowserCompat$ItemReceiver = i;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            AutoValue_CrashlyticsReport_FilesPayload.Builder IconCompatParcelizer = this.write.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "nationalIdDisplay");
            ((KtaJsonCheck.C6928a) obj).MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper, this.MediaBrowserCompat$ItemReceiver);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getDataStoreName(loadFinalizer loadfinalizer, setInlineLabelResource setinlinelabelresource, addOnTabSelectedListener addontabselectedlistener, setSelectedTabIndicator setselectedtabindicator, Barcode.UrlBookmark urlBookmark, ByteStreams.C31342 r7, RegularImmutableBiMap regularImmutableBiMap) {
        super(urlBookmark, r7, regularImmutableBiMap);
        onGetStartedClick.write((Object) loadfinalizer, "ndidRpUploadPhotoCase");
        onGetStartedClick.write((Object) setinlinelabelresource, "hmlGetLaserIdCase");
        onGetStartedClick.write((Object) addontabselectedlistener, "hmlGetIssueDateCase");
        onGetStartedClick.write((Object) setselectedtabindicator, "hmlUploadCidPhotoCase");
        onGetStartedClick.write((Object) urlBookmark, "uploadNationalIdCase");
        onGetStartedClick.write((Object) r7, "nationalIdRequestMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaDescriptionCompat = setinlinelabelresource;
        this.read = addontabselectedlistener;
        this.MediaBrowserCompat$MediaItem = setselectedtabindicator;
    }

    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.read.write(DebitCardResetOtpActivity.zip(this.read.read(), this.MediaDescriptionCompat.IconCompatParcelizer(), IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver), new getDataStoreName$MediaBrowserCompat$CustomActionResultReceiver(this));
    }

    public final void MediaMetadataCompat(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }

    public static final /* synthetic */ void write(getDataStoreName getdatastorename) {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.MediaBrowserCompat$ItemReceiver;
        if (getdatastorename.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getdatastorename.RatingCompat);
        }
    }

    public static final /* synthetic */ void read(getDataStoreName getdatastorename) {
        if (getdatastorename.RatingCompat != null) {
            getdatastorename.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(File file) {
        onGetStartedClick.write((Object) file, "file");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        AutoValue_CrashlyticsReport_FilesPayload.Builder builder = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) builder, "nationalIdDisplay");
        builder.MediaSessionCompat$ResultReceiverWrapper = file.toURI().toString();
        setSelectedTabIndicator setselectedtabindicator = this.MediaBrowserCompat$MediaItem;
        String absolutePath = file.getAbsolutePath();
        onGetStartedClick.IconCompatParcelizer((Object) absolutePath, "file.absolutePath");
        this.MediaBrowserCompat$MediaItem.write(setselectedtabindicator.write(absolutePath), new getDataStoreName$MediaBrowserCompat$ItemReceiver(this));
    }

    public final void read(int i) {
        boolean z = true;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(this, i);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write2.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
