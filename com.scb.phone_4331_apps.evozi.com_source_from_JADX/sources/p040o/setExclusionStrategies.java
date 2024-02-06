package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import p040o.Constraints;
import p040o.Gson;
import p040o.Maps;
import p040o.zzqj;

/* renamed from: o.setExclusionStrategies */
public class setExclusionStrategies extends writeUInt64NoTag<getLastName> {
    public Maps.UnmodifiableEntrySet IconCompatParcelizer;
    public AtomicBoolean MediaBrowserCompat$ItemReceiver = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public Maps.TransformedEntriesMap.EntrySet MediaBrowserCompat$MediaItem;
    public getSupportedCipherSuites read;
    /* access modifiers changed from: private */
    public getLastName write;

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(CheckCaptureModule_GetICheckDeserializerRttiFactory checkCaptureModule_GetICheckDeserializerRttiFactory) {
        getLastName getlastname = (getLastName) checkCaptureModule_GetICheckDeserializerRttiFactory;
        super.MediaBrowserCompat$ItemReceiver(getlastname);
        this.write = getlastname;
    }

    @HmlPinActivity
    public setExclusionStrategies(RegularImmutableBiMap regularImmutableBiMap, getSupportedCipherSuites getsupportedciphersuites, Maps.TransformedEntriesMap.EntrySet entrySet, Maps.UnmodifiableEntrySet unmodifiableEntrySet) {
        super(regularImmutableBiMap);
        this.read = getsupportedciphersuites;
        this.MediaBrowserCompat$MediaItem = entrySet;
        this.IconCompatParcelizer = unmodifiableEntrySet;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getLastName getlastname) {
        super.MediaBrowserCompat$ItemReceiver(getlastname);
        this.write = getlastname;
    }

    /* renamed from: o.setExclusionStrategies$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzqj.zza> {
        public write() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzqj.zza zza = (zzqj.zza) obj;
            boolean z = false;
            setExclusionStrategies.this.MediaBrowserCompat$ItemReceiver.set(false);
            if (setExclusionStrategies.this.write != null && setExclusionStrategies.this.write.IconCompatParcelizer()) {
                setExclusionStrategies setexclusionstrategies = setExclusionStrategies.this;
                serializeSpecialFloatingPointValues serializespecialfloatingpointvalues = serializeSpecialFloatingPointValues.IconCompatParcelizer;
                if (setexclusionstrategies.RatingCompat != null) {
                    serializespecialfloatingpointvalues.IconCompatParcelizer(setexclusionstrategies.RatingCompat);
                }
                setExclusionStrategies setexclusionstrategies2 = setExclusionStrategies.this;
                GsonBuilder gsonBuilder = GsonBuilder.MediaBrowserCompat$ItemReceiver;
                if (setexclusionstrategies2.RatingCompat != null) {
                    gsonBuilder.IconCompatParcelizer(setexclusionstrategies2.RatingCompat);
                }
                setExclusionStrategies setexclusionstrategies3 = setExclusionStrategies.this;
                addSerializationExclusionStrategy addserializationexclusionstrategy = new addSerializationExclusionStrategy(this, zza);
                if (setexclusionstrategies3.RatingCompat != null) {
                    addserializationexclusionstrategy.IconCompatParcelizer(setexclusionstrategies3.RatingCompat);
                }
                if (zza != null) {
                    setExclusionStrategies setexclusionstrategies4 = setExclusionStrategies.this;
                    Gson.FutureTypeAdapter futureTypeAdapter = new Gson.FutureTypeAdapter(zza);
                    if (setexclusionstrategies4.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        futureTypeAdapter.IconCompatParcelizer(setexclusionstrategies4.RatingCompat);
                    }
                }
            }
        }

        public final void onError(Throwable th) {
            boolean z = false;
            setExclusionStrategies.this.MediaBrowserCompat$ItemReceiver.set(false);
            if (setExclusionStrategies.this.write.IconCompatParcelizer() && !setExclusionStrategies.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                setExclusionStrategies setexclusionstrategies = setExclusionStrategies.this;
                serializeSpecialFloatingPointValues serializespecialfloatingpointvalues = serializeSpecialFloatingPointValues.IconCompatParcelizer;
                if (setexclusionstrategies.RatingCompat != null) {
                    serializespecialfloatingpointvalues.IconCompatParcelizer(setexclusionstrategies.RatingCompat);
                }
                setExclusionStrategies setexclusionstrategies2 = setExclusionStrategies.this;
                setFieldNamingPolicy setfieldnamingpolicy = setFieldNamingPolicy.write;
                if (setexclusionstrategies2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setfieldnamingpolicy.IconCompatParcelizer(setexclusionstrategies2.RatingCompat);
                }
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C4283discover discover, ModifyQuickTopUpReviewActivity modifyQuickTopUpReviewActivity) {
        if (modifyQuickTopUpReviewActivity != null && modifyQuickTopUpReviewActivity.write && !this.MediaBrowserCompat$ItemReceiver.get()) {
            this.MediaBrowserCompat$ItemReceiver.set(true);
            Gson.C34273 r0 = Gson.C34273.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                r0.IconCompatParcelizer(this.RatingCompat);
            }
            this.read.write(new Constraints.ConstrainedSortedSet(Integer.valueOf(discover.MediaBrowserCompat$ItemReceiver), modifyQuickTopUpReviewActivity.MediaBrowserCompat$ItemReceiver + 1), true);
            this.read.IconCompatParcelizer(new write());
        }
    }
}
