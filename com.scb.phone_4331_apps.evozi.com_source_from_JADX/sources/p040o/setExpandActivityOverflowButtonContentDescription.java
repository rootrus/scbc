package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import p040o.setImageResource;

/* renamed from: o.setExpandActivityOverflowButtonContentDescription */
public class setExpandActivityOverflowButtonContentDescription extends setProvider {
    private static volatile setExpandActivityOverflowButtonContentDescription MediaBrowserCompat$ItemReceiver;
    public setProvider write = new setActivityChooserModel();

    /* renamed from: o.setExpandActivityOverflowButtonContentDescription$4 */
    public static final class C14854 implements Executor {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
        private int AlertController$RecycleListView;
        public setImageResource IconCompatParcelizer;
        public setImageResource MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public setImageResource MediaBrowserCompat$MediaItem;
        public int MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private boolean f2627x50fd9e4a;
        public float MediaDescriptionCompat;
        public setImageResource MediaMetadataCompat;
        private setImageResource MediaSessionCompat$QueueItem;
        private boolean MediaSessionCompat$ResultReceiverWrapper;
        private boolean MediaSessionCompat$Token;
        public int ParcelableVolumeInfo;
        public ArrayList<setImageResource> RatingCompat;
        public boolean read;
        private setImageResource setHasDecor;
        public setImageResource write;

        C14854() {
        }

        public final void execute(Runnable runnable) {
            setExpandActivityOverflowButtonContentDescription.read().write.read(runnable);
        }

