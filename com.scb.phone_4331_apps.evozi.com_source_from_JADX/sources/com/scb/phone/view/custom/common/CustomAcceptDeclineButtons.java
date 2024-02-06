package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindDirectDebitInputMainFragment;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public final class CustomAcceptDeclineButtons extends LinearLayout {
    private FundFactSheetActivity<? super Boolean, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public Button btAccept;
    @BindView
    public Button btDecline;
    @BindView
    public TextView tvLabel;

    public CustomAcceptDeclineButtons(Context context) {
        this(context, (byte) 0);
    }

    public final void setBtAccept(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.btAccept = button;
    }

    public final void setBtDecline(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.btDecline = button;
    }

    public final void setTvLabel(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvLabel = textView;
    }

    public final void setOnButtonClickListener(FundFactSheetActivity<? super Boolean, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
    }

    private /* synthetic */ CustomAcceptDeclineButtons(Context context, byte b) {
        this(context, 0, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomAcceptDeclineButtons(Context context, int i, int i2) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        read(i, i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomAcceptDeclineButtons(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
        read(0, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomAcceptDeclineButtons(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
        read(0, 0);
    }

    private final void read(int i, int i2) {
        LayoutInflater.from(getContext()).inflate(R.layout.f80822131493308, this, true);
        ButterKnife.IconCompatParcelizer(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i, i2, i, i2);
        setLayoutParams(layoutParams);
        setOrientation(1);
    }

    public final void setHeaderText(String str, String str2, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        onGetStartedClick.write((Object) str, "initialString");
        onGetStartedClick.write((Object) str2, "clickableString");
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "onLinkClick");
        TextView textView = this.tvLabel;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
        }
        Resources resources = getResources();
        onGetStartedClick.IconCompatParcelizer((Object) resources, "resources");
        textView.setText(FragmentBuilder_BindDirectDebitInputMainFragment.MediaBrowserCompat$ItemReceiver(resources, str2, str, (String) null, true, 0, fundActionsSuccessActivity, 104));
        TextView textView2 = this.tvLabel;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void write(boolean z) {
        Button button = this.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        button.setSelected(z);
        Button button2 = this.btDecline;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btDecline");
        }
        button2.setSelected(!z);
        FundFactSheetActivity<? super Boolean, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fundFactSheetActivity != null) {
            fundFactSheetActivity.invoke(Boolean.valueOf(z));
        }
    }

    @OnClick
    public final void onAcceptClicked() {
        write(true);
    }

    @OnClick
    public final void onDeclineClicked() {
        write(false);
    }

    public static /* synthetic */ void setText$default(CustomAcceptDeclineButtons customAcceptDeclineButtons, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        customAcceptDeclineButtons.setText(str, str2, str3);
    }

    public final void setText(String str, String str2, String str3) {
        Button button = this.btAccept;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btAccept");
        }
        button.setText(str);
        Button button2 = this.btDecline;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btDecline");
        }
        button2.setText(str2);
        if (str3 != null) {
            TextView textView = this.tvLabel;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvLabel");
            }
            textView.setText(str3);
        }
    }
}
