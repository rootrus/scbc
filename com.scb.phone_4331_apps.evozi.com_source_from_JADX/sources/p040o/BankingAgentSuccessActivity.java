package p040o;

import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import java.lang.reflect.Field;

/* renamed from: o.BankingAgentSuccessActivity */
public abstract class BankingAgentSuccessActivity<T, V> extends setTapIcon<T, V> {
    private Handler MediaBrowserCompat$CustomActionResultReceiver = new Handler(Looper.getMainLooper());
    private BankingAgentSuccessActivity<T, V>.CustomActionResultReceiver MediaMetadataCompat;
    private long RatingCompat;

    /* renamed from: o.BankingAgentSuccessActivity$SlipScreenshot */
    final class SlipScreenshot extends BankingAgentSuccessActivity<TextWatcher, TextView> implements TextWatcher {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        protected SlipScreenshot(String str, String str2) {
            super(str, str2);
        }

        public final void read(View view) {
            if (!(view instanceof TextView)) {
                MyECouponActivity_ViewBinding.write("View should be a TextView sibling");
            }
            TextView textView = (TextView) view;
            textView.removeTextChangedListener(this);
            textView.addTextChangedListener(this);
        }

        public final void write(View view) throws ClassCastException {
            BankingAgentSuccessActivity.super.write(view);
            ((TextView) view).removeTextChangedListener(this);
        }

        public final void afterTextChanged(Editable editable) {
            MediaBrowserCompat$ItemReceiver(editable.toString());
        }
    }

    /* renamed from: o.BankingAgentSuccessActivity$SlipScreenshot_ViewBinding */
    final class SlipScreenshot_ViewBinding extends BankingAgentSuccessActivity<TimePicker.OnTimeChangedListener, TimePicker> implements TimePicker.OnTimeChangedListener {
        protected SlipScreenshot_ViewBinding(String str, String str2) {
            super(str, str2);
        }

        private static TimePicker.OnTimeChangedListener write(TimePicker timePicker) {
            try {
                Class cls = timePicker.getClass();
                while (cls != TimePicker.class) {
                    cls = cls.getSuperclass();
                }
                Field declaredField = cls.getDeclaredField("mDelegate");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(timePicker);
                Field declaredField2 = Class.forName("android.widget.TimePicker$AbstractTimePickerDelegate").getDeclaredField("mOnTimeChangedListener");
                declaredField2.setAccessible(true);
                return (TimePicker.OnTimeChangedListener) declaredField2.get(obj);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final void read(View view) {
            if (!(view instanceof TimePicker)) {
                MyECouponActivity_ViewBinding.write("View should be a sibling of TimePicker");
            }
            TimePicker timePicker = (TimePicker) view;
            T write = write(timePicker);
            if (write != this) {
                this.IconCompatParcelizer = write;
                timePicker.setOnTimeChangedListener(this);
            }
        }

        public final void write(View view) throws ClassCastException {
            ((TimePicker) view).setOnTimeChangedListener((TimePicker.OnTimeChangedListener) this.IconCompatParcelizer);
        }

        public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
            if (this.IconCompatParcelizer != null) {
                ((TimePicker.OnTimeChangedListener) this.IconCompatParcelizer).onTimeChanged(timePicker, i, i2);
            }
            MediaBrowserCompat$ItemReceiver(clickShareSlip.read(i, i2));
        }
    }

    protected BankingAgentSuccessActivity(String str, String str2) {
        super(str, str2);
    }

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$ItemReceiver(String str) {
        read(str, false);
    }

    /* access modifiers changed from: protected */
    public final void read(String str, boolean z) {
        this.RatingCompat = System.currentTimeMillis();
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new C6330x685a5ae0(this, (byte) 0);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(this.MediaMetadataCompat);
        BankingAgentSuccessActivity<T, V>.CustomActionResultReceiver customActionResultReceiver = this.MediaMetadataCompat;
        String str2 = this.write;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        customActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str2;
        customActionResultReceiver.write = str3;
        customActionResultReceiver.IconCompatParcelizer = str;
        customActionResultReceiver.read = z;
        this.MediaBrowserCompat$CustomActionResultReceiver.postDelayed(this.MediaMetadataCompat, 2000);
    }

    public void write(View view) throws ClassCastException {
        BankingAgentSuccessActivity<T, V>.CustomActionResultReceiver customActionResultReceiver;
        if (System.currentTimeMillis() - this.RatingCompat < 150 && (customActionResultReceiver = this.MediaMetadataCompat) != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(customActionResultReceiver);
        }
    }
}
