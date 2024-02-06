package p040o;

/* renamed from: o.fk */
public class C4429fk extends writeUInt64NoTag<getBelowMinRearImageSize$MediaBrowserCompat$ItemReceiver> {
    public getBuffer IconCompatParcelizer;
    public C5092on MediaBrowserCompat$ItemReceiver;
    public final appendTo MediaBrowserCompat$SearchResultReceiver;
    public skipNulls MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public final join MediaMetadataCompat;
    public int read;
    public String write;

    @HmlPinActivity
    public C4429fk(C5092on onVar, skipNulls skipnulls, join join, appendTo appendto, getBuffer getbuffer, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = onVar;
        this.MediaDescriptionCompat = skipnulls;
        this.MediaMetadataCompat = join;
        this.MediaBrowserCompat$SearchResultReceiver = appendto;
        this.IconCompatParcelizer = getbuffer;
    }

    /* renamed from: o.fk$IconCompatParcelizer */
    public class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzum> {
        final String IconCompatParcelizer;

        public final /* synthetic */ void onNext(Object obj) {
            zzum zzum = (zzum) obj;
            int unused = C4429fk.this.read = zzum.MediaBrowserCompat$CustomActionResultReceiver;
            C4429fk fkVar = C4429fk.this;
            C4411fX fXVar = new C4411fX(this, zzum);
            if (fkVar.RatingCompat != null) {
                fXVar.IconCompatParcelizer(fkVar.RatingCompat);
            }
        }

        public IconCompatParcelizer(String str) {
            this.IconCompatParcelizer = str;
        }
    }

    /* renamed from: o.fk$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        final getClsId read;

        public read(getClsId getclsid) {
            this.read = getclsid;
        }

        public final /* synthetic */ void onNext(Object obj) {
            this.read.MediaDescriptionCompat = null;
            C4429fk fkVar = C4429fk.this;
            C9937fa faVar = new C9937fa(this);
            if (fkVar.RatingCompat != null) {
                faVar.IconCompatParcelizer(fkVar.RatingCompat);
            }
        }
    }
}
