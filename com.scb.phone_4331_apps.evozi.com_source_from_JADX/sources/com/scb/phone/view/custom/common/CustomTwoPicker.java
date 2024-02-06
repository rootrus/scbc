package com.scb.phone.view.custom.common;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.TypeCastException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ISprintService;
import p040o.RegistrationMethods;
import p040o.StreetViewPanoramaFragment;
import p040o.failOverNotificationUserLog;
import p040o.findFragmentByWho;
import p040o.onGetStartedClick;
import p040o.onReceive;
import p040o.putOpenGift;
import p040o.setNavigationContentDescription;

public final class CustomTwoPicker extends LinearLayoutCompat implements NumberPicker.OnValueChangeListener {
    private putOpenGift MediaBrowserCompat$CustomActionResultReceiver;
    private ArrayList<TextView> MediaBrowserCompat$ItemReceiver = new ArrayList<>();
    private ArrayList<failOverNotificationUserLog> read = new ArrayList<>();
    private ArrayList<NumberPicker> write = new ArrayList<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTwoPicker(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        write();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTwoPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
        write();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CustomTwoPicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) attributeSet, "attrs");
        write();
    }

    private final void write() {
        setOrientation(0);
        setGravity(17);
        LayoutInflater.from(getContext()).inflate(R.layout.f92952131494524, this);
        setPadding(getResources().getDimensionPixelOffset(R.dimen.f72492131165418), 0, getResources().getDimensionPixelOffset(R.dimen.f72492131165418), 0);
    }

    public static /* synthetic */ void setLoop$default(CustomTwoPicker customTwoPicker, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        customTwoPicker.setLoop(z, str);
    }

    public final void setLoop(boolean z, String str) {
        onGetStartedClick.write((Object) str, "idSection");
        if (str.length() > 0) {
            NumberPicker read2 = read(str);
            if (read2 != null) {
                read2.setWrapSelectorWheel(z);
                return;
            }
            return;
        }
        for (NumberPicker wrapSelectorWheel : this.write) {
            wrapSelectorWheel.setWrapSelectorWheel(z);
        }
    }

    public static /* synthetic */ void setSelected$default(CustomTwoPicker customTwoPicker, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = "";
        }
        customTwoPicker.setSelected(i, str);
    }

    public final void setSelected(int i, String str) {
        onGetStartedClick.write((Object) str, "tagNumberPicker");
        if (i >= 0) {
            if (str.length() > 0) {
                NumberPicker read2 = read(str);
                if (read2 != null) {
                    read2.setValue(i);
                    return;
                }
                return;
            }
            for (NumberPicker value : this.write) {
                value.setValue(i);
            }
        }
    }

    public final void setMaxValue(int i, String str) {
        NumberPicker read2;
        onGetStartedClick.write((Object) str, "tagNumberPicker");
        if (i >= 0 && (read2 = read(str)) != null) {
            read2.setMaxValue(i);
        }
    }

    public final void setMinValue(int i, String str) {
        NumberPicker read2;
        onGetStartedClick.write((Object) str, "tagNumberPicker");
        if (i >= 0 && (read2 = read(str)) != null) {
            read2.setMinValue(i);
        }
    }

    public static /* synthetic */ void setEnable$default(CustomTwoPicker customTwoPicker, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        customTwoPicker.setEnable(z, str);
    }

    public final void setEnable(boolean z, String str) {
        Object obj;
        onGetStartedClick.write((Object) str, "tagNumberPicker");
        if (str.length() == 0) {
            for (View view : this.MediaBrowserCompat$ItemReceiver) {
                view.setEnabled(z);
                if (z) {
                    view.setAlpha(1.0f);
                } else {
                    view.setAlpha(0.5f);
                }
            }
            for (View view2 : this.write) {
                view2.setEnabled(z);
                if (z) {
                    view2.setAlpha(1.0f);
                } else {
                    view2.setAlpha(0.5f);
                }
            }
            return;
        }
        NumberPicker read2 = read(str);
        if (read2 != null) {
            View view3 = read2;
            view3.setEnabled(z);
            if (z) {
                view3.setAlpha(1.0f);
            } else {
                view3.setAlpha(0.5f);
            }
        }
        Iterator it = this.MediaBrowserCompat$ItemReceiver.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver(((TextView) obj).getTag(), (Object) str)) {
                break;
            }
        }
        TextView textView = (TextView) obj;
        if (textView != null) {
            View view4 = textView;
            view4.setEnabled(z);
            if (z) {
                view4.setAlpha(1.0f);
            } else {
                view4.setAlpha(0.5f);
            }
        }
    }

    public final void setOnSelectedLister(putOpenGift putopengift) {
        onGetStartedClick.write((Object) putopengift, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.MediaBrowserCompat$CustomActionResultReceiver = putopengift;
    }

    private static String[] read(String[] strArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str.length() > 10 && str.length() >= 3) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    String substring = str.substring(0, 7);
                    onGetStartedClick.IconCompatParcelizer((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    sb.append(substring);
                    sb.append("...");
                    str = sb.toString();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            strArr[i] = str;
        }
        return strArr;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        Object obj;
        onGetStartedClick.write((Object) numberPicker, "picker");
        Iterator it = this.read.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) ((failOverNotificationUserLog) obj).read, numberPicker.getTag())) {
                break;
            }
        }
        failOverNotificationUserLog failovernotificationuserlog = (failOverNotificationUserLog) obj;
        if (failovernotificationuserlog == null) {
            return;
        }
        if (this.read.indexOf(failovernotificationuserlog) == 0) {
            putOpenGift putopengift = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (putopengift != null) {
                putopengift.write(new ISprintService(failovernotificationuserlog.read, failovernotificationuserlog.write[i2], i2));
                return;
            }
            return;
        }
        putOpenGift putopengift2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (putopengift2 != null) {
            putopengift2.MediaBrowserCompat$CustomActionResultReceiver(new ISprintService(failovernotificationuserlog.read, failovernotificationuserlog.write[i2], i2));
        }
    }

    private final NumberPicker read(String str) {
        Object obj;
        Iterator it = this.write.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver(((NumberPicker) obj).getTag(), (Object) str)) {
                break;
            }
        }
        return (NumberPicker) obj;
    }

    public static final class read implements findFragmentByWho {
        private read() {
        }

        public /* synthetic */ read(RegistrationMethods registrationMethods) {
        }

        public final Object IconCompatParcelizer(Object obj) {
            onReceive onreceive = (onReceive) obj;
            StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
            streetViewPanoramaFragment.MediaBrowserCompat$CustomActionResultReceiver = onreceive.write;
            streetViewPanoramaFragment.write = onreceive.IconCompatParcelizer;
            streetViewPanoramaFragment.read = onreceive.MediaBrowserCompat$ItemReceiver;
            streetViewPanoramaFragment.IconCompatParcelizer = onreceive.MediaBrowserCompat$CustomActionResultReceiver;
            streetViewPanoramaFragment.MediaBrowserCompat$ItemReceiver = DiskLruCache.VERSION_1.equalsIgnoreCase(onreceive.read);
            streetViewPanoramaFragment.MediaBrowserCompat$SearchResultReceiver = onreceive.RatingCompat;
            streetViewPanoramaFragment.MediaBrowserCompat$MediaItem = onreceive.MediaBrowserCompat$MediaItem;
            return streetViewPanoramaFragment;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(failOverNotificationUserLog failovernotificationuserlog, failOverNotificationUserLog failovernotificationuserlog2) {
        onGetStartedClick.write((Object) failovernotificationuserlog, "leftItem");
        removeAllViews();
        this.write.clear();
        this.read.clear();
        this.MediaBrowserCompat$ItemReceiver.clear();
        this.read.add(failovernotificationuserlog);
        if (failovernotificationuserlog2 != null) {
            this.read.add(failovernotificationuserlog2);
        }
        LinearLayoutCompat.write write2 = new LinearLayoutCompat.write(0, -2, 1.0f);
        LinearLayoutCompat.write write3 = new LinearLayoutCompat.write(-2, -2);
        for (failOverNotificationUserLog failovernotificationuserlog3 : this.read) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setLayoutParams(write2);
            linearLayout.setGravity(17);
            NumberPicker numberPicker = new NumberPicker(getContext());
            numberPicker.setDisplayedValues(read(failovernotificationuserlog3.write));
            numberPicker.setMaxValue(failovernotificationuserlog3.write.length - 1);
            numberPicker.setWrapSelectorWheel(false);
            numberPicker.setTag(failovernotificationuserlog3.read);
            ViewGroup.LayoutParams layoutParams = write3;
            numberPicker.setLayoutParams(layoutParams);
            numberPicker.setDescendantFocusability(393216);
            numberPicker.setOnValueChangedListener(this);
            linearLayout.addView(numberPicker);
            this.write.add(numberPicker);
            if (failovernotificationuserlog3.MediaBrowserCompat$ItemReceiver.length() > 0) {
                TextView textView = new TextView(getContext());
                textView.setText(failovernotificationuserlog3.MediaBrowserCompat$ItemReceiver);
                textView.setTag(failovernotificationuserlog3.read);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setLayoutParams(layoutParams);
                textView.setGravity(1);
                setNavigationContentDescription.read(textView, (int) R.style.f97622131820981);
                linearLayout.addView(textView);
                this.MediaBrowserCompat$ItemReceiver.add(textView);
            }
            addView(linearLayout);
        }
    }
}
