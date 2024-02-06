package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.LottieDrawable;

/* renamed from: o.CredentialRequestResult */
public final class CredentialRequestResult extends FragmentBuilder_BindSummaryFragment {
    public final List<setDataCollectionEnabled> MediaBrowserCompat$CustomActionResultReceiver(List<? extends LottieDrawable.C36224> list) {
        if (list == null) {
            return HmlNationalIdActivity.IconCompatParcelizer;
        }
        Iterable<LottieDrawable.C36224> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (LottieDrawable.C36224 r1 : iterable) {
            if (r1.IconCompatParcelizer == null || r1.MediaBrowserCompat$ItemReceiver == null) {
                new EntityMappingException("MCMC: Loan detail object's sections or keys are null");
            }
            C5290xc2e3dd44 setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver = new C5290xc2e3dd44((byte) 0);
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = r1.MediaBrowserCompat$CustomActionResultReceiver;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = r1.IconCompatParcelizer;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.read = r1.MediaBrowserCompat$ItemReceiver;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.write = r1.read;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver = r1.MediaBrowserCompat$MediaItem;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = r1.write;
            setDataCollectionEnabled setdatacollectionenabled = new setDataCollectionEnabled(setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) setdatacollectionenabled, "LoanDetail.newBuilder()\n…\n                .build()");
            arrayList.add(setdatacollectionenabled);
        }
        return (List) arrayList;
    }
}
