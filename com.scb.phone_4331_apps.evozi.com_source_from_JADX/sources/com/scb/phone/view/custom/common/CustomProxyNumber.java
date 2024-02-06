package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ScbEditText;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindChubbPaySuccessFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getICheckDeserializerRtti;
import p040o.getRegistrations;
import p040o.getSourceFundTypes;
import p040o.parseNdkPayload;
import p040o.removeIfFromRandomAccessList;
import p040o.reportFromJson;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class CustomProxyNumber extends RelativeLayout {
    /* access modifiers changed from: private */
    public String IconCompatParcelizer = "";
    public FragmentBuilder_BindChubbPaySuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    public write MediaBrowserCompat$ItemReceiver;
    @BindView
    protected ImageButton buttonContacts;
    @BindView
    protected TextView mErrorValidation;
    @BindView
    TextView proxyLabel;
    @BindView
    public ScbEditText proxyNumberField;
    public String write;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);
    }

    public CustomProxyNumber(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84512131493677, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.buttonContacts.setEnabled(false);
        this.buttonContacts.setAlpha(0.5f);
        this.proxyNumberField.setOnEditorActionListener(new getRegistrations(this));
        this.proxyNumberField.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CustomProxyNumber.this.mErrorValidation.setVisibility(8);
                if (!CustomProxyNumber.this.IconCompatParcelizer.equals(editable.toString())) {
                    String unused = CustomProxyNumber.this.write = "";
                }
                if (CustomProxyNumber.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    CustomProxyNumber.this.MediaBrowserCompat$CustomActionResultReceiver.write(editable.toString());
                }
            }
        });
        this.proxyNumberField.setOnFocusChangeListener(new getSourceFundTypes(this));
    }

    public void setProxyLabel(String str) {
        this.proxyLabel.setText(str);
    }

    public void setProxyHint(String str) {
        this.proxyNumberField.setHint(str);
    }

    public void setOnFocusChangeListener(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public void setOnProxyNumberListener(FragmentBuilder_BindChubbPaySuccessFragment fragmentBuilder_BindChubbPaySuccessFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindChubbPaySuccessFragment;
    }

    @OnClick
    public void onContactsButtonClick() {
        Intent intent = new Intent("android.intent.action.PICK", Uri.parse("content://contacts"));
        intent.setType("vnd.android.cursor.dir/phone_v2");
        FragmentBuilder_BindChubbPaySuccessFragment fragmentBuilder_BindChubbPaySuccessFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindChubbPaySuccessFragment instanceof BaseFragment) {
            BaseFragment baseFragment = (BaseFragment) fragmentBuilder_BindChubbPaySuccessFragment;
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = baseFragment.getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                baseFragment.startActivityForResult(intent, 347);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void write() {
        this.buttonContacts.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.buttonContacts.setEnabled(true);
        this.buttonContacts.setAlpha(1.0f);
    }

    public void setErrorValidationVisibility(int i) {
        this.mErrorValidation.setVisibility(i);
    }

    public void setErrorInLine(int i) {
        this.mErrorValidation.setText(i);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
            throw new IllegalArgumentException("setOnProxyNumberListener needs to be set");
        }
    }

    public void setProxyNumber(String str) {
        this.proxyNumberField.setText(str);
    }

    public void setFieldToOriginBackground() {
        this.proxyNumberField.setBackgroundDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public void setFieldToErrorRedBackground() {
        this.proxyNumberField.setBackgroundDrawable(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public void setProxyNumberFieldColor(int i) {
        this.proxyNumberField.setTextColor(setLastBaselineToBottomHeight.read(getContext(), i));
    }

    public void setOnPasteListener(ScbEditText.write write2) {
        this.proxyNumberField.setOnPasteListener(write2);
    }

    public void setMaxLength(int i) {
        this.proxyNumberField.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, Intent intent) {
        reportFromJson read;
        if (i2 == -1 && i == 347 && (read = AlertController$RecycleListView.read(intent, getContext())) != null) {
            String str = read.MediaBrowserCompat$ItemReceiver;
            if (str.startsWith("+66")) {
                str = "0".concat(str.substring(3, str.length()));
            }
            String str2 = "";
            read.MediaBrowserCompat$ItemReceiver = str.replaceAll("[^0-9]", str2);
            if (read.MediaBrowserCompat$CustomActionResultReceiver != null) {
                str2 = read.MediaBrowserCompat$CustomActionResultReceiver;
            }
            read.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.IconCompatParcelizer = read.MediaBrowserCompat$ItemReceiver;
            this.proxyNumberField.setText(read.MediaBrowserCompat$ItemReceiver);
            this.write = read.MediaBrowserCompat$CustomActionResultReceiver;
            if (removeIfFromRandomAccessList.MediaBrowserCompat$CustomActionResultReceiver(read.MediaBrowserCompat$ItemReceiver)) {
                read.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.IconCompatParcelizer(false, true, read.MediaBrowserCompat$ItemReceiver);
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(read);
            } else if (removeIfFromRandomAccessList.MediaBrowserCompat$ItemReceiver(read.MediaBrowserCompat$ItemReceiver)) {
                parseNdkPayload parsendkpayload = new parseNdkPayload();
                parsendkpayload.MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.IconCompatParcelizer(false, true, read.MediaBrowserCompat$ItemReceiver);
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(parsendkpayload);
            } else {
                this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(read.MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
