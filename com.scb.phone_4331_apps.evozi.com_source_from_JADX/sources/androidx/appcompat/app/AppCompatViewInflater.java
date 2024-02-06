package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import p040o.AlertController$RecycleListView$MediaBrowserCompat$MediaItem;
import p040o.SwitchCompat;
import p040o.setPopupCallback;
import p040o.setPresenter;
import p040o.setTextAppearance;

public class AppCompatViewInflater {
    private static final String[] IconCompatParcelizer = {"android.widget.", "android.view.", "android.webkit."};
    private static final Map<String, Constructor<? extends View>> MediaBrowserCompat$CustomActionResultReceiver = new setTextAppearance();
    private static final Class<?>[] MediaBrowserCompat$ItemReceiver = {Context.class, AttributeSet.class};
    private static final int[] read = {16843375};
    private final Object[] write = new Object[2];

    /* access modifiers changed from: protected */
    public View read(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* access modifiers changed from: package-private */
    public final View MediaBrowserCompat$ItemReceiver(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = MediaBrowserCompat$CustomActionResultReceiver(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = setPresenter.write(context2);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = MediaSessionCompat$ResultReceiverWrapper(context2, attributeSet);
                read(view2, str);
                break;
            case 1:
                view2 = RatingCompat(context2, attributeSet);
                read(view2, str);
                break;
            case 2:
                view2 = MediaBrowserCompat$CustomActionResultReceiver(context2, attributeSet);
                read(view2, str);
                break;
            case 3:
                view2 = MediaBrowserCompat$ItemReceiver(context2, attributeSet);
                read(view2, str);
                break;
            case 4:
                view2 = MediaSessionCompat$QueueItem(context2, attributeSet);
                read(view2, str);
                break;
            case 5:
                view2 = MediaBrowserCompat$MediaItem(context2, attributeSet);
                read(view2, str);
                break;
            case 6:
                view2 = read(context2, attributeSet);
                read(view2, str);
                break;
            case 7:
                view2 = MediaMetadataCompat(context2, attributeSet);
                read(view2, str);
                break;
            case 8:
                view2 = write(context2, attributeSet);
                read(view2, str);
                break;
            case 9:
                view2 = IconCompatParcelizer(context2, attributeSet);
                read(view2, str);
                break;
            case 10:
                view2 = MediaBrowserCompat$SearchResultReceiver(context2, attributeSet);
                read(view2, str);
                break;
            case 11:
                view2 = MediaDescriptionCompat(context2, attributeSet);
                read(view2, str);
                break;
            case 12:
                view2 = MediaSessionCompat$Token(context2, attributeSet);
                read(view2, str);
                break;
            default:
                view2 = read(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = write(context2, str, attributeSet);
        }
        if (view2 != null) {
            MediaBrowserCompat$CustomActionResultReceiver(view2, attributeSet);
        }
        return view2;
    }

    /* access modifiers changed from: protected */
    public AppCompatTextView MediaSessionCompat$ResultReceiverWrapper(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageView RatingCompat(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatButton MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatEditText MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatSpinner MediaSessionCompat$QueueItem(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatImageButton MediaBrowserCompat$MediaItem(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckBox read(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatRadioButton MediaMetadataCompat(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatCheckedTextView write(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatAutoCompleteTextView IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatMultiAutoCompleteTextView MediaBrowserCompat$SearchResultReceiver(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatRatingBar MediaDescriptionCompat(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public AppCompatSeekBar MediaSessionCompat$Token(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    private void read(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    private View write(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(Promotion.ACTION_VIEW)) {
            str = attributeSet.getAttributeValue((String) null, Name.LABEL);
        }
        try {
            this.write[0] = context;
            this.write[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (String MediaBrowserCompat$ItemReceiver2 : IconCompatParcelizer) {
                    View MediaBrowserCompat$ItemReceiver3 = MediaBrowserCompat$ItemReceiver(context, str, MediaBrowserCompat$ItemReceiver2);
                    if (MediaBrowserCompat$ItemReceiver3 != null) {
                        return MediaBrowserCompat$ItemReceiver3;
                    }
                }
                Object[] objArr = this.write;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View MediaBrowserCompat$ItemReceiver4 = MediaBrowserCompat$ItemReceiver(context, str, (String) null);
            Object[] objArr2 = this.write;
            objArr2[0] = null;
            objArr2[1] = null;
            return MediaBrowserCompat$ItemReceiver4;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.write;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || SwitchCompat.AppCompatActivity(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, read);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new write(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View MediaBrowserCompat$ItemReceiver(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends U> constructor = MediaBrowserCompat$CustomActionResultReceiver.get(str);
        if (constructor == null) {
            try {
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } else {
                    str3 = str;
                }
                constructor = classLoader.loadClass(str3).asSubclass(View.class).getConstructor(MediaBrowserCompat$ItemReceiver);
                MediaBrowserCompat$CustomActionResultReceiver.put(str, constructor);
            } catch (Exception unused) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.write);
    }

    private static Context MediaBrowserCompat$CustomActionResultReceiver(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AlertController$RecycleListView$MediaBrowserCompat$MediaItem.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(AlertController$RecycleListView$MediaBrowserCompat$MediaItem.View_theme, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof setPopupCallback) || ((setPopupCallback) context).MediaBrowserCompat$CustomActionResultReceiver != resourceId) ? new setPopupCallback(context, resourceId) : context;
        }
        return context;
    }

    static class write implements View.OnClickListener {
        private Context IconCompatParcelizer;
        private final View MediaBrowserCompat$CustomActionResultReceiver;
        private final String read;
        private Method write;

        public write(View view, String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = view;
            this.read = str;
        }

        public void onClick(View view) {
            if (this.write == null) {
                MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.getContext(), this.read);
            }
            try {
                this.write.invoke(this.IconCompatParcelizer, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }

        private void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.read, new Class[]{View.class})) != null) {
                        this.write = method;
                        this.IconCompatParcelizer = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.MediaBrowserCompat$CustomActionResultReceiver.getId();
            if (id == -1) {
                str2 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(" with id '");
                sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str2 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not find method ");
            sb2.append(this.read);
            sb2.append("(View) in a parent or ancestor Context for android:onClick ");
            sb2.append("attribute defined on view ");
            sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver.getClass());
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
