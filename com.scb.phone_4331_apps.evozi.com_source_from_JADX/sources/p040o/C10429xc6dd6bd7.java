package p040o;

/* renamed from: o.SuitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder_ViewBinding */
public final class C10429xc6dd6bd7 {
    public static final HmlBusinessInfoAdapter$BankAccountViewHolder read = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.21");
    public static final HmlBusinessInfoAdapter$BankAccountViewHolder write = new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.29");
    C10905onItemClick IconCompatParcelizer;
    boolean MediaBrowserCompat$ItemReceiver;

    static {
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.9");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.14");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.15");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.16");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.17");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.18");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.19");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.20");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.23");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.24");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.27");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.28");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.30");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.31");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.32");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.33");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.35");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.36");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.37");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.46");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.54");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.1");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.11");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.12");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.2");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.3");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("1.3.6.1.5.5.7.1.4");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.56");
        new HmlBusinessInfoAdapter$BankAccountViewHolder("2.5.29.55");
    }

    public C10429xc6dd6bd7(FixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding, C10905onItemClick onitemclick) {
        this.MediaBrowserCompat$ItemReceiver = fixedTransferSubDepositAdapter$SubDepositViewHolder_ViewBinding.read[0] != 0;
        this.IconCompatParcelizer = onitemclick;
    }

    public C10429xc6dd6bd7(C10905onItemClick onitemclick) {
        this.MediaBrowserCompat$ItemReceiver = false;
        this.IconCompatParcelizer = onitemclick;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10429xc6dd6bd7)) {
            return false;
        }
        C10429xc6dd6bd7 suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder_ViewBinding = (C10429xc6dd6bd7) obj;
        if (!suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder_ViewBinding.IconCompatParcelizer.equals(this.IconCompatParcelizer) || suitabilitySummaryAdapter$SuitabilitySummaryAnswerViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver != this.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.MediaBrowserCompat$ItemReceiver) {
            return this.IconCompatParcelizer.hashCode();
        }
        return ~this.IconCompatParcelizer.hashCode();
    }
}
