package com.scb.phone.view.fragment.remittance;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.location.places.Place;
import com.scb.phone.R;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.paynow.PayNowReviewActivity;
import com.scb.phone.view.activity.remittance.RemittanceAddFavouriteRecipientDetailActivity;
import com.scb.phone.view.activity.remittance.RemittanceSenderAddressReviewActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.adapter.transferandpay.AccountSourceAdapter;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.remittance.RemittanceAmountFormFragment;
import com.scb.phone.view.fragment.transferandpay.AccountSourceSelectFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_ContributePartnerLoginActivity;
import p040o.ActivityBuilder_ContributePrepaidInputActivity;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_Application;
import p040o.C3085x7c929f5b;
import p040o.C3088x7e3e3ebd;
import p040o.C3092xce3d994b;
import p040o.C5000nE;
import p040o.C5004nH;
import p040o.CardView;
import p040o.CheckEligibilityActivity;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindBillPaymentHistoryFragment;
import p040o.FragmentBuilder_BindCloseAccountSelectionTabFragment;
import p040o.FundFactSheetActivity;
import p040o.GoodToKnowActivity;
import p040o.HashBasedTable;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.createSubmap;
import p040o.fromInternal;
import p040o.getHighestVersionAsync;
import p040o.iterable;
import p040o.iterable$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.nE$MediaBrowserCompat$ItemReceiver;
import p040o.nE$MediaBrowserCompat$MediaItem;
import p040o.nE$MediaBrowserCompat$SearchResultReceiver;
import p040o.nE$MediaSessionCompat$Token;
import p040o.nE$PlaybackStateCompat$CustomAction;
import p040o.onGetStartedClick;
import p040o.readObject;
import p040o.reverseOrder;
import p040o.scrollGesturesEnabled;
import p040o.setOnInfoWindowCloseListener;
import p040o.setOnInfoWindowLongClickListener;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.validateEntries;
import p040o.writeUInt64NoTag;

public final class RemittanceInputFragment extends BaseFragment implements getHighestVersionAsync, FragmentBuilder_BindBillPaymentHistoryFragment, FragmentBuilder_BindCloseAccountSelectionTabFragment, AccountSourceSelectFragment.write {
    public static final read IconCompatParcelizer = new read((byte) 0);
    private ActivityBuilder_ContributePartnerLoginActivity MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public boolean MediaDescriptionCompat;
    @BindView
    public FrameLayout favouriteFragment;
    @HmlPinActivity
    public C5000nE presenter;
    @BindView
    public NestedScrollView svRoot;

    public final /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    /* renamed from: c_ */
    public final /* synthetic */ void mo13978c_(boolean z) {
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<CardView, HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CardView cardView = (CardView) obj;
            onGetStartedClick.write((Object) cardView, "$receiver");
            cardView.write(R.id.fragment_favourite_transfer_target, new RemittanceFavouriteTargetFragment(), "favorite");
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<CardView, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ RemittanceAmountFormFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(RemittanceAmountFormFragment remittanceAmountFormFragment) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = remittanceAmountFormFragment;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            CardView cardView = (CardView) obj;
            onGetStartedClick.write((Object) cardView, "$receiver");
            cardView.MediaBrowserCompat$SearchResultReceiver();
            cardView.IconCompatParcelizer(R.id.fragment_detail, this.MediaBrowserCompat$CustomActionResultReceiver, "amount_form");
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static RemittanceInputFragment IconCompatParcelizer(C3092xce3d994b.Builder builder, C3088x7e3e3ebd.C30891 r4) {
            onGetStartedClick.write((Object) builder, "state");
            RemittanceInputFragment remittanceInputFragment = new RemittanceInputFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("STATE", builder.ordinal());
            bundle.putParcelable("INPUT_DISPLAY", r4);
            remittanceInputFragment.setArguments(bundle);
            return remittanceInputFragment;
        }
    }

