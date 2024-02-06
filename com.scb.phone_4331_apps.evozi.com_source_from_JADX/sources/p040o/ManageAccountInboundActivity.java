package p040o;

/* renamed from: o.ManageAccountInboundActivity */
public final class ManageAccountInboundActivity extends ReviewAccountsActivity {
    public static final ManageAccountInboundActivity IconCompatParcelizer = new ManageAccountInboundActivity(1, 1);
    private static ManageAccountInboundActivity MediaBrowserCompat$SearchResultReceiver = new ManageAccountInboundActivity(0, 9);
    public static final ManageAccountInboundActivity write = new ManageAccountInboundActivity(1, 0);

    private ManageAccountInboundActivity(int i, int i2) {
        super("HTTP", i, i2);
    }

    public final ReviewAccountsActivity read(int i, int i2) {
        if (i == this.MediaBrowserCompat$CustomActionResultReceiver && i2 == this.read) {
            return this;
        }
        if (i == 1) {
            if (i2 == 0) {
                return write;
            }
            if (i2 == 1) {
                return IconCompatParcelizer;
            }
        }
        if (i == 0 && i2 == 9) {
            return MediaBrowserCompat$SearchResultReceiver;
        }
        return new ManageAccountInboundActivity(i, i2);
    }
}
