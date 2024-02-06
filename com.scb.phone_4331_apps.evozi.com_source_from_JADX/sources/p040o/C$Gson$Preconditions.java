package p040o;

import p040o.Maps;
import p040o.TypeAdapter;
import p040o.zzqj;

/* renamed from: o.$Gson$Preconditions  reason: invalid class name */
public class C$Gson$Preconditions extends writeUInt64NoTag<getSignatureImage> {
    public final getSupportedCipherSuites IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Maps.TransformedEntriesMap.EntrySet read;

    @HmlPinActivity
    public C$Gson$Preconditions(RegularImmutableBiMap regularImmutableBiMap, getSupportedCipherSuites getsupportedciphersuites, Maps.TransformedEntriesMap.EntrySet entrySet, Maps.TransformedEntriesMap.EntrySet.C36501 r4) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = getsupportedciphersuites;
        this.read = entrySet;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Boolean bool, boolean z, boolean z2, boolean z3, boolean z4, getSignatureImage getsignatureimage) {
        if (!bool.booleanValue()) {
            if (z) {
                getsignatureimage.read();
                getsignatureimage.MediaBrowserCompat$ItemReceiver();
            }
            if (z2) {
                getsignatureimage.IconCompatParcelizer();
            }
            if (z3) {
                getsignatureimage.MediaBrowserCompat$MediaItem();
            }
            if (z4) {
                getsignatureimage.write();
                return;
            }
            return;
        }
        getsignatureimage.MediaBrowserCompat$CustomActionResultReceiver();
    }

    static Integer MediaBrowserCompat$ItemReceiver(String str) {
        return Integer.valueOf((int) Double.parseDouble(str.replaceAll(",", "")));
    }

    static Double MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return Double.valueOf(Double.parseDouble(str.replaceAll(",", "")));
    }

    /* renamed from: o.$Gson$Preconditions$write */
    class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzqj.zza> {
        final ComponentContainer write;

        public final /* synthetic */ void onNext(Object obj) {
            zzqj.zza zza = (zzqj.zza) obj;
            C$Gson$Preconditions.IconCompatParcelizer(C$Gson$Preconditions.this);
            boolean z = true;
            if (zza.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) {
                C$Gson$Preconditions _gson_preconditions = C$Gson$Preconditions.this;
                TypeAdapter.C38781 r0 = TypeAdapter.C38781.write;
                if (_gson_preconditions.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    r0.IconCompatParcelizer(_gson_preconditions.RatingCompat);
                    return;
                }
                return;
            }
            getDependencies MediaBrowserCompat$ItemReceiver = C$Gson$Preconditions.this.read.MediaBrowserCompat$ItemReceiver(zza);
            C$Gson$Preconditions _gson_preconditions2 = C$Gson$Preconditions.this;
            getAsDouble getasdouble = new getAsDouble(this, MediaBrowserCompat$ItemReceiver);
            if (_gson_preconditions2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getasdouble.IconCompatParcelizer(_gson_preconditions2.RatingCompat);
            }
        }

        public write(ComponentContainer componentContainer) {
            this.write = componentContainer;
        }

        public final void onError(Throwable th) {
            C$Gson$Preconditions _gson_preconditions = C$Gson$Preconditions.this;
            JsonArray jsonArray = JsonArray.IconCompatParcelizer;
            boolean z = true;
            if (_gson_preconditions.RatingCompat != null) {
                jsonArray.IconCompatParcelizer(_gson_preconditions.RatingCompat);
            }
            if (!C$Gson$Preconditions.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                C$Gson$Preconditions _gson_preconditions2 = C$Gson$Preconditions.this;
                JsonStreamParser jsonStreamParser = JsonStreamParser.MediaBrowserCompat$CustomActionResultReceiver;
                if (_gson_preconditions2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    jsonStreamParser.IconCompatParcelizer(_gson_preconditions2.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C$Gson$Preconditions _gson_preconditions) {
        if (_gson_preconditions.RatingCompat != null) {
            _gson_preconditions.RatingCompat.aj_();
        }
    }
}
