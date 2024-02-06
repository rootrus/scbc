package p040o;

import java.util.NoSuchElementException;

/* renamed from: o.ProductListAdapter$ProductViewHolder_ViewBinding */
public final class ProductListAdapter$ProductViewHolder_ViewBinding implements PrepaidRequestTermConditionsActivity {
    private final PrepaidResetPinSuccessActivity IconCompatParcelizer;
    private RadioButtonGroupAdapter$RadioButtonViewGroup MediaBrowserCompat$CustomActionResultReceiver;
    private PrepaidTravelConversionLandingActivity_ViewBinding MediaBrowserCompat$ItemReceiver;
    private DepositTransactionAdapter$ChildViewHolder_ViewBinding read;
    private final AmountDetailsAdapter$DetailViewHolder_ViewBinding write;

    private ProductListAdapter$ProductViewHolder_ViewBinding(PrepaidResetPinSuccessActivity prepaidResetPinSuccessActivity, AmountDetailsAdapter$DetailViewHolder_ViewBinding amountDetailsAdapter$DetailViewHolder_ViewBinding) {
        this.MediaBrowserCompat$ItemReceiver = null;
        this.read = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.IconCompatParcelizer = (PrepaidResetPinSuccessActivity) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(prepaidResetPinSuccessActivity, "Header iterator");
        this.write = (AmountDetailsAdapter$DetailViewHolder_ViewBinding) DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsAdapter$DetailViewHolder_ViewBinding, "Parser");
    }

    public ProductListAdapter$ProductViewHolder_ViewBinding(PrepaidResetPinSuccessActivity prepaidResetPinSuccessActivity) {
        this(prepaidResetPinSuccessActivity, StopChequeHistoryAdapter$ViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r0.write >= r0.read) != false) goto L_0x001f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void MediaBrowserCompat$CustomActionResultReceiver() {
        /*
            r6 = this;
        L_0x0000:
            o.PrepaidResetPinSuccessActivity r0 = r6.IconCompatParcelizer
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x000d
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x001f
            int r4 = r0.write
            int r0 = r0.read
            if (r4 < r0) goto L_0x001c
            r0 = r1
            goto L_0x001d
        L_0x001c:
            r0 = r3
        L_0x001d:
            if (r0 == 0) goto L_0x0071
        L_0x001f:
            r6.MediaBrowserCompat$CustomActionResultReceiver = r2
            r6.read = r2
        L_0x0023:
            o.PrepaidResetPinSuccessActivity r0 = r6.IconCompatParcelizer
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0071
            o.PrepaidResetPinSuccessActivity r0 = r6.IconCompatParcelizer
            o.PrepaidRequestMarketConductActivity r0 = r0.MediaBrowserCompat$ItemReceiver()
            boolean r4 = r0 instanceof p040o.PrepaidRequestLandingActivity
            if (r4 == 0) goto L_0x0050
            o.PrepaidRequestLandingActivity r0 = (p040o.PrepaidRequestLandingActivity) r0
            o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r4 = r0.read()
            r6.read = r4
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r5 = new o.RadioButtonGroupAdapter$RadioButtonViewGroup
            int r4 = r4.length()
            r5.<init>(r3, r4)
            r6.MediaBrowserCompat$CustomActionResultReceiver = r5
            int r0 = r0.write()
            r5.write(r0)
            goto L_0x0071
        L_0x0050:
            java.lang.String r0 = r0.MediaBrowserCompat$ItemReceiver()
            if (r0 == 0) goto L_0x0023
            o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r4 = new o.DepositTransactionAdapter$ChildViewHolder_ViewBinding
            int r5 = r0.length()
            r4.<init>(r5)
            r6.read = r4
            r4.read((java.lang.String) r0)
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r0 = new o.RadioButtonGroupAdapter$RadioButtonViewGroup
            o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r4 = r6.read
            int r4 = r4.length()
            r0.<init>(r3, r4)
            r6.MediaBrowserCompat$CustomActionResultReceiver = r0
        L_0x0071:
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x0000
        L_0x0075:
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r0.write
            int r0 = r0.read
            if (r4 < r0) goto L_0x007f
            r0 = r1
            goto L_0x0080
        L_0x007f:
            r0 = r3
        L_0x0080:
            if (r0 != 0) goto L_0x009f
            o.AmountDetailsAdapter$DetailViewHolder_ViewBinding r0 = r6.write
            o.DepositTransactionAdapter$ChildViewHolder_ViewBinding r4 = r6.read
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r5 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.PrepaidTravelConversionLandingActivity_ViewBinding r0 = r0.read(r4, r5)
            java.lang.String r4 = r0.read()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x009c
            java.lang.String r4 = r0.write()
            if (r4 == 0) goto L_0x0075
        L_0x009c:
            r6.MediaBrowserCompat$ItemReceiver = r0
            return
        L_0x009f:
            o.RadioButtonGroupAdapter$RadioButtonViewGroup r0 = r6.MediaBrowserCompat$CustomActionResultReceiver
            int r4 = r0.write
            int r0 = r0.read
            if (r4 < r0) goto L_0x00a8
            goto L_0x00a9
        L_0x00a8:
            r1 = r3
        L_0x00a9:
            if (r1 == 0) goto L_0x0000
            r6.MediaBrowserCompat$CustomActionResultReceiver = r2
            r6.read = r2
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.ProductListAdapter$ProductViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver():void");
    }

    public final boolean hasNext() {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        return this.MediaBrowserCompat$ItemReceiver != null;
    }

    public final PrepaidTravelConversionLandingActivity_ViewBinding write() throws NoSuchElementException {
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        PrepaidTravelConversionLandingActivity_ViewBinding prepaidTravelConversionLandingActivity_ViewBinding = this.MediaBrowserCompat$ItemReceiver;
        if (prepaidTravelConversionLandingActivity_ViewBinding != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            return prepaidTravelConversionLandingActivity_ViewBinding;
        }
        throw new NoSuchElementException("No more header elements available");
    }

    public final Object next() throws NoSuchElementException {
        return write();
    }

    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
