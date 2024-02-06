package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import java.util.regex.Pattern;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class NoteEditText extends RelativeLayout {
    private float IconCompatParcelizer;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver;
    private final TextWatcher MediaDescriptionCompat;
    private String RatingCompat;
    @BindView
    ImageButton mClearButton;
    @BindView
    public TextView mErrorText;
    @BindView
    public EditText mNoteEditText;
    @BindView
    TextView mTextCounter;
    @BindView
    TextView mTitleText;
    /* access modifiers changed from: private */
    public IconCompatParcelizer read;
    /* access modifiers changed from: private */
    public int write;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);
    }

    /* access modifiers changed from: protected */
    public int MediaBrowserCompat$CustomActionResultReceiver() {
        return R.layout.f80652131493290;
    }

    public NoteEditText(Context context) {
        this(context, (AttributeSet) null);
    }

    public NoteEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NoteEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaDescriptionCompat = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i = 0;
                NoteEditText.this.mTextCounter.setText(NoteEditText.this.getContext().getString(R.string.text_counter, new Object[]{Integer.valueOf(editable.length()), Integer.valueOf(NoteEditText.this.write)}));
                NoteEditText.this.IconCompatParcelizer();
                ImageButton imageButton = NoteEditText.this.mClearButton;
                if (TextUtils.isEmpty(editable)) {
                    i = 4;
                }
                imageButton.setVisibility(i);
                if (NoteEditText.this.read != null) {
                    if (Pattern.compile(NoteEditText.this.MediaBrowserCompat$CustomActionResultReceiver).matcher(editable.toString()).matches() || editable.toString().isEmpty()) {
                        NoteEditText.this.IconCompatParcelizer();
                    } else {
                        NoteEditText.this.write();
                    }
                    NoteEditText.this.read.MediaBrowserCompat$CustomActionResultReceiver(Pattern.compile(NoteEditText.this.MediaBrowserCompat$CustomActionResultReceiver).matcher(editable.toString()).matches());
                }
            }
        };
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.NoteEditText);
            this.write = obtainStyledAttributes.getInteger(2, 40);
            this.IconCompatParcelizer = obtainStyledAttributes.getFloat(1, 40.0f);
            this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getString(0);
            this.RatingCompat = obtainStyledAttributes.getString(4);
            this.MediaBrowserCompat$MediaItem = obtainStyledAttributes.getColor(3, setLastBaselineToBottomHeight.read(context, R.color.f66092131099764));
            this.MediaBrowserCompat$SearchResultReceiver = (int) (((float) obtainStyledAttributes.getDimensionPixelSize(5, context.getResources().getDimensionPixelSize(R.dimen.f72302131165354))) / getContext().getResources().getDisplayMetrics().scaledDensity);
            obtainStyledAttributes.recycle();
        }
        LayoutInflater.from(getContext()).inflate(MediaBrowserCompat$CustomActionResultReceiver(), this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.mNoteEditText.setInputType(524288);
        this.mNoteEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.write)});
        ViewGroup.LayoutParams layoutParams = this.mNoteEditText.getLayoutParams();
        if (this.write > 40) {
            float f = getContext().getResources().getDisplayMetrics().density;
            int i2 = (int) ((8.0f * f) + 0.5f);
            layoutParams.height = (int) ((this.IconCompatParcelizer * f) + 0.5f);
            this.mNoteEditText.setSingleLine(false);
            this.mNoteEditText.setGravity(48);
            EditText editText = this.mNoteEditText;
            editText.setPadding(editText.getPaddingLeft(), i2, this.mNoteEditText.getPaddingRight(), i2);
            this.mTitleText.setText(getContext().getString(R.string.gift_input_message_title));
        }
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            this.mNoteEditText.setHint(str);
        }
        String str2 = this.RatingCompat;
        if (str2 != null) {
            this.mTitleText.setText(str2);
        }
        int i3 = this.MediaBrowserCompat$MediaItem;
        if (i3 != 0) {
            this.mTitleText.setTextColor(i3);
        }
        int i4 = this.MediaBrowserCompat$SearchResultReceiver;
        if (i4 != 0) {
            this.mTitleText.setTextSize((float) i4);
        }
        this.mNoteEditText.setLayoutParams(layoutParams);
        this.mTextCounter.setText(getContext().getString(R.string.text_counter, new Object[]{0, Integer.valueOf(this.write)}));
        this.mNoteEditText.removeTextChangedListener(this.MediaDescriptionCompat);
        this.mNoteEditText.addTextChangedListener(this.MediaDescriptionCompat);
    }

    public void setOnNoteInputListener(IconCompatParcelizer iconCompatParcelizer, String str, boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = iconCompatParcelizer;
        if (z) {
            this.mNoteEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.write), new InputFilter.AllCaps()});
            return;
        }
        this.mNoteEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.write)});
    }

    public void IconCompatParcelizer() {
        this.mErrorText.setVisibility(8);
        this.mNoteEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public void write() {
        this.mErrorText.setVisibility(0);
        this.mNoteEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public void setErrorMessage(String str) {
        this.mErrorText.setText(str);
    }

    @OnClick
    public void onClickClear() {
        this.mNoteEditText.setText("");
    }

    public void setText(String str) {
        this.mNoteEditText.setText(str);
    }

    public void setNoteEnabled(boolean z) {
        this.mNoteEditText.setEnabled(z);
    }

    public boolean requestFocus(int i, Rect rect) {
        this.mNoteEditText.requestFocus();
        return super.requestFocus(i, rect);
    }
}
