package p040o;

/* renamed from: o.onIndoorLevelActivated */
public class onIndoorLevelActivated extends zzuj {
    public String read;
    public String write;

    public /* synthetic */ onIndoorLevelActivated() {
    }

    public onIndoorLevelActivated(int i, String str, zzrm zzrm, String str2, String str3) {
        super(i, str, zzrm);
        this.read = str2;
        this.write = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        onIndoorLevelActivated onindoorlevelactivated = (onIndoorLevelActivated) obj;
        return new AddNewCurrencyActivity_ViewBinding().read(this.read, onindoorlevelactivated.read).read(this.write, onindoorlevelactivated.write).MediaBrowserCompat$ItemReceiver;
    }

    public int hashCode() {
        return new DetailsTabHolder_ViewBinding((byte) 0).MediaBrowserCompat$CustomActionResultReceiver(this.read).MediaBrowserCompat$CustomActionResultReceiver(this.write).read;
    }
}
