package p040o;

import p040o.zzqj;

/* renamed from: o.setExclusionStrategies$MediaBrowserCompat$ItemReceiver */
public class setExclusionStrategies$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzqj.zza> {
    private /* synthetic */ setExclusionStrategies write;

    public setExclusionStrategies$MediaBrowserCompat$ItemReceiver(setExclusionStrategies setexclusionstrategies) {
        this.write = setexclusionstrategies;
    }

    public final /* synthetic */ void onNext(Object obj) {
        zzqj.zza zza = (zzqj.zza) obj;
        boolean z = false;
        this.write.MediaBrowserCompat$ItemReceiver.set(false);
        if (this.write.write.IconCompatParcelizer()) {
            setExclusionStrategies setexclusionstrategies = this.write;
            setLongSerializationPolicy setlongserializationpolicy = setLongSerializationPolicy.MediaBrowserCompat$ItemReceiver;
            if (setexclusionstrategies.RatingCompat != null) {
                setlongserializationpolicy.IconCompatParcelizer(setexclusionstrategies.RatingCompat);
            }
            getDependencies MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(zza);
            if (MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.isEmpty()) {
                setExclusionStrategies setexclusionstrategies2 = this.write;
                registerTypeAdapterFactory registertypeadapterfactory = registerTypeAdapterFactory.write;
                if (setexclusionstrategies2.RatingCompat != null) {
                    registertypeadapterfactory.IconCompatParcelizer(setexclusionstrategies2.RatingCompat);
                }
            } else {
                setExclusionStrategies setexclusionstrategies3 = this.write;
                excludeFieldsWithModifiers excludefieldswithmodifiers = new excludeFieldsWithModifiers(MediaBrowserCompat$ItemReceiver);
                if (setexclusionstrategies3.RatingCompat != null) {
                    excludefieldswithmodifiers.IconCompatParcelizer(setexclusionstrategies3.RatingCompat);
                }
            }
            setExclusionStrategies setexclusionstrategies4 = this.write;
            disableHtmlEscaping disablehtmlescaping = new disableHtmlEscaping(zza);
            if (setexclusionstrategies4.RatingCompat != null) {
                z = true;
            }
            if (z) {
                disablehtmlescaping.IconCompatParcelizer(setexclusionstrategies4.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        boolean z = false;
        this.write.MediaBrowserCompat$ItemReceiver.set(false);
        if (this.write.write.IconCompatParcelizer()) {
            setExclusionStrategies setexclusionstrategies = this.write;
            setLongSerializationPolicy setlongserializationpolicy = setLongSerializationPolicy.MediaBrowserCompat$ItemReceiver;
            if (setexclusionstrategies.RatingCompat != null) {
                setlongserializationpolicy.IconCompatParcelizer(setexclusionstrategies.RatingCompat);
            }
            if (!this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
                setExclusionStrategies setexclusionstrategies2 = this.write;
                registerTypeAdapterFactory registertypeadapterfactory = registerTypeAdapterFactory.write;
                if (setexclusionstrategies2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    registertypeadapterfactory.IconCompatParcelizer(setexclusionstrategies2.RatingCompat);
                }
            }
        }
    }
}
