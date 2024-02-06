package p040o;

import java.util.List;

/* renamed from: o.declaresInterruptedEx */
public final class declaresInterruptedEx extends remainingCapacity {
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public List<UncaughtExceptionHandlers> MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public List<UncaughtExceptionHandlers> RatingCompat;
    public List<UncaughtExceptionHandlers> read;

    public declaresInterruptedEx(String str, List<UncaughtExceptionHandlers> list, List<UncaughtExceptionHandlers> list2, List<UncaughtExceptionHandlers> list3, String str2, boolean z) {
        this.IconCompatParcelizer = str;
        this.read = list;
        this.RatingCompat = list2;
        this.MediaBrowserCompat$ItemReceiver = list3;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        declaresInterruptedEx declaresinterruptedex = (declaresInterruptedEx) obj;
        if (this.MediaBrowserCompat$CustomActionResultReceiver == declaresinterruptedex.MediaBrowserCompat$CustomActionResultReceiver && this.IconCompatParcelizer.equals(declaresinterruptedex.IconCompatParcelizer) && this.read.equals(declaresinterruptedex.read) && this.RatingCompat.equals(declaresinterruptedex.RatingCompat) && this.MediaBrowserCompat$ItemReceiver.equals(declaresinterruptedex.MediaBrowserCompat$ItemReceiver)) {
            return this.MediaBrowserCompat$SearchResultReceiver.equals(declaresinterruptedex.MediaBrowserCompat$SearchResultReceiver);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.IconCompatParcelizer.hashCode();
        int hashCode2 = this.read.hashCode();
        int hashCode3 = this.RatingCompat.hashCode();
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode()) * 31) + this.MediaBrowserCompat$SearchResultReceiver.hashCode()) * 31) + (this.MediaBrowserCompat$CustomActionResultReceiver ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BulkTransferInputDisplay{header='");
        sb.append(this.IconCompatParcelizer);
        sb.append('\'');
        sb.append(", ownRecipients=");
        sb.append(this.read);
        sb.append(", scbRecipients=");
        sb.append(this.RatingCompat);
        sb.append(", otherRecipients=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", totalAmount='");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append('\'');
        sb.append(", hasRecipients=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append('}');
        return sb.toString();
    }
}
