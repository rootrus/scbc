package p040o;

import com.scb.phone.view.adapter.bulktransfer.C5732x2f6300af;
import com.scb.phone.view.adapter.bulktransfer.SelectRecipientFromFavouriteAdapter;

/* renamed from: o.portfolioSummary */
public final /* synthetic */ class portfolioSummary implements C5732x2f6300af {
    private final /* synthetic */ SelectRecipientFromFavouriteAdapter IconCompatParcelizer;

    public /* synthetic */ portfolioSummary(SelectRecipientFromFavouriteAdapter selectRecipientFromFavouriteAdapter) {
        this.IconCompatParcelizer = selectRecipientFromFavouriteAdapter;
    }

    public final void read(int i) {
        SelectRecipientFromFavouriteAdapter.read(this.IconCompatParcelizer, i);
    }
}
