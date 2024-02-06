package com.scb.phone.view.fragment.remittance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.remittance.RemittanceInputActivity;
import com.scb.phone.view.activity.remittance.RemittanceOtpActivity;
import com.scb.phone.view.activity.remittance.RemittanceSuccessActivity;
import com.scb.phone.view.activity.remittance.RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C5019nR;
import p040o.HmlPinActivity;
import p040o.Lists;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ServerProjectProvider;
import p040o.nR$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setAllowCollapse;
import p040o.setImportance;
import p040o.setOverflowCount;
import p040o.setTapText;

public final class RemittanceReviewFragment extends BaseRemittanceDetailsFragment implements ServerProjectProvider.C70717 {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    private setImportance IconCompatParcelizer;
    @HmlPinActivity
    public C5019nR presenter;
    @BindView
    public TextView tvRemittanceRemarkMessage;
    @BindView
    public TextView tvRemittanceRemarkMessageMore;
    @BindView
    public TextView tvRemittanceRemarkMessageRejected;

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90242131494251, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C5019nR nRVar = this.presenter;
        if (nRVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nRVar.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            setImportance setimportance = (setImportance) arguments.getParcelable("EXTRA_REVIEW_REMITTANCE_DISPLAY");
            this.IconCompatParcelizer = setimportance;
            if (setimportance != null) {
                setOverflowCount setoverflowcount = setimportance.read;
                write().setVisibility(0);
                write().setSourceName(setoverflowcount.MediaBrowserCompat$CustomActionResultReceiver);
                CustomTransferAndPaySource write = write();
                if (setoverflowcount.write.length() > 0) {
                    str = setoverflowcount.write;
                } else {
                    str = setoverflowcount.read;
                }
                write.setAccountNumber(str);
                CustomTransferAndPaySource write2 = write();
                String str2 = setoverflowcount.MediaBrowserCompat$ItemReceiver;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                write2.setAvatar(str2);
                MediaBrowserCompat$CustomActionResultReceiver().setVisibility(0);
                MediaBrowserCompat$CustomActionResultReceiver().setTargetName(setimportance.write.read);
                MediaBrowserCompat$CustomActionResultReceiver().setReferenceNumbers(setimportance.write.IconCompatParcelizer);
                MediaBrowserCompat$CustomActionResultReceiver().setReferenceNo1(setimportance.write.write);
                CustomTransferAndPayTarget MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver();
                String str4 = setimportance.write.MediaBrowserCompat$CustomActionResultReceiver;
                if (str4 != null) {
                    str3 = str4;
                }
                MediaBrowserCompat$CustomActionResultReceiver2.setAvatar(str3, R.drawable.bankicon_remittance);
                String str5 = setimportance.MediaMetadataCompat;
                if (str5 != null && !TextUtils.isEmpty(str5)) {
                    MediaBrowserCompat$CustomActionResultReceiver().setFavoriteName(str5);
                }
                write(setimportance);
            }
        }
        TextView textView = this.tvRemittanceRemarkMessage;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemittanceRemarkMessage");
        }
        textView.setText(setAllowCollapse.write(getString(R.string.remittance_review_disclaimer_message), 0));
        TextView textView2 = this.tvRemittanceRemarkMessageMore;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemittanceRemarkMessageMore");
        }
        textView2.setText(setAllowCollapse.write(getString(R.string.remittance_review_disclaimer_message_more), 0));
        TextView textView3 = this.tvRemittanceRemarkMessageRejected;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRemittanceRemarkMessageRejected");
        }
        textView3.setText(setAllowCollapse.write(getString(R.string.remittance_review_disclaimer_message_rejected), 0));
    }

    @OnClick
    public final void onConfirmClicked() {
        setImportance setimportance = this.IconCompatParcelizer;
        if (setimportance != null) {
            C5019nR nRVar = this.presenter;
            if (nRVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) setimportance, "reviewDisplay");
            if (nRVar.RatingCompat != null) {
                nRVar.RatingCompat.AlertController$RecycleListView();
            }
            Lists.TransformingSequentialList.C35951 r3 = nRVar.read;
            String str = setimportance.PlaybackStateCompat$CustomAction;
            if (str == null) {
                str = "";
            }
            r3.read(str, (String) null, (String) null, new C5019nR.IconCompatParcelizer(nRVar, setimportance), new nR$MediaBrowserCompat$CustomActionResultReceiver(nRVar));
        }
    }

    public final void IconCompatParcelizer(setImportance setimportance) {
        onGetStartedClick.write((Object) setimportance, "successDisplay");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver remittanceSuccessActivity$MediaBrowserCompat$ItemReceiver = RemittanceSuccessActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) activity, "it");
            Intent read = RemittanceSuccessActivity$MediaBrowserCompat$ItemReceiver.read(activity, setimportance);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    read = setTapText.write(activity2, read).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            RemittanceOtpActivity.IconCompatParcelizer iconCompatParcelizer = RemittanceOtpActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) activity, "it");
            Context context = activity;
            setImportance setimportance = this.IconCompatParcelizer;
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, RemittanceOtpActivity.class);
            intent.putExtra("EXTRA_REVIEW_DISPLAY", setimportance);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            activity.finish();
        }
    }

    public final void read() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            RemittanceInputActivity.read read = RemittanceInputActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) activity, "it");
            Context context = activity;
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, RemittanceInputActivity.class);
            intent.setFlags(603979776);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    intent = setTapText.write(activity2, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void onDestroyView() {
        C5019nR nRVar = this.presenter;
        if (nRVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nRVar.onDestroy();
        super.onDestroyView();
    }
}
