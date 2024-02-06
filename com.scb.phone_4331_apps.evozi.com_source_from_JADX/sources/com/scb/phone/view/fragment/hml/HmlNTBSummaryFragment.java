package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlNTBPersonalInfoActivity;
import com.scb.phone.view.activity.hml.HmlSetNTBPinActivity;
import com.scb.phone.view.activity.hml.NTBPinLoginActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzct;

public final class HmlNTBSummaryFragment extends HmlSummaryFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);
    @BindView
    public TextView step2Desc;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void IconCompatParcelizer(zzct.zza zza) {
        onGetStartedClick.write((Object) zza, "flowType");
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "ntb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_simulator_summary", zsyr2kArr);
        }
        Intent IconCompatParcelizer2 = HmlNTBPersonalInfoActivity.IconCompatParcelizer(getContext());
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

    public final void read() {
        NTBPinLoginActivity.IconCompatParcelizer iconCompatParcelizer = NTBPinLoginActivity.MediaDescriptionCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, NTBPinLoginActivity.class);
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
            startActivityForResult(intent, 8866);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write() {
        HmlSetNTBPinActivity.read read = HmlSetNTBPinActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlSetNTBPinActivity.class);
        intent.setFlags(1073741824);
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

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            Intent IconCompatParcelizer2 = HmlNTBPersonalInfoActivity.IconCompatParcelizer(getContext());
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

    public final void IconCompatParcelizer() {
        TextView textView = this.step2Text;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Text");
        }
        textView.setText(getResources().getText(R.string.hml_summary_step_2));
        TextView textView2 = this.step2Desc;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Desc");
        }
        textView2.setText(getResources().getText(R.string.hml_summary_step_2_description));
        TextView textView3 = this.step2Desc;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Desc");
        }
        textView3.setVisibility(0);
        ImageView imageView = this.step2Image;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Image");
        }
        imageView.setImageResource(R.drawable.ic_verify_identify_step);
        ImageView imageView2 = this.step3Image;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step3Image");
        }
        imageView2.setImageResource(R.drawable.ic_occupation_step);
    }
}
