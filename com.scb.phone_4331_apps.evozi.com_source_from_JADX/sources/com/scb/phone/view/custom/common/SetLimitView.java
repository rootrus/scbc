package com.scb.phone.view.custom.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.getICheckDeserializerRtti;

public class SetLimitView extends LinearLayout {
    /* access modifiers changed from: private */
    public int IconCompatParcelizer;
    /* access modifiers changed from: private */
    public WeakReference<TextView> MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$ItemReceiver;
    @BindView
    TextView endLimit;
    /* access modifiers changed from: private */
    public int read = 0;
    @BindView
    AppCompatSeekBar seekBarLimiter;
    @BindView
    TextView startLimit;
    private int write = 0;

    public SetLimitView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84762131493703, this, true);
        ButterKnife.IconCompatParcelizer(this);
    }

    public void setTextViewToChange(TextView textView) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(textView);
    }

    public void setRangeValues(int i, int i2, int i3) {
        this.read = i;
        this.write = i2;
        this.MediaBrowserCompat$ItemReceiver = i3;
        if (i >= 0 && i2 > 0) {
            TextView textView = this.startLimit;
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance.setMinimumFractionDigits(2);
            currencyInstance.setMaximumFractionDigits(2);
            textView.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format((long) i));
            TextView textView2 = this.endLimit;
            int i4 = this.write;
            NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
            currencyInstance2.setMinimumFractionDigits(2);
            currencyInstance2.setMaximumFractionDigits(2);
            textView2.setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format((long) i4));
            this.seekBarLimiter.setMax(Double.valueOf((double) (this.write - this.read)).intValue());
        }
        this.seekBarLimiter.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (SetLimitView.this.MediaBrowserCompat$CustomActionResultReceiver != null && SetLimitView.this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
                    SetLimitView setLimitView = SetLimitView.this;
                    int unused = setLimitView.IconCompatParcelizer = ((setLimitView.read + i) / SetLimitView.this.MediaBrowserCompat$ItemReceiver) * SetLimitView.this.MediaBrowserCompat$ItemReceiver;
                    int read2 = SetLimitView.this.IconCompatParcelizer;
                    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                    currencyInstance.setMinimumFractionDigits(2);
                    currencyInstance.setMaximumFractionDigits(2);
                    ((TextView) SetLimitView.this.MediaBrowserCompat$CustomActionResultReceiver.get()).setText(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format((long) read2));
                }
            }
        });
    }

    public void setDefaultValue(int i) {
        this.seekBarLimiter.setProgress(i - this.read);
        this.IconCompatParcelizer = i;
    }
}
