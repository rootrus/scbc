package com.scb.phone.view.fragment.debitatm;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.debitatm.DebitLimitOtpActivity;
import com.scb.phone.view.adapter.debitatm.DebitWithdrawalLimitAdapter;
import com.scb.phone.view.adapter.debitatm.PurchaseWithdrawalLimitAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import p040o.FragmentBuilder_BindBondInputFragment;
import p040o.HmlPinActivity;
import p040o.IdCaptureModule_GetIIdDeserializerOnDeviceFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ViewfinderView;
import p040o.ZTRMV;
import p040o.getOversizeImage;
import p040o.loadFromString;
import p040o.newEntry;
import p040o.nonNull;
import p040o.setCameraPreview;
import p040o.setTapText;

public class DebitWithdrawalLimitFragment extends BaseFragment implements IdCaptureModule_GetIIdDeserializerOnDeviceFactory.read, FragmentBuilder_BindBondInputFragment, PurchaseWithdrawalLimitAdapter.read, DebitWithdrawalLimitAdapter.IconCompatParcelizer {
    private nonNull IconCompatParcelizer;
    private ZTRMV MediaBrowserCompat$CustomActionResultReceiver = new ZTRMV();
    private PurchaseWithdrawalLimitAdapter MediaBrowserCompat$MediaItem;
    private DebitWithdrawalLimitAdapter RatingCompat;
    @HmlPinActivity
    public loadFromString debitLimitPresenter;
    @BindView
    RecyclerView debitRecyclerView;
    @BindView
    LinearLayout layoutPurchaseLimit;
    @BindView
    NestedScrollView mPersonalLimitScrollView;
    @BindView
    RecyclerView purchaseRecyclerView;
    @HmlPinActivity
    public SharedPreferences sharedPreferences;

    public static DebitWithdrawalLimitFragment read(nonNull nonnull) {
        DebitWithdrawalLimitFragment debitWithdrawalLimitFragment = new DebitWithdrawalLimitFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DEBIT_LIMIT_DISPLAY", nonnull);
        debitWithdrawalLimitFragment.setArguments(bundle);
        return debitWithdrawalLimitFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86502131493877, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.debitLimitPresenter.MediaBrowserCompat$ItemReceiver(this);
        nonNull nonnull = (nonNull) getArguments().getParcelable("DEBIT_LIMIT_DISPLAY");
        this.IconCompatParcelizer = nonnull;
        loadFromString loadfromstring = this.debitLimitPresenter;
        loadfromstring.write = nonnull;
        setCameraPreview setcamerapreview = new setCameraPreview(nonnull);
        if (loadfromstring.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setcamerapreview.IconCompatParcelizer(loadfromstring.RatingCompat);
        }
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.debitLimitPresenter.onDestroy();
    }

    public final void IconCompatParcelizer(nonNull nonnull) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(nonnull);
        DebitWithdrawalLimitAdapter debitWithdrawalLimitAdapter = new DebitWithdrawalLimitAdapter();
        this.RatingCompat = debitWithdrawalLimitAdapter;
        debitWithdrawalLimitAdapter.read = arrayList;
        this.RatingCompat.MediaBrowserCompat$ItemReceiver = this;
        this.RatingCompat.write = this;
        this.debitRecyclerView.setHasFixedSize(true);
        this.debitRecyclerView.setAdapter(this.RatingCompat);
    }

    public final void write(nonNull nonnull) {
        this.layoutPurchaseLimit.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(nonnull);
        PurchaseWithdrawalLimitAdapter purchaseWithdrawalLimitAdapter = new PurchaseWithdrawalLimitAdapter();
        this.MediaBrowserCompat$MediaItem = purchaseWithdrawalLimitAdapter;
        purchaseWithdrawalLimitAdapter.MediaBrowserCompat$ItemReceiver = this;
        this.MediaBrowserCompat$MediaItem.write = arrayList;
        this.MediaBrowserCompat$MediaItem.read = this;
        this.purchaseRecyclerView.setHasFixedSize(true);
        this.purchaseRecyclerView.setAdapter(this.MediaBrowserCompat$MediaItem);
    }

    public final void IconCompatParcelizer(newEntry newentry, boolean z) {
        loadFromString loadfromstring = this.debitLimitPresenter;
        boolean contains = loadfromstring.write.MediaBrowserCompat$ItemReceiver.contains("CARD_LIMIT_PURCHASE");
        loadfromstring.MediaBrowserCompat$ItemReceiver.write = newentry;
        loadfromstring.read = z;
        loadfromstring.IconCompatParcelizer = contains;
        Intent IconCompatParcelizer2 = DebitLimitOtpActivity.IconCompatParcelizer(getContext());
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
            startActivityForResult(IconCompatParcelizer2, 1999);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (-1 == i2) {
            String string = getString(R.string.limit_success_change);
            FragmentActivity activity = getActivity();
            getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
            }
            getActivity().setResult(-1);
            loadFromString loadfromstring = this.debitLimitPresenter;
            ViewfinderView viewfinderView = new ViewfinderView(loadfromstring);
            if (loadfromstring.RatingCompat != null) {
                viewfinderView.IconCompatParcelizer(loadfromstring.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        PlaybackStateCompat$CustomAction();
    }

    public final void IconCompatParcelizer() {
        ZTRMV ztrmv = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            ztrmv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "changelimit_withdrawal");
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        ZTRMV ztrmv = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            ztrmv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "changelimit_purchase");
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = Integer.valueOf((int) this.MediaBrowserCompat$MediaItem.MediaDescriptionCompat.limitInput.IconCompatParcelizer);
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer.write();
        this.RatingCompat.IconCompatParcelizer.write();
    }

    public final void read() {
        this.IconCompatParcelizer.MediaMetadataCompat = Integer.valueOf((int) this.RatingCompat.MediaBrowserCompat$MediaItem.limitInput.IconCompatParcelizer);
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer.write();
        this.RatingCompat.IconCompatParcelizer.write();
    }

    public final void write() {
        this.IconCompatParcelizer.MediaMetadataCompat = Integer.valueOf((int) this.RatingCompat.MediaBrowserCompat$MediaItem.limitInput.IconCompatParcelizer);
        this.RatingCompat.IconCompatParcelizer.write();
    }
}
