package p040o;

import com.scb.phone.p035di.FragmentBuilder_BindRequestToPayLandingFragment;
import com.scb.phone.view.fragment.requesttopay.RequestToPayLandingFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$Registry$NoResultEncoderAvailableException */
final class zzmd$zzl$Registry$NoResultEncoderAvailableException extends FragmentBuilder_BindRequestToPayLandingFragment.IconCompatParcelizer.write {
    private /* synthetic */ zzmd.zzl read;
    private RequestToPayLandingFragment write;

    private zzmd$zzl$Registry$NoResultEncoderAvailableException(zzmd.zzl zzl) {
        this.read = zzl;
    }

    /* synthetic */ zzmd$zzl$Registry$NoResultEncoderAvailableException(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        RequestToPayLandingFragment requestToPayLandingFragment = (RequestToPayLandingFragment) obj;
        if (requestToPayLandingFragment != null) {
            this.write = requestToPayLandingFragment;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.write != null) {
            return new zzmd.zzl.Glide(this.read);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(RequestToPayLandingFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
