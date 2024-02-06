package com.scb.phone.view.adapter.bulktransfer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.List;
import p040o.ForgotPinApi;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.InsuranceApi;
import p040o.getNextTransition;
import p040o.initiatePayment;
import p040o.onStart;
import p040o.portfolioSummary;
import p040o.postGoogleSignin;
import p040o.setLastBaselineToBottomHeight;
import p040o.setNameFormat;
import p040o.show;

public final class SelectRecipientFromFavouriteAdapter extends RecyclerView.IconCompatParcelizer<RecipientViewHolder> {
    private C5731x73b61c49 MediaBrowserCompat$ItemReceiver;
    private final int read;
    public final List<setNameFormat> write;

    public class RecipientViewHolder_ViewBinding implements Unbinder {
        private RecipientViewHolder write;

        public RecipientViewHolder_ViewBinding(RecipientViewHolder recipientViewHolder, View view) {
            this.write = recipientViewHolder;
            recipientViewHolder.billerName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_name_text_view, "field 'billerName'", TextView.class);
            recipientViewHolder.billerAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.biller_avatar_image_view, "field 'billerAvatar'", ImageView.class);
            recipientViewHolder.checkBox = (CheckBox) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.checkbox, "field 'checkBox'", CheckBox.class);
        }

        public final void read() {
            RecipientViewHolder recipientViewHolder = this.write;
            if (recipientViewHolder != null) {
                this.write = null;
                recipientViewHolder.billerName = null;
                recipientViewHolder.billerAvatar = null;
                recipientViewHolder.checkBox = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        RecipientViewHolder recipientViewHolder = (RecipientViewHolder) setcontentview;
        setNameFormat setnameformat = this.write.get(i);
        recipientViewHolder.setHasDecor.setOnClickListener(new initiatePayment(recipientViewHolder, setnameformat, i));
        recipientViewHolder.billerName.setText(setnameformat.MediaDescriptionCompat);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(recipientViewHolder.setHasDecor.getContext(), (int) R.drawable.bankicon_place_holder, recipientViewHolder.billerAvatar, setnameformat.IconCompatParcelizer, recipientViewHolder.setHasDecor.getContext().getResources().getDimensionPixelOffset(R.dimen.f72032131165280), setLastBaselineToBottomHeight.read(recipientViewHolder.setHasDecor.getContext(), R.color.f66402131099796));
        recipientViewHolder.checkBox.setChecked(setnameformat.MediaMetadataCompat);
        recipientViewHolder.setHasDecor.setAlpha(setnameformat.MediaBrowserCompat$MediaItem ? 1.0f : 0.5f);
    }

    public SelectRecipientFromFavouriteAdapter(List<setNameFormat> list, int i, C5731x73b61c49 selectRecipientFromFavouriteAdapter$MediaBrowserCompat$ItemReceiver) {
        this.write = list;
        this.MediaBrowserCompat$ItemReceiver = selectRecipientFromFavouriteAdapter$MediaBrowserCompat$ItemReceiver;
        this.read = i;
    }

    private void MediaBrowserCompat$ItemReceiver() {
        show read2 = new show(this.write).read(InsuranceApi.read);
        ForgotPinApi forgotPinApi = ForgotPinApi.MediaBrowserCompat$ItemReceiver;
        while (read2.IconCompatParcelizer.hasNext()) {
            forgotPinApi.MediaBrowserCompat$ItemReceiver(read2.IconCompatParcelizer.next());
        }
        this.IconCompatParcelizer.write();
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public static class RecipientViewHolder extends RecyclerView.setContentView {
        public final C5732x2f6300af Keep;
        @BindView
        public ImageView billerAvatar;
        @BindView
        public TextView billerName;
        @BindView
        public CheckBox checkBox;
        final View setHasDecor;

        RecipientViewHolder(View view, C5732x2f6300af selectRecipientFromFavouriteAdapter$RecipientViewHolder$MediaBrowserCompat$ItemReceiver) {
            super(view);
            this.setHasDecor = view;
            this.Keep = selectRecipientFromFavouriteAdapter$RecipientViewHolder$MediaBrowserCompat$ItemReceiver;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static /* synthetic */ void read(SelectRecipientFromFavouriteAdapter selectRecipientFromFavouriteAdapter, int i) {
        show show = new show(selectRecipientFromFavouriteAdapter.write);
        long write2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, InsuranceApi.read)).write();
        int i2 = (((long) (10 - selectRecipientFromFavouriteAdapter.read)) > write2 ? 1 : (((long) (10 - selectRecipientFromFavouriteAdapter.read)) == write2 ? 0 : -1));
        boolean z = false;
        if (i2 < 0) {
            selectRecipientFromFavouriteAdapter.write.get(i).MediaMetadataCompat = false;
            selectRecipientFromFavouriteAdapter.MediaBrowserCompat$ItemReceiver();
        } else if (i2 == 0) {
            selectRecipientFromFavouriteAdapter.MediaBrowserCompat$ItemReceiver();
        } else {
            show show2 = new show(selectRecipientFromFavouriteAdapter.write);
            postGoogleSignin postgooglesignin = postGoogleSignin.write;
            while (show2.IconCompatParcelizer.hasNext()) {
                postgooglesignin.MediaBrowserCompat$ItemReceiver(show2.IconCompatParcelizer.next());
            }
            selectRecipientFromFavouriteAdapter.IconCompatParcelizer.write();
        }
        C5731x73b61c49 selectRecipientFromFavouriteAdapter$MediaBrowserCompat$ItemReceiver = selectRecipientFromFavouriteAdapter.MediaBrowserCompat$ItemReceiver;
        if (write2 > 0) {
            z = true;
        }
        selectRecipientFromFavouriteAdapter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(z);
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new RecipientViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f91442131494371, viewGroup, false), new portfolioSummary(this));
    }
}
