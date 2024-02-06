package p040o;

import java.util.List;

/* renamed from: o.setNotificationResponsiveness */
public final class setNotificationResponsiveness {
    public final List<fromIntent> IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setNotificationResponsiveness)) {
            return false;
        }
        setNotificationResponsiveness setnotificationresponsiveness = (setNotificationResponsiveness) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setnotificationresponsiveness.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setnotificationresponsiveness.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setnotificationresponsiveness.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setnotificationresponsiveness.IconCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        List<fromIntent> list = this.IconCompatParcelizer;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InsuranceInfo(dataSource=");
        sb.append(this.read);
        sb.append(", partnerIconUrl=");
        sb.append(this.write);
        sb.append(", partnerLabel=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", policyInfoList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public setNotificationResponsiveness(String str, String str2, String str3, List<fromIntent> list) {
        onGetStartedClick.write((Object) str, "dataSource");
        this.read = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.IconCompatParcelizer = list;
    }
}
