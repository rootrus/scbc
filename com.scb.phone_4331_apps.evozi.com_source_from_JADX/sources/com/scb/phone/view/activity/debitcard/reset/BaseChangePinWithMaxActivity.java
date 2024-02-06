package com.scb.phone.view.activity.debitcard.reset;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput;
import com.scb.phone.view.custom.login.CustomKeypad;
import p040o.HmlPinActivity;
import p040o.HttpRequestFactory;
import p040o.MerchantService;
import p040o.onGetStartedClick;
import p040o.proxyGetICheckDeserializerKta;
import p040o.setLastBaselineToBottomHeight;
import p040o.writeSInt32NoTag;
import p040o.writeUInt32;

public class BaseChangePinWithMaxActivity<T extends writeUInt32<?>> extends BaseActivity implements proxyGetICheckDeserializerKta, MerchantService {
    @BindView
    public TextView bottomTextView;
    @BindView
    protected Button buttonNext;
    @BindView
    protected CustomKeypad customKeypad;
    @BindView
    public CustomPinWithMaxInput customPinInput;
    @HmlPinActivity
    public T presenter;
    @BindView
    protected TextView topTextView;

    /* access modifiers changed from: protected */
    public final CustomKeypad MediaSessionCompat$QueueItem() {
        CustomKeypad customKeypad2 = this.customKeypad;
        if (customKeypad2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customKeypad");
        }
        return customKeypad2;
    }

    /* access modifiers changed from: protected */
    public final TextView MediaSessionCompat$ResultReceiverWrapper() {
        TextView textView = this.topTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("topTextView");
        }
        return textView;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79912131493216);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        CustomKeypad customKeypad2 = this.customKeypad;
        if (customKeypad2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customKeypad");
        }
        CustomPinWithMaxInput customPinWithMaxInput = this.customPinInput;
        if (customPinWithMaxInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customKeypad2.setKeypadListener(customPinWithMaxInput);
        CustomPinWithMaxInput customPinWithMaxInput2 = this.customPinInput;
        if (customPinWithMaxInput2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinWithMaxInput2.setPinInputListener(this);
    }

    public final void al_() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeSInt32NoTag writesint32notag = writeSInt32NoTag.MediaBrowserCompat$CustomActionResultReceiver;
        if (t.RatingCompat != null) {
            writesint32notag.IconCompatParcelizer(t.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.IconCompatParcelizer(str);
    }

    /* renamed from: P_ */
    public final void mo13717P_() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (t.read == writeUInt32.read.NEW) {
            HttpRequestFactory httpRequestFactory = HttpRequestFactory.MediaBrowserCompat$CustomActionResultReceiver;
            if (t.RatingCompat != null) {
                httpRequestFactory.IconCompatParcelizer(t.RatingCompat);
            }
        }
    }

    public void MediaDescriptionCompat() {
        setTitle(R.string.set_pin_title);
        TextView textView = this.topTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("topTextView");
        }
        textView.setText(R.string.set_pin_instruction);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        setTitle(R.string.confirm_pin_title);
        TextView textView = this.topTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("topTextView");
        }
        textView.setText(R.string.your_confirm_pin);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        TextView textView = this.bottomTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomTextView");
        }
        textView.setText("");
    }

    public final void MediaMetadataCompat() {
        TextView textView = this.bottomTextView;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomTextView");
        }
        textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67152131099871));
        TextView textView2 = this.bottomTextView;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("bottomTextView");
        }
        textView2.setText(R.string.pin_mismatch);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        Button button = this.buttonNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
        }
        button.setVisibility(i);
    }

    public final void read() {
        Button button = this.buttonNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
        }
        button.setEnabled(true);
    }

    public final void IconCompatParcelizer() {
        Button button = this.buttonNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonNext");
        }
        button.setEnabled(false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.setVersion r9) {
        /*
            r8 = this;
            java.lang.String r0 = "pinStrength"
            p040o.onGetStartedClick.write((java.lang.Object) r9, (java.lang.String) r0)
            int[] r0 = p040o.C10034lF.IconCompatParcelizer
            int r9 = r9.ordinal()
            r9 = r0[r9]
            java.lang.String r0 = "bottomTextView"
            r1 = 1
            if (r9 == r1) goto L_0x006b
            r1 = 2
            if (r9 == r1) goto L_0x0054
            r1 = 3
            if (r9 == r1) goto L_0x003d
            r1 = 4
            if (r9 != r1) goto L_0x006b
            android.widget.TextView r9 = r8.bottomTextView
            if (r9 != 0) goto L_0x0022
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0022:
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131099761(0x7f060071, float:1.7811884E38)
            int r1 = p040o.setLastBaselineToBottomHeight.read(r1, r2)
            r9.setTextColor(r1)
            android.widget.TextView r9 = r8.bottomTextView
            if (r9 != 0) goto L_0x0036
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x0036:
            r0 = 2131756112(0x7f100450, float:1.9143122E38)
            r9.setText(r0)
            return
        L_0x003d:
            r9 = 2131759951(0x7f10134f, float:1.9150909E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r1 = "getString(R.string.pin_strength_good)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r1)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131099877(0x7f0600e5, float:1.781212E38)
            int r1 = p040o.setLastBaselineToBottomHeight.read(r1, r2)
            goto L_0x0081
        L_0x0054:
            r9 = 2131759950(0x7f10134e, float:1.9150907E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r1 = "getString(R.string.pin_strength_fair)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r1)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131099879(0x7f0600e7, float:1.7812124E38)
            int r1 = p040o.setLastBaselineToBottomHeight.read(r1, r2)
            goto L_0x0081
        L_0x006b:
            r9 = 2131759952(0x7f101350, float:1.915091E38)
            java.lang.String r9 = r8.getString(r9)
            java.lang.String r1 = "getString(R.string.pin_strength_weak)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r9, (java.lang.String) r1)
            r1 = r8
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131099871(0x7f0600df, float:1.7812107E38)
            int r1 = p040o.setLastBaselineToBottomHeight.read(r1, r2)
        L_0x0081:
            r2 = 2131759948(0x7f10134c, float:1.9150903E38)
            java.lang.String r2 = r8.getString(r2)
            java.lang.String r3 = "getString(R.string.pin_strength)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r2, (java.lang.String) r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            r4 = r8
            android.content.Context r4 = (android.content.Context) r4
            r5 = 2131099773(0x7f06007d, float:1.7811909E38)
            int r4 = p040o.setLastBaselineToBottomHeight.read(r4, r5)
            r3.<init>(r4)
            android.text.style.ForegroundColorSpan r4 = new android.text.style.ForegroundColorSpan
            r4.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r5.<init>(r1)
            r1 = 0
            int r6 = r2.length()
            r7 = 33
            r5.setSpan(r3, r1, r6, r7)
            int r1 = r2.length()
            int r2 = r2.length()
            int r9 = r9.length()
            int r2 = r2 + r9
            r5.setSpan(r4, r1, r2, r7)
            android.widget.TextView r9 = r8.bottomTextView
            if (r9 != 0) goto L_0x00d8
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r0)
        L_0x00d8:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r9.setText(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.debitcard.reset.BaseChangePinWithMaxActivity.read(o.setVersion):void");
    }

    public void onDestroy() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.onDestroy();
        super.onDestroy();
    }

    /* renamed from: Q_ */
    public void mo13712Q_() {
        CustomPinWithMaxInput customPinWithMaxInput = this.customPinInput;
        if (customPinWithMaxInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinWithMaxInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    @OnClick
    public final void onNextClick() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        t.MediaBrowserCompat$ItemReceiver();
    }
}
