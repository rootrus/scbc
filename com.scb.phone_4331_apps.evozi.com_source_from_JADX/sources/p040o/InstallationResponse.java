package p040o;

import p040o.FirebaseVisionCloudDetectorOptions;
import p040o.writeUInt64NoTag;

/* renamed from: o.InstallationResponse */
public final /* synthetic */ class InstallationResponse implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ FirebaseVisionCloudDetectorOptions.Builder.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C5449version write;

    public /* synthetic */ InstallationResponse(FirebaseVisionCloudDetectorOptions.Builder.IconCompatParcelizer iconCompatParcelizer, C5449version version) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.write = version;
    }

    public final void IconCompatParcelizer(Object obj) {
        FirebaseVisionCloudDetectorOptions.Builder.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        C5449version version = this.write;
        C7509tS tSVar = (C7509tS) obj;
        tSVar.aj_();
        tSVar.write(FirebaseVisionCloudDetectorOptions.Builder.this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(version, tSVar.MediaBrowserCompat$CustomActionResultReceiver()));
    }

    /* renamed from: o.InstallationResponse$Builder */
    public final /* synthetic */ class Builder implements Runnable {
        private final /* synthetic */ C9736x97ce62ae write;

        public /* synthetic */ Builder(C9736x97ce62ae firebaseVisionCloudDetectorOptions$MediaBrowserCompat$ItemReceiver) {
            this.write = firebaseVisionCloudDetectorOptions$MediaBrowserCompat$ItemReceiver;
        }

        public final void run() {
            FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = this.write.MediaBrowserCompat$ItemReceiver;
            FirebaseModelInputOutputOptions firebaseModelInputOutputOptions = FirebaseModelInputOutputOptions.MediaBrowserCompat$ItemReceiver;
            if (firebaseVisionCloudDetectorOptions.RatingCompat != null) {
                firebaseModelInputOutputOptions.IconCompatParcelizer(firebaseVisionCloudDetectorOptions.RatingCompat);
            }
        }
    }

    /* renamed from: o.InstallationResponse$ResponseCode */
    public final /* synthetic */ class ResponseCode implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ FirebaseVisionCloudDetectorOptions MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ ResponseCode(FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
            this.MediaBrowserCompat$ItemReceiver = firebaseVisionCloudDetectorOptions;
        }

        public final void IconCompatParcelizer(Object obj) {
            FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = this.MediaBrowserCompat$ItemReceiver;
            if (firebaseVisionCloudDetectorOptions.RatingCompat != null) {
                firebaseVisionCloudDetectorOptions.RatingCompat.AlertController$RecycleListView();
            }
        }
    }
}
