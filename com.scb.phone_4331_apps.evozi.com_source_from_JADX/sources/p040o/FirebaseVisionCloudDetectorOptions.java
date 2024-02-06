package p040o;

/* renamed from: o.FirebaseVisionCloudDetectorOptions */
public class FirebaseVisionCloudDetectorOptions extends writeUInt64NoTag<newCreditCardParameters> {
    public String IconCompatParcelizer;
    public getLocalPort MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public putAllImpl MediaDescriptionCompat;
    public notifyBackgroundStateChangeListeners MediaMetadataCompat;
    public String read;
    public String write;

    /* renamed from: o.FirebaseVisionCloudDetectorOptions$Builder */
    public class Builder extends writeUInt64NoTag<C7509tS> {
        /* access modifiers changed from: private */
        public final synchronizedBiMap IconCompatParcelizer;
        public toLongArray MediaBrowserCompat$ItemReceiver;
        public AbstractMultimap read;
        public final getLocalPort write;

        @HmlPinActivity
        public Builder(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, synchronizedBiMap synchronizedbimap, AbstractMultimap abstractMultimap, toLongArray tolongarray) {
            super(regularImmutableBiMap);
            this.write = getlocalport;
            this.IconCompatParcelizer = synchronizedbimap;
            this.read = abstractMultimap;
            this.MediaBrowserCompat$ItemReceiver = tolongarray;
        }

        /* renamed from: o.FirebaseVisionCloudDetectorOptions$Builder$IconCompatParcelizer */
        public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<C5449version> {
            private IconCompatParcelizer() {
            }

            public /* synthetic */ IconCompatParcelizer(Builder builder, byte b) {
                this();
            }

            public final /* synthetic */ void onNext(Object obj) {
                Builder builder = Builder.this;
                InstallationResponse installationResponse = new InstallationResponse(this, (C5449version) obj);
                if (builder.RatingCompat != null) {
                    installationResponse.IconCompatParcelizer(builder.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                Builder.MediaBrowserCompat$CustomActionResultReceiver(Builder.this);
                Builder builder = Builder.this;
                TokenResult tokenResult = new TokenResult(this, th);
                if (builder.RatingCompat != null) {
                    tokenResult.IconCompatParcelizer(builder.RatingCompat);
                }
            }

            public final void onComplete() {
                Builder.write(Builder.this);
                super.onComplete();
            }
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void write(Builder builder) {
            if (builder.RatingCompat != null) {
                builder.RatingCompat.aj_();
            }
        }
    }

    @HmlPinActivity
    public FirebaseVisionCloudDetectorOptions(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, putAllImpl putallimpl) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = getlocalport;
        this.MediaDescriptionCompat = putallimpl;
    }

    static /* synthetic */ void IconCompatParcelizer(FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        if (firebaseVisionCloudDetectorOptions.RatingCompat != null) {
            firebaseVisionCloudDetectorOptions.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        if (firebaseVisionCloudDetectorOptions.RatingCompat != null) {
            firebaseVisionCloudDetectorOptions.RatingCompat.aj_();
        }
    }
}
