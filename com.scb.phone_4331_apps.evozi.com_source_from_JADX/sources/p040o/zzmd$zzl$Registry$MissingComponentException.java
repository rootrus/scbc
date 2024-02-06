package p040o;

import com.scb.phone.p035di.C2879x5951847c;
import com.scb.phone.view.fragment.requesttopay.RequirePromptPayFragment;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$Registry$MissingComponentException */
final class zzmd$zzl$Registry$MissingComponentException extends C2879x5951847c.read {
    private /* synthetic */ zzmd.zzl IconCompatParcelizer;
    private RequirePromptPayFragment write;

    private zzmd$zzl$Registry$MissingComponentException(zzmd.zzl zzl) {
        this.IconCompatParcelizer = zzl;
    }

    /* synthetic */ zzmd$zzl$Registry$MissingComponentException(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        RequirePromptPayFragment requirePromptPayFragment = (RequirePromptPayFragment) obj;
        if (requirePromptPayFragment != null) {
            this.write = requirePromptPayFragment;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.write != null) {
            return new zzmd.zzl.GlideException(this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(RequirePromptPayFragment.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
