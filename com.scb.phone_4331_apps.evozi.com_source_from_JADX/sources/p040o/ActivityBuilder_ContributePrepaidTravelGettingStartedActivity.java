package p040o;

import com.scb.phone.view.adapter.requesttopay.IncomingAdapter;
import com.scb.phone.view.fragment.requesttopay.IncomingFragment;
import java.util.List;
import p040o.C4957mT;
import p040o.ImmutableSortedMap;

/* renamed from: o.ActivityBuilder_ContributePrepaidTravelGettingStartedActivity */
public final /* synthetic */ class ActivityBuilder_ContributePrepaidTravelGettingStartedActivity implements IncomingAdapter.IconCompatParcelizer {
    private final /* synthetic */ IncomingFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributePrepaidTravelGettingStartedActivity(IncomingFragment incomingFragment, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = incomingFragment;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        IncomingFragment incomingFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        List<ImmutableSortedMap.Builder> list = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            C4957mT mTVar = incomingFragment.incomingPresenter;
            if (mTVar.IconCompatParcelizer <= mTVar.MediaDescriptionCompat) {
                if (mTVar.RatingCompat != null) {
                    mTVar.RatingCompat.Keep();
                }
                ImmutableSortedMap.SerializedForm IconCompatParcelizer = ImmutableSortedMap.SerializedForm.IconCompatParcelizer();
                IconCompatParcelizer.read = list;
                IconCompatParcelizer.IconCompatParcelizer = "90";
                IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = "10";
                IconCompatParcelizer.write = String.valueOf(mTVar.IconCompatParcelizer);
                StreetViewPanoramaLocation streetViewPanoramaLocation = mTVar.MediaBrowserCompat$ItemReceiver;
                if (!streetViewPanoramaLocation.MediaBrowserCompat$MediaItem.isDisposed()) {
                    streetViewPanoramaLocation.MediaBrowserCompat$MediaItem.dispose();
                }
                mTVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
                mTVar.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C4957mT.read(mTVar, (byte) 0));
            }
        }
    }
}
