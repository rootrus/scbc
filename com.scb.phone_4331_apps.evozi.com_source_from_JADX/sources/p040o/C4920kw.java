package p040o;

import p040o.QuickExtractor;

/* renamed from: o.kw */
public class C4920kw extends writeUInt64NoTag<QuickExtractor.C12502> {
    public getBaseAddress IconCompatParcelizer;
    public int MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final hasEmbeddedIPv4ClientAddress MediaBrowserCompat$SearchResultReceiver;
    public setExecution read;
    public final split write;

    @HmlPinActivity
    public C4920kw(split split, hasEmbeddedIPv4ClientAddress hasembeddedipv4clientaddress, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = split;
        this.MediaBrowserCompat$SearchResultReceiver = hasembeddedipv4clientaddress;
    }

    /* renamed from: o.kw$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(C4920kw kwVar, byte b) {
            this();
        }

        public final void onComplete() {
            C4920kw.read(C4920kw.this);
        }

        public final void onError(Throwable th) {
            C4920kw.IconCompatParcelizer(C4920kw.this);
            C4920kw kwVar = C4920kw.this;
            C10026jp jpVar = new C10026jp(this, th);
            if (kwVar.RatingCompat != null) {
                jpVar.IconCompatParcelizer(kwVar.RatingCompat);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4920kw.this.read.MediaBrowserCompat$ItemReceiver = new AutoValue_CrashlyticsReport_Session_Event_Application_Execution(C4920kw.this.IconCompatParcelizer.write, C4920kw.this.IconCompatParcelizer.IconCompatParcelizer, C4920kw.this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver, C4920kw.this.IconCompatParcelizer.read);
            C4920kw kwVar = C4920kw.this;
            C10027js jsVar = new C10027js(this);
            if (kwVar.RatingCompat != null) {
                jsVar.IconCompatParcelizer(kwVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(C4920kw kwVar) {
        if (kwVar.RatingCompat != null) {
            kwVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4920kw kwVar) {
        if (kwVar.RatingCompat != null) {
            kwVar.RatingCompat.aj_();
        }
    }
}
