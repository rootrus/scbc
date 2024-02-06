package com.scb.phone.view.fragment.transferandpay;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity;
import com.scb.phone.view.adapter.transferandpay.FavouriteTargetAdapter;
import com.scb.phone.view.custom.transferandpay.CustomFavoriteHeaderSection;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.List;
import p040o.BulkTransferDeepLinkActivity;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindCcSofBillPaymentOnlyFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getTopLeftCornerWidth;
import p040o.setTapText;

public class FavouriteTargetFragment extends BaseFragment implements getTopLeftCornerWidth.PlaybackStateCompat.CustomAction {
    public View.OnClickListener IconCompatParcelizer;
    public FragmentBuilder_BindCcSofBillPaymentOnlyFragment MediaBrowserCompat$CustomActionResultReceiver;
    public BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    @BindView
    protected CustomFavoriteHeaderSection mCustomFavoriteHeaderSection;
    @BindView
    View mError;
    @BindView
    protected ImageView mFavouriteAddIcon;
    @BindView
    protected LinearLayout mFavouriteEmpty;
    @BindView
    protected TextView mFavouriteEmptySuggestion;
    @BindView
    protected TextView mFavouriteEmptySuggestionWithImage;
    @BindView
    protected RecyclerView mFavouriteTargetRecyclerView;

    public void MediaBrowserCompat$ItemReceiver(List<? extends CrashlyticsReport.Session.Builder> list) {
        getContext();
        this.mFavouriteTargetRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.mFavouriteTargetRecyclerView.setAdapter(new FavouriteTargetAdapter(getContext(), list, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mError.setVisibility(0);
    }

    public final void read() {
        MediaBrowserCompat$ItemReceiver();
    }

    public final void write() {
        Intent intent = new Intent(getContext(), FavouriteSelectedActivity.class);
        intent.putExtra("source", "favourite");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void ParcelableVolumeInfo(String str) {
        this.mCustomFavoriteHeaderSection.setVisibility(0);
        this.mFavouriteTargetRecyclerView.setVisibility(0);
        this.mCustomFavoriteHeaderSection.setTitle(str);
        this.mCustomFavoriteHeaderSection.setButton(true);
        this.mCustomFavoriteHeaderSection.setOnClickListener(this.IconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.mFavouriteEmptySuggestionWithImage.setVisibility(8);
        this.mFavouriteAddIcon.setVisibility(8);
        this.mFavouriteEmptySuggestion.setText(i);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer() {
        this.mFavouriteEmptySuggestionWithImage.setVisibility(0);
        this.mFavouriteAddIcon.setVisibility(0);
        this.mFavouriteEmptySuggestion.setText(R.string.favorite_add_suggestion_transfer_start);
        this.mFavouriteEmptySuggestionWithImage.setText(R.string.favorite_add_suggestion_transfer_end);
    }

    /* access modifiers changed from: protected */
    public final void read(String str) {
        this.mCustomFavoriteHeaderSection.setTitle(str);
        this.mCustomFavoriteHeaderSection.setButton(false);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver() {
        this.mCustomFavoriteHeaderSection.setVisibility(8);
        this.mFavouriteEmpty.setVisibility(8);
        this.mFavouriteTargetRecyclerView.setVisibility(8);
        this.mError.setVisibility(8);
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        super.onDestroy();
    }

    @OnClick
    public void onErrorViewClicked() {
        this.mError.setVisibility(8);
    }
}
