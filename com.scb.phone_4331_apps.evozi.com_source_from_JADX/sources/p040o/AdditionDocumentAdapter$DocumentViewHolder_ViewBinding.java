package p040o;

import org.ejbca.cvc.AccessRightEnum;

/* renamed from: o.AdditionDocumentAdapter$DocumentViewHolder_ViewBinding */
public final class AdditionDocumentAdapter$DocumentViewHolder_ViewBinding extends MerchantWalletSelectorAdapter$ItemViewHolder_ViewBinding {
    public AdditionDocumentAdapter$DocumentViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    public DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding write;

    AdditionDocumentAdapter$DocumentViewHolder_ViewBinding() {
        super(EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.ROLE_AND_ACCESS_RIGHTS);
    }

    public AdditionDocumentAdapter$DocumentViewHolder_ViewBinding(AdditionDocumentAdapter$DocumentViewHolder additionDocumentAdapter$DocumentViewHolder, DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding donationsItemListAdapter$DonationsCardViewHolder_ViewBinding) {
        this();
        this.MediaBrowserCompat$CustomActionResultReceiver = additionDocumentAdapter$DocumentViewHolder;
        this.write = donationsItemListAdapter$DonationsCardViewHolder_ViewBinding;
    }

    public AdditionDocumentAdapter$DocumentViewHolder_ViewBinding(byte[] bArr) {
        this();
        if (bArr.length > 0) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new AdditionDocumentTypeAdapter$DocumentViewHolder(bArr[0]);
            this.write = new DonationsImageSliderPagerAdapter$ItemViewHolder(bArr);
            return;
        }
        throw new IllegalArgumentException("byte array length must be at least 1");
    }

    /* access modifiers changed from: protected */
    public final byte[] MediaBrowserCompat$ItemReceiver() {
        byte[] read = this.write.read();
        read[0] = (byte) (read[0] | this.MediaBrowserCompat$CustomActionResultReceiver.read());
        return read;
    }

    /* access modifiers changed from: protected */
    public final String IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append(EasycashProductAdapter$LoanProductViewHolder.write(MediaBrowserCompat$ItemReceiver()));
        sb.append(": ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("/");
        sb.append(this.write);
        return sb.toString();
    }

    public static DonationsItemListAdapter$DonationsCardViewHolder_ViewBinding read(EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder, byte[] bArr) {
        int i = 0;
        if (CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.equals(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder)) {
            if (bArr.length == 1) {
                byte b = (byte) (bArr[0] & 3);
                AccessRightEnum[] values = AccessRightEnum.values();
                int length = values.length;
                while (i < length) {
                    AccessRightEnum accessRightEnum = values[i];
                    if (b == accessRightEnum.value) {
                        return accessRightEnum;
                    }
                    i++;
                }
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("byte array length must be 1, was ");
            sb.append(bArr.length);
            throw new IllegalArgumentException(sb.toString());
        } else if (CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.IconCompatParcelizer.equals(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder)) {
            if (bArr.length == 1) {
                byte b2 = (byte) (bArr[0] & 3);
                DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding[] values2 = DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.values();
                int length2 = values2.length;
                while (i < length2) {
                    DonationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding donationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding = values2[i];
                    if (b2 == donationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding.value) {
                        return donationsImageSliderPagerAdapter$ItemViewHolder_ViewBinding;
                    }
                    i++;
                }
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("byte array length must be 1, was ");
            sb2.append(bArr.length);
            throw new IllegalArgumentException(sb2.toString());
        } else if (!CustomCheckboxAdapter$CheckBoxViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.equals(easycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder)) {
            throw new IllegalArgumentException("incorrect or unsupported OID");
        } else if (bArr.length == 5) {
            return new DeviceSettingsAdapter$ParentViewHolder_ViewBinding(bArr);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("byte array length must be 5, was ");
            sb3.append(bArr.length);
            throw new IllegalArgumentException(sb3.toString());
        }
    }
}
