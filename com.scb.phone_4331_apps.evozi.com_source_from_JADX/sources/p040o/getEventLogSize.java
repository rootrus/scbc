package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.view.activity.registration.C5708x2064d349;
import java.util.UUID;
import p040o.LogFileManager;
import p040o.PlaceEntity;
import p040o.Table;
import p040o.access$2300;
import p040o.zzmd;

/* renamed from: o.getEventLogSize */
public class getEventLogSize extends writeUInt64NoTag<getBelowMinRearImageSize> {
    public SharedPreferences AlertController$RecycleListView;
    public String IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem = true;
    public boolean MediaBrowserCompat$SearchResultReceiver = false;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public LogFileManager.DirectoryProvider f2831x50fd9e4a;
    public getEventLogSize$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    public infoWindowAnchor MediaMetadataCompat;
    public final setUserPropertyInternal MediaSessionCompat$QueueItem;
    boolean MediaSessionCompat$ResultReceiverWrapper = false;
    public final UrlTileProvider MediaSessionCompat$Token;
    final Table.Cell ParcelableVolumeInfo;
    private final getKernelIDDst PlaybackStateCompat;
    public boolean PlaybackStateCompat$CustomAction = false;
    public boolean read;
    private final snippet setHasDecor;
    public boolean write;

    @HmlPinActivity
    public getEventLogSize(RegularImmutableBiMap regularImmutableBiMap, setUserPropertyInternal setuserpropertyinternal, UrlTileProvider urlTileProvider, SharedPreferences sharedPreferences, snippet snippet, Table.Cell cell, getKernelIDDst getkerneliddst, infoWindowAnchor infowindowanchor) {
        super(regularImmutableBiMap);
        this.MediaSessionCompat$QueueItem = setuserpropertyinternal;
        this.MediaSessionCompat$Token = urlTileProvider;
        this.AlertController$RecycleListView = sharedPreferences;
        this.setHasDecor = snippet;
        this.ParcelableVolumeInfo = cell;
        this.PlaybackStateCompat = getkerneliddst;
        this.MediaMetadataCompat = infowindowanchor;
    }

    public final void MediaBrowserCompat$ItemReceiver(PlaceEntity.zzb zzb) {
        this.f2831x50fd9e4a = this.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver(zzb);
    }

