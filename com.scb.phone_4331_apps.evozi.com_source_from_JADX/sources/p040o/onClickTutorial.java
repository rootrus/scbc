package p040o;

import android.os.Build;
import android.view.View;
import android.widget.DatePicker;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: o.onClickTutorial */
final class onClickTutorial extends BankingAgentSuccessActivity<DatePicker.OnDateChangedListener, DatePicker> implements DatePicker.OnDateChangedListener {
    DatePicker MediaBrowserCompat$CustomActionResultReceiver;
    private Object MediaDescriptionCompat;
    private onClickTutorial$MediaBrowserCompat$CustomActionResultReceiver RatingCompat;

    protected onClickTutorial(String str, String str2) {
        super(str, str2);
    }

    private static DatePicker.OnDateChangedListener write(DatePicker datePicker) {
        Field field;
        try {
            Class cls = datePicker.getClass();
            while (cls != DatePicker.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mDelegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(datePicker);
            if (obj.getClass().getCanonicalName().equals("android.widget.DatePickerCalendarDelegate")) {
                field = Class.forName("android.widget.DatePickerCalendarDelegate").getDeclaredField("mDateChangedListener");
            } else {
                field = Class.forName("android.widget.DatePicker$AbstractDatePickerDelegate").getDeclaredField("mOnDateChangedListener");
            }
            field.setAccessible(true);
            return (DatePicker.OnDateChangedListener) field.get(obj);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return null;
        }
    }

    public final void read(View view) {
        if (!(view instanceof DatePicker)) {
            MyECouponActivity_ViewBinding.write("The view should be an instance of DatePicker");
            return;
        }
        DatePicker datePicker = (DatePicker) view;
        this.MediaBrowserCompat$CustomActionResultReceiver = datePicker;
        T write = write(datePicker);
        if (write != this) {
            this.IconCompatParcelizer = write;
            write(this.MediaBrowserCompat$CustomActionResultReceiver, this, true);
        }
    }

    public final void write(View view) throws ClassCastException {
        super.write(view);
        write((DatePicker) view, (DatePicker.OnDateChangedListener) this.IconCompatParcelizer, false);
    }

    private void write(DatePicker datePicker, DatePicker.OnDateChangedListener onDateChangedListener, boolean z) {
        Field field;
        try {
            Class cls = datePicker.getClass();
            while (cls != DatePicker.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mDelegate");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(datePicker);
            if (obj.getClass().getCanonicalName().equals("android.widget.DatePickerCalendarDelegate")) {
                Class<?> cls2 = Class.forName("android.widget.DatePickerCalendarDelegate");
                field = cls2.getDeclaredField("mDateChangedListener");
                if (Build.VERSION.SDK_INT == 21) {
                    if (z) {
                        Class<?> cls3 = Class.forName("android.widget.OnDateChangedListener");
                        if (this.RatingCompat == null) {
                            this.RatingCompat = new onClickTutorial$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0);
                        }
                        this.MediaDescriptionCompat = IconCompatParcelizer(cls3, this.RatingCompat);
                        Method declaredMethod = cls2.getDeclaredMethod("registerOnDateChangedListener", new Class[]{cls3});
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(obj, new Object[]{this.MediaDescriptionCompat});
                    } else {
                        Method declaredMethod2 = cls2.getDeclaredMethod("unregisterOnDateChangedListener", new Class[]{Class.forName("android.widget.OnDateChangedListener")});
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(obj, new Object[]{this.MediaDescriptionCompat});
                    }
                }
            } else {
                field = Class.forName("android.widget.DatePicker$AbstractDatePickerDelegate").getDeclaredField("mOnDateChangedListener");
            }
            field.setAccessible(true);
            field.set(obj, onDateChangedListener);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }

    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        if (this.IconCompatParcelizer != null) {
            ((DatePicker.OnDateChangedListener) this.IconCompatParcelizer).onDateChanged(datePicker, i, i2, i3);
        }
        MediaBrowserCompat$ItemReceiver(BankingActionActivity.read(i, i2, i3));
    }

    private static <T> Object IconCompatParcelizer(Class<T> cls, InvocationHandler invocationHandler) {
        Object obj = null;
        try {
            obj = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
            if (obj != null) {
                return obj;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Can't create proxy class for ");
            sb.append(cls.getSimpleName());
            sb.append(" interface");
            throw new ClassNotFoundException(sb.toString());
        } catch (ClassNotFoundException e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
    }
}
