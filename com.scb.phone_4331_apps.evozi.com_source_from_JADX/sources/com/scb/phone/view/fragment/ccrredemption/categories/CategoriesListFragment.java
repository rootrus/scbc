package com.scb.phone.view.fragment.ccrredemption.categories;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ccrredemption.product.OPRRegistrationLandingActivity;
import com.scb.phone.view.activity.ccrredemption.product.OPRStatusRewardsLandingActivity;
import com.scb.phone.view.activity.ccrredemption.product.ProductListActivity;
import com.scb.phone.view.adapter.ccrredemption.CategoriesListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.C5111open;
import p040o.ComponentContainer;
import p040o.FieldAttributes;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.eagerInDefaultApp;
import p040o.getDateOfBirth;
import p040o.getIssueDate;
import p040o.getOprDetails;
import p040o.intoSetBuilder;
import p040o.readStringList;
import p040o.setFieldNamingStrategy;
import p040o.setTapText;
import p040o.shouldSkipField;

public class CategoriesListFragment extends BaseFragment implements getDateOfBirth, getIssueDate, getOprDetails {
    private chain IconCompatParcelizer;
    @HmlPinActivity
    public CategoriesListAdapter categoriesListAdapter;
    @HmlPinActivity
    public shouldSkipField categoryListPresenter;
    @HmlPinActivity
    public setFieldNamingStrategy oprPresenter;
    @BindView
    RecyclerView rcvCategoriesList;
    @BindView
    ViewGroup rewardsErrorLayout;
    @BindView
    ImageView txvErrorIcon;
    @BindView
    TextView txvErrorMessage;
    @BindView
    TextView txvErrorTitle;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86032131493830, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        this.rcvCategoriesList.setLayoutManager(gridLayoutManager);
        this.rcvCategoriesList.setAdapter(this.categoriesListAdapter);
        gridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = new GridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver() {
            public final int IconCompatParcelizer(int i) {
                return CategoriesListFragment.this.categoriesListAdapter.write.get(i).write == readStringList.ECOUPON ? 2 : 1;
            }
        };
        this.categoryListPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.oprPresenter.MediaBrowserCompat$ItemReceiver(this);
        chain chain = (chain) getActivity().getIntent().getParcelableExtra("EXTRA_CREDIT_CARD_DISPLAY");
        this.IconCompatParcelizer = chain;
        if (chain != null) {
            shouldSkipField shouldskipfield = this.categoryListPresenter;
            String str = chain.setShortcut;
            if (shouldskipfield.RatingCompat != null) {
                z = true;
            }
            if (z) {
                shouldskipfield.RatingCompat.AlertController$RecycleListView();
            }
            shouldskipfield.IconCompatParcelizer.read(str);
            shouldskipfield.IconCompatParcelizer.IconCompatParcelizer(new shouldSkipField.write());
        }
        this.txvErrorIcon.setImageResource(R.drawable.ic_generic_error);
        this.txvErrorTitle.setText(R.string.oops);
        return inflate;
    }

    public final void IconCompatParcelizer(C5111open open) {
        this.rewardsErrorLayout.setVisibility(8);
        this.rcvCategoriesList.setVisibility(0);
        CategoriesListAdapter categoriesListAdapter2 = this.categoriesListAdapter;
        categoriesListAdapter2.write = open.read;
        categoriesListAdapter2.IconCompatParcelizer.write();
        this.categoriesListAdapter.read = this;
    }

    public final void write(int i, String str, readStringList readstringlist) {
        shouldSkipField shouldskipfield = this.categoryListPresenter;
        FieldAttributes fieldAttributes = new FieldAttributes(readstringlist, i, this.IconCompatParcelizer.MediaDescriptionCompat, str);
        if (shouldskipfield.RatingCompat != null) {
            fieldAttributes.IconCompatParcelizer(shouldskipfield.RatingCompat);
        }
        if (readStringList.ECOUPON == readstringlist && getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("ecoupon_landing");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, readStringList readstringlist, String str) {
        setFieldNamingStrategy setfieldnamingstrategy = this.oprPresenter;
        if (setfieldnamingstrategy.RatingCompat != null) {
            setfieldnamingstrategy.RatingCompat.AlertController$RecycleListView();
        }
        setfieldnamingstrategy.read.write(str, i);
        setfieldnamingstrategy.read.IconCompatParcelizer(new setFieldNamingStrategy.read(i, readstringlist));
    }

    public final void IconCompatParcelizer(int i, String str, readStringList readstringlist) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("CategoryID", String.valueOf(i))};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("rewards_catalog_category", zsyr2kArr);
        }
        Context context = getContext();
        intoSetBuilder IconCompatParcelizer2 = intoSetBuilder.IconCompatParcelizer();
        IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(i);
        IconCompatParcelizer2.MediaBrowserCompat$MediaItem = readstringlist;
        IconCompatParcelizer2.MediaSessionCompat$Token = this.IconCompatParcelizer.setGroupDividerEnabled;
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer.MediaDescriptionCompat;
        IconCompatParcelizer2.read = this.IconCompatParcelizer.AppCompatViewInflater;
        IconCompatParcelizer2.MediaMetadataCompat = this.IconCompatParcelizer.MediaSessionCompat$Token;
        IconCompatParcelizer2.write = this.IconCompatParcelizer.AppCompatViewInflater;
        IconCompatParcelizer2.IconCompatParcelizer = this.IconCompatParcelizer.setShortcut;
        IconCompatParcelizer2.MediaBrowserCompat$SearchResultReceiver = str;
        IconCompatParcelizer2.RatingCompat = false;
        IconCompatParcelizer2.MediaDescriptionCompat = this.IconCompatParcelizer.setItemInvoker;
        Intent MediaBrowserCompat$ItemReceiver = ProductListActivity.MediaBrowserCompat$ItemReceiver(context, IconCompatParcelizer2, this.IconCompatParcelizer);
        FragmentActivity activity = getActivity();
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivityForResult(read, 101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final chain MediaDescriptionCompat() {
        return this.IconCompatParcelizer;
    }

    public void onDestroyView() {
        this.rcvCategoriesList.setAdapter((RecyclerView.IconCompatParcelizer) null);
        super.onDestroyView();
    }

    public final void write() {
        this.rcvCategoriesList.setVisibility(8);
        this.rewardsErrorLayout.setVisibility(0);
        this.txvErrorMessage.setText(R.string.no_rewards_error);
    }

    public final void read(ComponentContainer componentContainer) {
        componentContainer.Keep = "Rewards catalogue";
        Intent write = OPRRegistrationLandingActivity.write(getContext(), componentContainer);
        FragmentActivity activity = getActivity();
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            activity.startActivityForResult(read, 101);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(eagerInDefaultApp eagerindefaultapp) {
        eagerindefaultapp.Keep = 0;
        Intent write = OPRStatusRewardsLandingActivity.write(getContext(), eagerindefaultapp);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
