package p040o;

/* renamed from: o.kC */
public class C4889kC extends writeUInt64NoTag<getMicr> {
    public boolean IconCompatParcelizer;
    public final transparency MediaBrowserCompat$ItemReceiver;
    public getBaseAddress MediaBrowserCompat$MediaItem;
    public split MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final hasEmbeddedIPv4ClientAddress f2882x50fd9e4a;
    public boolean MediaDescriptionCompat = true;
    final isUriInetAddress MediaMetadataCompat;
    /* access modifiers changed from: private */
    public endCap MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final isCompatIPv4Address MediaSessionCompat$Token;
    public boolean read;
    public setExecution write;

    @HmlPinActivity
    public C4889kC(endCap endcap, split split, transparency transparency, isCompatIPv4Address iscompatipv4address, isTeredoAddress isteredoaddress, isUriInetAddress isuriinetaddress, hasEmbeddedIPv4ClientAddress hasembeddedipv4clientaddress, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaSessionCompat$ResultReceiverWrapper = endcap;
        this.MediaBrowserCompat$SearchResultReceiver = split;
        this.MediaBrowserCompat$ItemReceiver = transparency;
        this.MediaSessionCompat$Token = iscompatipv4address;
        this.MediaMetadataCompat = isuriinetaddress;
        this.f2882x50fd9e4a = hasembeddedipv4clientaddress;
    }

    static String MediaBrowserCompat$CustomActionResultReceiver(String str, int i) {
        String str2 = i != 0 ? i != 1 ? "FastEasyPromptPay" : "FastEasyPromptPayCID" : "FastEasyPromptPayMOB";
        if ("en".equalsIgnoreCase(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("_EN");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append("_TH");
        return sb2.toString();
    }

    /* renamed from: o.kC$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(C4889kC kCVar, byte b) {
            this();
        }

        public final void onComplete() {
            C4889kC.read(C4889kC.this);
        }

        public final void onError(Throwable th) {
            C4889kC.MediaBrowserCompat$CustomActionResultReceiver(C4889kC.this);
            C4889kC kCVar = C4889kC.this;
            C4877jq jqVar = new C4877jq(this, th);
            boolean z = true;
            if (kCVar.RatingCompat != null) {
                jqVar.IconCompatParcelizer(kCVar.RatingCompat);
            }
            C4889kC kCVar2 = C4889kC.this;
            C4888kB kBVar = new C4888kB(this);
            if (kCVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                kBVar.IconCompatParcelizer(kCVar2.RatingCompat);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4889kC.this.write.RatingCompat = C4889kC.this.IconCompatParcelizer;
            C4889kC kCVar = C4889kC.this;
            C4875jn jnVar = new C4875jn(this);
            if (kCVar.RatingCompat != null) {
                jnVar.IconCompatParcelizer(kCVar.RatingCompat);
            }
        }
    }

    /* renamed from: o.kC$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzsj> {
        private read() {
        }

        public /* synthetic */ read(C4889kC kCVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            C4889kC.MediaDescriptionCompat(C4889kC.this);
            C4889kC kCVar = C4889kC.this;
            C4878jr jrVar = new C4878jr(this, th);
            if (kCVar.RatingCompat != null) {
                jrVar.IconCompatParcelizer(kCVar.RatingCompat);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4889kC.RatingCompat(C4889kC.this);
            C4889kC kCVar = C4889kC.this;
            C4873jl jlVar = new C4873jl(this);
            if (kCVar.RatingCompat != null) {
                jlVar.IconCompatParcelizer(kCVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(C4889kC kCVar) {
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4889kC kCVar) {
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(C4889kC kCVar) {
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void RatingCompat(C4889kC kCVar) {
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$QueueItem(C4889kC kCVar) {
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void ParcelableVolumeInfo(C4889kC kCVar) {
        if (kCVar.RatingCompat != null) {
            kCVar.RatingCompat.aj_();
        }
    }
}
