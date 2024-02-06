package p040o;

import p040o.FirebaseVisionBarcodeDetectorOptions;

/* renamed from: o.FirebaseVisionBarcodeDetectorOptions$Builder$MediaBrowserCompat$ItemReceiver */
public class C3380xf378811a extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setTransactionSuccessful> {
    final /* synthetic */ FirebaseVisionBarcodeDetectorOptions.Builder read;

    private C3380xf378811a(FirebaseVisionBarcodeDetectorOptions.Builder builder) {
        this.read = builder;
    }

    public /* synthetic */ C3380xf378811a(FirebaseVisionBarcodeDetectorOptions.Builder builder, byte b) {
        this(builder);
    }

    public final /* synthetic */ void onNext(Object obj) {
        String str;
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) obj;
        FirebaseVisionBarcodeDetectorOptions.Builder builder = this.read;
        safeContainsKey MediaDescriptionCompat = builder.MediaMetadataCompat;
        boolean z = false;
        if (settransactionsuccessful.read == null || settransactionsuccessful.read.isEmpty()) {
            str = null;
        } else {
            str = MediaDescriptionCompat.mo26549c_(settransactionsuccessful.read.get(0).IconCompatParcelizer);
        }
        String unused = builder.MediaBrowserCompat$SearchResultReceiver = str;
        FirebaseVisionBarcodeDetectorOptions.Builder builder2 = this.read;
        createFirebaseInstallation createfirebaseinstallation = new createFirebaseInstallation(this);
        if (builder2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            createfirebaseinstallation.IconCompatParcelizer(builder2.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        if (!this.read.MediaBrowserCompat$SearchResultReceiver(th)) {
            FirebaseVisionBarcodeDetectorOptions.Builder.read(this.read);
        }
    }

    public final void onComplete() {
        FirebaseVisionBarcodeDetectorOptions.Builder.IconCompatParcelizer(this.read);
    }
}
