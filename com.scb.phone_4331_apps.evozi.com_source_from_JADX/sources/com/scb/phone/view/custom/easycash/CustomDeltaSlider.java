package com.scb.phone.view.custom.easycash;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.getICheckDeserializerRtti;
import p040o.getPerformLoanPayment;
import p040o.publish;
import p040o.putPersonalLimit;
import p040o.setLastBaselineToBottomHeight;

public class CustomDeltaSlider extends RelativeLayout {
    public int IconCompatParcelizer;
    int MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public boolean MediaBrowserCompat$MediaItem;
    @BindView
    ImageButton decreaseButton;
    @BindView
    ImageButton increaseButton;
    @BindView
    TextView maxValueLabel;
    @BindView
    TextView minValueLabel;
    int read;
    @BindView
    AppCompatSeekBar slider;
    @BindView
    TextView valueLabel;
    protected CustomDeltaSlider$MediaBrowserCompat$ItemReceiver write;

    public CustomDeltaSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompat$MediaItem = false;
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f81642131493390, this, true);
        ButterKnife.IconCompatParcelizer(this);
        setBackgroundResource(R.drawable.bg_white_with_border);
    }

    public CustomDeltaSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void read(publish publish, CustomDeltaSlider$MediaBrowserCompat$ItemReceiver customDeltaSlider$MediaBrowserCompat$ItemReceiver) {
        this.write = customDeltaSlider$MediaBrowserCompat$ItemReceiver;
        setMinValue((int) publish.IconCompatParcelizer);
        setMaxValue((int) publish.MediaBrowserCompat$CustomActionResultReceiver);
        this.slider.setMax(100);
        setNewActualValue((int) Math.min(Math.max(publish.write, (double) this.read), (double) this.MediaBrowserCompat$CustomActionResultReceiver));
        setDelta((int) publish.read);
        setSliderListener(this.write);
        write();
        this.write.MediaBrowserCompat$CustomActionResultReceiver((double) this.IconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public void write(int i) {
        this.increaseButton.setOnClickListener(new getPerformLoanPayment(this, i));
        this.decreaseButton.setOnClickListener(new putPersonalLimit(this, i));
    }

    private void write() {
        if (this.IconCompatParcelizer <= this.read && this.decreaseButton.isEnabled()) {
            this.decreaseButton.setEnabled(false);
        }
        if (this.IconCompatParcelizer >= this.MediaBrowserCompat$CustomActionResultReceiver && this.increaseButton.isEnabled()) {
            this.increaseButton.setEnabled(false);
        }
        if (this.IconCompatParcelizer > this.read && !this.decreaseButton.isEnabled()) {
            this.decreaseButton.setEnabled(true);
        }
        if (this.IconCompatParcelizer < this.MediaBrowserCompat$CustomActionResultReceiver && !this.increaseButton.isEnabled()) {
            this.increaseButton.setEnabled(true);
        }
    }

    public void setNewActualValue(int i) {
        int i2 = this.read;
        int min = Math.min(Math.max(i, i2), this.MediaBrowserCompat$CustomActionResultReceiver);
        this.IconCompatParcelizer = min;
        this.valueLabel.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) min));
        write();
        if (this.read == this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.slider.setEnabled(false);
            AppCompatSeekBar appCompatSeekBar = this.slider;
            appCompatSeekBar.setProgress(appCompatSeekBar.getMax());
            return;
        }
        this.slider.setEnabled(true);
        AppCompatSeekBar appCompatSeekBar2 = this.slider;
        double d = (double) this.read;
        appCompatSeekBar2.setProgress((int) (((((double) i) - d) / (((double) this.MediaBrowserCompat$CustomActionResultReceiver) - d)) * 100.0d));
    }

    public void setSliderListener(final CustomDeltaSlider$MediaBrowserCompat$ItemReceiver customDeltaSlider$MediaBrowserCompat$ItemReceiver) {
        this.slider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (CustomDeltaSlider.this.MediaBrowserCompat$MediaItem) {
                    int i2 = CustomDeltaSlider.this.read;
                    int round = Math.round(((float) i) * (((float) (CustomDeltaSlider.this.MediaBrowserCompat$CustomActionResultReceiver - CustomDeltaSlider.this.read)) / 100.0f));
                    CustomDeltaSlider customDeltaSlider = CustomDeltaSlider.this;
                    int read = CustomDeltaSlider.read(customDeltaSlider, Math.round(((float) (i2 + round)) / ((float) customDeltaSlider.MediaBrowserCompat$ItemReceiver)) * CustomDeltaSlider.this.MediaBrowserCompat$ItemReceiver);
                    CustomDeltaSlider.MediaBrowserCompat$CustomActionResultReceiver(CustomDeltaSlider.this, read);
                    customDeltaSlider$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer((double) read);
                }
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
                boolean unused = CustomDeltaSlider.this.MediaBrowserCompat$MediaItem = true;
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                boolean unused = CustomDeltaSlider.this.MediaBrowserCompat$MediaItem = false;
                customDeltaSlider$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver((double) CustomDeltaSlider.this.IconCompatParcelizer);
            }
        });
    }

    public void setDelta(int i) {
        this.MediaBrowserCompat$ItemReceiver = i;
        write(i);
    }

    public void setMinValue(int i) {
        this.read = i;
        this.minValueLabel.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) i));
    }

    public void setMaxValue(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.maxValueLabel.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) i));
    }

    public void setEnable(boolean z) {
        this.decreaseButton.setEnabled(z);
        this.increaseButton.setEnabled(z);
        this.slider.setEnabled(z);
        if (z) {
            this.decreaseButton.setAlpha(1.0f);
            this.increaseButton.setAlpha(1.0f);
            this.slider.setAlpha(1.0f);
        } else {
            this.decreaseButton.setColorFilter(setLastBaselineToBottomHeight.read(getContext(), R.color.f67252131099881));
            this.decreaseButton.setAlpha(0.4f);
            this.increaseButton.setColorFilter(setLastBaselineToBottomHeight.read(getContext(), R.color.f67252131099881));
            this.increaseButton.setAlpha(0.4f);
            this.slider.setAlpha(0.4f);
        }
        write();
    }

    static /* synthetic */ int read(CustomDeltaSlider customDeltaSlider, int i) {
        int i2 = customDeltaSlider.MediaBrowserCompat$CustomActionResultReceiver;
        if (i > i2) {
            return i2;
        }
        int i3 = customDeltaSlider.read;
        return i < i3 ? i3 : i;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CustomDeltaSlider customDeltaSlider, int i) {
        customDeltaSlider.IconCompatParcelizer = i;
        customDeltaSlider.valueLabel.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((double) i));
        customDeltaSlider.write();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        setNewActualValue(this.IconCompatParcelizer + i);
        this.write.MediaBrowserCompat$ItemReceiver((double) this.IconCompatParcelizer);
    }

    public final /* synthetic */ void IconCompatParcelizer(int i) {
        setNewActualValue(this.IconCompatParcelizer - i);
        this.write.MediaBrowserCompat$ItemReceiver((double) this.IconCompatParcelizer);
    }
}
