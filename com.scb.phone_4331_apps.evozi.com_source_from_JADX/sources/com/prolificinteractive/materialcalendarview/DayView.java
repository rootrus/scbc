package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.widget.CheckedTextView;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.format.DayFormatter;
import java.util.List;

class DayView extends CheckedTextView {
    private final Rect circleDrawableRect = new Rect();
    private Drawable customBackground = null;
    private CalendarDay date;
    private final int fadeTime = getResources().getInteger(17694720);
    private DayFormatter formatter = DayFormatter.DEFAULT;
    private boolean isDecoratedDisabled = false;
    private boolean isInMonth = true;
    private boolean isInRange = true;
    private Drawable mCircleDrawable;
    private int selectionColor = -7829368;
    private Drawable selectionDrawable;
    @MaterialCalendarView.ShowOtherDates
    private int showOtherDates = 4;
    private final Rect tempRect = new Rect();

    public DayView(Context context, CalendarDay calendarDay) {
        super(context);
        setSelectionColor(this.selectionColor);
        setGravity(17);
        if (Build.VERSION.SDK_INT >= 17) {
            setTextAlignment(4);
        }
        setDay(calendarDay);
    }

    public void setDay(CalendarDay calendarDay) {
        this.date = calendarDay;
        setText(getLabel());
    }

    public void setDayFormatter(DayFormatter dayFormatter) {
        if (dayFormatter == null) {
            dayFormatter = DayFormatter.DEFAULT;
        }
        this.formatter = dayFormatter;
        CharSequence text = getText();
        Object[] objArr = null;
        if (text instanceof Spanned) {
            objArr = ((Spanned) text).getSpans(0, text.length(), Object.class);
        }
        SpannableString spannableString = new SpannableString(getLabel());
        if (objArr != null) {
            for (Object span : objArr) {
                spannableString.setSpan(span, 0, spannableString.length(), 33);
            }
        }
        setText(spannableString);
    }

    public String getLabel() {
        return this.formatter.format(this.date);
    }

    public void setSelectionColor(int i) {
        this.selectionColor = i;
        regenerateBackground();
    }

    public void setSelectionDrawable(Drawable drawable) {
        if (drawable == null) {
            this.selectionDrawable = null;
        } else {
            this.selectionDrawable = drawable.getConstantState().newDrawable(getResources());
        }
        regenerateBackground();
    }

    public void setCustomBackground(Drawable drawable) {
        if (drawable == null) {
            this.customBackground = null;
        } else {
            this.customBackground = drawable.getConstantState().newDrawable(getResources());
        }
        invalidate();
    }

    public CalendarDay getDate() {
        return this.date;
    }

    private void setEnabled() {
        int i = 0;
        boolean z = this.isInMonth && this.isInRange && !this.isDecoratedDisabled;
        super.setEnabled(this.isInRange && !this.isDecoratedDisabled);
        boolean showOtherMonths = MaterialCalendarView.showOtherMonths(this.showOtherDates);
        boolean z2 = MaterialCalendarView.showOutOfRange(this.showOtherDates) || showOtherMonths;
        boolean showDecoratedDisabled = MaterialCalendarView.showDecoratedDisabled(this.showOtherDates);
        if (!this.isInMonth && showOtherMonths) {
            z = true;
        }
        if (!this.isInRange && z2) {
            z |= this.isInMonth;
        }
        if (this.isDecoratedDisabled && showDecoratedDisabled) {
            z |= this.isInMonth && this.isInRange;
        }
        if (!this.isInMonth && z) {
            setTextColor(getTextColors().getColorForState(new int[]{-16842910}, -7829368));
        }
        if (!z) {
            i = 4;
        }
        setVisibility(i);
    }

    /* access modifiers changed from: protected */
    public void setupSelection(@MaterialCalendarView.ShowOtherDates int i, boolean z, boolean z2) {
        this.showOtherDates = i;
        this.isInMonth = z2;
        this.isInRange = z;
        setEnabled();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        applyCustomTypeface(i);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        applyCustomTypeface(i);
    }

    private void applyCustomTypeface(int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, C1043R.styleable.MaterialCalendarView);
        if (obtainStyledAttributes != null) {
            String string = obtainStyledAttributes.getString(C1043R.styleable.MaterialCalendarView_mcv_textAppearanceFontPath);
            if (!TextUtils.isEmpty(string)) {
                try {
                    setTypeface(Typeface.createFromAsset(getResources().getAssets(), string));
                } catch (Exception e) {
                    Log.e("DayView", "cannot apply custom font path", e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable drawable = this.customBackground;
        if (drawable != null) {
            drawable.setBounds(this.tempRect);
            this.customBackground.setState(getDrawableState());
            this.customBackground.draw(canvas);
        }
        this.mCircleDrawable.setBounds(this.circleDrawableRect);
        super.onDraw(canvas);
    }

    private void regenerateBackground() {
        Drawable drawable = this.selectionDrawable;
        if (drawable != null) {
            setBackgroundDrawable(drawable);
            return;
        }
        Drawable generateBackground = generateBackground(this.selectionColor, this.fadeTime, this.circleDrawableRect);
        this.mCircleDrawable = generateBackground;
        setBackgroundDrawable(generateBackground);
    }

    private static Drawable generateBackground(int i, int i2, Rect rect) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.setExitFadeDuration(i2);
        stateListDrawable.addState(new int[]{16842912}, generateCircleDrawable(i));
        if (Build.VERSION.SDK_INT >= 21) {
            stateListDrawable.addState(new int[]{16842919}, generateRippleDrawable(i, rect));
        } else {
            stateListDrawable.addState(new int[]{16842919}, generateCircleDrawable(i));
        }
        stateListDrawable.addState(new int[0], generateCircleDrawable(0));
        return stateListDrawable;
    }

    private static Drawable generateCircleDrawable(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    private static Drawable generateRippleDrawable(int i, Rect rect) {
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, generateCircleDrawable(-1));
        if (Build.VERSION.SDK_INT == 21) {
            rippleDrawable.setBounds(rect);
        }
        if (Build.VERSION.SDK_INT == 22) {
            int i2 = (rect.left + rect.right) / 2;
            rippleDrawable.setHotspotBounds(i2, rect.top, i2, rect.bottom);
        }
        return rippleDrawable;
    }

    /* access modifiers changed from: package-private */
    public void applyFacade(DayViewFacade dayViewFacade) {
        this.isDecoratedDisabled = dayViewFacade.areDaysDisabled();
        setEnabled();
        setCustomBackground(dayViewFacade.getBackgroundDrawable());
        setSelectionDrawable(dayViewFacade.getSelectionDrawable());
        List<DayViewFacade.Span> spans = dayViewFacade.getSpans();
        if (!spans.isEmpty()) {
            String label = getLabel();
            SpannableString spannableString = new SpannableString(getLabel());
            for (DayViewFacade.Span span : spans) {
                spannableString.setSpan(span.span, 0, label.length(), 33);
            }
            setText(spannableString);
            return;
        }
        setText(getLabel());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        calculateBounds(i3 - i, i4 - i2);
        regenerateBackground();
    }

    private void calculateBounds(int i, int i2) {
        int min = Math.min(i2, i);
        int abs = Math.abs(i2 - i) / 2;
        int i3 = Build.VERSION.SDK_INT == 21 ? abs / 2 : abs;
        if (i >= i2) {
            this.tempRect.set(abs, 0, min + abs, i2);
            this.circleDrawableRect.set(i3, 0, min + i3, i2);
            return;
        }
        this.tempRect.set(0, abs, i, min + abs);
        this.circleDrawableRect.set(0, i3, i, min + i3);
    }
}
