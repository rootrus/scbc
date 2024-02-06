package com.scb.phone.view.adapter.accountsummary;

import android.content.Context;
import android.text.TextUtils;
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
import java.util.List;
import kotlin.TypeCastException;
import p040o.EasycashMHMCDetailRepositoryModule;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFatcaQuestionnaireFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.isSimulator;
import p040o.onActivityCreated;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class PrepaidViewPagerAdapter extends onActivityCreated {
    public C5726xd4cdc3cd IconCompatParcelizer;
    private LayoutInflater MediaBrowserCompat$CustomActionResultReceiver;
    public List<isSimulator> MediaBrowserCompat$ItemReceiver;
    private Context read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class TransactionItemViewHolder_ViewBinding implements Unbinder {
        private TransactionItemViewHolder write;

        public TransactionItemViewHolder_ViewBinding(TransactionItemViewHolder transactionItemViewHolder, View view) {
            this.write = transactionItemViewHolder;
            transactionItemViewHolder.nickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_reference_name_text_view, "field 'nickname'", TextView.class);
            transactionItemViewHolder.currentDueAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_payment_amount_text_view, "field 'currentDueAmount'", TextView.class);
            transactionItemViewHolder.stmtDueDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_payment_due_date_text_view, "field 'stmtDueDate'", TextView.class);
            transactionItemViewHolder.imageCardArt = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_card_art, "field 'imageCardArt'", ImageView.class);
            transactionItemViewHolder.credicardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'credicardNumber'", TextView.class);
            transactionItemViewHolder.tvLastTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_last_transaction_date, "field 'tvLastTransactionDate'", TextView.class);
            transactionItemViewHolder.tvLastTransactionAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_last_transaction_amount, "field 'tvLastTransactionAmount'", TextView.class);
            transactionItemViewHolder.tvTitleLastTransaction = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_title_last_transaction, "field 'tvTitleLastTransaction'", TextView.class);
        }

        public final void read() {
            TransactionItemViewHolder transactionItemViewHolder = this.write;
            if (transactionItemViewHolder != null) {
                this.write = null;
                transactionItemViewHolder.nickname = null;
                transactionItemViewHolder.currentDueAmount = null;
                transactionItemViewHolder.stmtDueDate = null;
                transactionItemViewHolder.imageCardArt = null;
                transactionItemViewHolder.credicardNumber = null;
                transactionItemViewHolder.tvLastTransactionDate = null;
                transactionItemViewHolder.tvLastTransactionAmount = null;
                transactionItemViewHolder.tvTitleLastTransaction = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PrepaidViewPagerAdapter(Context context, List<isSimulator> list, C5726xd4cdc3cd prepaidViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$ItemReceiver = list;
        this.IconCompatParcelizer = prepaidViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
        this.read = context;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        isSimulator issimulator = this.MediaBrowserCompat$ItemReceiver.get(i);
        if (!issimulator.write) {
            view = this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f81852131493411, (ViewGroup) null);
        } else {
            TransactionItemViewHolder transactionItemViewHolder = new TransactionItemViewHolder(this.MediaBrowserCompat$CustomActionResultReceiver.inflate(R.layout.f83552131493581, (ViewGroup) null));
            if (!TextUtils.isEmpty(issimulator.MediaBrowserCompat$MediaItem)) {
                transactionItemViewHolder.nickname.setText(issimulator.MediaBrowserCompat$MediaItem);
            } else {
                transactionItemViewHolder.nickname.setText(issimulator.ParcelableVolumeInfo.write);
            }
            transactionItemViewHolder.stmtDueDate.setText(this.read.getString(R.string.prepaid_available_balance));
            transactionItemViewHolder.currentDueAmount.setText(issimulator.MediaSessionCompat$QueueItem);
            transactionItemViewHolder.tvTitleLastTransaction.setText(this.read.getString(R.string.prepaid_last_transaction));
            if (issimulator.MediaBrowserCompat$CustomActionResultReceiver.contains("SHOW_TRAVEL_DETAILS")) {
                transactionItemViewHolder.stmtDueDate.setVisibility(8);
                transactionItemViewHolder.currentDueAmount.setVisibility(8);
            } else {
                transactionItemViewHolder.stmtDueDate.setVisibility(0);
                transactionItemViewHolder.currentDueAmount.setVisibility(0);
            }
            transactionItemViewHolder.tvTitleLastTransaction.setText(this.read.getString(R.string.travelcard_see_more));
            FragmentBuilder_BindFundDetailSummaryFragment IconCompatParcelizer2 = Picasso.read().write(issimulator.read).MediaBrowserCompat$CustomActionResultReceiver((int) R.drawable.default_card_without_logo).IconCompatParcelizer((int) R.drawable.default_card);
            IconCompatParcelizer2.write = true;
            IconCompatParcelizer2.IconCompatParcelizer(FragmentBuilder_BindFatcaQuestionnaireFragment.NO_STORE, new FragmentBuilder_BindFatcaQuestionnaireFragment[0]).read(transactionItemViewHolder.imageCardArt, (FragmentBuilder_BindEkycFragment) null);
            if (!issimulator.IconCompatParcelizer.isEmpty()) {
                TextView textView = transactionItemViewHolder.credicardNumber;
                String str = issimulator.IconCompatParcelizer;
                int length = str.length();
                if (str != null) {
                    String substring = str.substring(length - 4);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    textView.setText(substring);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                transactionItemViewHolder.credicardNumber.setText("");
            }
            View view2 = transactionItemViewHolder.Keep;
            view2.setOnClickListener(new EasycashMHMCDetailRepositoryModule(this, i));
            view = view2;
        }
        viewGroup.addView(view, 0);
        return view;
    }

    static class TransactionItemViewHolder extends RecyclerView.setContentView {
        View Keep;
        @BindView
        TextView credicardNumber;
        @BindView
        TextView currentDueAmount;
        @BindView
        ImageView imageCardArt;
        @BindView
        TextView nickname;
        @BindView
        TextView stmtDueDate;
        @BindView
        TextView tvLastTransactionAmount;
        @BindView
        TextView tvLastTransactionDate;
        @BindView
        TextView tvTitleLastTransaction;

        TransactionItemViewHolder(View view) {
            super(view);
            this.Keep = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
