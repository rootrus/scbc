package p040o;

import java.util.Date;
import org.ejbca.cvc.AccessRightEnum;
import org.ejbca.cvc.AuthorizationRoleEnum;
import org.ejbca.cvc.CVCAuthorizationTemplate;
import org.ejbca.cvc.exception.ConstructionException;

/* renamed from: o.EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding */
public final class EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding extends DeviceSettingsAdapter$ParentViewHolder {
    private static EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] MediaBrowserCompat$ItemReceiver = {EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PROFILE_IDENTIFIER, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CA_REFERENCE, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PUBLIC_KEY, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.HOLDER_REFERENCE, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.HOLDER_AUTH_TEMPLATE, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EFFECTIVE_DATE, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPIRATION_DATE};

    /* access modifiers changed from: protected */
    public final EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] write() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding() {
        super(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.CERTIFICATE_BODY);
    }

    private EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding(CardLoanOfferViewPagerAdapter$ItemViewHolder cardLoanOfferViewPagerAdapter$ItemViewHolder, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding, EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding) throws ConstructionException {
        this();
        if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding == null) {
            throw new IllegalArgumentException("publicKey is null");
        } else if (easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding != null) {
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new EasycashLoanTrackingAdapter$LoanViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.PROFILE_IDENTIFIER, 0));
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) cardLoanOfferViewPagerAdapter$ItemViewHolder);
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding);
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding);
        } else {
            throw new IllegalArgumentException("holderReference is null");
        }
    }

    public EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding(CardLoanOfferViewPagerAdapter$ItemViewHolder cardLoanOfferViewPagerAdapter$ItemViewHolder, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding, EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding, AdditionDocumentAdapter$DocumentViewHolder additionDocumentAdapter$DocumentViewHolder, DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding donationsItemListAdapter$DonationsCardViewHolder_ViewBinding, Date date, Date date2) throws ConstructionException {
        this(cardLoanOfferViewPagerAdapter$ItemViewHolder, easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding, easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding);
        if (additionDocumentAdapter$DocumentViewHolder == null) {
            throw new IllegalArgumentException("authRole is null");
        } else if (donationsItemListAdapter$DonationsCardViewHolder_ViewBinding == null) {
            throw new IllegalArgumentException("accessRight is null");
        } else if (date == null) {
            throw new IllegalArgumentException("validFrom is null");
        } else if (date2 != null) {
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new CVCAuthorizationTemplate(additionDocumentAdapter$DocumentViewHolder, donationsItemListAdapter$DonationsCardViewHolder_ViewBinding));
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EFFECTIVE_DATE, date));
            MediaBrowserCompat$ItemReceiver((CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding) new EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.EXPIRATION_DATE, date2));
        } else {
            throw new IllegalArgumentException("validTo is null");
        }
    }

    public EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding(CardLoanOfferViewPagerAdapter$ItemViewHolder cardLoanOfferViewPagerAdapter$ItemViewHolder, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding, EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding, AuthorizationRoleEnum authorizationRoleEnum, AccessRightEnum accessRightEnum, Date date, Date date2) throws ConstructionException {
        this(cardLoanOfferViewPagerAdapter$ItemViewHolder, easycashLoanTrackAdapter$LoanInfoHeaderViewHolder_ViewBinding, easycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding, (AdditionDocumentAdapter$DocumentViewHolder) authorizationRoleEnum, (DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding) accessRightEnum, date, date2);
    }
}
