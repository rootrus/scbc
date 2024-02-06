package p040o;

/* renamed from: o.PrepaidTravelWalletCaseModule */
public final class PrepaidTravelWalletCaseModule {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final int MediaBrowserCompat$ItemReceiver;
    public final int read;
    public final int write;

    public PrepaidTravelWalletCaseModule() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidTravelWalletCaseModule)) {
            return false;
        }
        PrepaidTravelWalletCaseModule prepaidTravelWalletCaseModule = (PrepaidTravelWalletCaseModule) obj;
        return this.read == prepaidTravelWalletCaseModule.read && this.write == prepaidTravelWalletCaseModule.write && this.MediaBrowserCompat$ItemReceiver == prepaidTravelWalletCaseModule.MediaBrowserCompat$ItemReceiver && this.MediaBrowserCompat$CustomActionResultReceiver == prepaidTravelWalletCaseModule.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((this.read * 31) + this.write) * 31) + this.MediaBrowserCompat$ItemReceiver) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Insets(top=");
        sb.append(this.read);
        sb.append(", bottom=");
        sb.append(this.write);
        sb.append(", left=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", right=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public PrepaidTravelWalletCaseModule(int i, int i2, int i3, int i4) {
        this.read = i;
        this.write = i2;
        this.MediaBrowserCompat$ItemReceiver = i3;
        this.MediaBrowserCompat$CustomActionResultReceiver = i4;
    }

    private /* synthetic */ PrepaidTravelWalletCaseModule(byte b) {
        this(-9999999, -9999999, -9999999, -9999999);
    }
}
