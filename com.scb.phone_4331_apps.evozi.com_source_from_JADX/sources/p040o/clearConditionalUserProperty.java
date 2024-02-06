package p040o;

import java.util.List;

/* renamed from: o.clearConditionalUserProperty */
public final class clearConditionalUserProperty {
    public final List<beginAdUnitExposure> MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final Integer read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clearConditionalUserProperty)) {
            return false;
        }
        clearConditionalUserProperty clearconditionaluserproperty = (clearConditionalUserProperty) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) clearconditionaluserproperty.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) clearconditionaluserproperty.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) clearconditionaluserproperty.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) clearconditionaluserproperty.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        Integer num = this.read;
        int i = 0;
        int hashCode = num != null ? num.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        List<beginAdUnitExposure> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EasycashLoanInfoItem(sortSequence=");
        sb.append(this.read);
        sb.append(", header=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", subHeader=");
        sb.append(this.write);
        sb.append(", body=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public clearConditionalUserProperty(Integer num, String str, String str2, List<beginAdUnitExposure> list) {
        this.read = num;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }
}
