package p040o;

/* renamed from: o.nScriptForEach */
public final class nScriptForEach {
    private final String IconCompatParcelizer;
    public final int MediaBrowserCompat$ItemReceiver;
    private final int write;

    public nScriptForEach() {
    }

    public nScriptForEach(int i, int i2, String str) {
        this();
        this.MediaBrowserCompat$ItemReceiver = i;
        this.write = i2;
        if (str != null) {
            this.IconCompatParcelizer = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nScriptForEach)) {
            return false;
        }
        nScriptForEach nscriptforeach = (nScriptForEach) obj;
        return this.MediaBrowserCompat$ItemReceiver == nscriptforeach.MediaBrowserCompat$ItemReceiver && this.write == nscriptforeach.write && this.IconCompatParcelizer.equals(nscriptforeach.IconCompatParcelizer);
    }

    public final int hashCode() {
        return ((((this.MediaBrowserCompat$ItemReceiver ^ 1000003) * 1000003) ^ this.write) * 1000003) ^ this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.MediaBrowserCompat$ItemReceiver;
        int i2 = this.write;
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 83);
        sb.append("InstallState{installStatus=");
        sb.append(i);
        sb.append(", installErrorCode=");
        sb.append(i2);
        sb.append(", packageName=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
