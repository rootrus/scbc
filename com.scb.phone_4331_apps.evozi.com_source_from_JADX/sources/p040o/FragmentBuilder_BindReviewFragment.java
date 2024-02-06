package p040o;

/* renamed from: o.FragmentBuilder_BindReviewFragment */
public final /* synthetic */ class FragmentBuilder_BindReviewFragment implements BaseDiscoverFundFilterActivity {
    private final /* synthetic */ String write;

    public /* synthetic */ FragmentBuilder_BindReviewFragment(String str) {
        this.write = str;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        String str = this.write;
        Exception exc = (Exception) obj;
        Boolean bool = (Boolean) obj2;
        if (exc != null) {
            MyECouponActivity_ViewBinding.read(exc, FragmentBuilder_BindMailingAddressSuccessfulFragment.ERROR_INSERTING_INTERACTION_INTO_DATABASE);
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
