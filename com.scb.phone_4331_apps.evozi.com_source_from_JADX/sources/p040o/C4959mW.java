package p040o;

import p040o.access$2300;
import p040o.getDocumentFramingError;

/* renamed from: o.mW */
public class C4959mW extends writeUInt64NoTag<getDocumentFramingError.IconCompatParcelizer> {
    /* access modifiers changed from: private */
    public final TldPatterns IconCompatParcelizer;
    public attachInfo MediaBrowserCompat$ItemReceiver;
    public boolean read;
    public setUuidFromUtf8Bytes write;

    @HmlPinActivity
    public C4959mW(RegularImmutableBiMap regularImmutableBiMap, TldPatterns tldPatterns, attachInfo attachinfo) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = attachinfo;
        this.IconCompatParcelizer = tldPatterns;
    }

    /* renamed from: o.mW$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<onEnterAmbient> {
        private write() {
        }

        public /* synthetic */ write(C4959mW mWVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            onEnterAmbient onenterambient = (onEnterAmbient) obj;
            boolean z = true;
            if (C4959mW.this.RatingCompat != null) {
                C4959mW mWVar = C4959mW.this;
                C10055mV mVVar = new C10055mV(this, onenterambient);
                if (mWVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    mVVar.IconCompatParcelizer(mWVar.RatingCompat);
                }
                C4959mW.IconCompatParcelizer(C4959mW.this);
            }
            boolean unused = C4959mW.this.read = false;
        }

        public final void onError(Throwable th) {
            if (!C4959mW.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                boolean z = true;
                if (C4959mW.this.RatingCompat != null) {
                    C4959mW mWVar = C4959mW.this;
                    mWVar.MediaBrowserCompat$ItemReceiver(mWVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                    C4959mW mWVar2 = C4959mW.this;
                    C10089ol olVar = new C10089ol(this, th);
                    if (mWVar2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        olVar.IconCompatParcelizer(mWVar2.RatingCompat);
                    }
                    boolean unused = C4959mW.this.read = false;
                }
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4959mW mWVar) {
        if (mWVar.RatingCompat != null) {
            mWVar.RatingCompat.aj_();
        }
    }
}
