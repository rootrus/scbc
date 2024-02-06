package p040o;

import com.scb.phone.domain.errors.RetrofitException;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import kotlin.TypeCastException;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CrashlyticsController;
import p040o.GoogleApiManager;
import p040o.ILocationSourceDelegate;
import p040o.MapFragment;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import p040o.zzby;
import p040o.zzfe;
import p040o.zzfy;
import p040o.zzwe;

/* renamed from: o.md5Hash */
public final class md5Hash extends writeUInt64NoTag<ProcessingParameters_Factory> {
    public final Barcode IconCompatParcelizer;
    /* access modifiers changed from: private */
    public boolean Keep;
    public zzwe.read MediaBrowserCompat$ItemReceiver = new zzwe.read(0, 0);
    public final setCompatElevationResource MediaBrowserCompat$MediaItem;
    public final setRevealInfo MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2892x50fd9e4a = "";
    public CrashlyticsController.FileNameContainsFilter MediaDescriptionCompat;
    public boolean MediaMetadataCompat;
    public int MediaSessionCompat$QueueItem = -1;
    /* access modifiers changed from: private */
    public final Serialization MediaSessionCompat$ResultReceiverWrapper;
    private final setTargetElevation MediaSessionCompat$Token;
    public boolean ParcelableVolumeInfo;
    public zzwf read = zzwf.KOFAX;
    public final setAutoFocusEnabled write;

    /* renamed from: o.md5Hash$PlaybackStateCompat */
    public static final class PlaybackStateCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ md5Hash MediaBrowserCompat$ItemReceiver;

        public PlaybackStateCompat(md5Hash md5hash) {
            this.MediaBrowserCompat$ItemReceiver = md5hash;
        }

        /* renamed from: o.md5Hash$PlaybackStateCompat$CustomAction */
        public static final class CustomAction<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
            public static final CustomAction MediaBrowserCompat$CustomActionResultReceiver = new CustomAction();

