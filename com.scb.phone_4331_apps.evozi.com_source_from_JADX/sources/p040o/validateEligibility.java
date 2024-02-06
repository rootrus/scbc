package p040o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.custom.investment.scbs.open.SourceOfFundsItemCustomView;
import java.util.List;

/* renamed from: o.validateEligibility */
public final class validateEligibility extends RecyclerView.IconCompatParcelizer<validateEligibility$MediaBrowserCompat$ItemReceiver> {
    private read MediaBrowserCompat$ItemReceiver;
    private List<lambda$getSortedCustomAttributes$0> write;

    /* renamed from: o.validateEligibility$read */
    public interface read {
        void write(lambda$getSortedCustomAttributes$0 lambda_getsortedcustomattributes_0);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        lambda$getSortedCustomAttributes$0 lambda_getsortedcustomattributes_0 = this.write.get(i);
        read read2 = this.MediaBrowserCompat$ItemReceiver;
        SourceOfFundsItemCustomView sourceOfFundsItemCustomView = ((validateEligibility$MediaBrowserCompat$ItemReceiver) setcontentview).setHasDecor;
        sourceOfFundsItemCustomView.textView.setText(lambda_getsortedcustomattributes_0.write);
        sourceOfFundsItemCustomView.setOnClickListener(new getChequeStatusReceiveSummary(read2, lambda_getsortedcustomattributes_0));
    }

    public validateEligibility(List<lambda$getSortedCustomAttributes$0> list, read read2) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = read2;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new validateEligibility$MediaBrowserCompat$ItemReceiver(new SourceOfFundsItemCustomView(viewGroup.getContext()));
    }
}
