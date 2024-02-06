package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import java.util.ArrayList;
import java.util.BitSet;
import org.apache.http.ParseException;

/* renamed from: o.StopChequeHistoryAdapter$ViewHolder_ViewBinding */
public final class StopChequeHistoryAdapter$ViewHolder_ViewBinding implements AmountDetailsAdapter$DetailViewHolder_ViewBinding {
    public static final StopChequeHistoryAdapter$ViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = new StopChequeHistoryAdapter$ViewHolder_ViewBinding();
    private static final BitSet read = AmountDetailsSuccessAdapter$DetailViewHolder.IconCompatParcelizer(61, 59, 44);
    private static final BitSet write = AmountDetailsSuccessAdapter$DetailViewHolder.IconCompatParcelizer(59, 44);
    private final AmountDetailsSuccessAdapter$DetailViewHolder MediaBrowserCompat$ItemReceiver = AmountDetailsSuccessAdapter$DetailViewHolder.read;

    static {
        new StopChequeHistoryAdapter$ViewHolder_ViewBinding();
    }

    public static PrepaidTravelConversionLandingActivity_ViewBinding[] write(String str) throws ParseException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, KtaJsonExactionHelper.VALUE);
        DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding = new DepositTransactionAdapter$ChildViewHolder_ViewBinding(str.length());
        depositTransactionAdapter$ChildViewHolder_ViewBinding.read(str);
        return MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, new RadioButtonGroupAdapter$RadioButtonViewGroup(0, str.length()));
    }

    public final PrepaidTravelConversionLandingActivity_ViewBinding[] IconCompatParcelizer(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
                return (PrepaidTravelConversionLandingActivity_ViewBinding[]) arrayList.toArray(new PrepaidTravelConversionLandingActivity_ViewBinding[arrayList.size()]);
            }
            PrepaidTravelConversionLandingActivity_ViewBinding read2 = read(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
            if (!read2.read().isEmpty() || read2.write() != null) {
                arrayList.add(read2);
            }
        }
    }

    public final PrepaidTravelConversionLandingActivity_ViewBinding read(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        AddAccountsActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
        return new ManageChequeAdapter$ManageChequeHolder(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(), MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(), ((radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) || depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(radioButtonGroupAdapter$RadioButtonViewGroup.write - 1) == ',') ? null : MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup));
    }

    private AddAccountsActivity[] MediaBrowserCompat$CustomActionResultReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        AmountDetailsSuccessAdapter$DetailViewHolder.read(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
        ArrayList arrayList = new ArrayList();
        do {
            if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
                break;
            }
            arrayList.add(MediaBrowserCompat$ItemReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup));
        } while (depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(radioButtonGroupAdapter$RadioButtonViewGroup.write - 1) != ',');
        return (AddAccountsActivity[]) arrayList.toArray(new AddAccountsActivity[arrayList.size()]);
    }

    private AddAccountsActivity MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        String write2 = AmountDetailsSuccessAdapter$DetailViewHolder.write(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup, read);
        boolean z = false;
        if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
            return new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(write2, (String) null);
        }
        char charAt = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(radioButtonGroupAdapter$RadioButtonViewGroup.write);
        radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
        if (charAt != '=') {
            return new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(write2, (String) null);
        }
        String MediaBrowserCompat$CustomActionResultReceiver2 = AmountDetailsSuccessAdapter$DetailViewHolder.MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup, write);
        if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
            z = true;
        }
        if (!z) {
            radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
        }
        return new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(write2, MediaBrowserCompat$CustomActionResultReceiver2);
    }
}
