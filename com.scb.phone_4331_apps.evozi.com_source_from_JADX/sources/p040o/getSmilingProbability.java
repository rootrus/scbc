package p040o;

/* renamed from: o.getSmilingProbability */
public class getSmilingProbability extends writeUInt64NoTag<ConventionBasedJsonIdDeserializer> {
    /* access modifiers changed from: private */
    public final uniqueIndex IconCompatParcelizer;
    public getLocalPort read;

    @HmlPinActivity
    public getSmilingProbability(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, uniqueIndex uniqueindex) {
        super(regularImmutableBiMap);
        this.read = getlocalport;
        this.IconCompatParcelizer = uniqueindex;
    }

    public static String read(Double d) {
        return String.format("%1$,.2f", new Object[]{d});
    }

    /* renamed from: o.getSmilingProbability$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getPayload> {
        private read() {
        }

        public /* synthetic */ read(getSmilingProbability getsmilingprobability, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getSmilingProbability getsmilingprobability = getSmilingProbability.this;
            setFilePath setfilepath = new setFilePath(this, (getPayload) obj);
            if (getsmilingprobability.RatingCompat != null) {
                setfilepath.IconCompatParcelizer(getsmilingprobability.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            getSmilingProbability.write(getSmilingProbability.this);
            getSmilingProbability getsmilingprobability = getSmilingProbability.this;
            FirebaseModelDownloadConditions firebaseModelDownloadConditions = new FirebaseModelDownloadConditions(this, th);
            if (getsmilingprobability.RatingCompat != null) {
                firebaseModelDownloadConditions.IconCompatParcelizer(getsmilingprobability.RatingCompat);
            }
        }

        public final void onComplete() {
            getSmilingProbability.MediaBrowserCompat$ItemReceiver(getSmilingProbability.this);
        }
    }

    static /* synthetic */ void write(getSmilingProbability getsmilingprobability) {
        if (getsmilingprobability.RatingCompat != null) {
            getsmilingprobability.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getSmilingProbability getsmilingprobability) {
        if (getsmilingprobability.RatingCompat != null) {
            getsmilingprobability.RatingCompat.aj_();
        }
    }
}
