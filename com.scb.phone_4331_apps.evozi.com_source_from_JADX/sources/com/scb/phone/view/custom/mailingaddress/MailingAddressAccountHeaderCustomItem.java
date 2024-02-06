package com.scb.phone.view.custom.mailingaddress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getThreads;
import p040o.onGetStartedClick;

public final class MailingAddressAccountHeaderCustomItem extends MailingAddressSelectAccountItem {
    @BindView
    public TextView header;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountHeaderCustomItem(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84182131493644, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountHeaderCustomItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84182131493644, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountHeaderCustomItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84182131493644, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setHeader(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.header = textView;
    }

    public final void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        getThreads getthreads = (getThreads) builder;
        TextView textView = this.header;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("header");
        }
        textView.setText(getthreads.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
