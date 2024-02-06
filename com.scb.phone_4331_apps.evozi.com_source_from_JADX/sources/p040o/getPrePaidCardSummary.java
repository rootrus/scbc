package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.easycash.financialinformation.AdditionDocumentInputFragment;
import p040o.ImageProcessor;

/* renamed from: o.getPrePaidCardSummary */
public final /* synthetic */ class getPrePaidCardSummary implements DialogInterface.OnClickListener {
    private final /* synthetic */ AdditionDocumentInputFragment IconCompatParcelizer;
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getPrePaidCardSummary(AdditionDocumentInputFragment additionDocumentInputFragment, String str) {
        this.IconCompatParcelizer = additionDocumentInputFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        AdditionDocumentInputFragment additionDocumentInputFragment = this.IconCompatParcelizer;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        ImageProcessor.ImageOutListener imageOutListener = additionDocumentInputFragment.additionDocumentInputPresenter;
        String read = additionDocumentInputFragment.IconCompatParcelizer.read();
        if (imageOutListener.RatingCompat != null) {
            imageOutListener.RatingCompat.AlertController$RecycleListView();
        }
        imageOutListener.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(read, str, imageOutListener.read);
        imageOutListener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new ImageProcessor$ImageOutListener$MediaBrowserCompat$ItemReceiver(imageOutListener, (byte) 0));
    }
}
