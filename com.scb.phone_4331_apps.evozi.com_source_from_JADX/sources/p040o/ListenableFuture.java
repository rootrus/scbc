package p040o;

import p040o.Futures;

/* renamed from: o.ListenableFuture */
public final class ListenableFuture extends Futures.C34093 {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListenableFuture)) {
            return false;
        }
        ListenableFuture listenableFuture = (ListenableFuture) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) listenableFuture.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) listenableFuture.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) listenableFuture.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoadedInstructionDisplay(iconTopUrl=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", iconBottomUrl=");
        sb.append(this.write);
        sb.append(", text=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListenableFuture(String str, String str2, String str3) {
        super((byte) 0);
        onGetStartedClick.write((Object) str, "iconTopUrl");
        onGetStartedClick.write((Object) str3, "text");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
    }
}
