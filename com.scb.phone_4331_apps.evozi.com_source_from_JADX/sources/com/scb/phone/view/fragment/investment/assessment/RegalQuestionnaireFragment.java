package com.scb.phone.view.fragment.investment.assessment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.FundFactSheetActivity;
import com.scb.phone.view.adapter.suitabilityassessment.QuestionnaireRecyclerViewAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C6981xf382ab77;
import p040o.CheckEligibilityActivity;
import p040o.FragmentBuilder_BindChequeStatusFragment;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTBSV;
import p040o.doBackgroundInitialization;
import p040o.forEachMultiply;
import p040o.getRequest;
import p040o.getRequest$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.populateExecutionData;
import p040o.setBoxBackgroundColorResource;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class RegalQuestionnaireFragment extends BaseFragment implements C6981xf382ab77, FragmentBuilder_BindChequeStatusFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private final HmlVerifyEmailActivity IconCompatParcelizer;
    @BindView
    public Button btContinue;
    @HmlPinActivity
    public getRequest presenter;
    @BindView
    public RecyclerView rvQuestions;
    @BindView
    public TextView tvRiskSubTitle;
    @BindView
    public TextView tvRiskTitle;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public RegalQuestionnaireFragment() {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.IconCompatParcelizer = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89562131494183, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getRequest getrequest = this.presenter;
        if (getrequest == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getrequest.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        doBackgroundInitialization dobackgroundinitialization = arguments != null ? (doBackgroundInitialization) arguments.getParcelable("display") : null;
        getRequest getrequest2 = this.presenter;
        if (getrequest2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getrequest2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getrequest2.RatingCompat.AlertController$RecycleListView();
        }
        getrequest2.write = dobackgroundinitialization;
        setBoxBackgroundColorResource setboxbackgroundcolorresource = getrequest2.IconCompatParcelizer;
        setboxbackgroundcolorresource.read(setboxbackgroundcolorresource.MediaBrowserCompat$CustomActionResultReceiver.write(), new getRequest.read(getrequest2), new getRequest.write(getrequest2));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        TextView textView = this.tvRiskTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRiskTitle");
        }
        textView.setText(R.string.regal_risk_questionnaire_title);
        TextView textView2 = this.tvRiskSubTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRiskSubTitle");
        }
        textView2.setText(R.string.regal_risk_questionnaire_subtitle);
        Button button = this.btContinue;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btContinue");
        }
        button.setText(R.string.next_button);
        ZTBSV ztbsv = (forEachMultiply) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "knowledge_assessment_landing");
        }
    }

    @OnClick
    public final void continueButtonClicked() {
        getRequest getrequest = this.presenter;
        if (getrequest == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Collection arrayList = new ArrayList();
        for (Object next : getrequest.MediaBrowserCompat$ItemReceiver) {
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (String) next, (Object) "2")) {
                arrayList.add(next);
            }
        }
        int size = ((List) arrayList).size();
        boolean z = true;
        if (size > 0) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getRequest$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            if (getrequest.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(getrequest.RatingCompat);
                return;
            }
            return;
        }
        getrequest.IconCompatParcelizer();
    }

    public final void IconCompatParcelizer(populateExecutionData populateexecutiondata) {
        onGetStartedClick.write((Object) populateexecutiondata, "display");
        RecyclerView recyclerView = this.rvQuestions;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvQuestions");
        }
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = this.rvQuestions;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvQuestions");
        }
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.rvQuestions;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvQuestions");
        }
        recyclerView3.setAdapter(new QuestionnaireRecyclerViewAdapter(populateexecutiondata, this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.btContinue;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btContinue");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(populateExecutionData populateexecutiondata) {
        if (populateexecutiondata != null) {
            getRequest getrequest = this.presenter;
            if (getrequest == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getrequest.MediaBrowserCompat$ItemReceiver(populateexecutiondata);
        }
    }

    public final void IconCompatParcelizer() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.regal_risk_waring_title).IconCompatParcelizer((int) R.string.regal_risk_waring_message);
        CustomDialog IconCompatParcelizer3 = IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.confirm), new read(this));
        IconCompatParcelizer3.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer3.read.getString(R.string.cancel), RegalQuestionnaireFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver).show();
    }

    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ RegalQuestionnaireFragment write;

        read(RegalQuestionnaireFragment regalQuestionnaireFragment) {
            this.write = regalQuestionnaireFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            getRequest getrequest = this.write.presenter;
            if (getrequest == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            getrequest.IconCompatParcelizer();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle arguments = getArguments();
        String str = null;
        doBackgroundInitialization dobackgroundinitialization = arguments != null ? (doBackgroundInitialization) arguments.getParcelable("display") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str = arguments2.getString("EXTRA_EVENT_NAME", "");
        }
        if (dobackgroundinitialization != null) {
            Intent MediaBrowserCompat$ItemReceiver = FundFactSheetActivity.MediaBrowserCompat$ItemReceiver(getContext(), dobackgroundinitialization.write(), dobackgroundinitialization, str);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(MediaBrowserCompat$ItemReceiver, 1331);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void onDestroy() {
        getRequest getrequest = this.presenter;
        if (getrequest == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getrequest.onDestroy();
        super.onDestroy();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        FragmentActivity activity;
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("REVIEW_IS_ERROR", false);
        }
        if (i == 1331 && i2 == 0 && z && (activity = getActivity()) != null) {
            activity.finish();
        }
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachMultiply> {
        public static final write read = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachMultiply();
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "json");
        ((forEachMultiply) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).read(str);
        ZTBSV ztbsv = (forEachMultiply) this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        if (getActivity() != null) {
            ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "knowledge_assessment_submit");
        }
    }
}
