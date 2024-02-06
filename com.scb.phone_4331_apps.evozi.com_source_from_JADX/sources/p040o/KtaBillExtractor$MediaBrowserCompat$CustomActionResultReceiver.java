package p040o;

import p040o.access$2300;

/* renamed from: o.KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver */
final class KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getUuidUtf8Bytes> {
    final /* synthetic */ KtaBillExtractor IconCompatParcelizer;

    public final void onComplete() {
    }

    private KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver(KtaBillExtractor ktaBillExtractor) {
        this.IconCompatParcelizer = ktaBillExtractor;
    }

    /* synthetic */ KtaBillExtractor$MediaBrowserCompat$CustomActionResultReceiver(KtaBillExtractor ktaBillExtractor, byte b) {
        this(ktaBillExtractor);
    }

    public final /* synthetic */ void onNext(Object obj) {
        getUuidUtf8Bytes getuuidutf8bytes = (getUuidUtf8Bytes) obj;
        boolean z = false;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            if (this.IconCompatParcelizer.MediaBrowserCompat$MediaItem.IconCompatParcelizer.AlertController$RecycleListView() != null) {
                getuuidutf8bytes.f2601x50fd9e4a = true;
            }
            KtaBillExtractor ktaBillExtractor = this.IconCompatParcelizer;
            proxyGetIExtractionServerRtti proxygetiextractionserverrtti = new proxyGetIExtractionServerRtti(getuuidutf8bytes);
            if (ktaBillExtractor.RatingCompat != null) {
                z = true;
            }
            if (z) {
                proxygetiextractionserverrtti.IconCompatParcelizer(ktaBillExtractor.RatingCompat);
            }
            boolean unused = this.IconCompatParcelizer.write = false;
        }
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            boolean unused = this.IconCompatParcelizer.write = false;
            if (writeUInt64NoTag.IconCompatParcelizer(th)) {
                KtaBillExtractor ktaBillExtractor = this.IconCompatParcelizer;
                injectExtractionParameters injectextractionparameters = injectExtractionParameters.MediaBrowserCompat$ItemReceiver;
                if (ktaBillExtractor.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    injectextractionparameters.IconCompatParcelizer(ktaBillExtractor.RatingCompat);
                }
            } else if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
                KtaBillExtractor ktaBillExtractor2 = this.IconCompatParcelizer;
                BillCaptureModule_GetIExtractionServerKtaFactory billCaptureModule_GetIExtractionServerKtaFactory = new BillCaptureModule_GetIExtractionServerKtaFactory(this, th);
                if (ktaBillExtractor2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    billCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer(ktaBillExtractor2.RatingCompat);
                }
            } else if (writeUInt64NoTag.read(th)) {
                KtaBillExtractor ktaBillExtractor3 = this.IconCompatParcelizer;
                ktaBillExtractor3.MediaBrowserCompat$ItemReceiver(ktaBillExtractor3.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
                KtaBillExtractor ktaBillExtractor4 = this.IconCompatParcelizer;
                getDueDate getduedate = getDueDate.IconCompatParcelizer;
                if (ktaBillExtractor4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getduedate.IconCompatParcelizer(ktaBillExtractor4.RatingCompat);
                }
            } else {
                KtaBillExtractor ktaBillExtractor5 = this.IconCompatParcelizer;
                ktaBillExtractor5.MediaBrowserCompat$ItemReceiver(ktaBillExtractor5.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
                KtaBillExtractor ktaBillExtractor6 = this.IconCompatParcelizer;
                getDueDate getduedate2 = getDueDate.IconCompatParcelizer;
                if (ktaBillExtractor6.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getduedate2.IconCompatParcelizer(ktaBillExtractor6.RatingCompat);
                }
            }
        }
    }
}
