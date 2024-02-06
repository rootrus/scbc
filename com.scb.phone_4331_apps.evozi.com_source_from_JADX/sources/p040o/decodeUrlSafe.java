package p040o;

/* renamed from: o.decodeUrlSafe */
public final /* synthetic */ class decodeUrlSafe implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindDepositMoreInfoFragment IconCompatParcelizer;

    public /* synthetic */ decodeUrlSafe(FragmentBuilder_BindDepositMoreInfoFragment fragmentBuilder_BindDepositMoreInfoFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindDepositMoreInfoFragment;
    }

    public final Object write(Object obj) {
        return DebitCardResetOtpActivity.just(this.IconCompatParcelizer.write.read(((getImageAssetsFolder) obj).IconCompatParcelizer));
    }
}
