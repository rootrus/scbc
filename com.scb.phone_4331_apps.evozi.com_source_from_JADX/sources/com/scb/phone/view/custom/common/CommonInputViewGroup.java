package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.CustomEditText;
import java.util.ArrayList;
import java.util.Iterator;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;
import p040o.submitRegistration;

public class CommonInputViewGroup extends RelativeLayout {
    public CommonInputViewGroup$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    public ArrayList<TextWatcher> MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    private final TextWatcher MediaBrowserCompat$MediaItem;
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private C5806x52de8268 MediaMetadataCompat;
    @BindView
    ImageView extraIcon;
    @BindView
    TextView mCounterTextView;
    @BindView
    public ImageButton mEditClearImageButton;
    @BindView
    public ImageButton mEditPencilImageButton;
    @BindView
    public CustomEditText mEditText;
    @BindView
    public TextView mErrorTextView;
    @BindView
    TextView mTitleTextView;
    /* access modifiers changed from: private */
    public DefaultButton read;
    public boolean write;

    /* access modifiers changed from: protected */
    public int IconCompatParcelizer() {
        return R.layout.f80612131493286;
    }

    public void setDefaultButton(DefaultButton defaultButton) {
        this.read = defaultButton;
    }

    public CommonInputViewGroup(Context context) {
        this(context, (AttributeSet) null);
    }

