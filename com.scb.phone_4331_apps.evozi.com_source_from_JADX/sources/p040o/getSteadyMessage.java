package p040o;

import java.util.List;
import p040o.C7039x355e6121;
import p040o.Lists;
import p040o.zzxc;

/* renamed from: o.getSteadyMessage */
public class getSteadyMessage extends writeUInt64NoTag<getMicrAmount$MediaBrowserCompat$SearchResultReceiver> {
    private final C4359e_ IconCompatParcelizer;
    public final Lists.RandomAccessReverseList MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final getValueEquivalence MediaBrowserCompat$MediaItem;
    private final TileProvider MediaDescriptionCompat;
    private final endCap MediaMetadataCompat;
    public final setupWithViewPager read;
    public IconCompatParcelizer write;

    /* renamed from: o.getSteadyMessage$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        MUTUAL_FUND,
        SCBS_INVESTMENT,
        PURCHASE_BOND,
        DEBENTURE,
        ROBO_ADVISOR
    }

    @HmlPinActivity
    public getSteadyMessage(RegularImmutableBiMap regularImmutableBiMap, endCap endcap, TileProvider tileProvider, setupWithViewPager setupwithviewpager, C4359e_ e_Var, getValueEquivalence getvalueequivalence, Lists.RandomAccessReverseList randomAccessReverseList) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = endcap;
        this.MediaDescriptionCompat = tileProvider;
        this.read = setupwithviewpager;
        this.IconCompatParcelizer = e_Var;
        this.MediaBrowserCompat$MediaItem = getvalueequivalence;
        this.MediaBrowserCompat$ItemReceiver = randomAccessReverseList;
    }

    public final void read(final C7039x355e6121.read read2) {
        this.write = IconCompatParcelizer.PURCHASE_BOND;
        boolean z = true;
        if (read2 == C7039x355e6121.read.SCB) {
            setTutorialDismissMessage settutorialdismissmessage = new setTutorialDismissMessage(read2);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                settutorialdismissmessage.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.IconCompatParcelizer.IconCompatParcelizer(new createSegment(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.read()));
        this.IconCompatParcelizer.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzxc.zzd>() {
            public final /* synthetic */ void onNext(Object obj) {
                zzxc.zzd zzd = (zzxc.zzd) obj;
                getSteadyMessage.IconCompatParcelizer(getSteadyMessage.this);
                boolean z = true;
                if (!zzd.write.isEmpty()) {
                    getSteadyMessage getsteadymessage = getSteadyMessage.this;
                    setHoldParallelMessage setholdparallelmessage = new setHoldParallelMessage(this, zzd, read2);
                    if (getsteadymessage.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        setholdparallelmessage.IconCompatParcelizer(getsteadymessage.RatingCompat);
                        return;
                    }
                    return;
                }
                getSteadyMessage getsteadymessage2 = getSteadyMessage.this;
                DocumentBaseCaptureExperienceCriteriaHolder documentBaseCaptureExperienceCriteriaHolder = new DocumentBaseCaptureExperienceCriteriaHolder(read2);
                if (getsteadymessage2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    documentBaseCaptureExperienceCriteriaHolder.IconCompatParcelizer(getsteadymessage2.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                getSteadyMessage.MediaBrowserCompat$ItemReceiver(getSteadyMessage.this);
                getSteadyMessage getsteadymessage = getSteadyMessage.this;
                setRotateMessage setrotatemessage = new setRotateMessage(this, th);
                if (getsteadymessage.RatingCompat != null) {
                    setrotatemessage.IconCompatParcelizer(getsteadymessage.RatingCompat);
                }
            }
        });
    }

    public void onDestroy() {
        endCap endcap = this.MediaMetadataCompat;
        if (!endcap.MediaBrowserCompat$MediaItem.isDisposed()) {
            endcap.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.getSteadyMessage$5 */
    static /* synthetic */ class C46675 {
        static final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.getSteadyMessage$IconCompatParcelizer[] r0 = p040o.getSteadyMessage.IconCompatParcelizer.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$CustomActionResultReceiver = r0
                o.getSteadyMessage$IconCompatParcelizer r1 = p040o.getSteadyMessage.IconCompatParcelizer.MUTUAL_FUND     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getSteadyMessage$IconCompatParcelizer r1 = p040o.getSteadyMessage.IconCompatParcelizer.SCBS_INVESTMENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getSteadyMessage$IconCompatParcelizer r1 = p040o.getSteadyMessage.IconCompatParcelizer.DEBENTURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getSteadyMessage$IconCompatParcelizer r1 = p040o.getSteadyMessage.IconCompatParcelizer.ROBO_ADVISOR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getSteadyMessage.C46675.<clinit>():void");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        zzvf RatingCompat = this.MediaMetadataCompat.IconCompatParcelizer.RatingCompat();
        int i = C46675.MediaBrowserCompat$CustomActionResultReceiver[this.write.ordinal()];
        boolean z = false;
        if (i == 1) {
            List<zzrr> list = RatingCompat.write;
            if (list == null || list.isEmpty()) {
                setCapturedMessage setcapturedmessage = setCapturedMessage.IconCompatParcelizer;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setcapturedmessage.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            TileProvider tileProvider = this.MediaDescriptionCompat;
            tileProvider.read(tileProvider.read(), new setZoomInMessage(this), new setZoomOutMessage(this));
        } else if (i != 2) {
            if (i == 3) {
                getHoldSteadyDelay getholdsteadydelay = new getHoldSteadyDelay(this);
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getholdsteadydelay.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (i == 4) {
                setSteadyGuidanceFrameColor setsteadyguidanceframecolor = setSteadyGuidanceFrameColor.write;
                if (this.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setsteadyguidanceframecolor.IconCompatParcelizer(this.RatingCompat);
                }
            }
        } else if (RatingCompat.MediaMetadataCompat == null) {
            setHoldSteadyMessage setholdsteadymessage = setHoldSteadyMessage.read;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setholdsteadymessage.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (RatingCompat.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver) {
            setGuidanceFrameThickness setguidanceframethickness = setGuidanceFrameThickness.write;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setguidanceframethickness.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            setDocumentSampleImage setdocumentsampleimage = setDocumentSampleImage.MediaBrowserCompat$ItemReceiver;
            if (this.RatingCompat != null) {
                z = true;
            }
            if (z) {
                setdocumentsampleimage.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getSteadyMessage getsteadymessage) {
        if (getsteadymessage.RatingCompat != null) {
            getsteadymessage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getSteadyMessage getsteadymessage) {
        if (getsteadymessage.RatingCompat != null) {
            getsteadymessage.RatingCompat.aj_();
        }
    }
}
