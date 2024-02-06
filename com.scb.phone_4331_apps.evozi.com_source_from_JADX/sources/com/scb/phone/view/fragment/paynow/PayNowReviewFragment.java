package com.scb.phone.view.fragment.paynow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.paynow.PayNowSuccessActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AutoValue_CrashlyticsReport_Session_Application;
import p040o.C4339eH;
import p040o.Functions;
import p040o.HashBasedTable;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.setUser;
import p040o.standardStartAndWait;

public final class PayNowReviewFragment extends BaseFragment implements ServerProjectProvider.C70729.write {
    public static final C6116x87d6f0a3 IconCompatParcelizer = new C6116x87d6f0a3((byte) 0);
    private AutoValue_CrashlyticsReport_Session_Application.Builder MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public CustomTransferAndPaySource accountSource;
    @BindView
    public CustomTransferAndPayTarget accountTarget;
    @BindView
    public TextView amountToGet;
    @BindView
    public LinearLayout amountToGetLayout;
    @BindView
    public TextView amountToSend;
    @BindView
    public LinearLayout amountToSendLayout;
    @BindView
    public CustomTransferAndPayItem conversionRate;
    @BindView
    public TextView fee;
    @BindView
    public LinearLayout feeLayout;
    @BindView
    public CustomNoteItem note;
    @HmlPinActivity
    public C4339eH presenter;
    @BindView
    public ThaiTextView remark;
    @BindView
    public CustomNoteItem transactionDetails;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f88852131494112, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MediaBrowserCompat$CustomActionResultReceiver(this, view);
        C4339eH eHVar = this.presenter;
        if (eHVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eHVar.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            AutoValue_CrashlyticsReport_Session_Application.Builder builder = (AutoValue_CrashlyticsReport_Session_Application.Builder) arguments.getParcelable("EXTRA_REVIEW_REMITTANCE_DISPLAY");
            this.MediaBrowserCompat$CustomActionResultReceiver = builder;
            if (builder != null) {
                setUser setuser = builder.IconCompatParcelizer;
                CustomTransferAndPaySource customTransferAndPaySource = this.accountSource;
                if (customTransferAndPaySource == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountSource");
                }
                customTransferAndPaySource.setVisibility(0);
                customTransferAndPaySource.setSourceName(setuser.IconCompatParcelizer);
                customTransferAndPaySource.setAccountNumber(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(setuser.MediaBrowserCompat$CustomActionResultReceiver, false));
                customTransferAndPaySource.setAvatar(setuser.read, R.drawable.bankicon_remittance);
                CustomTransferAndPayTarget customTransferAndPayTarget = this.accountTarget;
                if (customTransferAndPayTarget == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("accountTarget");
                }
                customTransferAndPayTarget.setVisibility(0);
                customTransferAndPayTarget.setTargetName(builder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
                customTransferAndPayTarget.setReferenceNumbers(builder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver);
                customTransferAndPayTarget.setAvatar(builder.MediaBrowserCompat$CustomActionResultReceiver.read, R.drawable.bankicon_remittance);
                CustomTransferAndPayItem customTransferAndPayItem = this.conversionRate;
                if (customTransferAndPayItem == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("conversionRate");
                }
                String str = builder.write;
                if (!TextUtils.isEmpty(str)) {
                    customTransferAndPayItem.setVisibility(0);
                    customTransferAndPayItem.setValue(str);
                }
                LinearLayout linearLayout = this.amountToSendLayout;
                if (linearLayout == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountToSendLayout");
                }
                TextView textView = this.amountToSend;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountToSend");
                }
                CharSequence charSequence = builder.MediaBrowserCompat$ItemReceiver;
                if (!TextUtils.isEmpty(charSequence)) {
                    linearLayout.setVisibility(0);
                    textView.setText(charSequence);
                }
                LinearLayout linearLayout2 = this.amountToGetLayout;
                if (linearLayout2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountToGetLayout");
                }
                TextView textView2 = this.amountToGet;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("amountToGet");
                }
                CharSequence charSequence2 = builder.read;
                if (!TextUtils.isEmpty(charSequence2)) {
                    linearLayout2.setVisibility(0);
                    textView2.setText(charSequence2);
                }
                LinearLayout linearLayout3 = this.feeLayout;
                if (linearLayout3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("feeLayout");
                }
                TextView textView3 = this.fee;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("fee");
                }
                CharSequence charSequence3 = builder.MediaMetadataCompat;
                if (!TextUtils.isEmpty(charSequence3)) {
                    linearLayout3.setVisibility(0);
                    textView3.setText(charSequence3);
                }
                CustomNoteItem customNoteItem = this.transactionDetails;
                if (customNoteItem == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionDetails");
                }
                IconCompatParcelizer(customNoteItem, R.string.remittance_recipient_purpose_input_title, builder.RatingCompat);
                CustomNoteItem customNoteItem2 = this.transactionDetails;
                if (customNoteItem2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionDetails");
                }
                customNoteItem2.topSpace.setVisibility(0);
                CustomNoteItem customNoteItem3 = this.transactionDetails;
                if (customNoteItem3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("transactionDetails");
                }
                customNoteItem3.setFullDivider(false);
                CustomNoteItem customNoteItem4 = this.note;
                if (customNoteItem4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("note");
                }
                IconCompatParcelizer(customNoteItem4, R.string.remittance_review_note, builder.MediaDescriptionCompat);
                ThaiTextView thaiTextView = this.remark;
                if (thaiTextView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("remark");
                }
                thaiTextView.setText(builder.MediaBrowserCompat$MediaItem);
            }
        }
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("outward_remittance_pp_review");
        }
    }

    @OnClick
    public final void onConfirmClicked() {
        AutoValue_CrashlyticsReport_Session_Application.Builder builder = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (builder != null) {
            C4339eH eHVar = this.presenter;
            if (eHVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) builder, "payNowReviewDisplay");
            if (eHVar.RatingCompat != null) {
                eHVar.RatingCompat.AlertController$RecycleListView();
            }
            eHVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new C4339eH.IconCompatParcelizer(eHVar, builder), new Functions.PredicateFunction.IconCompatParcelizer(new HashBasedTable(builder.MediaBrowserCompat$SearchResultReceiver)), eHVar.IconCompatParcelizer);
        }
    }

    private final void IconCompatParcelizer(CustomNoteItem customNoteItem, int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            customNoteItem.setVisibility(0);
            customNoteItem.setTitle(getString(i));
            customNoteItem.setText(str);
            customNoteItem.divider.setVisibility(0);
        }
    }

    public final void read(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successDisplay");
        Context context = getContext();
        if (context != null) {
            PayNowSuccessActivity.IconCompatParcelizer iconCompatParcelizer = PayNowSuccessActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "this");
            Intent read = PayNowSuccessActivity.IconCompatParcelizer.read(context, standardstartandwait);
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(context, read).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(0);
            activity.finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.setResult(-1);
            activity.finish();
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
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer2.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(IconCompatParcelizer2);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SplashActivity.IconCompatParcelizer(activity);
        }
    }

    public final void onDestroyView() {
        C4339eH eHVar = this.presenter;
        if (eHVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eHVar.onDestroy();
        super.onDestroyView();
    }
}
