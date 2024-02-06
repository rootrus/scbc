package p040o;

import java.util.ArrayList;
import java.util.List;
import p040o.C10827Iterators;
import p040o.FirebaseApp;
import p040o.Synchronized;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseVisionImageMetadata */
public class FirebaseVisionImageMetadata extends writeUInt64NoTag<Extractor> {
    public final transformEntries IconCompatParcelizer;
    public final getLocalPort MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public transformValues MediaBrowserCompat$MediaItem;
    public final unmodifiableEntry MediaDescriptionCompat;
    public final C10827Iterators.C353712 read;
    public final safeGet write;

    /* renamed from: o.FirebaseVisionImageMetadata$Builder */
    public final class Builder extends writeUInt64NoTag<setExceptionResponseDeserializer> {
        public getOptions IconCompatParcelizer;
        final unmodifiableBiMap MediaBrowserCompat$ItemReceiver;
        public final Synchronized.SynchronizedSetMultimap MediaBrowserCompat$MediaItem;
        public FirebaseApp.BackgroundStateChangeListener MediaBrowserCompat$SearchResultReceiver = new FirebaseApp.BackgroundStateChangeListener();
        public Integer MediaDescriptionCompat;
        public FirebaseApp.BackgroundStateChangeListener MediaMetadataCompat;
        public final getLocalPort read;
        public final newLinkedHashMap write;

        /* renamed from: o.FirebaseVisionImageMetadata$Builder$MediaDescriptionCompat */
        static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<setExceptionResponseDeserializer> {
            public static final MediaDescriptionCompat MediaBrowserCompat$ItemReceiver = new MediaDescriptionCompat();

            MediaDescriptionCompat() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((setExceptionResponseDeserializer) obj).read(false);
            }
        }

