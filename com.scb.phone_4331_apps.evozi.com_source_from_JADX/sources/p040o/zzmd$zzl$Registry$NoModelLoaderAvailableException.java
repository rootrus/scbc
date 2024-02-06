package p040o;

import com.scb.phone.p035di.C1987xcc1995cf;
import com.scb.phone.view.activity.requesttopay.RequesterReviewActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$Registry$NoModelLoaderAvailableException */
final class zzmd$zzl$Registry$NoModelLoaderAvailableException extends C1987xcc1995cf.write {
    private RequesterReviewActivity IconCompatParcelizer;
    private /* synthetic */ zzmd.zzl write;

    private zzmd$zzl$Registry$NoModelLoaderAvailableException(zzmd.zzl zzl) {
        this.write = zzl;
    }

    /* synthetic */ zzmd$zzl$Registry$NoModelLoaderAvailableException(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        RequesterReviewActivity requesterReviewActivity = (RequesterReviewActivity) obj;
        if (requesterReviewActivity != null) {
            this.IconCompatParcelizer = requesterReviewActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.IconCompatParcelizer != null) {
            return new zzmd$zzl$Registry$NoImageHeaderParserException(this.write);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(RequesterReviewActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
