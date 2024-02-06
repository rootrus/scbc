package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.AdditionDocumentTypeAdapter;

/* renamed from: o.getBillPaymentReview */
public final /* synthetic */ class getBillPaymentReview implements View.OnClickListener {
    private final /* synthetic */ AdditionDocumentTypeAdapter read;
    private final /* synthetic */ closeOrLog write;

    public /* synthetic */ getBillPaymentReview(AdditionDocumentTypeAdapter additionDocumentTypeAdapter, closeOrLog closeorlog) {
        this.read = additionDocumentTypeAdapter;
        this.write = closeorlog;
    }

    public final void onClick(View view) {
        AdditionDocumentTypeAdapter additionDocumentTypeAdapter = this.read;
        additionDocumentTypeAdapter.read.write(this.write);
    }
}
