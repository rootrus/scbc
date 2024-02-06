package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.cardmanagement.DeejungInstallmentsConfirmationActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.adapter.cardmanagement.DeejungInstallmentsReviewAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AbstractMultimap;
import p040o.C7509tS;
import p040o.FirebaseVisionCloudDetectorOptions;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getICheckDeserializerRtti;
import p040o.initializeAllApis;
import p040o.initializeApp;
import p040o.loadInBackground;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.toLongArray;
import p040o.verifyPurposefulFeatures;

public class DeejungInstallmentsReviewFragment extends BaseFragment implements loadInBackground, verifyPurposefulFeatures, C7509tS {
    private initializeApp MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public DeejungInstallmentsReviewAdapter deejungInstallmentsReviewAdapter;
    @HmlPinActivity
    public FirebaseVisionCloudDetectorOptions.Builder presenter;
    @BindView
    RecyclerView reviewRecyclerView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86572131493884, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            initializeApp initializeapp = (initializeApp) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungInstallmentsReviewActivity.KEY_DEEJUNG_INSTALLMENTS_REVIEW_DISPLAY_MODEL");
            this.MediaBrowserCompat$CustomActionResultReceiver = initializeapp;
            this.deejungInstallmentsReviewAdapter.MediaBrowserCompat$ItemReceiver = initializeapp;
        }
        RecyclerView recyclerView = this.reviewRecyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.reviewRecyclerView.setAdapter(this.deejungInstallmentsReviewAdapter);
        this.deejungInstallmentsReviewAdapter.read = this;
        this.deejungInstallmentsReviewAdapter.write = this;
        return inflate;
    }

    public void onClick(View view) {
        FirebaseVisionCloudDetectorOptions.Builder builder = this.presenter;
        initializeApp initializeapp = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (builder.RatingCompat != null) {
            builder.RatingCompat.AlertController$RecycleListView();
        }
        builder.write.MediaBrowserCompat$ItemReceiver(initializeapp.MediaSessionCompat$Token);
        builder.write.IconCompatParcelizer(new FirebaseVisionCloudDetectorOptions.Builder.IconCompatParcelizer(builder, (byte) 0));
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Context context = getContext();
        if (context != null) {
            toLongArray tolongarray = this.presenter.MediaBrowserCompat$ItemReceiver;
            String MediaBrowserCompat$CustomActionResultReceiver2 = AbstractMultimap.MediaBrowserCompat$CustomActionResultReceiver("DEEJUNG_INSTALLMENT", (String) null);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "path");
            String read = getICheckDeserializerRtti.read(MediaBrowserCompat$CustomActionResultReceiver2, tolongarray.read);
            onGetStartedClick.IconCompatParcelizer((Object) read, "Utilities.transformAssetUrl(path, baseStaticURL)");
            Intent IconCompatParcelizer = DeejungTermsAndConditionsActivity.IconCompatParcelizer(context, read);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(IconCompatParcelizer);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final initializeApp MediaBrowserCompat$CustomActionResultReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void write(initializeAllApis initializeallapis) {
        Intent intent = new Intent(getContext(), HomeActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_LAYOUT", R.id.account_summary_tab);
        intent.putExtra("com.scb.phone.EXTRA_NEW_INSTANCE_REFRESH", true);
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
        Intent MediaBrowserCompat$ItemReceiver = DeejungInstallmentsConfirmationActivity.MediaBrowserCompat$ItemReceiver(getContext(), initializeallapis);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity2, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb2.append(MediaBrowserCompat$ItemReceiver.getData());
            sb2.append("\n with context ");
            sb2.append(activity2.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
