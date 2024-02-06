package p040o;

/* renamed from: o.writeToCosFromFile */
public final class writeToCosFromFile {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    private final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeToCosFromFile)) {
            return false;
        }
        writeToCosFromFile writetocosfromfile = (writeToCosFromFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) writetocosfromfile.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) writetocosfromfile.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writetocosfromfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) writetocosfromfile.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlInstallmentDisplay(installmentAmount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", installmentFrequency=");
        sb.append(this.read);
        sb.append(", installmentUnit=");
        sb.append(this.write);
        sb.append(", installmentPerUnit=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public writeToCosFromFile(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "installmentAmount");
        onGetStartedClick.write((Object) str2, "installmentFrequency");
        onGetStartedClick.write((Object) str3, "installmentUnit");
        onGetStartedClick.write((Object) str4, "installmentPerUnit");
        this.IconCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
    }
}
