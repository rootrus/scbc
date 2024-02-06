package p040o;

/* renamed from: o.getKtdxXML */
public class getKtdxXML extends writeUInt64NoTag<C1157x4c69105f> {
    public read IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final newListMultimap MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final unmodifiableMultimap MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final unmodifiableEntries MediaMetadataCompat;
    public getSessionFileProvider read;
    public final icon write;

    @HmlPinActivity
    public getKtdxXML(icon icon, newListMultimap newlistmultimap, unmodifiableMultimap unmodifiablemultimap, unmodifiableEntries unmodifiableentries, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = icon;
        this.MediaBrowserCompat$ItemReceiver = newlistmultimap;
        this.MediaBrowserCompat$MediaItem = unmodifiablemultimap;
        this.MediaMetadataCompat = unmodifiableentries;
    }

    /* renamed from: o.getKtdxXML$1 */
    public static /* synthetic */ class C46011 {
        public static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.getShortName[] r0 = p040o.getShortName.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.getShortName r1 = p040o.getShortName.TYPE_SAVING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getShortName r1 = p040o.getShortName.TYPE_CURRENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getShortName r1 = p040o.getShortName.TYPE_FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getShortName r1 = p040o.getShortName.TYPE_LONG_TERM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getKtdxXML.C46011.<clinit>():void");
        }
    }

    /* renamed from: o.getKtdxXML$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getActiveLevelIndex> {
        private getShortName read;

        public final /* synthetic */ void onNext(Object obj) {
            getSessionFileProvider getsessionfileprovider;
            getActiveLevelIndex getactivelevelindex = (getActiveLevelIndex) obj;
            if (getactivelevelindex instanceof getLevels) {
                newListMultimap unused = getKtdxXML.this.MediaBrowserCompat$ItemReceiver;
                getsessionfileprovider = newListMultimap.MediaBrowserCompat$ItemReceiver(this.read, (getLevels) getactivelevelindex);
            } else if (getactivelevelindex instanceof isDraggable) {
                getsessionfileprovider = getKtdxXML.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver((isDraggable) getactivelevelindex);
            } else {
                getsessionfileprovider = getactivelevelindex instanceof setDraggable ? getKtdxXML.this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver((setDraggable) getactivelevelindex) : null;
            }
            if (getsessionfileprovider != null) {
                getSessionFileProvider unused2 = getKtdxXML.this.read = getsessionfileprovider;
                getKtdxXML getktdxxml = getKtdxXML.this;
                MrzExtractor mrzExtractor = new MrzExtractor(getsessionfileprovider);
                boolean z = true;
                if (getktdxxml.RatingCompat != null) {
                    mrzExtractor.IconCompatParcelizer(getktdxxml.RatingCompat);
                }
                getKtdxXML getktdxxml2 = getKtdxXML.this;
                ReferenceFeature referenceFeature = new ReferenceFeature(getsessionfileprovider);
                if (getktdxxml2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    referenceFeature.IconCompatParcelizer(getktdxxml2.RatingCompat);
                }
            }
        }

        public read(getShortName getshortname) {
            this.read = getshortname;
        }

        public final void onError(Throwable th) {
            boolean unused = getKtdxXML.this.MediaBrowserCompat$SearchResultReceiver(th);
            boolean z = true;
            if (getKtdxXML.this.RatingCompat != null) {
                getKtdxXML getktdxxml = getKtdxXML.this;
                SQLiteWrapper sQLiteWrapper = SQLiteWrapper.IconCompatParcelizer;
                if (getktdxxml.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    sQLiteWrapper.IconCompatParcelizer(getktdxxml.RatingCompat);
                }
            }
        }
    }
}
