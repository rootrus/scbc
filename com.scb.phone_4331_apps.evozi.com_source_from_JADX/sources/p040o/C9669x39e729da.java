package p040o;

import java.util.ArrayList;
import java.util.BitSet;
import org.apache.http.ParseException;

/* renamed from: o.BulkTransferSummaryScreenshotAdapter$SummaryScreenshotViewHolder_ViewBinding */
public final class C9669x39e729da {
    public static final C9669x39e729da MediaBrowserCompat$ItemReceiver = new C9669x39e729da();
    private static final BitSet read = AmountDetailsSuccessAdapter$DetailViewHolder.IconCompatParcelizer(59);
    private static final BitSet write = AmountDetailsSuccessAdapter$DetailViewHolder.IconCompatParcelizer(61, 59);
    private final AmountDetailsSuccessAdapter$DetailViewHolder IconCompatParcelizer = AmountDetailsSuccessAdapter$DetailViewHolder.read;

    public final PrepaidTravelConversionLandingActivity_ViewBinding MediaBrowserCompat$ItemReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) throws ParseException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(depositTransactionAdapter$ChildViewHolder_ViewBinding, "Char array buffer");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(radioButtonGroupAdapter$RadioButtonViewGroup, "Parser cursor");
        AddAccountsActivity MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup);
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
                return new ManageChequeAdapter$ManageChequeHolder(MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(), MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(), (AddAccountsActivity[]) arrayList.toArray(new AddAccountsActivity[arrayList.size()]));
            }
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup));
        }
    }

    private AddAccountsActivity MediaBrowserCompat$CustomActionResultReceiver(DepositTransactionAdapter$ChildViewHolder_ViewBinding depositTransactionAdapter$ChildViewHolder_ViewBinding, RadioButtonGroupAdapter$RadioButtonViewGroup radioButtonGroupAdapter$RadioButtonViewGroup) {
        String write2 = AmountDetailsSuccessAdapter$DetailViewHolder.write(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup, write);
        boolean z = false;
        if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
            return new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(write2, (String) null);
        }
        char charAt = depositTransactionAdapter$ChildViewHolder_ViewBinding.charAt(radioButtonGroupAdapter$RadioButtonViewGroup.write);
        radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
        if (charAt != '=') {
            return new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(write2, (String) null);
        }
        String write3 = AmountDetailsSuccessAdapter$DetailViewHolder.write(depositTransactionAdapter$ChildViewHolder_ViewBinding, radioButtonGroupAdapter$RadioButtonViewGroup, read);
        if (radioButtonGroupAdapter$RadioButtonViewGroup.write >= radioButtonGroupAdapter$RadioButtonViewGroup.read) {
            z = true;
        }
        if (!z) {
            radioButtonGroupAdapter$RadioButtonViewGroup.write(radioButtonGroupAdapter$RadioButtonViewGroup.write + 1);
        }
        return new PaymentInfoAdapter$ViewTypeTextAndImageHolder_ViewBinding(write2, write3);
    }
}
