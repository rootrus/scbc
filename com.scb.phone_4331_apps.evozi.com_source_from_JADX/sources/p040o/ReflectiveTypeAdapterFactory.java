package p040o;

import p040o.Analytics;
import p040o.ExperimentTokens;
import p040o.IdCaptureModule;
import p040o.MinMaxPriorityQueue;
import p040o.writeUInt64NoTag;

/* renamed from: o.ReflectiveTypeAdapterFactory */
public final /* synthetic */ class ReflectiveTypeAdapterFactory implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ ReflectiveTypeAdapterFactory read = new ReflectiveTypeAdapterFactory();

    private /* synthetic */ ReflectiveTypeAdapterFactory() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((IdCaptureModule.C6906b) obj).read();
    }

    /* renamed from: o.ReflectiveTypeAdapterFactory$BoundField */
    public class BoundField extends writeUInt64NoTag<IdCaptureModule.C6906b> {
        /* access modifiers changed from: private */
        public final allPrimitiveTypes MediaBrowserCompat$ItemReceiver;
        public final Configuration read;
        /* access modifiers changed from: private */
        public final getEulerY write;

        @HmlPinActivity
        public BoundField(RegularImmutableBiMap regularImmutableBiMap, Configuration configuration, getEulerY geteulery, allPrimitiveTypes allprimitivetypes) {
            super(regularImmutableBiMap);
            this.read = configuration;
            this.write = geteulery;
            this.MediaBrowserCompat$ItemReceiver = allprimitivetypes;
        }
    }

    /* renamed from: o.ReflectiveTypeAdapterFactory$Adapter */
    public class Adapter extends writeUInt64NoTag<IdCaptureModule.OnDeviceExceptionResponseDeserializer.C6904a> {
        /* access modifiers changed from: private */
        public final MinMaxPriorityQueue.C36591 IconCompatParcelizer;
        public final Analytics MediaBrowserCompat$ItemReceiver;
        /* access modifiers changed from: private */
        public final getEulerY MediaDescriptionCompat;
        public final ExperimentTokens.zza read;
        public getStreetViewPanoramaAsync write;

        @HmlPinActivity
        public Adapter(RegularImmutableBiMap regularImmutableBiMap, MinMaxPriorityQueue.C36591 r2, Analytics analytics, ExperimentTokens.zza zza, getEulerY geteulery) {
            super(regularImmutableBiMap);
            this.IconCompatParcelizer = r2;
            this.MediaBrowserCompat$ItemReceiver = analytics;
            this.read = zza;
            this.MediaDescriptionCompat = geteulery;
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Adapter adapter) {
            if (adapter.RatingCompat != null) {
                adapter.RatingCompat.aj_();
            }
        }
    }

    /* renamed from: o.ReflectiveTypeAdapterFactory$1 */
    public final class C37481 implements OPRStatusRewardsLandingActivity_ViewBinding<keyToString> {
        public static keyToString MediaBrowserCompat$CustomActionResultReceiver(RegularImmutableBiMap regularImmutableBiMap, removeAt removeat, Analytics.Event event) {
            return new keyToString(regularImmutableBiMap, removeat, event);
        }

        public final /* synthetic */ Object get() {
            HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
            return new keyToString((RegularImmutableBiMap) hmlReviewDocumentActivity.get(), (removeAt) hmlReviewDocumentActivity.get(), (Analytics.Event) hmlReviewDocumentActivity.get());
        }
    }
}
