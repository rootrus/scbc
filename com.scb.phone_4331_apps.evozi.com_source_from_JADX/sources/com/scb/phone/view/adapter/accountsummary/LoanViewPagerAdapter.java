package com.scb.phone.view.adapter.accountsummary;

import android.content.Context;
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
import com.scb.phone.view.custom.common.CustomHorizontalProgressBar;
import java.util.ArrayList;
import java.util.List;
import p040o.EasycashEligibilityRepositoryModule;
import p040o.FragmentBuilder_BindBaseReplaceableFragment;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.onActivityCreated;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class LoanViewPagerAdapter extends onActivityCreated {
    private LayoutInflater IconCompatParcelizer;
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private List<Futures.C34051> read;
    public FragmentBuilder_BindBaseReplaceableFragment write;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = itemViewHolder;
            itemViewHolder.name = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_name_text_view, "field 'name'", TextView.class);
            itemViewHolder.account = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_account_text_view, "field 'account'", TextView.class);
            itemViewHolder.imageLoanType = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_loan_type, "field 'imageLoanType'", ImageView.class);
            itemViewHolder.dueDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_due_date_text_view, "field 'dueDate'", TextView.class);
            itemViewHolder.paymentAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_payment_amount_text_view, "field 'paymentAmount'", TextView.class);
            itemViewHolder.customHorizontalProgressBar = (CustomHorizontalProgressBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_progress_bar, "field 'customHorizontalProgressBar'", CustomHorizontalProgressBar.class);
            itemViewHolder.payCompleted = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.pay_completed, "field 'payCompleted'", TextView.class);
            itemViewHolder.payCompletedImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.completed_image_view, "field 'payCompletedImageView'", ImageView.class);
            itemViewHolder.relativeLayoutPayCompleted = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.relative_pay_completed, "field 'relativeLayoutPayCompleted'", RelativeLayout.class);
            itemViewHolder.relativeLayoutLoanRestricted = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.relative_loan_restricted, "field 'relativeLayoutLoanRestricted'", RelativeLayout.class);
            itemViewHolder.restrictedImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.restricted_image_view, "field 'restrictedImageView'", ImageView.class);
            itemViewHolder.loanRestrictedDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.loan_restricted_description, "field 'loanRestrictedDescription'", TextView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                itemViewHolder.name = null;
                itemViewHolder.account = null;
                itemViewHolder.imageLoanType = null;
                itemViewHolder.dueDate = null;
                itemViewHolder.paymentAmount = null;
                itemViewHolder.customHorizontalProgressBar = null;
                itemViewHolder.payCompleted = null;
                itemViewHolder.payCompletedImageView = null;
                itemViewHolder.relativeLayoutPayCompleted = null;
                itemViewHolder.relativeLayoutLoanRestricted = null;
                itemViewHolder.restrictedImageView = null;
                itemViewHolder.loanRestrictedDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public LoanViewPagerAdapter(Context context, List<Futures.C34051> list) {
        this.IconCompatParcelizer = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.read = list == null ? new ArrayList<>() : list;
    }

    public final int getCount() {
        return this.read.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        Futures.C34051 r0 = this.read.get(i);
        if (r0.write || r0.MediaDescriptionCompat) {
            ItemViewHolder itemViewHolder = new ItemViewHolder(this.IconCompatParcelizer.inflate(R.layout.f83242131493550, (ViewGroup) null));
            FragmentBuilder_BindDepositSelectorFragment.write(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, r0.MediaBrowserCompat$MediaItem), itemViewHolder.imageLoanType, r0.setChecked);
            itemViewHolder.name.setText(r0.MediaSessionCompat$Token);
            itemViewHolder.account.setText(r0.MediaBrowserCompat$CustomActionResultReceiver);
            if (r0.MediaDescriptionCompat) {
                itemViewHolder.dueDate.setVisibility(8);
                itemViewHolder.paymentAmount.setVisibility(8);
                itemViewHolder.relativeLayoutPayCompleted.setVisibility(8);
                itemViewHolder.customHorizontalProgressBar.setVisibility(8);
                itemViewHolder.relativeLayoutLoanRestricted.setVisibility(0);
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, r0.MediaMetadataCompat), itemViewHolder.restrictedImageView, r0.IconCompatParcelizer);
                itemViewHolder.loanRestrictedDescription.setText(r0.ActionMenuItemView);
            } else {
                itemViewHolder.relativeLayoutLoanRestricted.setVisibility(8);
                itemViewHolder.customHorizontalProgressBar.setVisibility(0);
                itemViewHolder.customHorizontalProgressBar.setUsedValue(r0.PlaybackStateCompat);
                itemViewHolder.customHorizontalProgressBar.setAvailableValue(r0.setPopupCallback);
                itemViewHolder.customHorizontalProgressBar.setProgressBar(r0.setCheckable.intValue());
                itemViewHolder.customHorizontalProgressBar.mTotalContainerLinearLayout.setVisibility(8);
                itemViewHolder.customHorizontalProgressBar.setUsedTitle(r0.Keep);
                itemViewHolder.customHorizontalProgressBar.setAvailableTitle(r0.setPadding);
                if (r0.setHasDecor) {
                    itemViewHolder.dueDate.setVisibility(8);
                    itemViewHolder.paymentAmount.setVisibility(8);
                    itemViewHolder.relativeLayoutPayCompleted.setVisibility(0);
                    FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, r0.MediaMetadataCompat), itemViewHolder.payCompletedImageView, r0.IconCompatParcelizer);
                    itemViewHolder.payCompleted.setText(r0.AlertController$RecycleListView);
                } else {
                    itemViewHolder.relativeLayoutPayCompleted.setVisibility(8);
                    itemViewHolder.dueDate.setVisibility(0);
                    itemViewHolder.dueDate.setText(r0.AppCompatDelegateImpl$ListMenuDecorView);
                    itemViewHolder.paymentAmount.setVisibility(0);
                    itemViewHolder.paymentAmount.setText(r0.AppCompatDialogFragment);
                }
            }
            View view2 = itemViewHolder.AlertController$RecycleListView;
            view2.setOnClickListener(new EasycashEligibilityRepositoryModule(this, i));
            view = view2;
        } else {
            view = this.IconCompatParcelizer.inflate(R.layout.f81852131493411, (ViewGroup) null);
        }
        viewGroup.addView(view, 0);
        return view;
    }

    public static class ItemViewHolder extends RecyclerView.setContentView {
        public View AlertController$RecycleListView;
        @BindView
        public TextView account;
        @BindView
        public CustomHorizontalProgressBar customHorizontalProgressBar;
        @BindView
        public TextView dueDate;
        @BindView
        public ImageView imageLoanType;
        @BindView
        TextView loanRestrictedDescription;
        @BindView
        public TextView name;
        @BindView
        public TextView payCompleted;
        @BindView
        public ImageView payCompletedImageView;
        @BindView
        public TextView paymentAmount;
        @BindView
        public RelativeLayout relativeLayoutLoanRestricted;
        @BindView
        public RelativeLayout relativeLayoutPayCompleted;
        @BindView
        ImageView restrictedImageView;

        public ItemViewHolder(View view) {
            super(view);
            this.AlertController$RecycleListView = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
