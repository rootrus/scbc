package p040o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;
import com.scb.phone.view.adapter.accountsummary.LoanViewPagerAdapter;
import java.util.ArrayList;
import java.util.List;
import p040o.Futures;

/* renamed from: o.EasycashMCMCDetailRepositoryModule */
public final class EasycashMCMCDetailRepositoryModule extends onActivityCreated {
    private List<Futures.ChainingListenableFuture> IconCompatParcelizer;
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private LayoutInflater MediaBrowserCompat$ItemReceiver;
    public FragmentBuilder_BindBaseReplaceableFragment read;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public EasycashMCMCDetailRepositoryModule(Context context, List<Futures.ChainingListenableFuture> list) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.IconCompatParcelizer = list == null ? new ArrayList<>() : list;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        Futures.ChainingListenableFuture chainingListenableFuture = this.IconCompatParcelizer.get(i);
        if (!chainingListenableFuture.write) {
            view = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f81852131493411, (ViewGroup) null);
        } else {
            LoanViewPagerAdapter.ItemViewHolder itemViewHolder = new LoanViewPagerAdapter.ItemViewHolder(this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f83242131493550, (ViewGroup) null));
            FragmentBuilder_BindDepositSelectorFragment.write(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, R.drawable.ic_loan_default), itemViewHolder.imageLoanType, chainingListenableFuture.setContentView);
            itemViewHolder.name.setText(chainingListenableFuture.MediaBrowserCompat$ItemReceiver);
            itemViewHolder.account.setText(chainingListenableFuture.read);
            itemViewHolder.relativeLayoutLoanRestricted.setVisibility(8);
            itemViewHolder.customHorizontalProgressBar.setVisibility(0);
            itemViewHolder.customHorizontalProgressBar.setUsedTitle(chainingListenableFuture.PlaybackStateCompat);
            itemViewHolder.customHorizontalProgressBar.setAvailableTitle(chainingListenableFuture.setChecked);
            itemViewHolder.customHorizontalProgressBar.setUsedValue(chainingListenableFuture.MediaSessionCompat$Token);
            itemViewHolder.customHorizontalProgressBar.setAvailableValue(chainingListenableFuture.setExpandedFormat);
            itemViewHolder.customHorizontalProgressBar.setProgressBarDrawable(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, R.drawable.card_red_yellow_progress_bar));
            itemViewHolder.customHorizontalProgressBar.setProgressMax(10000);
            itemViewHolder.customHorizontalProgressBar.setProgressBar(chainingListenableFuture.Keep.intValue());
            itemViewHolder.customHorizontalProgressBar.setSecondaryProgressBar(chainingListenableFuture.AlertController$RecycleListView.intValue());
            itemViewHolder.customHorizontalProgressBar.mTotalContainerLinearLayout.setVisibility(8);
            if (chainingListenableFuture.AppCompatActivity.equals("PN")) {
                itemViewHolder.customHorizontalProgressBar.setUsedValueColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$CustomActionResultReceiver, R.color.f67152131099871));
            } else {
                itemViewHolder.customHorizontalProgressBar.setUsedValueColor(setLastBaselineToBottomHeight.read(this.MediaBrowserCompat$CustomActionResultReceiver, R.color.f70992131100255));
            }
            if (chainingListenableFuture.setHasDecor) {
                itemViewHolder.dueDate.setVisibility(8);
                itemViewHolder.paymentAmount.setVisibility(8);
                itemViewHolder.relativeLayoutPayCompleted.setVisibility(0);
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(setLastBaselineToBottomHeight.write(this.MediaBrowserCompat$CustomActionResultReceiver, R.drawable.ic_loan_default), itemViewHolder.payCompletedImageView, chainingListenableFuture.MediaBrowserCompat$CustomActionResultReceiver);
                itemViewHolder.payCompleted.setText(chainingListenableFuture.PlaybackStateCompat$CustomAction);
            } else {
                itemViewHolder.relativeLayoutPayCompleted.setVisibility(8);
                itemViewHolder.dueDate.setVisibility(0);
                itemViewHolder.dueDate.setText(chainingListenableFuture.MediaBrowserCompat$SearchResultReceiver);
                itemViewHolder.paymentAmount.setVisibility(0);
                itemViewHolder.paymentAmount.setText(chainingListenableFuture.MediaDescriptionCompat);
            }
            View view2 = itemViewHolder.AlertController$RecycleListView;
            view2.setOnClickListener(new EasycashSummaryRepositoryModule(this, i));
            view = view2;
        }
        viewGroup.addView(view, 0);
        return view;
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }
}