        public C14854(setImageResource setimageresource, int i, boolean z) {
            this.MediaDescriptionCompat = BitmapDescriptorFactory.HUE_RED;
            this.MediaSessionCompat$Token = false;
            this.IconCompatParcelizer = setimageresource;
            this.AlertController$RecycleListView = i;
            this.MediaSessionCompat$Token = z;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            if (!this.MediaSessionCompat$ResultReceiverWrapper) {
                int i = this.AlertController$RecycleListView << 1;
                setImageResource setimageresource = this.IconCompatParcelizer;
                boolean z = false;
                setImageResource setimageresource2 = setimageresource;
                boolean z2 = false;
                while (!z2) {
                    this.MediaBrowserCompat$SearchResultReceiver++;
                    setImageResource setimageresource3 = null;
                    setimageresource.setTitle[this.AlertController$RecycleListView] = null;
                    setimageresource.setBackgroundResource[this.AlertController$RecycleListView] = null;
                    if (setimageresource.setTitleOptional != 8) {
                        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                            this.MediaBrowserCompat$CustomActionResultReceiver = setimageresource;
                        }
                        this.MediaBrowserCompat$MediaItem = setimageresource;
                        if (setimageresource.AppCompatDelegateImpl$ListMenuDecorView[this.AlertController$RecycleListView] == setImageResource.read.MATCH_CONSTRAINT && (setimageresource.ActionBarContainer[this.AlertController$RecycleListView] == 0 || setimageresource.ActionBarContainer[this.AlertController$RecycleListView] == 3 || setimageresource.ActionBarContainer[this.AlertController$RecycleListView] == 2)) {
                            this.ParcelableVolumeInfo++;
                            float f = setimageresource.setSubtitle[this.AlertController$RecycleListView];
                            if (f > BitmapDescriptorFactory.HUE_RED) {
                                this.MediaDescriptionCompat += setimageresource.setSubtitle[this.AlertController$RecycleListView];
                            }
                            int i2 = this.AlertController$RecycleListView;
                            if (setimageresource.setTitleOptional != 8 && setimageresource.AppCompatDelegateImpl$ListMenuDecorView[i2] == setImageResource.read.MATCH_CONSTRAINT && (setimageresource.ActionBarContainer[i2] == 0 || setimageresource.ActionBarContainer[i2] == 3)) {
                                if (f < BitmapDescriptorFactory.HUE_RED) {
                                    this.MediaBrowserCompat$ItemReceiver = true;
                                } else {
                                    this.f2627x50fd9e4a = true;
                                }
                                if (this.RatingCompat == null) {
                                    this.RatingCompat = new ArrayList<>();
                                }
                                this.RatingCompat.add(setimageresource);
                            }
                            if (this.MediaSessionCompat$QueueItem == null) {
                                this.MediaSessionCompat$QueueItem = setimageresource;
                            }
                            setImageResource setimageresource4 = this.setHasDecor;
                            if (setimageresource4 != null) {
                                setimageresource4.setBackgroundResource[this.AlertController$RecycleListView] = setimageresource;
                            }
                            this.setHasDecor = setimageresource;
                        }
                    }
                    if (setimageresource2 != setimageresource) {
                        setimageresource2.setTitle[this.AlertController$RecycleListView] = setimageresource;
                    }
                    setSupportImageTintList setsupportimagetintlist = setimageresource.setContentView[i + 1].RatingCompat;
                    if (setsupportimagetintlist != null) {
                        setImageResource setimageresource5 = setsupportimagetintlist.IconCompatParcelizer;
                        if (setimageresource5.setContentView[i].RatingCompat != null && setimageresource5.setContentView[i].RatingCompat.IconCompatParcelizer == setimageresource) {
                            setimageresource3 = setimageresource5;
                        }
                    }
                    if (setimageresource3 == null) {
                        z2 = true;
                        setimageresource3 = setimageresource;
                    }
                    setimageresource2 = setimageresource;
                    setimageresource = setimageresource3;
                }
                this.MediaMetadataCompat = setimageresource;
                if (this.AlertController$RecycleListView != 0 || !this.MediaSessionCompat$Token) {
                    this.write = this.IconCompatParcelizer;
                } else {
                    this.write = setimageresource;
                }
                if (this.f2627x50fd9e4a && this.MediaBrowserCompat$ItemReceiver) {
                    z = true;
                }
                this.read = z;
            }
            this.MediaSessionCompat$ResultReceiverWrapper = true;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|(3:57|58|60)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(53:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0079 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0083 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x008d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0097 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00f5 */
        static {
            /*
                o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
                r1 = 1
                o.BillerAdapter$ItemViewHolder_ViewBinding r2 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BillerAdapter$ItemViewHolder_ViewBinding r3 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r4 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x003e }
                o.BillerAdapter$ItemViewHolder_ViewBinding r6 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r7 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r8 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r7 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r7
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r8 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r7[r8] = r1     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                int[] r1 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x006f }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r7 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x006f }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r1[r7] = r0     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0079 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0083 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x008d }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0097 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00a1 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_MINUTE     // Catch:{ NoSuchFieldError -> 0x00a1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a1 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00a1 }
            L_0x00a1:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00ad }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.SECOND_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00b9 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_HOUR     // Catch:{ NoSuchFieldError -> 0x00b9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b9 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b9 }
            L_0x00b9:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00c5 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MINUTE_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00c5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c5 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c5 }
            L_0x00c5:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00d1 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00d1 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d1 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d1 }
            L_0x00d1:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00dd }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_AMPM     // Catch:{ NoSuchFieldError -> 0x00dd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00dd }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00dd }
            L_0x00dd:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00e9 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00f5 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.CLOCK_HOUR_OF_DAY     // Catch:{ NoSuchFieldError -> 0x00f5 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f5 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f5 }
            L_0x00f5:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0101 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.AMPM_OF_DAY     // Catch:{ NoSuchFieldError -> 0x0101 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0101 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0101 }
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setExpandActivityOverflowButtonContentDescription.C14854.<clinit>():void");
        }
    }

    /* renamed from: o.setExpandActivityOverflowButtonContentDescription$1 */
    public static final class C14841 implements Executor {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$Month;
        public final int[] IconCompatParcelizer;
        public List<setImageResource> MediaBrowserCompat$CustomActionResultReceiver;
        public boolean MediaBrowserCompat$ItemReceiver;
        public List<setImageResource> MediaBrowserCompat$MediaItem;
        public HashSet<setImageResource> MediaBrowserCompat$SearchResultReceiver;
        public HashSet<setImageResource> MediaDescriptionCompat;
        public List<setImageResource> RatingCompat;
        public List<setImageResource> read;
        public List<setImageResource> write;

        C14841() {
        }

        public final void execute(Runnable runnable) {
            setExpandActivityOverflowButtonContentDescription.read().write.IconCompatParcelizer(runnable);
        }

        public C14841(List<setImageResource> list, byte b) {
            this.MediaBrowserCompat$ItemReceiver = false;
            this.IconCompatParcelizer = new int[]{-1, -1};
            this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
            this.read = new ArrayList();
            this.MediaDescriptionCompat = new HashSet<>();
            this.MediaBrowserCompat$SearchResultReceiver = new HashSet<>();
            this.MediaBrowserCompat$MediaItem = new ArrayList();
            this.RatingCompat = new ArrayList();
            this.write = list;
        }

        public C14841(List<setImageResource> list) {
            this.MediaBrowserCompat$ItemReceiver = false;
            this.IconCompatParcelizer = new int[]{-1, -1};
            this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
            this.read = new ArrayList();
            this.MediaDescriptionCompat = new HashSet<>();
            this.MediaBrowserCompat$SearchResultReceiver = new HashSet<>();
            this.MediaBrowserCompat$MediaItem = new ArrayList();
            this.RatingCompat = new ArrayList();
            this.write = list;
            this.MediaBrowserCompat$ItemReceiver = true;
        }

        public void IconCompatParcelizer(ArrayList<setImageResource> arrayList, setImageResource setimageresource) {
            if (!setimageresource.PlaybackStateCompat$CustomAction) {
                arrayList.add(setimageresource);
                setimageresource.PlaybackStateCompat$CustomAction = true;
                if (!setimageresource.MediaMetadataCompat()) {
                    if (setimageresource instanceof setImageURI) {
                        setImageURI setimageuri = (setImageURI) setimageresource;
                        int i = setimageuri.ActionBarOverlayLayout;
                        for (int i2 = 0; i2 < i; i2++) {
                            IconCompatParcelizer(arrayList, setimageuri.setActionBarVisibilityCallback[i2]);
                        }
                    }
                    for (setSupportImageTintList setsupportimagetintlist : setimageresource.setContentView) {
                        setSupportImageTintList setsupportimagetintlist2 = setsupportimagetintlist.RatingCompat;
                        if (setsupportimagetintlist2 != null) {
                            setImageResource setimageresource2 = setsupportimagetintlist2.IconCompatParcelizer;
                            if (!(setsupportimagetintlist2 == null || setimageresource2 == setimageresource.AbsActionBarView)) {
                                IconCompatParcelizer(arrayList, setimageresource2);
                            }
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x0054  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void write(p040o.setImageResource r9) {
            /*
                r8 = this;
                boolean r0 = r9.setGroupDividerEnabled
                if (r0 == 0) goto L_0x010c
                boolean r0 = r9.MediaMetadataCompat()
                if (r0 == 0) goto L_0x000b
                return
            L_0x000b:
                o.setSupportImageTintList r0 = r9.setSplitBackground
                o.setSupportImageTintList r0 = r0.RatingCompat
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0015
                r0 = r1
                goto L_0x0016
            L_0x0015:
                r0 = r2
            L_0x0016:
                if (r0 == 0) goto L_0x001d
                o.setSupportImageTintList r3 = r9.setSplitBackground
                o.setSupportImageTintList r3 = r3.RatingCompat
                goto L_0x0021
            L_0x001d:
                o.setSupportImageTintList r3 = r9.AppCompatDialogFragment
                o.setSupportImageTintList r3 = r3.RatingCompat
            L_0x0021:
                r4 = 8
                if (r3 == 0) goto L_0x0051
                o.setImageResource r5 = r3.IconCompatParcelizer
                boolean r5 = r5.ListMenuItemView
                if (r5 != 0) goto L_0x0030
                o.setImageResource r5 = r3.IconCompatParcelizer
                r8.write(r5)
            L_0x0030:
                o.setSupportImageTintList$read r5 = r3.MediaBrowserCompat$SearchResultReceiver
                o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.RIGHT
                if (r5 != r6) goto L_0x0046
                o.setImageResource r5 = r3.IconCompatParcelizer
                int r5 = r5.setHasNonEmbeddedTabs
                o.setImageResource r3 = r3.IconCompatParcelizer
                int r6 = r3.setTitleOptional
                if (r6 != r4) goto L_0x0042
                r3 = r2
                goto L_0x0044
            L_0x0042:
                int r3 = r3.ActionBarContextView
            L_0x0044:
                int r5 = r5 + r3
                goto L_0x0052
            L_0x0046:
                o.setSupportImageTintList$read r5 = r3.MediaBrowserCompat$SearchResultReceiver
                o.setSupportImageTintList$read r6 = p040o.setSupportImageTintList.read.LEFT
                if (r5 != r6) goto L_0x0051
                o.setImageResource r3 = r3.IconCompatParcelizer
                int r5 = r3.setHasNonEmbeddedTabs
                goto L_0x0052
            L_0x0051:
                r5 = r2
            L_0x0052:
                if (r0 == 0) goto L_0x005c
                o.setSupportImageTintList r0 = r9.setSplitBackground
                int r0 = r0.read()
                int r5 = r5 - r0
                goto L_0x006c
            L_0x005c:
                o.setSupportImageTintList r0 = r9.AppCompatDialogFragment
                int r0 = r0.read()
                int r3 = r9.setTitleOptional
                if (r3 != r4) goto L_0x0068
                r3 = r2
                goto L_0x006a
            L_0x0068:
                int r3 = r9.ActionBarContextView
            L_0x006a:
                int r0 = r0 + r3
                int r5 = r5 + r0
            L_0x006c:
                int r0 = r9.setTitleOptional
                if (r0 != r4) goto L_0x0072
                r0 = r2
                goto L_0x0074
            L_0x0072:
                int r0 = r9.ActionBarContextView
            L_0x0074:
                int r0 = r5 - r0
                r9.MediaBrowserCompat$CustomActionResultReceiver(r0, r5)
                o.setSupportImageTintList r0 = r9.read
                o.setSupportImageTintList r0 = r0.RatingCompat
                if (r0 == 0) goto L_0x00a3
                o.setSupportImageTintList r0 = r9.read
                o.setSupportImageTintList r0 = r0.RatingCompat
                o.setImageResource r2 = r0.IconCompatParcelizer
                boolean r2 = r2.ListMenuItemView
                if (r2 != 0) goto L_0x008e
                o.setImageResource r2 = r0.IconCompatParcelizer
                r8.write(r2)
            L_0x008e:
                o.setImageResource r2 = r0.IconCompatParcelizer
                int r2 = r2.setActionBarHideOffset
                o.setImageResource r0 = r0.IconCompatParcelizer
                int r0 = r0.MediaBrowserCompat$ItemReceiver
                int r2 = r2 + r0
                int r0 = r9.MediaBrowserCompat$ItemReceiver
                int r2 = r2 - r0
                int r0 = r9.PlaybackStateCompat
                int r0 = r0 + r2
                r9.MediaBrowserCompat$ItemReceiver(r2, r0)
                r9.ListMenuItemView = r1
                return
            L_0x00a3:
                o.setSupportImageTintList r0 = r9.MediaBrowserCompat$MediaItem
                o.setSupportImageTintList r0 = r0.RatingCompat
                if (r0 == 0) goto L_0x00ab
                r0 = r1
                goto L_0x00ac
            L_0x00ab:
                r0 = r2
            L_0x00ac:
                if (r0 == 0) goto L_0x00b3
                o.setSupportImageTintList r3 = r9.MediaBrowserCompat$MediaItem
                o.setSupportImageTintList r3 = r3.RatingCompat
                goto L_0x00b7
            L_0x00b3:
                o.setSupportImageTintList r3 = r9.setPrimaryBackground
                o.setSupportImageTintList r3 = r3.RatingCompat
            L_0x00b7:
                if (r3 == 0) goto L_0x00e4
                o.setImageResource r6 = r3.IconCompatParcelizer
                boolean r6 = r6.ListMenuItemView
                if (r6 != 0) goto L_0x00c4
                o.setImageResource r6 = r3.IconCompatParcelizer
                r8.write(r6)
            L_0x00c4:
                o.setSupportImageTintList$read r6 = r3.MediaBrowserCompat$SearchResultReceiver
                o.setSupportImageTintList$read r7 = p040o.setSupportImageTintList.read.BOTTOM
                if (r6 != r7) goto L_0x00da
                o.setImageResource r5 = r3.IconCompatParcelizer
                int r5 = r5.setActionBarHideOffset
                o.setImageResource r3 = r3.IconCompatParcelizer
                int r6 = r3.setTitleOptional
                if (r6 != r4) goto L_0x00d6
                r3 = r2
                goto L_0x00d8
            L_0x00d6:
                int r3 = r3.PlaybackStateCompat
            L_0x00d8:
                int r5 = r5 + r3
                goto L_0x00e4
            L_0x00da:
                o.setSupportImageTintList$read r6 = r3.MediaBrowserCompat$SearchResultReceiver
                o.setSupportImageTintList$read r7 = p040o.setSupportImageTintList.read.TOP
                if (r6 != r7) goto L_0x00e4
                o.setImageResource r3 = r3.IconCompatParcelizer
                int r5 = r3.setActionBarHideOffset
            L_0x00e4:
                if (r0 == 0) goto L_0x00ee
                o.setSupportImageTintList r0 = r9.MediaBrowserCompat$MediaItem
                int r0 = r0.read()
                int r5 = r5 - r0
                goto L_0x00fe
            L_0x00ee:
                o.setSupportImageTintList r0 = r9.setPrimaryBackground
                int r0 = r0.read()
                int r3 = r9.setTitleOptional
                if (r3 != r4) goto L_0x00fa
                r3 = r2
                goto L_0x00fc
            L_0x00fa:
                int r3 = r9.PlaybackStateCompat
            L_0x00fc:
                int r0 = r0 + r3
                int r5 = r5 + r0
            L_0x00fe:
                int r0 = r9.setTitleOptional
                if (r0 != r4) goto L_0x0103
                goto L_0x0105
            L_0x0103:
                int r2 = r9.PlaybackStateCompat
            L_0x0105:
                int r0 = r5 - r2
                r9.MediaBrowserCompat$ItemReceiver(r0, r5)
                r9.ListMenuItemView = r1
            L_0x010c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setExpandActivityOverflowButtonContentDescription.C14841.write(o.setImageResource):void");
        }

        public final void read() {
            int size = this.RatingCompat.size();
            for (int i = 0; i < size; i++) {
                write(this.RatingCompat.get(i));
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.PrepaidTransactionAdapter$ChildViewHolder[] r0 = p040o.PrepaidTransactionAdapter$ChildViewHolder.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$Month = r0
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.FEBRUARY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x001d }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.APRIL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.JUNE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.SEPTEMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x003e }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.NOVEMBER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.JANUARY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.MARCH     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.MAY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x006c }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.JULY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.AUGUST     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.OCTOBER     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$org$threeten$bp$Month     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.PrepaidTransactionAdapter$ChildViewHolder r1 = p040o.PrepaidTransactionAdapter$ChildViewHolder.DECEMBER     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.setExpandActivityOverflowButtonContentDescription.C14841.<clinit>():void");
        }
    }

    private setExpandActivityOverflowButtonContentDescription() {
    }

    public static setExpandActivityOverflowButtonContentDescription read() {
        if (MediaBrowserCompat$ItemReceiver != null) {
            return MediaBrowserCompat$ItemReceiver;
        }
        synchronized (setExpandActivityOverflowButtonContentDescription.class) {
            if (MediaBrowserCompat$ItemReceiver == null) {
                MediaBrowserCompat$ItemReceiver = new setExpandActivityOverflowButtonContentDescription();
            }
        }
        return MediaBrowserCompat$ItemReceiver;
    }

    public final void IconCompatParcelizer(Runnable runnable) {
        this.write.IconCompatParcelizer(runnable);
    }

    public final void read(Runnable runnable) {
        this.write.read(runnable);
    }

    public final boolean write() {
        return this.write.write();
    }
}