            CustomAction() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((ProcessingParameters_Factory) obj).read();
            }
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).MediaMetadataCompat(this.MediaBrowserCompat$ItemReceiver.f2892x50fd9e4a);
        }
    }

    /* renamed from: o.md5Hash$AppCompatActivity */
    static final class AppCompatActivity<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        public static final AppCompatActivity MediaBrowserCompat$ItemReceiver = new AppCompatActivity();

        AppCompatActivity() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).AlertController$RecycleListView();
        }
    }

    /* renamed from: o.md5Hash$AppCompatViewInflater */
    static final class AppCompatViewInflater<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        public static final AppCompatViewInflater MediaBrowserCompat$ItemReceiver = new AppCompatViewInflater();

        AppCompatViewInflater() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
            processingParameters_Factory.aj_();
            processingParameters_Factory.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* renamed from: o.md5Hash$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ String read;

        public MediaMetadataCompat(String str) {
            this.read = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).write(this.read);
        }
    }

    /* renamed from: o.md5Hash$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        public static final ParcelableVolumeInfo read = new ParcelableVolumeInfo();

        ParcelableVolumeInfo() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).MediaMetadataCompat();
        }
    }

    /* renamed from: o.md5Hash$setChecked */
    static final class setChecked<T> implements DebitCardMarketConductDeepLinkActivity<zzvb> {
        private /* synthetic */ zzwd read;
        private /* synthetic */ md5Hash write;

        setChecked(md5Hash md5hash, zzwd zzwd) {
            this.write = md5hash;
            this.read = zzwd;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            boolean z;
            zzvb zzvb = (zzvb) obj;
            if (this.read == zzwd.CAMERA) {
                md5Hash md5hash = this.write;
                onGetStartedClick.IconCompatParcelizer((Object) zzvb, "it");
                md5hash.MediaBrowserCompat$CustomActionResultReceiver(zzvb);
                return;
            }
            md5Hash md5hash2 = this.write;
            onGetStartedClick.IconCompatParcelizer((Object) zzvb, "it");
            onGetStartedClick.write((Object) zzvb, "image");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4969xbe68a552.IconCompatParcelizer;
            boolean z2 = false;
            if (md5hash2.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(md5hash2.RatingCompat);
            }
            String[] strArr = {"jpeg", "jpg", "png", "HEIC"};
            onGetStartedClick.write((Object) strArr, "elements");
            Iterable MediaBrowserCompat$ItemReceiver = HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(strArr);
            if (!(MediaBrowserCompat$ItemReceiver instanceof Collection) || !((Collection) MediaBrowserCompat$ItemReceiver).isEmpty()) {
                Iterator it = MediaBrowserCompat$ItemReceiver.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver((String) it.next(), md5Hash.IconCompatParcelizer(zzvb.read), true)) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                setCompatElevationResource setcompatelevationresource = md5hash2.MediaBrowserCompat$MediaItem;
                zzwd zzwd = zzwd.GALLERY;
                onGetStartedClick.write((Object) zzwd, "uploadMethod");
                setcompatelevationresource.read.write(zzwd);
                md5hash2.MediaBrowserCompat$CustomActionResultReceiver(zzvb);
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = ParcelableVolumeInfo.read;
            if (md5hash2.RatingCompat != null) {
                z2 = true;
            }
            if (z2) {
                iconCompatParcelizer2.IconCompatParcelizer(md5hash2.RatingCompat);
            }
        }
    }

    /* renamed from: o.md5Hash$setContentView */
    public static final class setContentView<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ String read;

        public setContentView(boolean z, String str) {
            this.MediaBrowserCompat$ItemReceiver = z;
            this.read = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
            if (this.MediaBrowserCompat$ItemReceiver) {
                processingParameters_Factory.MediaMetadataCompat(this.read);
                return;
            }
            processingParameters_Factory.aj_();
            processingParameters_Factory.MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* renamed from: o.md5Hash$setExpandedFormat */
    static final class setExpandedFormat<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ int IconCompatParcelizer;
        private /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ Integer MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ int write;

        setExpandedFormat(Integer num, int i, int i2, int i3) {
            this.MediaBrowserCompat$ItemReceiver = num;
            this.write = i;
            this.MediaBrowserCompat$CustomActionResultReceiver = i2;
            this.IconCompatParcelizer = i3;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            int i;
            ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
            Integer num = this.MediaBrowserCompat$ItemReceiver;
            if (num == null) {
                if (this.write > this.MediaBrowserCompat$CustomActionResultReceiver) {
                    return;
                }
            } else if (this.write > this.MediaBrowserCompat$CustomActionResultReceiver && num.intValue() > (i = this.IconCompatParcelizer)) {
                if (onGetStartedClick.IconCompatParcelizer(i, this.MediaBrowserCompat$ItemReceiver.intValue()) < 0) {
                    processingParameters_Factory.MediaBrowserCompat$SearchResultReceiver(String.valueOf(this.MediaBrowserCompat$ItemReceiver.intValue()));
                    return;
                }
                return;
            }
            processingParameters_Factory.MediaDescriptionCompat();
        }
    }

    /* renamed from: o.md5Hash$setHasDecor */
    public static final class setHasDecor<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String write;

        public setHasDecor(String str, String str2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
            this.write = str2;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.write, "pdf");
        }
    }

    /* renamed from: o.md5Hash$setShortcut */
    public static final class setShortcut<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ CrashlyticsController.FileNameContainsFilter write;

        public setShortcut(CrashlyticsController.FileNameContainsFilter fileNameContainsFilter) {
            this.write = fileNameContainsFilter;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
            processingParameters_Factory.IconCompatParcelizer(this.write.write);
            processingParameters_Factory.read(zzfy.zzd.SUBMITTED != this.write.read);
        }
    }

    /* renamed from: o.md5Hash$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ md5Hash MediaBrowserCompat$CustomActionResultReceiver;

        public write(md5Hash md5hash) {
            this.MediaBrowserCompat$CustomActionResultReceiver = md5hash;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.read);
        }
    }

    /* renamed from: o.md5Hash$AppCompatDialogFragment */
    public static final class AppCompatDialogFragment<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ md5Hash write;

        public AppCompatDialogFragment(md5Hash md5hash) {
            this.write = md5hash;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
            zzwd zzwd = zzwd.CAMERA;
            CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$ItemReceiver = this.write.MediaDescriptionCompat;
            if (MediaBrowserCompat$ItemReceiver == null || (str = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) == null) {
                str = "";
            }
            processingParameters_Factory.MediaBrowserCompat$ItemReceiver(zzwd, str);
        }
    }

    /* renamed from: o.md5Hash$Keep */
    public static final class Keep<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        public static final Keep IconCompatParcelizer = new Keep();

        Keep() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).IconCompatParcelizer();
        }
    }

    /* renamed from: o.md5Hash$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        public static final MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.md5Hash$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ md5Hash IconCompatParcelizer;

        public RatingCompat(md5Hash md5hash) {
            this.IconCompatParcelizer = md5hash;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
            zzwd zzwd = zzwd.FILE_STORAGE;
            CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaDescriptionCompat;
            if (MediaBrowserCompat$ItemReceiver == null || (str = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer) == null) {
                str = "";
            }
            processingParameters_Factory.MediaBrowserCompat$ItemReceiver(zzwd, str);
        }
    }

    /* renamed from: o.md5Hash$read */
    public static final /* synthetic */ class read extends InvestmentFundDetailsActivity implements FundFactSheetActivity<ProcessingParameters_Factory, HmlVerifyPhoneValidateOtpActivity> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final String getName() {
            return "showUploadMethods";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(ProcessingParameters_Factory.class);
        }

        public final String getSignature() {
            return "showUploadMethods()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
            onGetStartedClick.write((Object) processingParameters_Factory, "p1");
            processingParameters_Factory.mo37625x50fd9e4a();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.md5Hash$setBackgroundResource */
    public static final class setBackgroundResource<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
        private /* synthetic */ md5Hash read;

        public setBackgroundResource(md5Hash md5hash) {
            this.read = md5hash;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ProcessingParameters_Factory) obj).IconCompatParcelizer(this.read.read);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public md5Hash(RegularImmutableBiMap regularImmutableBiMap, setTargetElevation settargetelevation, Barcode barcode, Serialization serialization, setAutoFocusEnabled setautofocusenabled, setCompatElevationResource setcompatelevationresource, setRevealInfo setrevealinfo) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) settargetelevation, "hmlDocumentListCase");
        onGetStartedClick.write((Object) barcode, "deleteUploadedDocumentCase");
        onGetStartedClick.write((Object) serialization, "hmlDocumentListDisplayMapper");
        onGetStartedClick.write((Object) setautofocusenabled, "easycashAdditionDocumentCase");
        onGetStartedClick.write((Object) setcompatelevationresource, "hmlSaveUploadMethodCase");
        onGetStartedClick.write((Object) setrevealinfo, "hmlSaveReuploadStatusCase");
        this.MediaSessionCompat$Token = settargetelevation;
        this.IconCompatParcelizer = barcode;
        this.MediaSessionCompat$ResultReceiverWrapper = serialization;
        this.write = setautofocusenabled;
        this.MediaBrowserCompat$MediaItem = setcompatelevationresource;
        this.MediaBrowserCompat$SearchResultReceiver = setrevealinfo;
    }

    /* renamed from: o.md5Hash$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ GoogleApiManager.zaa write;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(GoogleApiManager.zaa zaa) {
            this.write = zaa;
        }

        public final Object IconCompatParcelizer(Object obj) {
            DrawingDataSetNotCreatedException drawingDataSetNotCreatedException = (DrawingDataSetNotCreatedException) obj;
            MapFragment.zza MediaBrowserCompat$ItemReceiver = MapFragment.zza.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.MediaMetadataCompat = drawingDataSetNotCreatedException.MediaMetadataCompat;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = drawingDataSetNotCreatedException.RatingCompat;
            MediaBrowserCompat$ItemReceiver.RatingCompat = drawingDataSetNotCreatedException.MediaBrowserCompat$MediaItem;
            MediaBrowserCompat$ItemReceiver.read = drawingDataSetNotCreatedException.read;
            MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = drawingDataSetNotCreatedException.MediaDescriptionCompat;
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem = drawingDataSetNotCreatedException.MediaBrowserCompat$SearchResultReceiver;
            MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = FragmentBuilder_BindSummaryFragment.write(drawingDataSetNotCreatedException.f2706x50fd9e4a, (OffsetDateTime) null);
            MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token = drawingDataSetNotCreatedException.ParcelableVolumeInfo.write();
            MediaBrowserCompat$ItemReceiver.f2758x50fd9e4a = drawingDataSetNotCreatedException.ParcelableVolumeInfo.IconCompatParcelizer();
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(drawingDataSetNotCreatedException.write).doubleValue();
            MediaBrowserCompat$ItemReceiver.write = FragmentBuilder_BindSummaryFragment.write(drawingDataSetNotCreatedException.IconCompatParcelizer, (OffsetDateTime) null);
            MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = drawingDataSetNotCreatedException.MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo = drawingDataSetNotCreatedException.MediaSessionCompat$ResultReceiverWrapper;
            return MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.md5Hash$ActionMenuItemView */
    public static final class ActionMenuItemView extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzfe.zze> {
        final /* synthetic */ md5Hash IconCompatParcelizer;

        /* renamed from: o.md5Hash$ActionMenuItemView$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
            private /* synthetic */ ActionMenuItemView write;

            IconCompatParcelizer(ActionMenuItemView actionMenuItemView) {
                this.write = actionMenuItemView;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                zzfe.zzc zzc;
                ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
                processingParameters_Factory.MediaBrowserCompat$MediaItem();
                zzfy.zzd zzd = zzfy.zzd.INITIAL;
                CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$ItemReceiver = this.write.IconCompatParcelizer.MediaDescriptionCompat;
                if (MediaBrowserCompat$ItemReceiver != null) {
                    zzc = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                } else {
                    zzc = null;
                }
                processingParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(zzd, zzc);
            }
        }

        /* renamed from: o.md5Hash$ActionMenuItemView$read */
        static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
            private /* synthetic */ ActionMenuItemView MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ zzfe.zze write;

            read(ActionMenuItemView actionMenuItemView, zzfe.zze zze) {
                this.MediaBrowserCompat$CustomActionResultReceiver = actionMenuItemView;
                this.write = zze;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                zzfe.zzc zzc;
                ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
                String str = this.write.write;
                if (str == null) {
                    str = "";
                }
                processingParameters_Factory.MediaDescriptionCompat(str);
                zzfy.zzd zzd = zzfy.zzd.RESUBMIT;
                CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaDescriptionCompat;
                if (MediaBrowserCompat$ItemReceiver != null) {
                    zzc = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                } else {
                    zzc = null;
                }
                processingParameters_Factory.MediaBrowserCompat$CustomActionResultReceiver(zzd, zzc);
            }
        }

        /* renamed from: o.md5Hash$ActionMenuItemView$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
            public static final write read = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((ProcessingParameters_Factory) obj).MediaSessionCompat$Token();
            }
        }

        ActionMenuItemView(md5Hash md5hash) {
            this.IconCompatParcelizer = md5hash;
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzfy.zzd zzd;
            zzfe.zze zze = (zzfe.zze) obj;
            onGetStartedClick.write((Object) zze, "documents");
            this.IconCompatParcelizer.MediaMetadataCompat = zze.read;
            this.IconCompatParcelizer.read = zze.MediaBrowserCompat$CustomActionResultReceiver;
            md5Hash md5hash = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer md5hash_actionmenuitemview_mediabrowsercompat_customactionresultreceiver = new C4968x24cfc12(this, zze);
            boolean z = false;
            if (md5hash.RatingCompat != null) {
                md5hash_actionmenuitemview_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(md5hash.RatingCompat);
            }
            CrashlyticsController.FileNameContainsFilter MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaDescriptionCompat;
            if (MediaBrowserCompat$ItemReceiver != null) {
                zzd = MediaBrowserCompat$ItemReceiver.read;
            } else {
                zzd = null;
            }
            if (zzd != null) {
                int i = CryptoService.IconCompatParcelizer[zzd.ordinal()];
                if (i == 1) {
                    md5Hash md5hash2 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer md5hash_actionmenuitemview_mediabrowsercompat_itemreceiver = new md5Hash$ActionMenuItemView$MediaBrowserCompat$ItemReceiver(this);
                    if (md5hash2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        md5hash_actionmenuitemview_mediabrowsercompat_itemreceiver.IconCompatParcelizer(md5hash2.RatingCompat);
                    }
                } else if (i == 2) {
                    md5Hash md5hash3 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer read2 = new read(this, zze);
                    if (md5hash3.RatingCompat != null) {
                        read2.IconCompatParcelizer(md5hash3.RatingCompat);
                    }
                    md5Hash md5hash4 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer setexpandedformat = new setExpandedFormat(zze.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write, zze.MediaBrowserCompat$MediaItem, zze.RatingCompat.size());
                    if (md5hash4.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        setexpandedformat.IconCompatParcelizer(md5hash4.RatingCompat);
                    }
                } else if (i == 3) {
                    md5Hash md5hash5 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
                    if (md5hash5.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(md5hash5.RatingCompat);
                    }
                    md5Hash md5hash6 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer setexpandedformat2 = new setExpandedFormat(zze.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write, zze.MediaBrowserCompat$MediaItem, zze.RatingCompat.size());
                    if (md5hash6.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        setexpandedformat2.IconCompatParcelizer(md5hash6.RatingCompat);
                    }
                } else if (i == 4) {
                    md5Hash md5hash7 = this.IconCompatParcelizer;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = write.read;
                    if (md5hash7.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        iconCompatParcelizer2.IconCompatParcelizer(md5hash7.RatingCompat);
                    }
                }
            }
            if (!this.IconCompatParcelizer.Keep) {
                md5Hash.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final void onDestroy() {
        setTargetElevation settargetelevation = this.MediaSessionCompat$Token;
        if (!settargetelevation.MediaBrowserCompat$MediaItem.isDisposed()) {
            settargetelevation.MediaBrowserCompat$MediaItem.dispose();
        }
        Barcode barcode = this.IconCompatParcelizer;
        if (!barcode.MediaBrowserCompat$MediaItem.isDisposed()) {
            barcode.MediaBrowserCompat$MediaItem.dispose();
        }
        setAutoFocusEnabled setautofocusenabled = this.write;
        if (!setautofocusenabled.MediaBrowserCompat$MediaItem.isDisposed()) {
            setautofocusenabled.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.md5Hash$setItemInvoker */
    public static final class setItemInvoker extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzby.zza> {
        private /* synthetic */ md5Hash MediaBrowserCompat$ItemReceiver;

        setItemInvoker(md5Hash md5hash) {
            this.MediaBrowserCompat$ItemReceiver = md5hash;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onGetStartedClick.write((Object) (zzby.zza) obj, "additionDocument");
            this.MediaBrowserCompat$ItemReceiver.Keep = false;
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            this.MediaBrowserCompat$ItemReceiver.Keep = false;
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public static String IconCompatParcelizer(String str) {
        CharSequence charSequence = str;
        onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
        int IconCompatParcelizer2 = GoodToKnowActivity.IconCompatParcelizer(charSequence, '.', charSequence.length() - 1, false);
        if (IconCompatParcelizer2 <= 0) {
            return "";
        }
        if (str != null) {
            String substring = str.substring(IconCompatParcelizer2 + 1);
            onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: o.md5Hash$setIcon */
    public static final class setIcon extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzby.zza> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ md5Hash read;

        /* renamed from: o.md5Hash$setIcon$write */
        static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ProcessingParameters_Factory> {
            public static final write MediaBrowserCompat$ItemReceiver = new write();

            write() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ProcessingParameters_Factory processingParameters_Factory = (ProcessingParameters_Factory) obj;
                processingParameters_Factory.aj_();
                processingParameters_Factory.RatingCompat();
            }
        }

        public setIcon(md5Hash md5hash, String str) {
            this.read = md5hash;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final /* synthetic */ void onNext(Object obj) {
            onGetStartedClick.write((Object) (zzby.zza) obj, "additionDocument");
            new File(this.MediaBrowserCompat$CustomActionResultReceiver).delete();
            md5Hash.MediaBrowserCompat$MediaItem(this.read);
            this.read.MediaBrowserCompat$ItemReceiver();
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "e");
            if (th instanceof RetrofitException) {
                RetrofitException retrofitException = (RetrofitException) th;
                ILocationSourceDelegate iLocationSourceDelegate = retrofitException.IconCompatParcelizer;
                if (iLocationSourceDelegate != null && iLocationSourceDelegate.write != null) {
                    ILocationSourceDelegate iLocationSourceDelegate2 = retrofitException.IconCompatParcelizer;
                    onGetStartedClick.IconCompatParcelizer((Object) iLocationSourceDelegate2, "e.response");
                    ILocationSourceDelegate.zza zza = iLocationSourceDelegate2.write;
                    onGetStartedClick.IconCompatParcelizer((Object) zza, "e.response.error");
                    String str = zza.IconCompatParcelizer;
                    if (str != null) {
                        boolean z = true;
                        switch (str.hashCode()) {
                            case 1567134:
                                if (str.equals("3045")) {
                                    md5Hash md5hash = this.read;
                                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = md5Hash$setIcon$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                                    if (md5hash.RatingCompat == null) {
                                        z = false;
                                    }
                                    if (z) {
                                        iconCompatParcelizer.IconCompatParcelizer(md5hash.RatingCompat);
                                        return;
                                    }
                                    return;
                                }
                                break;
                            case 1567135:
                                if (str.equals("3046")) {
                                    md5Hash md5hash2 = this.read;
                                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = write.MediaBrowserCompat$ItemReceiver;
                                    if (md5hash2.RatingCompat == null) {
                                        z = false;
                                    }
                                    if (z) {
                                        iconCompatParcelizer2.IconCompatParcelizer(md5hash2.RatingCompat);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    }
                    this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                    return;
                }
                return;
            }
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    public final void write(BScanCNotificationDeepLinkActivity<zzvb> bScanCNotificationDeepLinkActivity, zzwd zzwd) {
        onGetStartedClick.write((Object) bScanCNotificationDeepLinkActivity, "emitter");
        onGetStartedClick.write((Object) zzwd, "uploadMethod");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = AppCompatActivity.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        bScanCNotificationDeepLinkActivity.write(new setChecked(this, zzwd), new setCheckable(this));
    }

    /* renamed from: o.md5Hash$setCheckable */
    static final class setCheckable<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        private /* synthetic */ md5Hash IconCompatParcelizer;

        setCheckable(md5Hash md5hash) {
            this.IconCompatParcelizer = md5hash;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            md5Hash md5hash = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = AppCompatViewInflater.MediaBrowserCompat$ItemReceiver;
            if (md5hash.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(md5hash.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$MediaItem(md5Hash md5hash) {
        if (md5hash.RatingCompat != null) {
            md5hash.RatingCompat.aj_();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(zzvb zzvb) {
        String str;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        setAutoFocusEnabled setautofocusenabled = this.write;
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = this.MediaDescriptionCompat;
        if (fileNameContainsFilter == null || (str = fileNameContainsFilter.IconCompatParcelizer) == null) {
            str = "";
        }
        setautofocusenabled.MediaBrowserCompat$CustomActionResultReceiver(zzvb, str);
        this.Keep = true;
        this.write.IconCompatParcelizer(new setItemInvoker(this));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        String str;
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        setTargetElevation settargetelevation = this.MediaSessionCompat$Token;
        CrashlyticsController.FileNameContainsFilter fileNameContainsFilter = this.MediaDescriptionCompat;
        if (fileNameContainsFilter == null || (str = fileNameContainsFilter.IconCompatParcelizer) == null) {
            str = "";
        }
        settargetelevation.IconCompatParcelizer(str);
        this.MediaSessionCompat$Token.IconCompatParcelizer(new ActionMenuItemView(this));
    }
}
