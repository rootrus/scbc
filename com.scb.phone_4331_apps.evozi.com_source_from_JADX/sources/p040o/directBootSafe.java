package p040o;

import java.util.List;

/* renamed from: o.directBootSafe */
public final /* synthetic */ class directBootSafe implements FundFactSheetActivity {
    private final /* synthetic */ normalize MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FirebaseVisionImageMetadata MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ directBootSafe(FirebaseVisionImageMetadata firebaseVisionImageMetadata, normalize normalize) {
        this.MediaBrowserCompat$ItemReceiver = firebaseVisionImageMetadata;
        this.MediaBrowserCompat$CustomActionResultReceiver = normalize;
    }

    public final Object invoke(Object obj) {
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.MediaBrowserCompat$ItemReceiver;
        readAutoDataCollectionEnabled readautodatacollectionenabled = new readAutoDataCollectionEnabled(this.MediaBrowserCompat$CustomActionResultReceiver, (List) obj);
        if (firebaseVisionImageMetadata.RatingCompat != null) {
            readautodatacollectionenabled.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
