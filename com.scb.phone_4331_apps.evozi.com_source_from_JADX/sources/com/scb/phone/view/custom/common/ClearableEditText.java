package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindBaseMapTabFragment;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getOccupationList;
import p040o.getTitleList;
import p040o.setLastBaselineToBottomHeight;
import p040o.submitConsent;

public class ClearableEditText extends RelativeLayout {
    public int IconCompatParcelizer = 40;
    private String MediaBrowserCompat$CustomActionResultReceiver = "";
    private Drawable MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$MediaItem = false;
    private boolean MediaBrowserCompat$SearchResultReceiver = false;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private TextWatcher f3072x50fd9e4a = new FragmentBuilder_BindCreditLimitDisplayFragment() {
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ClearableEditText.this.clearButton.setVisibility((charSequence.length() <= 0 || !ClearableEditText.this.MediaSessionCompat$Token) ? 8 : 0);
            if (ClearableEditText.this.MediaBrowserCompat$MediaItem) {
                ClearableEditText.this.setErrorVisible(false);
            }
        }
    };
    private String MediaDescriptionCompat;
    private View.OnFocusChangeListener MediaMetadataCompat = new getOccupationList(this);
    private ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver MediaSessionCompat$ResultReceiverWrapper = null;
    /* access modifiers changed from: private */
    public boolean MediaSessionCompat$Token = true;
    private Drawable RatingCompat;
    @BindView
    ImageButton clearButton;
    @BindView
    ImageView editTextIcon;
    @BindView
    TextView errorText;
    @BindView
    public CustomNoteEditText inputEditText;
    @BindView
    View inputTextLayout;
    private View.OnClickListener read = new getTitleList(this);
    public read write = null;

    public interface read {
        void MediaBrowserCompat$ItemReceiver();
    }

    /* access modifiers changed from: protected */
    public int read() {
        return R.layout.f80512131493276;
    }

    public final /* synthetic */ void write(boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = z;
        IconCompatParcelizer();
    }

    public ClearableEditText(Context context) {
        super(context);
        write(context, (AttributeSet) null);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        write(context, attributeSet);
    }

    public ClearableEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        write(context, attributeSet);
    }

    private void write(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(getContext()).inflate(read(), this, true);
        ButterKnife.IconCompatParcelizer(this);
        setEnabledEditTextIcon(false);
        this.inputEditText.addTextChangedListener(this.f3072x50fd9e4a);
        this.clearButton.setOnClickListener(this.read);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.ClearableEditText);
            setMaxLength(obtainStyledAttributes.getInteger(8, this.IconCompatParcelizer));
            this.MediaDescriptionCompat = obtainStyledAttributes.getString(7);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getString(5);
            setInputType(obtainStyledAttributes.getInt(1, 0));
            setImeOptions(obtainStyledAttributes.getInt(2, 0));
            if (obtainStyledAttributes.hasValue(3)) {
                this.inputEditText.setNextFocusForwardId(obtainStyledAttributes.getInt(4, 0));
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(4);
            if (drawable != null) {
                this.MediaBrowserCompat$ItemReceiver = drawable;
                this.inputTextLayout.setBackground(drawable);
            } else {
                this.MediaBrowserCompat$ItemReceiver = setLastBaselineToBottomHeight.write(context, R.drawable.shape_gray_rounded_rectangle);
            }
            Drawable drawable2 = obtainStyledAttributes.getDrawable(6);
            if (drawable2 != null) {
                this.RatingCompat = drawable2;
            } else {
                this.RatingCompat = setLastBaselineToBottomHeight.write(context, R.drawable.shape_red_reounded_reactangle_border);
            }
            if (obtainStyledAttributes.hasValue(0)) {
                setDigitsFilter(obtainStyledAttributes.getString(0));
            }
            this.MediaSessionCompat$Token = obtainStyledAttributes.getBoolean(9, true);
            obtainStyledAttributes.recycle();
        }
        setHint(this.MediaDescriptionCompat);
        this.inputEditText.setOnFocusChangeListener(this.MediaMetadataCompat);
        this.inputEditText.setOnEditorActionListener(new submitConsent(this));
        this.errorText.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void setHint(String str) {
        this.inputEditText.setHint(str);
    }

    public void setEnabledEditTextIcon(boolean z) {
        ImageView imageView = this.editTextIcon;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void setInputType(int i) {
        if (i != 0) {
            this.inputEditText.setInputType(i);
        }
    }

    public void setImeOptions(int i) {
        if (i != 0) {
            this.inputEditText.setImeOptions(i);
        }
    }

    public void setDigitsFilter(String str) {
        if (str != null) {
            this.inputEditText.setKeyListener(DigitsKeyListener.getInstance(str));
        }
    }

    public void setErrorVisible(boolean z) {
        this.MediaBrowserCompat$MediaItem = z;
        this.errorText.setVisibility(z ? 0 : 8);
        this.inputTextLayout.setBackground(z ? this.RatingCompat : this.MediaBrowserCompat$ItemReceiver);
    }

    public void setHighlight(boolean z) {
        this.inputTextLayout.setBackground(z ? this.RatingCompat : this.MediaBrowserCompat$ItemReceiver);
    }

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer() {
        ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver clearableEditText$MediaBrowserCompat$CustomActionResultReceiver;
        String obj = this.inputEditText.getText().toString();
        if (!this.MediaBrowserCompat$SearchResultReceiver && obj.length() > 0 && (clearableEditText$MediaBrowserCompat$CustomActionResultReceiver = this.MediaSessionCompat$ResultReceiverWrapper) != null) {
            setErrorVisible(!clearableEditText$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.inputEditText.getText().toString()));
        }
    }

    public void setText(String str) {
        this.inputEditText.removeTextChangedListener(this.f3072x50fd9e4a);
        this.inputEditText.setText(str);
        setSelection(str.length());
        this.inputEditText.addTextChangedListener(this.f3072x50fd9e4a);
    }

    public void setSelection(int i) {
        this.inputEditText.setSelection(i);
    }

    public void setMaxLength(int i) {
        this.IconCompatParcelizer = i;
        this.inputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.IconCompatParcelizer)});
    }

    public void setValidateInputListener(ClearableEditText$MediaBrowserCompat$CustomActionResultReceiver clearableEditText$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaSessionCompat$ResultReceiverWrapper = clearableEditText$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setKeyInputListener(read read2) {
        this.write = read2;
    }

    public void setErrorText(String str) {
        this.errorText.setText(str);
    }

    public void setEnabled(boolean z) {
        Resources resources;
        int i;
        this.inputEditText.setEnabled(z);
        CustomNoteEditText customNoteEditText = this.inputEditText;
        if (z) {
            resources = getResources();
            i = R.color.f66092131099764;
        } else {
            resources = getResources();
            i = R.color.f66402131099796;
        }
        customNoteEditText.setTextColor(resources.getColor(i));
    }

    public void setEditTextKeyboardActionListener(FragmentBuilder_BindBaseMapTabFragment fragmentBuilder_BindBaseMapTabFragment) {
        this.inputEditText.setEditTextKeyboardActionListener(fragmentBuilder_BindBaseMapTabFragment);
    }
}
