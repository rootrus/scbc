package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.Service;

/* renamed from: o.immutableEntry  reason: case insensitive filesystem */
public final class C10843immutableEntry extends constrainedSetMultimap<C6958xd50139e8, Service.State> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        C6958xd50139e8 merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding = (C6958xd50139e8) obj;
        Service.State MediaBrowserCompat$ItemReceiver = Service.State.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver.intValue();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.write;
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.read;
        MediaBrowserCompat$ItemReceiver.read = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.recipients_group_number, new Object[]{String.valueOf(merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver.intValue())});
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver = write(merchantWalletOutgoingTransactionAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer);
        return MediaBrowserCompat$ItemReceiver;
    }

    @HmlPinActivity
    public C10843immutableEntry(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }
}
