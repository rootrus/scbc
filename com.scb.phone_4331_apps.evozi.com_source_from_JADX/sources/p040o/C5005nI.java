package p040o;

import p040o.Lists;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nI */
public final class C5005nI extends writeUInt64NoTag<ServerProjectProvider.Error> {
    /* access modifiers changed from: private */
    public final isTopPrivateDomain MediaBrowserCompat$ItemReceiver;
    public final Lists.TransformingSequentialList.C35951 read;

    /* renamed from: o.nI$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<mapType, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C5005nI MediaBrowserCompat$CustomActionResultReceiver;
        final /* synthetic */ setImportance read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(C5005nI nIVar, setImportance setimportance) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = nIVar;
            this.read = setimportance;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final mapType maptype = (mapType) obj;
            onGetStartedClick.write((Object) maptype, "it");
            C5005nI.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            C5005nI nIVar = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.Error>(this) {
                private /* synthetic */ IconCompatParcelizer write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((ServerProjectProvider.Error) obj).write(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(maptype, this.write.read));
                }
            };
            if (nIVar.RatingCompat != null) {
                r1.IconCompatParcelizer(nIVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nI$read */
    public static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C5005nI read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(C5005nI nIVar) {
            super(1);
            this.read = nIVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "it");
            C5005nI.MediaBrowserCompat$CustomActionResultReceiver(this.read);
            if (writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th) || writeUInt64NoTag.read(th) || writeUInt64NoTag.write(th)) {
                C5005nI nIVar = this.read;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.Error>(this) {
                    private /* synthetic */ read write;

                    {
                        this.write = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        RegularImmutableBiMap unused = this.write.read.MediaBrowserCompat$CustomActionResultReceiver;
                        String IconCompatParcelizer = RegularImmutableBiMap.IconCompatParcelizer(th);
                        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "errorDisplayMapper.transformError(it)");
                        ((ServerProjectProvider.Error) obj).read(IconCompatParcelizer);
                    }
                };
                if (nIVar.RatingCompat != null) {
                    r1.IconCompatParcelizer(nIVar.RatingCompat);
                }
            } else {
                this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                    private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    public final void run() {
                        C5005nI nIVar = this.MediaBrowserCompat$CustomActionResultReceiver.read;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C50085.read;
                        if (nIVar.RatingCompat != null) {
                            iconCompatParcelizer.IconCompatParcelizer(nIVar.RatingCompat);
                        }
                    }
                }));
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5005nI(Lists.TransformingSequentialList.C35951 r2, isTopPrivateDomain istopprivatedomain, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "remittanceController");
        onGetStartedClick.write((Object) istopprivatedomain, "remittanceDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = r2;
        this.MediaBrowserCompat$ItemReceiver = istopprivatedomain;
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5005nI nIVar) {
        if (nIVar.RatingCompat != null) {
            nIVar.RatingCompat.aj_();
        }
    }
}
