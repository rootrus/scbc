package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.C10827Iterators;
import p040o.Constraints;
import p040o.FirebaseVisionCloudImageLabelerOptions;
import p040o.FirebaseVisionCloudTextRecognizerOptions;
import p040o.ILocationSourceDelegate;
import p040o.Maps;
import p040o.access$2300;

/* renamed from: o.KotlinDetector */
public class KotlinDetector extends writeUInt64NoTag<getAddress5> {
    public chain IconCompatParcelizer;
    public final C10827Iterators.C353914 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Maps.AbstractFilteredMap.Values.C36441 MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver = "";
    public String MediaDescriptionCompat = "";
    public boolean MediaMetadataCompat = false;
    private final Maps.EntrySetImpl MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public final Maps.FilteredEntryMap.EntrySet.C36451.C36461 MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final Maps.AbstractFilteredMap.Values MediaSessionCompat$Token;
    public final getLocalPort read;
    public FirebaseAnalytics write;

    public static boolean read(long j, long j2) {
        return j2 < j;
    }

    @HmlPinActivity
    public KotlinDetector(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, Maps.AbstractFilteredMap.Values values, Maps.AbstractFilteredMap.Values.C36441 r4, Maps.FilteredEntryMap.EntrySet.C36451.C36461 r5, Maps.EntrySetImpl entrySetImpl, C10827Iterators.C353914 r7) {
        super(regularImmutableBiMap);
        this.read = getlocalport;
        this.MediaSessionCompat$Token = values;
        this.MediaBrowserCompat$MediaItem = r4;
        this.MediaSessionCompat$ResultReceiverWrapper = r5;
        this.MediaSessionCompat$QueueItem = entrySetImpl;
        this.MediaBrowserCompat$ItemReceiver = r7;
    }

