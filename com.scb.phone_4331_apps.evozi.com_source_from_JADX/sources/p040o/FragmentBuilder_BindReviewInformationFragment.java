package p040o;

/* renamed from: o.FragmentBuilder_BindReviewInformationFragment */
public final /* synthetic */ class FragmentBuilder_BindReviewInformationFragment implements BaseDiscoverFundFilterActivity {
    private final /* synthetic */ String IconCompatParcelizer;

    public /* synthetic */ FragmentBuilder_BindReviewInformationFragment(String str) {
        this.IconCompatParcelizer = str;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        String str = this.IconCompatParcelizer;
        Exception exc = (Exception) obj;
        Boolean bool = (Boolean) obj2;
        if (exc != null) {
            MyECouponActivity_ViewBinding.read(exc, FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_INSERTING_PROPERTY_INTO_DATABASE);
        }
        if (!Boolean.FALSE.equals(bool)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error saving offline interaction ");
        sb.append(str);
        MyECouponActivity_ViewBinding.write(sb.toString());
        return null;
    }
}
