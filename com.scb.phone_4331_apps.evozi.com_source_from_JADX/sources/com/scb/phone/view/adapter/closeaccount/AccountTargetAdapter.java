package com.scb.phone.view.adapter.closeaccount;

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
import java.util.List;
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.RemittanceApi;
import p040o.onStart;
import p040o.removeFirst;
import p040o.setLastBaselineToBottomHeight;

public final class AccountTargetAdapter extends RecyclerView.IconCompatParcelizer<AccountViewHolder> {
    public List<removeFirst> read;
    public FragmentBuilder_BindCardlessWithdrawAmountFragment write;

    public class AccountViewHolder_ViewBinding implements Unbinder {
        private AccountViewHolder MediaBrowserCompat$ItemReceiver;

        public AccountViewHolder_ViewBinding(AccountViewHolder accountViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = accountViewHolder;
            accountViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            accountViewHolder.textSubtitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_subtitle, "field 'textSubtitle'", TextView.class);
            accountViewHolder.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        }

        public final void read() {
            AccountViewHolder accountViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (accountViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                accountViewHolder.textTitle = null;
                accountViewHolder.textSubtitle = null;
                accountViewHolder.imageIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        AccountViewHolder accountViewHolder = (AccountViewHolder) setcontentview;
        removeFirst removefirst = this.read.get(i);
        accountViewHolder.textTitle.setText(removefirst.write);
        accountViewHolder.textSubtitle.setText(removefirst.read);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(accountViewHolder.imageIcon.getContext(), setLastBaselineToBottomHeight.write(accountViewHolder.imageIcon.getContext(), R.drawable.bankicon_place_holder), accountViewHolder.imageIcon, removefirst.IconCompatParcelizer, accountViewHolder.imageIcon.getContext().getResources().getDimensionPixelOffset(R.dimen.f72042131165281), setLastBaselineToBottomHeight.read(accountViewHolder.imageIcon.getContext(), R.color.f66402131099796));
        accountViewHolder.write.setOnClickListener(new RemittanceApi(this, i));
    }

    public AccountTargetAdapter(List<removeFirst> list, FragmentBuilder_BindCardlessWithdrawAmountFragment fragmentBuilder_BindCardlessWithdrawAmountFragment) {
        this.read = list;
        this.write = fragmentBuilder_BindCardlessWithdrawAmountFragment;
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    class AccountViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imageIcon;
        @BindView
        TextView textSubtitle;
        @BindView
        TextView textTitle;

        AccountViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new AccountViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f85102131493737, viewGroup, false));
    }
}