        /* renamed from: o.FirebaseVisionImageMetadata$Builder$MediaMetadataCompat */
        static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<setExceptionResponseDeserializer> {
            public static final MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaMetadataCompat();

            MediaMetadataCompat() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((setExceptionResponseDeserializer) obj).MediaBrowserCompat$ItemReceiver();
            }
        }

        /* renamed from: o.FirebaseVisionImageMetadata$Builder$RatingCompat */
        static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<setExceptionResponseDeserializer> {
            private /* synthetic */ Builder MediaBrowserCompat$CustomActionResultReceiver;

            RatingCompat(Builder builder) {
                this.MediaBrowserCompat$CustomActionResultReceiver = builder;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                String MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.doubleValue());
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "selectedTxn.formattedTotalAmount");
                ((setExceptionResponseDeserializer) obj).write(MediaBrowserCompat$ItemReceiver);
            }
        }

        /* renamed from: o.FirebaseVisionImageMetadata$Builder$IconCompatParcelizer */
        public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<setExceptionResponseDeserializer> {
            private /* synthetic */ Builder read;

            public IconCompatParcelizer(Builder builder) {
                this.read = builder;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                setExceptionResponseDeserializer setexceptionresponsedeserializer = (setExceptionResponseDeserializer) obj;
                getOptions read2 = this.read.IconCompatParcelizer;
                if (read2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                setexceptionresponsedeserializer.read(read2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public Builder(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, newLinkedHashMap newlinkedhashmap, Synchronized.SynchronizedSetMultimap synchronizedSetMultimap, unmodifiableBiMap unmodifiablebimap) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
            onGetStartedClick.write((Object) getlocalport, "cardManagementCase");
            onGetStartedClick.write((Object) newlinkedhashmap, "cardTransactionMapper");
            onGetStartedClick.write((Object) synchronizedSetMultimap, "loadingDisplayMapper");
            onGetStartedClick.write((Object) unmodifiablebimap, "deejungPlanDtoMapper");
            this.read = getlocalport;
            this.write = newlinkedhashmap;
            this.MediaBrowserCompat$MediaItem = synchronizedSetMultimap;
            this.MediaBrowserCompat$ItemReceiver = unmodifiablebimap;
        }

        public final void read() {
            int size = new ArrayList(this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer).size();
            boolean z = true;
            if (size <= 0) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver;
                if (this.RatingCompat != null) {
                    iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                }
            } else {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = C3387xe02da5c0.MediaBrowserCompat$CustomActionResultReceiver;
                if (this.RatingCompat != null) {
                    iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
                }
            }
            if (size > 0) {
                writeUInt64NoTag.IconCompatParcelizer firebaseVisionImageMetadata$Builder$MediaBrowserCompat$MediaItem = new FirebaseVisionImageMetadata$Builder$MediaBrowserCompat$MediaItem(size);
                if (this.RatingCompat != null) {
                    firebaseVisionImageMetadata$Builder$MediaBrowserCompat$MediaItem.IconCompatParcelizer(this.RatingCompat);
                }
            } else {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
                if (this.RatingCompat != null) {
                    iconCompatParcelizer3.IconCompatParcelizer(this.RatingCompat);
                }
            }
            writeUInt64NoTag.IconCompatParcelizer ratingCompat = new RatingCompat(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ratingCompat.IconCompatParcelizer(this.RatingCompat);
            }
        }

        /* renamed from: o.FirebaseVisionImageMetadata$Builder$write */
        public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setTvRemark$MediaBrowserCompat$CustomActionResultReceiver> {

            /* renamed from: o.FirebaseVisionImageMetadata$Builder$write$IconCompatParcelizer */
            static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<setExceptionResponseDeserializer> {
                private /* synthetic */ write IconCompatParcelizer;

                IconCompatParcelizer(write write) {
                    this.IconCompatParcelizer = write;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((setExceptionResponseDeserializer) obj).read(Builder.this.IconCompatParcelizer);
                }
            }

            /* renamed from: o.FirebaseVisionImageMetadata$Builder$write$write  reason: collision with other inner class name */
            static final class C10809write<V> implements writeUInt64NoTag.IconCompatParcelizer<setExceptionResponseDeserializer> {
                private /* synthetic */ write write;

                C10809write(write write2) {
                    this.write = write2;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    setExceptionResponseDeserializer setexceptionresponsedeserializer = (setExceptionResponseDeserializer) obj;
                    getOptions read = Builder.this.IconCompatParcelizer;
                    if (read == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                    }
                    setexceptionresponsedeserializer.read(read);
                }
            }

            public write() {
            }

            public final /* synthetic */ void onNext(Object obj) {
                setTvRemark$MediaBrowserCompat$CustomActionResultReceiver settvremark_mediabrowsercompat_customactionresultreceiver = (setTvRemark$MediaBrowserCompat$CustomActionResultReceiver) obj;
                onGetStartedClick.write((Object) settvremark_mediabrowsercompat_customactionresultreceiver, "deejungPlansListResponse");
                Builder builder = Builder.this;
                builder.IconCompatParcelizer = builder.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(settvremark_mediabrowsercompat_customactionresultreceiver.write, Builder.this.MediaBrowserCompat$SearchResultReceiver);
                Builder builder2 = Builder.this;
                writeUInt64NoTag.IconCompatParcelizer write = new C10809write(this);
                if (builder2.RatingCompat != null) {
                    write.IconCompatParcelizer(builder2.RatingCompat);
                }
            }

            public final void onComplete() {
                Builder.write(Builder.this);
            }

            /* JADX WARNING: Removed duplicated region for block: B:15:0x007a  */
            /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onError(java.lang.Throwable r8) {
                /*
                    r7 = this;
                    java.lang.String r0 = "e"
                    p040o.onGetStartedClick.write((java.lang.Object) r8, (java.lang.String) r0)
                    o.FirebaseVisionImageMetadata$Builder r0 = p040o.FirebaseVisionImageMetadata.Builder.this
                    p040o.FirebaseVisionImageMetadata.Builder.write(r0)
                    o.FirebaseVisionImageMetadata$Builder r0 = p040o.FirebaseVisionImageMetadata.Builder.this
                    o.RegularImmutableBiMap r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                    o.access$2300$write r1 = p040o.access$2300.write.JUST_DISMISS
                    o.access$2200 r0 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r8, (p040o.access$2300.write) r1)
                    boolean r1 = r8 instanceof com.scb.phone.domain.errors.RetrofitException
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L_0x0077
                    com.scb.phone.domain.errors.RetrofitException r8 = (com.scb.phone.domain.errors.RetrofitException) r8
                    o.ILocationSourceDelegate r8 = r8.IconCompatParcelizer
                    if (r8 == 0) goto L_0x0077
                    o.ILocationSourceDelegate$zza r8 = r8.write
                    java.lang.String r1 = "retrofitException"
                    p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r8, (java.lang.String) r1)
                    java.lang.String r8 = r8.IconCompatParcelizer
                    java.lang.String r1 = "3003"
                    boolean r8 = p040o.GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(r1, r8, r3)
                    if (r8 == 0) goto L_0x0077
                    o.FirebaseVisionImageMetadata$Builder r8 = p040o.FirebaseVisionImageMetadata.Builder.this
                    o.unmodifiableBiMap r1 = r8.MediaBrowserCompat$ItemReceiver
                    o.FirebaseVisionImageMetadata$Builder r4 = p040o.FirebaseVisionImageMetadata.Builder.this
                    o.FirebaseApp$BackgroundStateChangeListener r4 = r4.MediaBrowserCompat$SearchResultReceiver
                    java.lang.String r5 = "errorDisplay"
                    p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r5)
                    java.lang.String r6 = "selectedTransactionsDto"
                    p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r6)
                    p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
                    r5 = 0
                    o.getOptions r1 = r1.MediaBrowserCompat$ItemReceiver(r5, r4)
                    o.lambda$new$0 r4 = p040o.lambda$new$0.IconCompatParcelizer()
                    java.lang.String r5 = r0.MediaBrowserCompat$ItemReceiver
                    r4.IconCompatParcelizer = r5
                    java.lang.String r5 = r0.IconCompatParcelizer
                    r4.read = r5
                    r1.write = r4
                    r8.IconCompatParcelizer = r1
                    o.FirebaseVisionImageMetadata$Builder r8 = p040o.FirebaseVisionImageMetadata.Builder.this
                    o.FirebaseVisionImageMetadata$Builder$write$IconCompatParcelizer r1 = new o.FirebaseVisionImageMetadata$Builder$write$IconCompatParcelizer
                    r1.<init>(r7)
                    o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                    T r4 = r8.RatingCompat
                    if (r4 == 0) goto L_0x006d
                    r4 = r3
                    goto L_0x006e
                L_0x006d:
                    r4 = r2
                L_0x006e:
                    if (r4 == 0) goto L_0x0075
                    T r8 = r8.RatingCompat
                    r1.IconCompatParcelizer(r8)
                L_0x0075:
                    r8 = r3
                    goto L_0x0078
                L_0x0077:
                    r8 = r2
                L_0x0078:
                    if (r8 != 0) goto L_0x008f
                    o.FirebaseVisionImageMetadata$Builder r8 = p040o.FirebaseVisionImageMetadata.Builder.this
                    o.FirebaseVisionImageMetadata$Builder$write$MediaBrowserCompat$ItemReceiver r1 = new o.FirebaseVisionImageMetadata$Builder$write$MediaBrowserCompat$ItemReceiver
                    r1.<init>(r0)
                    o.writeUInt64NoTag$IconCompatParcelizer r1 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r1
                    T r0 = r8.RatingCompat
                    if (r0 == 0) goto L_0x0088
                    r2 = r3
                L_0x0088:
                    if (r2 == 0) goto L_0x008f
                    T r8 = r8.RatingCompat
                    r1.IconCompatParcelizer(r8)
                L_0x008f:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.FirebaseVisionImageMetadata.Builder.write.onError(java.lang.Throwable):void");
            }
        }

        public final void onDestroy() {
            getLocalPort getlocalport = this.read;
            if (!getlocalport.MediaBrowserCompat$MediaItem.isDisposed()) {
                getlocalport.MediaBrowserCompat$MediaItem.dispose();
            }
            super.onDestroy();
        }

        /* renamed from: o.FirebaseVisionImageMetadata$Builder$read */
        public static final class read implements getAllowReturnTransitionOverlap {
            private final /* synthetic */ ShapeTrimPathParser MediaBrowserCompat$CustomActionResultReceiver;

            private read() {
            }

            public /* synthetic */ read(ShapeTrimPathParser shapeTrimPathParser) {
                this.MediaBrowserCompat$CustomActionResultReceiver = shapeTrimPathParser;
            }

            public final boolean write(Object obj) {
                ShapeTrimPathParser shapeTrimPathParser = this.MediaBrowserCompat$CustomActionResultReceiver;
                return shapeTrimPathParser.MediaBrowserCompat$CustomActionResultReceiver != null && shapeTrimPathParser.MediaBrowserCompat$CustomActionResultReceiver.equals(((zzrt) obj).read);
            }
        }

        public static final /* synthetic */ void write(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }
    }

    @HmlPinActivity
    public FirebaseVisionImageMetadata(RegularImmutableBiMap regularImmutableBiMap, transformValues transformvalues, safeGet safeget, getLocalPort getlocalport, unmodifiableEntry unmodifiableentry, C10827Iterators.C353712 r6, transformEntries transformentries) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$MediaItem = transformvalues;
        this.write = safeget;
        this.MediaBrowserCompat$ItemReceiver = getlocalport;
        this.MediaDescriptionCompat = unmodifiableentry;
        this.read = r6;
        this.IconCompatParcelizer = transformentries;
    }

    static /* synthetic */ void write(normalize normalize, List list, Extractor extractor) {
        extractor.aj_();
        extractor.IconCompatParcelizer(normalize, list);
    }

    public void onDestroy() {
        getLocalPort getlocalport = this.MediaBrowserCompat$ItemReceiver;
        if (!getlocalport.MediaBrowserCompat$MediaItem.isDisposed()) {
            getlocalport.MediaBrowserCompat$MediaItem.dispose();
        }
        this.read.IconCompatParcelizer();
        super.onDestroy();
    }
}
