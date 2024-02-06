package p040o;

/* renamed from: o.onStartJob */
public final class onStartJob {
    public boolean IconCompatParcelizer;
    public Double MediaBrowserCompat$CustomActionResultReceiver;
    public SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    public isPreview MediaDescriptionCompat;
    public Double RatingCompat;
    public Double read;
    public Double write;

    public onStartJob() {
        this((byte) 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onStartJob)) {
            return false;
        }
        onStartJob onstartjob = (onStartJob) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) onstartjob.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) onstartjob.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) onstartjob.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) onstartjob.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) onstartjob.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) onstartjob.RatingCompat) && this.IconCompatParcelizer == onstartjob.IconCompatParcelizer;
    }

    public final int hashCode() {
        SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver != null ? sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver.hashCode() : 0;
        isPreview ispreview = this.MediaDescriptionCompat;
        int hashCode2 = ispreview != null ? ispreview.hashCode() : 0;
        Double d = this.read;
        int hashCode3 = d != null ? d.hashCode() : 0;
        Double d2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode4 = d2 != null ? d2.hashCode() : 0;
        Double d3 = this.write;
        int hashCode5 = d3 != null ? d3.hashCode() : 0;
        Double d4 = this.RatingCompat;
        if (d4 != null) {
            i = d4.hashCode();
        }
        boolean z = this.IconCompatParcelizer;
        if (z) {
            z = true;
        }
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InstallmentsResponse(installmentsStatus=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", unbillInfo=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", monthlyPayment=");
        sb.append(this.read);
        sb.append(", currAmount=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", totalInterest=");
        sb.append(this.write);
        sb.append(", totalPayment=");
        sb.append(this.RatingCompat);
        sb.append(", success=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }

    private onStartJob(SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver sCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver, isPreview ispreview, Double d, Double d2, Double d3, Double d4, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaDescriptionCompat = null;
        this.read = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.write = null;
        this.RatingCompat = null;
        this.IconCompatParcelizer = false;
    }

    public /* synthetic */ onStartJob(byte b) {
        this((SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver) null, (isPreview) null, (Double) null, (Double) null, (Double) null, (Double) null, false);
    }
}
