package p040o;

/* renamed from: o.EnterProxyActivity */
public final class EnterProxyActivity implements Cloneable {
    public static final EnterProxyActivity IconCompatParcelizer;
    public final int MediaBrowserCompat$ItemReceiver;
    public final int read;

    static {
        EnterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver enterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver = new EnterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver();
        IconCompatParcelizer = new EnterProxyActivity(enterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver.write, enterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
    }

    public EnterProxyActivity(int i, int i2) {
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[maxLineLength=");
        sb.append(this.read);
        sb.append(", maxHeaderCount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("]");
        return sb.toString();
    }

    public static EnterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver read() {
        return new EnterProxyActivity$MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (EnterProxyActivity) super.clone();
    }
}
