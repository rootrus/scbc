package p040o;

/* renamed from: o.getDeclaredClass */
public class getDeclaredClass extends writeUInt64NoTag<getDocumentVerificationConfidenceRating> {
    @HmlPinActivity
    public getDeclaredClass(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(boolean z, getDocumentVerificationConfidenceRating getdocumentverificationconfidencerating) {
        getdocumentverificationconfidencerating.MediaBrowserCompat$CustomActionResultReceiver();
        if (z) {
            getdocumentverificationconfidencerating.IconCompatParcelizer();
        } else {
            getdocumentverificationconfidencerating.write();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(boolean z, Boolean bool, getDocumentVerificationConfidenceRating getdocumentverificationconfidencerating) {
        if (z || bool.booleanValue()) {
            getdocumentverificationconfidencerating.MediaBrowserCompat$SearchResultReceiver();
        } else {
            getdocumentverificationconfidencerating.RatingCompat();
        }
    }
}
