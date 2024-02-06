package p040o;

import java.util.List;
import p040o.ByteStreams;

/* renamed from: o.SendImage */
public class SendImage extends writeUInt64NoTag<getDocumentSkewAngle> {
    public final ByteStreams.C31375 IconCompatParcelizer;
    public List<CrashlyticsReportDataCapture> MediaBrowserCompat$ItemReceiver;
    private final StreetViewPanoramaLink MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;
    public SendImage$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = SendImage$MediaBrowserCompat$ItemReceiver.RISK_SELECTION;
    public String MediaMetadataCompat;
    public populateExecutionData read;
    public populateEventDeviceData write;

    @HmlPinActivity
    public SendImage(StreetViewPanoramaLink streetViewPanoramaLink, ByteStreams.C31375 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$MediaItem = streetViewPanoramaLink;
        this.IconCompatParcelizer = r2;
    }

    /* renamed from: o.SendImage$2 */
    public static /* synthetic */ class C37642 {
        public static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.SendImage$MediaBrowserCompat$ItemReceiver[] r0 = p040o.SendImage$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.SendImage$MediaBrowserCompat$ItemReceiver r1 = p040o.SendImage$MediaBrowserCompat$ItemReceiver.RISK_SELECTION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.SendImage$MediaBrowserCompat$ItemReceiver r1 = p040o.SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_QUESTIONNAIRE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.SendImage$MediaBrowserCompat$ItemReceiver r1 = p040o.SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_SUMMARY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.SendImage$MediaBrowserCompat$ItemReceiver r1 = p040o.SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_REVIEW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.SendImage$MediaBrowserCompat$ItemReceiver r1 = p040o.SendImage$MediaBrowserCompat$ItemReceiver.RESULT_SUCCESS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.SendImage.C37642.<clinit>():void");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver sendImage$MediaBrowserCompat$ItemReceiver) {
        this.MediaDescriptionCompat = sendImage$MediaBrowserCompat$ItemReceiver;
        int i = C37642.MediaBrowserCompat$CustomActionResultReceiver[this.MediaDescriptionCompat.ordinal()];
        boolean z = false;
        if (i == 1) {
            getProfileRequest getprofilerequest = getProfileRequest.write;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getprofilerequest.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 2) {
            setFieldRequest setfieldrequest = new setFieldRequest(this);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setfieldrequest.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 3) {
            getParamNames getparamnames = new getParamNames(this);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getparamnames.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 4) {
            getFieldRequest getfieldrequest = new getFieldRequest(this);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getfieldrequest.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (i == 5) {
            initHosts inithosts = new initHosts(this);
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                inithosts.IconCompatParcelizer(this.RatingCompat);
            }
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        int i = C37642.MediaBrowserCompat$CustomActionResultReceiver[this.MediaDescriptionCompat.ordinal()];
        if (i == 1) {
            MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_QUESTIONNAIRE);
        } else if (i == 2) {
            MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_SUMMARY);
        } else if (i == 3) {
            MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.ASSESSMENT_REVIEW);
        } else if (i == 4) {
            MediaBrowserCompat$CustomActionResultReceiver(SendImage$MediaBrowserCompat$ItemReceiver.RESULT_SUCCESS);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
