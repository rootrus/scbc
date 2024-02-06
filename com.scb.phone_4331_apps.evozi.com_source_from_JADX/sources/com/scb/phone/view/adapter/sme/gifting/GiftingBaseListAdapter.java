package com.scb.phone.view.adapter.sme.gifting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.onStart;

public abstract class GiftingBaseListAdapter extends RecyclerView.IconCompatParcelizer<GiftViewHolder> {
    public GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    public List<AutoValue_CrashlyticsReport_Session_User> read = new ArrayList();
    public Context write;

    /* access modifiers changed from: protected */
    public abstract CharSequence MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: protected */
    public abstract CharSequence write();

    public class GiftViewHolder_ViewBinding implements Unbinder {
        private GiftViewHolder MediaBrowserCompat$ItemReceiver;

        public GiftViewHolder_ViewBinding(GiftViewHolder giftViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = giftViewHolder;
            giftViewHolder.giftArea = onStart.IconCompatParcelizer(view, R.id.gift_area, "field 'giftArea'");
            giftViewHolder.giftImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_image, "field 'giftImage'", ImageView.class);
            giftViewHolder.giftName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_name, "field 'giftName'", TextView.class);
            giftViewHolder.giftDestination = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_destination, "field 'giftDestination'", TextView.class);
            giftViewHolder.giftSenderReceiver = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_sender_received, "field 'giftSenderReceiver'", TextView.class);
            giftViewHolder.giftDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_transaction_date_time, "field 'giftDateTime'", TextView.class);
            giftViewHolder.giftAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_amount, "field 'giftAmount'", TextView.class);
            giftViewHolder.giftStatus = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_status, "field 'giftStatus'", TextView.class);
        }

        public final void read() {
            GiftViewHolder giftViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (giftViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                giftViewHolder.giftArea = null;
                giftViewHolder.giftImage = null;
                giftViewHolder.giftName = null;
                giftViewHolder.giftDestination = null;
                giftViewHolder.giftSenderReceiver = null;
                giftViewHolder.giftDateTime = null;
                giftViewHolder.giftAmount = null;
                giftViewHolder.giftStatus = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public GiftingBaseListAdapter(Context context, List<AutoValue_CrashlyticsReport_Session_User> list, GiftingBaseListAdapter$MediaBrowserCompat$ItemReceiver giftingBaseListAdapter$MediaBrowserCompat$ItemReceiver) {
        this.write = context;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = giftingBaseListAdapter$MediaBrowserCompat$ItemReceiver;
    }

    /* renamed from: IconCompatParcelizer */
    public void MediaBrowserCompat$CustomActionResultReceiver(GiftViewHolder giftViewHolder, int i) {
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = this.read.get(i);
        Picasso.read().write(autoValue_CrashlyticsReport_Session_User.RatingCompat).read(giftViewHolder.giftImage, (FragmentBuilder_BindEkycFragment) null);
        giftViewHolder.giftName.setText(autoValue_CrashlyticsReport_Session_User.MediaDescriptionCompat);
        giftViewHolder.giftSenderReceiver.setText(this.write.getString(R.string.two_words, new Object[]{write(), autoValue_CrashlyticsReport_Session_User.ParcelableVolumeInfo}));
        TextView textView = giftViewHolder.giftDestination;
        Context context = this.write;
        textView.setText(context.getString(R.string.two_words, new Object[]{context.getResources().getString(R.string.gift_to), autoValue_CrashlyticsReport_Session_User.IconCompatParcelizer}));
        giftViewHolder.giftDateTime.setText(this.write.getString(R.string.two_words, new Object[]{MediaBrowserCompat$CustomActionResultReceiver(), autoValue_CrashlyticsReport_Session_User.AlertController$RecycleListView}));
    }

    public final void MediaBrowserCompat$ItemReceiver(List<AutoValue_CrashlyticsReport_Session_User> list) {
        this.read.addAll(list);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public class GiftViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView giftAmount;
        @BindView
        public View giftArea;
        @BindView
        TextView giftDateTime;
        @BindView
        TextView giftDestination;
        @BindView
        ImageView giftImage;
        @BindView
        TextView giftName;
        @BindView
        TextView giftSenderReceiver;
        @BindView
        public TextView giftStatus;

        public GiftViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new GiftViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82982131493524, viewGroup, false));
    }
}
