package com.scb.phone.view.fragment.transferandpay.fixedtransfer;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomTabLayout;
import com.scb.phone.view.custom.common.FragmentWrapContentViewPager;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AppMeasurementSdk;
import p040o.C7500tH;
import p040o.HmlPinActivity;
import p040o.addRecipientsToGroup;
import p040o.containsEntry;
import p040o.inject_imageStore;
import p040o.parseSession;
import p040o.setExpirationYear;
import p040o.tH$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.valueIterator;

public class FixedTransferTargetTabFragment extends BaseFragment implements setExpirationYear {
    public addRecipientsToGroup MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public CustomTabLayout ctlTargetAccount;
    @HmlPinActivity
    public C7500tH fixedTransferTargetPresenter;
    @BindView
    Group groupAccountInfoLoadFailed;
    @BindView
    Group groupMainAccountFrozen;
    @BindView
    Group groupViewpager;
    @BindView
    ImageView rvReload;
    @BindView
    public FragmentWrapContentViewPager vpTargetAccount;

    public static FixedTransferTargetTabFragment IconCompatParcelizer(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("account_source", str);
        FixedTransferTargetTabFragment fixedTransferTargetTabFragment = new FixedTransferTargetTabFragment();
        fixedTransferTargetTabFragment.setArguments(bundle);
        return fixedTransferTargetTabFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87512131493978, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.fixedTransferTargetPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        IconCompatParcelizer();
    }

    public final void Keep() {
        super.Keep();
        this.groupMainAccountFrozen.setVisibility(8);
        this.groupAccountInfoLoadFailed.setVisibility(8);
        this.groupViewpager.setVisibility(8);
    }

    public final void write() {
        this.groupMainAccountFrozen.setVisibility(8);
        this.groupAccountInfoLoadFailed.setVisibility(0);
        this.groupViewpager.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.groupMainAccountFrozen.setVisibility(0);
        this.groupAccountInfoLoadFailed.setVisibility(8);
        this.groupViewpager.setVisibility(8);
    }

    public final void write(parseSession parsesession) {
        this.groupMainAccountFrozen.setVisibility(8);
        this.groupAccountInfoLoadFailed.setVisibility(8);
        this.groupViewpager.setVisibility(0);
        this.MediaBrowserCompat$CustomActionResultReceiver = new addRecipientsToGroup(getChildFragmentManager(), getContext(), parsesession);
        if (this.vpTargetAccount.getAdapter() == null) {
            this.vpTargetAccount.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.ctlTargetAccount.setupWithViewPager(this.vpTargetAccount);
        }
        C7500tH tHVar = this.fixedTransferTargetPresenter;
        String stackedBackground = setStackedBackground();
        AppMeasurementSdk.OnEventListener onEventListener = tHVar.write;
        onEventListener.write(onEventListener.read.MediaBrowserCompat$ItemReceiver(stackedBackground), new tH$MediaBrowserCompat$CustomActionResultReceiver(tHVar, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(parseSession parsesession) {
        if (getContext() != null) {
            Intent intent = new Intent("com.scb.phone/BROADCAST_TRANSFER_NEXT_STEP");
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TARGET_DATA", parsesession);
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_FUNCTION", "FIXED_TRANSFER");
            intent.putExtra("com.scb.phone.EXTRA_TRANSFER_TO_MAIN_AUTO", true);
            getContext().sendBroadcast(intent);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getContext() != null) {
            getContext().sendBroadcast(new Intent("com.scb.phone/BROADCAST_BANK_RECEIVED"));
        }
    }

    public final void read() {
        if (getContext() != null) {
            getContext().sendBroadcast(new Intent("com.scb.phone/BROADCAST_TRANSFER_CLEAR_FILTER_SOF"));
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onReloadClick(View view) {
        IconCompatParcelizer();
    }

    private void IconCompatParcelizer() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C7500tH tHVar = this.fixedTransferTargetPresenter;
            String string = arguments.getString("account_source");
            inject_imageStore inject_imagestore = inject_imageStore.read;
            if (tHVar.RatingCompat != null) {
                inject_imagestore.IconCompatParcelizer(tHVar.RatingCompat);
            }
            containsEntry containsentry = tHVar.IconCompatParcelizer;
            valueIterator valueiterator = new valueIterator();
            valueiterator.MediaBrowserCompat$CustomActionResultReceiver = string;
            tHVar.IconCompatParcelizer.write(containsentry.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(valueiterator), new C7500tH.write(string));
        }
    }
}
