package org.ejbca.cvc;

import net.p088sf.scuba.smartcards.ISO7816;
import org.ejbca.cvc.exception.ConstructionException;
import p040o.AccountSelectorAdapter$ItemViewHolder;
import p040o.AccountSelectorAdapter$ItemViewHolder_ViewBinding;
import p040o.AdditionDocumentAdapter$DocumentViewHolder;
import p040o.AdditionDocumentAdapter$DocumentViewHolder_ViewBinding;
import p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding;
import p040o.CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding;
import p040o.DeviceSettingsAdapter$ParentViewHolder;
import p040o.DeviceSettingsAdapter$ParentViewHolder_ViewBinding;
import p040o.DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding;
import p040o.DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding;
import p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder;
import p040o.EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder;

public class CVCAuthorizationTemplate extends DeviceSettingsAdapter$ParentViewHolder {
    private static EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write = {EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.ROLE_AND_ACCESS_RIGHTS};

    public final EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write() {
        return write;
    }

    public CVCAuthorizationTemplate() {
        super(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.HOLDER_AUTH_TEMPLATE);
    }

    public final void MediaBrowserCompat$ItemReceiver(CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) throws ConstructionException {
        AdditionDocumentAdapter$DocumentViewHolder[] additionDocumentAdapter$DocumentViewHolderArr;
        AdditionDocumentAdapter$DocumentViewHolder additionDocumentAdapter$DocumentViewHolder;
        super.MediaBrowserCompat$ItemReceiver(cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding);
        if (cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding instanceof AdditionDocumentAdapter$DocumentViewHolder_ViewBinding) {
            try {
                AdditionDocumentAdapter$DocumentViewHolder_ViewBinding additionDocumentAdapter$DocumentViewHolder_ViewBinding = (AdditionDocumentAdapter$DocumentViewHolder_ViewBinding) cardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding;
                EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder = (EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder) read(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.OID);
                byte read = (byte) (additionDocumentAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.read() & ISO7816.INS_GET_RESPONSE);
                if (CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.equals(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder)) {
                    additionDocumentAdapter$DocumentViewHolderArr = AuthorizationRoleEnum.values();
                } else if (CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.IconCompatParcelizer.equals(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder)) {
                    additionDocumentAdapter$DocumentViewHolderArr = AccountSelectorAdapter$ItemViewHolder_ViewBinding.values();
                } else if (CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.equals(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder)) {
                    additionDocumentAdapter$DocumentViewHolderArr = AccountSelectorAdapter$ItemViewHolder.values();
                } else {
                    throw new IllegalArgumentException("incorrect or unsupported OID");
                }
                int length = additionDocumentAdapter$DocumentViewHolderArr.length;
                int i = 0;
                while (true) {
                    additionDocumentAdapter$DocumentViewHolder = null;
                    if (i >= length) {
                        break;
                    }
                    additionDocumentAdapter$DocumentViewHolder = additionDocumentAdapter$DocumentViewHolderArr[i];
                    if (read == additionDocumentAdapter$DocumentViewHolder.read()) {
                        break;
                    }
                    i++;
                }
                additionDocumentAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = additionDocumentAdapter$DocumentViewHolder;
                additionDocumentAdapter$DocumentViewHolder_ViewBinding.write = AdditionDocumentAdapter$DocumentViewHolder_ViewBinding.read(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder, additionDocumentAdapter$DocumentViewHolder_ViewBinding.write.read());
            } catch (NoSuchFieldException e) {
                throw new ConstructionException("Tried to add an AuthorizationField without an OID", e);
            }
        }
    }

    public CVCAuthorizationTemplate(AdditionDocumentAdapter$DocumentViewHolder additionDocumentAdapter$DocumentViewHolder, DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding donationsItemListAdapter$DonationsCardViewHolder_ViewBinding) throws ConstructionException {
        this();
        EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder;
        if ((additionDocumentAdapter$DocumentViewHolder instanceof AuthorizationRoleEnum) && (donationsItemListAdapter$DonationsCardViewHolder_ViewBinding instanceof AccessRightEnum)) {
            easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder = CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        } else if ((additionDocumentAdapter$DocumentViewHolder instanceof AccountSelectorAdapter$ItemViewHolder) && (donationsItemListAdapter$DonationsCardViewHolder_ViewBinding instanceof DeviceSettingsAdapter$ParentViewHolder_ViewBinding)) {
            easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder = CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
        } else if (!(additionDocumentAdapter$DocumentViewHolder instanceof AccountSelectorAdapter$ItemViewHolder_ViewBinding) || !(donationsItemListAdapter$DonationsCardViewHolder_ViewBinding instanceof DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported roles/rights type (or mismatch). Got role of type ");
            sb.append(additionDocumentAdapter$DocumentViewHolder.getClass().getSimpleName());
            sb.append(", but rights of type ");
            sb.append(donationsItemListAdapter$DonationsCardViewHolder_ViewBinding.getClass().getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        } else {
            easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder = CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.IconCompatParcelizer;
        }
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder);
        MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new AdditionDocumentAdapter$DocumentViewHolder_ViewBinding(additionDocumentAdapter$DocumentViewHolder, donationsItemListAdapter$DonationsCardViewHolder_ViewBinding));
    }
}
