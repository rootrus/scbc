package p040o;

import p040o.zzqj;

/* renamed from: o.getArrayComponentType$MediaBrowserCompat$CustomActionResultReceiver */
final class C4501x89543781 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzqj.zza> {
    final /* synthetic */ getArrayComponentType MediaBrowserCompat$CustomActionResultReceiver;

    C4501x89543781(getArrayComponentType getarraycomponenttype) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getarraycomponenttype;
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzqj.zza zza = (zzqj.zza) obj;
        getArrayComponentType.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        boolean z = true;
        if (zza != null && zza.MediaBrowserCompat$CustomActionResultReceiver != null && !zza.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
            getArrayComponentType getarraycomponenttype = this.MediaBrowserCompat$CustomActionResultReceiver;
            JsonIOException jsonIOException = new JsonIOException(this, zza);
            if (getarraycomponenttype.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jsonIOException.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
            }
            ModifyQuickTopUpReviewActivity unused = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = zza.MediaBrowserCompat$ItemReceiver;
        } else if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo != null) {
            getArrayComponentType getarraycomponenttype2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            JsonNull jsonNull = new JsonNull(this);
            if (getarraycomponenttype2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jsonNull.IconCompatParcelizer(getarraycomponenttype2.RatingCompat);
            }
        } else if (getArrayComponentType.MediaMetadataCompat(this.MediaBrowserCompat$CustomActionResultReceiver)) {
            getArrayComponentType getarraycomponenttype3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            JsonSyntaxException jsonSyntaxException = JsonSyntaxException.read;
            if (getarraycomponenttype3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                jsonSyntaxException.IconCompatParcelizer(getarraycomponenttype3.RatingCompat);
            }
        } else {
            getArrayComponentType getarraycomponenttype4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            SerializedName serializedName = SerializedName.write;
            if (getarraycomponenttype4.RatingCompat == null) {
                z = false;
            }
            if (z) {
                serializedName.IconCompatParcelizer(getarraycomponenttype4.RatingCompat);
            }
            getArrayComponentType.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public final void onComplete() {
        getArrayComponentType.read(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void onError(Throwable th) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            getArrayComponentType.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
            getArrayComponentType getarraycomponenttype = this.MediaBrowserCompat$CustomActionResultReceiver;
            TypeAdapter typeAdapter = TypeAdapter.read;
            if (getarraycomponenttype.RatingCompat != null) {
                typeAdapter.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
            }
            getArrayComponentType.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }
}
