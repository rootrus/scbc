package com.scb.phone.view.fragment.bulktransfer;

import android.animation.Animator;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.bulktransfer.CreateRecipientGroupActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AutoValue_PersistedInstallationEntry;
import p040o.BulkTransferDeepLinkActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getQuickTopUpStatus;
import p040o.getRegisteredAccounts;
import p040o.getRegistrationStatus;
import p040o.isNotGenerated;
import p040o.isValidAppIdFormat;
import p040o.proxyGetICheckDeserializerRtti;
import p040o.setChildDrawingOrderCallback;
import p040o.setTapText;
import p040o.withAuthToken;

public class BulkTransferEmptyFragment extends BaseFragment implements proxyGetICheckDeserializerRtti.read, ViewTreeObserver.OnGlobalLayoutListener {
    public Animator.AnimatorListener IconCompatParcelizer;
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public withAuthToken bulkTransferEmptyPresenter;
    @BindView
    public ImageView overlayImageView;
    @BindView
    public RelativeLayout relativeTutorial;
    @BindView
    RelativeLayout rootView;

    public static BulkTransferEmptyFragment IconCompatParcelizer(boolean z) {
        BulkTransferEmptyFragment bulkTransferEmptyFragment = new BulkTransferEmptyFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_SHOW_TUTORIAL", z);
        bulkTransferEmptyFragment.setArguments(bundle);
        return bulkTransferEmptyFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85882131493815, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaBrowserCompat$CustomActionResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getActivity(), new IntentFilter("com.scb.phone/BROADCAST_SHOW_BULK_TRANSFER_TUTORIAL")).subscribe(new getQuickTopUpStatus(this), getRegisteredAccounts.read);
        this.rootView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.bulkTransferEmptyPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            withAuthToken withauthtoken = this.bulkTransferEmptyPresenter;
            boolean z2 = getArguments().getBoolean("BUNDLE_SHOW_TUTORIAL", false);
            withauthtoken.IconCompatParcelizer = z2;
            if (!z2) {
                isValidAppIdFormat isvalidappidformat = isValidAppIdFormat.IconCompatParcelizer;
                if (withauthtoken.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    isvalidappidformat.IconCompatParcelizer(withauthtoken.RatingCompat);
                }
            }
        }
        this.IconCompatParcelizer = new Animator.AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
                BulkTransferEmptyFragment bulkTransferEmptyFragment = BulkTransferEmptyFragment.this;
                bulkTransferEmptyFragment.overlayImageView.setVisibility(8);
                bulkTransferEmptyFragment.relativeTutorial.setVisibility(8);
            }
        };
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(getContext(), CreateRecipientGroupActivity.class);
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

    @OnClick
    public void createButtonClicked() {
        withAuthToken withauthtoken = this.bulkTransferEmptyPresenter;
        isNotGenerated isnotgenerated = isNotGenerated.read;
        if (withauthtoken.RatingCompat != null) {
            isnotgenerated.IconCompatParcelizer(withauthtoken.RatingCompat);
        }
    }

    @OnClick
    public void onTutorialClicked() {
        withAuthToken withauthtoken = this.bulkTransferEmptyPresenter;
        AutoValue_PersistedInstallationEntry.C96641 r1 = AutoValue_PersistedInstallationEntry.C96641.write;
        if (withauthtoken.RatingCompat != null) {
            r1.IconCompatParcelizer(withauthtoken.RatingCompat);
        }
    }

    public final void write() {
        this.overlayImageView.setVisibility(8);
        this.relativeTutorial.setVisibility(8);
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }
        this.bulkTransferEmptyPresenter.onDestroy();
        super.onDestroy();
    }

    public void onGlobalLayout() {
        this.rootView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        withAuthToken withauthtoken = this.bulkTransferEmptyPresenter;
        if (withauthtoken.IconCompatParcelizer) {
            getRegistrationStatus getregistrationstatus = getRegistrationStatus.IconCompatParcelizer;
            if (withauthtoken.RatingCompat != null) {
                getregistrationstatus.IconCompatParcelizer(withauthtoken.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindDepositSelectorFragment.read(getContext(), this.rootView, this.overlayImageView);
    }

    public final void IconCompatParcelizer() {
        this.overlayImageView.setVisibility(8);
        this.relativeTutorial.setVisibility(8);
        if (getActivity() != null) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_SHOW_BULK_TRANSFER_TUTORIAL");
            getActivity().sendBroadcast(intent);
        }
    }
}
