package p040o;

/* renamed from: o.FragmentBuilder_BindReviewCommonFragment */
public final /* synthetic */ class FragmentBuilder_BindReviewCommonFragment implements BaseDiscoverFundFilterActivity {
    public static final /* synthetic */ FragmentBuilder_BindReviewCommonFragment MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindReviewCommonFragment();

    private /* synthetic */ FragmentBuilder_BindReviewCommonFragment() {
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        Exception exc = (Exception) obj;
        Boolean bool = (Boolean) obj2;
        if (exc != null) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(exc);
        }
        if (!Boolean.FALSE.equals(bool)) {
            return null;
        }
        MyECouponActivity_ViewBinding.write("Error clearing offline interactions for opt out.");
        return null;
    }
}
