package p040o;

import p040o.PassportCaptureModule;
import p040o.PassportCaptureModule.C6975b;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.getSheetID */
public abstract class getSheetID<T extends PassportCaptureModule.C6975b> extends writeUInt64NoTag<T> {
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    public String read;
    zziu.zzc write;

    /* access modifiers changed from: protected */
    public final ChequeInquiryDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return (ChequeInquiryDeepLinkActivity) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* renamed from: o.getSheetID$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
        private /* synthetic */ String MediaBrowserCompat$ItemReceiver;

        public read(String str) {
            this.MediaBrowserCompat$ItemReceiver = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            PassportCaptureModule.C6975b bVar = (PassportCaptureModule.C6975b) obj;
            if (this.MediaBrowserCompat$ItemReceiver.length() > 0) {
                bVar.IconCompatParcelizer();
            } else {
                bVar.MediaBrowserCompat$ItemReceiver();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getSheetID(RegularImmutableBiMap regularImmutableBiMap, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setitemicontintlist, "hmlGetCustomerTypeCase");
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    /* renamed from: o.getSheetID$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<ChequeInquiryDeepLinkActivity> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ChequeInquiryDeepLinkActivity();
        }
    }

    public void onDestroy() {
        ((ChequeInquiryDeepLinkActivity) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).dispose();
        super.onDestroy();
    }
}