    private final C3092xce3d994b.Builder MediaBrowserCompat$SearchResultReceiver() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            C3092xce3d994b.Builder builder = null;
            int i = arguments.getInt("STATE", -1);
            if (i >= 0) {
                builder = C3092xce3d994b.Builder.values()[i];
            }
            C3092xce3d994b.Builder builder2 = builder;
            if (builder2 != null) {
                return builder2;
            }
        }
        return C3092xce3d994b.Builder.NORMAL;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f89412131494168, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C3088x7e3e3ebd.C30891 r5;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C5000nE nEVar = this.presenter;
        if (nEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nEVar.MediaBrowserCompat$ItemReceiver(this);
        C5000nE nEVar2 = this.presenter;
        if (nEVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        C3092xce3d994b.Builder MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver();
        onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver, "state");
        nEVar2.MediaSessionCompat$QueueItem = MediaBrowserCompat$SearchResultReceiver;
        int i = ActivityBuilder_ContributePrepaidInputActivity.MediaBrowserCompat$ItemReceiver[MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i == 1 || i == 2) {
            Bundle arguments = getArguments();
            if (arguments != null && (r5 = (C3088x7e3e3ebd.C30891) arguments.getParcelable("INPUT_DISPLAY")) != null) {
                read(r5.write);
                C5000nE nEVar3 = this.presenter;
                if (nEVar3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                onGetStartedClick.write((Object) r5, "display");
                nEVar3.IconCompatParcelizer = r5;
                C5000nE nEVar4 = this.presenter;
                if (nEVar4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                nEVar4.write(new C3085x7c929f5b.C30861(r5.MediaMetadataCompat, r5.MediaDescriptionCompat, r5.MediaBrowserCompat$ItemReceiver, r5.f2678x50fd9e4a));
            }
        } else if (i != 3) {
            setTitleMarginStart childFragmentManager = getChildFragmentManager();
            onGetStartedClick.IconCompatParcelizer((Object) childFragmentManager, "childFragmentManager");
            AlertController$RecycleListView.read(childFragmentManager, (FundFactSheetActivity<? super CardView, HmlVerifyPhoneValidateOtpActivity>) IconCompatParcelizer.read);
            read((String) null);
            getChildFragmentManager().read().write(R.id.fragment_detail, new RemittanceCountrySelectionFragment(), "country_selection").write();
        } else {
            read((String) null);
            getChildFragmentManager().read().write(R.id.fragment_detail, new RemittanceCountrySelectionFragment(), "country_selection").write();
        }
    }

    private final void read(String str) {
        CrashlyticsReport.FilesPayload.File.write write2 = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.REMITTANCE_FUNCTION);
        write2.MediaBrowserCompat$ItemReceiver = false;
        write2.IconCompatParcelizer = true;
        write2.MediaDescriptionCompat = true;
        write2.RatingCompat = true;
        write2.MediaBrowserCompat$CustomActionResultReceiver = getString(R.string.remittance_input_account_from_title);
        write2.MediaBrowserCompat$MediaItem = getString(R.string.remittance_input_account_to_title);
        write2.read = 3;
        getChildFragmentManager().read().write(R.id.fragment_account_source_select, AccountSourceSelectFragment.MediaBrowserCompat$CustomActionResultReceiver(new CrashlyticsReport.FilesPayload.File(write2, (byte) 0), str, ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.NORMAL_ERROR), "source_of_fund").write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, "display");
        PlaybackStateCompat$CustomAction();
        if (MediaBrowserCompat$SearchResultReceiver() == C3092xce3d994b.Builder.ADD_FAVOURITE) {
            NestedScrollView nestedScrollView = this.svRoot;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("svRoot");
            }
            nestedScrollView.setFillViewport(true);
        }
        RemittanceAmountFormFragment.read read2 = RemittanceAmountFormFragment.MediaBrowserCompat$CustomActionResultReceiver;
        RemittanceAmountFormFragment IconCompatParcelizer2 = RemittanceAmountFormFragment.read.IconCompatParcelizer(MediaBrowserCompat$SearchResultReceiver(), autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, false, (AutoValue_CrashlyticsReport_Session_Application.C30641) null);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        setTitleMarginStart childFragmentManager = getChildFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) childFragmentManager, "childFragmentManager");
        AlertController$RecycleListView.read(childFragmentManager, (FundFactSheetActivity<? super CardView, HmlVerifyPhoneValidateOtpActivity>) new write(IconCompatParcelizer2));
    }

    public final void IconCompatParcelizer(C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame, "display");
        Context context = getContext();
        if (context != null) {
            RemittanceSenderAddressReviewActivity.IconCompatParcelizer iconCompatParcelizer = RemittanceSenderAddressReviewActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            C3092xce3d994b.Builder MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$SearchResultReceiver();
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver, "state");
            Intent intent = new Intent(context, RemittanceSenderAddressReviewActivity.class);
            onGetStartedClick.IconCompatParcelizer((Object) intent.putExtra("STATE", MediaBrowserCompat$SearchResultReceiver.ordinal()), "putExtra(key, value?.ordinal ?: -1)");
            intent.putExtra("display", autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(C3092xce3d994b autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame, "display");
        Context context = getContext();
        if (context != null) {
            RemittanceAddFavouriteRecipientDetailActivity.IconCompatParcelizer iconCompatParcelizer = RemittanceAddFavouriteRecipientDetailActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, RemittanceAddFavouriteRecipientDetailActivity.class);
            intent.putExtra("display", autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(intent, 1002);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write(C3085x7c929f5b.C30861 r3) {
        onGetStartedClick.write((Object) r3, "channel");
        C5000nE nEVar = this.presenter;
        if (nEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nEVar.write(r3);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FrameLayout frameLayout = this.favouriteFragment;
        if (frameLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("favouriteFragment");
        }
        frameLayout.setVisibility(8);
    }

    public final void write() {
        AccountSourceAdapter accountSourceAdapter;
        C5000nE nEVar = this.presenter;
        if (nEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("source_of_fund");
        CrashlyticsReport.FilesPayload.File.Builder builder = null;
        if (!(findFragmentByTag instanceof AccountSourceSelectFragment)) {
            findFragmentByTag = null;
        }
        AccountSourceSelectFragment accountSourceSelectFragment = (AccountSourceSelectFragment) findFragmentByTag;
        if (!(accountSourceSelectFragment == null || (accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver) == null)) {
            builder = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem());
        }
        CrashlyticsReport.FilesPayload.File.Builder builder2 = builder;
        if (builder2 != null && nEVar.MediaBrowserCompat$ItemReceiver != null && nEVar.read != null) {
            fromInternal frominternal = nEVar.MediaBrowserCompat$SearchResultReceiver;
            C3092xce3d994b.Builder builder3 = nEVar.MediaSessionCompat$QueueItem;
            if (builder3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("state");
            }
            C3085x7c929f5b.C30861 r7 = nEVar.MediaBrowserCompat$ItemReceiver;
            if (r7 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            scrollGesturesEnabled scrollgesturesenabled = nEVar.read;
            if (scrollgesturesenabled == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            }
            writeUInt64NoTag.IconCompatParcelizer ne_mediabrowsercompat_mediaitem = new nE$MediaBrowserCompat$MediaItem(frominternal.MediaBrowserCompat$ItemReceiver(builder3, builder2, r7, scrollgesturesenabled, 0.0d, (C3088x7e3e3ebd.C30891) null, (validateEntries) null));
            if (nEVar.RatingCompat != null) {
                ne_mediabrowsercompat_mediaitem.IconCompatParcelizer(nEVar.RatingCompat);
            }
        }
    }

    public final void RatingCompat() {
        RemittanceCountrySelectionFragment remittanceCountrySelectionFragment = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        int i = ActivityBuilder_ContributePrepaidInputActivity.write[MediaBrowserCompat$SearchResultReceiver().ordinal()];
        if (i == 1) {
            NestedScrollView nestedScrollView = this.svRoot;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("svRoot");
            }
            nestedScrollView.setFillViewport(false);
        } else if (i == 2) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            nEVar.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            FrameLayout frameLayout = this.favouriteFragment;
            if (frameLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("favouriteFragment");
            }
            frameLayout.setVisibility(0);
        }
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("country_selection");
        if (findFragmentByTag instanceof RemittanceCountrySelectionFragment) {
            remittanceCountrySelectionFragment = findFragmentByTag;
        }
        RemittanceCountrySelectionFragment remittanceCountrySelectionFragment2 = remittanceCountrySelectionFragment;
        if (remittanceCountrySelectionFragment2 == null) {
            remittanceCountrySelectionFragment2 = new RemittanceCountrySelectionFragment();
        }
        setTitleMarginStart childFragmentManager = getChildFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) childFragmentManager, "childFragmentManager");
        AlertController$RecycleListView.read(childFragmentManager, (FundFactSheetActivity<? super CardView, HmlVerifyPhoneValidateOtpActivity>) new RemittanceInputFragment$MediaBrowserCompat$ItemReceiver(remittanceCountrySelectionFragment2));
    }

    public final void MediaBrowserCompat$ItemReceiver(C3088x7e3e3ebd autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, AutoValue_CrashlyticsReport_Session_Application.C30641 r4) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, "display");
        onGetStartedClick.write((Object) r4, "payNowDisplay");
        PlaybackStateCompat$CustomAction();
        if (MediaBrowserCompat$SearchResultReceiver() == C3092xce3d994b.Builder.ADD_FAVOURITE) {
            NestedScrollView nestedScrollView = this.svRoot;
            if (nestedScrollView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("svRoot");
            }
            nestedScrollView.setFillViewport(true);
        }
        RemittanceAmountFormFragment.read read2 = RemittanceAmountFormFragment.MediaBrowserCompat$CustomActionResultReceiver;
        RemittanceAmountFormFragment IconCompatParcelizer2 = RemittanceAmountFormFragment.read.IconCompatParcelizer(MediaBrowserCompat$SearchResultReceiver(), autoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread, this.MediaDescriptionCompat, r4);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        setTitleMarginStart childFragmentManager = getChildFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) childFragmentManager, "childFragmentManager");
        AlertController$RecycleListView.read(childFragmentManager, (FundFactSheetActivity<? super CardView, HmlVerifyPhoneValidateOtpActivity>) new C6153x8c5b88a9(this, IconCompatParcelizer2));
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_Application.Builder builder) {
        onGetStartedClick.write((Object) builder, "payNowReviewDisplay");
        Context context = getContext();
        if (context != null) {
            PayNowReviewActivity.write write2 = PayNowReviewActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) builder, "payNowReviewDisplay");
            Intent intent = new Intent(context, PayNowReviewActivity.class);
            intent.putExtra("EXTRA_PAYNOW_REVIEW_DISPLAY", builder);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivityForResult(intent, Place.TYPE_POLITICAL);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void read() {
        Context context = getContext();
        if (context != null) {
            Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer(context);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(IconCompatParcelizer2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SplashActivity.IconCompatParcelizer(activity);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        AutoValue_CrashlyticsReport_Session_Application.C30641 r11;
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.setResult(-1);
                activity.finish();
            }
        } else if (i == 1012 && i2 == -1) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setOnInfoWindowCloseListener MediaBrowserCompat$CustomActionResultReceiver2 = nEVar.MediaMetadataCompat.write.MediaBrowserCompat$CustomActionResultReceiver();
            boolean z = false;
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "payNowInfo");
                r11 = new Parcelable(MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver, MediaBrowserCompat$CustomActionResultReceiver2.read, MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat, MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer, GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat, "+", "", false), MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem, MediaBrowserCompat$CustomActionResultReceiver2.write) {
                    public static final Parcelable.Creator CREATOR;
                    public final String IconCompatParcelizer;
                    public final String MediaBrowserCompat$CustomActionResultReceiver;
                    public final float MediaBrowserCompat$ItemReceiver;
                    public final String MediaDescriptionCompat;
                    public final String MediaMetadataCompat;
                    public final String RatingCompat;
                    public final String read;
                    public final String write;

                    /* renamed from: o.AutoValue_CrashlyticsReport_Session_Application$1$read */
                    public static final class read implements Parcelable.Creator {
                        public final java.lang.Object createFromParcel(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Application.1.read.createFromParcel(android.os.Parcel):java.lang.Object, dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Application.1.read.createFromParcel(android.os.Parcel):java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/

                        public final java.lang.Object[] newArray(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Application.1.read.newArray(int):java.lang.Object[], dex: classes2.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Application.1.read.newArray(int):java.lang.Object[], class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        
*/
                    }

                    public final int describeContents(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Application.1.describeContents():int, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Application.1.describeContents():int, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final boolean equals(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Application.1.equals(java.lang.Object):boolean, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Application.1.equals(java.lang.Object):boolean, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final int hashCode(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Application.1.hashCode():int, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Application.1.hashCode():int, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final java.lang.String toString(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Application.1.toString():java.lang.String, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Application.1.toString():java.lang.String, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/

                    public final void writeToParcel(
/*
Method generation error in method: o.AutoValue_CrashlyticsReport_Session_Application.1.writeToParcel(android.os.Parcel, int):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.AutoValue_CrashlyticsReport_Session_Application.1.writeToParcel(android.os.Parcel, int):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                };
            } else {
                r11 = null;
            }
            if (r11 != null) {
                this.MediaDescriptionCompat = true;
                C5000nE nEVar2 = this.presenter;
                if (nEVar2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                C3085x7c929f5b.C30861 r5 = new C3085x7c929f5b.C30861(r11.MediaBrowserCompat$CustomActionResultReceiver, r11.write, r11.IconCompatParcelizer, r11.read);
                onGetStartedClick.write((Object) r5, "channelDisplay");
                onGetStartedClick.write((Object) r11, "display");
                nEVar2.MediaBrowserCompat$ItemReceiver = r5;
                createSubmap createsubmap = new createSubmap(r5.MediaBrowserCompat$CustomActionResultReceiver, r5.read, r5.MediaBrowserCompat$ItemReceiver, r5.IconCompatParcelizer);
                readObject readobject = nEVar2.MediaDescriptionCompat;
                onGetStartedClick.write((Object) createsubmap, "request");
                DebitCardResetOtpActivity<scrollGesturesEnabled> doOnNext = readobject.write.read(createsubmap).doOnNext(new C5000nE.MediaDescriptionCompat(nEVar2));
                if (nEVar2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    nEVar2.RatingCompat.AlertController$RecycleListView();
                }
                nEVar2.MediaDescriptionCompat.read(doOnNext, new nE$MediaBrowserCompat$ItemReceiver(nEVar2, r5, r11), new C5004nH(new C5000nE.MediaMetadataCompat(nEVar2)));
            }
        }
    }

    static final class MediaDescriptionCompat implements DialogInterface.OnClickListener {
        private /* synthetic */ RemittanceInputFragment MediaBrowserCompat$ItemReceiver;

        MediaDescriptionCompat(RemittanceInputFragment remittanceInputFragment) {
            this.MediaBrowserCompat$ItemReceiver = remittanceInputFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C5000nE nEVar = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer ne_mediabrowsercompat_searchresultreceiver = new nE$MediaBrowserCompat$SearchResultReceiver(nEVar);
            if (nEVar.RatingCompat != null) {
                ne_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(nEVar.RatingCompat);
            }
            dialogInterface.dismiss();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setOnInfoWindowLongClickListener setoninfowindowlongclicklistener) {
        onGetStartedClick.write((Object) setoninfowindowlongclicklistener, "payNowVerification");
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(setoninfowindowlongclicklistener.MediaBrowserCompat$SearchResultReceiver).MediaBrowserCompat$ItemReceiver(setoninfowindowlongclicklistener.write);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.paynow_proceed_button_dialog), new MediaDescriptionCompat(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.paynow_cancel_button_dialog), RemittanceInputFragment$MediaBrowserCompat$MediaItem.write).show();
    }

    public final void onDestroyView() {
        C5000nE nEVar = this.presenter;
        if (nEVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nEVar.onDestroy();
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.FilesPayload.File.Builder builder) {
        boolean z;
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("amount_form");
        if (!(findFragmentByTag instanceof RemittanceAmountFormFragment)) {
            findFragmentByTag = null;
        }
        RemittanceAmountFormFragment remittanceAmountFormFragment = (RemittanceAmountFormFragment) findFragmentByTag;
        if (remittanceAmountFormFragment != null) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AmountEditText amountEditText = remittanceAmountFormFragment.etFromAmountValue;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etFromAmountValue");
            }
            Double valueOf = Double.valueOf(amountEditText.write);
            AmountEditText amountEditText2 = remittanceAmountFormFragment.etToAmountValue;
            if (amountEditText2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("etToAmountValue");
            }
            z = nEVar.write(builder, (HmlVerifyEmailSuccessfulActivity<Double, Double>) new HmlVerifyEmailSuccessfulActivity(valueOf, Double.valueOf(amountEditText2.write)));
        } else {
            z = false;
        }
        ActivityBuilder_ContributePartnerLoginActivity activityBuilder_ContributePartnerLoginActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (activityBuilder_ContributePartnerLoginActivity != null) {
            activityBuilder_ContributePartnerLoginActivity.IconCompatParcelizer(z);
        }
    }

    public final void IconCompatParcelizer(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity) {
        boolean z;
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "amountFromAndAmountTo");
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("source_of_fund");
        CrashlyticsReport.FilesPayload.File.Builder builder = null;
        if (!(findFragmentByTag instanceof AccountSourceSelectFragment)) {
            findFragmentByTag = null;
        }
        AccountSourceSelectFragment accountSourceSelectFragment = (AccountSourceSelectFragment) findFragmentByTag;
        if (accountSourceSelectFragment != null) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
            if (accountSourceAdapter != null) {
                builder = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem());
            }
            z = nEVar.write(builder, hmlVerifyEmailSuccessfulActivity);
        } else {
            z = false;
        }
        ActivityBuilder_ContributePartnerLoginActivity activityBuilder_ContributePartnerLoginActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (activityBuilder_ContributePartnerLoginActivity != null) {
            activityBuilder_ContributePartnerLoginActivity.IconCompatParcelizer(z);
        }
    }

    public final void IconCompatParcelizer() {
        boolean z;
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("source_of_fund");
        CrashlyticsReport.FilesPayload.File.Builder builder = null;
        if (!(findFragmentByTag instanceof AccountSourceSelectFragment)) {
            findFragmentByTag = null;
        }
        AccountSourceSelectFragment accountSourceSelectFragment = (AccountSourceSelectFragment) findFragmentByTag;
        if (accountSourceSelectFragment != null) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
            if (accountSourceAdapter != null) {
                builder = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem());
            }
            z = nEVar.write(builder, (HmlVerifyEmailSuccessfulActivity<Double, Double>) new HmlVerifyEmailSuccessfulActivity(Double.valueOf(0.0d), Double.valueOf(0.0d)));
        } else {
            z = false;
        }
        ActivityBuilder_ContributePartnerLoginActivity activityBuilder_ContributePartnerLoginActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (activityBuilder_ContributePartnerLoginActivity != null) {
            activityBuilder_ContributePartnerLoginActivity.IconCompatParcelizer(z);
        }
    }

    public final void read(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity, String str, String str2) {
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "amountFromAndAmountTo");
        onGetStartedClick.write((Object) str, "mobile");
        onGetStartedClick.write((Object) str2, "purpose");
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("source_of_fund");
        CrashlyticsReport.FilesPayload.File.Builder builder = null;
        if (!(findFragmentByTag instanceof AccountSourceSelectFragment)) {
            findFragmentByTag = null;
        }
        AccountSourceSelectFragment accountSourceSelectFragment = (AccountSourceSelectFragment) findFragmentByTag;
        boolean z = false;
        if (accountSourceSelectFragment != null) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
            if (accountSourceAdapter != null) {
                builder = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem());
            }
            onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity, "amountFromAndAmountTo");
            onGetStartedClick.write((Object) str, "mobile");
            onGetStartedClick.write((Object) str2, "purpose");
            if (builder != null) {
                CharSequence charSequence = str;
                if (!(charSequence == null || GoodToKnowActivity.read(charSequence))) {
                    CharSequence charSequence2 = str2;
                    if ((!(charSequence2 == null || GoodToKnowActivity.read(charSequence2))) && ((Number) hmlVerifyEmailSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver).doubleValue() > 0.0d && ((Number) hmlVerifyEmailSuccessfulActivity.write).doubleValue() > 0.0d) {
                        double doubleValue = ((Number) hmlVerifyEmailSuccessfulActivity.write).doubleValue();
                        scrollGesturesEnabled scrollgesturesenabled = nEVar.read;
                        if (scrollgesturesenabled == null) {
                            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                        }
                        if (doubleValue <= ((double) scrollgesturesenabled.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver)) {
                            z = true;
                        }
                    }
                }
            }
        }
        ActivityBuilder_ContributePartnerLoginActivity activityBuilder_ContributePartnerLoginActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (activityBuilder_ContributePartnerLoginActivity != null) {
            activityBuilder_ContributePartnerLoginActivity.IconCompatParcelizer(z);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity, String str, String str2, String str3) {
        HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity2 = hmlVerifyEmailSuccessfulActivity;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity2, "amountFromAndAmountTo");
        onGetStartedClick.write((Object) str4, "mobile");
        onGetStartedClick.write((Object) str5, "purpose");
        onGetStartedClick.write((Object) str6, "note");
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("source_of_fund");
        CrashlyticsReport.FilesPayload.File.Builder builder = null;
        if (!(findFragmentByTag instanceof AccountSourceSelectFragment)) {
            findFragmentByTag = null;
        }
        AccountSourceSelectFragment accountSourceSelectFragment = (AccountSourceSelectFragment) findFragmentByTag;
        if (accountSourceSelectFragment != null) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
            if (accountSourceAdapter != null) {
                builder = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem());
            }
            onGetStartedClick.IconCompatParcelizer((Object) builder, "it.selectedAccount");
            onGetStartedClick.write((Object) builder, "accountDisplay");
            onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity2, "amountFromAndTo");
            onGetStartedClick.write((Object) str4, "mobile");
            onGetStartedClick.write((Object) str5, "purposeSelected");
            onGetStartedClick.write((Object) str6, "note");
            C3085x7c929f5b.C30861 r2 = nEVar.MediaBrowserCompat$ItemReceiver;
            if (r2 != null) {
                String str7 = r2.MediaBrowserCompat$CustomActionResultReceiver;
                String str8 = r2.read;
                String str9 = r2.MediaBrowserCompat$ItemReceiver;
                String str10 = r2.IconCompatParcelizer;
                double doubleValue = ((Number) hmlVerifyEmailSuccessfulActivity2.MediaBrowserCompat$CustomActionResultReceiver).doubleValue();
                double doubleValue2 = ((Number) hmlVerifyEmailSuccessfulActivity2.write).doubleValue();
                StringBuilder sb = new StringBuilder();
                sb.append("+");
                sb.append(str4);
                String obj = sb.toString();
                String str11 = builder.f2695x50fd9e4a;
                onGetStartedClick.IconCompatParcelizer((Object) str11, "accountDisplay.rawReferenceNumber");
                HashBasedTable.Factory factory = r0;
                HashBasedTable.Factory factory2 = new HashBasedTable.Factory(str7, str8, str9, str10, doubleValue2, str11, obj, str3, str2);
                if (nEVar.RatingCompat != null) {
                    nEVar.RatingCompat.AlertController$RecycleListView();
                }
                iterable iterable = nEVar.MediaMetadataCompat;
                onGetStartedClick.write((Object) factory, "request");
                iterable.write.MediaBrowserCompat$ItemReceiver(factory, doubleValue);
                nEVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(new nE$MediaSessionCompat$Token(nEVar), new iterable$MediaBrowserCompat$CustomActionResultReceiver(factory), nEVar.write);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity) {
        HmlVerifyEmailSuccessfulActivity<Double, Double> hmlVerifyEmailSuccessfulActivity2 = hmlVerifyEmailSuccessfulActivity;
        onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity2, "amountFromAndAmountTo");
        Fragment findFragmentByTag = getChildFragmentManager().findFragmentByTag("source_of_fund");
        CrashlyticsReport.FilesPayload.File.Builder builder = null;
        if (!(findFragmentByTag instanceof AccountSourceSelectFragment)) {
            findFragmentByTag = null;
        }
        AccountSourceSelectFragment accountSourceSelectFragment = (AccountSourceSelectFragment) findFragmentByTag;
        if (accountSourceSelectFragment != null) {
            C5000nE nEVar = this.presenter;
            if (nEVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            AccountSourceAdapter accountSourceAdapter = accountSourceSelectFragment.MediaBrowserCompat$SearchResultReceiver;
            if (accountSourceAdapter != null) {
                builder = accountSourceAdapter.MediaBrowserCompat$CustomActionResultReceiver(accountSourceSelectFragment.mViewPager.getCurrentItem());
            }
            onGetStartedClick.IconCompatParcelizer((Object) builder, "it.selectedAccount");
            onGetStartedClick.write((Object) builder, "accountDisplay");
            onGetStartedClick.write((Object) hmlVerifyEmailSuccessfulActivity2, "amountFromAndTo");
            C3085x7c929f5b.C30861 r1 = nEVar.MediaBrowserCompat$ItemReceiver;
            if (r1 != null) {
                String str = r1.MediaBrowserCompat$CustomActionResultReceiver;
                String str2 = r1.read;
                String str3 = r1.MediaBrowserCompat$ItemReceiver;
                String str4 = r1.IconCompatParcelizer;
                double doubleValue = ((Number) hmlVerifyEmailSuccessfulActivity2.MediaBrowserCompat$CustomActionResultReceiver).doubleValue();
                double doubleValue2 = ((Number) hmlVerifyEmailSuccessfulActivity2.write).doubleValue();
                String str5 = builder.f2695x50fd9e4a;
                onGetStartedClick.IconCompatParcelizer((Object) str5, "accountDisplay.rawReferenceNumber");
                reverseOrder reverseorder = new reverseOrder(str5, doubleValue, doubleValue2, str, str2, str3, str4);
                if (nEVar.RatingCompat != null) {
                    nEVar.RatingCompat.AlertController$RecycleListView();
                }
                readObject readobject = nEVar.MediaDescriptionCompat;
                onGetStartedClick.write((Object) reverseorder, "request");
                readobject.read(readobject.write.MediaBrowserCompat$CustomActionResultReceiver(reverseorder), new C5000nE.setHasDecor(nEVar, builder, doubleValue2), new C5004nH(new nE$PlaybackStateCompat$CustomAction(nEVar)));
            }
        }
    }
}
