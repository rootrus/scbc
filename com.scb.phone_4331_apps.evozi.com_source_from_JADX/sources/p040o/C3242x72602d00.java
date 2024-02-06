package p040o;

import p040o.CrashlyticsReport;

/* renamed from: o.CrashlyticsController$15$MediaBrowserCompat$CustomActionResultReceiver */
public final class C3242x72602d00 {
    public final String IconCompatParcelizer;
    public final CrashlyticsReport.FilesPayload.Builder MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3242x72602d00)) {
            return false;
        }
        C3242x72602d00 crashlyticsController$15$MediaBrowserCompat$CustomActionResultReceiver = (C3242x72602d00) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) crashlyticsController$15$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) crashlyticsController$15$MediaBrowserCompat$CustomActionResultReceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) crashlyticsController$15$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) crashlyticsController$15$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        CrashlyticsReport.FilesPayload.Builder builder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (builder != null) {
            i = builder.hashCode();
        }
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoanInfo(loanAmount=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", repayment=");
        sb.append(this.write);
        sb.append(", repaymentUnit=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", promotion=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public C3242x72602d00(String str, String str2, String str3, CrashlyticsReport.FilesPayload.Builder builder) {
        onGetStartedClick.write((Object) str, "loanAmount");
        onGetStartedClick.write((Object) str2, "repayment");
        onGetStartedClick.write((Object) str3, "repaymentUnit");
        onGetStartedClick.write((Object) builder, "promotion");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = builder;
    }
}
