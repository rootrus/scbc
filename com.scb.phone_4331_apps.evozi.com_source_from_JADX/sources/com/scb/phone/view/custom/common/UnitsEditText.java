package com.scb.phone.view.custom.common;

import android.content.Context;
import android.graphics.Rect;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import java.math.BigDecimal;
import p040o.C6510x49ff895f;
import p040o.FragmentBuilder_BindEasycashHomeTopUpInfoCalculationFragment;
import p040o.getICheckDeserializerRtti;
import p040o.getSentGifting;
import p040o.validatePresent;

public class UnitsEditText extends TextInputEditText {
    public BigDecimal IconCompatParcelizer;
    private C6510x49ff895f MediaBrowserCompat$ItemReceiver;
    private InputFilter[] read;
    public IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$ItemReceiver();

        void MediaBrowserCompat$ItemReceiver(BigDecimal bigDecimal);
    }

    public UnitsEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public UnitsEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public UnitsEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$ItemReceiver = new C6510x49ff895f(this, new getSentGifting(this));
        InputFilter[] inputFilterArr = {new FragmentBuilder_BindEasycashHomeTopUpInfoCalculationFragment(false)};
        this.read = inputFilterArr;
        setFilters(inputFilterArr);
        addTextChangedListener(this.MediaBrowserCompat$ItemReceiver);
        setOnEditorActionListener(new validatePresent(this));
    }

    public void setSpecificFilter(boolean z) {
        InputFilter[] inputFilterArr = {new FragmentBuilder_BindEasycashHomeTopUpInfoCalculationFragment(z)};
        this.read = inputFilterArr;
        setFilters(inputFilterArr);
    }

    public void setUnitFormattingTextWatcher(C6510x49ff895f fragmentBuilder_BindEasycashFeaturesCommercialLoanInformationFragment) {
        removeTextChangedListener(this.MediaBrowserCompat$ItemReceiver);
        fragmentBuilder_BindEasycashFeaturesCommercialLoanInformationFragment.write = new getSentGifting(this);
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindEasycashFeaturesCommercialLoanInformationFragment;
        addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCommercialLoanInformationFragment);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z) {
            setHint("");
        } else if (TextUtils.isEmpty(getText())) {
            setHint(R.string.unit_limit);
        }
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return super.onKeyPreIme(i, keyEvent);
        }
        if (TextUtils.isEmpty(getText())) {
            this.IconCompatParcelizer = new BigDecimal(0);
        } else {
            setFormattedUnit(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer));
        }
        return false;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (TextUtils.isEmpty(getText())) {
            BigDecimal bigDecimal = new BigDecimal(0);
            this.IconCompatParcelizer = bigDecimal;
            this.IconCompatParcelizer = bigDecimal;
            IconCompatParcelizer iconCompatParcelizer = this.write;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(bigDecimal);
            }
            setFormattedUnit(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer));
        }
        return false;
    }

    public void setOnUnitChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public void setFormattedUnit(String str) {
        if (getParent() instanceof TextInputLayout) {
            ((TextInputLayout) getParent()).setError((CharSequence) null);
        }
        if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(str)) {
            setText("");
            return;
        }
        setFilters(new InputFilter[0]);
        setText(str);
        setUnitFormattingTextWatcher(this.MediaBrowserCompat$ItemReceiver);
        setFilters(this.read);
    }

    public static /* synthetic */ void read(UnitsEditText unitsEditText, BigDecimal bigDecimal) {
        unitsEditText.IconCompatParcelizer = bigDecimal;
        IconCompatParcelizer iconCompatParcelizer = unitsEditText.write;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(bigDecimal);
        }
    }
}
