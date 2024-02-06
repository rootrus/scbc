package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.Scopes;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlETBManageEmailVerificationActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C6980x2ace65f3;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.access$2200;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.setJobId;
import p040o.setJobId$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setJobId$MediaBrowserCompat$ItemReceiver;
import p040o.setTabIconTint;
import p040o.setTabIconTintResource;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public class HmlVerifyEmailFragment extends BaseFragment implements C6980x2ace65f3 {
    @BindView
    Button confirmButton;
    @BindView
    TextView emailView;
    @HmlPinActivity
    public setJobId presenter;

    public static HmlVerifyEmailFragment write() {
        return new HmlVerifyEmailFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88102131494037, (ViewGroup) null, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    @OnClick
    public void send() {
        setJobId setjobid = this.presenter;
        boolean z = true;
        if (setjobid.write == setJobId.write.ENTER_VERIFICATION_CODE) {
            writeUInt64NoTag.IconCompatParcelizer read = new setJobId.read(setjobid);
            if (setjobid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                read.IconCompatParcelizer(setjobid.RatingCompat);
            }
        } else if (SystemClock.elapsedRealtime() - setjobid.MediaBrowserCompat$ItemReceiver < 60000) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = setJobId.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            if (setjobid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(setjobid.RatingCompat);
            }
        } else {
            setjobid.MediaBrowserCompat$ItemReceiver = SystemClock.elapsedRealtime();
            if (setjobid.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setjobid.RatingCompat.AlertController$RecycleListView();
            }
            setTabIconTintResource settabicontintresource = setjobid.IconCompatParcelizer;
            settabicontintresource.write(settabicontintresource.MediaBrowserCompat$CustomActionResultReceiver(), new setJobId$MediaBrowserCompat$CustomActionResultReceiver(setjobid));
        }
    }

    public void onStart() {
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setJobId setjobid = this.presenter;
        if (setjobid.RatingCompat != null) {
            setjobid.RatingCompat.AlertController$RecycleListView();
        }
        setTabIconTint settabicontint = setjobid.read;
        settabicontint.write(settabicontint.MediaBrowserCompat$ItemReceiver(), new setJobId$MediaBrowserCompat$ItemReceiver(setjobid));
        super.onStart();
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.confirmButton.setText(R.string.hml_verify_email_button);
    }

    public final void read(String str) {
        this.emailView.setText(Html.fromHtml(getString(R.string.hml_verify_email_text, str)));
    }

    public void IconCompatParcelizer(String str, String str2, String str3) {
        MediaBrowserCompat$ItemReceiver(getString(R.string.hml_manage_email_verification_sent));
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_email_verify_OTP", zsyr2kArr);
        }
        HmlETBManageEmailVerificationActivity.read read = HmlETBManageEmailVerificationActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = getContext();
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "uuid");
        onGetStartedClick.write((Object) str2, "refId");
        onGetStartedClick.write((Object) str3, Scopes.EMAIL);
        Intent intent = new Intent(context, HmlETBManageEmailVerificationActivity.class);
        intent.putExtra("EXTRA_UUID", str);
        intent.putExtra("EXTRA_REFID", str2);
        intent.putExtra("EXTRA_EMAIL", str3);
        intent.putExtra("EXTRA_FLOW", true);
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

    public final void IconCompatParcelizer(access$2200 access_2200) {
        write(access_2200);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentActivity activity = getActivity();
        String string = getString(R.string.manage_email_otp_resend_error);
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity, R.id.view_group_root, string, getoversizeimage);
        }
    }
}
