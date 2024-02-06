package p040o;

import net.p088sf.scuba.data.Country;

/* renamed from: o.onFindTouchPointsClick */
public class onFindTouchPointsClick extends Country {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private String read;
    private int write;

    static {
        new onFindTouchPointsClick("UT", "UTO", "Utopia", "Utopian");
    }

    private onFindTouchPointsClick() {
    }

    private onFindTouchPointsClick(String str, String str2, String str3, String str4) {
        this.write = -1;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.IconCompatParcelizer = str3;
        this.read = str4;
    }

    public int valueOf() {
        return this.write;
    }

    public String getName() {
        return this.IconCompatParcelizer;
    }

    public String getNationality() {
        return this.read;
    }

    public String toAlpha2Code() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public String toAlpha3Code() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public String toString() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        return this.MediaBrowserCompat$CustomActionResultReceiver.equals(((onFindTouchPointsClick) obj).MediaBrowserCompat$CustomActionResultReceiver);
    }

    public int hashCode() {
        return (this.MediaBrowserCompat$CustomActionResultReceiver.hashCode() << 1) + 31;
    }
}
