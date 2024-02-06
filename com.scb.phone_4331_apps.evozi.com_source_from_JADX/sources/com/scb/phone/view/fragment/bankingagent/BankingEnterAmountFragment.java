package com.scb.phone.view.fragment.bankingagent;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.bankingagent.BankingAgentReviewActivity;
import com.scb.phone.view.activity.bankingagent.BankingAgentTCActivity;
import com.scb.phone.view.adapter.bankingagent.BankingDepositAdapter;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.fragment.bankingagent.BankingAgentSelectedFragment;
import com.scb.phone.view.fragment.bankingagent.BaseBankingAgentsFragment;
import com.scb.phone.view.fragment.transferandpay.BaseReplaceableFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.Collection;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;
import p040o.AndroidApplication;
import p040o.C5231xd1ef4da1;
import p040o.C5236xbe0b49ba;
import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MoreExecutors;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYMM;
import p040o.ZTBSV;
import p040o.checkNonnegative;
import p040o.getExitingScheduledExecutorService;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.requestWasSuccessful;
import p040o.requestWasSuccessful$MediaBrowserCompat$ItemReceiver;
import p040o.sameThreadExecutor;
import p040o.setTapText;
import p040o.writeUInt64NoTag;
import p059me.relex.circleindicator.CircleIndicator;

