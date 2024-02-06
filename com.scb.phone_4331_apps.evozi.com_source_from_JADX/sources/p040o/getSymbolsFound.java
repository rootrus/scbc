package p040o;

import java.util.List;
import java.util.UUID;
import p040o.CameraSource;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CustomConcurrentHashMap;
import p040o.Detector;
import p040o.Frame;
import p040o.MutableClassToInstanceMap;
import p040o.access$2300;
import p040o.zzdq;
import p040o.zzev;

/* renamed from: o.getSymbolsFound */
public class getSymbolsFound extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setGroupDividerEnabled> {
    public double IconCompatParcelizer;
    public convertMemInfoToBytes MediaBrowserCompat$ItemReceiver;
    private final setFabCradleMargin MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final MutableClassToInstanceMap.C36901 MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public List<zzev.zzb> MediaDescriptionCompat;
    private final CameraSource.zze MediaMetadataCompat;
    /* access modifiers changed from: package-private */
    public final Frame.Builder read;
    public final Detector.Detections write;

    @HmlPinActivity
    public getSymbolsFound(RegularImmutableBiMap regularImmutableBiMap, Detector.Detections detections, Frame.Builder builder, MutableClassToInstanceMap.C36901 r4, CameraSource.zze zze, setFabCradleMargin setfabcradlemargin) {
        super(regularImmutableBiMap);
        this.write = detections;
        this.read = builder;
        this.MediaBrowserCompat$SearchResultReceiver = r4;
        this.MediaMetadataCompat = zze;
        this.MediaBrowserCompat$MediaItem = setfabcradlemargin;
    }

    private zzev.zzb read(int i) {
        List<zzev.zzb> list = this.MediaDescriptionCompat;
        return (list == null || list.size() <= i) ? new zzev.zzb(new zzev$zzb$MediaBrowserCompat$CustomActionResultReceiver()) : this.MediaDescriptionCompat.get(i);
    }

    /* renamed from: o.getSymbolsFound$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzdq.zza> {
        private read() {
        }

        public /* synthetic */ read(getSymbolsFound getsymbolsfound, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzdq.zza zza = (zzdq.zza) obj;
            getSymbolsFound.IconCompatParcelizer(getSymbolsFound.this);
            boolean z = true;
            if (getSymbolsFound.this.RatingCompat != null) {
                List unused = getSymbolsFound.this.MediaDescriptionCompat = zza.MediaBrowserCompat$ItemReceiver;
                MutableClassToInstanceMap.C36901 unused2 = getSymbolsFound.this.MediaBrowserCompat$SearchResultReceiver;
                List<Out> MediaBrowserCompat$ItemReceiver = MutableClassToInstanceMap.C36901.MediaBrowserCompat$ItemReceiver(zza.MediaBrowserCompat$ItemReceiver, new getOrientationGuidance(this));
                if (MediaBrowserCompat$ItemReceiver.isEmpty()) {
                    getSymbolsFound.this.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.JUST_DISMISS);
                    return;
                }
                getSymbolsFound getsymbolsfound = getSymbolsFound.this;
                KfxGlareDetector kfxGlareDetector = new KfxGlareDetector(MediaBrowserCompat$ItemReceiver);
                if (getsymbolsfound.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    kfxGlareDetector.IconCompatParcelizer(getsymbolsfound.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            getSymbolsFound.this.MediaBrowserCompat$ItemReceiver(getSymbolsFound.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    /* renamed from: o.getSymbolsFound$write */
    class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private write() {
        }

        /* synthetic */ write(getSymbolsFound getsymbolsfound, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            getSymbolsFound.this.MediaBrowserCompat$ItemReceiver(getSymbolsFound.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            getSymbolsFound.MediaBrowserCompat$ItemReceiver(getSymbolsFound.this);
            getSymbolsFound getsymbolsfound = getSymbolsFound.this;
            getEngineVersion getengineversion = getEngineVersion.MediaBrowserCompat$CustomActionResultReceiver;
            if (getsymbolsfound.RatingCompat != null) {
                getengineversion.IconCompatParcelizer(getsymbolsfound.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getSymbolsFound getsymbolsfound) {
        if (getsymbolsfound.RatingCompat != null) {
            getsymbolsfound.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getSymbolsFound getsymbolsfound) {
        if (getsymbolsfound.RatingCompat != null) {
            getsymbolsfound.RatingCompat.aj_();
        }
    }

    public final void IconCompatParcelizer(int i, String str, Boolean bool) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        C4739h_ h_Var = new C4739h_();
        h_Var.read = UUID.randomUUID().toString();
        convertMemInfoToBytes convertmeminfotobytes = this.MediaBrowserCompat$ItemReceiver;
        if (convertmeminfotobytes == null) {
            convertmeminfotobytes = new convertMemInfoToBytes(0, "", "", "", "");
        }
        h_Var.MediaBrowserCompat$SearchResultReceiver = convertmeminfotobytes.read;
        convertMemInfoToBytes convertmeminfotobytes2 = this.MediaBrowserCompat$ItemReceiver;
        if (convertmeminfotobytes2 == null) {
            convertmeminfotobytes2 = new convertMemInfoToBytes(0, "", "", "", "");
        }
        h_Var.MediaDescriptionCompat = convertmeminfotobytes2.write;
        convertMemInfoToBytes convertmeminfotobytes3 = this.MediaBrowserCompat$ItemReceiver;
        if (convertmeminfotobytes3 == null) {
            convertmeminfotobytes3 = new convertMemInfoToBytes(0, "", "", "", "");
        }
        h_Var.RatingCompat = convertmeminfotobytes3.IconCompatParcelizer;
        convertMemInfoToBytes convertmeminfotobytes4 = this.MediaBrowserCompat$ItemReceiver;
        if (convertmeminfotobytes4 == null) {
            convertmeminfotobytes4 = new convertMemInfoToBytes(0, "", "", "", "");
        }
        h_Var.write = convertmeminfotobytes4.MediaBrowserCompat$ItemReceiver;
        h_Var.IconCompatParcelizer = read(i).read;
        h_Var.MediaBrowserCompat$CustomActionResultReceiver = read(i).MediaBrowserCompat$CustomActionResultReceiver;
        h_Var.MediaBrowserCompat$ItemReceiver = removeIfFromRandomAccessList.read(this.IconCompatParcelizer);
        if (bool.booleanValue()) {
            this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver(h_Var);
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new write(this, (byte) 0));
            return;
        }
        this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(new CustomConcurrentHashMap.KeySet(str, h_Var));
        this.MediaMetadataCompat.IconCompatParcelizer(new write(this, (byte) 0));
    }
}
