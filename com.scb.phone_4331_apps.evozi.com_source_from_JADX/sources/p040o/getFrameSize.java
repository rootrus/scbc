package p040o;

import java.io.File;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.Barcode;
import p040o.ByteStreams;
import p040o.KtaJsonCheck;
import p040o.access$2300;

/* renamed from: o.getFrameSize */
public class getFrameSize extends writeUInt64NoTag<KtaJsonCheck.C6928a> {
    public Boolean IconCompatParcelizer;
    public AutoValue_CrashlyticsReport_FilesPayload.Builder MediaBrowserCompat$ItemReceiver;
    private String MediaDescriptionCompat = "";
    private Boolean read;
    public final Barcode.UrlBookmark write;

    public void MediaBrowserCompat$ItemReceiver(File file) {
    }

    @HmlPinActivity
    public getFrameSize(Barcode.UrlBookmark urlBookmark, ByteStreams.C31342 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        Boolean bool = Boolean.FALSE;
        this.IconCompatParcelizer = bool;
        this.read = bool;
        this.write = urlBookmark;
        this.MediaBrowserCompat$ItemReceiver = new AutoValue_CrashlyticsReport_FilesPayload.Builder();
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        if (!this.MediaDescriptionCompat.equals(str)) {
            this.MediaDescriptionCompat = str != null ? str : "";
            this.read = Boolean.valueOf((str == null || str.length() != 10 || CheckCaptureActivity.IconCompatParcelizer(str, "dd/MM/yyyy") == null) ? false : true);
        }
        return this.read.booleanValue();
    }

    public void read(int i) {
        if (this.IconCompatParcelizer.booleanValue()) {
            this.IconCompatParcelizer = Boolean.FALSE;
            boolean z = true;
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            getSessionDirectoryById getsessiondirectorybyid = new getSessionDirectoryById(this, i);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getsessiondirectorybyid.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    /* renamed from: o.getFrameSize$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzuk> {
        private read() {
        }

        public /* synthetic */ read(getFrameSize getframesize, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            getFrameSize getframesize = getFrameSize.this;
            getframesize.MediaBrowserCompat$ItemReceiver(getframesize.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            getFrameSize getframesize2 = getFrameSize.this;
            if (getframesize2.RatingCompat != null) {
                getframesize2.RatingCompat.aj_();
            }
            Boolean unused = getFrameSize.this.IconCompatParcelizer = Boolean.TRUE;
        }

        public final /* synthetic */ void onNext(Object obj) {
            getFrameSize getframesize = getFrameSize.this;
            isNormalPriorityEventFile isnormalpriorityeventfile = new isNormalPriorityEventFile(this);
            boolean z = true;
            if (getframesize.RatingCompat != null) {
                isnormalpriorityeventfile.IconCompatParcelizer(getframesize.RatingCompat);
            }
            getFrameSize getframesize2 = getFrameSize.this;
            if (getframesize2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getframesize2.RatingCompat.aj_();
            }
        }
    }

    public void MediaMetadataCompat(Throwable th) {
        if (this.RatingCompat != null) {
            this.RatingCompat.aj_();
        }
        MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        this.IconCompatParcelizer = Boolean.TRUE;
    }

    public void IconCompatParcelizer() {
        lambda$static$0 lambda_static_0 = new lambda$static$0(this);
        boolean z = true;
        if (this.RatingCompat != null) {
            lambda_static_0.IconCompatParcelizer(this.RatingCompat);
        }
        writeEnum writeenum = writeEnum.write;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            writeenum.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
