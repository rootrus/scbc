package com.scb.phone.view.fragment.ccrredemption.product;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponDetailActivity;
import com.scb.phone.view.activity.ccrredemption.product.ProductDetailActivity;
import com.scb.phone.view.adapter.ccrredemption.product.ProductListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import p040o.C4054b;
import p040o.HmlPinActivity;
import p040o.IIdDeserializer;
import p040o.IIdExtractionServer;
import p040o.IIdExtractorListener;
import p040o.IdCaptureModule;
import p040o.JsonObject;
import p040o.MyECouponActivity_ViewBinding;
import p040o.chain;
import p040o.getAddresses;
import p040o.getArrayComponentType;
import p040o.getAsJsonPrimitive;
import p040o.getDependencies;
import p040o.getIdentityValidation;
import p040o.getInvestmentObjectives;
import p040o.getPublishedEvents;
import p040o.intoSet;
import p040o.intoSetBuilder;
import p040o.isEagerInDefaultApp;
import p040o.isJsonNull;
import p040o.postProductList;
import p040o.readString;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class ProductListFragment extends BaseFragment implements IdCaptureModule, IIdDeserializer, IIdExtractionServer {
    private chain IconCompatParcelizer;
    private ProductListAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private C4054b.C40583.C13021 MediaMetadataCompat;
    @HmlPinActivity
    public getArrayComponentType productListPresenter;
    @BindView
    public RecyclerView rcvProductList;
    @BindView
    ViewGroup rewardsErrorLayout;
    @BindView
    SwipeRefreshLayout swipeRefreshLayout;
    @BindView
    ImageView txvErrorIcon;
    @BindView
    TextView txvErrorMessage;
    @BindView
    TextView txvErrorTitle;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89052131494132, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver = new ProductListAdapter();
        RecyclerView recyclerView = this.rcvProductList;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.rcvProductList.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.productListPresenter.MediaBrowserCompat$ItemReceiver(this);
        intoSetBuilder intosetbuilder = (intoSetBuilder) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CATEGORY_DTO_EXTRA");
        this.IconCompatParcelizer = (chain) getActivity().getIntent().getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CREDIT_CARD_DISPLAY_EXTRA");
        getArrayComponentType getarraycomponenttype = this.productListPresenter;
        getarraycomponenttype.MediaBrowserCompat$ItemReceiver = intosetbuilder;
        isJsonNull isjsonnull = new isJsonNull(getarraycomponenttype, intosetbuilder);
        if (getarraycomponenttype.RatingCompat != null) {
            isjsonnull.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
        }
        this.productListPresenter.IconCompatParcelizer(true);
        this.swipeRefreshLayout.setEnabled(!intosetbuilder.RatingCompat);
        this.swipeRefreshLayout.setColorSchemeColors(setLastBaselineToBottomHeight.read(getContext(), R.color.f67252131099881));
        this.swipeRefreshLayout.setOnRefreshListener(new getAddresses(this));
        RecyclerView recyclerView2 = this.rcvProductList;
        C58873 r7 = new RecyclerView.ParcelableVolumeInfo() {
            public final void IconCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
                super.IconCompatParcelizer(recyclerView, i, i2);
                if (i != 0 || i2 != 0) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.AppCompatActivity;
                    if (recyclerView.isShown() && !recyclerView.canScrollVertically(1) && linearLayoutManager.RatingCompat() == linearLayoutManager.MediaSessionCompat$QueueItem() - 1) {
                        ProductListFragment.this.productListPresenter.IconCompatParcelizer();
                    }
                }
            }
        };
        if (recyclerView2.setGroupDividerEnabled == null) {
            recyclerView2.setGroupDividerEnabled = new ArrayList();
        }
        recyclerView2.setGroupDividerEnabled.add(r7);
        this.txvErrorIcon.setImageResource(R.drawable.ic_generic_error);
        this.txvErrorTitle.setText(R.string.oops);
        return inflate;
    }

    public final void IconCompatParcelizer(getDependencies getdependencies) {
        this.rewardsErrorLayout.setVisibility(8);
        this.rcvProductList.setVisibility(0);
        this.rcvProductList.MediaBrowserCompat$CustomActionResultReceiver(0);
        ProductListAdapter productListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        productListAdapter.write = getdependencies.IconCompatParcelizer;
        productListAdapter.IconCompatParcelizer.write();
        this.MediaBrowserCompat$CustomActionResultReceiver.read = this;
        C4054b.C40583.C13021 r0 = this.MediaMetadataCompat;
        if (r0 != null) {
            r0.MediaBrowserCompat$CustomActionResultReceiver(getdependencies.read);
        }
        if (this.swipeRefreshLayout.MediaBrowserCompat$MediaItem) {
            this.swipeRefreshLayout.setRefreshing(false);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(intoSet intoset) {
        getArrayComponentType getarraycomponenttype = this.productListPresenter;
        getPublishedEvents getpublishedevents = new getPublishedEvents(getarraycomponenttype.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token, intoset, getarraycomponenttype.MediaBrowserCompat$ItemReceiver.read, getarraycomponenttype.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, getarraycomponenttype.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat, getarraycomponenttype.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat, getarraycomponenttype.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem, getarraycomponenttype.MediaBrowserCompat$ItemReceiver.write);
        isEagerInDefaultApp iseagerindefaultapp = new isEagerInDefaultApp();
        iseagerindefaultapp.IconCompatParcelizer = getpublishedevents.write;
        iseagerindefaultapp.MediaBrowserCompat$ItemReceiver = getpublishedevents.MediaBrowserCompat$ItemReceiver;
        iseagerindefaultapp.write = getpublishedevents.read;
        iseagerindefaultapp.RatingCompat = getpublishedevents.IconCompatParcelizer;
        iseagerindefaultapp.MediaSessionCompat$Token = getpublishedevents.MediaDescriptionCompat;
        iseagerindefaultapp.ParcelableVolumeInfo = getpublishedevents.MediaMetadataCompat;
        iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper = getpublishedevents.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = false;
        iseagerindefaultapp.MediaBrowserCompat$MediaItem = false;
        iseagerindefaultapp.MediaSessionCompat$QueueItem = false;
        iseagerindefaultapp.MediaMetadataCompat = false;
        if (intoset.PlaybackStateCompat == readString.ECOUPON) {
            JsonObject jsonObject = new JsonObject(iseagerindefaultapp);
            if (getarraycomponenttype.RatingCompat != null) {
                z = true;
            }
            if (z) {
                jsonObject.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
                return;
            }
            return;
        }
        getAsJsonPrimitive getasjsonprimitive = new getAsJsonPrimitive(iseagerindefaultapp);
        if (getarraycomponenttype.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getasjsonprimitive.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 102 && intent != null) {
            getActivity().setResult(-1, intent);
            getActivity().finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C4054b.C40583.C13021) {
            this.MediaMetadataCompat = (C4054b.C40583.C13021) context;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C4054b.C40583.C13021 r0 = this.MediaMetadataCompat;
        if (r0 != null) {
            r0.MediaSessionCompat$Token();
        }
        String string = getString(R.string.no_rewards_error);
        this.rcvProductList.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorMessage.setText(string);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo36400x50fd9e4a() {
        ProductListAdapter productListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        productListAdapter.MediaDescriptionCompat = true;
        productListAdapter.MediaMetadataCompat = postProductList.SHOWING_LOADER;
        productListAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        productListAdapter.IconCompatParcelizer.write();
        this.rcvProductList.postDelayed(new getInvestmentObjectives(this), 100);
    }

    public final void MediaDescriptionCompat() {
        ProductListAdapter productListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        productListAdapter.MediaDescriptionCompat = false;
        productListAdapter.MediaMetadataCompat = postProductList.HIDDEN_LOADER;
        productListAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        productListAdapter.IconCompatParcelizer.write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getDependencies getdependencies) {
        ProductListAdapter productListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        productListAdapter.write.addAll(getdependencies.IconCompatParcelizer);
        productListAdapter.IconCompatParcelizer.write();
    }

    public final void MediaSessionCompat$Token() {
        ProductListAdapter productListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        getIdentityValidation getidentityvalidation = new getIdentityValidation(this);
        productListAdapter.MediaDescriptionCompat = true;
        productListAdapter.MediaBrowserCompat$SearchResultReceiver = getidentityvalidation;
        productListAdapter.MediaMetadataCompat = postProductList.SHOWING_ERROR;
        productListAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        productListAdapter.IconCompatParcelizer.write();
        this.rcvProductList.postDelayed(new getInvestmentObjectives(this), 100);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        ProductListAdapter productListAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        productListAdapter.MediaDescriptionCompat = false;
        productListAdapter.MediaMetadataCompat = postProductList.HIDDEN_ERROR;
        productListAdapter.MediaBrowserCompat$CustomActionResultReceiver();
        productListAdapter.IconCompatParcelizer.write();
    }

    public final void IconCompatParcelizer() {
        this.productListPresenter.IconCompatParcelizer(true);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        String string = getString(R.string.no_rewards_for_filter);
        this.rcvProductList.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorMessage.setText(string);
    }

    public final void IconCompatParcelizer(isEagerInDefaultApp iseagerindefaultapp) {
        Intent IconCompatParcelizer2 = ProductDetailActivity.IconCompatParcelizer(getContext(), iseagerindefaultapp);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(IconCompatParcelizer2, 102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str) {
        C4054b.C40583.C13021 r0 = this.MediaMetadataCompat;
        if (r0 != null) {
            r0.MediaSessionCompat$Token();
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(getString(R.string.ccr_search_not_found_1));
            StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(str);
            SpannableString spannableString = new SpannableString(sb.toString());
            spannableString.setSpan(new ForegroundColorSpan(setLastBaselineToBottomHeight.read(activity, R.color.f67252131099881)), 0, str.length() + 1, 33);
            spannableStringBuilder.append(spannableString);
            spannableStringBuilder.append(getString(R.string.ccr_search_not_found_2));
            this.rcvProductList.setVisibility(8);
            this.rewardsErrorLayout.setVisibility(0);
            this.txvErrorMessage.setText(spannableStringBuilder);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        String string = getString(R.string.no_reward_for_category);
        this.rcvProductList.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorMessage.setText(string);
    }

    public final void write(isEagerInDefaultApp iseagerindefaultapp) {
        Intent read = ECouponDetailActivity.read(getContext(), this.IconCompatParcelizer, iseagerindefaultapp.MediaSessionCompat$ResultReceiverWrapper);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroyView() {
        this.rcvProductList.setAdapter((RecyclerView.IconCompatParcelizer) null);
        super.onDestroyView();
    }

    public final void IconCompatParcelizer(Integer num) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = (long) num.intValue();
    }

    public final void write() {
        IIdExtractorListener iIdExtractorListener = getActivity() instanceof IIdExtractorListener ? (IIdExtractorListener) getActivity() : null;
        if (iIdExtractorListener != null) {
            iIdExtractorListener.write();
        }
    }

    public final void read() {
        IIdExtractorListener iIdExtractorListener = getActivity() instanceof IIdExtractorListener ? (IIdExtractorListener) getActivity() : null;
        if (iIdExtractorListener != null) {
            iIdExtractorListener.read();
        }
    }
}
