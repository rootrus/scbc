package p040o;

/* renamed from: o.setSupportImageTintList */
public final class setSupportImageTintList {
    public final setImageResource IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver = 0;
    public setCheckMarkDrawable MediaBrowserCompat$ItemReceiver;
    public final read MediaBrowserCompat$SearchResultReceiver;
    private int MediaDescriptionCompat = -1;
    setSupportImageTintList$MediaBrowserCompat$ItemReceiver MediaMetadataCompat = setSupportImageTintList$MediaBrowserCompat$ItemReceiver.NONE;
    public setSupportImageTintList RatingCompat;
    int read;
    public AppCompatImageView write = new AppCompatImageView(this);

    /* renamed from: o.setSupportImageTintList$read */
    public enum read {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: o.setSupportImageTintList$write */
    public enum write {
        RELAXED,
        STRICT
    }

    public setSupportImageTintList(setImageResource setimageresource, read read2) {
        write write2 = write.RELAXED;
        this.read = 0;
        this.IconCompatParcelizer = setimageresource;
        this.MediaBrowserCompat$SearchResultReceiver = read2;
    }

    public final int read() {
        setSupportImageTintList setsupportimagetintlist;
        if (this.IconCompatParcelizer.setTitleOptional == 8) {
            return 0;
        }
        if (this.MediaDescriptionCompat < 0 || (setsupportimagetintlist = this.RatingCompat) == null || setsupportimagetintlist.IconCompatParcelizer.setTitleOptional != 8) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return this.MediaDescriptionCompat;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.RatingCompat = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = 0;
        this.MediaDescriptionCompat = -1;
        this.MediaMetadataCompat = setSupportImageTintList$MediaBrowserCompat$ItemReceiver.STRONG;
        this.read = 0;
        write write2 = write.RELAXED;
        this.write.MediaBrowserCompat$ItemReceiver();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        if ((r4.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver > 0) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006d, code lost:
        if (r10 != p040o.setSupportImageTintList.read.CENTER_Y) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0097, code lost:
        if (r10 != p040o.setSupportImageTintList.read.CENTER_Y) goto L_0x003c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x009c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean read(p040o.setSupportImageTintList r5, int r6, int r7, p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r8, int r9, boolean r10) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 != 0) goto L_0x0014
            r5 = 0
            r4.RatingCompat = r5
            r4.MediaBrowserCompat$CustomActionResultReceiver = r1
            r5 = -1
            r4.MediaDescriptionCompat = r5
            o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver r5 = p040o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver.NONE
            r4.MediaMetadataCompat = r5
            r5 = 2
            r4.read = r5
            return r0
        L_0x0014:
            if (r10 != 0) goto L_0x009d
            if (r5 != 0) goto L_0x001b
        L_0x0018:
            r2 = r1
            goto L_0x009a
        L_0x001b:
            o.setSupportImageTintList$read r10 = r5.MediaBrowserCompat$SearchResultReceiver
            o.setSupportImageTintList$read r2 = r4.MediaBrowserCompat$SearchResultReceiver
            if (r10 != r2) goto L_0x003f
            o.setSupportImageTintList$read r10 = p040o.setSupportImageTintList.read.BASELINE
            if (r2 != r10) goto L_0x003c
            o.setImageResource r10 = r5.IconCompatParcelizer
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            if (r10 <= 0) goto L_0x002d
            r10 = r0
            goto L_0x002e
        L_0x002d:
            r10 = r1
        L_0x002e:
            if (r10 == 0) goto L_0x0018
            o.setImageResource r10 = r4.IconCompatParcelizer
            int r10 = r10.MediaBrowserCompat$ItemReceiver
            if (r10 <= 0) goto L_0x0038
            r10 = r0
            goto L_0x0039
        L_0x0038:
            r10 = r1
        L_0x0039:
            if (r10 != 0) goto L_0x003c
            goto L_0x0018
        L_0x003c:
            r2 = r0
            goto L_0x009a
        L_0x003f:
            int[] r2 = p040o.setSupportImageTintList.C15492.MediaBrowserCompat$CustomActionResultReceiver
            o.setSupportImageTintList$read r3 = r4.MediaBrowserCompat$SearchResultReceiver
            int r3 = r3.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L_0x008d;
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                case 4: goto L_0x0058;
                case 5: goto L_0x0058;
                case 6: goto L_0x0018;
                case 7: goto L_0x0018;
                case 8: goto L_0x0018;
                case 9: goto L_0x0018;
                default: goto L_0x004c;
            }
        L_0x004c:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            o.setSupportImageTintList$read r6 = r4.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L_0x0058:
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.TOP
            if (r10 == r2) goto L_0x0062
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.BOTTOM
            if (r10 == r2) goto L_0x0062
            r2 = r1
            goto L_0x0063
        L_0x0062:
            r2 = r0
        L_0x0063:
            o.setImageResource r3 = r5.IconCompatParcelizer
            boolean r3 = r3 instanceof p040o.setImageBitmap
            if (r3 == 0) goto L_0x009a
            if (r2 != 0) goto L_0x003c
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.CENTER_Y
            if (r10 != r2) goto L_0x0018
            goto L_0x003c
        L_0x0070:
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.LEFT
            if (r10 == r2) goto L_0x007a
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.RIGHT
            if (r10 == r2) goto L_0x007a
            r2 = r1
            goto L_0x007b
        L_0x007a:
            r2 = r0
        L_0x007b:
            o.setImageResource r3 = r5.IconCompatParcelizer
            boolean r3 = r3 instanceof p040o.setImageBitmap
            if (r3 == 0) goto L_0x009a
            if (r2 != 0) goto L_0x008a
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.CENTER_X
            if (r10 != r2) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r0
        L_0x008b:
            r2 = r10
            goto L_0x009a
        L_0x008d:
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.BASELINE
            if (r10 == r2) goto L_0x0018
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.CENTER_X
            if (r10 == r2) goto L_0x0018
            o.setSupportImageTintList$read r2 = p040o.setSupportImageTintList.read.CENTER_Y
            if (r10 == r2) goto L_0x0018
            goto L_0x003c
        L_0x009a:
            if (r2 != 0) goto L_0x009d
            return r1
        L_0x009d:
            r4.RatingCompat = r5
            if (r6 <= 0) goto L_0x00a4
            r4.MediaBrowserCompat$CustomActionResultReceiver = r6
            goto L_0x00a6
        L_0x00a4:
            r4.MediaBrowserCompat$CustomActionResultReceiver = r1
        L_0x00a6:
            r4.MediaDescriptionCompat = r7
            r4.MediaMetadataCompat = r8
            r4.read = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setSupportImageTintList.read(o.setSupportImageTintList, int, int, o.setSupportImageTintList$MediaBrowserCompat$ItemReceiver, int, boolean):boolean");
    }

    /* renamed from: o.setSupportImageTintList$2 */
    static /* synthetic */ class C15492 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.setSupportImageTintList$read[] r0 = p040o.setSupportImageTintList.read.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x006c }
                o.setSupportImageTintList$read r1 = p040o.setSupportImageTintList.read.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setSupportImageTintList.C15492.<clinit>():void");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.MediaSessionCompat$Token);
        sb.append(":");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver.toString());
        return sb.toString();
    }
}
