package p040o;

import p040o.Logger;

/* renamed from: o.ImmutableList$MediaBrowserCompat$CustomActionResultReceiver */
public final class ImmutableList$MediaBrowserCompat$CustomActionResultReceiver implements findFragmentByWho {
    private final /* synthetic */ Logger.LogLevel MediaBrowserCompat$ItemReceiver;

    private ImmutableList$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ ImmutableList$MediaBrowserCompat$CustomActionResultReceiver(Logger.LogLevel logLevel) {
        this.MediaBrowserCompat$ItemReceiver = logLevel;
    }

    public final Object IconCompatParcelizer(Object obj) {
        host host = (host) obj;
        C6958xd50139e8 merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding = new C6958xd50139e8();
        merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver = host.MediaBrowserCompat$CustomActionResultReceiver;
        merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.write = host.IconCompatParcelizer;
        merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.read = host.MediaBrowserCompat$ItemReceiver;
        merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver = host.write;
        merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer = host.read;
        return merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding;
    }
}
