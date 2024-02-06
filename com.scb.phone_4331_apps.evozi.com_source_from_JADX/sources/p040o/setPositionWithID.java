package p040o;

/* renamed from: o.setPositionWithID */
public final /* synthetic */ class setPositionWithID implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ including IconCompatParcelizer;
    private final /* synthetic */ ImmutableMultiset MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setPositionWithID(including including, ImmutableMultiset immutableMultiset) {
        this.IconCompatParcelizer = including;
        this.MediaBrowserCompat$ItemReceiver = immutableMultiset;
    }

    public final Object write(Object obj) {
        including including = this.IconCompatParcelizer;
        Boolean bool = (Boolean) obj;
        String str = this.MediaBrowserCompat$ItemReceiver.read;
        if (true ^ (str == null || str.length() == 0)) {
            including.read.MediaBrowserCompat$SearchResultReceiver(str.toLowerCase());
        }
        return DebitCardResetOtpActivity.just(bool);
    }
}
