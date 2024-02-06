package p040o;

import java.util.List;

/* renamed from: o.writeSessionPartFile */
public final class writeSessionPartFile {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final List<ForwardingFuture> MediaBrowserCompat$SearchResultReceiver;
    public final String MediaDescriptionCompat;
    public final String RatingCompat;
    public final List<ForwardingFuture> read;
    public final List<ForwardingFuture> write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof writeSessionPartFile)) {
            return false;
        }
        writeSessionPartFile writesessionpartfile = (writeSessionPartFile) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writesessionpartfile.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) writesessionpartfile.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) writesessionpartfile.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) writesessionpartfile.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) writesessionpartfile.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) writesessionpartfile.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) writesessionpartfile.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) writesessionpartfile.IconCompatParcelizer);
    }

    public final int hashCode() {
        List<ForwardingFuture> list = this.write;
        int i = 0;
        int hashCode = list != null ? list.hashCode() : 0;
        List<ForwardingFuture> list2 = this.read;
        int hashCode2 = list2 != null ? list2.hashCode() : 0;
        List<ForwardingFuture> list3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = list3 != null ? list3.hashCode() : 0;
        String str = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.RatingCompat;
        int hashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode7 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlLoanReviewDetailsDisplay(loanInfo=");
        sb.append(this.write);
        sb.append(", accountInfo=");
        sb.append(this.read);
        sb.append(", taxFeesInfo=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", netTransferAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repaymentDate=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", repaymentFrequency=");
        sb.append(this.RatingCompat);
        sb.append(", estatementMail=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", attentionText=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    public writeSessionPartFile(List<? extends ForwardingFuture> list, List<? extends ForwardingFuture> list2, List<? extends ForwardingFuture> list3, String str, String str2, String str3, String str4, String str5) {
        onGetStartedClick.write((Object) list, "loanInfo");
        onGetStartedClick.write((Object) list2, "accountInfo");
        onGetStartedClick.write((Object) str, "netTransferAmount");
        onGetStartedClick.write((Object) str2, "repaymentDate");
        onGetStartedClick.write((Object) str3, "repaymentFrequency");
        onGetStartedClick.write((Object) str4, "estatementMail");
        onGetStartedClick.write((Object) str5, "attentionText");
        this.write = list;
        this.read = list2;
        this.MediaBrowserCompat$SearchResultReceiver = list3;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaDescriptionCompat = str2;
        this.RatingCompat = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.IconCompatParcelizer = str5;
    }
}
