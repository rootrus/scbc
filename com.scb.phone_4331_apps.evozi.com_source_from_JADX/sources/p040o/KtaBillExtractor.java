package p040o;

import p040o.AppMeasurementSdk;
import p040o.Callables;
import p040o.CrashlyticsReport;
import p040o.access$2300;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.KtaBillExtractor */
public class KtaBillExtractor extends writeUInt64NoTag<getTopLeftCornerWidth.setItemInvoker> {
    final FakeTimeLimiter IconCompatParcelizer;
    final Callables.C31391 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final AppMeasurementSdk.OnEventListener MediaBrowserCompat$MediaItem;
    private final closeDetectorJni read;
    /* access modifiers changed from: private */
    public boolean write;

    @HmlPinActivity
    public KtaBillExtractor(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.OnEventListener onEventListener, closeDetectorJni closedetectorjni, FakeTimeLimiter fakeTimeLimiter, Callables.C31391 r5) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$MediaItem = onEventListener;
        this.read = closedetectorjni;
        this.IconCompatParcelizer = fakeTimeLimiter;
        this.MediaBrowserCompat$ItemReceiver = r5;
    }

    public void onDestroy() {
        super.onDestroy();
        AppMeasurementSdk.OnEventListener onEventListener = this.MediaBrowserCompat$MediaItem;
        if (!onEventListener.MediaBrowserCompat$MediaItem.isDisposed()) {
            onEventListener.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(p040o.setUuidFromUtf8Bytes r7, p040o.IGoogleMapDelegate r8, java.lang.String r9, java.lang.String r10) {
        /*
            r6 = this;
            boolean r0 = r6.write
            if (r0 != 0) goto L_0x0168
            r0 = 1
            r6.write = r0
            o.IGoogleMapDelegate r0 = p040o.IGoogleMapDelegate.PROMPTPAY
            java.lang.String r1 = ""
            if (r8 != r0) goto L_0x0096
            java.lang.String r8 = r7.MediaBrowserCompat$MediaItem()
            o.AppMeasurementSdk$OnEventListener r0 = r6.MediaBrowserCompat$MediaItem
            o.AbstractMultimap$MultisetEntry r0 = r0.read
            o.Interner r0 = r0.MediaBrowserCompat$CustomActionResultReceiver()
            o.AppMeasurementSdk$OnEventListener r2 = r6.MediaBrowserCompat$MediaItem
            o.AbstractMultimap$MultisetEntry r2 = r2.read
            o.animateCameraWithDurationAndCallback r2 = r2.read()
            if (r2 != 0) goto L_0x002a
            o.immutableSortedUniqueCopy r8 = new o.immutableSortedUniqueCopy
            r8.<init>()
            goto L_0x010c
        L_0x002a:
            o.immutableSortedUniqueCopy r3 = new o.immutableSortedUniqueCopy
            r3.<init>()
            java.lang.String r4 = r2.setHasDecor
            r3.setBackgroundResource = r4
            java.lang.String r4 = r0.MediaBrowserCompat$ItemReceiver
            r3.MediaBrowserCompat$ItemReceiver = r4
            java.lang.String r4 = r0.IconCompatParcelizer
            r3.IconCompatParcelizer = r4
            java.lang.String r4 = r2.read
            r3.write = r4
            java.lang.String r4 = r2.write
            r3.MediaBrowserCompat$CustomActionResultReceiver = r4
            java.lang.String r4 = r2.MediaBrowserCompat$ItemReceiver
            r3.read = r4
            java.lang.String r4 = r2.MediaBrowserCompat$CustomActionResultReceiver
            r3.MediaDescriptionCompat = r4
            java.lang.String r4 = r2.IconCompatParcelizer
            r3.RatingCompat = r4
            java.lang.String r4 = r2.MediaBrowserCompat$MediaItem
            r3.MediaMetadataCompat = r4
            java.lang.String r4 = r2.ParcelableVolumeInfo
            r3.ParcelableVolumeInfo = r4
            double r4 = r2.PlaybackStateCompat
            r3.MediaSessionCompat$QueueItem = r4
            java.lang.String r4 = r2.MediaSessionCompat$QueueItem
            r3.f2866x50fd9e4a = r4
            double r4 = r2.MediaSessionCompat$ResultReceiverWrapper
            r3.PlaybackStateCompat$CustomAction = r4
            double r4 = r2.MediaMetadataCompat
            r3.MediaBrowserCompat$SearchResultReceiver = r4
            double r4 = r2.MediaDescriptionCompat
            r3.MediaSessionCompat$Token = r4
            java.lang.String r4 = r0.read
            java.lang.Double r4 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r4)
            double r4 = r4.doubleValue()
            java.lang.String r4 = p040o.removeIfFromRandomAccessList.read((double) r4)
            r3.MediaBrowserCompat$MediaItem = r4
            java.lang.String r4 = r0.RatingCompat
            r3.Keep = r4
            java.lang.String r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
            r3.MediaSessionCompat$ResultReceiverWrapper = r0
            java.lang.String r0 = r2.Keep
            if (r0 != 0) goto L_0x0088
            r0 = r1
        L_0x0088:
            r3.PlaybackStateCompat = r0
            java.lang.String r0 = r2.PlaybackStateCompat$CustomAction
            if (r0 != 0) goto L_0x008f
            r0 = r1
        L_0x008f:
            r3.setHasDecor = r0
            r3.AlertController$RecycleListView = r8
        L_0x0093:
            r8 = r3
            goto L_0x010c
        L_0x0096:
            java.lang.String r8 = r7.MediaBrowserCompat$MediaItem()
            o.AppMeasurementSdk$OnEventListener r0 = r6.MediaBrowserCompat$MediaItem
            o.AbstractMultimap$MultisetEntry r0 = r0.read
            o.ImmutableSortedMapFauxverideShim r0 = r0.MediaBrowserCompat$ItemReceiver()
            o.AppMeasurementSdk$OnEventListener r2 = r6.MediaBrowserCompat$MediaItem
            o.AbstractMultimap$MultisetEntry r2 = r2.read
            o.animateCameraWithDurationAndCallback r2 = r2.read()
            if (r2 != 0) goto L_0x00b2
            o.immutableSortedUniqueCopy r8 = new o.immutableSortedUniqueCopy
            r8.<init>()
            goto L_0x010c
        L_0x00b2:
            o.immutableSortedUniqueCopy r3 = new o.immutableSortedUniqueCopy
            r3.<init>()
            java.lang.String r4 = r2.setHasDecor
            r3.setBackgroundResource = r4
            java.lang.String r4 = r0.write
            r3.MediaBrowserCompat$ItemReceiver = r4
            java.lang.String r4 = r0.read
            r3.IconCompatParcelizer = r4
            java.lang.String r4 = r2.read
            r3.write = r4
            java.lang.String r4 = r2.write
            r3.MediaBrowserCompat$CustomActionResultReceiver = r4
            java.lang.String r4 = r2.MediaBrowserCompat$ItemReceiver
            r3.read = r4
            java.lang.String r4 = r2.IconCompatParcelizer
            r3.RatingCompat = r4
            java.lang.String r4 = r2.ParcelableVolumeInfo
            r3.ParcelableVolumeInfo = r4
            double r4 = r2.PlaybackStateCompat
            r3.MediaSessionCompat$QueueItem = r4
            java.lang.String r4 = r2.MediaSessionCompat$QueueItem
            r3.f2866x50fd9e4a = r4
            double r4 = r2.MediaSessionCompat$ResultReceiverWrapper
            r3.PlaybackStateCompat$CustomAction = r4
            double r4 = r2.MediaMetadataCompat
            r3.MediaBrowserCompat$SearchResultReceiver = r4
            double r4 = r2.MediaDescriptionCompat
            r3.MediaSessionCompat$Token = r4
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver
            java.lang.Double r0 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r0)
            double r4 = r0.doubleValue()
            java.lang.String r0 = p040o.removeIfFromRandomAccessList.read((double) r4)
            r3.MediaBrowserCompat$MediaItem = r0
            java.lang.String r0 = r2.Keep
            if (r0 != 0) goto L_0x0100
            r0 = r1
        L_0x0100:
            r3.PlaybackStateCompat = r0
            java.lang.String r0 = r2.PlaybackStateCompat$CustomAction
            if (r0 != 0) goto L_0x0107
            r0 = r1
        L_0x0107:
            r3.setHasDecor = r0
            r3.AlertController$RecycleListView = r8
            goto L_0x0093
        L_0x010c:
            java.lang.String r0 = r7.MediaDescriptionCompat()
            java.lang.String r2 = "FIXED_TRANSFER"
            boolean r0 = r2.equals(r0)
            r2 = 0
            if (r0 == 0) goto L_0x014d
            o.closeDetectorJni r8 = r6.read
            java.lang.String r0 = r7.MediaBrowserCompat$MediaItem()
            o.AbstractMultimap$MultisetEntry r3 = r8.MediaBrowserCompat$ItemReceiver
            o.setIndoorLevelPickerEnabled r3 = r3.MediaDescriptionCompat()
            if (r3 != 0) goto L_0x012d
            o.Interners$1 r0 = new o.Interners$1
            r0.<init>(r1)
            goto L_0x0133
        L_0x012d:
            o.Interners$1 r1 = new o.Interners$1
            r1.<init>(r0)
            r0 = r1
        L_0x0133:
            o.AbstractMultimap$MultisetEntry r8 = r8.MediaBrowserCompat$ItemReceiver
            o.DebitCardResetOtpActivity r8 = r8.MediaBrowserCompat$ItemReceiver(r0, r9, r10)
            o.proxyGetIBillDeserializerRtti r9 = new o.proxyGetIBillDeserializerRtti
            r9.<init>(r6, r7)
            o.DebitCardResetOtpActivity r7 = r8.map(r9)
            o.closeDetectorJni r8 = r6.read
            o.KtaBillExtractor$IconCompatParcelizer r9 = new o.KtaBillExtractor$IconCompatParcelizer
            r9.<init>(r6, r2)
            r8.write(r7, r9)
            return
        L_0x014d:
            o.AppMeasurementSdk$OnEventListener r0 = r6.MediaBrowserCompat$MediaItem
            o.AbstractMultimap$MultisetEntry r0 = r0.read
            o.DebitCardResetOtpActivity r8 = r0.IconCompatParcelizer(r8, r9, r10)
            o.BillCaptureModule_GetIExtractionServerRttiFactory r9 = new o.BillCaptureModule_GetIExtractionServerRttiFactory
            r9.<init>(r6, r7)
            o.DebitCardResetOtpActivity r7 = r8.map(r9)
            o.AppMeasurementSdk$OnEventListener r8 = r6.MediaBrowserCompat$MediaItem
            o.KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver r9 = new o.KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver
            r9.<init>(r6, r2)
            r8.write(r7, r9)
        L_0x0168:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.KtaBillExtractor.MediaBrowserCompat$CustomActionResultReceiver(o.setUuidFromUtf8Bytes, o.IGoogleMapDelegate, java.lang.String, java.lang.String):void");
    }

    /* renamed from: o.KtaBillExtractor$IconCompatParcelizer */
    final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<CrashlyticsReport.Session.Event.Application> {
        public final void onComplete() {
        }

        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(KtaBillExtractor ktaBillExtractor, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
            boolean z = true;
            if (KtaBillExtractor.this.RatingCompat != null) {
                KtaBillExtractor ktaBillExtractor = KtaBillExtractor.this;
                proxyGetIExceptionResponseDeserializerRtti proxygetiexceptionresponsedeserializerrtti = new proxyGetIExceptionResponseDeserializerRtti(application);
                if (ktaBillExtractor.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    proxygetiexceptionresponsedeserializerrtti.IconCompatParcelizer(ktaBillExtractor.RatingCompat);
                }
                boolean unused = KtaBillExtractor.this.write = false;
            }
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if (KtaBillExtractor.this.RatingCompat != null) {
                boolean unused = KtaBillExtractor.this.write = false;
                if (writeUInt64NoTag.IconCompatParcelizer(th)) {
                    KtaBillExtractor ktaBillExtractor = KtaBillExtractor.this;
                    injectExtractionParameters injectextractionparameters = injectExtractionParameters.MediaBrowserCompat$ItemReceiver;
                    if (ktaBillExtractor.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        injectextractionparameters.IconCompatParcelizer(ktaBillExtractor.RatingCompat);
                    }
                } else if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
                    KtaBillExtractor ktaBillExtractor2 = KtaBillExtractor.this;
                    proxyGetIExtractionServerKta proxygetiextractionserverkta = new proxyGetIExtractionServerKta(this, th);
                    if (ktaBillExtractor2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        proxygetiextractionserverkta.IconCompatParcelizer(ktaBillExtractor2.RatingCompat);
                    }
                } else if (writeUInt64NoTag.read(th)) {
                    KtaBillExtractor ktaBillExtractor3 = KtaBillExtractor.this;
                    ktaBillExtractor3.MediaBrowserCompat$ItemReceiver(ktaBillExtractor3.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
                    KtaBillExtractor ktaBillExtractor4 = KtaBillExtractor.this;
                    getDueDate getduedate = getDueDate.IconCompatParcelizer;
                    if (ktaBillExtractor4.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getduedate.IconCompatParcelizer(ktaBillExtractor4.RatingCompat);
                    }
                } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(th, "9000")) {
                    KtaBillExtractor ktaBillExtractor5 = KtaBillExtractor.this;
                    ktaBillExtractor5.MediaBrowserCompat$ItemReceiver(ktaBillExtractor5.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
                } else {
                    KtaBillExtractor ktaBillExtractor6 = KtaBillExtractor.this;
                    ktaBillExtractor6.MediaBrowserCompat$ItemReceiver(ktaBillExtractor6.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
                    KtaBillExtractor ktaBillExtractor7 = KtaBillExtractor.this;
                    getDueDate getduedate2 = getDueDate.IconCompatParcelizer;
                    if (ktaBillExtractor7.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getduedate2.IconCompatParcelizer(ktaBillExtractor7.RatingCompat);
                    }
                }
            }
        }

        static /* synthetic */ void read(CrashlyticsReport.Session.Event.Application application, getTopLeftCornerWidth.setItemInvoker setiteminvoker) {
            setiteminvoker.MediaBrowserCompat$CustomActionResultReceiver(application);
            setiteminvoker.aj_();
        }
    }
}
