package p040o;

import p040o.TokenResult;

/* renamed from: o.FirebaseVisionImageMetadata$MediaBrowserCompat$CustomActionResultReceiver */
public class C9742xdf6f648 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<constrainedSortedSet> {
    final /* synthetic */ FirebaseVisionImageMetadata write;

    private C9742xdf6f648(FirebaseVisionImageMetadata firebaseVisionImageMetadata) {
        this.write = firebaseVisionImageMetadata;
    }

    public /* synthetic */ C9742xdf6f648(FirebaseVisionImageMetadata firebaseVisionImageMetadata, byte b) {
        this(firebaseVisionImageMetadata);
    }

    public final /* synthetic */ void onNext(Object obj) {
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.write;
        TokenResult.ResponseCode responseCode = new TokenResult.ResponseCode(this, (constrainedSortedSet) obj);
        if (firebaseVisionImageMetadata.RatingCompat != null) {
            responseCode.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.write;
        FirebaseRemoteModel firebaseRemoteModel = FirebaseRemoteModel.write;
        boolean z = true;
        if (firebaseVisionImageMetadata.RatingCompat != null) {
            firebaseRemoteModel.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
        }
        if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            FirebaseVisionImageMetadata firebaseVisionImageMetadata2 = this.write;
            DataCollectionConfigStorage dataCollectionConfigStorage = new DataCollectionConfigStorage(this, th);
            if (firebaseVisionImageMetadata2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dataCollectionConfigStorage.IconCompatParcelizer(firebaseVisionImageMetadata2.RatingCompat);
            }
        }
    }

    public final void onComplete() {
        FirebaseVisionImageMetadata firebaseVisionImageMetadata = this.write;
        FirebaseRemoteModel firebaseRemoteModel = FirebaseRemoteModel.write;
        if (firebaseVisionImageMetadata.RatingCompat != null) {
            firebaseRemoteModel.IconCompatParcelizer(firebaseVisionImageMetadata.RatingCompat);
        }
    }
}
