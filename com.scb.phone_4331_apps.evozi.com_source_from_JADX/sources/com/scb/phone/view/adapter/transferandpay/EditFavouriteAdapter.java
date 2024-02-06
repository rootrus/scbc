package com.scb.phone.view.adapter.transferandpay;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindBaseInvestmentSuccessReviewFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getCreditPowerLanding;
import p040o.getEasycashDeeplink;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateSPMV;

public final class EditFavouriteAdapter extends RecyclerView.IconCompatParcelizer<EditFavouriteHolder> {
    public FragmentBuilder_BindBaseInvestmentSuccessReviewFragment MediaBrowserCompat$ItemReceiver;
    private Drawable MediaDescriptionCompat;
    private List<? extends CrashlyticsReport.Session.Builder> read;
    private Context write;

    public class EditFavouriteHolder_ViewBinding implements Unbinder {
        private EditFavouriteHolder MediaBrowserCompat$ItemReceiver;

        public EditFavouriteHolder_ViewBinding(EditFavouriteHolder editFavouriteHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = editFavouriteHolder;
            editFavouriteHolder.avatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_favourite_icon, "field 'avatar'", ImageView.class);
            editFavouriteHolder.title = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_favourite_title, "field 'title'", TextView.class);
            editFavouriteHolder.deleteButton = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_favourite_delete_relative_layout, "field 'deleteButton'", RelativeLayout.class);
            editFavouriteHolder.editButton = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_favourite_edit_relative_layout, "field 'editButton'", RelativeLayout.class);
            editFavouriteHolder.divider = onStart.IconCompatParcelizer(view, R.id.edit_favourite_divider_view, "field 'divider'");
            editFavouriteHolder.fullDivider = onStart.IconCompatParcelizer(view, R.id.edit_favourite_full_divider_view, "field 'fullDivider'");
        }

        public final void read() {
            EditFavouriteHolder editFavouriteHolder = this.MediaBrowserCompat$ItemReceiver;
            if (editFavouriteHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                editFavouriteHolder.avatar = null;
                editFavouriteHolder.title = null;
                editFavouriteHolder.deleteButton = null;
                editFavouriteHolder.editButton = null;
                editFavouriteHolder.divider = null;
                editFavouriteHolder.fullDivider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        EditFavouriteHolder editFavouriteHolder = (EditFavouriteHolder) setcontentview;
        CrashlyticsReport.Session.Builder builder = (CrashlyticsReport.Session.Builder) this.read.get(i);
        CrashlyticsReport.Session.Event.Application.Builder builder2 = (CrashlyticsReport.Session.Event.Application.Builder) builder;
        editFavouriteHolder.title.setText(builder.read());
        editFavouriteHolder.deleteButton.setOnClickListener(new getCreditPowerLanding(this, i));
        editFavouriteHolder.editButton.setOnClickListener(new getEasycashDeeplink(this, i, builder));
        if ("TRANSFER".equalsIgnoreCase(builder2.PlaybackStateCompat)) {
            this.MediaDescriptionCompat = setLastBaselineToBottomHeight.write(this.write, R.drawable.bankicon_place_holder);
        } else if ("REMITTANCE".equalsIgnoreCase(builder2.PlaybackStateCompat)) {
            this.MediaDescriptionCompat = setLastBaselineToBottomHeight.write(this.write, R.drawable.bankicon_remittance);
        }
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.MediaDescriptionCompat, editFavouriteHolder.avatar, builder.MediaBrowserCompat$CustomActionResultReceiver(), this.write.getResources().getDimensionPixelOffset(R.dimen.f72062131165283), setLastBaselineToBottomHeight.read(this.write, R.color.f66402131099796));
        if (i == this.read.size() - 1) {
            editFavouriteHolder.divider.setVisibility(8);
            editFavouriteHolder.fullDivider.setVisibility(0);
            return;
        }
        editFavouriteHolder.divider.setVisibility(0);
        editFavouriteHolder.fullDivider.setVisibility(8);
    }

    public EditFavouriteAdapter(Context context, FragmentBuilder_BindBaseInvestmentSuccessReviewFragment fragmentBuilder_BindBaseInvestmentSuccessReviewFragment, List<? extends CrashlyticsReport.Session.Builder> list) {
        this.write = context;
        this.read = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBaseInvestmentSuccessReviewFragment;
        this.MediaDescriptionCompat = setLastBaselineToBottomHeight.write(context, R.drawable.biller_place_holder).mutate();
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    public static class EditFavouriteHolder extends validateSPMV {
        @BindView
        ImageView avatar;
        @BindView
        RelativeLayout deleteButton;
        @BindView
        View divider;
        @BindView
        RelativeLayout editButton;
        @BindView
        View fullDivider;
        @BindView
        TextView title;

        public EditFavouriteHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new EditFavouriteHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82702131493496, viewGroup, false));
    }
}
