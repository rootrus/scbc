package p040o;

/* renamed from: o.ReviewCommonActivity */
public final class ReviewCommonActivity implements ScbMapActivity {
    public static final ReviewCommonActivity read = new ReviewCommonActivity();

    private ReviewCommonActivity() {
    }

    public final MwBusinessDetailsActivity IconCompatParcelizer() {
        return MwCreateQrActivity.read();
    }

    public final MwBusinessDetailsActivity MediaBrowserCompat$CustomActionResultReceiver() {
        return MwCreateQrActivity.IconCompatParcelizer();
    }

    public final MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver() {
        return MwCreateQrActivity.write();
    }
}
