package com.scb.phone.view.custom.common;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindETBProductTermConditionFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getDepositProductDetail;
import p040o.getDepositProductList;
import p040o.getICheckDeserializerRtti;
import p040o.getProductTermCondition;
import p040o.setBaselineAligned;

public class AmountEditText extends TextInputEditText {
    public String IconCompatParcelizer;
    public read MediaBrowserCompat$CustomActionResultReceiver;
    public write MediaBrowserCompat$ItemReceiver;
    private IconCompatParcelizer MediaBrowserCompat$MediaItem;
    private TextInputLayout MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f3071x50fd9e4a;
    public boolean MediaDescriptionCompat;
    private InputFilter[] MediaMetadataCompat;
    private AmountEditText$MediaBrowserCompat$CustomActionResultReceiver RatingCompat;
    public FragmentBuilder_BindEasycashContactInformationFragment read;
    public double write;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer();
    }

    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver();

        void MediaBrowserCompat$CustomActionResultReceiver(double d);
    }

    public interface write {
        void write();
    }

    public AmountEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public AmountEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AmountEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaDescriptionCompat = true;
        this.read = new FragmentBuilder_BindEasycashContactInformationFragment(this, new getDepositProductDetail(this));
        this.f3071x50fd9e4a = getResources().getString(R.string.transfer_to_account_amount_hint);
        int i2 = 2;
        int i3 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.AmountEditText);
            i3 = obtainStyledAttributes.getInteger(1, -1);
            if (obtainStyledAttributes.getString(0) != null) {
                this.f3071x50fd9e4a = obtainStyledAttributes.getString(0);
            }
            this.MediaDescriptionCompat = obtainStyledAttributes.getBoolean(2, true);
            obtainStyledAttributes.recycle();
        }
        setHint(this.f3071x50fd9e4a);
        InputFilter[] inputFilterArr = {new FragmentBuilder_BindETBProductTermConditionFragment(i3 < 0 ? 10 : i3, !this.MediaDescriptionCompat ? 0 : i2)};
        this.MediaMetadataCompat = inputFilterArr;
        setFilters(inputFilterArr);
        addTextChangedListener(this.read);
        setOnEditorActionListener(new getDepositProductList(this));
        setHandleDismissKeyboard(new getProductTermCondition(this));
    }

    public void setCustomHint(String str, TextInputLayout textInputLayout) {
        this.MediaBrowserCompat$SearchResultReceiver = textInputLayout;
        this.IconCompatParcelizer = str;
        textInputLayout.setHint(str);
    }

    public void setCustomHint(String str) {
        this.IconCompatParcelizer = str;
        setHint(str);
    }

    public void setCurrencyFormattingTextWatcher(FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment) {
        removeTextChangedListener(this.read);
        fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer = new getDepositProductDetail(this);
        this.read = fragmentBuilder_BindEasycashContactInformationFragment;
        addTextChangedListener(fragmentBuilder_BindEasycashContactInformationFragment);
    }

    public void setOnHandleDismissKeyboardListener(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        String str;
        super.onFocusChanged(z, i, rect);
        Editable text = getText();
        if (!TextUtils.isEmpty(this.IconCompatParcelizer) && !this.IconCompatParcelizer.equalsIgnoreCase(this.f3071x50fd9e4a)) {
            return;
        }
        if (z) {
            TextInputLayout textInputLayout = this.MediaBrowserCompat$SearchResultReceiver;
            if (textInputLayout != null) {
                textInputLayout.setHintEnabled(false);
            }
            setHint("");
        } else if (getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(text)) {
            TextInputLayout textInputLayout2 = this.MediaBrowserCompat$SearchResultReceiver;
            if (textInputLayout2 != null) {
                textInputLayout2.setHintEnabled(true);
            }
            setText("");
            setHint(this.f3071x50fd9e4a);
            this.read.IconCompatParcelizer(getEditableText(), true);
        } else if (!TextUtils.isEmpty(text)) {
            double d = this.write;
            if (this.MediaDescriptionCompat) {
                str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
            } else {
                str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d);
            }
            setFormattedAmount(str);
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        String str;
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i, keyEvent);
        }
        if (TextUtils.isEmpty(getText())) {
            this.write = 0.0d;
        } else {
            double d = this.write;
            if (this.MediaDescriptionCompat) {
                str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
            } else {
                str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d);
            }
            setFormattedAmount(str);
        }
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$MediaItem;
        if (iconCompatParcelizer == null) {
            return false;
        }
        iconCompatParcelizer.IconCompatParcelizer();
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        String str;
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!TextUtils.isEmpty(getText())) {
            return false;
        }
        this.write = 0.0d;
        if (0.0d != 0.0d) {
            this.write = 0.0d;
            read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (read2 != null) {
                read2.MediaBrowserCompat$CustomActionResultReceiver(0.0d);
            }
        }
        double d = this.write;
        if (this.MediaDescriptionCompat) {
            str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
        } else {
            str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d);
        }
        setFormattedAmount(str);
        return false;
    }

    public void setOnAmountChangeListener(read read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
    }

    public void setAvailableBalanceCurrencyFormattingTextWatcher(double d) {
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.read;
        if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
            fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(d);
        }
    }

    public void setHandleDismissKeyboard(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
    }

    public void setFormattedAmount(String str) {
        if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(str)) {
            setText("");
            return;
        }
        setFilters(new InputFilter[0]);
        setText(str);
        setCurrencyFormattingTextWatcher(this.read);
        setFilters(this.MediaMetadataCompat);
    }

    public void setInvalidAmount(boolean z) {
        if (z) {
            Drawable mutate = getBackground().mutate();
            getResources();
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(mutate, -1024159);
        } else if (!hasFocus()) {
            Drawable mutate2 = getBackground().mutate();
            getResources();
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(mutate2, -3553587);
        } else {
            Drawable mutate3 = getBackground().mutate();
            getResources();
            setBaselineAligned.MediaBrowserCompat$ItemReceiver(mutate3, -9031231);
        }
    }

    public void setMaximumDecimalDigit(int i) {
        InputFilter[] inputFilterArr = {new FragmentBuilder_BindETBProductTermConditionFragment(i)};
        this.MediaMetadataCompat = inputFilterArr;
        setFilters(inputFilterArr);
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        AmountEditText$MediaBrowserCompat$CustomActionResultReceiver amountEditText$MediaBrowserCompat$CustomActionResultReceiver;
        if (i != 16908322 || (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) == null || (amountEditText$MediaBrowserCompat$CustomActionResultReceiver = this.RatingCompat) == null) {
            return super.onTextContextMenuItem(i);
        }
        return amountEditText$MediaBrowserCompat$CustomActionResultReceiver.read(this, primaryClip.getItemAt(0).coerceToText(getContext()).toString());
    }

    public void setOnPasteListener(AmountEditText$MediaBrowserCompat$CustomActionResultReceiver amountEditText$MediaBrowserCompat$CustomActionResultReceiver) {
        this.RatingCompat = amountEditText$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(AmountEditText amountEditText, double d) {
        if (amountEditText.write != d) {
            amountEditText.write = d;
            read read2 = amountEditText.MediaBrowserCompat$CustomActionResultReceiver;
            if (read2 != null) {
                read2.MediaBrowserCompat$CustomActionResultReceiver(d);
            }
        }
    }
}
