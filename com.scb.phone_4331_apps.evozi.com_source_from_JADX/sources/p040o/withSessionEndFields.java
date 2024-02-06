package p040o;

import p040o.CrashlyticsReport;

/* renamed from: o.withSessionEndFields */
public final class withSessionEndFields extends CrashlyticsReport.Builder {
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof withSessionEndFields)) {
            return false;
        }
        withSessionEndFields withsessionendfields = (withSessionEndFields) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) withsessionendfields.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) withsessionendfields.write);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductCatalogueTitleDisplay(titleColumn=");
        sb.append(this.read);
        sb.append(", valueColumn=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public withSessionEndFields(String str, String str2) {
        super(CrashlyticsReport.Builder.write.TITLE);
        onGetStartedClick.write((Object) str, "titleColumn");
        onGetStartedClick.write((Object) str2, "valueColumn");
        this.read = str;
        this.write = str2;
    }
}
