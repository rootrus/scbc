package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.uploadNationalId;

public class CustomAddressInput extends LinearLayout implements TextWatcher, View.OnFocusChangeListener {
    private boolean IconCompatParcelizer;
    private String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private write MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    private IconCompatParcelizer MediaMetadataCompat;
    private read RatingCompat;
    @BindView
    public TextView errorInline;
    @BindView
    public EditText inputTextField;
    @BindView
    TextView mandatorySymbol;
    private List<InputFilter> read;
    @BindView
    TextView titleLabel;
    private int write;

    public interface IconCompatParcelizer {
        void write(boolean z);
    }

    public interface read {
        void IconCompatParcelizer(boolean z);
    }

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public CustomAddressInput(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomAddressInput, 0, 0);
        this.MediaDescriptionCompat = obtainStyledAttributes.getString(4);
        this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getString(1);
        this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(2, false);
        this.write = obtainStyledAttributes.getInt(3, 30);
        this.MediaBrowserCompat$CustomActionResultReceiver = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81032131493329, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setTitleLabel(this.MediaDescriptionCompat);
        setHint(this.MediaBrowserCompat$ItemReceiver);
        this.mandatorySymbol.setVisibility(!this.IconCompatParcelizer ? 8 : i);
        setMaxCharacter(this.write);
        if (this.read == null) {
            this.read = new ArrayList();
        }
        this.read.add(new CustomAddressInput$MediaBrowserCompat$ItemReceiver(this));
        MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver();
        this.inputTextField.setOnEditorActionListener(new uploadNationalId(this));
    }

    public void setOnValueChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        this.inputTextField.addTextChangedListener(this);
        this.MediaMetadataCompat = iconCompatParcelizer;
    }

    public void setOnInputValidateListener(read read2) {
        this.inputTextField.addTextChangedListener(this);
        this.RatingCompat = read2;
    }

    public void setMaxCharacter(int i) {
        if (this.read == null) {
            this.read = new ArrayList();
        }
        this.read.add(new InputFilter.LengthFilter(i));
        MediaBrowserCompat$ItemReceiver();
    }

    public final void read() {
        if (this.read == null) {
            this.read = new ArrayList();
        }
        this.read.add(new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("[^\\u0E01-\\u0E39\\u0E40-\\u0E4C]"));
        MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.read == null) {
            this.read = new ArrayList();
        }
        this.read.add(new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^(?=\\S)[\\u0E00-\\u0E3E\\u0E40-\\u0E4E0-9 _*'\".,#&*()@\\/-]+$"));
        MediaBrowserCompat$ItemReceiver();
    }

    public final void IconCompatParcelizer() {
        if (this.read == null) {
            this.read = new ArrayList();
        }
        this.read.add(new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^(?=\\S)[0-9a-zA-Z _*'\".,#&*()@\\/-]+$"));
        MediaBrowserCompat$ItemReceiver();
    }

    public final void write() {
        if (this.read == null) {
            this.read = new ArrayList();
        }
        this.read.add(new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E4E _*'\".,#&*()@\\/-]+$"));
        MediaBrowserCompat$ItemReceiver();
    }

    private void MediaBrowserCompat$ItemReceiver() {
        List<InputFilter> list = this.read;
        if (list != null) {
            this.inputTextField.setFilters((InputFilter[]) list.toArray(new InputFilter[list.size()]));
        }
    }

    public void setErrorMessage(String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public CustomAddressInput(Context context) {
        super(context);
    }

    public CustomAddressInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setTitleLabel(String str) {
        this.titleLabel.setText(str);
    }

    public void setHint(String str) {
        this.inputTextField.setHint(str);
    }

    public void afterTextChanged(Editable editable) {
        boolean z = true;
        if (this.MediaMetadataCompat != null) {
            if (TextUtils.isEmpty(editable.toString().trim())) {
                this.MediaMetadataCompat.write(false);
            } else {
                this.MediaMetadataCompat.write(true);
            }
        }
        if (this.RatingCompat != null) {
            if (Pattern.compile(this.MediaBrowserCompat$SearchResultReceiver).matcher(editable.toString()).matches() || TextUtils.isEmpty(editable.toString().trim())) {
                this.errorInline.setVisibility(8);
            } else {
                this.errorInline.setVisibility(0);
                this.errorInline.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (!Pattern.compile(this.MediaBrowserCompat$SearchResultReceiver).matcher(editable.toString()).matches() || TextUtils.isEmpty(editable.toString().trim())) {
                z = false;
            }
            this.RatingCompat.IconCompatParcelizer(z);
        }
    }

    public void setRegexPattern(String str) {
        this.MediaBrowserCompat$SearchResultReceiver = str;
    }

    public void setTextValue(String str) {
        if (str != null) {
            this.inputTextField.setText(str.trim());
        }
    }

    public void setOnFocusChanged(write write2) {
        this.inputTextField.setOnFocusChangeListener(this);
        this.MediaBrowserCompat$MediaItem = write2;
    }

    public void onFocusChange(View view, boolean z) {
        write write2 = this.MediaBrowserCompat$MediaItem;
        if (write2 != null) {
            write2.MediaBrowserCompat$CustomActionResultReceiver(z);
        }
    }

    public void setReadOnly(Boolean bool) {
        this.inputTextField.setEnabled(!bool.booleanValue());
        this.inputTextField.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_rounded_rectangle_border_enable_state));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            this.errorInline.setVisibility(8);
            this.inputTextField.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
            return;
        }
        this.errorInline.setVisibility(0);
        this.errorInline.setText(this.MediaBrowserCompat$CustomActionResultReceiver);
        this.inputTextField.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }
}
