package com.scb.phone.view.custom.mailingaddress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.C7108xec65684e;
import p040o.QueueFile;
import p040o.onGetStartedClick;

public final class MailingAddressAccountSelectorCustomItem extends MailingAddressSelectAccountItem {
    @BindView
    public CheckBox selectorCheckBox;
    @BindView
    public LinearLayout selectorLayout;
    @BindView
    public TextView subTitle;
    @BindView
    public TextView title;
    private C7108xec65684e write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountSelectorCustomItem(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f80982131493324, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountSelectorCustomItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f80982131493324, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressAccountSelectorCustomItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f80982131493324, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.title = textView;
    }

    public final void setSubTitle(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.subTitle = textView;
    }

    public final void setSelectorCheckBox(CheckBox checkBox) {
        onGetStartedClick.write((Object) checkBox, "<set-?>");
        this.selectorCheckBox = checkBox;
    }

    public final void setSelectorLayout(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.selectorLayout = linearLayout;
    }

    public final void setListener(C7108xec65684e getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver) {
        this.write = getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver;
    }

    public final void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        QueueFile.Element element = (QueueFile.Element) builder;
        LinearLayout linearLayout = this.selectorLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectorLayout");
        }
        linearLayout.setVisibility(element.MediaBrowserCompat$CustomActionResultReceiver ? 0 : 8);
        TextView textView = this.title;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver(MessageBundle.TITLE_ENTRY);
        }
        textView.setText(element.IconCompatParcelizer);
        TextView textView2 = this.subTitle;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("subTitle");
        }
        textView2.setText(element.write);
        CheckBox checkBox = this.selectorCheckBox;
        if (checkBox == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectorCheckBox");
        }
        checkBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        CheckBox checkBox2 = this.selectorCheckBox;
        if (checkBox2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectorCheckBox");
        }
        checkBox2.setChecked(element.MediaBrowserCompat$ItemReceiver);
        CheckBox checkBox3 = this.selectorCheckBox;
        if (checkBox3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectorCheckBox");
        }
        checkBox3.setOnCheckedChangeListener(new write(this, element));
    }

    static final class write implements CompoundButton.OnCheckedChangeListener {
        private /* synthetic */ QueueFile.Element MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ MailingAddressAccountSelectorCustomItem write;

        write(MailingAddressAccountSelectorCustomItem mailingAddressAccountSelectorCustomItem, QueueFile.Element element) {
            this.write = mailingAddressAccountSelectorCustomItem;
            this.MediaBrowserCompat$CustomActionResultReceiver = element;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            MailingAddressAccountSelectorCustomItem.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.MediaBrowserCompat$CustomActionResultReceiver, z);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(MailingAddressAccountSelectorCustomItem mailingAddressAccountSelectorCustomItem, QueueFile.Element element, boolean z) {
        C7108xec65684e getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver = mailingAddressAccountSelectorCustomItem.write;
        if (getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver != null) {
            getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver.read(element, z);
        }
    }
}
