package p040o;

import android.view.View;
import android.widget.NumberPicker;
import java.lang.reflect.Field;

/* renamed from: o.clickGenerateQR */
final class clickGenerateQR extends BankingAgentSuccessActivity<NumberPicker.OnValueChangeListener, NumberPicker> implements NumberPicker.OnValueChangeListener {
    protected clickGenerateQR(String str, String str2) {
        super(str, str2);
    }

    private static NumberPicker.OnValueChangeListener MediaBrowserCompat$CustomActionResultReceiver(NumberPicker numberPicker) {
        try {
            Class cls = numberPicker.getClass();
            while (cls != NumberPicker.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mOnValueChangeListener");
            declaredField.setAccessible(true);
            return (NumberPicker.OnValueChangeListener) declaredField.get(numberPicker);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void read(View view) {
        if (!(view instanceof NumberPicker)) {
            MyECouponActivity_ViewBinding.write("View should be a sibling of NumberPicker");
        }
        NumberPicker numberPicker = (NumberPicker) view;
        T MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(numberPicker);
        if (MediaBrowserCompat$CustomActionResultReceiver != this) {
            this.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver;
            numberPicker.setOnValueChangedListener(this);
        }
    }

    public final void write(View view) throws ClassCastException {
        super.write(view);
        ((NumberPicker) view).setOnValueChangedListener((NumberPicker.OnValueChangeListener) this.IconCompatParcelizer);
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        if (this.IconCompatParcelizer != null) {
            ((NumberPicker.OnValueChangeListener) this.IconCompatParcelizer).onValueChange(numberPicker, i, i2);
        }
        MediaBrowserCompat$ItemReceiver(String.valueOf(i2));
    }
}
