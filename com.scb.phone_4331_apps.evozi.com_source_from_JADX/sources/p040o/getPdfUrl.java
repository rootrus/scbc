package p040o;

import android.view.View;
import com.scb.phone.view.adapter.sme.gifting.GiftSelectRecipientFromFavouriteAdapter;
import p040o.CrashlyticsReport;

/* renamed from: o.getPdfUrl */
public final /* synthetic */ class getPdfUrl implements View.OnClickListener {
    private final /* synthetic */ CrashlyticsReport.Session.Event.Application.Builder IconCompatParcelizer;
    private final /* synthetic */ GiftSelectRecipientFromFavouriteAdapter.RecipientViewHolder read;

    public /* synthetic */ getPdfUrl(GiftSelectRecipientFromFavouriteAdapter.RecipientViewHolder recipientViewHolder, CrashlyticsReport.Session.Event.Application.Builder builder) {
        this.read = recipientViewHolder;
        this.IconCompatParcelizer = builder;
    }

    public final void onClick(View view) {
        GiftSelectRecipientFromFavouriteAdapter.RecipientViewHolder recipientViewHolder = this.read;
        recipientViewHolder.setHasDecor.read(this.IconCompatParcelizer);
    }
}
