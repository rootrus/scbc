package p040o;

/* renamed from: o.doCleanInvalidTempFiles */
public final class doCleanInvalidTempFiles {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String MediaBrowserCompat$SearchResultReceiver;
    public final String RatingCompat;
    public final String read;
    public final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doCleanInvalidTempFiles)) {
            return false;
        }
        doCleanInvalidTempFiles docleaninvalidtempfiles = (doCleanInvalidTempFiles) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) docleaninvalidtempfiles.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) docleaninvalidtempfiles.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) docleaninvalidtempfiles.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) docleaninvalidtempfiles.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) docleaninvalidtempfiles.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) docleaninvalidtempfiles.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) docleaninvalidtempfiles.MediaBrowserCompat$ItemReceiver);
    }

    public final int hashCode() {
        String str = this.IconCompatParcelizer;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.read;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.RatingCompat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$ItemReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HmlOccupationInfoDisplay(jobTitle=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", sourceOfIncome=");
        sb.append(this.write);
        sb.append(", companyName=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", workAddress=");
        sb.append(this.read);
        sb.append(", workContactNumber=");
        sb.append(this.RatingCompat);
        sb.append(", years=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", months=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(")");
        return sb.toString();
    }

    public doCleanInvalidTempFiles(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        onGetStartedClick.write((Object) str, "jobTitle");
        onGetStartedClick.write((Object) str2, "sourceOfIncome");
        onGetStartedClick.write((Object) str4, "workAddress");
        onGetStartedClick.write((Object) str6, "years");
        onGetStartedClick.write((Object) str7, "months");
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        this.read = str4;
        this.RatingCompat = str5;
        this.MediaBrowserCompat$SearchResultReceiver = str6;
        this.MediaBrowserCompat$ItemReceiver = str7;
    }
}
