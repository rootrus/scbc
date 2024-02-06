package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment;

/* renamed from: o.writeDoubleSparseArray */
public final /* synthetic */ class writeDoubleSparseArray implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ HmlBusinessOwnerETBPersonalInfoFragment.read read;

    public /* synthetic */ writeDoubleSparseArray(HmlBusinessOwnerETBPersonalInfoFragment.read read2, int i) {
        this.read = read2;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        HmlBusinessOwnerETBPersonalInfoFragment.read read2 = this.read;
        int i = this.MediaBrowserCompat$ItemReceiver;
        SingleDataEntity<addFrameListener> singleDataEntity = (SingleDataEntity) obj;
        FragmentBuilder_BindProductDetailFragment fragmentBuilder_BindProductDetailFragment = read2.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindProductDetailFragment.MediaBrowserCompat$CustomActionResultReceiver == null) {
            fragmentBuilder_BindProductDetailFragment.MediaBrowserCompat$CustomActionResultReceiver = singleDataEntity;
        }
        fragmentBuilder_BindProductDetailFragment.write = i;
    }
}
