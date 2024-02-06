package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.easycash.EasycashAdditionalDocumentTypeActivity;
import com.scb.phone.view.adapter.easycash.AdditionDocumentTypeAdapter;

/* renamed from: o.pE */
public final /* synthetic */ class C7343pE implements AdditionDocumentTypeAdapter.read {
    private final /* synthetic */ EasycashAdditionalDocumentTypeActivity IconCompatParcelizer;

    public /* synthetic */ C7343pE(EasycashAdditionalDocumentTypeActivity easycashAdditionalDocumentTypeActivity) {
        this.IconCompatParcelizer = easycashAdditionalDocumentTypeActivity;
    }

    public final void write(closeOrLog closeorlog) {
        EasycashAdditionalDocumentTypeActivity easycashAdditionalDocumentTypeActivity = this.IconCompatParcelizer;
        Intent intent = new Intent();
        intent.putExtra("EXTRA_RESULT_ADDITION_DOCUMENT_TYPE", closeorlog.write);
        intent.putExtra("EXTRA_RESULT_ADDITION_DOCUMENT_DESC", closeorlog.MediaBrowserCompat$ItemReceiver);
        easycashAdditionalDocumentTypeActivity.setResult(-1, intent);
        easycashAdditionalDocumentTypeActivity.finish();
    }
}
