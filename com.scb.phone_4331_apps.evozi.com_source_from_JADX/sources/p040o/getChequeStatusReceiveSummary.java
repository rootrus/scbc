package p040o;

import android.view.View;
import p040o.validateEligibility;

/* renamed from: o.getChequeStatusReceiveSummary */
public final /* synthetic */ class getChequeStatusReceiveSummary implements View.OnClickListener {
    private final /* synthetic */ validateEligibility.read IconCompatParcelizer;
    private final /* synthetic */ lambda$getSortedCustomAttributes$0 read;

    public /* synthetic */ getChequeStatusReceiveSummary(validateEligibility.read read2, lambda$getSortedCustomAttributes$0 lambda_getsortedcustomattributes_0) {
        this.IconCompatParcelizer = read2;
        this.read = lambda_getsortedcustomattributes_0;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.write(this.read);
    }
}
