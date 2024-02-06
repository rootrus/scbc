package p040o;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: o.FragmentBuilder_BindFundAwaitingTransactionsTabFragment */
public final class FragmentBuilder_BindFundAwaitingTransactionsTabFragment {
    long IconCompatParcelizer;
    long MediaBrowserCompat$CustomActionResultReceiver;
    long MediaBrowserCompat$ItemReceiver;
    public final Handler MediaBrowserCompat$MediaItem = new C6532xb8559bb(this.MediaSessionCompat$ResultReceiverWrapper.getLooper(), this);
    long MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    long f3142x50fd9e4a;
    int MediaDescriptionCompat;
    long MediaMetadataCompat;
    long MediaSessionCompat$QueueItem;
    private HandlerThread MediaSessionCompat$ResultReceiverWrapper;
    int ParcelableVolumeInfo;
    int RatingCompat;
    final FragmentBuilder_BindEditFavouriteFragment read;
    long write;

    public FragmentBuilder_BindFundAwaitingTransactionsTabFragment(FragmentBuilder_BindEditFavouriteFragment fragmentBuilder_BindEditFavouriteFragment) {
        this.read = fragmentBuilder_BindEditFavouriteFragment;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.MediaSessionCompat$ResultReceiverWrapper = handlerThread;
        handlerThread.start();
        FragmentBuilder_BindFundRedeemSearchListFragment.write(this.MediaSessionCompat$ResultReceiverWrapper.getLooper());
    }
}
