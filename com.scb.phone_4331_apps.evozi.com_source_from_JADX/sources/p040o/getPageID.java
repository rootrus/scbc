package p040o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p040o.AppBarLayout;
import p040o.PhenotypeFlag;
import p040o.Serialization;
import p040o.getExtractionType;
import p040o.zzca;

/* renamed from: o.getPageID */
public abstract class getPageID<T extends getExtractionType> extends writeUInt64NoTag<T> {
    public final setTextColor AlertController$RecycleListView;
    public final AppBarLayout.ScrollingViewBehavior IconCompatParcelizer;
    public final onProviderInstallFailed Keep;
    final setExpandedTitleMargin MediaBrowserCompat$ItemReceiver;
    public final setScrimsShown MediaBrowserCompat$MediaItem;
    public final setExpandedTitleMarginStart MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    Map<String, String> f2846x50fd9e4a;
    public final setScrimAnimationDuration MediaDescriptionCompat;
    final Serialization.C37651 MediaMetadataCompat;
    List<getPageID$MediaBrowserCompat$ItemReceiver> MediaSessionCompat$QueueItem;
    List<getPageID$MediaBrowserCompat$ItemReceiver> MediaSessionCompat$ResultReceiverWrapper = new ArrayList();
    Map<String, String> MediaSessionCompat$Token;
    protected int ParcelableVolumeInfo = 0;
    private Boolean PlaybackStateCompat = Boolean.FALSE;
    public PhenotypeFlag.zza PlaybackStateCompat$CustomAction;
    Map<String, String> read;
    private String setHasDecor = "";
    protected final setCollapsedTitleTextColor write;

    /* access modifiers changed from: protected */
    public boolean read() {
        return true;
    }

