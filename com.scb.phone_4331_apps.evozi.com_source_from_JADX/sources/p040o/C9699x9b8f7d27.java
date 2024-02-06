package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;

/* renamed from: o.CreditCardDetailViewPagerAdapter$CreditCardItemViewHolder_ViewBinding */
public final class C9699x9b8f7d27 {
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    final SelectionAdapter$SelectionHolder_ViewBinding MediaBrowserCompat$ItemReceiver;
    final CreditCardDetailViewPagerAdapter$CreditCardItemViewHolder write = new CreditCardDetailViewPagerAdapter$CreditCardItemViewHolder();

    @Deprecated
    public C9699x9b8f7d27(String str, SelectionAdapter$SelectionHolder_ViewBinding selectionAdapter$SelectionHolder_ViewBinding) {
        C6431x12296157.write(str, KtaJsonExactionHelper.NAME);
        C6431x12296157.write(selectionAdapter$SelectionHolder_ViewBinding, "Body");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = selectionAdapter$SelectionHolder_ViewBinding;
        StringBuilder sb = new StringBuilder();
        sb.append("form-data; name=\"");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append("\"");
        if (selectionAdapter$SelectionHolder_ViewBinding.write() != null) {
            sb.append("; filename=\"");
            sb.append(selectionAdapter$SelectionHolder_ViewBinding.write());
            sb.append("\"");
        }
        String obj = sb.toString();
        C6431x12296157.write("Content-Disposition", "Field name");
        this.write.MediaBrowserCompat$CustomActionResultReceiver(new DebitCardDetailAdapter$DebitCardHolder("Content-Disposition", obj));
        CreditCardDetailUnbilledAdapter$ParentViewHolder creditCardDetailUnbilledAdapter$ParentViewHolder = ((PurchaseWithdrawalLimitAdapter$LimitCustomViewHolder) selectionAdapter$SelectionHolder_ViewBinding).MediaBrowserCompat$ItemReceiver;
        if (creditCardDetailUnbilledAdapter$ParentViewHolder != null) {
            String obj2 = creditCardDetailUnbilledAdapter$ParentViewHolder.toString();
            C6431x12296157.write("Content-Type", "Field name");
            this.write.MediaBrowserCompat$CustomActionResultReceiver(new DebitCardDetailAdapter$DebitCardHolder("Content-Type", obj2));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(selectionAdapter$SelectionHolder_ViewBinding.IconCompatParcelizer());
            if (selectionAdapter$SelectionHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver() != null) {
                sb2.append("; charset=");
                sb2.append(selectionAdapter$SelectionHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver());
            }
            String obj3 = sb2.toString();
            C6431x12296157.write("Content-Type", "Field name");
            this.write.MediaBrowserCompat$CustomActionResultReceiver(new DebitCardDetailAdapter$DebitCardHolder("Content-Type", obj3));
        }
        String MediaBrowserCompat$ItemReceiver2 = selectionAdapter$SelectionHolder_ViewBinding.MediaBrowserCompat$ItemReceiver();
        C6431x12296157.write("Content-Transfer-Encoding", "Field name");
        this.write.MediaBrowserCompat$CustomActionResultReceiver(new DebitCardDetailAdapter$DebitCardHolder("Content-Transfer-Encoding", MediaBrowserCompat$ItemReceiver2));
    }
}
