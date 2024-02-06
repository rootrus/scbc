package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.createId;
import p040o.onGetStartedClick;
import p040o.onMessageTriggered;
import p040o.setTapText;

public final class StatementChannelSuccessfulFragment extends BaseFragment {
    public static final C5872x4f5c74fa MediaBrowserCompat$CustomActionResultReceiver = new C5872x4f5c74fa((byte) 0);
    private onMessageTriggered IconCompatParcelizer;
    @BindView
    public Button btnDone;
    @BindView
    public TextView tvAddressOrEmail;
    @BindView
    public TextView tvAddressTitle;
    @BindView
    public TextView tvDateTime;
    @BindView
    public TextView tvMaskCardNo;
    @BindView
    public TextView tvSuccessTitle;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.f89992131494226, viewGroup, false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.IconCompatParcelizer = (onMessageTriggered) arguments.getParcelable("EXTRA_CHANGE_CHANNEL_SUCCESS_DISPLAY_KEY");
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        CharSequence charSequence;
        String str3;
        String str4;
        String str5;
        String str6;
        List<String> list;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ButterKnife.IconCompatParcelizer(this, view);
        TextView textView = this.tvMaskCardNo;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvMaskCardNo");
        }
        onMessageTriggered onmessagetriggered = this.IconCompatParcelizer;
        String str7 = null;
        if (onmessagetriggered == null || (list = onmessagetriggered.write) == null) {
            str = null;
        } else {
            str = AlertController$RecycleListView.write(list, "\n");
        }
        textView.setText(str);
        TextView textView2 = this.tvAddressOrEmail;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddressOrEmail");
        }
        onMessageTriggered onmessagetriggered2 = this.IconCompatParcelizer;
        if (onmessagetriggered2 != null) {
            str2 = onmessagetriggered2.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str2 = null;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str2, (Object) createId.EMAIL.name())) {
            onMessageTriggered onmessagetriggered3 = this.IconCompatParcelizer;
            if (onmessagetriggered3 != null) {
                str6 = onmessagetriggered3.read;
            } else {
                str6 = null;
            }
            charSequence = str6;
        } else {
            onMessageTriggered onmessagetriggered4 = this.IconCompatParcelizer;
            if (onmessagetriggered4 != null) {
                str5 = onmessagetriggered4.MediaBrowserCompat$ItemReceiver;
            } else {
                str5 = null;
            }
            charSequence = str5;
        }
        textView2.setText(charSequence);
        TextView textView3 = this.tvAddressTitle;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvAddressTitle");
        }
        onMessageTriggered onmessagetriggered5 = this.IconCompatParcelizer;
        if (onmessagetriggered5 != null) {
            str3 = onmessagetriggered5.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str3 = null;
        }
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) createId.EMAIL.name())) {
            str4 = getString(R.string.ccm_email_address);
        } else {
            str4 = getString(R.string.mailing_address);
        }
        onGetStartedClick.IconCompatParcelizer((Object) str4, "when (changeChannelSucce…ng.mailing_address)\n    }");
        textView3.setText(str4);
        TextView textView4 = this.tvDateTime;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvDateTime");
        }
        onMessageTriggered onmessagetriggered6 = this.IconCompatParcelizer;
        if (onmessagetriggered6 != null) {
            str7 = onmessagetriggered6.IconCompatParcelizer;
        }
        textView4.setText(str7);
        TextView textView5 = this.tvSuccessTitle;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSuccessTitle");
        }
        String string = getString(R.string.successfully_changed_statement_channel);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.succe…hanged_statement_channel)");
        textView5.setText(string);
        ZSYR2K[] zsyr2kArr = new ZSYR2K[0];
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("change_stmt_channel_successful", zsyr2kArr);
        }
    }

    @OnClick
    public final void onClickDoneButton() {
        Context context = getContext();
        if (context != null) {
            Intent intent = new Intent(context, CreditCardDetailActivity.class);
            intent.setFlags(603979776);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context, intent).read();
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
    }
}
