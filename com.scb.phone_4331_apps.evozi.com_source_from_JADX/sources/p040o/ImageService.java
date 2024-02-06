package p040o;

import p040o.CrashlyticsController;
import p040o.PassportCaptureModule;
import p040o.writeUInt64NoTag;
import p040o.zzct;

/* renamed from: o.ImageService */
public final /* synthetic */ class ImageService implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;
    private final /* synthetic */ int write;

    /* renamed from: o.ImageService$InterimImageFileFormat */
    public final /* synthetic */ class InterimImageFileFormat implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ CrashlyticsController.C322720 IconCompatParcelizer;

        public /* synthetic */ InterimImageFileFormat(CrashlyticsController.C322720 r1) {
            this.IconCompatParcelizer = r1;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule.C6976c) obj).MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.ImageService$a */
    public final /* synthetic */ class C3494a implements FundFactSheetActivity {
        public static final /* synthetic */ C3494a write = new C3494a();

        private /* synthetic */ C3494a() {
        }

        public final Object invoke(Object obj) {
            return createPropertyInfo.IconCompatParcelizer((getIdentifierUtf8Bytes) obj);
        }
    }

    /* renamed from: o.ImageService$EnhancementResults */
    public final /* synthetic */ class EnhancementResults implements FundFactSheetActivity {
        public static final /* synthetic */ EnhancementResults IconCompatParcelizer = new EnhancementResults();

        private /* synthetic */ EnhancementResults() {
        }

        public final Object invoke(Object obj) {
            return KofaxWebServiceObjectBase.MediaBrowserCompat$CustomActionResultReceiver((getIdentifierUtf8Bytes) obj);
        }
    }

    public /* synthetic */ ImageService(int i, int i2, int i3) {
        this.write = i;
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
        this.read = i3;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((ExtractionParameters_Factory) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }

    /* renamed from: o.ImageService$UseableImageMemoryLimit */
    public final /* synthetic */ class UseableImageMemoryLimit implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ SendImageResponse read;

        public /* synthetic */ UseableImageMemoryLimit(SendImageResponse sendImageResponse, String str) {
            this.read = sendImageResponse;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final void IconCompatParcelizer(Object obj) {
            SendImageResponse sendImageResponse = this.read;
            PassportCaptureModule_GetIPassportDeserializerRttiFactory passportCaptureModule_GetIPassportDeserializerRttiFactory = (PassportCaptureModule_GetIPassportDeserializerRttiFactory) obj;
            passportCaptureModule_GetIPassportDeserializerRttiFactory.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            passportCaptureModule_GetIPassportDeserializerRttiFactory.write(zzct.zza.BUSINESS_OWNER == sendImageResponse.write.read.MediaBrowserCompat$SearchResultReceiver());
        }
    }

    /* renamed from: o.ImageService$ImageDimension */
    public final /* synthetic */ class ImageDimension implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ createPropertyInfo read;

        public /* synthetic */ ImageDimension(createPropertyInfo createpropertyinfo) {
            this.read = createpropertyinfo;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((PassportCaptureModule.C6976c) obj).MediaBrowserCompat$ItemReceiver(Boolean.valueOf(zzct.zza.BUSINESS_OWNER == this.read.read.read.MediaBrowserCompat$SearchResultReceiver()));
        }
    }
}