    public CommonInputViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CommonInputViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompat$ItemReceiver = 20;
        int i2 = 0;
        this.MediaBrowserCompat$SearchResultReceiver = false;
        this.write = false;
        this.IconCompatParcelizer = null;
        this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$MediaItem = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                CommonInputViewGroup.this.mCounterTextView.setText(CommonInputViewGroup.this.getContext().getString(R.string.text_counter, new Object[]{Integer.valueOf(editable.length()), Integer.valueOf(CommonInputViewGroup.this.MediaBrowserCompat$ItemReceiver)}));
                if (CommonInputViewGroup.this.read == null) {
                    return;
                }
                if (editable.length() <= 0 || editable.length() > CommonInputViewGroup.this.MediaBrowserCompat$ItemReceiver) {
                    CommonInputViewGroup.this.read.setButtonEnabled(false);
                } else {
                    CommonInputViewGroup.this.read.setButtonEnabled(true);
                }
            }
        };
        LayoutInflater.from(getContext()).inflate(IconCompatParcelizer(), this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CommonInputViewGroup, 0, 0);
            try {
                this.MediaBrowserCompat$SearchResultReceiver = obtainStyledAttributes.getBoolean(2, false);
                this.write = obtainStyledAttributes.getBoolean(0, false);
                this.MediaBrowserCompat$ItemReceiver = obtainStyledAttributes.getInteger(3, 20);
                this.mTitleTextView.setText(obtainStyledAttributes.getString(9));
                this.mEditText.setHint(obtainStyledAttributes.getString(5));
                this.mErrorTextView.setText(obtainStyledAttributes.getString(4));
                int integer = obtainStyledAttributes.getInteger(8, 1);
                if (integer == 131072) {
                    this.mEditText.setSingleLine(false);
                    this.mEditText.setInputType(integer | 1);
                } else {
                    this.mEditText.setInputType(integer);
                }
                this.mEditText.setImeOptions(obtainStyledAttributes.getInteger(7, 6));
                int resourceId = obtainStyledAttributes.getResourceId(6, 0);
                if (resourceId != 0) {
                    this.extraIcon.setImageResource(resourceId);
                    this.extraIcon.setVisibility(0);
                    this.extraIcon.setOnClickListener(new submitRegistration(this));
                } else {
                    this.extraIcon.setVisibility(8);
                }
                if (this.MediaBrowserCompat$ItemReceiver > 0) {
                    this.mEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.MediaBrowserCompat$ItemReceiver)});
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 != 0) {
                    this.mEditClearImageButton.setImageResource(resourceId2);
                } else {
                    this.mEditClearImageButton.setImageResource(R.drawable.ic_cross_circle);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.mCounterTextView.setText(getContext().getString(R.string.text_counter, new Object[]{0, Integer.valueOf(this.MediaBrowserCompat$ItemReceiver)}));
        if (this.MediaBrowserCompat$SearchResultReceiver) {
            this.mEditText.addTextChangedListener(this.MediaBrowserCompat$MediaItem);
        }
        this.mCounterTextView.setVisibility(this.MediaBrowserCompat$SearchResultReceiver ? 0 : 8);
        this.mEditClearImageButton.setVisibility(!this.write ? 8 : i2);
    }

    public void clearFocus() {
        super.clearFocus();
        this.mErrorTextView.setFocusable(true);
        this.mErrorTextView.setFocusableInTouchMode(true);
        this.mErrorTextView.requestFocus();
    }

    public final void read() {
        ArrayList<TextWatcher> arrayList = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (arrayList != null) {
            Iterator<TextWatcher> it = arrayList.iterator();
            while (it.hasNext()) {
                this.mEditText.removeTextChangedListener(it.next());
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.clear();
        }
    }

    public void setFocusListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mEditText.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setErrorText(String str) {
        this.mErrorTextView.setText(str);
    }

    public void MediaBrowserCompat$CustomActionResultReceiver() {
        this.mErrorTextView.setVisibility(8);
        this.mEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_gray_rounded_rectangle));
    }

    public void MediaBrowserCompat$ItemReceiver() {
        this.mErrorTextView.setVisibility(0);
        this.mEditText.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
    }

    public void setMaxCounter(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public void setText(String str) {
        this.mEditText.setText(str);
    }

    @OnClick
    public void onClickClear() {
        C5806x52de8268 commonInputViewGroup$MediaBrowserCompat$CustomActionResultReceiver = this.MediaMetadataCompat;
        if (commonInputViewGroup$MediaBrowserCompat$CustomActionResultReceiver != null) {
            commonInputViewGroup$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
        } else if (this.write) {
            this.mEditText.setText("");
        }
    }

    public void setOnBackListener(CustomEditText.write write2) {
        this.mEditText.setOnBackListener(write2);
    }

    public void setOnPasteListener(CustomEditText.IconCompatParcelizer iconCompatParcelizer) {
        this.mEditText.setOnPasteListener(iconCompatParcelizer);
    }

    public void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.mEditText.setOnEditorActionListener(onEditorActionListener);
    }

    public void setIconListener(CommonInputViewGroup$MediaBrowserCompat$ItemReceiver commonInputViewGroup$MediaBrowserCompat$ItemReceiver) {
        this.IconCompatParcelizer = commonInputViewGroup$MediaBrowserCompat$ItemReceiver;
    }

    public void setFilter(String str) {
        if (str != null) {
            this.mEditText.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment(str), new InputFilter.LengthFilter(this.MediaBrowserCompat$ItemReceiver)});
        }
    }

    public void setTitle(String str) {
        this.mTitleTextView.setText(str);
    }

    public void setHint(String str) {
        this.mEditText.setHint(str);
    }

    public void setEnabled(boolean z) {
        this.mEditText.setEnabled(z);
        if (z) {
            this.mEditText.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
        } else {
            this.mEditText.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
        }
        super.setEnabled(z);
    }

    public void setPencilEditListener(View.OnClickListener onClickListener) {
        ImageButton imageButton = this.mEditPencilImageButton;
        if (imageButton != null) {
            imageButton.setOnClickListener(onClickListener);
        }
    }

    public void setForegroundFontEnabled(boolean z) {
        this.mEditText.setEnabled(z);
        if (z) {
            this.mTitleTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66092131099764));
            this.mEditText.setHintTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
        } else {
            this.mTitleTextView.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66182131099773));
            this.mEditText.setHintTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f66402131099796));
        }
        super.setEnabled(z);
    }

    public void setClearTextIconListener(C5806x52de8268 commonInputViewGroup$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaMetadataCompat = commonInputViewGroup$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setClearTextIconColorFilter(int i) {
        this.mEditClearImageButton.setColorFilter(setLastBaselineToBottomHeight.read(getContext(), i), PorterDuff.Mode.SRC_ATOP);
    }
}
