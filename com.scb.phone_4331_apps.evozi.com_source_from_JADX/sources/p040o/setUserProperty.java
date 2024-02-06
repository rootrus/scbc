package p040o;

import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;

/* renamed from: o.setUserProperty */
public final class setUserProperty {
    public final List<setDataCollectionEnabled> IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<setDataCollectionEnabled> read;
    public final setMinimumSessionDuration write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setUserProperty)) {
            return false;
        }
        setUserProperty setuserproperty = (setUserProperty) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setuserproperty.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setuserproperty.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setuserproperty.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setuserproperty.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setuserproperty.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        List<setDataCollectionEnabled> list = this.IconCompatParcelizer;
        int hashCode2 = list != null ? list.hashCode() : 0;
        setMinimumSessionDuration setminimumsessionduration = this.write;
        int hashCode3 = setminimumsessionduration != null ? setminimumsessionduration.hashCode() : 0;
        List<setDataCollectionEnabled> list2 = this.read;
        int hashCode4 = list2 != null ? list2.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashSummary(uuid=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", summary=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", disclaimer=");
        sb.append(this.write);
        sb.append(", successful=");
        sb.append(this.read);
        sb.append(", emailRemark=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public setUserProperty(String str, List<? extends setDataCollectionEnabled> list, setMinimumSessionDuration setminimumsessionduration, List<? extends setDataCollectionEnabled> list2, String str2) {
        onGetStartedClick.write((Object) str, "uuid");
        onGetStartedClick.write((Object) list, ErrorBundle.SUMMARY_ENTRY);
        onGetStartedClick.write((Object) setminimumsessionduration, "disclaimer");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = list;
        this.write = setminimumsessionduration;
        this.read = list2;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
