package com.scb.phone.view.adapter.bankingactions;

import android.content.Context;
import android.util.TypedValue;
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
import java.util.ArrayList;
import p040o.FragmentBuilder_BindBaseRequestToPayFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.awaitTermination;
import p040o.getError;
import p040o.onStart;
import p040o.startTask;

public final class BankingActionAdapter extends RecyclerView.IconCompatParcelizer<CustomViewHolder> {
    public ArrayList<startTask> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public FragmentBuilder_BindBaseRequestToPayFragment read;
    private Context write;

    public class CustomViewHolder_ViewBinding implements Unbinder {
        private CustomViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public CustomViewHolder_ViewBinding(CustomViewHolder customViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = customViewHolder;
            customViewHolder.icon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.banking_action_icon, "field 'icon'", ImageView.class);
            customViewHolder.description = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.banking_action_description, "field 'description'", TextView.class);
            customViewHolder.clickedAnimationView = onStart.IconCompatParcelizer(view, R.id.clicked_animation_view, "field 'clickedAnimationView'");
        }

        public final void read() {
            CustomViewHolder customViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (customViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                customViewHolder.icon = null;
                customViewHolder.description = null;
                customViewHolder.clickedAnimationView = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CustomViewHolder customViewHolder = (CustomViewHolder) setcontentview;
        customViewHolder.PlaybackStateCompat = i;
        startTask starttask = this.MediaBrowserCompat$ItemReceiver.get(i);
        boolean equals = awaitTermination.ENABLED.type.equals(starttask.MediaBrowserCompat$ItemReceiver);
        customViewHolder.AlertController$RecycleListView = equals;
        customViewHolder.clickedAnimationView.setEnabled(equals);
        customViewHolder.icon.setPadding((int) TypedValue.applyDimension(1, 20.0f, this.write.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, this.write.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 20.0f, this.write.getResources().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 10.0f, this.write.getResources().getDisplayMetrics()));
        customViewHolder.description.setPadding((int) TypedValue.applyDimension(1, 4.0f, this.write.getResources().getDisplayMetrics()), 0, (int) TypedValue.applyDimension(1, 4.0f, this.write.getResources().getDisplayMetrics()), 0);
        customViewHolder.description.setText(starttask.RatingCompat);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$SearchResultReceiver(customViewHolder.icon, starttask.MediaBrowserCompat$CustomActionResultReceiver);
        if (equals) {
            customViewHolder.icon.setAlpha(1.0f);
            customViewHolder.description.setAlpha(1.0f);
            return;
        }
        customViewHolder.icon.setAlpha(0.2f);
        customViewHolder.description.setAlpha(0.2f);
    }

    public BankingActionAdapter(FragmentBuilder_BindBaseRequestToPayFragment fragmentBuilder_BindBaseRequestToPayFragment, Context context) {
        this.read = fragmentBuilder_BindBaseRequestToPayFragment;
        this.write = context;
    }

    public final int IconCompatParcelizer() {
        ArrayList<startTask> arrayList = this.MediaBrowserCompat$ItemReceiver;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public class CustomViewHolder extends RecyclerView.setContentView {
        public boolean AlertController$RecycleListView;
        public int PlaybackStateCompat;
        @BindView
        View clickedAnimationView;
        @BindView
        TextView description;
        @BindView
        ImageView icon;

        CustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            view.setOnClickListener(new getError(this));
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82262131493452, (ViewGroup) null));
    }
}
