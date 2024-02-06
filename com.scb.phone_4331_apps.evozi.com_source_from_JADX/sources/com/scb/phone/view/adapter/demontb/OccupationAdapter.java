package com.scb.phone.view.adapter.demontb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_FilesPayload;
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.acceptTc;
import p040o.onStart;

public final class OccupationAdapter extends RecyclerView.IconCompatParcelizer<CustomViewHolder> {
    public final List<AutoValue_CrashlyticsReport_FilesPayload.C30601> MediaBrowserCompat$ItemReceiver;
    public final FragmentBuilder_BindCardlessWithdrawAmountFragment read;

    public class CustomViewHolder_ViewBinding implements Unbinder {
        private CustomViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public CustomViewHolder_ViewBinding(CustomViewHolder customViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = customViewHolder;
            customViewHolder.description = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.occupation_description, "field 'description'", ThaiTextView.class);
        }

        public final void read() {
            CustomViewHolder customViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (customViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                customViewHolder.description = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        CustomViewHolder customViewHolder = (CustomViewHolder) setcontentview;
        customViewHolder.description.setText(this.MediaBrowserCompat$ItemReceiver.get(i).IconCompatParcelizer);
        customViewHolder.write.setOnClickListener(new acceptTc(this, i));
    }

    public OccupationAdapter(List<AutoValue_CrashlyticsReport_FilesPayload.C30601> list, FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment) {
        this.MediaBrowserCompat$ItemReceiver = list;
        this.read = fragmentBuilder_BindCardlessWithdrawAmountFragment;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    class CustomViewHolder extends RecyclerView.setContentView {
        @BindView
        ThaiTextView description;

        CustomViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new CustomViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83482131493574, viewGroup, false));
    }
}
