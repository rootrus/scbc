package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindCreditLimitDisplayFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomLaserIdInput extends RelativeLayout {
    private write MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public EditText etLaserIdFirst;
    @BindView
    public EditText etLaserIdSecond;
    @BindView
    public EditText etLaserIdThird;
    @BindView
    ImageView laserIdHelpButton;
    @BindView
    public TextView tvLaserIdError;
    @BindView
    TextView tvLaserIdTitle;

    public interface write {
        void ParcelableVolumeInfo();
    }

    public CustomLaserIdInput(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomLaserIdInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomLaserIdInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.f84052131493631, this, true);
        ButterKnife.IconCompatParcelizer(this);
        this.etLaserIdFirst.setFilters(new InputFilter[]{new FragmentBuilder_BindEasycashFeaturesAccountDynamicFragment("^[a-zA-Z .'-]+$")});
        this.etLaserIdFirst.addTextChangedListener(new read(3, this.etLaserIdSecond));
        this.etLaserIdFirst.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(3)});
        this.etLaserIdSecond.addTextChangedListener(new read(7, this.etLaserIdThird));
        this.etLaserIdSecond.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(7)});
        this.etLaserIdThird.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(2)});
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomLaserIdInput, 0, 0);
            try {
                this.tvLaserIdError.setText(obtainStyledAttributes.getString(0));
                this.tvLaserIdTitle.setText(obtainStyledAttributes.getString(1));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void clearFocus() {
        super.clearFocus();
        this.tvLaserIdError.setFocusable(true);
        this.tvLaserIdError.setFocusableInTouchMode(true);
        this.tvLaserIdError.requestFocus();
    }

    public void setFocusListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.etLaserIdFirst.setOnFocusChangeListener(onFocusChangeListener);
        this.etLaserIdSecond.setOnFocusChangeListener(onFocusChangeListener);
        this.etLaserIdThird.setOnFocusChangeListener(onFocusChangeListener);
    }

    public void setError(String str) {
        this.tvLaserIdError.setText(str);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        int i = !z ? R.drawable.shape_red_reounded_reactangle_border : R.drawable.shape_gray_rounded_rectangle;
        this.etLaserIdFirst.setBackground(setLastBaselineToBottomHeight.write(getContext(), i));
        this.etLaserIdSecond.setBackground(setLastBaselineToBottomHeight.write(getContext(), i));
        this.etLaserIdThird.setBackground(setLastBaselineToBottomHeight.write(getContext(), i));
    }

    public final String write() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.etLaserIdFirst.getText().toString());
        sb.append(this.etLaserIdSecond.getText().toString());
        sb.append(this.etLaserIdThird.getText().toString());
        return sb.toString();
    }

    public void setLaserId(String str) {
        this.etLaserIdFirst.setText(str.substring(0, 3));
        this.etLaserIdSecond.setText(str.substring(3, 10));
        this.etLaserIdThird.setText(str.substring(10, 12));
    }

    @OnClick
    public void onLaserIdButtonClicked(View view) {
        write write2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.ParcelableVolumeInfo();
        }
    }

    public void setLaserIdButtonVisibility(boolean z) {
        this.laserIdHelpButton.setVisibility(z ? 0 : 8);
    }

    public void setOnLaserIdListener(write write2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write2;
    }

    class read extends FragmentBuilder_BindCreditLimitDisplayFragment {
        private int MediaBrowserCompat$CustomActionResultReceiver;
        private EditText write;

        public read(int i, EditText editText) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.write = editText;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText;
            if (charSequence.length() == this.MediaBrowserCompat$CustomActionResultReceiver && (editText = this.write) != null && i3 <= 1) {
                editText.requestFocus();
            }
        }
    }
}
