package p040o;

/* renamed from: o.FragmentBuilder_BindReviewAccountsFragment */
public final /* synthetic */ class FragmentBuilder_BindReviewAccountsFragment implements BaseDiscoverFundFilterActivity {
    private final /* synthetic */ long write;

    public /* synthetic */ FragmentBuilder_BindReviewAccountsFragment(long j) {
        this.write = j;
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        long j = this.write;
        Exception exc = (Exception) obj;
        Boolean bool = (Boolean) obj2;
        if (exc != null) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(exc);
        }
        if (!Boolean.FALSE.equals(bool)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Error deleting offline request id: ");
        sb.append(j);
        MyECouponActivity_ViewBinding.write(sb.toString());
        return null;
    }
}
