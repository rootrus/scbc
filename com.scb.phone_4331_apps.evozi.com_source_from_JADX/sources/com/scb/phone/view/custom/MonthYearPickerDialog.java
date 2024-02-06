package com.scb.phone.view.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import kotlin.TypeCastException;
import p040o.C1246xea60bf60;
import p040o.PlaybackStateCompat;
import p040o.onGetStartedClick;
import p040o.onStart;

public final class MonthYearPickerDialog implements NumberPicker.OnValueChangeListener, View.OnClickListener {
    public final PlaybackStateCompat.CustomAction IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public String[] MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem;
    public String[] MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver();
    public MonthYearDialogViewHolder MediaMetadataCompat;
    public C5796x9ab8a620 read;
    public final Context write;

    public MonthYearPickerDialog(Context context) {
        onGetStartedClick.write((Object) context, "context");
        this.write = context;
        String[] stringArray = context.getResources().getStringArray(R.array.f64832130903062);
        onGetStartedClick.IconCompatParcelizer((Object) stringArray, "context.resources.getStr…ay(R.array.months_number)");
        this.MediaBrowserCompat$ItemReceiver = stringArray;
        View inflate = LayoutInflater.from(this.write).inflate(R.layout.f81912131493417, (ViewGroup) null, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, Promotion.ACTION_VIEW);
        this.MediaMetadataCompat = new MonthYearDialogViewHolder(inflate);
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(this.write, 16974374);
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = inflate;
        String[] strArr = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) strArr, "months");
        this.MediaBrowserCompat$ItemReceiver = strArr;
        ColorChangeableNumberPicker colorChangeableNumberPicker = this.MediaMetadataCompat.monthPicker;
        if (colorChangeableNumberPicker == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthPicker");
        }
        colorChangeableNumberPicker.setMinValue(0);
        ColorChangeableNumberPicker colorChangeableNumberPicker2 = this.MediaMetadataCompat.monthPicker;
        if (colorChangeableNumberPicker2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthPicker");
        }
        colorChangeableNumberPicker2.setMaxValue(this.MediaBrowserCompat$ItemReceiver.length - 1);
        ColorChangeableNumberPicker colorChangeableNumberPicker3 = this.MediaMetadataCompat.monthPicker;
        if (colorChangeableNumberPicker3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthPicker");
        }
        colorChangeableNumberPicker3.setDisplayedValues(this.MediaBrowserCompat$ItemReceiver);
        ColorChangeableNumberPicker colorChangeableNumberPicker4 = this.MediaMetadataCompat.monthPicker;
        if (colorChangeableNumberPicker4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthPicker");
        }
        colorChangeableNumberPicker4.setValue(this.MediaBrowserCompat$CustomActionResultReceiver);
        String[] strArr2 = this.MediaDescriptionCompat;
        onGetStartedClick.write((Object) strArr2, "years");
        this.MediaDescriptionCompat = strArr2;
        ColorChangeableNumberPicker colorChangeableNumberPicker5 = this.MediaMetadataCompat.yearPicker;
        if (colorChangeableNumberPicker5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearPicker");
        }
        colorChangeableNumberPicker5.setMinValue(0);
        ColorChangeableNumberPicker colorChangeableNumberPicker6 = this.MediaMetadataCompat.yearPicker;
        if (colorChangeableNumberPicker6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearPicker");
        }
        colorChangeableNumberPicker6.setMaxValue(this.MediaDescriptionCompat.length - 1);
        ColorChangeableNumberPicker colorChangeableNumberPicker7 = this.MediaMetadataCompat.yearPicker;
        if (colorChangeableNumberPicker7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearPicker");
        }
        colorChangeableNumberPicker7.setDisplayedValues(this.MediaDescriptionCompat);
        ColorChangeableNumberPicker colorChangeableNumberPicker8 = this.MediaMetadataCompat.yearPicker;
        if (colorChangeableNumberPicker8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearPicker");
        }
        colorChangeableNumberPicker8.setValue(this.MediaBrowserCompat$MediaItem);
        PlaybackStateCompat.CustomAction write2 = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        onGetStartedClick.IconCompatParcelizer((Object) write2, "builder.create()");
        this.IconCompatParcelizer = write2;
        write2.setCancelable(false);
        this.IconCompatParcelizer.requestWindowFeature(1);
        ColorChangeableNumberPicker colorChangeableNumberPicker9 = this.MediaMetadataCompat.monthPicker;
        if (colorChangeableNumberPicker9 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("monthPicker");
        }
        colorChangeableNumberPicker9.setOnValueChangedListener(this);
        ColorChangeableNumberPicker colorChangeableNumberPicker10 = this.MediaMetadataCompat.yearPicker;
        if (colorChangeableNumberPicker10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("yearPicker");
        }
        colorChangeableNumberPicker10.setOnValueChangedListener(new NumberPicker.OnValueChangeListener(this) {
            private /* synthetic */ MonthYearPickerDialog write;

            {
                this.write = r1;
            }

            public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
                this.write.MediaBrowserCompat$MediaItem = i2;
            }
        });
        Button button = this.MediaMetadataCompat.btDone;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btDone");
        }
        button.setOnClickListener(this);
    }

    public final class MonthYearDialogViewHolder_ViewBinding implements Unbinder {
        private MonthYearDialogViewHolder write;

        public MonthYearDialogViewHolder_ViewBinding(MonthYearDialogViewHolder monthYearDialogViewHolder, View view) {
            this.write = monthYearDialogViewHolder;
            monthYearDialogViewHolder.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_dialog_title, "field 'tvTitle'", TextView.class);
            monthYearDialogViewHolder.monthPicker = (ColorChangeableNumberPicker) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.month_picker, "field 'monthPicker'", ColorChangeableNumberPicker.class);
            monthYearDialogViewHolder.yearPicker = (ColorChangeableNumberPicker) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.year_picker, "field 'yearPicker'", ColorChangeableNumberPicker.class);
            monthYearDialogViewHolder.btDone = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bt_done, "field 'btDone'", Button.class);
        }

        public final void read() {
            MonthYearDialogViewHolder monthYearDialogViewHolder = this.write;
            if (monthYearDialogViewHolder != null) {
                this.write = null;
                monthYearDialogViewHolder.tvTitle = null;
                monthYearDialogViewHolder.monthPicker = null;
                monthYearDialogViewHolder.yearPicker = null;
                monthYearDialogViewHolder.btDone = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    private static String[] MediaBrowserCompat$CustomActionResultReceiver() {
        int i = GregorianCalendar.getInstance().get(1);
        ArrayList arrayList = new ArrayList();
        int i2 = i + 14;
        if (i <= i2) {
            while (true) {
                String valueOf = String.valueOf(i);
                int length = valueOf.length();
                if (valueOf != null) {
                    String substring = valueOf.substring(length - 2);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.String).substring(startIndex)");
                    arrayList.add(substring);
                    if (i == i2) {
                        break;
                    }
                    i++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final class MonthYearDialogViewHolder {
        @BindView
        public Button btDone;
        @BindView
        public ColorChangeableNumberPicker monthPicker;
        @BindView
        public TextView tvTitle;
        @BindView
        public ColorChangeableNumberPicker yearPicker;

        public MonthYearDialogViewHolder(View view) {
            onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i2;
    }

    public final void onClick(View view) {
        C5796x9ab8a620 monthYearPickerDialog$MediaBrowserCompat$CustomActionResultReceiver = this.read;
        if (monthYearPickerDialog$MediaBrowserCompat$CustomActionResultReceiver != null) {
            String str = this.MediaBrowserCompat$ItemReceiver[this.MediaBrowserCompat$CustomActionResultReceiver];
            onGetStartedClick.IconCompatParcelizer((Object) str, "monthArr[monthIndex]");
            String[] strArr = this.MediaDescriptionCompat;
            int i = this.MediaBrowserCompat$MediaItem;
            monthYearPickerDialog$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(str, strArr[i], this.MediaBrowserCompat$CustomActionResultReceiver, i);
        }
        this.IconCompatParcelizer.dismiss();
    }
}
