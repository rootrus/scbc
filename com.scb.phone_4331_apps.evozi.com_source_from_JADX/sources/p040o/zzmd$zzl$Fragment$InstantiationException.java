package p040o;

import com.scb.phone.p035di.ActivityBuilder_ContributeDebitCardSaleSheetActivity;
import com.scb.phone.view.activity.debitcard.DebitCardSaleSheetActivity;
import p040o.zzmd;

/* renamed from: o.zzmd$zzl$Fragment$InstantiationException */
final class zzmd$zzl$Fragment$InstantiationException extends ActivityBuilder_ContributeDebitCardSaleSheetActivity.write.C10623write {
    private DebitCardSaleSheetActivity MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ zzmd.zzl read;

    private zzmd$zzl$Fragment$InstantiationException(zzmd.zzl zzl) {
        this.read = zzl;
    }

    /* synthetic */ zzmd$zzl$Fragment$InstantiationException(zzmd.zzl zzl, byte b) {
        this(zzl);
    }

    public final /* bridge */ /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        DebitCardSaleSheetActivity debitCardSaleSheetActivity = (DebitCardSaleSheetActivity) obj;
        if (debitCardSaleSheetActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = debitCardSaleSheetActivity;
            return;
        }
        throw null;
    }

    public final /* synthetic */ MileageQuantitySelectionActivity_ViewBinding read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            return new zzmd.zzl.allocateRequestIndex(this.read);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(DebitCardSaleSheetActivity.class.getCanonicalName());
        sb.append(" must be set");
        throw new IllegalStateException(sb.toString());
    }
}
