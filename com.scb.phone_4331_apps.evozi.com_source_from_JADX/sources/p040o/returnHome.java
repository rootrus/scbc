package p040o;

/* renamed from: o.returnHome */
public final class returnHome extends ReviewInfoResultActivity {
    public static final returnHome IconCompatParcelizer;
    private static final MwBusinessDetailsActivity read;

    public final String toString() {
        return "DefaultDispatcher";
    }

    static {
        returnHome returnhome = new returnHome();
        IconCompatParcelizer = returnhome;
        int MediaBrowserCompat$CustomActionResultReceiver = EkycSuccessActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver();
        if (64 >= MediaBrowserCompat$CustomActionResultReceiver) {
            MediaBrowserCompat$CustomActionResultReceiver = 64;
        }
        boolean z = false;
        int IconCompatParcelizer2 = AlertController$RecycleListView.IconCompatParcelizer("kotlinx.coroutines.io.parallelism", MediaBrowserCompat$CustomActionResultReceiver, 0, 0, 12);
        if (IconCompatParcelizer2 > 0) {
            z = true;
        }
        if (z) {
            read = new NationalIdHelpActivity(returnhome, IconCompatParcelizer2, FatcaErrorActivity.PROBABLY_BLOCKING);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected positive parallelism level, but have ");
        sb.append(IconCompatParcelizer2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    private returnHome() {
    }

    public static MwBusinessDetailsActivity write() {
        return read;
    }

    public final void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }
}
