package p040o;

import java.math.BigInteger;
import java.security.interfaces.RSAPublicKey;
import org.ejbca.cvc.exception.ConstructionException;

/* renamed from: o.EasycashSalesheetAdapter$EasycashSalesheetViewHolder_ViewBinding */
public final class EasycashSalesheetAdapter$EasycashSalesheetViewHolder_ViewBinding extends EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding implements RSAPublicKey {
    private static EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] IconCompatParcelizer = {EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPONENT};

    public final String getAlgorithm() {
        return "RSA";
    }

    public final String getFormat() {
        return "CVC";
    }

    /* access modifiers changed from: protected */
    public final EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write() {
        return IconCompatParcelizer;
    }

    EasycashSalesheetAdapter$EasycashSalesheetViewHolder_ViewBinding(C1174x485c104b easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding) throws ConstructionException, NoSuchFieldException {
        CustomCheckboxAdapter$CheckBoxViewHolder customCheckboxAdapter$CheckBoxViewHolder = (CustomCheckboxAdapter$CheckBoxViewHolder) easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS);
        customCheckboxAdapter$CheckBoxViewHolder.MediaBrowserCompat$CustomActionResultReceiver = true;
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID));
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) customCheckboxAdapter$CheckBoxViewHolder);
        MediaBrowserCompat$ItemReceiver(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder_ViewBinding.read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPONENT));
    }

    EasycashSalesheetAdapter$EasycashSalesheetViewHolder_ViewBinding(EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder, RSAPublicKey rSAPublicKey) throws ConstructionException {
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder);
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS, read(rSAPublicKey.getModulus().toByteArray()), true));
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CustomCheckboxAdapter$CheckBoxViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPONENT, read(rSAPublicKey.getPublicExponent().toByteArray())));
    }

    public final BigInteger getPublicExponent() {
        try {
            return new BigInteger(1, ((CustomCheckboxAdapter$CheckBoxViewHolder) read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPONENT)).MediaBrowserCompat$ItemReceiver);
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
    }

    public final BigInteger getModulus() {
        try {
            return new BigInteger(1, ((CustomCheckboxAdapter$CheckBoxViewHolder) read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.MODULUS)).MediaBrowserCompat$ItemReceiver);
        } catch (NoSuchFieldException e) {
            throw new IllegalStateException(e);
        }
    }
}
