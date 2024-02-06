package p040o;

import com.scb.phone.view.custom.easycash.CustomAccountSelector$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.financialinformation.AdditionDocumentScbAccountFragment;

/* renamed from: o.getPrepaidTravelConversionConfirm */
public final /* synthetic */ class getPrepaidTravelConversionConfirm implements CustomAccountSelector$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ AdditionDocumentScbAccountFragment read;

    public /* synthetic */ getPrepaidTravelConversionConfirm(AdditionDocumentScbAccountFragment additionDocumentScbAccountFragment) {
        this.read = additionDocumentScbAccountFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.read.scbAccountPresenter.MediaBrowserCompat$CustomActionResultReceiver(i);
    }
}