    public final void write(String str, String str2, boolean z, boolean z2) {
        if (this.PlaybackStateCompat$CustomAction && this.MediaBrowserCompat$SearchResultReceiver) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
        }
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = z;
        this.write = z2;
        setUserPropertyInternal setuserpropertyinternal = this.MediaSessionCompat$QueueItem;
        this.MediaSessionCompat$QueueItem.write(setuserpropertyinternal.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(str, str2, z).map(new strokeWidth(setuserpropertyinternal, str)).flatMap(new Circle(setuserpropertyinternal, str)).flatMap(new visible(setuserpropertyinternal)), new IconCompatParcelizer(this, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z;
        boolean z2 = true;
        if (this.f2831x50fd9e4a == null) {
            capFinalizedReports capfinalizedreports = capFinalizedReports.MediaBrowserCompat$CustomActionResultReceiver;
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                capfinalizedreports.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        if (!this.MediaSessionCompat$QueueItem.AlertController$RecycleListView.MediaSessionCompat$QueueItem()) {
            LogFileManager.DirectoryProvider directoryProvider = this.f2831x50fd9e4a;
            if (!(directoryProvider == null || directoryProvider.MediaSessionCompat$ResultReceiverWrapper == null)) {
                switch (C45624.MediaBrowserCompat$ItemReceiver[this.f2831x50fd9e4a.MediaSessionCompat$ResultReceiverWrapper.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        z = true;
                        break;
                }
            }
            z = false;
            if (z) {
                this.MediaSessionCompat$QueueItem.AlertController$RecycleListView.setCheckable();
                CrashlyticsReportPersistence$$Lambda$2 crashlyticsReportPersistence$$Lambda$2 = new CrashlyticsReportPersistence$$Lambda$2(this);
                if (this.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    crashlyticsReportPersistence$$Lambda$2.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
        }
        LogFileManager.DirectoryProvider directoryProvider2 = this.f2831x50fd9e4a;
        if (directoryProvider2 != null && directoryProvider2.MediaSessionCompat$ResultReceiverWrapper != null) {
            switch (C45624.MediaBrowserCompat$ItemReceiver[this.f2831x50fd9e4a.MediaSessionCompat$ResultReceiverWrapper.ordinal()]) {
                case 1:
                    LogFileManager.DirectoryProvider directoryProvider3 = this.f2831x50fd9e4a;
                    if (!(this.RatingCompat != null)) {
                        return;
                    }
                    if (!directoryProvider3.MediaSessionCompat$QueueItem) {
                        if (this.MediaBrowserCompat$SearchResultReceiver) {
                            if (this.PlaybackStateCompat$CustomAction && this.MediaBrowserCompat$MediaItem) {
                                if (this.RatingCompat != null) {
                                    this.RatingCompat.aj_();
                                }
                            }
                            CrashlyticsReportPersistence$$Lambda$4 crashlyticsReportPersistence$$Lambda$4 = new CrashlyticsReportPersistence$$Lambda$4(directoryProvider3);
                            if (this.RatingCompat == null) {
                                z2 = false;
                            }
                            if (z2) {
                                crashlyticsReportPersistence$$Lambda$4.IconCompatParcelizer(this.RatingCompat);
                                return;
                            }
                            return;
                        } else if (directoryProvider3.read) {
                            sortAndCombineReportFiles sortandcombinereportfiles = new sortAndCombineReportFiles(directoryProvider3);
                            if (this.RatingCompat == null) {
                                z2 = false;
                            }
                            if (z2) {
                                sortandcombinereportfiles.IconCompatParcelizer(this.RatingCompat);
                                return;
                            }
                            return;
                        } else {
                            prepareDirectory preparedirectory = new prepareDirectory(directoryProvider3);
                            if (this.RatingCompat == null) {
                                z2 = false;
                            }
                            if (z2) {
                                preparedirectory.IconCompatParcelizer(this.RatingCompat);
                                return;
                            }
                            return;
                        }
                    } else if (write() == zzmd.zzm.zzb.zza.INDIVIDUAL) {
                        CrashlyticsReportPersistence$$Lambda$1 crashlyticsReportPersistence$$Lambda$1 = new CrashlyticsReportPersistence$$Lambda$1(directoryProvider3);
                        if (this.RatingCompat == null) {
                            z2 = false;
                        }
                        if (z2) {
                            crashlyticsReportPersistence$$Lambda$1.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    } else {
                        prepare prepare = new prepare(directoryProvider3);
                        if (this.RatingCompat == null) {
                            z2 = false;
                        }
                        if (z2) {
                            prepare.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    }
                case 2:
                case 3:
                case 4:
                case 5:
                    CrashlyticsReportPersistence$$Lambda$3 crashlyticsReportPersistence$$Lambda$3 = new CrashlyticsReportPersistence$$Lambda$3(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        crashlyticsReportPersistence$$Lambda$3.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 6:
                case 7:
                    copyFromUtf8 copyfromutf8 = new copyFromUtf8(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        copyfromutf8.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 8:
                    this.MediaSessionCompat$QueueItem.MediaSessionCompat$ResultReceiverWrapper.setContentHeight();
                    getFilesDirPath getfilesdirpath = new getFilesDirPath(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        getfilesdirpath.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 9:
                    loadFinalizedReports loadfinalizedreports = new loadFinalizedReports(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        loadfinalizedreports.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 10:
                    FileStore fileStore = new FileStore(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        fileStore.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 11:
                    this.MediaSessionCompat$QueueItem.RatingCompat.write("");
                    synthesizeNativeReportFile synthesizenativereportfile = new synthesizeNativeReportFile(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        synthesizenativereportfile.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 12:
                    getEventLogSize$MediaBrowserCompat$ItemReceiver geteventlogsize_mediabrowsercompat_itemreceiver = this.MediaDescriptionCompat;
                    if (geteventlogsize_mediabrowsercompat_itemreceiver == null) {
                        lambda$static$1 lambda_static_1 = lambda$static$1.write;
                        if (this.RatingCompat == null) {
                            z2 = false;
                        }
                        if (z2) {
                            lambda_static_1.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    } else if (geteventlogsize_mediabrowsercompat_itemreceiver.mo13825y_()) {
                        CrashlyticsReportPersistence$$Lambda$6 crashlyticsReportPersistence$$Lambda$6 = CrashlyticsReportPersistence$$Lambda$6.IconCompatParcelizer;
                        if (this.RatingCompat == null) {
                            z2 = false;
                        }
                        if (z2) {
                            crashlyticsReportPersistence$$Lambda$6.IconCompatParcelizer(this.RatingCompat);
                            return;
                        }
                        return;
                    } else {
                        this.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver();
                        this.MediaSessionCompat$QueueItem.IconCompatParcelizer(new read(this, (byte) 0));
                        return;
                    }
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    persistReport persistreport = new persistReport(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        persistreport.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 18:
                case 19:
                    trimEvents trimevents = new trimEvents(this);
                    if (this.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        trimevents.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                case 20:
                    read(this.f2831x50fd9e4a.MediaMetadataCompat, this.f2831x50fd9e4a.MediaBrowserCompat$ItemReceiver, (Runnable) new deleteFinalizedReport(this));
                    return;
                default:
                    read(this.f2831x50fd9e4a.MediaBrowserCompat$CustomActionResultReceiver, this.f2831x50fd9e4a.MediaBrowserCompat$ItemReceiver, access$2300.write.NAVIGATE_BACK);
                    return;
            }
        }
    }

    /* renamed from: o.getEventLogSize$4 */
    static /* synthetic */ class C45624 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|(3:41|42|44)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|44) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                o.PlaceAutocompleteFragment[] r0 = p040o.PlaceAutocompleteFragment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.DEVICE_IS_REGISTERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PROFILE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.DEVICE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PIN_LOCKED_MAX_TRIALS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x003e }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PRE_REGISTERED_WITH_ACTIVATION_PERIOD_EXPIRED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PIN_LOCKED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PIN_LOCKED_JURISTIC     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PRE_REGISTERED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x006c }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.APP_OUTDATED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0078 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.SYSTEM_MAINTENANCE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0084 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.NTB     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0090 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.NO_MOBILE_NUMBER_TO_REGISTER     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x009c }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PROFILE_IS_BLOCKED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00a8 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.DEVICE_IS_SWITCHED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00b4 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PROFILE_IS_UNSUBSCRIBE     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00c0 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.INVALID_CUSTOMER_TYPE_CODE     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00cc }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.EASY_APP_TERMS_AND_CONDITIONS_NOT_ACCEPTED     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00d8 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.NTB_PIN_DISABLED     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00e4 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.NTB_PIN_DISABLED_ALT     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00f0 }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PROFILE_IS_ON_HOLD     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x00fc }
                o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.SERVER_ERROR     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.getEventLogSize.C45624.<clinit>():void");
        }
    }

    public final zzmd.zzm.zzb.zza write() {
        return zzmd.zzm.zzb.zza.INDIVIDUAL.mode.equals(this.AlertController$RecycleListView.getString("USER_MODE", zzmd.zzm.zzb.zza.INDIVIDUAL.mode)) ? zzmd.zzm.zzb.zza.INDIVIDUAL : zzmd.zzm.zzb.zza.JURISTIC;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzmd.zzm.zzb.zza zza) {
        if (write() == zzmd.zzm.zzb.zza.JURISTIC && zza == zzmd.zzm.zzb.zza.INDIVIDUAL) {
            this.setHasDecor.IconCompatParcelizer.read();
        }
        this.AlertController$RecycleListView.edit().putString("USER_MODE", zza.mode).apply();
    }

    public final String write(Context context) {
        boolean z;
        String str;
        String string;
        if (!this.AlertController$RecycleListView.contains("randomDeviceId")) {
            Context applicationContext = context.getApplicationContext();
            SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("loginpref", 0);
            if (sharedPreferences == null || (string = sharedPreferences.getString("termLogin", "")) == null || !string.contains("true")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = IconCompatParcelizer(applicationContext);
                try {
                    applicationContext.getSharedPreferences("loginpref", 0).edit().remove("loginpref").apply();
                } catch (Exception e) {
                    onCheckBoxClick.write(e, "Error deleting the loginpref shared preference", new Object[0]);
                }
            } else {
                str = UUID.randomUUID().toString();
            }
            this.AlertController$RecycleListView.edit().putString("randomDeviceId", str).apply();
        }
        setUserPropertyInternal setuserpropertyinternal = this.MediaSessionCompat$QueueItem;
        setuserpropertyinternal.write.read();
        setuserpropertyinternal.MediaSessionCompat$ResultReceiverWrapper.setIcon();
        setuserpropertyinternal.MediaMetadataCompat.write();
        setuserpropertyinternal.MediaDescriptionCompat.read();
        setuserpropertyinternal.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        setuserpropertyinternal.IconCompatParcelizer.IconCompatParcelizer();
        setuserpropertyinternal.ParcelableVolumeInfo.MediaBrowserCompat$CustomActionResultReceiver((String) null);
        String string2 = this.AlertController$RecycleListView.getString("randomDeviceId", "");
        onCheckBoxClick.read("generatedDeviceId: %s", string2);
        return string2;
    }

    private static String IconCompatParcelizer(Context context) {
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            onCheckBoxClick.read("old androidId retrived: %s", string);
            return string;
        } catch (Exception e) {
            onCheckBoxClick.write(e, "Failed retrive old androidId", new Object[0]);
            return UUID.randomUUID().toString();
        }
    }

    public final boolean read() {
        this.MediaSessionCompat$QueueItem.setHasDecor.IconCompatParcelizer(true);
        if (this.f2831x50fd9e4a.f2754x50fd9e4a == null) {
            return false;
        }
        setUserPropertyInternal setuserpropertyinternal = this.MediaSessionCompat$QueueItem;
        boolean read2 = setuserpropertyinternal.setHasDecor.read(this.f2831x50fd9e4a.f2754x50fd9e4a.MediaBrowserCompat$ItemReceiver);
        if (!read2) {
            this.MediaSessionCompat$QueueItem.setHasDecor.IconCompatParcelizer(false);
        }
        return read2;
    }

    /* renamed from: o.getEventLogSize$IconCompatParcelizer */
    final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PlaceEntity.zzb> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(getEventLogSize geteventlogsize, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getEventLogSize geteventlogsize = getEventLogSize.this;
            geteventlogsize.f2831x50fd9e4a = geteventlogsize.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver((PlaceEntity.zzb) obj);
            getEventLogSize.this.MediaBrowserCompat$CustomActionResultReceiver();
            getEventLogSize.this.MediaSessionCompat$ResultReceiverWrapper = false;
        }

        public final void onError(Throwable th) {
            if (getEventLogSize.MediaDescriptionCompat(th)) {
                getEventLogSize geteventlogsize = getEventLogSize.this;
                writeFloatNoTag writefloatnotag = writeFloatNoTag.write;
                if (geteventlogsize.RatingCompat != null) {
                    writefloatnotag.IconCompatParcelizer(geteventlogsize.RatingCompat);
                    return;
                }
                return;
            }
            access$2200 MediaBrowserCompat$ItemReceiver2 = getEventLogSize.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            getEventLogSize geteventlogsize2 = getEventLogSize.this;
            geteventlogsize2.MediaBrowserCompat$ItemReceiver(geteventlogsize2.MediaBrowserCompat$CustomActionResultReceiver.write(getEventLogSize.this.MediaSessionCompat$QueueItem.read, MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, new finalizeReports(this)));
        }
    }

    /* renamed from: o.getEventLogSize$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<PlaceEntity.zzb> {
        private write() {
        }

        /* synthetic */ write(getEventLogSize geteventlogsize, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getEventLogSize geteventlogsize = getEventLogSize.this;
            geteventlogsize.f2831x50fd9e4a = geteventlogsize.ParcelableVolumeInfo.MediaBrowserCompat$ItemReceiver((PlaceEntity.zzb) obj);
            getEventLogSize.this.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final void onError(Throwable th) {
            if (getEventLogSize.MediaDescriptionCompat(th)) {
                getEventLogSize geteventlogsize = getEventLogSize.this;
                writeFloatNoTag writefloatnotag = writeFloatNoTag.write;
                if (geteventlogsize.RatingCompat != null) {
                    writefloatnotag.IconCompatParcelizer(geteventlogsize.RatingCompat);
                    return;
                }
                return;
            }
            getEventLogSize.this.MediaSessionCompat$QueueItem.write();
            access$2200 MediaBrowserCompat$ItemReceiver = getEventLogSize.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            getEventLogSize geteventlogsize2 = getEventLogSize.this;
            geteventlogsize2.MediaBrowserCompat$ItemReceiver(geteventlogsize2.MediaBrowserCompat$CustomActionResultReceiver.write(getEventLogSize.this.MediaSessionCompat$QueueItem.read, MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, new writeTextFile(this)));
        }
    }

    /* renamed from: o.getEventLogSize$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<C5708x2064d349> {
        private read() {
        }

        /* synthetic */ read(getEventLogSize geteventlogsize, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C5708x2064d349 registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver = (C5708x2064d349) obj;
            String str = registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            boolean z = false;
            if (!(str == null || str.length() == 0)) {
                getEventLogSize geteventlogsize = getEventLogSize.this;
                readTextFile readtextfile = new readTextFile(registrationDeadCardActivity$MediaBrowserCompat$CustomActionResultReceiver);
                if (geteventlogsize.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    readtextfile.IconCompatParcelizer(geteventlogsize.RatingCompat);
                    return;
                }
                return;
            }
            onError((Throwable) null);
        }

        public final void onError(Throwable th) {
            getEventLogSize geteventlogsize = getEventLogSize.this;
            deleteAllReports deleteallreports = deleteAllReports.MediaBrowserCompat$ItemReceiver;
            if (geteventlogsize.RatingCompat != null) {
                deleteallreports.IconCompatParcelizer(geteventlogsize.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    static /* synthetic */ boolean MediaDescriptionCompat(Throwable th) {
        if (!(th instanceof RetrofitException)) {
            return false;
        }
        RetrofitException retrofitException = (RetrofitException) th;
        if (retrofitException.IconCompatParcelizer == null || retrofitException.IconCompatParcelizer.write == null || !PlaceAutocompleteFragment.JAILBREAK.code.equals(retrofitException.IconCompatParcelizer.write.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public final void read(String str, String str2, boolean z, boolean z2) {
        boolean z3 = true;
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        this.MediaSessionCompat$QueueItem.f2964x50fd9e4a.read(0);
        if (this.PlaybackStateCompat$CustomAction && this.MediaBrowserCompat$SearchResultReceiver) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
        }
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.read = z;
        this.write = z2;
        this.PlaybackStateCompat.write.setUserId(str);
        this.MediaSessionCompat$QueueItem.RatingCompat.read(z2);
        if (z) {
            writeFloatNoTag writefloatnotag = writeFloatNoTag.write;
            if (this.RatingCompat == null) {
                z3 = false;
            }
            if (z3) {
                writefloatnotag.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        this.MediaSessionCompat$ResultReceiverWrapper = true;
        if (this.PlaybackStateCompat$CustomAction && this.MediaBrowserCompat$SearchResultReceiver) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
        }
        CrashlyticsReportPersistence$$Lambda$5 crashlyticsReportPersistence$$Lambda$5 = new CrashlyticsReportPersistence$$Lambda$5(str);
        if (this.RatingCompat == null) {
            z3 = false;
        }
        if (z3) {
            crashlyticsReportPersistence$$Lambda$5.IconCompatParcelizer(this.RatingCompat);
        }
        setUserPropertyInternal setuserpropertyinternal = this.MediaSessionCompat$QueueItem;
        if (setuserpropertyinternal.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver()) {
            setuserpropertyinternal.write();
        }
        this.MediaSessionCompat$QueueItem.write(DebitCardResetOtpActivity.zip(setuserpropertyinternal.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(str, str2, z).doOnError(new CircleOptions(setuserpropertyinternal)).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()), setuserpropertyinternal.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(str).doOnError(new strokeColor(setuserpropertyinternal)).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()), new radius(setuserpropertyinternal, str)).flatMap(new CustomCap(setuserpropertyinternal, str)).flatMap(new strokePattern(setuserpropertyinternal)), new write(this, (byte) 0));
    }

    public final void read(LogFileManager.DirectoryProvider directoryProvider, String str) {
        String str2 = directoryProvider.RatingCompat;
        if (str2 != null && str2.trim().length() > 0) {
            String lowerCase = str2.toLowerCase();
            boolean z = true;
            if (this.MediaSessionCompat$ResultReceiverWrapper) {
                this.MediaSessionCompat$ResultReceiverWrapper = false;
                persistUserIdForSession persistuseridforsession = new persistUserIdForSession(lowerCase);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    persistuseridforsession.IconCompatParcelizer(this.RatingCompat);
                }
            } else if (!str2.equalsIgnoreCase(str)) {
                FileStoreImpl fileStoreImpl = new FileStoreImpl(lowerCase);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    fileStoreImpl.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }
}
