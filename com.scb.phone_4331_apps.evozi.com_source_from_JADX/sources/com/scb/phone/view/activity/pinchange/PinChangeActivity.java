package com.scb.phone.view.activity.pinchange;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.MenuItem;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.domain.interactor.PinCase;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.login.CustomKeypad;
import com.scb.phone.view.custom.login.CustomPinInput;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4398fG;
import p040o.C4400fO;
import p040o.C9914eo;
import p040o.C9915ep;
import p040o.C9922ey;
import p040o.C9925fA;
import p040o.C9926fC;
import p040o.C9927fD;
import p040o.C9928fE;
import p040o.C9929fF;
import p040o.C9930fI;
import p040o.C9931fJ;
import p040o.C9932fK;
import p040o.C9933fL;
import p040o.C9934fM;
import p040o.C9935fN;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceAutocomplete;
import p040o.access$2300;
import p040o.fO$MediaBrowserCompat$ItemReceiver;
import p040o.findSubsetIndex;
import p040o.getBlackStreakCount;
import p040o.performActionWithResponse;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setVersion;

public class PinChangeActivity extends BaseActivity implements getBlackStreakCount {
    @BindView
    TextView bottomTextView;
    @BindView
    DefaultButton buttonNext;
    @BindView
    CustomKeypad customKeypad;
    @BindView
    CustomPinInput customPinInput;
    @HmlPinActivity
    public C4400fO presenter;
    @BindView
    TextView titleTextView;
    @BindView
    TextView topTextView;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79262131493151);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.titleTextView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67252131099881));
        setStackedBackground();
        setTitle(R.string.change_pin);
        setTabContainer();
        boolean z = true;
        this.customKeypad.setEnabledLines(true);
        this.customKeypad.setKeypadListener(this.customPinInput);
        this.customPinInput.setPinInputListener(new MerchantService() {
            public final void al_() {
                C4400fO fOVar = PinChangeActivity.this.presenter;
                C9915ep epVar = C9915ep.MediaBrowserCompat$ItemReceiver;
                if (fOVar.RatingCompat != null) {
                    epVar.IconCompatParcelizer(fOVar.RatingCompat);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                C4400fO fOVar = PinChangeActivity.this.presenter;
                int i = C4400fO.C44013.write[fOVar.MediaMetadataCompat.ordinal()];
                boolean z = false;
                if (i == 1) {
                    fOVar.write = str;
                    fOVar.MediaMetadataCompat = fO$MediaBrowserCompat$ItemReceiver.NEW;
                    String str2 = fOVar.write;
                    C9914eo eoVar = C9914eo.read;
                    if (fOVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        eoVar.IconCompatParcelizer(fOVar.RatingCompat);
                    }
                    fOVar.read.write(fOVar.MediaBrowserCompat$ItemReceiver.onErrorResumeNext(fOVar.read.write.read(new findSubsetIndex(fOVar.read.write.MediaBrowserCompat$CustomActionResultReceiver())).doOnComplete(new C9934fM(fOVar))).delay(new C9926fC(fOVar)).flatMap(new C9929fF(fOVar, str2)), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean>() {
                        public final void onError(Throwable th) {
                            C4400fO fOVar = C4400fO.this;
                            C9921ex exVar = new C9921ex(this);
                            boolean z = true;
                            if (fOVar.RatingCompat != null) {
                                exVar.IconCompatParcelizer(fOVar.RatingCompat);
                            }
                            if (th instanceof PinCase.PinIncorrectLimitReachedException) {
                                C4400fO fOVar2 = C4400fO.this;
                                C9916es esVar = C9916es.read;
                                if (fOVar2.RatingCompat == null) {
                                    z = false;
                                }
                                if (z) {
                                    esVar.IconCompatParcelizer(fOVar2.RatingCompat);
                                }
                            } else if (th instanceof PinCase.PinIncorrectException) {
                                C4400fO fOVar3 = C4400fO.this;
                                C9920ew ewVar = new C9920ew(this, th);
                                if (fOVar3.RatingCompat == null) {
                                    z = false;
                                }
                                if (z) {
                                    ewVar.IconCompatParcelizer(fOVar3.RatingCompat);
                                }
                            } else {
                                access$2200 MediaBrowserCompat$ItemReceiver2 = C4400fO.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                                C4400fO fOVar4 = C4400fO.this;
                                C9919ev evVar = new C9919ev(this, MediaBrowserCompat$ItemReceiver2);
                                if (fOVar4.RatingCompat == null) {
                                    z = false;
                                }
                                if (z) {
                                    evVar.IconCompatParcelizer(fOVar4.RatingCompat);
                                }
                            }
                        }

                        public final /* synthetic */ void onNext(Object obj) {
                            C4400fO.write(C4400fO.this);
                        }
                    });
                } else if (i == 2) {
                    fOVar.IconCompatParcelizer = str;
                    setVersion valueOf = setVersion.valueOf(performActionWithResponse.IconCompatParcelizer(str).name());
                    C9922ey eyVar = new C9922ey(valueOf);
                    if (fOVar.RatingCompat != null) {
                        eyVar.IconCompatParcelizer(fOVar.RatingCompat);
                    }
                    if (valueOf == setVersion.ERROR) {
                        C9928fE fEVar = C9928fE.read;
                        if (fOVar.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            fEVar.IconCompatParcelizer(fOVar.RatingCompat);
                            return;
                        }
                        return;
                    }
                    C9935fN fNVar = C9935fN.MediaBrowserCompat$CustomActionResultReceiver;
                    if (fOVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        fNVar.IconCompatParcelizer(fOVar.RatingCompat);
                    }
                } else if (i != 3) {
                } else {
                    if (!fOVar.IconCompatParcelizer.equalsIgnoreCase(str)) {
                        C9930fI fIVar = C9930fI.IconCompatParcelizer;
                        if (fOVar.RatingCompat != null) {
                            z = true;
                        }
                        if (z) {
                            fIVar.IconCompatParcelizer(fOVar.RatingCompat);
                            return;
                        }
                        return;
                    }
                    String str3 = fOVar.write;
                    String str4 = fOVar.IconCompatParcelizer;
                    C9914eo eoVar2 = C9914eo.read;
                    if (fOVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        eoVar2.IconCompatParcelizer(fOVar.RatingCompat);
                    }
                    fOVar.read.write(fOVar.MediaBrowserCompat$ItemReceiver.onErrorResumeNext(fOVar.read.write.read(new findSubsetIndex(fOVar.read.write.IconCompatParcelizer())).doOnComplete(new C9932fK(fOVar))).delay(new C9933fL(fOVar)).flatMap(new C9931fJ(fOVar, str3, str4)), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<PlaceAutocomplete.IntentBuilder>() {
                        static /* synthetic */ void read(getBlackStreakCount getblackstreakcount) {
                            getblackstreakcount.aj_();
                            getblackstreakcount.MediaDescriptionCompat();
                        }

                        public final void onError(Throwable th) {
                            C4400fO fOVar = C4400fO.this;
                            C9923ez ezVar = new C9923ez(this);
                            boolean z = true;
                            if (fOVar.RatingCompat != null) {
                                ezVar.IconCompatParcelizer(fOVar.RatingCompat);
                            }
                            if (th instanceof PinCase.PinIncorrectLimitReachedException) {
                                C4400fO fOVar2 = C4400fO.this;
                                C9916es esVar = C9916es.read;
                                if (fOVar2.RatingCompat == null) {
                                    z = false;
                                }
                                if (z) {
                                    esVar.IconCompatParcelizer(fOVar2.RatingCompat);
                                    return;
                                }
                                return;
                            }
                            access$2200 MediaBrowserCompat$ItemReceiver = C4400fO.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                            C4400fO fOVar3 = C4400fO.this;
                            C9918eu euVar = new C9918eu(this, MediaBrowserCompat$ItemReceiver);
                            if (fOVar3.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                euVar.IconCompatParcelizer(fOVar3.RatingCompat);
                            }
                        }

                        public final /* synthetic */ void onNext(Object obj) {
                            C4400fO fOVar = C4400fO.this;
                            C9917et etVar = C9917et.MediaBrowserCompat$CustomActionResultReceiver;
                            if (fOVar.RatingCompat != null) {
                                etVar.IconCompatParcelizer(fOVar.RatingCompat);
                            }
                        }
                    });
                }
            }

            /* renamed from: P_ */
            public final void mo13717P_() {
                C4400fO fOVar = PinChangeActivity.this.presenter;
                if (fOVar.MediaMetadataCompat == fO$MediaBrowserCompat$ItemReceiver.NEW) {
                    C9925fA fAVar = C9925fA.write;
                    if (fOVar.RatingCompat != null) {
                        fAVar.IconCompatParcelizer(fOVar.RatingCompat);
                    }
                }
            }
        });
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C4400fO fOVar = this.presenter;
        fOVar.MediaMetadataCompat = fO$MediaBrowserCompat$ItemReceiver.CURRENT;
        C4398fG fGVar = C4398fG.MediaBrowserCompat$CustomActionResultReceiver;
        if (fOVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            fGVar.IconCompatParcelizer(fOVar.RatingCompat);
        }
        fOVar.write(fOVar.MediaMetadataCompat);
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNextClick() {
        C4400fO fOVar = this.presenter;
        fOVar.MediaMetadataCompat = fO$MediaBrowserCompat$ItemReceiver.CONFIRM;
        C9927fD fDVar = C9927fD.IconCompatParcelizer;
        if (fOVar.RatingCompat != null) {
            fDVar.IconCompatParcelizer(fOVar.RatingCompat);
        }
        fOVar.write(fOVar.MediaMetadataCompat);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.topTextView.setText(R.string.your_current_pin);
    }

    public final void MediaSessionCompat$QueueItem() {
        this.topTextView.setText(R.string.your_new_pin);
    }

    public final void RatingCompat() {
        this.topTextView.setText(R.string.your_confirm_pin);
    }

    public final void write() {
        this.bottomTextView.setText("");
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.bottomTextView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67152131099871));
        this.bottomTextView.setText(R.string.pin_mismatch);
    }

    public final void IconCompatParcelizer(String str) {
        this.bottomTextView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f67152131099871));
        this.bottomTextView.setText(str);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        this.presenter.write();
        return true;
    }

    public final void MediaSessionCompat$Token() {
        this.buttonNext.setVisibility(0);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.buttonNext.setVisibility(4);
    }

    public final void IconCompatParcelizer() {
        this.buttonNext.setButtonEnabled(true);
    }

    public final void read() {
        this.buttonNext.setButtonEnabled(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.onBackPressed();
    }

    /* renamed from: com.scb.phone.view.activity.pinchange.PinChangeActivity$5 */
    static /* synthetic */ class C11015 {
        static final /* synthetic */ int[] read;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                o.setVersion[] r0 = p040o.setVersion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                read = r0
                o.setVersion r1 = p040o.setVersion.FAIR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x001d }
                o.setVersion r1 = p040o.setVersion.GOOD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = read     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.setVersion r1 = p040o.setVersion.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.pinchange.PinChangeActivity.C11015.<clinit>():void");
        }
    }

    public final void read(setVersion setversion) {
        String str;
        int i;
        int i2 = C11015.read[setversion.ordinal()];
        if (i2 == 1) {
            str = getString(R.string.pin_strength_fair);
            i = setLastBaselineToBottomHeight.read(this, R.color.f67232131099879);
        } else if (i2 == 2) {
            str = getString(R.string.pin_strength_good);
            i = setLastBaselineToBottomHeight.read(this, R.color.f67212131099877);
        } else if (i2 != 3) {
            str = getString(R.string.pin_strength_weak);
            i = setLastBaselineToBottomHeight.read(this, R.color.f67222131099878);
        } else {
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

    public final void MediaMetadataCompat() {
        this.customPinInput.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaDescriptionCompat() {
        Intent intent = new Intent(this, PinChangeSuccessActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void MediaBrowserCompat$MediaItem() {
        MediaSessionCompat$Token(true);
    }

    public void onBackPressed() {
        this.presenter.write();
    }
}
