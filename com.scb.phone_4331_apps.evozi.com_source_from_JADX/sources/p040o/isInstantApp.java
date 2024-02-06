package p040o;

import android.text.TextUtils;
import java.util.NoSuchElementException;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;

/* renamed from: o.isInstantApp */
public final /* synthetic */ class isInstantApp implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ isInstantApp(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final Object write(Object obj) {
        isSupportFragmentClass issupportfragmentclass;
        CompoundException compoundException = (CompoundException) obj;
        zzvf zzvf = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.write;
        String str = null;
        if (zzvf != null) {
            show show = new show(zzvf.MediaBrowserCompat$ItemReceiver);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new getShadowContours$MediaBrowserCompat$ItemReceiver(compoundException)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
        } else {
            issupportfragmentclass = null;
        }
        int i = 0;
        if (issupportfragmentclass != null) {
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t == null) {
                    throw new NoSuchElementException("No value present");
                } else if (TextUtils.isEmpty(((zzup) t).MediaBrowserCompat$ItemReceiver)) {
                    T t2 = issupportfragmentclass.IconCompatParcelizer;
                    if (t2 != null) {
                        str = ((zzup) t2).IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                }
            }
        }
        double d = compoundException.f5501x50fd9e4a;
        double d2 = compoundException.MediaSessionCompat$QueueItem;
        double d3 = compoundException.read;
        setOnPolylineClickListener setonpolylineclicklistener = new setOnPolylineClickListener();
        setonpolylineclicklistener.AlertController$RecycleListView = setOnMyLocationChangeListener.read(compoundException.Keep);
        setonpolylineclicklistener.IconCompatParcelizer = compoundException.MediaDescriptionCompat;
        if (TextUtils.isEmpty(str)) {
            str = compoundException.MediaSessionCompat$ResultReceiverWrapper;
        }
        setonpolylineclicklistener.write = str;
        setonpolylineclicklistener.MediaBrowserCompat$CustomActionResultReceiver = compoundException.read;
        setonpolylineclicklistener.read = d3 - (d + d2);
        if (compoundException.MediaMetadataCompat != null) {
            i = Integer.valueOf(compoundException.MediaMetadataCompat).intValue();
        }
        setonpolylineclicklistener.MediaBrowserCompat$SearchResultReceiver = i;
        setonpolylineclicklistener.MediaDescriptionCompat = compoundException.RatingCompat;
        setonpolylineclicklistener.MediaSessionCompat$ResultReceiverWrapper = compoundException.MediaSessionCompat$Token;
        setonpolylineclicklistener.ParcelableVolumeInfo = compoundException.AlertController$RecycleListView;
        setonpolylineclicklistener.MediaMetadataCompat = compoundException.IconCompatParcelizer;
        setonpolylineclicklistener.RatingCompat = compoundException.MediaBrowserCompat$ItemReceiver;
        setonpolylineclicklistener.MediaSessionCompat$QueueItem = compoundException.write;
        setonpolylineclicklistener.MediaSessionCompat$Token = compoundException.MediaBrowserCompat$SearchResultReceiver;
        setonpolylineclicklistener.f2954x50fd9e4a = compoundException.MediaBrowserCompat$MediaItem;
        setonpolylineclicklistener.MediaBrowserCompat$MediaItem = compoundException.ParcelableVolumeInfo;
        setonpolylineclicklistener.setHasDecor = d;
        setonpolylineclicklistener.Keep = d2;
        setonpolylineclicklistener.MediaBrowserCompat$ItemReceiver = compoundException.MediaBrowserCompat$CustomActionResultReceiver;
        return DebitCardResetOtpActivity.just(setonpolylineclicklistener);
    }
}
