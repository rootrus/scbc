package p040o;

import java.util.List;

/* renamed from: o.writeHeader */
public final class writeHeader {
    public final List<ringRead> IconCompatParcelizer;
    public final List<ringRead> MediaBrowserCompat$CustomActionResultReceiver;
    public final List<ringRead> MediaBrowserCompat$ItemReceiver;
    public final List<ringRead> read;
    public final List<ringRead> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeHeader)) {
            return false;
        }
        writeHeader writeheader = (writeHeader) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) writeheader.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) writeheader.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) writeheader.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writeheader.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) writeheader.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<ringRead> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<ringRead> list2 = this.read;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<ringRead> list3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        List<ringRead> list4 = this.write;
        int hashCode4 = list4 != null ? list4.hashCode() : 0;
        List<ringRead> list5 = this.IconCompatParcelizer;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressLandingDisplay(creditCardList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", loanList=");
        sb.append(this.read);
        sb.append(", prepaidCardList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", debitCardList=");
        sb.append(this.write);
        sb.append(", depositList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public writeHeader(List<ringRead> list, List<ringRead> list2, List<ringRead> list3, List<ringRead> list4, List<ringRead> list5) {
        onGetStartedClick.write((Object) list, "creditCardList");
        onGetStartedClick.write((Object) list2, "loanList");
        onGetStartedClick.write((Object) list3, "prepaidCardList");
        onGetStartedClick.write((Object) list4, "debitCardList");
        onGetStartedClick.write((Object) list5, "depositList");
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
        this.read = list2;
        this.MediaBrowserCompat$ItemReceiver = list3;
        this.write = list4;
        this.IconCompatParcelizer = list5;
    }
}
