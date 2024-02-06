package p040o;

import p040o.C10178z;
import p040o.LargestFaceFocusingProcessor;
import p040o.OcrEngine;
import p040o.getCountryLong;
import p040o.writeUInt64NoTag;

/* renamed from: o.KtaJsonExactionHelper */
public abstract class KtaJsonExactionHelper<T extends getCountryLong> extends OcrEngine.C37012<T> {
    private boolean MediaBrowserCompat$SearchResultReceiver = false;
    private boolean MediaDescriptionCompat;
    public boolean MediaMetadataCompat = false;
    protected boolean write;

    public abstract void write();

    public KtaJsonExactionHelper(RegularImmutableBiMap regularImmutableBiMap, LargestFaceFocusingProcessor.Builder builder, PersonalLimitAdapter$LimitCustomViewHolder_ViewBinding personalLimitAdapter$LimitCustomViewHolder_ViewBinding) {
        new writeUInt64NoTag<T>(regularImmutableBiMap, builder, personalLimitAdapter$LimitCustomViewHolder_ViewBinding) {
            public String IconCompatParcelizer;
            public String MediaBrowserCompat$ItemReceiver;
            public String read;
            private final LargestFaceFocusingProcessor.Builder write;

            {
                this.write = r2;
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void write(java.lang.String r6, boolean r7) {
                /*
                    r5 = this;
                    java.lang.String r0 = p040o.LargestFaceFocusingProcessor.Builder.IconCompatParcelizer(r6)
                    r5.IconCompatParcelizer = r0
                    r5.read = r6
                    int r6 = r0.hashCode()
                    r1 = 3
                    r2 = 2
                    r3 = 0
                    r4 = 1
                    switch(r6) {
                        case -1421427592: goto L_0x0032;
                        case -545008926: goto L_0x0028;
                        case 439422131: goto L_0x001e;
                        case 1528355512: goto L_0x0014;
                        default: goto L_0x0013;
                    }
                L_0x0013:
                    goto L_0x003c
                L_0x0014:
                    java.lang.String r6 = "VALID_ATM_CARD"
                    boolean r6 = r0.equals(r6)
                    if (r6 == 0) goto L_0x003c
                    r6 = r3
                    goto L_0x003d
                L_0x001e:
                    java.lang.String r6 = "VALID_CREDIT_CARD"
                    boolean r6 = r0.equals(r6)
                    if (r6 == 0) goto L_0x003c
                    r6 = r4
                    goto L_0x003d
                L_0x0028:
                    java.lang.String r6 = "EMPTY_CARD"
                    boolean r6 = r0.equals(r6)
                    if (r6 == 0) goto L_0x003c
                    r6 = r1
                    goto L_0x003d
                L_0x0032:
                    java.lang.String r6 = "INVALID_CARD"
                    boolean r6 = r0.equals(r6)
                    if (r6 == 0) goto L_0x003c
                    r6 = r2
                    goto L_0x003d
                L_0x003c:
                    r6 = -1
                L_0x003d:
                    if (r6 == 0) goto L_0x0087
                    if (r6 == r4) goto L_0x0075
                    if (r6 == r2) goto L_0x0054
                    if (r6 != r1) goto L_0x0098
                    o.getGlareDetected r6 = p040o.getGlareDetected.write
                    T r7 = r5.RatingCompat
                    if (r7 == 0) goto L_0x004c
                    r3 = r4
                L_0x004c:
                    if (r3 == 0) goto L_0x0053
                    T r7 = r5.RatingCompat
                    r6.IconCompatParcelizer(r7)
                L_0x0053:
                    return
                L_0x0054:
                    o.OcrEngine$1 r6 = p040o.OcrEngine.C97901.write
                    T r0 = r5.RatingCompat
                    if (r0 == 0) goto L_0x005c
                    r0 = r4
                    goto L_0x005d
                L_0x005c:
                    r0 = r3
                L_0x005d:
                    if (r0 == 0) goto L_0x0064
                    T r0 = r5.RatingCompat
                    r6.IconCompatParcelizer(r0)
                L_0x0064:
                    if (r7 == 0) goto L_0x0098
                    o.isQuickAnalysisEnabled r6 = p040o.isQuickAnalysisEnabled.read
                    T r7 = r5.RatingCompat
                    if (r7 == 0) goto L_0x006d
                    r3 = r4
                L_0x006d:
                    if (r3 == 0) goto L_0x0074
                    T r7 = r5.RatingCompat
                    r6.IconCompatParcelizer(r7)
                L_0x0074:
                    return
                L_0x0075:
                    o.IpLib$ProcessingProgressClient r6 = new o.IpLib$ProcessingProgressClient
                    r6.<init>(r7)
                    T r7 = r5.RatingCompat
                    if (r7 == 0) goto L_0x007f
                    r3 = r4
                L_0x007f:
                    if (r3 == 0) goto L_0x0086
                    T r7 = r5.RatingCompat
                    r6.IconCompatParcelizer(r7)
                L_0x0086:
                    return
                L_0x0087:
                    o.ProcessPageOutRep r6 = new o.ProcessPageOutRep
                    r6.<init>(r7)
                    T r7 = r5.RatingCompat
                    if (r7 == 0) goto L_0x0091
                    r3 = r4
                L_0x0091:
                    if (r3 == 0) goto L_0x0098
                    T r7 = r5.RatingCompat
                    r6.IconCompatParcelizer(r7)
                L_0x0098:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.OcrEngine.C37012.write(java.lang.String, boolean):void");
            }

            public void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                this.MediaBrowserCompat$ItemReceiver = str;
            }
        };
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.MediaMetadataCompat = z;
        C10178z.C547211 r2 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                KtaJsonExactionHelper.this.write((getCountryLong) obj);
            }
        };
        if (this.RatingCompat != null) {
            r2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = z;
        C10178z.C547211 r2 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                KtaJsonExactionHelper.this.write((getCountryLong) obj);
            }
        };
        if (this.RatingCompat != null) {
            r2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.write = true;
        this.MediaDescriptionCompat = false;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaDescriptionCompat = true;
        this.write = false;
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getCountryLong getcountrylong) {
        if (!this.MediaMetadataCompat) {
            return;
        }
        if (this.write) {
            getcountrylong.MediaDescriptionCompat();
        } else if (this.MediaDescriptionCompat) {
            getcountrylong.MediaMetadataCompat();
        }
    }

    public final /* synthetic */ void IconCompatParcelizer() {
        if (this.MediaMetadataCompat && this.MediaBrowserCompat$SearchResultReceiver) {
            write();
        }
    }

    public final /* synthetic */ void write(getCountryLong getcountrylong) {
        getcountrylong.MediaBrowserCompat$CustomActionResultReceiver(this.MediaMetadataCompat && this.MediaBrowserCompat$SearchResultReceiver);
    }
}
