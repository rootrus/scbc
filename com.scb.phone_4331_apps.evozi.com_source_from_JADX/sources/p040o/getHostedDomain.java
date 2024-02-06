package p040o;

/* renamed from: o.getHostedDomain */
public final /* synthetic */ class getHostedDomain implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ createBundleFromClientSettings write;

    public /* synthetic */ getHostedDomain(createBundleFromClientSettings createbundlefromclientsettings) {
        this.write = createbundlefromclientsettings;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.write.read);
    }
}
