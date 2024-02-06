package com.scb.phone.view.fragment.profilemanagement.accounts;

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
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.CardActivationActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.ReviewAccountsActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.VerifyIdentityActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.ErrorFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlWorkAddressActivity;
import p040o.ActivityBuilder_ContributeHmlZoomDocumentActivity;
import p040o.ActivityBuilder_ContributeIdpLivenessCheckActivity;
import p040o.ActivityBuilder_ContributeIdpVerifyCustomerDataActivity;
import p040o.ActivityBuilder_ContributeInsurancePortfolioActivity;
import p040o.ActivityBuilder_ContributeJuristicOnboardingLandingActivity;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.C4851jM;
import p040o.C4904kj;
import p040o.C4905kk;
import p040o.C4908kn;
import p040o.C4915ks;
import p040o.CardView;
import p040o.ForwardingCheckedFuture;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickExtractor;
import p040o.confirmRegistrationDirectDebit;
import p040o.getKernelIDDstOver;
import p040o.notifyBackgroundStateChangeListeners;
import p040o.preauthenticate;
import p040o.setTapText;

public class AddAccountsFragment extends BaseFragment implements QuickExtractor.C70184 {
    private boolean IconCompatParcelizer;
    private confirmRegistrationDirectDebit MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public C4915ks addAccountsPresenter;
    @BindView
    ViewGroup emptyContainer;
    @BindView
    RecyclerView recyclerView;

    public AddAccountsFragment() {
        new getKernelIDDstOver();
    }

