package p040o;

import com.scb.phone.p035di.ActivityBuilder_BindGiftingSelectRecipientActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingSelectRecipientActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$access$500 */
final class zzmd$zzl$access$500 extends ActivityBuilder_BindGiftingSelectRecipientActivity.IconCompatParcelizer.read {
    private GiftingSelectRecipientActivity MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ zzmd.zzl write;

    private zzmd$zzl$access$500(zzmd.zzl zzl) {
        this.write = zzl;
    }

    /* synthetic */ zzmd$zzl$access$500(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        GiftingSelectRecipientActivity giftingSelectRecipientActivity = (GiftingSelectRecipientActivity) obj;
        if (giftingSelectRecipientActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = giftingSelectRecipientActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            return new zzmd$zzl$access$200(this.write);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(GiftingSelectRecipientActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
