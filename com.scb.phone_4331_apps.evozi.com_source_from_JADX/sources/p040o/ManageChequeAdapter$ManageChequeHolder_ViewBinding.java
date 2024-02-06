package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.io.Serializable;
import org.apache.http.ParseException;

/* renamed from: o.ManageChequeAdapter$ManageChequeHolder_ViewBinding */
public final class ManageChequeAdapter$ManageChequeHolder_ViewBinding implements PrepaidRequestMarketConductActivity, Cloneable, Serializable {
    private static final PrepaidTravelConversionLandingActivity_ViewBinding[] write = new PrepaidTravelConversionLandingActivity_ViewBinding[0];
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;

    public ManageChequeAdapter$ManageChequeHolder_ViewBinding(String str, String str2) {
        this.IconCompatParcelizer = (String) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.NAME);
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final String toString() {
        return PaymentInfoAdapter$ViewTypeMiniQrHolder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver((DepositTransactionAdapter$ChildViewHolder_ViewBinding) null, this).toString();
    }

    public final PrepaidTravelConversionLandingActivity_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver() throws ParseException {
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str != null) {
            return StopChequeHistoryAdapter$ViewHolder_ViewBinding.write(str);
        }
        return write;
    }
}
