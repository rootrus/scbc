package p040o;

import java.util.Arrays;
import java.util.List;
import p040o.C6390x3b6ff3c3;
import p040o.Check;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsReport;
import p040o.IsgDetectionModule;
import p040o.Multisets;
import p040o.access$2300;
import p040o.setAutoFocusEnabled;
import p040o.setCvv;
import p040o.writeUInt64NoTag;
import p040o.zzbt;
import p040o.zzby;

/* renamed from: o.ImageProcessor */
public final /* synthetic */ class ImageProcessor implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ addImageOutEventListener$MediaBrowserCompat$ItemReceiver read;

    /* renamed from: o.ImageProcessor$AnalysisCompleteEvent */
    public final /* synthetic */ class AnalysisCompleteEvent implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ AnalysisCompleteEvent write = new AnalysisCompleteEvent();

        private /* synthetic */ AnalysisCompleteEvent() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((C6390x3b6ff3c3.read) obj).read();
        }
    }

    /* renamed from: o.ImageProcessor$AnalysisCompleteListener */
    public final /* synthetic */ class AnalysisCompleteListener implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ AnalysisCompleteListener MediaBrowserCompat$CustomActionResultReceiver = new AnalysisCompleteListener();

        private /* synthetic */ AnalysisCompleteListener() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((C6390x3b6ff3c3.read) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.ImageProcessor$AnalysisProgressEvent */
    public final /* synthetic */ class AnalysisProgressEvent implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ AnalysisProgressEvent write = new AnalysisProgressEvent();

        private /* synthetic */ AnalysisProgressEvent() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((CheckExtractActivity_MembersInjector.setCheckable) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.ImageProcessor$AnalysisProgressListener */
    public final /* synthetic */ class AnalysisProgressListener implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ AnalysisProgressListener MediaBrowserCompat$CustomActionResultReceiver = new AnalysisProgressListener();

        private /* synthetic */ AnalysisProgressListener() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((C6390x3b6ff3c3.read) obj).write();
        }
    }

    /* renamed from: o.ImageProcessor$Method */
    public final /* synthetic */ class Method implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ Method MediaBrowserCompat$CustomActionResultReceiver = new Method();

        private /* synthetic */ Method() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((setCvv.write) obj).read(false);
        }
    }

    /* renamed from: o.ImageProcessor$QaProgressClient */
    public final /* synthetic */ class QaProgressClient implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$ItemReceiver;

        public /* synthetic */ QaProgressClient(getLegacySharedPrefs getlegacysharedprefs) {
            this.MediaBrowserCompat$ItemReceiver = getlegacysharedprefs;
        }

        public final void IconCompatParcelizer(Object obj) {
            IsgMrzDocumentDetector.read(this.MediaBrowserCompat$ItemReceiver, (Check.IconCompatParcelizer) obj);
        }
    }

    /* renamed from: o.ImageProcessor$IpProgressClient */
    public final /* synthetic */ class IpProgressClient implements Runnable {
        private final /* synthetic */ Check MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ IpProgressClient(Check check) {
            this.MediaBrowserCompat$CustomActionResultReceiver = check;
        }

        public final void run() {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.ImageProcessor$b */
    public final /* synthetic */ class C3485b implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ zzbt.zzc IconCompatParcelizer;

        public /* synthetic */ C3485b(zzbt.zzc zzc) {
            this.IconCompatParcelizer = zzc;
        }

        public final void IconCompatParcelizer(Object obj) {
            IsgDetectionModule.write.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer, (Check$MediaBrowserCompat$CustomActionResultReceiver) obj);
        }
    }

    /* renamed from: o.ImageProcessor$c */
    public final /* synthetic */ class C3486c implements Runnable {
        private final /* synthetic */ Check.IconCompatParcelizer IconCompatParcelizer;

        public /* synthetic */ C3486c(Check.IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = iconCompatParcelizer;
        }

        public final void run() {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public /* synthetic */ ImageProcessor(addImageOutEventListener$MediaBrowserCompat$ItemReceiver addimageouteventlistener_mediabrowsercompat_itemreceiver) {
        this.read = addimageouteventlistener_mediabrowsercompat_itemreceiver;
    }

    /* renamed from: o.ImageProcessor$ImageOutListener */
    public class ImageOutListener extends writeUInt64NoTag<C6390x3b6ff3c3> {
        /* access modifiers changed from: private */
        public final Multisets.ElementSetImpl IconCompatParcelizer;
        public final setAutoFocusEnabled MediaBrowserCompat$ItemReceiver;
        public setAutoFocusEnabled.IconCompatParcelizer read = setAutoFocusEnabled.IconCompatParcelizer.DEFAULT;
        public zzby.zzc.zza write;

        @HmlPinActivity
        public ImageOutListener(RegularImmutableBiMap regularImmutableBiMap, setAutoFocusEnabled setautofocusenabled, Multisets.ElementSetImpl elementSetImpl) {
            super(regularImmutableBiMap);
            this.MediaBrowserCompat$ItemReceiver = setautofocusenabled;
            this.IconCompatParcelizer = elementSetImpl;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void read(java.lang.String r6, java.lang.String r7, p040o.setAutoFocusEnabled.IconCompatParcelizer r8) {
            /*
                r5 = this;
                r5.read = r8
                int r0 = r7.hashCode()
                r1 = 3
                r2 = 2
                r3 = 1
                r4 = 0
                switch(r0) {
                    case 2365553: goto L_0x002c;
                    case 159567045: goto L_0x0022;
                    case 277399877: goto L_0x0018;
                    case 2090361232: goto L_0x000e;
                    default: goto L_0x000d;
                }
            L_0x000d:
                goto L_0x0036
            L_0x000e:
                java.lang.String r0 = "PURPOSEFUL_LOAN"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0036
                r0 = r3
                goto L_0x0037
            L_0x0018:
                java.lang.String r0 = "HOME_TOP_UP"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0036
                r0 = r1
                goto L_0x0037
            L_0x0022:
                java.lang.String r0 = "COMMERCIAL_LOAN"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0036
                r0 = r4
                goto L_0x0037
            L_0x002c:
                java.lang.String r0 = "MHMC"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L_0x0036
                r0 = r2
                goto L_0x0037
            L_0x0036:
                r0 = -1
            L_0x0037:
                if (r0 == 0) goto L_0x0050
                if (r0 == r3) goto L_0x003f
                if (r0 == r2) goto L_0x003f
                if (r0 != r1) goto L_0x0060
            L_0x003f:
                o.analysisComplete r0 = p040o.analysisComplete.read
                T r1 = r5.RatingCompat
                if (r1 == 0) goto L_0x0047
                r1 = r3
                goto L_0x0048
            L_0x0047:
                r1 = r4
            L_0x0048:
                if (r1 == 0) goto L_0x0060
                T r1 = r5.RatingCompat
                r0.IconCompatParcelizer(r1)
                goto L_0x0060
            L_0x0050:
                o.getListenerCallbackThreadType r0 = p040o.getListenerCallbackThreadType.MediaBrowserCompat$ItemReceiver
                T r1 = r5.RatingCompat
                if (r1 == 0) goto L_0x0058
                r1 = r3
                goto L_0x0059
            L_0x0058:
                r1 = r4
            L_0x0059:
                if (r1 == 0) goto L_0x0060
                T r1 = r5.RatingCompat
                r0.IconCompatParcelizer(r1)
            L_0x0060:
                o.setAutoFocusEnabled$IconCompatParcelizer r0 = p040o.setAutoFocusEnabled.IconCompatParcelizer.HML
                if (r8 != r0) goto L_0x0074
                o.getProcessedImageJpegQuality r8 = p040o.getProcessedImageJpegQuality.IconCompatParcelizer
                T r0 = r5.RatingCompat
                if (r0 == 0) goto L_0x006c
                r0 = r3
                goto L_0x006d
            L_0x006c:
                r0 = r4
            L_0x006d:
                if (r0 == 0) goto L_0x0074
                T r0 = r5.RatingCompat
                r8.IconCompatParcelizer(r0)
            L_0x0074:
                T r8 = r5.RatingCompat
                if (r8 == 0) goto L_0x0079
                goto L_0x007a
            L_0x0079:
                r3 = r4
            L_0x007a:
                if (r3 == 0) goto L_0x0081
                T r8 = r5.RatingCompat
                r8.AlertController$RecycleListView()
            L_0x0081:
                o.setAutoFocusEnabled r8 = r5.MediaBrowserCompat$ItemReceiver
                r8.write(r6, r7)
                o.setAutoFocusEnabled r6 = r5.MediaBrowserCompat$ItemReceiver
                o.ImageProcessor$ImageOutListener$MediaBrowserCompat$CustomActionResultReceiver r7 = new o.ImageProcessor$ImageOutListener$MediaBrowserCompat$CustomActionResultReceiver
                r7.<init>(r5, r4)
                r6.IconCompatParcelizer(r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ImageProcessor.ImageOutListener.read(java.lang.String, java.lang.String, o.setAutoFocusEnabled$IconCompatParcelizer):void");
        }

        static /* synthetic */ void write(C6390x3b6ff3c3 checkExtractActivity_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver) {
            checkExtractActivity_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(Iterables$3$MediaBrowserCompat$MediaItem.commercial_required_document_title);
            checkExtractActivity_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat();
        }

        static /* synthetic */ void write(ImageOutListener imageOutListener) {
            if (imageOutListener.RatingCompat != null) {
                imageOutListener.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ImageOutListener imageOutListener) {
            if (imageOutListener.RatingCompat != null) {
                imageOutListener.RatingCompat.aj_();
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            this.MediaBrowserCompat$ItemReceiver.write(str, str2);
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C3488xb230e6e1(this, (byte) 0));
        }
    }

    /* renamed from: o.ImageProcessor$ImageOutEvent */
    public class ImageOutEvent extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.read> {
        public List<CrashlyticsReport.FilesPayload.File.Builder> IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
        public final setAutoFocusEnabled write;

        @HmlPinActivity
        public ImageOutEvent(RegularImmutableBiMap regularImmutableBiMap, setAutoFocusEnabled setautofocusenabled, Multisets.ElementSetImpl elementSetImpl, Multisets.C36852 r4) {
            super(regularImmutableBiMap);
            this.write = setautofocusenabled;
        }

        public final void read(List<isDebuggerAttached> list) {
            List<CrashlyticsReport.FilesPayload.File.Builder> MediaBrowserCompat$ItemReceiver2 = Multisets.ElementSetImpl.MediaBrowserCompat$ItemReceiver(list, new getBasicSettingsProfile(this));
            this.IconCompatParcelizer = MediaBrowserCompat$ItemReceiver2;
            getProcessedImageFilePath getprocessedimagefilepath = new getProcessedImageFilePath(MediaBrowserCompat$ItemReceiver2);
            if (this.RatingCompat != null) {
                getprocessedimagefilepath.IconCompatParcelizer(this.RatingCompat);
            }
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            if (i < 0) {
                this.MediaBrowserCompat$ItemReceiver = null;
            } else if (!this.IconCompatParcelizer.isEmpty()) {
                this.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.get(i).f2695x50fd9e4a;
            }
        }

        public void onDestroy() {
            setAutoFocusEnabled setautofocusenabled = this.write;
            if (!setautofocusenabled.MediaBrowserCompat$MediaItem.isDisposed()) {
                setautofocusenabled.MediaBrowserCompat$MediaItem.dispose();
            }
            super.onDestroy();
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ImageOutEvent imageOutEvent) {
            if (imageOutEvent.RatingCompat != null) {
                imageOutEvent.RatingCompat.aj_();
            }
        }
    }

    /* renamed from: o.ImageProcessor$ProcessProgressListener */
    public class ProcessProgressListener extends writeUInt64NoTag<C1159x62a8e1df> {
        /* access modifiers changed from: private */
        public final Multisets.ElementSetImpl MediaBrowserCompat$ItemReceiver;
        public final setAutoFocusEnabled read;

        @HmlPinActivity
        public ProcessProgressListener(RegularImmutableBiMap regularImmutableBiMap, setAutoFocusEnabled setautofocusenabled, Multisets.ElementSetImpl elementSetImpl) {
            super(regularImmutableBiMap);
            this.read = setautofocusenabled;
            this.MediaBrowserCompat$ItemReceiver = elementSetImpl;
        }

        /* renamed from: o.ImageProcessor$ProcessProgressListener$read */
        public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzby.zzb> {
            private read() {
            }

            public /* synthetic */ read(ProcessProgressListener processProgressListener, byte b) {
                this();
            }

            public final /* synthetic */ void onNext(Object obj) {
                zzby.zzb zzb = (zzby.zzb) obj;
                super.onNext(zzb);
                ProcessProgressListener.MediaBrowserCompat$CustomActionResultReceiver(ProcessProgressListener.this);
                List<closeOrLog> write = ProcessProgressListener.this.MediaBrowserCompat$ItemReceiver.write(zzb.MediaBrowserCompat$ItemReceiver);
                ProcessProgressListener processProgressListener = ProcessProgressListener.this;
                removeAnalysisProgressEventListener removeanalysisprogresseventlistener = new removeAnalysisProgressEventListener(write);
                if (processProgressListener.RatingCompat != null) {
                    removeanalysisprogresseventlistener.IconCompatParcelizer(processProgressListener.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                ProcessProgressListener.this.MediaBrowserCompat$ItemReceiver(ProcessProgressListener.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ProcessProgressListener processProgressListener) {
            if (processProgressListener.RatingCompat != null) {
                processProgressListener.RatingCompat.aj_();
            }
        }
    }

    /* renamed from: o.ImageProcessor$ProcessProgressEvent */
    public class ProcessProgressEvent extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setCheckable> {
        public String AlertController$RecycleListView;
        public isBuildingsEnabled IconCompatParcelizer;
        /* access modifiers changed from: private */
        public final toArrayImpl Keep;
        public AutoValue_CrashlyticsReport_CustomAttribute MediaBrowserCompat$ItemReceiver;
        public boolean MediaBrowserCompat$MediaItem;
        public zzbt.zze.zza MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public String f2723x50fd9e4a;
        public final FocusingProcessor MediaDescriptionCompat;
        public boolean MediaMetadataCompat = true;
        public zzby.zzb.zza MediaSessionCompat$QueueItem;
        public String MediaSessionCompat$ResultReceiverWrapper;
        public List<MoreExecutors> MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        /* access modifiers changed from: private */
        public final MapMaker PlaybackStateCompat;
        /* access modifiers changed from: private */
        public final C10869tileProvider PlaybackStateCompat$CustomAction;
        public String read;
        private boolean setHasDecor = true;
        public String write;

        @HmlPinActivity
        public ProcessProgressEvent(RegularImmutableBiMap regularImmutableBiMap, FocusingProcessor focusingProcessor, C10869tileProvider tileprovider, toArrayImpl toarrayimpl, MapMaker mapMaker, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
            super(regularImmutableBiMap);
            this.MediaDescriptionCompat = focusingProcessor;
            this.PlaybackStateCompat$CustomAction = tileprovider;
            this.Keep = toarrayimpl;
            this.PlaybackStateCompat = mapMaker;
            this.ParcelableVolumeInfo = str;
        }

        public final boolean read() {
            isBuildingsEnabled isbuildingsenabled;
            zzbt.zze.zza zza = this.MediaBrowserCompat$SearchResultReceiver;
            if (!(zza == null || zza.IconCompatParcelizer == null)) {
                String str = this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                if (!(str == null || str.length() == 0) && (isbuildingsenabled = this.IconCompatParcelizer) != null) {
                    String str2 = isbuildingsenabled.MediaBrowserCompat$ItemReceiver;
                    if (!(str2 == null || str2.length() == 0) && read(this.MediaBrowserCompat$ItemReceiver) && this.setHasDecor && this.MediaMetadataCompat && this.AlertController$RecycleListView != null && this.MediaSessionCompat$ResultReceiverWrapper != null) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: o.ImageProcessor$ProcessProgressEvent$write */
        class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzwg> {
            private isBuildingsEnabled read;

            /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
            /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onNext(java.lang.Object r6) {
                /*
                    r5 = this;
                    o.zzwg r6 = (p040o.zzwg) r6
                    o.ImageProcessor$ProcessProgressEvent r0 = p040o.ImageProcessor.ProcessProgressEvent.this
                    p040o.ImageProcessor.ProcessProgressEvent.read((p040o.ImageProcessor.ProcessProgressEvent) r0)
                    o.isBuildingsEnabled r0 = r5.read
                    r1 = 0
                    r2 = 1
                    if (r0 == 0) goto L_0x0021
                    java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                    if (r0 == 0) goto L_0x0019
                    int r0 = r0.length()
                    if (r0 == 0) goto L_0x0019
                    r0 = r1
                    goto L_0x001a
                L_0x0019:
                    r0 = r2
                L_0x001a:
                    if (r0 != 0) goto L_0x0021
                    o.isBuildingsEnabled r0 = r5.read
                    java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
                    goto L_0x0023
                L_0x0021:
                    java.lang.String r0 = "TH"
                L_0x0023:
                    o.ImageProcessor$ProcessProgressEvent r3 = p040o.ImageProcessor.ProcessProgressEvent.this
                    p040o.ImageProcessor.ProcessProgressEvent.write(r3, r0)
                    o.ImageProcessor$ProcessProgressEvent r3 = p040o.ImageProcessor.ProcessProgressEvent.this
                    o.MapMaker r4 = r3.PlaybackStateCompat
                    java.util.List r6 = r4.MediaBrowserCompat$ItemReceiver(r6)
                    java.util.List unused = r3.MediaSessionCompat$Token = r6
                    o.ImageProcessor$ProcessProgressEvent r6 = p040o.ImageProcessor.ProcessProgressEvent.this
                    o.removeAnalysisCompleteEventListener r3 = new o.removeAnalysisCompleteEventListener
                    r3.<init>(r5, r0)
                    T r0 = r6.RatingCompat
                    if (r0 == 0) goto L_0x0041
                    r1 = r2
                L_0x0041:
                    if (r1 == 0) goto L_0x0048
                    T r6 = r6.RatingCompat
                    r3.IconCompatParcelizer(r6)
                L_0x0048:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.ImageProcessor.ProcessProgressEvent.write.onNext(java.lang.Object):void");
            }

            public write(isBuildingsEnabled isbuildingsenabled) {
                this.read = isbuildingsenabled;
            }

            public final void onError(Throwable th) {
                ProcessProgressEvent.this.MediaBrowserCompat$ItemReceiver(ProcessProgressEvent.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }

        static /* synthetic */ void write(ProcessProgressEvent processProgressEvent) {
            if (processProgressEvent.RatingCompat != null) {
                processProgressEvent.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void read(ProcessProgressEvent processProgressEvent) {
            if (processProgressEvent.RatingCompat != null) {
                processProgressEvent.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaBrowserCompat$MediaItem(ProcessProgressEvent processProgressEvent) {
            if (processProgressEvent.RatingCompat != null) {
                processProgressEvent.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaSessionCompat$Token(ProcessProgressEvent processProgressEvent) {
            if (processProgressEvent.RatingCompat != null) {
                processProgressEvent.RatingCompat.aj_();
            }
        }

        static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper(ProcessProgressEvent processProgressEvent) {
            if (processProgressEvent.RatingCompat != null) {
                processProgressEvent.RatingCompat.AlertController$RecycleListView();
            }
        }

        static /* synthetic */ void write(ProcessProgressEvent processProgressEvent, String str) {
            isBuildingsEnabled isbuildingsenabled = new isBuildingsEnabled();
            isbuildingsenabled.MediaBrowserCompat$ItemReceiver = str;
            processProgressEvent.IconCompatParcelizer = isbuildingsenabled;
        }

        /* access modifiers changed from: private */
        public static boolean read(AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute) {
            if (autoValue_CrashlyticsReport_CustomAttribute != null) {
                String str = autoValue_CrashlyticsReport_CustomAttribute.MediaDescriptionCompat;
                if (!(str == null || str.equals(""))) {
                    String str2 = autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$CustomActionResultReceiver;
                    if (!(str2 == null || str2.equals(""))) {
                        String str3 = autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$ItemReceiver;
                        if (!(str3 == null || str3.equals(""))) {
                            String str4 = autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$MediaItem;
                            if (!(str4 == null || str4.equals(""))) {
                                String str5 = autoValue_CrashlyticsReport_CustomAttribute.f2671x50fd9e4a;
                                if (!(str5 == null || str5.equals(""))) {
                                    String str6 = autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$SearchResultReceiver;
                                    if (!(str6 == null || str6.equals(""))) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            this.MediaDescriptionCompat.IconCompatParcelizer(this.read);
            this.MediaDescriptionCompat.IconCompatParcelizer(new C3490x49eb2967(this, (byte) 0));
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void MediaBrowserCompat$CustomActionResultReceiver(java.lang.String r5) {
            /*
                r4 = this;
                if (r5 == 0) goto L_0x0004
                r0 = r5
                goto L_0x0006
            L_0x0004:
                java.lang.String r0 = ""
            L_0x0006:
                java.lang.String r1 = "^[0-9\\u0E01-\\u0E39\\u0E40-\\u0E4Ca-zA-Z _*\"#&()@,.'\\-/]+$"
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
                java.util.regex.Matcher r0 = r1.matcher(r0)
                boolean r0 = r0.matches()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0038
                if (r5 == 0) goto L_0x0022
                int r0 = r5.length()
                if (r0 == 0) goto L_0x0022
                r0 = r2
                goto L_0x0023
            L_0x0022:
                r0 = r1
            L_0x0023:
                if (r0 != 0) goto L_0x0038
                o.ImageProcessor$AnalysisProgressEvent r5 = p040o.ImageProcessor.AnalysisProgressEvent.write
                T r0 = r4.RatingCompat
                if (r0 == 0) goto L_0x002d
                r0 = r1
                goto L_0x002e
            L_0x002d:
                r0 = r2
            L_0x002e:
                if (r0 == 0) goto L_0x0035
                T r0 = r4.RatingCompat
                r5.IconCompatParcelizer(r0)
            L_0x0035:
                r4.setHasDecor = r2
                goto L_0x005a
            L_0x0038:
                o.setProcessedImageRepresentation r0 = p040o.setProcessedImageRepresentation.read
                T r3 = r4.RatingCompat
                if (r3 == 0) goto L_0x0040
                r3 = r1
                goto L_0x0041
            L_0x0040:
                r3 = r2
            L_0x0041:
                if (r3 == 0) goto L_0x0048
                T r3 = r4.RatingCompat
                r0.IconCompatParcelizer(r3)
            L_0x0048:
                if (r5 == 0) goto L_0x0052
                int r0 = r5.length()
                if (r0 == 0) goto L_0x0052
                r0 = r2
                goto L_0x0053
            L_0x0052:
                r0 = r1
            L_0x0053:
                if (r0 == 0) goto L_0x0056
                r5 = 0
            L_0x0056:
                r4.write = r5
                r4.setHasDecor = r1
            L_0x005a:
                o.setListenerCallbackThreadType r5 = new o.setListenerCallbackThreadType
                r5.<init>(r4)
                T r0 = r4.RatingCompat
                if (r0 == 0) goto L_0x0064
                goto L_0x0065
            L_0x0064:
                r1 = r2
            L_0x0065:
                if (r1 == 0) goto L_0x006c
                T r0 = r4.RatingCompat
                r5.IconCompatParcelizer(r0)
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.ImageProcessor.ProcessProgressEvent.MediaBrowserCompat$CustomActionResultReceiver(java.lang.String):void");
        }
    }

    /* renamed from: o.ImageProcessor$d */
    public final /* synthetic */ class C3487d implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ C9771x3ae934ff IconCompatParcelizer;
        private final /* synthetic */ Throwable write;

        public /* synthetic */ C3487d(C9771x3ae934ff isgPassportDetector$a$MediaBrowserCompat$CustomActionResultReceiver, Throwable th) {
            this.IconCompatParcelizer = isgPassportDetector$a$MediaBrowserCompat$CustomActionResultReceiver;
            this.write = th;
        }

        public final void IconCompatParcelizer(Object obj) {
            C9771x3ae934ff isgPassportDetector$a$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
            Throwable th = this.write;
            Check check = (Check) obj;
            check.aj_();
            check.write(isgPassportDetector$a$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new IpProgressClient(check)));
        }
    }

    /* renamed from: o.ImageProcessor$a */
    public final /* synthetic */ class C3484a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ IsgDetectionModule.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
        private final /* synthetic */ Throwable read;

        public /* synthetic */ C3484a(IsgDetectionModule.IconCompatParcelizer iconCompatParcelizer, Throwable th) {
            this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
            this.read = th;
        }

        public final void IconCompatParcelizer(Object obj) {
            IsgDetectionModule.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
            Throwable th = this.read;
            Check$MediaBrowserCompat$CustomActionResultReceiver check$MediaBrowserCompat$CustomActionResultReceiver = (Check$MediaBrowserCompat$CustomActionResultReceiver) obj;
            check$MediaBrowserCompat$CustomActionResultReceiver.aj_();
            check$MediaBrowserCompat$CustomActionResultReceiver.write(IsgDetectionModule.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new IsgDocumentDetector_Factory(check$MediaBrowserCompat$CustomActionResultReceiver)));
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        C1162x44a04885 checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper = (C1162x44a04885) obj;
        List<performUpdateApp> list = this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver;
        performUpdateApp[] performupdateappArr = new performUpdateApp[addImageOutEventListener$MediaBrowserCompat$ItemReceiver.read(list)];
        int i = 0;
        int i2 = 1;
        for (performUpdateApp next : list) {
            if (next.MediaBrowserCompat$SearchResultReceiver.booleanValue()) {
                performupdateappArr[i] = next;
                i += 2;
            } else {
                performupdateappArr[i2] = next;
                i2 += 2;
            }
        }
        checkExtractActivity_MembersInjector$MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(Arrays.asList(performupdateappArr));
    }
}
