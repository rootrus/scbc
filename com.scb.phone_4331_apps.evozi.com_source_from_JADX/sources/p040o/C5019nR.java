package p040o;

import p040o.Lists;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nR */
public final class C5019nR extends writeUInt64NoTag<ServerProjectProvider.C70717> {
    /* access modifiers changed from: private */
    public final isTopPrivateDomain MediaBrowserCompat$ItemReceiver;
    public final Lists.TransformingSequentialList.C35951 read;

    /* renamed from: o.nR$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<mapType, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C5019nR IconCompatParcelizer;
        final /* synthetic */ setImportance MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(C5019nR nRVar, setImportance setimportance) {
            super(1);
            this.IconCompatParcelizer = nRVar;
            this.MediaBrowserCompat$ItemReceiver = setimportance;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final mapType maptype = (mapType) obj;
            onGetStartedClick.write((Object) maptype, "it");
            C5019nR.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            C5019nR nRVar = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70717>(this) {
                private /* synthetic */ IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((ServerProjectProvider.C70717) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(maptype, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver));
                }
            };
            if (nRVar.RatingCompat != null) {
                r1.IconCompatParcelizer(nRVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5019nR(Lists.TransformingSequentialList.C35951 r2, isTopPrivateDomain istopprivatedomain, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "remittanceController");
        onGetStartedClick.write((Object) istopprivatedomain, "remittanceDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = r2;
        this.MediaBrowserCompat$ItemReceiver = istopprivatedomain;
    }

    public final void onDestroy() {
        this.read.IconCompatParcelizer();
        super.onDestroy();
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5019nR nRVar) {
        if (nRVar.RatingCompat != null) {
            nRVar.RatingCompat.aj_();
        }
    }
}
