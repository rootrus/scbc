package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.domain.errors.RetrofitException;
import p040o.AutoValue_CrashlyticsReport_Session_Application;
import p040o.Functions;
import p040o.ILocationSourceDelegate;
import p040o.ServerProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.eH */
public final class C4339eH extends writeUInt64NoTag<ServerProjectProvider.C70729.write> {
    public final ChequeInquiryDeepLinkActivity IconCompatParcelizer = new ChequeInquiryDeepLinkActivity();
    public final Functions.PredicateFunction MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final CountingInputStream read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4339eH(Functions.PredicateFunction predicateFunction, CountingInputStream countingInputStream, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) predicateFunction, "payNowConfirmationCase");
        onGetStartedClick.write((Object) countingInputStream, "payNowSuccessDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.MediaBrowserCompat$ItemReceiver = predicateFunction;
        this.read = countingInputStream;
    }

    /* renamed from: o.eH$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements ActivateChequeDeepLinkActivity<setOnMapLoadedCallback> {
        final /* synthetic */ C4339eH MediaBrowserCompat$ItemReceiver;
        final /* synthetic */ AutoValue_CrashlyticsReport_Session_Application.Builder write;

        public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
            onGetStartedClick.write((Object) bulkTransferDeepLinkActivity, "disposable");
        }

        /* renamed from: o.eH$IconCompatParcelizer$IconCompatParcelizer  reason: collision with other inner class name */
        static final class C10815IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70729.write> {
            private /* synthetic */ IconCompatParcelizer IconCompatParcelizer;
            private /* synthetic */ ILocationSourceDelegate.zza MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ Throwable write;

            C10815IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, ILocationSourceDelegate.zza zza, Throwable th) {
                this.IconCompatParcelizer = iconCompatParcelizer;
                this.MediaBrowserCompat$CustomActionResultReceiver = zza;
                this.write = th;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
                if (r0.equals("3018") != false) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
                if (r0.equals("3003") != false) goto L_0x0047;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
                p040o.C4339eH.MediaBrowserCompat$CustomActionResultReceiver(r3.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
                p040o.C4339eH.IconCompatParcelizer(r3.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver, r3.write, new p040o.C4339eH.IconCompatParcelizer.C10815IconCompatParcelizer.C43423());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
                return;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
                if (r0.equals("7001") != false) goto L_0x0047;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r4) {
                /*
                    r3 = this;
                    o.ServerProjectProvider$9$write r4 = (p040o.ServerProjectProvider.C70729.write) r4
                    o.ILocationSourceDelegate$zza r0 = r3.MediaBrowserCompat$CustomActionResultReceiver
                    if (r0 == 0) goto L_0x0009
                    java.lang.String r0 = r0.IconCompatParcelizer
                    goto L_0x000a
                L_0x0009:
                    r0 = 0
                L_0x000a:
                    if (r0 == 0) goto L_0x0065
                    int r1 = r0.hashCode()
                    switch(r1) {
                        case 1567008: goto L_0x003f;
                        case 1567037: goto L_0x0026;
                        case 1567044: goto L_0x001d;
                        case 1686170: goto L_0x0014;
                        default: goto L_0x0013;
                    }
                L_0x0013:
                    goto L_0x0065
                L_0x0014:
                    java.lang.String r1 = "7001"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0065
                    goto L_0x0047
                L_0x001d:
                    java.lang.String r1 = "3018"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0065
                    goto L_0x0047
                L_0x0026:
                    java.lang.String r1 = "3011"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0065
                    o.eH$IconCompatParcelizer r0 = r3.IconCompatParcelizer
                    o.eH r0 = r0.MediaBrowserCompat$ItemReceiver
                    java.lang.Throwable r1 = r3.write
                    o.eH$IconCompatParcelizer$IconCompatParcelizer$1 r2 = new o.eH$IconCompatParcelizer$IconCompatParcelizer$1
                    r2.<init>(r4)
                    java.lang.Runnable r2 = (java.lang.Runnable) r2
                    r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2))
                    return
                L_0x003f:
                    java.lang.String r1 = "3003"
                    boolean r0 = r0.equals(r1)
                    if (r0 == 0) goto L_0x0065
                L_0x0047:
                    o.eH$IconCompatParcelizer r0 = r3.IconCompatParcelizer
                    o.eH r0 = r0.MediaBrowserCompat$ItemReceiver
                    o.Functions$PredicateFunction r0 = r0.MediaBrowserCompat$ItemReceiver
                    o.getDelegateIterator r0 = r0.MediaBrowserCompat$ItemReceiver
                    r0.IconCompatParcelizer()
                    o.eH$IconCompatParcelizer r0 = r3.IconCompatParcelizer
                    o.eH r0 = r0.MediaBrowserCompat$ItemReceiver
                    java.lang.Throwable r1 = r3.write
                    o.eH$IconCompatParcelizer$IconCompatParcelizer$3 r2 = new o.eH$IconCompatParcelizer$IconCompatParcelizer$3
                    r2.<init>(r4)
                    java.lang.Runnable r2 = (java.lang.Runnable) r2
                    r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2))
                    return
                L_0x0065:
                    o.eH$IconCompatParcelizer r0 = r3.IconCompatParcelizer
                    o.eH r0 = r0.MediaBrowserCompat$ItemReceiver
                    o.Functions$PredicateFunction r0 = r0.MediaBrowserCompat$ItemReceiver
                    o.getDelegateIterator r0 = r0.MediaBrowserCompat$ItemReceiver
                    r0.IconCompatParcelizer()
                    o.eH$IconCompatParcelizer r0 = r3.IconCompatParcelizer
                    o.eH r0 = r0.MediaBrowserCompat$ItemReceiver
                    java.lang.Throwable r1 = r3.write
                    boolean r0 = r0.MediaBrowserCompat$SearchResultReceiver(r1)
                    if (r0 == 0) goto L_0x008f
                    o.eH$IconCompatParcelizer r0 = r3.IconCompatParcelizer
                    o.eH r0 = r0.MediaBrowserCompat$ItemReceiver
                    java.lang.Throwable r1 = r3.write
                    o.eH$IconCompatParcelizer$IconCompatParcelizer$5 r2 = new o.eH$IconCompatParcelizer$IconCompatParcelizer$5
                    r2.<init>(r4)
                    java.lang.Runnable r2 = (java.lang.Runnable) r2
                    r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2))
                    return
                L_0x008f:
                    o.eH$IconCompatParcelizer r0 = r3.IconCompatParcelizer
                    o.eH r0 = r0.MediaBrowserCompat$ItemReceiver
                    java.lang.Throwable r1 = r3.write
                    o.eH$IconCompatParcelizer$IconCompatParcelizer$2 r2 = new o.eH$IconCompatParcelizer$IconCompatParcelizer$2
                    r2.<init>(r4)
                    java.lang.Runnable r2 = (java.lang.Runnable) r2
                    r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2))
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.C4339eH.IconCompatParcelizer.C10815IconCompatParcelizer.IconCompatParcelizer(java.lang.Object):void");
            }
        }

        public IconCompatParcelizer(C4339eH eHVar, AutoValue_CrashlyticsReport_Session_Application.Builder builder) {
            this.MediaBrowserCompat$ItemReceiver = eHVar;
            this.write = builder;
        }

        public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
            setOnMapLoadedCallback setonmaploadedcallback = (setOnMapLoadedCallback) obj;
            onGetStartedClick.write((Object) setonmaploadedcallback, "payNowConfirmation");
            C4339eH.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
            C4339eH eHVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer eh_iconcompatparcelizer_mediabrowsercompat_itemreceiver = new eH$IconCompatParcelizer$MediaBrowserCompat$ItemReceiver(this, setonmaploadedcallback);
            if (eHVar.RatingCompat != null) {
                eh_iconcompatparcelizer_mediabrowsercompat_itemreceiver.IconCompatParcelizer(eHVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            onGetStartedClick.write((Object) th, "throwable");
            C4339eH.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
            ILocationSourceDelegate.zza MediaDescriptionCompat = C4339eH.MediaDescriptionCompat(th);
            if (MediaDescriptionCompat == null || (th instanceof EntityMappingException)) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
            C4339eH eHVar = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C10815IconCompatParcelizer(this, MediaDescriptionCompat, th);
            if (eHVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(eHVar.RatingCompat);
            }
        }
    }

    public static final /* synthetic */ ILocationSourceDelegate.zza MediaDescriptionCompat(Throwable th) {
        ILocationSourceDelegate iLocationSourceDelegate;
        if (!(th instanceof RetrofitException) || (iLocationSourceDelegate = ((RetrofitException) th).IconCompatParcelizer) == null) {
            return null;
        }
        return iLocationSourceDelegate.write;
    }

    public static final /* synthetic */ void IconCompatParcelizer(C4339eH eHVar) {
        if (eHVar.RatingCompat != null) {
            eHVar.RatingCompat.aj_();
        }
    }
}
