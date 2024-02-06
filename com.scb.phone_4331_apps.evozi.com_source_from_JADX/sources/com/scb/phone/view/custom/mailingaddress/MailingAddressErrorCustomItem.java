package com.scb.phone.view.custom.mailingaddress;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.C7108xec65684e;
import p040o.onGetStartedClick;

public final class MailingAddressErrorCustomItem extends MailingAddressSelectAccountItem {
    /* access modifiers changed from: private */
    public C7108xec65684e IconCompatParcelizer;
    @BindView
    public ImageView reloadButton;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressErrorCustomItem(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84152131493641, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressErrorCustomItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84152131493641, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MailingAddressErrorCustomItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = getContext().getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84152131493641, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setReloadButton(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.reloadButton = imageView;
    }

    public final void setListener(C7108xec65684e getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver) {
        this.IconCompatParcelizer = getbusinessownerloanofferstatus_mediabrowsercompat_customactionresultreceiver;
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ MailingAddressErrorCustomItem MediaBrowserCompat$CustomActionResultReceiver;

        read(MailingAddressErrorCustomItem mailingAddressErrorCustomItem) {
            this.MediaBrowserCompat$CustomActionResultReceiver = mailingAddressErrorCustomItem;
        }

        public final void onClick(View view) {
            C7108xec65684e read = this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            if (read != null) {
                read.write();
            }
        }
    }

    public final void setDisplay(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        ImageView imageView = this.reloadButton;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("reloadButton");
        }
        imageView.setOnClickListener(new read(this));
    }
}
