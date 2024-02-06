package p040o;

import p040o.C10829Sizeof;

/* renamed from: o.licenseOperationFailed */
public final /* synthetic */ class licenseOperationFailed implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ C10829Sizeof.C37931 write;

    public /* synthetic */ licenseOperationFailed(C10829Sizeof.C37931 r1) {
        this.write = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof.C37931 r3 = this.write;
        getRemainingLicenseCount getremaininglicensecount = new getRemainingLicenseCount(r3);
        if (r3.RatingCompat != null) {
            getremaininglicensecount.IconCompatParcelizer(r3.RatingCompat);
        }
    }
}
