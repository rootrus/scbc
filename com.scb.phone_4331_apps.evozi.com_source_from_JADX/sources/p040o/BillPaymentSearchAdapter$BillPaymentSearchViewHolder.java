package p040o;

import android.content.Context;
import p040o.ProxySourceAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.BillPaymentSearchAdapter$BillPaymentSearchViewHolder */
public final class BillPaymentSearchAdapter$BillPaymentSearchViewHolder {
    public final TransferToMeStep1Adapter$LocalViewHolder MediaBrowserCompat$ItemReceiver;
    public final TransferToMeStep1Adapter$LocalViewHolder_ViewBinding read;

    private BillPaymentSearchAdapter$BillPaymentSearchViewHolder(Context context, ProxySourceAdapter$ItemViewHolder_ViewBinding proxySourceAdapter$ItemViewHolder_ViewBinding) {
        TransferToMeStep1Adapter$LocalViewHolder_ViewBinding transferToMeStep1Adapter$LocalViewHolder_ViewBinding = new TransferToMeStep1Adapter$LocalViewHolder_ViewBinding(context, proxySourceAdapter$ItemViewHolder_ViewBinding);
        this.read = transferToMeStep1Adapter$LocalViewHolder_ViewBinding;
        this.MediaBrowserCompat$ItemReceiver = new TransferToMeStep1Adapter$LocalViewHolder(transferToMeStep1Adapter$LocalViewHolder_ViewBinding);
    }

    public BillPaymentSearchAdapter$BillPaymentSearchViewHolder(Context context) {
        this(context, new ProxySourceAdapter$ItemViewHolder_ViewBinding(new ProxySourceAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer(), (byte) 0));
    }
}
