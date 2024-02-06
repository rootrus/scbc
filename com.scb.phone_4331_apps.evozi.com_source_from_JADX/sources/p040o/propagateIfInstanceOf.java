package p040o;

/* renamed from: o.propagateIfInstanceOf */
public final class propagateIfInstanceOf implements C4602xca7af99c {
    final String MediaBrowserCompat$ItemReceiver;
    final propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver read;
    final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof propagateIfInstanceOf)) {
            return false;
        }
        propagateIfInstanceOf propagateifinstanceof = (propagateIfInstanceOf) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) propagateifinstanceof.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) propagateifinstanceof.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) propagateifinstanceof.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver propagateifinstanceof_mediabrowsercompat_itemreceiver = this.read;
        int hashCode2 = propagateifinstanceof_mediabrowsercompat_itemreceiver != null ? propagateifinstanceof_mediabrowsercompat_itemreceiver.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$ItemReceiver;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerifyUserParams(cardId=");
        sb.append(this.write);
        sb.append(", cardType=");
        sb.append(this.read);
        sb.append(", dateOfBirth=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public propagateIfInstanceOf(String str, propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver propagateifinstanceof_mediabrowsercompat_itemreceiver, String str2) {
        onGetStartedClick.write((Object) str, "cardId");
        onGetStartedClick.write((Object) propagateifinstanceof_mediabrowsercompat_itemreceiver, "cardType");
        onGetStartedClick.write((Object) str2, "dateOfBirth");
        this.write = str;
        this.read = propagateifinstanceof_mediabrowsercompat_itemreceiver;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }
}