public final class BankingEnterAmountFragment extends BaseReplaceableFragment implements CheckCaptureModule_GetExtractionParametersFactory.read, BaseBankingAgentsFragment.write, C5855x4f7ba9d7 {
    public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer((byte) 0);
    private BankingDepositAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public CircleIndicator accountsIndicator;
    @BindView
    public NoSwipeViewPager accountsViewPager;
    @BindView
    public LinearLayout agentLayout;
    @HmlPinActivity
    public requestWasSuccessful presenter;
    @BindView
    public Button reviewButton;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public BankingEnterAmountFragment() {
        FundActionsSuccessActivity read2 = new read(this);
        onGetStartedClick.write((Object) read2, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(read2);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String string;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86652131493892, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        C5857x430481b1 bankingAgentsFragment$MediaBrowserCompat$CustomActionResultReceiver = BankingAgentsFragment.IconCompatParcelizer;
        Bundle arguments = getArguments();
        String str2 = "D";
        if (!(arguments == null || (string = arguments.getString("com.scb.phone.EXTRA_POSTING_TYPE", str2)) == null)) {
            str2 = string;
        }
        read(C5857x430481b1.MediaBrowserCompat$CustomActionResultReceiver(str2), R.id.fragment_container_banking_agent, "com.scb.phone.BANKING_AGENT_ENTER_AMOUNT_CONTAINER_TAG", false);
        Button button = this.reviewButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewButton");
        }
        button.setOnClickListener(new C5858xf158e7(this));
        Context context = getContext();
        if (context == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) context, "context!!");
        BankingDepositAdapter bankingDepositAdapter = new BankingDepositAdapter(context, new write(this));
        this.MediaBrowserCompat$CustomActionResultReceiver = bankingDepositAdapter;
        NoSwipeViewPager noSwipeViewPager = this.accountsViewPager;
        if (noSwipeViewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountsViewPager");
        }
        ViewPager viewPager = noSwipeViewPager;
        bankingDepositAdapter.IconCompatParcelizer = viewPager;
        if (viewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        viewPager.setAdapter(bankingDepositAdapter);
        viewPager.addOnPageChangeListener(bankingDepositAdapter.read);
        requestWasSuccessful requestwassuccessful = this.presenter;
        if (requestwassuccessful == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        requestwassuccessful.MediaBrowserCompat$ItemReceiver(this);
        requestWasSuccessful requestwassuccessful2 = this.presenter;
        if (requestwassuccessful2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (str = arguments2.getString("com.scb.phone.EXTRA_POSTING_TYPE")) == null) {
            str = "";
        }
        onGetStartedClick.write((Object) str, "postingType");
        requestwassuccessful2.read = str;
        if (requestwassuccessful2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            requestwassuccessful2.RatingCompat.AlertController$RecycleListView();
        }
        checkNonnegative checknonnegative = requestwassuccessful2.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity read2 = new requestWasSuccessful.read(requestwassuccessful2);
        FundFactSheetActivity requestwassuccessful_mediabrowsercompat_customactionresultreceiver = new C5231xd1ef4da1(requestwassuccessful2);
        onGetStartedClick.write((Object) read2, "onSuccess");
        onGetStartedClick.write((Object) requestwassuccessful_mediabrowsercompat_customactionresultreceiver, "onError");
        checknonnegative.IconCompatParcelizer(checknonnegative.read, read2, requestwassuccessful_mediabrowsercompat_customactionresultreceiver, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver());
        requestwassuccessful2.IconCompatParcelizer();
        ZSYMM zsymm = (ZSYMM) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (zsymm != null) {
            ZTBSV ztbsv = zsymm;
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "bankingagent_input");
            }
        }
        return inflate;
    }

    public static final class write implements AndroidApplication.read<MoreExecutors.C36611> {
        private /* synthetic */ BankingEnterAmountFragment read;

        write(BankingEnterAmountFragment bankingEnterAmountFragment) {
            this.read = bankingEnterAmountFragment;
        }

        public final /* synthetic */ void read(Object obj) {
            MoreExecutors.C36611 r3 = (MoreExecutors.C36611) obj;
            onGetStartedClick.write((Object) r3, "item");
            requestWasSuccessful requestwassuccessful = this.read.presenter;
            if (requestwassuccessful == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) r3, "accountDisplay");
            requestwassuccessful.IconCompatParcelizer = r3;
            writeUInt64NoTag.IconCompatParcelizer requestwassuccessful_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C5236xbe0b49ba(requestwassuccessful);
            if (requestwassuccessful.RatingCompat != null) {
                requestwassuccessful_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver.IconCompatParcelizer(requestwassuccessful.RatingCompat);
            }
        }

        public final void IconCompatParcelizer() {
            requestWasSuccessful requestwassuccessful = this.read.presenter;
            if (requestwassuccessful == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            requestwassuccessful.IconCompatParcelizer();
        }
    }

    public final void onDestroy() {
        requestWasSuccessful requestwassuccessful = this.presenter;
        if (requestwassuccessful == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        requestwassuccessful.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(sameThreadExecutor samethreadexecutor) {
        onGetStartedClick.write((Object) samethreadexecutor, "bankingAgentDisplay");
        requestWasSuccessful requestwassuccessful = this.presenter;
        if (requestwassuccessful == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) samethreadexecutor, "bankingAgentDisplay");
        requestwassuccessful.MediaDescriptionCompat = samethreadexecutor;
        writeUInt64NoTag.IconCompatParcelizer write2 = new requestWasSuccessful.write(requestwassuccessful, samethreadexecutor);
        boolean z = true;
        if (requestwassuccessful.RatingCompat != null) {
            write2.IconCompatParcelizer(requestwassuccessful.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer requestwassuccessful_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C5236xbe0b49ba(requestwassuccessful);
        if (requestwassuccessful.RatingCompat == null) {
            z = false;
        }
        if (z) {
            requestwassuccessful_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver.IconCompatParcelizer(requestwassuccessful.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, sameThreadExecutor samethreadexecutor) {
        onGetStartedClick.write((Object) str, "postingType");
        onGetStartedClick.write((Object) samethreadexecutor, "bankingAgentDisplay");
        BankingAgentSelectedFragment.write write2 = BankingAgentSelectedFragment.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "postingType");
        onGetStartedClick.write((Object) samethreadexecutor, "bankingAgent");
        BankingAgentSelectedFragment bankingAgentSelectedFragment = new BankingAgentSelectedFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_BANKING_AGENT_TAG", samethreadexecutor);
        bundle.putString("com.scb.phone.EXTRA_POSTING_TYPE", str);
        bankingAgentSelectedFragment.setArguments(bundle);
        read(bankingAgentSelectedFragment, R.id.fragment_container_banking_agent, "com.scb.phone.BANKING_AGENT_ENTER_AMOUNT_CONTAINER_TAG", false, true);
    }

    public final void MediaMetadataCompat() {
        requestWasSuccessful requestwassuccessful = this.presenter;
        if (requestwassuccessful == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (requestwassuccessful.MediaDescriptionCompat != null) {
            requestwassuccessful.write = -1.0d;
            requestwassuccessful.MediaDescriptionCompat = null;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = requestWasSuccessful$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (requestwassuccessful.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(requestwassuccessful.RatingCompat);
            }
        }
    }

    public final void read() {
        String string;
        C5857x430481b1 bankingAgentsFragment$MediaBrowserCompat$CustomActionResultReceiver = BankingAgentsFragment.IconCompatParcelizer;
        Bundle arguments = getArguments();
        String str = "D";
        if (!(arguments == null || (string = arguments.getString("com.scb.phone.EXTRA_POSTING_TYPE", str)) == null)) {
            str = string;
        }
        read(C5857x430481b1.MediaBrowserCompat$CustomActionResultReceiver(str), R.id.fragment_container_banking_agent, "com.scb.phone.BANKING_AGENT_ENTER_AMOUNT_CONTAINER_TAG", false, true);
        PlaybackStateCompat$CustomAction();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.reviewButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewButton");
        }
        button.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Context context = getContext();
        if (context != null) {
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, BankingAgentTCActivity.class);
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
                startActivityForResult(intent, EACTags.SECURITY_ENVIRONMENT_TEMPLATE);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer(getExitingScheduledExecutorService getexitingscheduledexecutorservice) {
        onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "reviewDisplay");
        Context context = getContext();
        if (context != null) {
            BankingAgentReviewActivity.IconCompatParcelizer iconCompatParcelizer = BankingAgentReviewActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) getexitingscheduledexecutorservice, "display");
            Intent intent = new Intent(context, BankingAgentReviewActivity.class);
            intent.putExtra("BANKING_AGENT_REVIEW_DISPLAY", getexitingscheduledexecutorservice);
            intent.putExtra("banking_agent_bundle", (ZSYMM) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write(double d) {
        requestWasSuccessful requestwassuccessful = this.presenter;
        if (requestwassuccessful == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        requestwassuccessful.write = d;
        writeUInt64NoTag.IconCompatParcelizer requestwassuccessful_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C5236xbe0b49ba(requestwassuccessful);
        if (requestwassuccessful.RatingCompat != null) {
            requestwassuccessful_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver.IconCompatParcelizer(requestwassuccessful.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        Button button = this.reviewButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reviewButton");
        }
        button.setEnabled(z);
    }

    public final void read(boolean z) {
        BankingDepositAdapter bankingDepositAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bankingDepositAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountsAdapter");
        }
        bankingDepositAdapter.MediaBrowserCompat$CustomActionResultReceiver = z;
        bankingDepositAdapter.notifyDataSetChanged();
    }

    public final void read(List<MoreExecutors.C36611> list) {
        onGetStartedClick.write((Object) list, "accounts");
        CircleIndicator circleIndicator = this.accountsIndicator;
        if (circleIndicator == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountsIndicator");
        }
        int size = list.size();
        circleIndicator.setVisibility((size <= 0 || 9 < size) ? 8 : 0);
        BankingDepositAdapter bankingDepositAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bankingDepositAdapter == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountsAdapter");
        }
        bankingDepositAdapter.MediaBrowserCompat$ItemReceiver = list;
        bankingDepositAdapter.notifyDataSetChanged();
        Collection collection = list;
        if (!(collection == null || collection.isEmpty())) {
            ViewPager viewPager = bankingDepositAdapter.IconCompatParcelizer;
            if (viewPager != null) {
                viewPager.setClipToPadding(false);
            }
            Resources resources = bankingDepositAdapter.write.getResources();
            int dimensionPixelOffset = resources != null ? resources.getDimensionPixelOffset(R.dimen.f75502131166019) : 0;
            ViewPager viewPager2 = bankingDepositAdapter.IconCompatParcelizer;
            if (viewPager2 != null) {
                viewPager2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            }
            bankingDepositAdapter.read.onPageSelected(0);
        }
        CircleIndicator circleIndicator2 = this.accountsIndicator;
        if (circleIndicator2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountsIndicator");
        }
        NoSwipeViewPager noSwipeViewPager = this.accountsViewPager;
        if (noSwipeViewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountsViewPager");
        }
        circleIndicator2.setViewPager(noSwipeViewPager);
    }

    public final void write() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void IconCompatParcelizer() {
        Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer(getContext());
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
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        LinearLayout linearLayout = this.agentLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("agentLayout");
        }
        linearLayout.setVisibility(8);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 123 && i2 == 0) {
            requestWasSuccessful requestwassuccessful = this.presenter;
            if (requestwassuccessful == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = requestWasSuccessful.MediaMetadataCompat.read;
            if (requestwassuccessful.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(requestwassuccessful.RatingCompat);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<ZSYMM> {
        private /* synthetic */ BankingEnterAmountFragment MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(BankingEnterAmountFragment bankingEnterAmountFragment) {
            super(0);
            this.MediaBrowserCompat$CustomActionResultReceiver = bankingEnterAmountFragment;
        }

        public final /* synthetic */ Object invoke() {
            Bundle arguments = this.MediaBrowserCompat$CustomActionResultReceiver.getArguments();
            if (arguments != null) {
                return (ZSYMM) arguments.getParcelable("banking_agent_bundle");
            }
            return null;
        }
    }
}
