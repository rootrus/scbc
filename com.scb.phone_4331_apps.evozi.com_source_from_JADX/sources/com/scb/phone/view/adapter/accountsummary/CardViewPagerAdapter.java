package com.scb.phone.view.adapter.accountsummary;

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
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import java.util.List;
import p040o.FragmentBuilder_BindBillPaymentSuccessFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.RepositoryModule;
import p040o.chain;
import p040o.onActivityCreated;
import p040o.onStart;

public final class CardViewPagerAdapter extends onActivityCreated {
    private List<chain> IconCompatParcelizer;
    public FragmentBuilder_BindBillPaymentSuccessFragment MediaBrowserCompat$ItemReceiver;
    private Context read;
    private LayoutInflater write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder IconCompatParcelizer;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.IconCompatParcelizer = itemViewHolder;
            itemViewHolder.nickname = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_reference_name_text_view, "field 'nickname'", TextView.class);
            itemViewHolder.currentDueAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_payment_amount_text_view, "field 'currentDueAmount'", TextView.class);
            itemViewHolder.stmtDueDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_payment_due_date_text_view, "field 'stmtDueDate'", TextView.class);
            itemViewHolder.customHorizontalProgressBar = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_progress_bar, "field 'customHorizontalProgressBar'", CustomHorizontalProgressBar.class);
            itemViewHolder.imageCardArt = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_card_art, "field 'imageCardArt'", ImageView.class);
            itemViewHolder.credicardNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'credicardNumber'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.IconCompatParcelizer;
            if (itemViewHolder != null) {
                this.IconCompatParcelizer = null;
                itemViewHolder.nickname = null;
                itemViewHolder.currentDueAmount = null;
                itemViewHolder.stmtDueDate = null;
                itemViewHolder.customHorizontalProgressBar = null;
                itemViewHolder.imageCardArt = null;
                itemViewHolder.credicardNumber = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public CardViewPagerAdapter(Context context, List<chain> list, FragmentBuilder_BindBillPaymentSuccessFragment fragmentBuilder_BindBillPaymentSuccessFragment) {
        this.write = (LayoutInflater) context.getSystemService("layout_inflater");
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBillPaymentSuccessFragment;
        this.read = context;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        chain chain = this.IconCompatParcelizer.get(i);
        if (!chain.write) {
            view = this.write.inflate(R.layout.f81852131493411, (ViewGroup) null);
        } else {
            ItemViewHolder itemViewHolder = new ItemViewHolder(this.write.inflate(R.layout.f82402131493466, (ViewGroup) null));
            if ("B6".equals(chain.MediaMetadataCompat)) {
                itemViewHolder.nickname.setText(chain.AppCompatViewInflater);
                itemViewHolder.credicardNumber.setText(chain.f2806x50fd9e4a);
                itemViewHolder.customHorizontalProgressBar.setUsedTitle(this.read.getString(R.string.auto_cc_summary_no_result_found));
                itemViewHolder.customHorizontalProgressBar.setAvailableValue("");
                itemViewHolder.customHorizontalProgressBar.setAvailableTitle("");
                itemViewHolder.customHorizontalProgressBar.mTotalContainerLinearLayout.setVisibility(8);
                itemViewHolder.customHorizontalProgressBar.setVisibilityProgressBar(4);
                itemViewHolder.customHorizontalProgressBar.setUsedTitleAllCaps(false);
                itemViewHolder.currentDueAmount.setText("");
                itemViewHolder.stmtDueDate.setText("");
            } else {
                itemViewHolder.nickname.setText(chain.AppCompatViewInflater);
                itemViewHolder.credicardNumber.setText(chain.f2806x50fd9e4a);
                itemViewHolder.customHorizontalProgressBar.setAvailableValue(chain.MediaBrowserCompat$CustomActionResultReceiver);
                itemViewHolder.customHorizontalProgressBar.setUsedValue(chain.setHasDecor);
                itemViewHolder.customHorizontalProgressBar.setProgressBar(chain.PlaybackStateCompat$CustomAction);
                itemViewHolder.customHorizontalProgressBar.mTotalContainerLinearLayout.setVisibility(8);
                itemViewHolder.currentDueAmount.setText(chain.PlaybackStateCompat);
                itemViewHolder.stmtDueDate.setText(String.format(this.read.getString(R.string.due), new Object[]{chain.MenuItemImpl}));
            }
            FragmentBuilder_BindDepositSelectorFragment.write(chain.MediaSessionCompat$ResultReceiverWrapper, itemViewHolder.imageCardArt);
            View view2 = itemViewHolder.PlaybackStateCompat;
            view2.setOnClickListener(new RepositoryModule(this, i));
            view = view2;
        }
        viewGroup.addView(view, 0);
        return view;
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View PlaybackStateCompat;
        @BindView
        TextView credicardNumber;
        @BindView
        TextView currentDueAmount;
        @BindView
        CustomHorizontalProgressBar customHorizontalProgressBar;
        @BindView
        ImageView imageCardArt;
        @BindView
        TextView nickname;
        @BindView
        TextView stmtDueDate;

        ItemViewHolder(View view) {
            super(view);
            this.PlaybackStateCompat = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