    static /* synthetic */ void IconCompatParcelizer(getAddress5 getaddress5) {
        getaddress5.AppCompatViewInflater();
        getaddress5.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(getAddress5 getaddress5) {
        getaddress5.ActionMenuItemView();
        getaddress5.MediaBrowserCompat$ItemReceiver();
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(getAddress5 getaddress5) {
        getaddress5.MediaSessionCompat$QueueItem();
        getaddress5.setItemInvoker();
        getaddress5.setPadding();
        getaddress5.MediaBrowserCompat$CustomActionResultReceiver();
    }

    static /* synthetic */ void write(getAddress5 getaddress5) {
        getaddress5.AppCompatDialogFragment();
        getaddress5.setExpandedFormat();
        getaddress5.read();
    }

    static /* synthetic */ void read(getAddress5 getaddress5) {
        getaddress5.setExpandedFormat();
        getaddress5.read();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getAddress5 getaddress5) {
        getaddress5.setPadding();
        getaddress5.AppCompatDelegateImpl$ListMenuDecorView();
        getaddress5.setCheckable();
        getaddress5.MediaSessionCompat$ResultReceiverWrapper();
        getaddress5.AppCompatActivity();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3, boolean z) {
        LibraryVersionComponent libraryVersionComponent = LibraryVersionComponent.read;
        if (this.RatingCompat != null) {
            libraryVersionComponent.IconCompatParcelizer(this.RatingCompat);
        }
        this.read.write(new constrainedList(new constrainedTypePreservingCollection(constrainedMultiset.MIN_OR_FULL_NEWTENOR, str2, getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str.replace(",", "")).doubleValue(), (String) null, (Constraints.ConstrainedMultiset) null), z, str3));
        this.read.IconCompatParcelizer(new IconCompatParcelizer(this, (byte) 0));
    }

    static /* synthetic */ void write(String str, double d, getAddress5 getaddress5) {
        getaddress5.read(str);
        getaddress5.IconCompatParcelizer(d);
    }

    /* renamed from: o.KotlinDetector$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<has> {
        private write() {
        }

        public /* synthetic */ write(KotlinDetector kotlinDetector, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            has has = (has) obj;
            if (has.MediaBrowserCompat$ItemReceiver != null && !has.MediaBrowserCompat$ItemReceiver.isEmpty()) {
                List<DisplayOut> MediaBrowserCompat$ItemReceiver = KotlinDetector.this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(has.MediaBrowserCompat$ItemReceiver);
                KotlinDetector kotlinDetector = KotlinDetector.this;
                getMinFaceSize getminfacesize = new getMinFaceSize(MediaBrowserCompat$ItemReceiver);
                if (kotlinDetector.RatingCompat != null) {
                    getminfacesize.IconCompatParcelizer(kotlinDetector.RatingCompat);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0079  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onError(java.lang.Throwable r7) {
            /*
                r6 = this;
                o.KotlinDetector r0 = p040o.KotlinDetector.this
                o.getLandmarkMode r1 = p040o.getLandmarkMode.MediaBrowserCompat$CustomActionResultReceiver
                T r2 = r0.RatingCompat
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x000c
                r2 = r3
                goto L_0x000d
            L_0x000c:
                r2 = r4
            L_0x000d:
                if (r2 == 0) goto L_0x0014
                T r0 = r0.RatingCompat
                r1.IconCompatParcelizer(r0)
            L_0x0014:
                o.KotlinDetector r0 = p040o.KotlinDetector.this
                o.RegularImmutableBiMap r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                o.access$2300$write r1 = p040o.access$2300.write.JUST_DISMISS
                o.access$2200 r0 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r7, (p040o.access$2300.write) r1)
                boolean r1 = r7 instanceof com.scb.phone.domain.errors.RetrofitException
                if (r1 == 0) goto L_0x005f
                r1 = r7
                com.scb.phone.domain.errors.RetrofitException r1 = (com.scb.phone.domain.errors.RetrofitException) r1
                o.ILocationSourceDelegate r1 = r1.IconCompatParcelizer
                if (r1 == 0) goto L_0x005f
                o.ILocationSourceDelegate$zza r1 = r1.write
                if (r1 == 0) goto L_0x005f
                java.lang.String r2 = r1.IconCompatParcelizer
                java.lang.String r5 = "3014"
                boolean r2 = r5.equalsIgnoreCase(r2)
                if (r2 != 0) goto L_0x0045
                java.lang.String r1 = r1.IconCompatParcelizer
                java.lang.String r2 = "3001"
                boolean r1 = r2.equalsIgnoreCase(r1)
                if (r1 != 0) goto L_0x0045
                r1 = r4
                goto L_0x0046
            L_0x0045:
                r1 = r3
            L_0x0046:
                if (r1 == 0) goto L_0x005f
                o.KotlinDetector r1 = p040o.KotlinDetector.this
                o.getPerformanceMode r2 = new o.getPerformanceMode
                r2.<init>(r0)
                T r5 = r1.RatingCompat
                if (r5 == 0) goto L_0x0055
                r5 = r3
                goto L_0x0056
            L_0x0055:
                r5 = r4
            L_0x0056:
                if (r5 == 0) goto L_0x005d
                T r1 = r1.RatingCompat
                r2.IconCompatParcelizer(r1)
            L_0x005d:
                r1 = r3
                goto L_0x0060
            L_0x005f:
                r1 = r4
            L_0x0060:
                if (r1 != 0) goto L_0x007e
                o.KotlinDetector r1 = p040o.KotlinDetector.this
                boolean r7 = r1.MediaBrowserCompat$SearchResultReceiver(r7)
                if (r7 != 0) goto L_0x007e
                o.KotlinDetector r7 = p040o.KotlinDetector.this
                o.FirebaseVisionFaceDetectorOptions$Builder r1 = new o.FirebaseVisionFaceDetectorOptions$Builder
                r1.<init>(r0)
                T r0 = r7.RatingCompat
                if (r0 == 0) goto L_0x0076
                goto L_0x0077
            L_0x0076:
                r3 = r4
            L_0x0077:
                if (r3 == 0) goto L_0x007e
                T r7 = r7.RatingCompat
                r1.IconCompatParcelizer(r7)
            L_0x007e:
                o.KotlinDetector r7 = p040o.KotlinDetector.this
                boolean unused = r7.MediaMetadataCompat = false
                o.KotlinDetector r7 = p040o.KotlinDetector.this
                java.lang.String r0 = ""
                java.lang.String unused = r7.MediaBrowserCompat$SearchResultReceiver = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.KotlinDetector.write.onError(java.lang.Throwable):void");
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getAddress5 getaddress5) {
            getaddress5.MediaSessionCompat$Token();
            getaddress5.IconCompatParcelizer();
            getaddress5.setItemInvoker();
            getaddress5.MediaSessionCompat$ResultReceiverWrapper();
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(access$2200 access_2200, getAddress5 getaddress5) {
            getaddress5.setPadding();
            getaddress5.write(access_2200);
        }

        public final void onComplete() {
            KotlinDetector.MediaDescriptionCompat(KotlinDetector.this);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getAddress5 getaddress5) {
        getaddress5.MediaSessionCompat$Token();
        getaddress5.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(normalize normalize, String str, String str2, String str3, boolean z) {
        LibraryVersionComponent libraryVersionComponent = LibraryVersionComponent.read;
        if (this.RatingCompat != null) {
            libraryVersionComponent.IconCompatParcelizer(this.RatingCompat);
        }
        onGetStartedClick.write((Object) normalize, "display");
        onGetStartedClick.write((Object) str, "transferAmount");
        onGetStartedClick.write((Object) str2, "toAccountNumber");
        onGetStartedClick.write((Object) str3, "cardRefNo");
        String str4 = normalize.MediaBrowserCompat$MediaItem;
        constrainedMultiset constrainedmultiset = constrainedMultiset.DEEJUNG_NEWTENOR;
        Double MediaBrowserCompat$ItemReceiver2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, ",", "", false));
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "Utilities.amountStringTo…rAmount.replace(\",\", \"\"))");
        this.read.write(new constrainedList(new constrainedTypePreservingCollection(constrainedmultiset, str2, MediaBrowserCompat$ItemReceiver2.doubleValue(), normalize.MediaMetadataCompat, new Constraints.ConstrainedMultiset(normalize.MediaSessionCompat$ResultReceiverWrapper, str4)), z, str3));
        this.read.IconCompatParcelizer(new KotlinDetector$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ensureReceiverRegistered ensurereceiverregistered, normalize normalize, getAddress5 getaddress5) {
        getaddress5.aj_();
        getaddress5.MediaBrowserCompat$CustomActionResultReceiver(ensurereceiverregistered, normalize);
    }

    /* renamed from: o.KotlinDetector$IconCompatParcelizer */
    class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<constrainedSet> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(KotlinDetector kotlinDetector, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            KotlinDetector kotlinDetector = KotlinDetector.this;
            FirebaseVisionCloudImageLabelerOptions.Builder builder = new FirebaseVisionCloudImageLabelerOptions.Builder(this, (constrainedSet) obj);
            if (kotlinDetector.RatingCompat != null) {
                builder.IconCompatParcelizer(kotlinDetector.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            KotlinDetector.this.IconCompatParcelizer(th, constrainedMultiset.MIN_OR_FULL_NEWTENOR);
        }

        public final void onComplete() {
            KotlinDetector.MediaBrowserCompat$ItemReceiver(KotlinDetector.this);
        }
    }

    public static String IconCompatParcelizer(constrainedSet constrainedset, getAddress5 getaddress5) {
        if (!AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(getaddress5.MediaDescriptionCompat())) {
            return getaddress5.MediaDescriptionCompat();
        }
        if (!AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(constrainedset.read)) {
            return constrainedset.read;
        }
        return getaddress5.write();
    }

    public final void IconCompatParcelizer(Throwable th, constrainedMultiset constrainedmultiset) {
        boolean z;
        ILocationSourceDelegate iLocationSourceDelegate;
        ILocationSourceDelegate.zza zza;
        DefaultUserAgentPublisher$$Lambda$1 defaultUserAgentPublisher$$Lambda$1 = DefaultUserAgentPublisher$$Lambda$1.read;
        boolean z2 = true;
        if (this.RatingCompat != null) {
            defaultUserAgentPublisher$$Lambda$1.IconCompatParcelizer(this.RatingCompat);
        }
        access$2200 MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
        if (!(th instanceof RetrofitException) || (iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer) == null || (zza = iLocationSourceDelegate.write) == null || !"9003".equalsIgnoreCase(zza.IconCompatParcelizer)) {
            z = false;
        } else {
            FirebaseVisionFaceContour firebaseVisionFaceContour = new FirebaseVisionFaceContour(MediaBrowserCompat$ItemReceiver2, constrainedmultiset);
            if (this.RatingCompat != null) {
                firebaseVisionFaceContour.IconCompatParcelizer(this.RatingCompat);
            }
            z = true;
        }
        if (!z && !MediaBrowserCompat$SearchResultReceiver(th)) {
            FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions = new FirebaseVisionCloudTextRecognizerOptions(MediaBrowserCompat$ItemReceiver2);
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                firebaseVisionCloudTextRecognizerOptions.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(KotlinDetector kotlinDetector) {
        if (kotlinDetector.RatingCompat != null) {
            kotlinDetector.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(KotlinDetector kotlinDetector) {
        if (kotlinDetector.RatingCompat != null) {
            kotlinDetector.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(KotlinDetector kotlinDetector) {
        boolean z = false;
        kotlinDetector.MediaMetadataCompat = false;
        FirebaseVisionCloudTextRecognizerOptions.Builder builder = FirebaseVisionCloudTextRecognizerOptions.Builder.IconCompatParcelizer;
        if (kotlinDetector.RatingCompat != null) {
            z = true;
        }
        if (z) {
            builder.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
    }
}