    public static AddAccountsFragment write(boolean z, boolean z2, int i, AutoValue_CrashlyticsReport_Session_Event_Application.Builder builder) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isOnBoarding", z);
        bundle.putBoolean("com.scb.phone.EXTRA_CONSENT_FLAG", z2);
        bundle.putInt("com.scb.phone.EXTRA_CONSENT_VERSION", i);
        bundle.putParcelable("com.scb.phone.EXTRA_UNREGISTERACCOUNT", builder);
        AddAccountsFragment addAccountsFragment = new AddAccountsFragment();
        addAccountsFragment.setArguments(bundle);
        return addAccountsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85602131493787, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("addaccount_landing");
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = new confirmRegistrationDirectDebit(new ActivityBuilder_ContributeIdpLivenessCheckActivity(this), new ActivityBuilder_ContributeIdpVerifyCustomerDataActivity(this), new ActivityBuilder_ContributeJuristicOnboardingLandingActivity(this), new ActivityBuilder_ContributeHmlZoomDocumentActivity(this));
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new preauthenticate(), -1);
        this.addAccountsPresenter.MediaBrowserCompat$ItemReceiver(this);
        AutoValue_CrashlyticsReport_Session_Event_Application.Builder builder = (AutoValue_CrashlyticsReport_Session_Event_Application.Builder) getArguments().getParcelable("com.scb.phone.EXTRA_UNREGISTERACCOUNT");
        this.IconCompatParcelizer = getArguments().getBoolean("com.scb.phone.EXTRA_CONSENT_FLAG");
        if (builder != null) {
            C4915ks ksVar = this.addAccountsPresenter;
            if (builder.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null || !builder.MediaBrowserCompat$ItemReceiver.write.isEmpty() || builder.write.IconCompatParcelizer != null || !builder.write.write.isEmpty() || builder.read.IconCompatParcelizer != null || !builder.read.write.isEmpty() || builder.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer != null || !builder.MediaBrowserCompat$CustomActionResultReceiver.write.isEmpty() || builder.PlaybackStateCompat$CustomAction.IconCompatParcelizer != null || !builder.PlaybackStateCompat$CustomAction.write.isEmpty() || builder.PlaybackStateCompat.IconCompatParcelizer != null || !builder.PlaybackStateCompat.write.isEmpty() || builder.setHasDecor.IconCompatParcelizer != null || !builder.setHasDecor.write.isEmpty() || builder.Keep.IconCompatParcelizer != null || !builder.Keep.write.isEmpty() || builder.IconCompatParcelizer.IconCompatParcelizer != null || !builder.IconCompatParcelizer.write.isEmpty() || builder.AlertController$RecycleListView.write != null || builder.AlertController$RecycleListView.IconCompatParcelizer) {
                ksVar.IconCompatParcelizer = builder.MediaBrowserCompat$SearchResultReceiver;
                ksVar.MediaBrowserCompat$ItemReceiver = builder.MediaDescriptionCompat;
                ksVar.write = builder.MediaMetadataCompat;
                ksVar.MediaDescriptionCompat = builder.RatingCompat;
                ksVar.MediaMetadataCompat = builder.MediaBrowserCompat$MediaItem;
                ksVar.MediaBrowserCompat$SearchResultReceiver = builder.MediaSessionCompat$QueueItem;
                ksVar.MediaSessionCompat$QueueItem = builder.ParcelableVolumeInfo;
                ksVar.MediaSessionCompat$ResultReceiverWrapper = builder.f2674x50fd9e4a;
                ksVar.MediaBrowserCompat$MediaItem = builder.MediaSessionCompat$ResultReceiverWrapper;
                ksVar.MediaSessionCompat$Token = ksVar.read.MediaBrowserCompat$CustomActionResultReceiver(builder, ksVar.ParcelableVolumeInfo.read.setItemInvoker());
                C4851jM jMVar = new C4851jM(ksVar);
                if (ksVar.RatingCompat != null) {
                    jMVar.IconCompatParcelizer(ksVar.RatingCompat);
                }
                C4905kk kkVar = new C4905kk(ksVar);
                if (ksVar.RatingCompat != null) {
                    kkVar.IconCompatParcelizer(ksVar.RatingCompat);
                }
                C4904kj kjVar = C4904kj.IconCompatParcelizer;
                if (ksVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    kjVar.IconCompatParcelizer(ksVar.RatingCompat);
                }
            } else {
                C4908kn knVar = C4908kn.read;
                if (ksVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    knVar.IconCompatParcelizer(ksVar.RatingCompat);
                }
            }
        } else {
            C4915ks ksVar2 = this.addAccountsPresenter;
            if (getArguments() != null && getArguments().getBoolean("com.scb.phone.EXTRA_CONSENT_FLAG")) {
                z = true;
            }
            ksVar2.write(z);
        }
        return inflate;
    }

    public void onDestroy() {
        this.addAccountsPresenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(list);
    }

    public final void read(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        ReviewAccountsActivity.write(getContext(), list, getArguments().getBoolean("isOnBoarding"), getArguments().getBoolean("com.scb.phone.EXTRA_CONSENT_FLAG"), getArguments().getInt("com.scb.phone.EXTRA_CONSENT_VERSION"));
    }

    public final void read(notifyBackgroundStateChangeListeners notifybackgroundstatechangelisteners) {
        Context context = getContext();
        Intent MediaBrowserCompat$ItemReceiver = CardActivationActivity.MediaBrowserCompat$ItemReceiver(getContext(), notifybackgroundstatechangelisteners);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        this.recyclerView.setVisibility(8);
        this.emptyContainer.setVisibility(0);
        CardView read = getChildFragmentManager().read();
        ForwardingCheckedFuture.read MediaBrowserCompat$CustomActionResultReceiver2 = ForwardingCheckedFuture.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = R.drawable.ic_no_accounts;
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = getString(R.string.add_account_title);
        MediaBrowserCompat$CustomActionResultReceiver2.write = getString(R.string.no_accounts_title);
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = getString(R.string.no_accounts_description);
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.empty_container, ErrorFragment.MediaBrowserCompat$CustomActionResultReceiver(new ForwardingCheckedFuture(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0))).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.add_accounts_verify_dialog_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.add_accounts_verify_dialog_description)).MediaBrowserCompat$ItemReceiver(getString(R.string.cancel), ActivityBuilder_ContributeHmlWorkAddressActivity.IconCompatParcelizer).IconCompatParcelizer(getString(R.string.ok), new ActivityBuilder_ContributeInsurancePortfolioActivity(this)).show();
    }

    public final void write() {
        if (getContext() != null) {
            Intent intent = new Intent(getActivity(), VerifyIdentityActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(intent, 1000);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000 && i2 == -1) {
            this.addAccountsPresenter.write(this.IconCompatParcelizer);
        }
    }

    public final void read(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        confirmRegistrationDirectDebit confirmregistrationdirectdebit = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (confirmregistrationdirectdebit != null) {
            confirmregistrationdirectdebit.MediaBrowserCompat$ItemReceiver = z;
        }
    }
}
