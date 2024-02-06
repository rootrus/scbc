package p040o;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver;
import java.util.List;

/* renamed from: o.calculateMortgageLoan */
public final class calculateMortgageLoan extends GiftingBaseListAdapter {
    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        MediaBrowserCompat$CustomActionResultReceiver((GiftingBaseListAdapter.GiftViewHolder) setcontentview, i);
    }

    public calculateMortgageLoan(Context context, List<AutoValue_CrashlyticsReport_Session_User> list, GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver giftingBaseListAdapter$MediaBrowserCompat$ItemReceiver) {
        super(context, list, giftingBaseListAdapter$MediaBrowserCompat$ItemReceiver);
    }

    public final void IconCompatParcelizer(GiftingBaseListAdapter.GiftViewHolder giftViewHolder, int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver(giftViewHolder, i);
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = this.read.get(i);
        giftViewHolder.giftAmount.setText(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$CustomActionResultReceiver);
        giftViewHolder.giftAmount.setVisibility(0);
        giftViewHolder.giftStatus.setVisibility(8);
        giftViewHolder.giftArea.setOnClickListener(new verifyOpenAccount(this, autoValue_CrashlyticsReport_Session_User));
    }

    public final /* synthetic */ void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(autoValue_CrashlyticsReport_Session_User);
    }

    public final CharSequence write() {
        return this.write.getResources().getString(R.string.gift_recipient);
    }

    public final CharSequence MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write.getResources().getString(R.string.gift_datetime_sent_on);
    }
}
