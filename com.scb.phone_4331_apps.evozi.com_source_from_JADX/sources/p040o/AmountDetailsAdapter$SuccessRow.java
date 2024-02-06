package p040o;

import java.io.Serializable;
import org.apache.http.ParseException;

/* renamed from: o.AmountDetailsAdapter$SuccessRow */
public final class AmountDetailsAdapter$SuccessRow implements PrepaidRequestLandingActivity, Cloneable, Serializable {
    private final String IconCompatParcelizer;
    private final int MediaBrowserCompat$CustomActionResultReceiver;
    private final DepositTransactionAdapter$ChildViewHolder_ViewBinding write;

    public AmountDetailsAdapter$SuccessRow(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding) throws ParseException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        int MediaBrowserCompat$ItemReceiver = depositTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(58);
        if (MediaBrowserCompat$ItemReceiver != -1) {
            String write2 = depositTransactionAdapter$ChildViewHolder_ViewBinding.write(0, MediaBrowserCompat$ItemReceiver);
            if (!write2.isEmpty()) {
                this.write = depositTransactionAdapter$ChildViewHolder_ViewBinding;
                this.IconCompatParcelizer = write2;
                this.MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$ItemReceiver + 1;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid header: ");
            sb.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.toString());
            throw new ParseException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid header: ");
        sb2.append(depositTransactionAdapter$ChildViewHolder_ViewBinding.toString());
        throw new ParseException(sb2.toString());
    }

    public final String IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = this.write;
        return depositTransactionAdapter$ChildViewHolder_ViewBinding.write(this.MediaBrowserCompat$CustomActionResultReceiver, depositTransactionAdapter$ChildViewHolder_ViewBinding.length());
    }

    public final PrepaidTravelConversionLandingActivity_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver() throws ParseException {
        RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup = new RadioButtonGroupAdapter$RadioButtonViewGroup(0, this.write.length());
        radioButtonGroupAdapter$RadioButtonViewGroup.write(this.MediaBrowserCompat$CustomActionResultReceiver);
        return StopChequeHistoryAdapter$ViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.write, radioButtonGroupAdapter$RadioButtonViewGroup);
    }

    public final int write() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final DepositTransactionAdapter$ChildViewHolder_ViewBinding read() {
        return this.write;
    }

    public final String toString() {
        return this.write.toString();
    }

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
