package p040o;

import java.util.List;

/* renamed from: o.onError */
public final class onError {
    public final List<setHint> IconCompatParcelizer;
    public final List<setHint> MediaBrowserCompat$CustomActionResultReceiver;
    public final List<setHint> MediaBrowserCompat$ItemReceiver;
    public final List<setHint> read;
    public final List<setHint> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onError)) {
            return false;
        }
        onError onerror = (onError) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onerror.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onerror.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onerror.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onerror.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) onerror.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<setHint> list = this.read;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<setHint> list2 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<setHint> list3 = this.write;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        List<setHint> list4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = list4 != null ? list4.hashCode() : 0;
        List<setHint> list5 = this.IconCompatParcelizer;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MailingAddressLandingResponse(creditCardList=");
        sb.append(this.read);
        sb.append(", loanList=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", prepaidCardList=");
        sb.append(this.write);
        sb.append(", debitCardList=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", depositList=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public onError(List<setHint> list, List<setHint> list2, List<setHint> list3, List<setHint> list4, List<setHint> list5) {
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        this.write = list3;
        this.MediaBrowserCompat$CustomActionResultReceiver = list4;
        this.IconCompatParcelizer = list5;
    }
}