    public getPageID(RegularImmutableBiMap regularImmutableBiMap, setExpandedTitleMargin setexpandedtitlemargin, setCollapsedTitleTextColor setcollapsedtitletextcolor, AppBarLayout.ScrollingViewBehavior scrollingViewBehavior, Serialization.C37651 r5, setTextColor settextcolor, onProviderInstallFailed onproviderinstallfailed, PhenotypeFlag.zza zza, setScrimAnimationDuration setscrimanimationduration, setExpandedTitleMarginStart setexpandedtitlemarginstart, setScrimsShown setscrimsshown) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = setexpandedtitlemargin;
        this.write = setcollapsedtitletextcolor;
        this.IconCompatParcelizer = scrollingViewBehavior;
        this.MediaMetadataCompat = r5;
        this.AlertController$RecycleListView = settextcolor;
        this.Keep = onproviderinstallfailed;
        this.PlaybackStateCompat$CustomAction = zza;
        this.MediaDescriptionCompat = setscrimanimationduration;
        this.MediaBrowserCompat$SearchResultReceiver = setexpandedtitlemarginstart;
        this.MediaBrowserCompat$MediaItem = setscrimsshown;
    }

    public final void read(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver, boolean z) {
        if (!z) {
            this.MediaSessionCompat$ResultReceiverWrapper.remove(getpageid_mediabrowsercompat_itemreceiver);
        } else if (!this.MediaSessionCompat$ResultReceiverWrapper.contains(getpageid_mediabrowsercompat_itemreceiver)) {
            this.MediaSessionCompat$ResultReceiverWrapper.add(getpageid_mediabrowsercompat_itemreceiver);
        }
    }

    public void onDestroy() {
        AppBarLayout.ScrollingViewBehavior scrollingViewBehavior = this.IconCompatParcelizer;
        if (!scrollingViewBehavior.MediaBrowserCompat$MediaItem.isDisposed()) {
            scrollingViewBehavior.MediaBrowserCompat$MediaItem.dispose();
        }
        setCollapsedTitleTextColor setcollapsedtitletextcolor = this.write;
        if (!setcollapsedtitletextcolor.MediaBrowserCompat$MediaItem.isDisposed()) {
            setcollapsedtitletextcolor.MediaBrowserCompat$MediaItem.dispose();
        }
        setExpandedTitleMargin setexpandedtitlemargin = this.MediaBrowserCompat$ItemReceiver;
        if (!setexpandedtitlemargin.MediaBrowserCompat$MediaItem.isDisposed()) {
            setexpandedtitlemargin.MediaBrowserCompat$MediaItem.dispose();
        }
        setScrimsShown setscrimsshown = this.MediaBrowserCompat$MediaItem;
        if (!setscrimsshown.MediaBrowserCompat$MediaItem.isDisposed()) {
            setscrimsshown.MediaBrowserCompat$MediaItem.dispose();
        }
        setScrimAnimationDuration setscrimanimationduration = this.MediaDescriptionCompat;
        if (!setscrimanimationduration.MediaBrowserCompat$MediaItem.isDisposed()) {
            setscrimanimationduration.MediaBrowserCompat$MediaItem.dispose();
        }
        setTextColor settextcolor = this.AlertController$RecycleListView;
        if (!settextcolor.MediaBrowserCompat$MediaItem.isDisposed()) {
            settextcolor.MediaBrowserCompat$MediaItem.dispose();
        }
        setExpandedTitleMarginStart setexpandedtitlemarginstart = this.MediaBrowserCompat$SearchResultReceiver;
        if (!setexpandedtitlemarginstart.MediaBrowserCompat$MediaItem.isDisposed()) {
            setexpandedtitlemarginstart.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(double d) {
        getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver = getPageID$MediaBrowserCompat$ItemReceiver.INCOMING;
        boolean z = false;
        boolean z2 = d >= ((double) this.ParcelableVolumeInfo);
        if (d == 0.0d) {
            z = true;
        }
        write(getpageid_mediabrowsercompat_itemreceiver, z2, z);
    }

    public final void write(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            DocumentDimensions documentDimensions = new DocumentDimensions(getpageid_mediabrowsercompat_itemreceiver);
            if (this.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                documentDimensions.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (z2) {
            TargetFrameCropType targetFrameCropType = new TargetFrameCropType(getpageid_mediabrowsercompat_itemreceiver);
            if (this.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                targetFrameCropType.IconCompatParcelizer(this.RatingCompat);
            }
        } else {
            ImageProcessorConfiguration imageProcessorConfiguration = new ImageProcessorConfiguration(getpageid_mediabrowsercompat_itemreceiver);
            if (this.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                imageProcessorConfiguration.IconCompatParcelizer(this.RatingCompat);
            }
        }
        read(getpageid_mediabrowsercompat_itemreceiver, z);
    }

    public final void write(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver, String str, int i, boolean z) {
        if (z) {
            getShortEdge getshortedge = new getShortEdge(getpageid_mediabrowsercompat_itemreceiver);
            if (this.RatingCompat != null) {
                getshortedge.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        read(getpageid_mediabrowsercompat_itemreceiver, str, i);
    }

    /* renamed from: o.getPageID$3 */
    static /* synthetic */ class C46253 {
        static final /* synthetic */ int[] write;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.getPageID$MediaBrowserCompat$ItemReceiver[] r0 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                write = r0
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x001d }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.FIRST_NAME_ENGLISH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.LAST_NAME_ENGLISH     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = write     // Catch:{ NoSuchFieldError -> 0x003e }
                o.getPageID$MediaBrowserCompat$ItemReceiver r1 = p040o.getPageID$MediaBrowserCompat$ItemReceiver.INCOMING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getPageID.C46253.<clinit>():void");
        }
    }

    public final void read(getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver, String str, int i) {
        int i2 = C46253.write[getpageid_mediabrowsercompat_itemreceiver.ordinal()];
        boolean z = true;
        if (i2 == 1 || i2 == 2) {
            write(getpageid_mediabrowsercompat_itemreceiver, IconCompatParcelizer(str, i, "^[\\u0E01-\\u0E39\\u0E40-\\u0E4C ]+$"), TextUtils.isEmpty(str));
        } else if (i2 == 3 || i2 == 4) {
            write(getpageid_mediabrowsercompat_itemreceiver, IconCompatParcelizer(str, i, "^[a-zA-Z .'-]+$"), TextUtils.isEmpty(str));
        } else if (i2 == 5) {
            if (getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str).doubleValue() < ((double) this.ParcelableVolumeInfo)) {
                z = false;
            }
            write(getpageid_mediabrowsercompat_itemreceiver, z, TextUtils.isEmpty(str));
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str) {
        if (!this.setHasDecor.equals(str)) {
            this.setHasDecor = str != null ? str : "";
            this.PlaybackStateCompat = Boolean.valueOf((str == null || str.length() != 10 || (CheckCaptureActivity.IconCompatParcelizer(str, "dd/MM/yyyy") == null && CheckCaptureActivity.IconCompatParcelizer(CheckCaptureActivity.read(str, "/"), "dd/MM/yyyy") == null)) ? false : true);
        }
        return this.PlaybackStateCompat.booleanValue();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        boolean read2 = read();
        boolean z = true;
        if (this.MediaSessionCompat$ResultReceiverWrapper.size() != this.MediaSessionCompat$QueueItem.size() || !read2) {
            for (getPageID$MediaBrowserCompat$ItemReceiver next : this.MediaSessionCompat$QueueItem) {
                if (!this.MediaSessionCompat$ResultReceiverWrapper.contains(next)) {
                    DeskewType deskewType = new DeskewType(next);
                    if (this.RatingCompat != null) {
                        deskewType.IconCompatParcelizer(this.RatingCompat);
                    }
                }
            }
            getFieldTypes getfieldtypes = getFieldTypes.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getfieldtypes.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        setRegionWidth setregionwidth = setRegionWidth.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            setregionwidth.IconCompatParcelizer(this.RatingCompat);
        }
    }

    private static boolean IconCompatParcelizer(String str, int i, String str2) {
        if (!(str != null && !str.trim().isEmpty() && str.length() <= i) || !str.matches(str2)) {
            return false;
        }
        return true;
    }

    protected static zzca.zzc.zza IconCompatParcelizer(setContentDescription setcontentdescription) {
        setContentDescription setcontentdescription2 = setcontentdescription;
        return new zzca.zzc.zza(setcontentdescription2.MediaSessionCompat$QueueItem, setcontentdescription2.f2935x50fd9e4a, setcontentdescription2.ParcelableVolumeInfo, setcontentdescription2.write, setcontentdescription2.MediaMetadataCompat, setcontentdescription2.MediaBrowserCompat$CustomActionResultReceiver, setcontentdescription2.MediaDescriptionCompat, setcontentdescription2.MediaBrowserCompat$SearchResultReceiver, setcontentdescription2.RatingCompat, setcontentdescription2.MediaSessionCompat$Token, (String) setcontentdescription2.MediaBrowserCompat$ItemReceiver.write, (String) setcontentdescription2.read.write, (String) setcontentdescription2.MediaBrowserCompat$MediaItem.write, (String) setcontentdescription2.MediaBrowserCompat$ItemReceiver.read, (String) setcontentdescription2.read.read, (String) setcontentdescription2.MediaBrowserCompat$MediaItem.read, setcontentdescription2.IconCompatParcelizer);
    }

    static String MediaBrowserCompat$CustomActionResultReceiver(Map<String, String> map, String str) {
        isSupportFragmentClass issupportfragmentclass;
        show show = new show(map.entrySet());
        show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new deleteDirectory(str)));
        if (show2.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        T t = issupportfragmentclass.MediaBrowserCompat$ItemReceiver(setMax.IconCompatParcelizer).IconCompatParcelizer;
        if (t == null) {
            t = "";
        }
        return (String) t;
    }

    public void MediaBrowserCompat$ItemReceiver(int i, String str, getPageID$MediaBrowserCompat$ItemReceiver getpageid_mediabrowsercompat_itemreceiver) {
        read(getpageid_mediabrowsercompat_itemreceiver, str != null || i > 0);
    }
}
