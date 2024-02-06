package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.PinCase;
import dagger.Lazy;
import java.util.List;
import p040o.AppStatistics;
import p040o.AppStatsDataStore;
import p040o.CustomConcurrentHashMap;
import p040o.GoogleMap;
import p040o.LinkedListMultimap;
import p040o.LogFileManager;
import p040o.MapDifference;
import p040o.access$2300;
import p040o.getUnknownKeys;
import p040o.zzmd;

/* renamed from: o.onExportAppStatsRowEvent */
public class onExportAppStatsRowEvent extends writeUInt64NoTag<getAverageSpotNoiseGroupingsPerSquareInch> {
    private C7514tY AlertController$RecycleListView;
    public infoWindowAnchor IconCompatParcelizer;
    private SharedPreferences Keep;
    public RttiJsonCheck_MembersInjector MediaBrowserCompat$ItemReceiver;
    public boolean MediaBrowserCompat$MediaItem;
    public final PinCase MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public LogFileManager.DirectoryProvider f2906x50fd9e4a;
    public boolean MediaDescriptionCompat;
    public String MediaMetadataCompat = "";
    public zzmd.zzm.zzb.zza MediaSessionCompat$QueueItem = zzmd.zzm.zzb.zza.INDIVIDUAL;
    final MapDifference.ValueDifference MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public Context MediaSessionCompat$Token;
    public boolean ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public boolean PlaybackStateCompat = false;
    private LinkedListMultimap.AsMapEntries.C35791.C35801 PlaybackStateCompat$CustomAction;
    public final snippet read;
    private boolean setHasDecor = false;
    public Lazy<RttiJsonCheck_MembersInjector> write;

