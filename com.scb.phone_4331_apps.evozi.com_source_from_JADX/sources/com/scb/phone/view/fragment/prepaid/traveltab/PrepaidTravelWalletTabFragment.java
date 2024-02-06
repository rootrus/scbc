package com.scb.phone.view.fragment.prepaid.traveltab;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.AddNewCurrencyActivity;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.activity.prepaid.PrepaidTravelForeignCurrencyWalletDetailActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindChubbReviewFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ImmutableList;
import p040o.MyECouponActivity_ViewBinding;
import p040o.Predicates;
import p040o.ZHER2K;
import p040o.ZTBSV;
import p040o.getAddress3FieldName;
import p040o.getCustomAttributes;
import p040o.getKernelIDDstAtop;
import p040o.isSimulator;
import p040o.lastIndexOfImpl;
import p040o.newLocalProjectProvider;
import p040o.onGetStartedClick;
import p040o.setAnnotation;
import p040o.setAnnotation$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelWalletTabFragment extends BaseFragment implements newLocalProjectProvider.write, PrepaidDetailsActivity.read, setAnnotation$MediaBrowserCompat$CustomActionResultReceiver {
    private HashMap IconCompatParcelizer;
    private setAnnotation MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private FragmentBuilder_BindChubbReviewFragment MediaMetadataCompat;
    @HmlPinActivity
    public getAddress3FieldName presenter;

    private View IconCompatParcelizer(int i) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new HashMap();
        }
        View view = (View) this.IconCompatParcelizer.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.IconCompatParcelizer.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final PrepaidTravelWalletTabFragment MediaBrowserCompat$ItemReceiver(isSimulator issimulator) {
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        PrepaidTravelWalletTabFragment prepaidTravelWalletTabFragment = new PrepaidTravelWalletTabFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARGS_PREPAID_CARD_DISPLAY", issimulator);
        prepaidTravelWalletTabFragment.setArguments(bundle);
        return prepaidTravelWalletTabFragment;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final /* synthetic */ void mo15128x50fd9e4a() {
    }

    public PrepaidTravelWalletTabFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onAttach(Context context) {
        onGetStartedClick.write((Object) context, "context");
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChubbReviewFragment) {
            this.MediaMetadataCompat = (FragmentBuilder_BindChubbReviewFragment) context;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88972131494124, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        isSimulator issimulator;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.read = ButterKnife.IconCompatParcelizer(this, view);
        getAddress3FieldName getaddress3fieldname = this.presenter;
        if (getaddress3fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress3fieldname.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (!(arguments == null || (issimulator = (isSimulator) arguments.getParcelable("ARGS_PREPAID_CARD_DISPLAY")) == null)) {
            onGetStartedClick.IconCompatParcelizer((Object) issimulator, "prepaid");
        }
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            setAnnotation setannotation = new setAnnotation(context);
            this.MediaBrowserCompat$CustomActionResultReceiver = setannotation;
            setAnnotation$MediaBrowserCompat$CustomActionResultReceiver setannotation_mediabrowsercompat_customactionresultreceiver = this;
            onGetStartedClick.write((Object) setannotation_mediabrowsercompat_customactionresultreceiver, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            setannotation.write = setannotation_mediabrowsercompat_customactionresultreceiver;
        }
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvWallet");
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView2, "rvWallet");
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView3, "rvWallet");
        setAnnotation setannotation2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (setannotation2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
        }
        recyclerView3.setAdapter(setannotation2);
        IconCompatParcelizer();
    }

    public final void write(boolean z, boolean z2) {
        FragmentBuilder_BindChubbReviewFragment fragmentBuilder_BindChubbReviewFragment = this.MediaMetadataCompat;
        if (fragmentBuilder_BindChubbReviewFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("onPrepaidTravelWalletListener");
        }
        fragmentBuilder_BindChubbReviewFragment.IconCompatParcelizer(z, z2);
    }

    public final void read(isSimulator issimulator) {
        if (issimulator != null) {
            getAddress3FieldName getaddress3fieldname = this.presenter;
            if (getaddress3fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String str = issimulator.RatingCompat;
            onGetStartedClick.write((Object) str, "cardRefNo");
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getAddress3FieldName.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (getaddress3fieldname.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getaddress3fieldname.RatingCompat);
            }
            lastIndexOfImpl lastindexofimpl = getaddress3fieldname.MediaBrowserCompat$ItemReceiver;
            FundFactSheetActivity read = new getAddress3FieldName.read(getaddress3fieldname);
            FundFactSheetActivity mediaMetadataCompat = new getAddress3FieldName.MediaMetadataCompat(getaddress3fieldname);
            ImmutableList.Builder builder = new ImmutableList.Builder(str);
            onGetStartedClick.write((Object) read, "onSuccess");
            onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
            onGetStartedClick.write((Object) builder, "request");
            lastindexofimpl.IconCompatParcelizer(lastindexofimpl.MediaBrowserCompat$CustomActionResultReceiver, read, mediaMetadataCompat, new Predicates.read(builder));
        }
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_summary_wallet_screen");
        }
    }

    public final void IconCompatParcelizer(List<AutoValue_CrashlyticsReport_Session_Event_Application> list) {
        int i;
        onGetStartedClick.write((Object) list, "prepaidTravelWalletDisplayList");
        if (getContext() != null) {
            setAnnotation setannotation = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (setannotation == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("adapter");
            }
            onGetStartedClick.write((Object) list, "walletTravelList");
            setannotation.read = list.get(0);
            Collection arrayList = new ArrayList();
            for (Object next : list) {
                boolean z = true;
                if (((AutoValue_CrashlyticsReport_Session_Event_Application) next).MediaBrowserCompat$SearchResultReceiver != 1) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            setannotation.MediaBrowserCompat$SearchResultReceiver = (List) arrayList;
            if (setannotation.MediaBrowserCompat$CustomActionResultReceiver()) {
                List<AutoValue_CrashlyticsReport_Session_Event_Application> list2 = setannotation.MediaBrowserCompat$SearchResultReceiver;
                if (list2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
                }
                i = list2.size() + 3;
            } else {
                List<AutoValue_CrashlyticsReport_Session_Event_Application> list3 = setannotation.MediaBrowserCompat$SearchResultReceiver;
                if (list3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletTravelList");
                }
                i = list3.size() + 2;
            }
            setannotation.MediaBrowserCompat$ItemReceiver = i;
            setannotation.IconCompatParcelizer.write();
            FragmentBuilder_BindChubbReviewFragment fragmentBuilder_BindChubbReviewFragment = this.MediaMetadataCompat;
            if (fragmentBuilder_BindChubbReviewFragment == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("onPrepaidTravelWalletListener");
            }
            getAddress3FieldName getaddress3fieldname = this.presenter;
            if (getaddress3fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getCustomAttributes getcustomattributes = getaddress3fieldname.IconCompatParcelizer;
            if (getcustomattributes == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelWalletSummaryDisplay");
            }
            fragmentBuilder_BindChubbReviewFragment.read(getcustomattributes);
        }
    }

    public final void IconCompatParcelizer() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(0);
        View IconCompatParcelizer3 = IconCompatParcelizer(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer3, "viewCustomError");
        IconCompatParcelizer3.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvWallet");
        recyclerView.setVisibility(8);
        Button button = (Button) IconCompatParcelizer(ZHER2K.write.btnBuyNewCurrency);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btnBuyNewCurrency");
        button.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) IconCompatParcelizer(ZHER2K.write.rvWallet);
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "rvWallet");
        recyclerView.setVisibility(0);
        Button button = (Button) IconCompatParcelizer(ZHER2K.write.btnBuyNewCurrency);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btnBuyNewCurrency");
        button.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        View IconCompatParcelizer2 = IconCompatParcelizer(ZHER2K.write.viewCustomProgress);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "viewCustomProgress");
        IconCompatParcelizer2.setVisibility(8);
        View IconCompatParcelizer3 = IconCompatParcelizer(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer3, "viewCustomError");
        IconCompatParcelizer3.setVisibility(0);
    }

    public final void write() {
        Button button = (Button) IconCompatParcelizer(ZHER2K.write.btnBuyNewCurrency);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btnBuyNewCurrency");
        button.setEnabled(true);
    }

    public final void read() {
        Button button = (Button) IconCompatParcelizer(ZHER2K.write.btnBuyNewCurrency);
        onGetStartedClick.IconCompatParcelizer((Object) button, "btnBuyNewCurrency");
        button.setEnabled(false);
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application, ArrayList<String> arrayList) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
        onGetStartedClick.write((Object) arrayList, "thbWalletAllowTag");
        Context context = getContext();
        if (context != null) {
            PrepaidTravelForeignCurrencyWalletDetailActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidTravelForeignCurrencyWalletDetailActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            getAddress3FieldName getaddress3fieldname = this.presenter;
            if (getaddress3fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getCustomAttributes getcustomattributes = getaddress3fieldname.IconCompatParcelizer;
            if (getcustomattributes == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelWalletSummaryDisplay");
            }
            Intent read = PrepaidTravelForeignCurrencyWalletDetailActivity.IconCompatParcelizer.read(context, autoValue_CrashlyticsReport_Session_Event_Application, getcustomattributes, arrayList);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    read = setTapText.write(activity, read).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void onDestroyView() {
        getAddress3FieldName getaddress3fieldname = this.presenter;
        if (getaddress3fieldname == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getaddress3fieldname.onDestroy();
        super.onDestroyView();
        HashMap hashMap = this.IconCompatParcelizer;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<getKernelIDDstAtop> {
        public static final write IconCompatParcelizer = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new getKernelIDDstAtop();
        }
    }

    @OnClick
    public final void navigateToNewCurrencyPage() {
        ZTBSV ztbsv = (getKernelIDDstAtop) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "planetscb_buynewcurrency");
        }
        Context context = getContext();
        if (context != null) {
            AddNewCurrencyActivity.write write2 = AddNewCurrencyActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            getAddress3FieldName getaddress3fieldname = this.presenter;
            if (getaddress3fieldname == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getCustomAttributes getcustomattributes = getaddress3fieldname.IconCompatParcelizer;
            if (getcustomattributes == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelWalletSummaryDisplay");
            }
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) getcustomattributes, "prepaidTravelWalletSummaryDisplay");
            Intent putExtra = new Intent(context, AddNewCurrencyActivity.class).putExtra("EXTRA_PREPAID_TRAVEL_WALLET_SUMMARY", getcustomattributes);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, AddNewCu…avelWalletSummaryDisplay)");
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    putExtra = setTapText.write(activity, putExtra).read();
                }
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(putExtra.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                startActivity(putExtra);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
