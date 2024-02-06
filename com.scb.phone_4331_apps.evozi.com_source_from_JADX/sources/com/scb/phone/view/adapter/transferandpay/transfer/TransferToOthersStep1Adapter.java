package com.scb.phone.view.adapter.transferandpay.transfer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.squareup.picasso.Picasso;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.getPurposefulLoanOffers;
import p040o.getTermsConditionsRequiredDocument;
import p040o.onStart;
import p040o.parseFile;
import p040o.setLastBaselineToBottomHeight;

public final class TransferToOthersStep1Adapter extends RecyclerView.IconCompatParcelizer<LocalViewHolder> {
    /* access modifiers changed from: private */
    public C5788xc993f580 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public write read;
    private List<parseFile> write;

    @FunctionalInterface
    public interface write {
        void IconCompatParcelizer(parseFile parsefile);
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        return (long) i;
    }

    public class LocalViewHolder_ViewBinding implements Unbinder {
        private LocalViewHolder write;

        public LocalViewHolder_ViewBinding(LocalViewHolder localViewHolder, View view) {
            this.write = localViewHolder;
            localViewHolder.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
            localViewHolder.textTitle = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", ThaiTextView.class);
        }

        public final void read() {
            LocalViewHolder localViewHolder = this.write;
            if (localViewHolder != null) {
                this.write = null;
                localViewHolder.imageIcon = null;
                localViewHolder.textTitle = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        LocalViewHolder localViewHolder = (LocalViewHolder) setcontentview;
        parseFile parsefile = this.write.get(i);
        localViewHolder.textTitle.setText(parsefile.MediaBrowserCompat$ItemReceiver.trim());
        String str = parsefile.IconCompatParcelizer;
        Picasso read2 = Picasso.read();
        ImageView imageView = localViewHolder.imageIcon;
        if (imageView != null) {
            read2.write((Object) imageView);
            Context context = localViewHolder.AlertController$RecycleListView;
            FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(context, localViewHolder.setHasDecor, localViewHolder.imageIcon, str, context.getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(localViewHolder.AlertController$RecycleListView, R.color.f66402131099796));
            if (parsefile.read == null || parsefile.read.IconCompatParcelizer) {
                localViewHolder.write.setAlpha(0.2f);
                localViewHolder.imageIcon.setAlpha(0.2f);
                localViewHolder.textTitle.setAlpha(0.2f);
                localViewHolder.write.setOnClickListener(new getTermsConditionsRequiredDocument(localViewHolder, parsefile));
                localViewHolder.write.setEnabled(true);
                return;
            }
            localViewHolder.write.setAlpha(1.0f);
            localViewHolder.imageIcon.setAlpha(1.0f);
            localViewHolder.textTitle.setAlpha(1.0f);
            localViewHolder.write.setOnClickListener(new getPurposefulLoanOffers(localViewHolder, parsefile));
            localViewHolder.write.setEnabled(true);
            return;
        }
        throw new IllegalArgumentException("view cannot be null.");
    }

    public TransferToOthersStep1Adapter(List<parseFile> list, write write2) {
        this.write = list;
        this.read = write2;
    }

    public TransferToOthersStep1Adapter(List<parseFile> list, write write2, C5788xc993f580 transferToOthersStep1Adapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.write = list;
        this.read = write2;
        this.MediaBrowserCompat$ItemReceiver = transferToOthersStep1Adapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final int IconCompatParcelizer() {
        List<parseFile> list = this.write;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public class LocalViewHolder extends RecyclerView.setContentView {
        final Context AlertController$RecycleListView;
        @BindView
        ImageView imageIcon;
        Drawable setHasDecor;
        @BindView
        ThaiTextView textTitle;

        LocalViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            Context context = view.getContext();
            this.AlertController$RecycleListView = context;
            this.setHasDecor = setLastBaselineToBottomHeight.write(context, R.drawable.bankicon_place_holder);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        LocalViewHolder localViewHolder = new LocalViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f85122131493739, viewGroup, false));
        localViewHolder.read(false);
        return localViewHolder;
    }
}
