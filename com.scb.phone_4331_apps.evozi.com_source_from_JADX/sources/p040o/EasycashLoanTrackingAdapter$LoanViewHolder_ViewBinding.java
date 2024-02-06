package p040o;

import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPublicKey;
import org.ejbca.cvc.exception.ConstructionException;

/* renamed from: o.EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding */
public final class EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding {
    public String read;
    public String write;

    public EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding() {
    }

    public static EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding MediaBrowserCompat$ItemReceiver(PublicKey publicKey, String str, AdditionDocumentAdapter$DocumentViewHolder additionDocumentAdapter$DocumentViewHolder) throws ConstructionException {
        if (publicKey instanceof EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding) {
            return (EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding) publicKey;
        }
        EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder IconCompatParcelizer = DonationsItemListAdapter$DonationsCardViewHolder.IconCompatParcelizer(str);
        if (IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.startsWith("0.4.0.127.0.7.2.2.2.1")) {
            return new EasycashSalesheetAdapter$EasycashSalesheetViewHolder_ViewBinding(IconCompatParcelizer, (RSAPublicKey) publicKey);
        }
        if (IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.startsWith("0.4.0.127.0.7.2.2.2.2")) {
            return new EasycashSalesheetAdapter$EasycashSalesheetViewHolder(IconCompatParcelizer, (ECPublicKey) publicKey, additionDocumentAdapter$DocumentViewHolder);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown key type: ");
        sb.append(IconCompatParcelizer);
        throw new IllegalArgumentException(sb.toString());
    }

    public static EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(C1174x485c104b easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding) throws ConstructionException {
        try {
            EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder = (EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID);
            if (easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder.MediaBrowserCompat$ItemReceiver.startsWith("0.4.0.127.0.7.2.2.2.1")) {
                write(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_A, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPONENT, easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding);
                return new EasycashSalesheetAdapter$EasycashSalesheetViewHolder_ViewBinding(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding);
            } else if (easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder.MediaBrowserCompat$ItemReceiver.startsWith("0.4.0.127.0.7.2.2.2.2")) {
                write(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPONENT, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.COEFFICIENT_A, easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding);
                return new EasycashSalesheetAdapter$EasycashSalesheetViewHolder(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown public key OID: ");
                sb.append(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder.MediaBrowserCompat$ItemReceiver);
                throw new IllegalArgumentException(sb.toString());
            }
        } catch (NoSuchFieldException e) {
            throw new ConstructionException((Throwable) e);
        }
    }

    private static void write(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2, C1174x485c104b easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding) throws ConstructionException {
        CustomCheckboxAdapter$CheckBoxViewHolder customCheckboxAdapter$CheckBoxViewHolder;
        if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder.value != easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2.value) {
            throw new IllegalArgumentException("Tag values are not equal");
        } else if (((CustomCheckboxAdapter$CheckBoxViewHolder) easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2)) == null && (customCheckboxAdapter$CheckBoxViewHolder = (CustomCheckboxAdapter$CheckBoxViewHolder) easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.get(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder)) != null) {
            easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2, customCheckboxAdapter$CheckBoxViewHolder.MediaBrowserCompat$ItemReceiver));
        }
    }

    public EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding(String str, String str2) {
        this.read = str;
        this.write = str2;
    }
}
