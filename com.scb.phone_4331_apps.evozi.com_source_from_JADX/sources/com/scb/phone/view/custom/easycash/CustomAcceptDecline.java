package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.LimitService;
import p040o.enablePublishingAndFlushPending;
import p040o.loginFingerPrint;
import p040o.requestDpParams;

public class CustomAcceptDecline extends LinearLayout {
    @BindView
    TextView linkText;
    @BindView
    View navigationView;
    @BindView
    RadioButton radioAccept;
    @BindView
    RadioButton radioDecline;
    @BindView
    RadioGroup radioGroup;
    @BindView
    TextView titleTextView;

    public CustomAcceptDecline(Context context, enablePublishingAndFlushPending enablepublishingandflushpending, loginFingerPrint loginfingerprint) {
        super(context);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f80812131493307, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.titleTextView.setText(enablepublishingandflushpending.MediaBrowserCompat$CustomActionResultReceiver);
        this.linkText.setText(enablepublishingandflushpending.MediaBrowserCompat$ItemReceiver);
        this.radioGroup.clearCheck();
        this.navigationView.setOnClickListener(new requestDpParams(this, loginfingerprint, enablepublishingandflushpending));
        this.radioGroup.setOnCheckedChangeListener(new LimitService(this, loginfingerprint, enablepublishingandflushpending));
        MediaBrowserCompat$ItemReceiver();
    }

    public void setAgree(Boolean bool) {
        if (bool.booleanValue()) {
            this.radioGroup.check(R.id.radio_accept);
        } else {
            this.radioGroup.check(R.id.radio_decline);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        RadioButton radioButton = this.radioAccept;
        getResources();
        radioButton.setTextColor(-16777216);
        RadioButton radioButton2 = this.radioDecline;
        getResources();
        radioButton2.setTextColor(-16777216);
        this.radioAccept.setEnabled(true);
        this.radioDecline.setEnabled(true);
    }
}
