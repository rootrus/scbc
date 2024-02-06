package p040o;

/* renamed from: o.PrepaidResetCaseModule */
public final class PrepaidResetCaseModule {
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    public final int MediaBrowserCompat$ItemReceiver;
    public final int read;
    private final int write;

    public PrepaidResetCaseModule() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrepaidResetCaseModule)) {
            return false;
        }
        PrepaidResetCaseModule prepaidResetCaseModule = (PrepaidResetCaseModule) obj;
        return this.read == prepaidResetCaseModule.read && this.MediaBrowserCompat$ItemReceiver == prepaidResetCaseModule.MediaBrowserCompat$ItemReceiver && this.write == prepaidResetCaseModule.write && this.MediaBrowserCompat$CustomActionResultReceiver == prepaidResetCaseModule.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((this.read * 31) + this.MediaBrowserCompat$ItemReceiver) * 31) + this.write) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Bounds(top=");
        sb.append(this.read);
        sb.append(", bottom=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", left=");
        sb.append(this.write);
        sb.append(", right=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public PrepaidResetCaseModule(int i, int i2, int i3, int i4) {
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = i2;
        this.write = i3;
        this.MediaBrowserCompat$CustomActionResultReceiver = i4;
    }

    private /* synthetic */ PrepaidResetCaseModule(byte b) {
        this(-9999999, -9999999, -9999999, -9999999);
    }
}