    @HmlPinActivity
    public onExportAppStatsRowEvent(RegularImmutableBiMap regularImmutableBiMap, PinCase pinCase, MapDifference.ValueDifference valueDifference, snippet snippet, Context context, SharedPreferences sharedPreferences, Lazy<RttiJsonCheck_MembersInjector> lazy, infoWindowAnchor infowindowanchor, LinkedListMultimap.AsMapEntries.C35791.C35801 r9, C7514tY tYVar) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$SearchResultReceiver = pinCase;
        this.read = snippet;
        this.MediaSessionCompat$ResultReceiverWrapper = valueDifference;
        this.MediaSessionCompat$Token = context;
        this.Keep = sharedPreferences;
        this.write = lazy;
        this.IconCompatParcelizer = infowindowanchor;
        this.PlaybackStateCompat$CustomAction = r9;
        this.AlertController$RecycleListView = tYVar;
    }

    public final void read() {
        if (this.ParcelableVolumeInfo) {
            boolean z = true;
            if (this.MediaDescriptionCompat) {
                if (!this.f2906x50fd9e4a.MediaSessionCompat$QueueItem && this.f2906x50fd9e4a.read) {
                    getDsValueString getdsvaluestring = new getDsValueString(this);
                    if (this.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getdsvaluestring.IconCompatParcelizer(this.RatingCompat);
                        return;
                    }
                    return;
                }
            }
            AppStatsClientEventLogger appStatsClientEventLogger = AppStatsClientEventLogger.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                appStatsClientEventLogger.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public void MediaBrowserCompat$ItemReceiver(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.length() >= 6) {
            this.MediaMetadataCompat = str;
            if (z) {
                if (this.RatingCompat != null) {
                    this.RatingCompat.AlertController$RecycleListView();
                }
                infoWindowAnchor infowindowanchor = this.IconCompatParcelizer;
                infowindowanchor.MediaBrowserCompat$ItemReceiver(infowindowanchor.write(), new setDsValueDate(this));
                return;
            }
            MediaBrowserCompat$ItemReceiver();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.MediaBrowserCompat$SearchResultReceiver.write.write()) {
            PinCase pinCase = this.MediaBrowserCompat$SearchResultReceiver;
            this.MediaBrowserCompat$SearchResultReceiver.read(DebitCardResetOtpActivity.fromCallable(new tilt(pinCase, this.MediaMetadataCompat)).flatMap(new clickable(pinCase)), new getDsValueFloat(this), new C3977aO(this));
            return;
        }
        this.setHasDecor = true;
        read(false);
    }

    public final void write() {
        if (this.MediaBrowserCompat$ItemReceiver.read() && this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver.setPopupCallback()) {
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new KtaJsonCheck_MembersInjector() {
                public final void MediaBrowserCompat$CustomActionResultReceiver() {
                    onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                    getDsUniqueId getdsuniqueid = getDsUniqueId.IconCompatParcelizer;
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        getdsuniqueid.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    }
                }

                public final void IconCompatParcelizer() {
                    onExportAppStatsRowEvent.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
                    onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                    AppStatsDataStore.C3031a aVar = AppStatsDataStore.C3031a.write;
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        aVar.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    }
                }

                public final void MediaDescriptionCompat() {
                    onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                    boolean z = true;
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        onexportappstatsrowevent.RatingCompat.AlertController$RecycleListView();
                    }
                    PinCase pinCase = onexportappstatsrowevent.MediaBrowserCompat$SearchResultReceiver;
                    onexportappstatsrowevent.MediaBrowserCompat$SearchResultReceiver.read(pinCase.MediaBrowserCompat$CustomActionResultReceiver.read(new ForwardingIterator(pinCase.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver())), new getDsValueFloat(onexportappstatsrowevent), new C3977aO(onexportappstatsrowevent));
                    onExportAppStatsRowEvent onexportappstatsrowevent2 = onExportAppStatsRowEvent.this;
                    AppStatsDataStore.C3031a aVar = AppStatsDataStore.C3031a.write;
                    if (onexportappstatsrowevent2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        aVar.IconCompatParcelizer(onexportappstatsrowevent2.RatingCompat);
                    }
                }

                public final void MediaBrowserCompat$ItemReceiver() {
                    onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                    AppStatsDataStore.C3031a aVar = AppStatsDataStore.C3031a.write;
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        aVar.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    }
                }

                public final void write() {
                    onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                    isOpen isopen = isOpen.MediaBrowserCompat$CustomActionResultReceiver;
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        isopen.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    }
                }

                public final void read() {
                    boolean unused = onExportAppStatsRowEvent.this.PlaybackStateCompat = true;
                    onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                    AppStatsDaoField appStatsDaoField = AppStatsDaoField.write;
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        appStatsDaoField.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    }
                }
            });
        }
    }

    /* renamed from: o.onExportAppStatsRowEvent$IconCompatParcelizer */
    class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<GoogleMap.OnInfoWindowClickListener>> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(onExportAppStatsRowEvent onexportappstatsrowevent, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            boolean z = false;
            onExportAppStatsRowEvent.this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.write(false);
            onExportAppStatsRowEvent.write(onExportAppStatsRowEvent.this);
            access$2200 MediaBrowserCompat$ItemReceiver2 = onExportAppStatsRowEvent.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
            if (onExportAppStatsRowEvent.this.RatingCompat != null) {
                onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                setDbFieldType setdbfieldtype = new setDbFieldType(MediaBrowserCompat$ItemReceiver2);
                if (onexportappstatsrowevent.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    setdbfieldtype.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                }
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            onExportAppStatsRowEvent.IconCompatParcelizer(onExportAppStatsRowEvent.this);
            boolean z = true;
            if (onExportAppStatsRowEvent.this.RatingCompat != null) {
                onExportAppStatsRowEvent onexportappstatsrowevent = onExportAppStatsRowEvent.this;
                AppStatistics.C3024b bVar = AppStatistics.C3024b.read;
                if (onexportappstatsrowevent.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    bVar.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void write(onExportAppStatsRowEvent onexportappstatsrowevent) {
        if (onexportappstatsrowevent.RatingCompat != null) {
            onexportappstatsrowevent.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(onExportAppStatsRowEvent onexportappstatsrowevent) {
        if (onexportappstatsrowevent.RatingCompat != null) {
            onexportappstatsrowevent.RatingCompat.aj_();
        }
    }

    public static /* synthetic */ void read(onExportAppStatsRowEvent onexportappstatsrowevent, PlaceAutocomplete placeAutocomplete) {
        Boolean bool;
        if (onexportappstatsrowevent.Keep.getBoolean("com.scb.phone.pref.key.ENABLE_PUSH_NOTIFICATIONS", false) && !onexportappstatsrowevent.MediaSessionCompat$Token.getSharedPreferences("FCM_TOKEN", 0).getString("FCM_TOKEN", "").equals(onexportappstatsrowevent.MediaSessionCompat$Token.getSharedPreferences("FCM_LAST_UPDATE_TOKEN", 0).getString("FCM_LAST_UPDATE_TOKEN", ""))) {
            String string = onexportappstatsrowevent.Keep.getString("randomDeviceId", "");
            snippet snippet = onexportappstatsrowevent.read;
            CustomConcurrentHashMap.EntryFactory MediaBrowserCompat$CustomActionResultReceiver = CustomConcurrentHashMap.EntryFactory.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = string;
            MediaBrowserCompat$CustomActionResultReceiver.write = onexportappstatsrowevent.MediaSessionCompat$Token.getSharedPreferences("FCM_TOKEN", 0).getString("FCM_TOKEN", "");
            MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = "ANDROID";
            snippet.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver);
            onexportappstatsrowevent.read.IconCompatParcelizer(new C5096x41e4b15e(onexportappstatsrowevent, (byte) 0));
        }
        if (onexportappstatsrowevent.PlaybackStateCompat && Build.VERSION.SDK_INT >= 23) {
            onexportappstatsrowevent.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            onexportappstatsrowevent.PlaybackStateCompat = false;
        }
        onexportappstatsrowevent.MediaMetadataCompat = "";
        GoogleMap.OnMarkerDragListener onMarkerDragListener = placeAutocomplete.MediaBrowserCompat$ItemReceiver;
        if (onMarkerDragListener != null) {
            boolean z = true;
            if (onexportappstatsrowevent.MediaBrowserCompat$MediaItem) {
                getDsFieldType getdsfieldtype = new getDsFieldType(onMarkerDragListener);
                if (onexportappstatsrowevent.RatingCompat != null) {
                    getdsfieldtype.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                }
            }
            setDsValueInt setdsvalueint = new setDsValueInt(onMarkerDragListener);
            if (onexportappstatsrowevent.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setdsvalueint.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
            }
        }
        onexportappstatsrowevent.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer();
        onexportappstatsrowevent.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new IconCompatParcelizer(onexportappstatsrowevent, (byte) 0));
        infoWindowAnchor infowindowanchor = onexportappstatsrowevent.IconCompatParcelizer;
        zzrp MediaBrowserCompat$ItemReceiver2 = infowindowanchor.write.MediaBrowserCompat$ItemReceiver();
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            bool = MediaBrowserCompat$ItemReceiver2.read;
        } else {
            bool = null;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
            infowindowanchor.write.IconCompatParcelizer(new zzrp((Boolean) null, (Integer) null, 7));
        }
    }

    public static /* synthetic */ void read(onExportAppStatsRowEvent onexportappstatsrowevent, Throwable th) {
        Boolean bool;
        boolean z = true;
        if (onexportappstatsrowevent.RatingCompat != null) {
            if (onexportappstatsrowevent.RatingCompat != null) {
                onexportappstatsrowevent.RatingCompat.aj_();
            }
            if (th instanceof RetrofitException) {
                if (((RetrofitException) th).write == RetrofitException.read.SERVER_ERROR) {
                    onexportappstatsrowevent.IconCompatParcelizer.read();
                    zzrp MediaBrowserCompat$ItemReceiver2 = onexportappstatsrowevent.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver();
                    if (MediaBrowserCompat$ItemReceiver2 != null) {
                        bool = MediaBrowserCompat$ItemReceiver2.read;
                    } else {
                        bool = null;
                    }
                    if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
                        getDsFilePath getdsfilepath = new getDsFilePath(onexportappstatsrowevent);
                        if (onexportappstatsrowevent.RatingCompat != null) {
                            getdsfilepath.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                        }
                    }
                }
                LinkedListMultimap.AsMapEntries.C35791.C35801 r0 = onexportappstatsrowevent.PlaybackStateCompat$CustomAction;
                setDsFieldName setdsfieldname = setDsFieldName.write;
                AppStatsDataStore appStatsDataStore = AppStatsDataStore.IconCompatParcelizer;
                onGetStartedClick.write((Object) setdsfieldname, "onSuccess");
                onGetStartedClick.write((Object) appStatsDataStore, "onError");
                r0.IconCompatParcelizer(r0.IconCompatParcelizer, setdsfieldname, appStatsDataStore, new getUnknownKeys.write(new rank("PIN_LOGIN_PREAUTH")));
                getDsValueInt getdsvalueint = new getDsValueInt(onexportappstatsrowevent.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                if (onexportappstatsrowevent.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getdsvalueint.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                }
            }
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(onExportAppStatsRowEvent onexportappstatsrowevent) {
        boolean z = false;
        if (onexportappstatsrowevent.setHasDecor) {
            onexportappstatsrowevent.setHasDecor = false;
            onexportappstatsrowevent.MediaBrowserCompat$ItemReceiver(onexportappstatsrowevent.MediaMetadataCompat, false);
            return;
        }
        if (onexportappstatsrowevent.RatingCompat != null) {
            z = true;
        }
        if (z) {
            onexportappstatsrowevent.RatingCompat.aj_();
        }
    }

    public static /* synthetic */ void write(onExportAppStatsRowEvent onexportappstatsrowevent, Throwable th) {
        Boolean bool;
        boolean z = false;
        onexportappstatsrowevent.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.write(false);
        if (onexportappstatsrowevent.MediaBrowserCompat$CustomActionResultReceiver(th, false)) {
            if (onexportappstatsrowevent.RatingCompat != null) {
                upgrade upgrade = upgrade.write;
                if (onexportappstatsrowevent.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    upgrade.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        String str = "";
        onexportappstatsrowevent.MediaMetadataCompat = str;
        if (onexportappstatsrowevent.RatingCompat != null) {
            onexportappstatsrowevent.RatingCompat.aj_();
        }
        boolean z2 = th instanceof RetrofitException;
        if (z2) {
            try {
                String str2 = ((RetrofitException) th).IconCompatParcelizer.write.IconCompatParcelizer;
                onCheckBoxClick.read("Login error code: %s", str2);
                str = str2;
            } catch (Exception unused) {
            }
            if ("1036".equals(str)) {
                if (onexportappstatsrowevent.RatingCompat != null) {
                    AppStatistics.C3023a aVar = AppStatistics.C3023a.read;
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        aVar.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                        return;
                    }
                    return;
                }
                return;
            } else if ("3036".equals(str)) {
                AppStatistics.ThresholdType thresholdType = AppStatistics.ThresholdType.IconCompatParcelizer;
                if (onexportappstatsrowevent.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    thresholdType.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    return;
                }
                return;
            } else if ("1999".equals(str)) {
                onexportappstatsrowevent.IconCompatParcelizer.read();
                zzrp MediaBrowserCompat$ItemReceiver2 = onexportappstatsrowevent.IconCompatParcelizer.write.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    bool = MediaBrowserCompat$ItemReceiver2.read;
                } else {
                    bool = null;
                }
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) bool, (Object) Boolean.TRUE)) {
                    getDsFilePath getdsfilepath = new getDsFilePath(onexportappstatsrowevent);
                    if (onexportappstatsrowevent.RatingCompat != null) {
                        getdsfilepath.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    }
                }
            }
        }
        if (z2) {
            String str3 = onexportappstatsrowevent.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS).IconCompatParcelizer;
            if (onexportappstatsrowevent.RatingCompat != null) {
                getDsValueLong getdsvaluelong = new getDsValueLong(str3);
                if (onexportappstatsrowevent.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getdsvaluelong.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
                    return;
                }
                return;
            }
            return;
        }
        if (onexportappstatsrowevent.RatingCompat != null) {
            getDsFieldName getdsfieldname = getDsFieldName.IconCompatParcelizer;
            if (onexportappstatsrowevent.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getdsfieldname.IconCompatParcelizer(onexportappstatsrowevent.RatingCompat);
            }
        }
    }

    public final void read(boolean z) {
        if (z) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
        }
        this.MediaBrowserCompat$SearchResultReceiver.read(this.MediaBrowserCompat$SearchResultReceiver.write.read(new findSubsetIndex(this.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver())), new setDbFieldKeyType(this), new getDsValueDate(this));
    }
}
