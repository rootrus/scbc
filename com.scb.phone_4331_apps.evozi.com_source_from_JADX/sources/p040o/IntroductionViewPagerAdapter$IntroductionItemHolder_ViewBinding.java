package p040o;

/* renamed from: o.IntroductionViewPagerAdapter$IntroductionItemHolder_ViewBinding */
public final class IntroductionViewPagerAdapter$IntroductionItemHolder_ViewBinding {
    public static final IntroductionViewPagerAdapter$IntroductionItemHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = new IntroductionViewPagerAdapter$IntroductionItemHolder_ViewBinding();

    public static DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType read(C9698x5b61c61d creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding) {
        C6431x12296157.write(creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding, "Header");
        DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType = new DepositOpenAccountSelectionAdapter$ListViewHolderWithAccountType(64);
        String IconCompatParcelizer = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer();
        String write = creditCardDetailPurchaseViewPagerAdapter$ItemViewHolder_ViewBinding.write();
        int length = IconCompatParcelizer.length() + 2;
        if (write != null) {
            length += write.length();
        }
        if (length > 0) {
            int length2 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read.length;
            int i = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.IconCompatParcelizer;
            if (length > length2 - i) {
                depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write(i + length);
            }
        }
        depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read(IconCompatParcelizer);
        depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read(": ");
        if (write != null) {
            int length3 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.length() + write.length();
            if (length3 > 0) {
                int length4 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.read.length;
                int i2 = depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.IconCompatParcelizer;
                if (length3 > length4 - i2) {
                    depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write(i2 + length3);
                }
            }
            for (int i3 = 0; i3 < write.length(); i3++) {
                char charAt = write.charAt(i3);
                if (charAt == 13 || charAt == 10 || charAt == 12 || charAt == 11) {
                    charAt = ' ';
                }
                depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType.write(charAt);
            }
        }
        return depositOpenAccountSelectionAdapter$ListViewHolderWithAccountType;
    }
}
