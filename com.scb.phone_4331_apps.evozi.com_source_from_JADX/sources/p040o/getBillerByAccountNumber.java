package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.AdditionDocumentAdapter;
import com.scb.phone.view.adapter.easycash.C5743x44174185;

/* renamed from: o.getBillerByAccountNumber */
public final /* synthetic */ class getBillerByAccountNumber implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ closeOrLog MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AdditionDocumentAdapter write;

    public /* synthetic */ getBillerByAccountNumber(AdditionDocumentAdapter additionDocumentAdapter, int i, closeOrLog closeorlog) {
        this.write = additionDocumentAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = closeorlog;
    }

    public final void onClick(View view) {
        AdditionDocumentAdapter additionDocumentAdapter = this.write;
        String str = this.MediaBrowserCompat$ItemReceiver.write;
        C5743x44174185 additionDocumentAdapter$MediaBrowserCompat$CustomActionResultReceiver = additionDocumentAdapter.MediaBrowserCompat$ItemReceiver;
        if (additionDocumentAdapter$MediaBrowserCompat$CustomActionResultReceiver != null) {
            additionDocumentAdapter$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
        }
    }
}
