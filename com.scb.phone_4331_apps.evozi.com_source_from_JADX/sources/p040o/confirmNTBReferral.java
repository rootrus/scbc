package p040o;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter;
import com.scb.phone.view.adapter.sme.gifting.GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver;
import java.util.List;

/* renamed from: o.confirmNTBReferral */
public final class confirmNTBReferral extends GiftingBaseListAdapter {
    read MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: o.confirmNTBReferral$read */
    public interface read extends GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver {
        void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User);
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        GiftingBaseListAdapter.GiftViewHolder giftViewHolder = (GiftingBaseListAdapter.GiftViewHolder) setcontentview;
        super.MediaBrowserCompat$CustomActionResultReceiver(giftViewHolder, i);
        MediaBrowserCompat$CustomActionResultReceiver(giftViewHolder, this.read.get(i));
    }

    public confirmNTBReferral(Context context, List<AutoValue_CrashlyticsReport_Session_User> list, read read2) {
        super(context, list, read2);
        this.MediaBrowserCompat$SearchResultReceiver = read2;
    }

    public final void IconCompatParcelizer(GiftingBaseListAdapter.GiftViewHolder giftViewHolder, int i) {
        super.MediaBrowserCompat$CustomActionResultReceiver(giftViewHolder, i);
        MediaBrowserCompat$CustomActionResultReceiver(giftViewHolder, this.read.get(i));
    }

    public final CharSequence write() {
        return this.write.getResources().getString(R.string.gift_sender);
    }

    public final CharSequence MediaBrowserCompat$CustomActionResultReceiver() {
        return this.write.getResources().getString(R.string.gift_datetime_received_on);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(GiftingBaseListAdapter.GiftViewHolder giftViewHolder, AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        withNdkPayload withndkpayload = autoValue_CrashlyticsReport_Session_User.PlaybackStateCompat$CustomAction;
        if (withndkpayload.MediaBrowserCompat$CustomActionResultReceiver.equals("OPEN NOW")) {
            giftViewHolder.giftStatus.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f67252131099881));
            giftViewHolder.giftArea.setOnClickListener(new EasycashService(this, autoValue_CrashlyticsReport_Session_User));
        } else {
            giftViewHolder.giftStatus.setTextColor(setLastBaselineToBottomHeight.read(this.write, R.color.f66182131099773));
            giftViewHolder.giftArea.setOnClickListener(new additionDocumentScbAccount(this, autoValue_CrashlyticsReport_Session_User));
        }
        giftViewHolder.giftStatus.setText(withndkpayload.MediaBrowserCompat$ItemReceiver);
        giftViewHolder.giftAmount.setVisibility(8);
        giftViewHolder.giftStatus.setVisibility(0);
    }
}
