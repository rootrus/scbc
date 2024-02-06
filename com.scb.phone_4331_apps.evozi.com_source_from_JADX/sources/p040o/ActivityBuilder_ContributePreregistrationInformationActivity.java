package p040o;

import com.scb.phone.view.adapter.requesttopay.OutgoingAdapter$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.requesttopay.OutgoingFragment;
import java.util.List;
import p040o.ImmutableSortedMap;

/* renamed from: o.ActivityBuilder_ContributePreregistrationInformationActivity */
public final /* synthetic */ class ActivityBuilder_ContributePreregistrationInformationActivity implements OutgoingAdapter$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ List MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ OutgoingFragment write;

    public /* synthetic */ ActivityBuilder_ContributePreregistrationInformationActivity(OutgoingFragment outgoingFragment, List list) {
        this.write = outgoingFragment;
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        OutgoingFragment outgoingFragment = this.write;
        List<ImmutableSortedMap.Builder> list = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            C4960mX mXVar = outgoingFragment.outgoingPresenter;
            if (mXVar.read <= mXVar.MediaBrowserCompat$SearchResultReceiver) {
                if (mXVar.RatingCompat != null) {
                    mXVar.RatingCompat.Keep();
                }
                ImmutableSortedMap.SerializedForm IconCompatParcelizer = ImmutableSortedMap.SerializedForm.IconCompatParcelizer();
                IconCompatParcelizer.read = list;
                IconCompatParcelizer.IconCompatParcelizer = "90";
                IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = "10";
                IconCompatParcelizer.write = String.valueOf(mXVar.read);
                clearConditionalUserPropertyAs clearconditionaluserpropertyas = mXVar.write;
                if (!clearconditionaluserpropertyas.MediaBrowserCompat$MediaItem.isDisposed()) {
                    clearconditionaluserpropertyas.MediaBrowserCompat$MediaItem.dispose();
                }
                mXVar.write.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
                mXVar.write.IconCompatParcelizer(new mX$MediaBrowserCompat$ItemReceiver(mXVar, (byte) 0));
            }
        }
    }
}
