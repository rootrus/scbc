package p040o;

/* renamed from: o.FundSwitchSearchListAdapter$FundHolder */
public final class FundSwitchSearchListAdapter$FundHolder extends HmlBanksGridAdapter$HmlBankViewHolder {
    private HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$ItemReceiver = null;

    public FundSwitchSearchListAdapter$FundHolder(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        this.MediaBrowserCompat$ItemReceiver = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder;
    }

    public final FundAccountPagerAdapter$ItemViewHolder_ViewBinding[] IconCompatParcelizer() {
        FundAccountPagerAdapter$ItemViewHolder_ViewBinding fundAccountPagerAdapter$ItemViewHolder_ViewBinding;
        FundAccountPagerAdapter$ItemViewHolder_ViewBinding[] fundAccountPagerAdapter$ItemViewHolder_ViewBindingArr = new FundAccountPagerAdapter$ItemViewHolder_ViewBinding[this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver()];
        for (int i = 0; i != this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(); i++) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read = this.MediaBrowserCompat$ItemReceiver.read(i);
            if (read == null || (read instanceof FundAccountPagerAdapter$ItemViewHolder_ViewBinding)) {
                fundAccountPagerAdapter$ItemViewHolder_ViewBinding = (FundAccountPagerAdapter$ItemViewHolder_ViewBinding) read;
            } else if (read instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                fundAccountPagerAdapter$ItemViewHolder_ViewBinding = new FundAccountPagerAdapter$ItemViewHolder_ViewBinding((HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) read);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid DistributionPoint: ");
                sb.append(read.getClass().getName());
                throw new IllegalArgumentException(sb.toString());
            }
            fundAccountPagerAdapter$ItemViewHolder_ViewBindingArr[i] = fundAccountPagerAdapter$ItemViewHolder_ViewBinding;
        }
        return fundAccountPagerAdapter$ItemViewHolder_ViewBindingArr;
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String read = MoneyActionAdapter$CustomViewHolder.read();
        stringBuffer.append("CRLDistPoint:");
        stringBuffer.append(read);
        FundAccountPagerAdapter$ItemViewHolder_ViewBinding[] IconCompatParcelizer = IconCompatParcelizer();
        for (int i = 0; i != IconCompatParcelizer.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(IconCompatParcelizer[i]);
            stringBuffer.append(read);
        }
        return stringBuffer.toString();
    }
}
