package com.prolificinteractive.materialcalendarview;

import android.animation.Animator;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.prolificinteractive.materialcalendarview.format.TitleFormatter;

class TitleChanger {
    public static final int DEFAULT_ANIMATION_DELAY = 400;
    public static final int DEFAULT_Y_TRANSLATION_DP = 20;
    private final int animDelay;
    /* access modifiers changed from: private */
    public final int animDuration;
    /* access modifiers changed from: private */
    public final Interpolator interpolator = new DecelerateInterpolator(2.0f);
    private long lastAnimTime = 0;
    /* access modifiers changed from: private */
    public int orientation = 0;
    private CalendarDay previousMonth = null;
    /* access modifiers changed from: private */
    public final TextView title;
    private TitleFormatter titleFormatter;
    private final int translate;

    public TitleChanger(TextView textView) {
        this.title = textView;
        Resources resources = textView.getResources();
        this.animDelay = DEFAULT_ANIMATION_DELAY;
        this.animDuration = resources.getInteger(17694720) / 2;
        this.translate = (int) TypedValue.applyDimension(1, 20.0f, resources.getDisplayMetrics());
    }

    public void change(CalendarDay calendarDay) {
        long currentTimeMillis = System.currentTimeMillis();
        if (calendarDay != null) {
            if (TextUtils.isEmpty(this.title.getText()) || currentTimeMillis - this.lastAnimTime < ((long) this.animDelay)) {
                doChange(currentTimeMillis, calendarDay, false);
            }
            if (calendarDay.equals(this.previousMonth)) {
                return;
            }
            if (calendarDay.getMonth() != this.previousMonth.getMonth() || calendarDay.getYear() != this.previousMonth.getYear()) {
                doChange(currentTimeMillis, calendarDay, true);
            }
        }
    }

    private void doChange(long j, CalendarDay calendarDay, boolean z) {
        this.title.animate().cancel();
        doTranslation(this.title, 0);
        this.title.setAlpha(1.0f);
        this.lastAnimTime = j;
        final CharSequence format = this.titleFormatter.format(calendarDay);
        if (!z) {
            this.title.setText(format);
        } else {
            final int i = this.translate * (this.previousMonth.isBefore(calendarDay) ? 1 : -1);
            ViewPropertyAnimator animate = this.title.animate();
            if (this.orientation == 1) {
                animate.translationX((float) (-i));
            } else {
                animate.translationY((float) (-i));
            }
            animate.alpha(BitmapDescriptorFactory.HUE_RED).setDuration((long) this.animDuration).setInterpolator(this.interpolator).setListener(new AnimatorListener() {
                public void onAnimationCancel(Animator animator) {
                    TitleChanger titleChanger = TitleChanger.this;
                    titleChanger.doTranslation(titleChanger.title, 0);
                    TitleChanger.this.title.setAlpha(1.0f);
                }

                public void onAnimationEnd(Animator animator) {
                    TitleChanger.this.title.setText(format);
                    TitleChanger titleChanger = TitleChanger.this;
                    titleChanger.doTranslation(titleChanger.title, i);
                    ViewPropertyAnimator animate = TitleChanger.this.title.animate();
                    if (TitleChanger.this.orientation == 1) {
                        animate.translationX(BitmapDescriptorFactory.HUE_RED);
                    } else {
                        animate.translationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    animate.alpha(1.0f).setDuration((long) TitleChanger.this.animDuration).setInterpolator(TitleChanger.this.interpolator).setListener(new AnimatorListener()).start();
                }
            }).start();
        }
        this.previousMonth = calendarDay;
    }

    /* access modifiers changed from: private */
    public void doTranslation(TextView textView, int i) {
        if (this.orientation == 1) {
            textView.setTranslationX((float) i);
        } else {
            textView.setTranslationY((float) i);
        }
    }

    public TitleFormatter getTitleFormatter() {
        return this.titleFormatter;
    }

    public void setTitleFormatter(TitleFormatter titleFormatter2) {
        this.titleFormatter = titleFormatter2;
    }

    public void setOrientation(int i) {
        this.orientation = i;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setPreviousMonth(CalendarDay calendarDay) {
        this.previousMonth = calendarDay;
    }
}
