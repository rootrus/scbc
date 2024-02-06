package p040o;

/* renamed from: o.shouldSkipField */
public class shouldSkipField extends writeUInt64NoTag<getDateOfBirth> {
    public getSupportedCipherSuites IconCompatParcelizer;
    /* access modifiers changed from: private */
    public getICheckDeserializerKta write;

    @HmlPinActivity
    public shouldSkipField(getSupportedCipherSuites getsupportedciphersuites, RegularImmutableBiMap regularImmutableBiMap, getICheckDeserializerKta geticheckdeserializerkta) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = getsupportedciphersuites;
        this.write = geticheckdeserializerkta;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(readStringList readstringlist, int i, String str, String str2, getDateOfBirth getdateofbirth) {
        if (readstringlist == readStringList.OPR) {
            getdateofbirth.MediaBrowserCompat$CustomActionResultReceiver(i, readstringlist, str);
        } else {
            getdateofbirth.IconCompatParcelizer(i, str2, readstringlist);
        }
    }

    /* renamed from: o.shouldSkipField$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<C5111open> {
        public write() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            C5111open open = (C5111open) obj;
            boolean z = true;
            if (open.read == null || open.read.isEmpty()) {
                shouldSkipField shouldskipfield = shouldSkipField.this;
                FirebaseInitProvider firebaseInitProvider = FirebaseInitProvider.read;
                if (shouldskipfield.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    firebaseInitProvider.IconCompatParcelizer(shouldskipfield.RatingCompat);
                    return;
                }
                return;
            }
            getICheckDeserializerKta unused = shouldSkipField.this.write;
            shouldSkipField shouldskipfield2 = shouldSkipField.this;
            ExclusionStrategy exclusionStrategy = new ExclusionStrategy(open);
            if (shouldskipfield2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                exclusionStrategy.IconCompatParcelizer(shouldskipfield2.RatingCompat);
            }
        }

        public final void onComplete() {
            shouldSkipField.write(shouldSkipField.this);
        }

        public final void onError(Throwable th) {
            if (!shouldSkipField.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                shouldSkipField.MediaBrowserCompat$CustomActionResultReceiver(shouldSkipField.this);
                shouldSkipField shouldskipfield = shouldSkipField.this;
                FirebaseInitProvider firebaseInitProvider = FirebaseInitProvider.read;
                if (shouldskipfield.RatingCompat != null) {
                    firebaseInitProvider.IconCompatParcelizer(shouldskipfield.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void write(shouldSkipField shouldskipfield) {
        if (shouldskipfield.RatingCompat != null) {
            shouldskipfield.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(shouldSkipField shouldskipfield) {
        if (shouldskipfield.RatingCompat != null) {
            shouldskipfield.RatingCompat.aj_();
        }
    }
}
