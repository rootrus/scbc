package com.scb.phone.view.activity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.HttpRequestFactory;
import p040o.MerchantService;
import p040o.proxyGetICheckDeserializerKta;
import p040o.setLastBaselineToBottomHeight;
import p040o.setVersion;
import p040o.writeSInt32NoTag;
import p040o.writeUInt32;

public class BaseChangePinActivity<T extends writeUInt32> extends BaseActivity implements proxyGetICheckDeserializerKta {
    @BindView
    TextView bottomTextView;
    @BindView
    public Button buttonNext;
    @BindView
    public CustomKeypad customKeypad;
    @BindView
    CustomPinInput customPinInput;
    @HmlPinActivity
    public T presenter;
    @BindView
    public TextView topTextView;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79902131493215);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.customKeypad.setKeypadListener(this.customPinInput);
        this.customPinInput.setPinInputListener(new MerchantService() {
            public final void al_() {
                T t = BaseChangePinActivity.this.presenter;
                writeSInt32NoTag writesint32notag = writeSInt32NoTag.MediaBrowserCompat$CustomActionResultReceiver;
                if (t.RatingCompat != null) {
                    writesint32notag.IconCompatParcelizer(t.RatingCompat);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                BaseChangePinActivity.this.presenter.MediaBrowserCompat$CustomActionResultReceiver(str, !AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(BaseChangePinActivity.this.getBaseContext()));
            }

            /* renamed from: P_ */
            public final void mo13717P_() {
                T t = BaseChangePinActivity.this.presenter;
                if (t.read == writeUInt32.read.NEW) {
                    HttpRequestFactory httpRequestFactory = HttpRequestFactory.MediaBrowserCompat$CustomActionResultReceiver;
                    if (t.RatingCompat != null) {
                        httpRequestFactory.IconCompatParcelizer(t.RatingCompat);
                    }
                }
            }
        });
    }

    public void MediaDescriptionCompat() {
        setTitle(R.string.set_pin_title);
        this.topTextView.setText(R.string.set_pin_instruction);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        setTitle(R.string.confirm_pin_title);
        this.topTextView.setText(R.string.your_confirm_pin);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.bottomTextView.setText("");
    }

    public final void MediaMetadataCompat() {
        this.bottomTextView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67152131099871));
        this.bottomTextView.setText(R.string.pin_mismatch);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.buttonNext.setVisibility(i);
    }

    public final void read() {
        this.buttonNext.setEnabled(true);
    }

    public final void IconCompatParcelizer() {
        this.buttonNext.setEnabled(false);
    }

    /* renamed from: com.scb.phone.view.activity.BaseChangePinActivity$5 */
    static /* synthetic */ class C10715 {
        static final /* synthetic */ int[] MediaBrowserCompat$ItemReceiver;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.setVersion[] r0 = p040o.setVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                MediaBrowserCompat$ItemReceiver = r0
                o.setVersion r1 = p040o.setVersion.WEAK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setVersion r1 = p040o.setVersion.FAIR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setVersion r1 = p040o.setVersion.GOOD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = MediaBrowserCompat$ItemReceiver     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.setVersion r1 = p040o.setVersion.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.BaseChangePinActivity.C10715.<clinit>():void");
        }
    }

    public final void read(setVersion setversion) {
        String str;
        int i;
        int i2 = C10715.MediaBrowserCompat$ItemReceiver[setversion.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                str = getString(R.string.pin_strength_fair);
                i = setLastBaselineToBottomHeight.read(this, R.color.f67232131099879);
            } else if (i2 == 3) {
                str = getString(R.string.pin_strength_good);
                i = setLastBaselineToBottomHeight.read(this, R.color.f67212131099877);
            } else if (i2 == 4) {
                this.bottomTextView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67152131099871));
                this.bottomTextView.setText(R.string.pin_strength_error);
                return;
            }
            String string = getString(R.string.pin_strength);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(setLastBaselineToBottomHeight.read(this, R.color.f66182131099773));
            ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(i);
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
            spannableStringBuilder.setSpan(foregroundColorSpan, 0, string.length(), 33);
            spannableStringBuilder.setSpan(foregroundColorSpan2, string.length(), string.length() + str.length(), 33);
            this.bottomTextView.setText(spannableStringBuilder);
        }
        str = getString(R.string.pin_strength_weak);
        i = setLastBaselineToBottomHeight.read(this, R.color.f67222131099878);
        String string2 = getString(R.string.pin_strength);
        ForegroundColorSpan foregroundColorSpan3 = new ForegroundColorSpan(setLastBaselineToBottomHeight.read(this, R.color.f66182131099773));
        ForegroundColorSpan foregroundColorSpan22 = new ForegroundColorSpan(i);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string2);
        sb2.append(str);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder2.setSpan(foregroundColorSpan3, 0, string2.length(), 33);
        spannableStringBuilder2.setSpan(foregroundColorSpan22, string2.length(), string2.length() + str.length(), 33);
        this.bottomTextView.setText(spannableStringBuilder2);
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    /* renamed from: Q_ */
    public final void mo13712Q_() {
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNextClick() {
        this.presenter.MediaBrowserCompat$ItemReceiver();
    }
}
