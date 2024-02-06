package p040o;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;
import p040o.CrashlyticsController;

/* renamed from: o.getChequeStatusIssueDetail */
public final class getChequeStatusIssueDetail extends HmlCommonCustomDialog {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getChequeStatusIssueDetail(Context context, CrashlyticsController.BlockingCrashEventListener blockingCrashEventListener, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity2) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) blockingCrashEventListener, "display");
        IconCompatParcelizer(getContext().getString(R.string.auto_quick_analysis_error_header));
        read(getContext().getString(R.string.auto_quick_analysis_error_description));
        TextView textView = this.messageText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("messageText");
        }
        textView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f65972131099752));
        MediaBrowserCompat$ItemReceiver(getContext().getString(R.string.auto_quick_analysis_error_retake), fundActionsSuccessActivity);
        write(getContext().getString(R.string.auto_quick_analysis_error_proceed), fundActionsSuccessActivity2);
        setCancelable(false);
        View inflate = getLayoutInflater().inflate(R.layout.f91712131494398, (ViewGroup) null);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "layoutInflater.inflate(layoutId, null)");
        onGetStartedClick.write((Object) inflate, Promotion.ACTION_VIEW);
        LinearLayout linearLayout = this.rootView;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rootView");
        }
        linearLayout.addView(inflate, 3);
        boolean z = blockingCrashEventListener.write;
        View findViewById = inflate.findViewById(R.id.iv_analysis_bg);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById, "view.findViewById(R.id.iv_analysis_bg)");
        ImageView imageView = (ImageView) findViewById;
        int i = R.drawable.ic_success;
        imageView.setImageResource(z ? R.drawable.ic_success : R.drawable.ic_clear);
        boolean z2 = blockingCrashEventListener.MediaBrowserCompat$CustomActionResultReceiver;
        View findViewById2 = inflate.findViewById(R.id.iv_analysis_light);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById2, "view.findViewById(R.id.iv_analysis_light)");
        ((ImageView) findViewById2).setImageResource(z2 ? R.drawable.ic_success : R.drawable.ic_clear);
        boolean z3 = blockingCrashEventListener.read;
        View findViewById3 = inflate.findViewById(R.id.iv_analysis_corners);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById3, "view.findViewById(R.id.iv_analysis_corners)");
        ((ImageView) findViewById3).setImageResource(!z3 ? R.drawable.ic_clear : i);
    }
}
