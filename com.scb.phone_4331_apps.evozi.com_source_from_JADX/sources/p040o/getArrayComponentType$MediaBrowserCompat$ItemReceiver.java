package p040o;

import p040o.zzqj;

/* renamed from: o.getArrayComponentType$MediaBrowserCompat$ItemReceiver */
public class getArrayComponentType$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzqj.zza> {
    final /* synthetic */ getArrayComponentType MediaBrowserCompat$ItemReceiver;

    public getArrayComponentType$MediaBrowserCompat$ItemReceiver(getArrayComponentType getarraycomponenttype) {
        this.MediaBrowserCompat$ItemReceiver = getarraycomponenttype;
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzqj.zza zza = (zzqj.zza) obj;
        getArrayComponentType getarraycomponenttype = this.MediaBrowserCompat$ItemReceiver;
        deepCopy deepcopy = deepCopy.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (getarraycomponenttype.RatingCompat != null) {
            deepcopy.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
        }
        getArrayComponentType getarraycomponenttype2 = this.MediaBrowserCompat$ItemReceiver;
        isNumber isnumber = isNumber.read;
        if (getarraycomponenttype2.RatingCompat != null) {
            isnumber.IconCompatParcelizer(getarraycomponenttype2.RatingCompat);
        }
        getArrayComponentType getarraycomponenttype3 = this.MediaBrowserCompat$ItemReceiver;
        isJsonObject isjsonobject = new isJsonObject(this, zza);
        if (getarraycomponenttype3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            isjsonobject.IconCompatParcelizer(getarraycomponenttype3.RatingCompat);
        }
        if (zza != null) {
            ModifyQuickTopUpReviewActivity unused = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = zza.MediaBrowserCompat$ItemReceiver;
        }
    }

    public final void onComplete() {
        this.MediaBrowserCompat$ItemReceiver.write.set(false);
    }

    public final void onError(Throwable th) {
        boolean z = false;
        this.MediaBrowserCompat$ItemReceiver.write.set(false);
        if (!this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            getArrayComponentType getarraycomponenttype = this.MediaBrowserCompat$ItemReceiver;
            deepCopy deepcopy = deepCopy.MediaBrowserCompat$ItemReceiver;
            if (getarraycomponenttype.RatingCompat != null) {
                deepcopy.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
            }
            getArrayComponentType getarraycomponenttype2 = this.MediaBrowserCompat$ItemReceiver;
            nullSafe nullsafe = nullSafe.MediaBrowserCompat$CustomActionResultReceiver;
            if (getarraycomponenttype2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                nullsafe.IconCompatParcelizer(getarraycomponenttype2.RatingCompat);
            }
        }
    }
}
