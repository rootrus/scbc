package p040o;

import org.bouncycastle.i18n.MessageBundle;

/* renamed from: o.standardStopAndWait */
public final class standardStopAndWait {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof standardStopAndWait)) {
            return false;
        }
        standardStopAndWait standardstopandwait = (standardStopAndWait) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) standardstopandwait.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) standardstopandwait.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) standardstopandwait.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) standardstopandwait.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) standardstopandwait.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.MediaBrowserCompat$ItemReceiver;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SuccessInformationDisplay(title=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", accountNo=");
        sb.append(this.write);
        sb.append(", branchDesc=");
        sb.append(this.read);
        sb.append(", accountTypeDesc=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", bonus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public standardStopAndWait(String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
        onGetStartedClick.write((Object) str2, "accountNo");
        onGetStartedClick.write((Object) str3, "branchDesc");
        onGetStartedClick.write((Object) str4, "accountTypeDesc");
        onGetStartedClick.write((Object) str5, "bonus");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
        this.read = str3;
        this.IconCompatParcelizer = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
    }
}
