package p040o;

/* renamed from: o.reportDeviceAtPlace */
public final class reportDeviceAtPlace {
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof reportDeviceAtPlace)) {
            return false;
        }
        reportDeviceAtPlace reportdeviceatplace = (reportDeviceAtPlace) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) reportdeviceatplace.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) reportdeviceatplace.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) reportdeviceatplace.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JuristicStateResponse(deviceState=");
        sb.append(this.read);
        sb.append(", mobileNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", refId=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    public reportDeviceAtPlace(String str, String str2, String str3) {
        onGetStartedClick.write((Object) str, "deviceState");
        this.read = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.write = str3;
    }
}
