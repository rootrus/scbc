package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.GiftingService;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.confirmGiftPresent;
import p040o.setLastBaselineToBottomHeight;
import p040o.setNavigationContentDescription;

public class InputText extends RelativeLayout {
    private String IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    public InputText$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat;
    private final TextWatcher MediaMetadataCompat;
    /* access modifiers changed from: private */
    public InputText$MediaBrowserCompat$ItemReceiver RatingCompat;
    @BindView
    ImageButton clearButton;
    @BindView
    TextView counterText;
    @BindView
    public TextView errorText;
    @BindView
    public EditText inputEditText;
    private boolean read;
    @BindView
    TextView titleText;
    /* access modifiers changed from: private */
    public boolean write;

    public InputText(Context context) {
        this(context, (AttributeSet) null);
    }

    public InputText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InputText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$MediaItem = 40;
        this.MediaMetadataCompat = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                InputText.this.MediaBrowserCompat$CustomActionResultReceiver(editable.length());
                if (InputText.this.RatingCompat != null) {
                    InputText.this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver(editable.toString());
                }
                InputText.this.clearButton.setVisibility((!InputText.this.write || TextUtils.isEmpty(editable)) ? 4 : 0);
            }
        };
        int i2 = 4;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.InputText);
            this.MediaDescriptionCompat = obtainStyledAttributes.getString(5);
            this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getInteger(4, 40);
            this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getString(1);
            this.read = obtainStyledAttributes.getBoolean(3, false);
            this.write = obtainStyledAttributes.getBoolean(2, false);
            this.IconCompatParcelizer = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(getContext()).inflate(R.layout.f80602131493285, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setNavigationContentDescription.read(this.errorText, (int) R.style.f97832131821003);
        String str = this.MediaDescriptionCompat;
        if (str != null) {
            this.titleText.setText(str);
        }
        String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str2 != null) {
            this.inputEditText.setHint(str2);
        }
        this.counterText.setVisibility(this.read ? 0 : i2);
        MediaBrowserCompat$CustomActionResultReceiver(0);
        this.inputEditText.setInputType(this.MediaBrowserCompat$MediaItem > 40 ? 131073 : 1);
        this.inputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.MediaBrowserCompat$MediaItem)});
        this.inputEditText.removeTextChangedListener(this.MediaMetadataCompat);
        this.inputEditText.addTextChangedListener(this.MediaMetadataCompat);
        this.inputEditText.setOnFocusChangeListener(new GiftingService(this));
        this.inputEditText.setOnEditorActionListener(new confirmGiftPresent(this));
        this.errorText.setText(this.IconCompatParcelizer);
        this.errorText.setVisibility(8);
    }

    public void setText(String str) {
        this.inputEditText.setText(str);
    }

    public void setMaxLength(int i) {
        this.MediaBrowserCompat$MediaItem = i;
        this.counterText.setText(getContext().getString(R.string.text_counter, new Object[]{0, Integer.valueOf(i)}));
        this.inputEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* access modifiers changed from: private */
    public void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.counterText.setText(getContext().getString(R.string.text_counter, new Object[]{Integer.valueOf(i), Integer.valueOf(this.MediaBrowserCompat$MediaItem)}));
    }

    public final void read(String str) {
        this.errorText.setVisibility(0);
        this.errorText.setText(str);
        this.inputEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public void setImeOptions(int i) {
        this.inputEditText.setImeOptions(i);
    }

    public void setOnInputChangeListener(InputText$MediaBrowserCompat$ItemReceiver inputText$MediaBrowserCompat$ItemReceiver) {
        this.RatingCompat = inputText$MediaBrowserCompat$ItemReceiver;
    }

    public void setOnFocusChangeListener(InputText$MediaBrowserCompat$ItemReceiver inputText$MediaBrowserCompat$ItemReceiver) {
        this.MediaBrowserCompat$ItemReceiver = inputText$MediaBrowserCompat$ItemReceiver;
    }

    @OnClick
    public void onClearButtonClick() {
        setText("");
    }
}
