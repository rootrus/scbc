package com.scb.phone.view.custom.common;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindETBProductTermConditionFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.confirmGift;
import p040o.getICheckDeserializerRtti;
import p040o.getReceivedGifting;
import p040o.reviewPresent;
import p040o.setLastBaselineToBottomHeight;

public class MwAmountEditText extends TextInputEditText {
    public boolean IconCompatParcelizer;
    public read MediaBrowserCompat$CustomActionResultReceiver;
    public write MediaBrowserCompat$ItemReceiver;
    private FragmentBuilder_BindEasycashContactInformationFragment MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private MwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver MediaMetadataCompat;
    private MwAmountEditText$MediaBrowserCompat$ItemReceiver RatingCompat;
    public double read;
    private InputFilter[] write;

    public interface read {
        void read();
    }

    public interface write {
        void IconCompatParcelizer(double d);

        void read();
    }

    public MwAmountEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public MwAmountEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public MwAmountEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IconCompatParcelizer = true;
        this.MediaBrowserCompat$MediaItem = new FragmentBuilder_BindEasycashContactInformationFragment(this, new reviewPresent(this));
        this.MediaDescriptionCompat = getResources().getString(R.string.transfer_to_account_amount_hint);
        int i2 = 2;
        int i3 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.AmountEditText);
            i3 = obtainStyledAttributes.getInteger(1, -1);
            if (obtainStyledAttributes.getString(0) != null) {
                this.MediaDescriptionCompat = obtainStyledAttributes.getString(0);
            }
            this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(2, true);
            obtainStyledAttributes.recycle();
        }
        setHint(this.MediaDescriptionCompat);
        InputFilter[] inputFilterArr = {new FragmentBuilder_BindETBProductTermConditionFragment(i3 < 0 ? 10 : i3, !this.IconCompatParcelizer ? 0 : i2)};
        this.write = inputFilterArr;
        setFilters(inputFilterArr);
        addTextChangedListener(this.MediaBrowserCompat$MediaItem);
        setOnEditorActionListener(new confirmGift(this));
        setHandleDismissKeyboard(new getReceivedGifting(this));
    }

    public void setCustomHint(String str, TextInputLayout textInputLayout) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        textInputLayout.setHint(str);
    }

    public void setCustomHint(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
        setHint(str);
    }

    public void setCurrencyFormattingTextWatcher(FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment) {
        removeTextChangedListener(this.MediaBrowserCompat$MediaItem);
        fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer = new reviewPresent(this);
        this.MediaBrowserCompat$MediaItem = fragmentBuilder_BindEasycashContactInformationFragment;
        addTextChangedListener(fragmentBuilder_BindEasycashContactInformationFragment);
    }

    public void setOnHandleDismissKeyboardListener(read read2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read2;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        String str;
        String str2;
        super.onFocusChanged(z, i, rect);
        if (!TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver) && (!this.MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase(this.MediaDescriptionCompat) || z)) {
            return;
        }
        if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(getText().toString())) {
            if (this.read != 0.0d) {
                this.read = 0.0d;
                write write2 = this.MediaBrowserCompat$ItemReceiver;
                if (write2 != null) {
                    write2.IconCompatParcelizer(0.0d);
                }
            }
            if (!getText().toString().isEmpty()) {
                if (this.IconCompatParcelizer) {
                    str2 = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(0.0d);
                } else {
                    str2 = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(0.0d);
                }
                setFormattedAmount(str2);
            }
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(getEditableText(), false);
        } else if (!TextUtils.isEmpty(getText().toString())) {
            double d = this.read;
            if (this.IconCompatParcelizer) {
                str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
            } else {
                str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d);
            }
            setFormattedAmount(str);
        }
    }

    public void setFormattedAmount(String str) {
        if (str.isEmpty()) {
            setText("");
            return;
        }
        setFilters(new InputFilter[0]);
        setText(str);
        setCurrencyFormattingTextWatcher(this.MediaBrowserCompat$MediaItem);
        setFilters(this.write);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        String str;
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i, keyEvent);
        }
        if (TextUtils.isEmpty(getText())) {
            this.read = 0.0d;
        } else {
            double d = this.read;
            if (this.IconCompatParcelizer) {
                str = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d);
            } else {
                str = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(d);
            }
            setFormattedAmount(str);
        }
        MwAmountEditText$MediaBrowserCompat$ItemReceiver mwAmountEditText$MediaBrowserCompat$ItemReceiver = this.RatingCompat;
        if (mwAmountEditText$MediaBrowserCompat$ItemReceiver == null) {
            return false;
        }
        mwAmountEditText$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
        EditText editText = this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (editText == null || editText.getText().toString().length() <= 0) {
            return false;
        }
        editText.setSelection(editText.getText().toString().length());
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!TextUtils.isEmpty(getText())) {
            return false;
        }
        this.read = 0.0d;
        return false;
    }

    public void setOnAmountChangeListener(write write2) {
        this.MediaBrowserCompat$ItemReceiver = write2;
    }

    public void setAvailableBalanceCurrencyFormattingTextWatcher(double d) {
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.MediaBrowserCompat$MediaItem;
        if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
            fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(d);
        }
    }

    public void setHandleDismissKeyboard(MwAmountEditText$MediaBrowserCompat$ItemReceiver mwAmountEditText$MediaBrowserCompat$ItemReceiver) {
        this.RatingCompat = mwAmountEditText$MediaBrowserCompat$ItemReceiver;
    }

    public void setInvalidAmount(boolean z) {
        if (z) {
            getBackground().mutate().setColorFilter(setLastBaselineToBottomHeight.read(getContext(), R.color.f67152131099871), PorterDuff.Mode.SRC_ATOP);
        } else if (!hasFocus()) {
            getBackground().mutate().setColorFilter(setLastBaselineToBottomHeight.read(getContext(), R.color.f67342131099890), PorterDuff.Mode.SRC_ATOP);
        } else {
            getBackground().mutate().setColorFilter(setLastBaselineToBottomHeight.read(getContext(), R.color.f65622131099715), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public void setMaximumDecimalDigit(int i) {
        InputFilter[] inputFilterArr = {new FragmentBuilder_BindETBProductTermConditionFragment(i)};
        this.write = inputFilterArr;
        setFilters(inputFilterArr);
    }

    public boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        MwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver mwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver;
        if (i != 16908322 || (primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip()) == null || (mwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver = this.MediaMetadataCompat) == null) {
            return super.onTextContextMenuItem(i);
        }
        primaryClip.getItemAt(0).coerceToText(getContext());
        return mwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver.write();
    }

    public void setOnPasteListener(MwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver mwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaMetadataCompat = mwAmountEditText$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static /* synthetic */ void read(MwAmountEditText mwAmountEditText, double d) {
        if (mwAmountEditText.read != d) {
            mwAmountEditText.read = d;
            write write2 = mwAmountEditText.MediaBrowserCompat$ItemReceiver;
            if (write2 != null) {
                write2.IconCompatParcelizer(d);
            }
        }
    }
}
