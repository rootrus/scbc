package p040o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.custom.easycash.CustomEasyCashLoanSummaryCard;
import java.util.List;

/* renamed from: o.getRepeat */
public final class getRepeat extends RecyclerView.IconCompatParcelizer<read> {
    private List<performUpdateApp> MediaBrowserCompat$ItemReceiver;
    private write read;

    /* renamed from: o.getRepeat$write */
    public interface write {
        void read(int i);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        read read2 = (read) setcontentview;
        performUpdateApp performupdateapp = this.MediaBrowserCompat$ItemReceiver.get(i);
        write write2 = this.read;
        if (read2.write instanceof CustomEasyCashLoanSummaryCard) {
            CustomEasyCashLoanSummaryCard customEasyCashLoanSummaryCard = (CustomEasyCashLoanSummaryCard) read2.write;
            customEasyCashLoanSummaryCard.setLoanName(performupdateapp.MediaSessionCompat$QueueItem);
            customEasyCashLoanSummaryCard.setLoanImageFromUrl(performupdateapp.MediaMetadataCompat);
            customEasyCashLoanSummaryCard.setCreditAmount(performupdateapp.MediaBrowserCompat$ItemReceiver);
            customEasyCashLoanSummaryCard.setLoanDetails(performupdateapp.read);
            customEasyCashLoanSummaryCard.setApplyNowButton(performupdateapp.IconCompatParcelizer.booleanValue(), new getRecommandedBiller(read2, write2));
        }
    }

    public getRepeat(List<performUpdateApp> list, write write2) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = write2;
    }

    public final int IconCompatParcelizer() {
        List<performUpdateApp> list = this.MediaBrowserCompat$ItemReceiver;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: o.getRepeat$read */
    public class read extends RecyclerView.setContentView {
        read(View view) {
            super(view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        CustomEasyCashLoanSummaryCard customEasyCashLoanSummaryCard = new CustomEasyCashLoanSummaryCard(viewGroup.getContext());
        customEasyCashLoanSummaryCard.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new read(customEasyCashLoanSummaryCard);
    }
}
