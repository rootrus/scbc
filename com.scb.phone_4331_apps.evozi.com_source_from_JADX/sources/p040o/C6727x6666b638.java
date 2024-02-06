package p040o;

/* renamed from: o.FragmentBuilder_BindRemittanceInputFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6727x6666b638 extends FragmentBuilder_BindRemittanceInputFragment {
    private final Throwable MediaBrowserCompat$CustomActionResultReceiver;
    private final FragmentBuilder_BindMerchantWalletSelectorFragment write = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6727x6666b638)) {
            return false;
        }
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) null, (Object) null) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((C6727x6666b638) obj).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        Throwable th = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (th != null ? th.hashCode() : 0) + 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadAppInstallFailure(systemCode=");
        sb.append((Object) null);
        sb.append(", throwable=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C6727x6666b638(Throwable th) {
        super((byte) 0);
        this.MediaBrowserCompat$CustomActionResultReceiver = th;
    }
}
