package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$MediaBrowserCompat$SearchResultReceiver;
import com.prolificinteractive.materialcalendarview.format.ArrayWeekDayFormatter;
import com.prolificinteractive.materialcalendarview.format.DateFormatTitleFormatter;
import com.prolificinteractive.materialcalendarview.format.DayFormatter;
import com.prolificinteractive.materialcalendarview.format.MonthArrayTitleFormatter;
import com.prolificinteractive.materialcalendarview.format.TitleFormatter;
import com.prolificinteractive.materialcalendarview.format.WeekDayFormatter;
import com.scb.phone.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import p040o.setLastBaselineToBottomHeight;

public class MaterialCalendarView extends ViewGroup {
    private static final int DAY_NAMES_ROW = 1;
    private static final int DEFAULT_DAYS_IN_WEEK = 7;
    private static final int DEFAULT_MAX_WEEKS = 6;
    public static final int DEFAULT_TILE_SIZE_DP = 44;
    private static final TitleFormatter DEFAULT_TITLE_FORMATTER = new DateFormatTitleFormatter();
    public static final int HORIZONTAL = 1;
    public static final int INVALID_TILE_DIMENSION = -10;
    public static final int SELECTION_MODE_MULTIPLE = 2;
    public static final int SELECTION_MODE_NONE = 0;
    public static final int SELECTION_MODE_RANGE = 3;
    public static final int SELECTION_MODE_SINGLE = 1;
    public static final int SHOW_ALL = 7;
    public static final int SHOW_DECORATED_DISABLED = 4;
    public static final int SHOW_DEFAULTS = 4;
    public static final int SHOW_NONE = 0;
    public static final int SHOW_OTHER_MONTHS = 1;
    public static final int SHOW_OUT_OF_RANGE = 2;
    public static final int VERTICAL = 0;
    private int accentColor;
    /* access modifiers changed from: private */
    public CalendarPagerAdapter<?> adapter;
    private boolean allowClickDaysOutsideCurrentMonth;
    private int arrowColor;
    /* access modifiers changed from: private */
    public final DirectionButton buttonFuture;
    /* access modifiers changed from: private */
    public final DirectionButton buttonPast;
    CharSequence calendarContentDescription;
    private CalendarMode calendarMode;
    /* access modifiers changed from: private */
    public CalendarDay currentMonth;
    private final ArrayList<DayViewDecorator> dayViewDecorators;
    private int dividerColor;
    private int dividerSize;
    private boolean enableWeekDivider;
    private boolean enableWeekOfMonthDivider;
    private int firstDayOfWeek;
    private Drawable leftArrowMask;
    private OnDateSelectedListener listener;
    private boolean mDynamicHeightEnabled;
    private CalendarDay maxDate;
    private CalendarDay minDate;
    private OnMonthChangedListener monthListener;
    private final View.OnClickListener onClickListener;
    private final ViewPager.MediaMetadataCompat pageChangeListener;
    /* access modifiers changed from: private */
    public final CalendarPager pager;
    private OnRangeSelectedListener rangeListener;
    private Drawable rightArrowMask;
    @SelectionMode
    private int selectionMode;
    private State state;
    private int tileHeight;
    private int tileWidth;
    private final TextView title;
    /* access modifiers changed from: private */
    public final TitleChanger titleChanger;
    private LinearLayout topbar;

    @Retention(RetentionPolicy.RUNTIME)
    public @interface SelectionMode {
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ShowOtherDates {
    }

    public static boolean showDecoratedDisabled(@ShowOtherDates int i) {
        return (i & 4) != 0;
    }

    public static boolean showOtherMonths(@ShowOtherDates int i) {
        return (i & 1) != 0;
    }

    public static boolean showOutOfRange(@ShowOtherDates int i) {
        return (i & 2) != 0;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public MaterialCalendarView(Context context) {
        this(context, (AttributeSet) null);
    }

    public MaterialCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.dividerSize = 0;
        this.dividerColor = 0;
        this.dayViewDecorators = new ArrayList<>();
        this.onClickListener = new View.OnClickListener() {
            public void onClick(View view) {
                if (view == MaterialCalendarView.this.buttonFuture) {
                    MaterialCalendarView.this.pager.setCurrentItem(MaterialCalendarView.this.pager.getCurrentItem() + 1, true);
                } else if (view == MaterialCalendarView.this.buttonPast) {
                    MaterialCalendarView.this.pager.setCurrentItem(MaterialCalendarView.this.pager.getCurrentItem() - 1, true);
                }
            }
        };
        this.pageChangeListener = new ViewPager.MediaMetadataCompat() {
            public void onPageScrollStateChanged(int i) {
            }

            public void onPageScrolled(int i, float f, int i2) {
            }

            public void onPageSelected(int i) {
                MaterialCalendarView.this.titleChanger.setPreviousMonth(MaterialCalendarView.this.currentMonth);
                MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
                CalendarDay unused = materialCalendarView.currentMonth = materialCalendarView.adapter.getItem(i);
                MaterialCalendarView.this.updateUi();
                MaterialCalendarView materialCalendarView2 = MaterialCalendarView.this;
                materialCalendarView2.dispatchOnMonthChanged(materialCalendarView2.currentMonth);
            }
        };
        this.minDate = null;
        this.maxDate = null;
        this.accentColor = 0;
        this.arrowColor = -16777216;
        this.tileHeight = -10;
        this.tileWidth = -10;
        this.selectionMode = 1;
        this.allowClickDaysOutsideCurrentMonth = true;
        if (Build.VERSION.SDK_INT >= 19) {
            setClipToPadding(false);
            setClipChildren(false);
        } else {
            setClipChildren(true);
            setClipToPadding(true);
        }
        DirectionButton directionButton = new DirectionButton(getContext());
        this.buttonPast = directionButton;
        directionButton.setContentDescription(getContext().getString(C1043R.string.previous));
        this.title = new TextView(getContext());
        DirectionButton directionButton2 = new DirectionButton(getContext());
        this.buttonFuture = directionButton2;
        directionButton2.setContentDescription(getContext().getString(C1043R.string.next));
        this.pager = new CalendarPager(getContext());
        this.buttonPast.setOnClickListener(this.onClickListener);
        this.buttonFuture.setOnClickListener(this.onClickListener);
        TitleChanger titleChanger2 = new TitleChanger(this.title);
        this.titleChanger = titleChanger2;
        titleChanger2.setTitleFormatter(DEFAULT_TITLE_FORMATTER);
        this.pager.setOnPageChangeListener(this.pageChangeListener);
        this.pager.setPageTransformer(false, new ViewPager$MediaBrowserCompat$SearchResultReceiver() {
            public void transformPage(View view, float f) {
                view.setAlpha((float) Math.sqrt((double) (1.0f - Math.abs(f))));
            }
        });
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C1043R.styleable.MaterialCalendarView, 0, 0);
        try {
            int integer = obtainStyledAttributes.getInteger(C1043R.styleable.MaterialCalendarView_mcv_calendarMode, 0);
            this.firstDayOfWeek = obtainStyledAttributes.getInteger(C1043R.styleable.MaterialCalendarView_mcv_firstDayOfWeek, -1);
            this.titleChanger.setOrientation(obtainStyledAttributes.getInteger(C1043R.styleable.MaterialCalendarView_mcv_titleAnimationOrientation, 0));
            if (this.firstDayOfWeek < 0) {
                this.firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            }
            newState().setFirstDayOfWeek(this.firstDayOfWeek).setCalendarDisplayMode(CalendarMode.values()[integer]).commit();
            int layoutDimension = obtainStyledAttributes.getLayoutDimension(C1043R.styleable.MaterialCalendarView_mcv_tileSize, -10);
            if (layoutDimension > -10) {
                setTileSize(layoutDimension);
            }
            int layoutDimension2 = obtainStyledAttributes.getLayoutDimension(C1043R.styleable.MaterialCalendarView_mcv_tileWidth, -10);
            if (layoutDimension2 > -10) {
                setTileWidth(layoutDimension2);
            }
            int layoutDimension3 = obtainStyledAttributes.getLayoutDimension(C1043R.styleable.MaterialCalendarView_mcv_tileHeight, -10);
            if (layoutDimension3 > -10) {
                setTileHeight(layoutDimension3);
            }
            setArrowColor(obtainStyledAttributes.getColor(C1043R.styleable.MaterialCalendarView_mcv_arrowColor, -16777216));
            Drawable drawable = obtainStyledAttributes.getDrawable(C1043R.styleable.MaterialCalendarView_mcv_leftArrowMask);
            setLeftArrowMask(drawable == null ? getResources().getDrawable(C1043R.C1044drawable.mcv_action_previous) : drawable);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(C1043R.styleable.MaterialCalendarView_mcv_rightArrowMask);
            setRightArrowMask(drawable2 == null ? getResources().getDrawable(C1043R.C1044drawable.mcv_action_next) : drawable2);
            setSelectionColor(obtainStyledAttributes.getColor(C1043R.styleable.MaterialCalendarView_mcv_selectionColor, getThemeAccentColor(context)));
            CharSequence[] textArray = obtainStyledAttributes.getTextArray(C1043R.styleable.MaterialCalendarView_mcv_weekDayLabels);
            if (textArray != null) {
                setWeekDayFormatter(new ArrayWeekDayFormatter(textArray));
            }
            CharSequence[] textArray2 = obtainStyledAttributes.getTextArray(C1043R.styleable.MaterialCalendarView_mcv_monthLabels);
            if (textArray2 != null) {
                setTitleFormatter(new MonthArrayTitleFormatter(textArray2));
            }
            setHeaderTextAppearance(obtainStyledAttributes.getResourceId(C1043R.styleable.MaterialCalendarView_mcv_headerTextAppearance, C1043R.C1046style.TextAppearance_MaterialCalendarWidget_Header));
            setWeekDayTextAppearance(obtainStyledAttributes.getResourceId(C1043R.styleable.MaterialCalendarView_mcv_weekDayTextAppearance, C1043R.C1046style.TextAppearance_MaterialCalendarWidget_WeekDay));
            setDateTextAppearance(obtainStyledAttributes.getResourceId(C1043R.styleable.MaterialCalendarView_mcv_dateTextAppearance, C1043R.C1046style.TextAppearance_MaterialCalendarWidget_Date));
            setShowOtherDates(obtainStyledAttributes.getInteger(C1043R.styleable.MaterialCalendarView_mcv_showOtherDates, 4));
            setAllowClickDaysOutsideCurrentMonth(obtainStyledAttributes.getBoolean(C1043R.styleable.MaterialCalendarView_mcv_allowClickDaysOutsideCurrentMonth, true));
            setEnableWeekDivider(obtainStyledAttributes.getBoolean(C1043R.styleable.MaterialCalendarView_mcv_enableWeekDivider, false));
            setEnableWeekOfMonthDivider(obtainStyledAttributes.getBoolean(C1043R.styleable.MaterialCalendarView_mcv_enableWeekOfMonthDivider, false));
            setDividerSize(obtainStyledAttributes.getDimensionPixelOffset(C1043R.styleable.MaterialCalendarView_mcv_dividerSize, getResources().getDimensionPixelOffset(C1043R.dimen.mcv_border_size)));
            setDividerColor(obtainStyledAttributes.getColor(C1043R.styleable.MaterialCalendarView_mcv_dividerColor, setLastBaselineToBottomHeight.read(getContext(), C1043R.color.mcv_border_color)));
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
        this.adapter.setTitleFormatter(DEFAULT_TITLE_FORMATTER);
        this.adapter.setEnableWeekDivider(isEnableWeekDivider());
        this.adapter.setEnableWeekOfMonthDivider(isEnableWeekOfMonthDivider());
        this.adapter.setDividerColor(getDividerColor());
        this.adapter.setDividerSize(getDividerSize());
        setupChildren();
        CalendarDay calendarDay = CalendarDay.today();
        this.currentMonth = calendarDay;
        setCurrentDate(calendarDay);
        if (isInEditMode()) {
            removeView(this.pager);
            MonthView monthView = new MonthView(this, this.currentMonth, getFirstDayOfWeek());
            monthView.setSelectionColor(getSelectionColor());
            monthView.setDateTextAppearance(this.adapter.getDateTextAppearance());
            monthView.setWeekDayTextAppearance(this.adapter.getWeekDayTextAppearance());
            monthView.setShowOtherDates(getShowOtherDates());
            addView(monthView, new LayoutParams(this.calendarMode.visibleWeeksCount + 1));
        }
    }

    private void setupChildren() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.topbar = linearLayout;
        linearLayout.setOrientation(0);
        this.topbar.setClipChildren(false);
        this.topbar.setClipToPadding(false);
        addView(this.topbar, new LayoutParams(1));
        this.buttonPast.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.topbar.addView(this.buttonPast, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.title.setGravity(17);
        this.topbar.addView(this.title, new LinearLayout.LayoutParams(0, -1, 5.0f));
        this.buttonFuture.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.topbar.addView(this.buttonFuture, new LinearLayout.LayoutParams(0, -1, 1.0f));
        this.pager.setId(C1043R.C1045id.mcv_pager);
        this.pager.setOffscreenPageLimit(1);
        addView(this.pager, new LayoutParams(this.calendarMode.visibleWeeksCount + 1));
    }

    /* access modifiers changed from: private */
    public void updateUi() {
        this.titleChanger.change(this.currentMonth);
        this.buttonPast.setEnabled(canGoBack());
        this.buttonFuture.setEnabled(canGoForward());
    }

    public void setSelectionMode(@SelectionMode int i) {
        int i2 = this.selectionMode;
        this.selectionMode = i;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.selectionMode = 0;
                    if (i2 != 0) {
                        clearSelection();
                    }
                } else {
                    clearSelection();
                }
            }
        } else if ((i2 == 2 || i2 == 3) && !getSelectedDates().isEmpty()) {
            setSelectedDate(getSelectedDate());
        }
        CalendarPagerAdapter<?> calendarPagerAdapter = this.adapter;
        if (this.selectionMode == 0) {
            z = false;
        }
        calendarPagerAdapter.setSelectionEnabled(z);
    }

    public void goToPrevious() {
        if (canGoBack()) {
            CalendarPager calendarPager = this.pager;
            calendarPager.setCurrentItem(calendarPager.getCurrentItem() - 1, true);
        }
    }

    public void goToNext() {
        if (canGoForward()) {
            CalendarPager calendarPager = this.pager;
            calendarPager.setCurrentItem(calendarPager.getCurrentItem() + 1, true);
        }
    }

    @SelectionMode
    public int getSelectionMode() {
        return this.selectionMode;
    }

    @Deprecated
    public int getTileSize() {
        return Math.max(this.tileHeight, this.tileWidth);
    }

    public void setTileSize(int i) {
        this.tileWidth = i;
        this.tileHeight = i;
        requestLayout();
    }

    public void setTileSizeDp(int i) {
        setTileSize(dpToPx(i));
    }

    public int getTileHeight() {
        return this.tileHeight;
    }

    public void setTileHeight(int i) {
        this.tileHeight = i;
        requestLayout();
    }

    public void setTileHeightDp(int i) {
        setTileHeight(dpToPx(i));
    }

    public int getTileWidth() {
        return this.tileWidth;
    }

    public void setTileWidth(int i) {
        this.tileWidth = i;
        requestLayout();
    }

    public void setTileWidthDp(int i) {
        setTileWidth(dpToPx(i));
    }

    private int dpToPx(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, getResources().getDisplayMetrics());
    }

    public boolean canGoForward() {
        return this.pager.getCurrentItem() < this.adapter.getCount() - 1;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.pager.dispatchTouchEvent(motionEvent);
    }

    public boolean canGoBack() {
        return this.pager.getCurrentItem() > 0;
    }

    public int getSelectionColor() {
        return this.accentColor;
    }

    public void setSelectionColor(int i) {
        if (i == 0) {
            if (isInEditMode()) {
                i = -7829368;
            } else {
                return;
            }
        }
        this.accentColor = i;
        this.adapter.setSelectionColor(i);
        invalidate();
    }

    public int getArrowColor() {
        return this.arrowColor;
    }

    public void setArrowColor(int i) {
        if (i != 0) {
            this.arrowColor = i;
            this.buttonPast.setColor(i);
            this.buttonFuture.setColor(i);
            invalidate();
        }
    }

    public void setContentDescriptionArrowPast(CharSequence charSequence) {
        this.buttonPast.setContentDescription(charSequence);
    }

    public void setContentDescriptionArrowFuture(CharSequence charSequence) {
        this.buttonFuture.setContentDescription(charSequence);
    }

    public void setContentDescriptionCalendar(CharSequence charSequence) {
        this.calendarContentDescription = charSequence;
    }

    public CharSequence getCalendarContentDescription() {
        CharSequence charSequence = this.calendarContentDescription;
        return charSequence == null ? getContext().getString(C1043R.string.calendar) : charSequence;
    }

    public Drawable getLeftArrowMask() {
        return this.leftArrowMask;
    }

    public void setLeftArrowMask(Drawable drawable) {
        this.leftArrowMask = drawable;
        this.buttonPast.setImageDrawable(drawable);
    }

    public Drawable getRightArrowMask() {
        return this.rightArrowMask;
    }

    public void setRightArrowMask(Drawable drawable) {
        this.rightArrowMask = drawable;
        this.buttonFuture.setImageDrawable(drawable);
    }

    public void setHeaderTextAppearance(int i) {
        this.title.setTextAppearance(getContext(), i);
    }

    public void setDateTextAppearance(int i) {
        this.adapter.setDateTextAppearance(i);
    }

    public void setWeekDayTextAppearance(int i) {
        this.adapter.setWeekDayTextAppearance(i);
    }

    public CalendarDay getSelectedDate() {
        List<CalendarDay> selectedDates = this.adapter.getSelectedDates();
        if (selectedDates.isEmpty()) {
            return null;
        }
        return selectedDates.get(selectedDates.size() - 1);
    }

    public List<CalendarDay> getSelectedDates() {
        return this.adapter.getSelectedDates();
    }

    public void clearSelection() {
        List<CalendarDay> selectedDates = getSelectedDates();
        this.adapter.clearSelections();
        for (CalendarDay dispatchOnDateSelected : selectedDates) {
            dispatchOnDateSelected(dispatchOnDateSelected, false);
        }
    }

    public void setSelectedDate(Calendar calendar) {
        setSelectedDate(CalendarDay.from(calendar));
    }

    public void setSelectedDate(Date date) {
        setSelectedDate(CalendarDay.from(date));
    }

    public void setSelectedDate(CalendarDay calendarDay) {
        clearSelection();
        if (calendarDay != null) {
            setDateSelected(calendarDay, true);
        }
    }

    public void setDateSelected(Calendar calendar, boolean z) {
        setDateSelected(CalendarDay.from(calendar), z);
    }

    public void setDateSelected(Date date, boolean z) {
        setDateSelected(CalendarDay.from(date), z);
    }

    public void setDateSelected(CalendarDay calendarDay, boolean z) {
        if (calendarDay != null) {
            this.adapter.setDateSelected(calendarDay, z);
        }
    }

    public void setCurrentDate(Calendar calendar) {
        setCurrentDate(CalendarDay.from(calendar));
    }

    public void setCurrentDate(Date date) {
        setCurrentDate(CalendarDay.from(date));
    }

    public CalendarDay getCurrentDate() {
        return this.adapter.getItem(this.pager.getCurrentItem());
    }

    public void setCurrentDate(CalendarDay calendarDay) {
        setCurrentDate(calendarDay, true);
    }

    public void setCurrentDate(CalendarDay calendarDay, boolean z) {
        if (calendarDay != null) {
            this.pager.setCurrentItem(this.adapter.getIndexForDay(calendarDay), z);
            updateUi();
        }
    }

    public CalendarDay getMinimumDate() {
        return this.minDate;
    }

    public CalendarDay getMaximumDate() {
        return this.maxDate;
    }

    public void setShowOtherDates(@ShowOtherDates int i) {
        this.adapter.setShowOtherDates(i);
    }

    public void setAllowClickDaysOutsideCurrentMonth(boolean z) {
        this.allowClickDaysOutsideCurrentMonth = z;
    }

    public void setWeekDayFormatter(WeekDayFormatter weekDayFormatter) {
        CalendarPagerAdapter<?> calendarPagerAdapter = this.adapter;
        if (weekDayFormatter == null) {
            weekDayFormatter = WeekDayFormatter.DEFAULT;
        }
        calendarPagerAdapter.setWeekDayFormatter(weekDayFormatter);
    }

    public void setDayFormatter(DayFormatter dayFormatter) {
        CalendarPagerAdapter<?> calendarPagerAdapter = this.adapter;
        if (dayFormatter == null) {
            dayFormatter = DayFormatter.DEFAULT;
        }
        calendarPagerAdapter.setDayFormatter(dayFormatter);
    }

    public void setWeekDayLabels(CharSequence[] charSequenceArr) {
        setWeekDayFormatter(new ArrayWeekDayFormatter(charSequenceArr));
    }

    public void setWeekDayLabels(int i) {
        setWeekDayLabels(getResources().getTextArray(i));
    }

    @ShowOtherDates
    public int getShowOtherDates() {
        return this.adapter.getShowOtherDates();
    }

    public boolean allowClickDaysOutsideCurrentMonth() {
        return this.allowClickDaysOutsideCurrentMonth;
    }

    public void setTitleFormatter(TitleFormatter titleFormatter) {
        if (titleFormatter == null) {
            titleFormatter = DEFAULT_TITLE_FORMATTER;
        }
        this.titleChanger.setTitleFormatter(titleFormatter);
        this.adapter.setTitleFormatter(titleFormatter);
        updateUi();
    }

    public void setTitleMonths(CharSequence[] charSequenceArr) {
        setTitleFormatter(new MonthArrayTitleFormatter(charSequenceArr));
    }

    public void setTitleMonths(int i) {
        setTitleMonths(getResources().getTextArray(i));
    }

    public void setTitleAnimationOrientation(int i) {
        this.titleChanger.setOrientation(i);
    }

    public int getTitleAnimationOrientation() {
        return this.titleChanger.getOrientation();
    }

    public void setTopbarVisible(boolean z) {
        this.topbar.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public boolean getTopbarVisible() {
        return this.topbar.getVisibility() == 0;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.color = getSelectionColor();
        savedState.dateTextAppearance = this.adapter.getDateTextAppearance();
        savedState.weekDayTextAppearance = this.adapter.getWeekDayTextAppearance();
        savedState.showOtherDates = getShowOtherDates();
        savedState.allowClickDaysOutsideCurrentMonth = allowClickDaysOutsideCurrentMonth();
        savedState.minDate = getMinimumDate();
        savedState.maxDate = getMaximumDate();
        savedState.selectedDates = getSelectedDates();
        savedState.firstDayOfWeek = getFirstDayOfWeek();
        savedState.orientation = getTitleAnimationOrientation();
        savedState.selectionMode = getSelectionMode();
        savedState.tileWidthPx = getTileWidth();
        savedState.tileHeightPx = getTileHeight();
        savedState.topbarVisible = getTopbarVisible();
        savedState.calendarMode = this.calendarMode;
        savedState.dynamicHeightEnabled = this.mDynamicHeightEnabled;
        savedState.currentMonth = this.currentMonth;
        savedState.cacheCurrentPosition = this.state.cacheCurrentPosition;
        savedState.enableWeekDivider = this.state.enableWeekDivider;
        savedState.enableWeekOfMonthDivider = this.state.enableWeekOfMonthDivider;
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        newState().setFirstDayOfWeek(savedState.firstDayOfWeek).setCalendarDisplayMode(savedState.calendarMode).setMinimumDate(savedState.minDate).setMaximumDate(savedState.maxDate).isCacheCalendarPositionEnabled(savedState.cacheCurrentPosition).setEnableWeekDivider(savedState.enableWeekDivider).setEnableWeekOfMonthDivider(savedState.enableWeekOfMonthDivider).commit();
        setSelectionColor(savedState.color);
        setDateTextAppearance(savedState.dateTextAppearance);
        setWeekDayTextAppearance(savedState.weekDayTextAppearance);
        setShowOtherDates(savedState.showOtherDates);
        setAllowClickDaysOutsideCurrentMonth(savedState.allowClickDaysOutsideCurrentMonth);
        clearSelection();
        for (CalendarDay dateSelected : savedState.selectedDates) {
            setDateSelected(dateSelected, true);
        }
        setTitleAnimationOrientation(savedState.orientation);
        setTileWidth(savedState.tileWidthPx);
        setTileHeight(savedState.tileHeightPx);
        setTopbarVisible(savedState.topbarVisible);
        setSelectionMode(savedState.selectionMode);
        setDynamicHeightEnabled(savedState.dynamicHeightEnabled);
        setCurrentDate(savedState.currentMonth);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    private void setRangeDates(CalendarDay calendarDay, CalendarDay calendarDay2) {
        CalendarDay calendarDay3 = this.currentMonth;
        this.adapter.setRangeDates(calendarDay, calendarDay2);
        this.currentMonth = calendarDay3;
        if (calendarDay != null) {
            if (!calendarDay.isAfter(calendarDay3)) {
                calendarDay = this.currentMonth;
            }
            this.currentMonth = calendarDay;
        }
        this.pager.setCurrentItem(this.adapter.getIndexForDay(calendarDay3), false);
        updateUi();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        boolean allowClickDaysOutsideCurrentMonth;
        boolean cacheCurrentPosition;
        CalendarMode calendarMode;
        int color;
        CalendarDay currentMonth;
        int dateTextAppearance;
        boolean dynamicHeightEnabled;
        boolean enableWeekDivider;
        boolean enableWeekOfMonthDivider;
        int firstDayOfWeek;
        CalendarDay maxDate;
        CalendarDay minDate;
        int orientation;
        List<CalendarDay> selectedDates;
        int selectionMode;
        int showOtherDates;
        int tileHeightPx;
        int tileWidthPx;
        boolean topbarVisible;
        int weekDayTextAppearance;

        SavedState(Parcelable parcelable) {
            super(parcelable);
            this.color = 0;
            this.dateTextAppearance = 0;
            this.weekDayTextAppearance = 0;
            this.showOtherDates = 4;
            this.allowClickDaysOutsideCurrentMonth = true;
            this.minDate = null;
            this.maxDate = null;
            this.selectedDates = new ArrayList();
            this.firstDayOfWeek = 1;
            this.orientation = 0;
            this.tileWidthPx = -1;
            this.tileHeightPx = -1;
            this.topbarVisible = true;
            this.selectionMode = 1;
            this.dynamicHeightEnabled = false;
            this.calendarMode = CalendarMode.MONTHS;
            this.currentMonth = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.color);
            parcel.writeInt(this.dateTextAppearance);
            parcel.writeInt(this.weekDayTextAppearance);
            parcel.writeInt(this.showOtherDates);
            parcel.writeByte(this.allowClickDaysOutsideCurrentMonth ? (byte) 1 : 0);
            parcel.writeParcelable(this.minDate, 0);
            parcel.writeParcelable(this.maxDate, 0);
            parcel.writeTypedList(this.selectedDates);
            parcel.writeInt(this.firstDayOfWeek);
            parcel.writeInt(this.orientation);
            parcel.writeInt(this.tileWidthPx);
            parcel.writeInt(this.tileHeightPx);
            parcel.writeInt(this.topbarVisible ? 1 : 0);
            parcel.writeInt(this.selectionMode);
            parcel.writeInt(this.dynamicHeightEnabled ? 1 : 0);
            parcel.writeInt(this.calendarMode == CalendarMode.WEEKS ? 1 : 0);
            parcel.writeParcelable(this.currentMonth, 0);
            parcel.writeByte(this.cacheCurrentPosition ? (byte) 1 : 0);
            parcel.writeByte(this.enableWeekDivider ? (byte) 1 : 0);
            parcel.writeByte(this.enableWeekOfMonthDivider ? (byte) 1 : 0);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            boolean z = false;
            this.color = 0;
            this.dateTextAppearance = 0;
            this.weekDayTextAppearance = 0;
            this.showOtherDates = 4;
            this.allowClickDaysOutsideCurrentMonth = true;
            this.minDate = null;
            this.maxDate = null;
            this.selectedDates = new ArrayList();
            this.firstDayOfWeek = 1;
            this.orientation = 0;
            this.tileWidthPx = -1;
            this.tileHeightPx = -1;
            this.topbarVisible = true;
            this.selectionMode = 1;
            this.dynamicHeightEnabled = false;
            this.calendarMode = CalendarMode.MONTHS;
            this.currentMonth = null;
            this.color = parcel.readInt();
            this.dateTextAppearance = parcel.readInt();
            this.weekDayTextAppearance = parcel.readInt();
            this.showOtherDates = parcel.readInt();
            this.allowClickDaysOutsideCurrentMonth = parcel.readByte() != 0;
            ClassLoader classLoader = CalendarDay.class.getClassLoader();
            this.minDate = (CalendarDay) parcel.readParcelable(classLoader);
            this.maxDate = (CalendarDay) parcel.readParcelable(classLoader);
            parcel.readTypedList(this.selectedDates, CalendarDay.CREATOR);
            this.firstDayOfWeek = parcel.readInt();
            this.orientation = parcel.readInt();
            this.tileWidthPx = parcel.readInt();
            this.tileHeightPx = parcel.readInt();
            this.topbarVisible = parcel.readInt() == 1;
            this.selectionMode = parcel.readInt();
            this.dynamicHeightEnabled = parcel.readInt() == 1;
            this.calendarMode = parcel.readInt() == 1 ? CalendarMode.WEEKS : CalendarMode.MONTHS;
            this.currentMonth = (CalendarDay) parcel.readParcelable(classLoader);
            this.cacheCurrentPosition = parcel.readByte() != 0;
            this.enableWeekDivider = parcel.readByte() == 1;
            this.enableWeekOfMonthDivider = parcel.readByte() == 1 ? true : z;
        }
    }

    private static int getThemeAccentColor(Context context) {
        int i = Build.VERSION.SDK_INT >= 21 ? 16843829 : R.attr.colorAccent;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }

    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    public void setDynamicHeightEnabled(boolean z) {
        this.mDynamicHeightEnabled = z;
    }

    public boolean isDynamicHeightEnabled() {
        return this.mDynamicHeightEnabled;
    }

    public void addDecorators(Collection<? extends DayViewDecorator> collection) {
        if (collection != null) {
            this.dayViewDecorators.addAll(collection);
            this.adapter.setDecorators(this.dayViewDecorators);
        }
    }

    public void addDecorators(DayViewDecorator... dayViewDecoratorArr) {
        addDecorators((Collection<? extends DayViewDecorator>) Arrays.asList(dayViewDecoratorArr));
    }

    public void addDecorator(DayViewDecorator dayViewDecorator) {
        if (dayViewDecorator != null) {
            this.dayViewDecorators.add(dayViewDecorator);
            this.adapter.setDecorators(this.dayViewDecorators);
        }
    }

    public void removeDecorators() {
        this.dayViewDecorators.clear();
        this.adapter.setDecorators(this.dayViewDecorators);
    }

    public void removeDecorator(DayViewDecorator dayViewDecorator) {
        this.dayViewDecorators.remove(dayViewDecorator);
        this.adapter.setDecorators(this.dayViewDecorators);
    }

    public void invalidateDecorators() {
        this.adapter.invalidateDecorators();
    }

    public void setOnDateChangedListener(OnDateSelectedListener onDateSelectedListener) {
        this.listener = onDateSelectedListener;
    }

    public void setOnMonthChangedListener(OnMonthChangedListener onMonthChangedListener) {
        this.monthListener = onMonthChangedListener;
    }

    public void setOnRangeSelectedListener(OnRangeSelectedListener onRangeSelectedListener) {
        this.rangeListener = onRangeSelectedListener;
    }

    public void setOnTitleClickListener(View.OnClickListener onClickListener2) {
        this.title.setOnClickListener(onClickListener2);
    }

    /* access modifiers changed from: protected */
    public void dispatchOnDateSelected(CalendarDay calendarDay, boolean z) {
        OnDateSelectedListener onDateSelectedListener = this.listener;
        if (onDateSelectedListener != null) {
            onDateSelectedListener.onDateSelected(this, calendarDay, z);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchOnRangeSelected(CalendarDay calendarDay, CalendarDay calendarDay2) {
        OnRangeSelectedListener onRangeSelectedListener = this.rangeListener;
        ArrayList arrayList = new ArrayList();
        Calendar instance = Calendar.getInstance();
        instance.setTime(calendarDay.getDate());
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(calendarDay2.getDate());
        while (true) {
            if (!instance.before(instance2) && !instance.equals(instance2)) {
                break;
            }
            CalendarDay from = CalendarDay.from(instance);
            this.adapter.setDateSelected(from, true);
            arrayList.add(from);
            instance.add(5, 1);
        }
        if (onRangeSelectedListener != null) {
            onRangeSelectedListener.onRangeSelected(this, arrayList);
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchOnMonthChanged(CalendarDay calendarDay) {
        OnMonthChangedListener onMonthChangedListener = this.monthListener;
        if (onMonthChangedListener != null) {
            onMonthChangedListener.onMonthChanged(this, calendarDay);
        }
    }

    /* access modifiers changed from: protected */
    public void onDateClicked(CalendarDay calendarDay, boolean z) {
        int i = this.selectionMode;
        if (i != 2) {
            if (i != 3) {
                this.adapter.clearSelections();
                this.adapter.setDateSelected(calendarDay, true);
                dispatchOnDateSelected(calendarDay, true);
                return;
            }
            this.adapter.setDateSelected(calendarDay, z);
            if (this.adapter.getSelectedDates().size() > 2) {
                this.adapter.clearSelections();
            } else if (this.adapter.getSelectedDates().size() == 2) {
                List<CalendarDay> selectedDates = this.adapter.getSelectedDates();
                if (selectedDates.get(0).isAfter(selectedDates.get(1))) {
                    dispatchOnRangeSelected(selectedDates.get(1), selectedDates.get(0));
                    return;
                } else {
                    dispatchOnRangeSelected(selectedDates.get(0), selectedDates.get(1));
                    return;
                }
            } else {
                this.adapter.setDateSelected(calendarDay, z);
                dispatchOnDateSelected(calendarDay, z);
                return;
            }
        }
        this.adapter.setDateSelected(calendarDay, z);
        dispatchOnDateSelected(calendarDay, z);
    }

    public void selectRange(CalendarDay calendarDay, CalendarDay calendarDay2) {
        clearSelection();
        if (calendarDay != null && calendarDay2 != null) {
            if (calendarDay.isAfter(calendarDay2)) {
                dispatchOnRangeSelected(calendarDay2, calendarDay);
            } else {
                dispatchOnRangeSelected(calendarDay, calendarDay2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDateClicked(DayView dayView) {
        CalendarDay currentDate = getCurrentDate();
        CalendarDay date = dayView.getDate();
        int month = currentDate.getMonth();
        int month2 = date.getMonth();
        if (this.calendarMode == CalendarMode.MONTHS && this.allowClickDaysOutsideCurrentMonth && month != month2) {
            if (currentDate.isAfter(date)) {
                goToPrevious();
            } else if (currentDate.isBefore(date)) {
                goToNext();
            }
        }
        onDateClicked(dayView.getDate(), !dayView.isChecked());
    }

    public void setEnableWeekDivider(boolean z) {
        this.enableWeekDivider = z;
    }

    public boolean isEnableWeekDivider() {
        return this.enableWeekDivider;
    }

    public void setEnableWeekOfMonthDivider(boolean z) {
        this.enableWeekOfMonthDivider = z;
    }

    public boolean isEnableWeekOfMonthDivider() {
        return this.enableWeekOfMonthDivider;
    }

    public void setDividerSize(int i) {
        this.dividerSize = i;
    }

    public int getDividerSize() {
        return this.dividerSize;
    }

    public void setDividerColor(int i) {
        this.dividerColor = i;
    }

    public int getDividerColor() {
        return this.dividerColor;
    }

    /* access modifiers changed from: protected */
    public void onDateUnselected(CalendarDay calendarDay) {
        dispatchOnDateSelected(calendarDay, false);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(1);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int weekCountBasedOnMode = getWeekCountBasedOnMode();
        if (getTopbarVisible()) {
            weekCountBasedOnMode++;
        }
        int i4 = ((size - paddingLeft) - paddingRight) / 7;
        int i5 = ((size2 - paddingTop) - paddingBottom) / weekCountBasedOnMode;
        int i6 = -1;
        if (this.tileWidth == -10 && this.tileHeight == -10) {
            if (mode == 1073741824 || mode == Integer.MIN_VALUE) {
                if (mode2 == 1073741824) {
                    i4 = Math.min(i4, i5);
                }
            } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
                i4 = i5;
            } else {
                i4 = -1;
                i5 = -1;
            }
            i5 = -1;
            i6 = i4;
            i4 = -1;
        } else {
            int i7 = this.tileWidth;
            if (i7 > 0) {
                i4 = i7;
            }
            int i8 = this.tileHeight;
            if (i8 > 0) {
                i5 = i8;
            }
        }
        if (i6 > 0) {
            i3 = i6;
        } else {
            if (i6 <= 0) {
                if (i4 <= 0) {
                    i4 = dpToPx(44);
                }
                i6 = i4;
                if (i5 <= 0) {
                    i3 = dpToPx(44);
                }
            } else {
                i6 = i4;
            }
            i3 = i5;
        }
        int i9 = i6 * 7;
        setMeasuredDimension(clampSize(getPaddingLeft() + getPaddingRight() + i9, i), clampSize((weekCountBasedOnMode * i3) + getTotalDividerHeight(weekCountBasedOnMode) + getPaddingTop() + getPaddingBottom(), i2));
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(((LayoutParams) childAt.getLayoutParams()).height * i3, 1073741824));
        }
    }

    private int getTotalDividerHeight(int i) {
        if (!isEnableWeekDivider() && !isEnableWeekOfMonthDivider()) {
            return 0;
        }
        if (!isEnableWeekDivider()) {
            i--;
        }
        int dividerSize2 = getDividerSize();
        if (isDynamicHeightEnabled()) {
            i--;
        }
        return dividerSize2 * i;
    }

    private int getWeekCountBasedOnMode() {
        CalendarPagerAdapter<?> calendarPagerAdapter;
        CalendarPager calendarPager;
        int i = this.calendarMode.visibleWeeksCount;
        if (this.calendarMode.equals(CalendarMode.MONTHS) && this.mDynamicHeightEnabled && (calendarPagerAdapter = this.adapter) != null && (calendarPager = this.pager) != null) {
            Calendar calendar = (Calendar) calendarPagerAdapter.getItem(calendarPager.getCurrentItem()).getCalendar().clone();
            calendar.set(5, calendar.getActualMaximum(5));
            calendar.setFirstDayOfWeek(getFirstDayOfWeek());
            i = calendar.get(4);
        }
        return i + 1;
    }

    private static int clampSize(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i : size;
        }
        return Math.min(i, size);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int i6 = (((((i3 - i) - paddingLeft) - paddingRight) - measuredWidth) / 2) + paddingLeft;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                childAt.layout(i6, paddingTop, measuredWidth + i6, measuredHeight);
                paddingTop = measuredHeight;
            }
        }
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(1);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(1);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(MaterialCalendarView.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(MaterialCalendarView.class.getName());
    }

    protected static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i) {
            super(-1, i);
        }
    }

    public void setPagingEnabled(boolean z) {
        this.pager.setPagingEnabled(z);
        updateUi();
    }

    public boolean isPagingEnabled() {
        return this.pager.isPagingEnabled();
    }

    public State state() {
        return this.state;
    }

    public StateBuilder newState() {
        return new StateBuilder();
    }

    public class State {
        /* access modifiers changed from: private */
        public final boolean cacheCurrentPosition;
        /* access modifiers changed from: private */
        public final CalendarMode calendarMode;
        /* access modifiers changed from: private */
        public final int dividerColor;
        /* access modifiers changed from: private */
        public final int dividerSize;
        /* access modifiers changed from: private */
        public final boolean enableWeekDivider;
        /* access modifiers changed from: private */
        public final boolean enableWeekOfMonthDivider;
        /* access modifiers changed from: private */
        public final int firstDayOfWeek;
        /* access modifiers changed from: private */
        public final CalendarDay maxDate;
        /* access modifiers changed from: private */
        public final CalendarDay minDate;

        private State(StateBuilder stateBuilder) {
            this.calendarMode = stateBuilder.calendarMode;
            this.firstDayOfWeek = stateBuilder.firstDayOfWeek;
            this.minDate = stateBuilder.minDate;
            this.maxDate = stateBuilder.maxDate;
            this.cacheCurrentPosition = stateBuilder.cacheCurrentPosition;
            this.enableWeekDivider = stateBuilder.enableWeekDivider;
            this.enableWeekOfMonthDivider = stateBuilder.enableWeekOfMonthDivider;
            this.dividerColor = stateBuilder.dividerColor;
            this.dividerSize = stateBuilder.dividerSize;
        }

        public StateBuilder edit() {
            return new StateBuilder(this);
        }
    }

    public class StateBuilder {
        /* access modifiers changed from: private */
        public boolean cacheCurrentPosition;
        /* access modifiers changed from: private */
        public CalendarMode calendarMode;
        /* access modifiers changed from: private */
        public int dividerColor;
        /* access modifiers changed from: private */
        public int dividerSize;
        /* access modifiers changed from: private */
        public boolean enableWeekDivider;
        /* access modifiers changed from: private */
        public boolean enableWeekOfMonthDivider;
        /* access modifiers changed from: private */
        public int firstDayOfWeek;
        /* access modifiers changed from: private */
        public CalendarDay maxDate;
        /* access modifiers changed from: private */
        public CalendarDay minDate;

        public StateBuilder() {
            this.calendarMode = CalendarMode.MONTHS;
            this.firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            this.cacheCurrentPosition = false;
            this.minDate = null;
            this.maxDate = null;
            this.enableWeekDivider = false;
            this.enableWeekOfMonthDivider = false;
            this.dividerSize = 0;
            this.dividerColor = 0;
        }

        private StateBuilder(State state) {
            this.calendarMode = CalendarMode.MONTHS;
            this.firstDayOfWeek = Calendar.getInstance().getFirstDayOfWeek();
            this.cacheCurrentPosition = false;
            this.minDate = null;
            this.maxDate = null;
            this.enableWeekDivider = false;
            this.enableWeekOfMonthDivider = false;
            this.dividerSize = 0;
            this.dividerColor = 0;
            this.calendarMode = state.calendarMode;
            this.firstDayOfWeek = state.firstDayOfWeek;
            this.minDate = state.minDate;
            this.maxDate = state.maxDate;
            this.cacheCurrentPosition = state.cacheCurrentPosition;
            this.enableWeekDivider = state.enableWeekDivider;
            this.enableWeekOfMonthDivider = state.enableWeekOfMonthDivider;
            this.dividerColor = state.dividerColor;
            this.dividerSize = state.dividerSize;
        }

        public StateBuilder setFirstDayOfWeek(int i) {
            this.firstDayOfWeek = i;
            return this;
        }

        public StateBuilder setCalendarDisplayMode(CalendarMode calendarMode2) {
            this.calendarMode = calendarMode2;
            return this;
        }

        public StateBuilder setMinimumDate(Calendar calendar) {
            setMinimumDate(CalendarDay.from(calendar));
            return this;
        }

        public StateBuilder setMinimumDate(Date date) {
            setMinimumDate(CalendarDay.from(date));
            return this;
        }

        public StateBuilder setMinimumDate(CalendarDay calendarDay) {
            this.minDate = calendarDay;
            return this;
        }

        public StateBuilder setMaximumDate(Calendar calendar) {
            setMaximumDate(CalendarDay.from(calendar));
            return this;
        }

        public StateBuilder setMaximumDate(Date date) {
            setMaximumDate(CalendarDay.from(date));
            return this;
        }

        public StateBuilder setMaximumDate(CalendarDay calendarDay) {
            this.maxDate = calendarDay;
            return this;
        }

        public StateBuilder setEnableWeekDivider(boolean z) {
            this.enableWeekDivider = z;
            return this;
        }

        public StateBuilder setEnableWeekOfMonthDivider(boolean z) {
            this.enableWeekOfMonthDivider = z;
            return this;
        }

        public StateBuilder setDividerSize(int i) {
            this.dividerSize = i;
            return this;
        }

        public StateBuilder setDividerColor(int i) {
            this.dividerColor = i;
            return this;
        }

        public StateBuilder isCacheCalendarPositionEnabled(boolean z) {
            this.cacheCurrentPosition = z;
            return this;
        }

        public void commit() {
            MaterialCalendarView materialCalendarView = MaterialCalendarView.this;
            materialCalendarView.commit(new State(this));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        if (r3.isBefore(r4) == false) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void commit(com.prolificinteractive.materialcalendarview.MaterialCalendarView.State r8) {
        /*
            r7 = this;
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter<?> r0 = r7.adapter
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x007b
            boolean r0 = r8.cacheCurrentPosition
            if (r0 == 0) goto L_0x007b
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter<?> r0 = r7.adapter
            com.prolificinteractive.materialcalendarview.CalendarPager r3 = r7.pager
            int r3 = r3.getCurrentItem()
            com.prolificinteractive.materialcalendarview.CalendarDay r0 = r0.getItem(r3)
            com.prolificinteractive.materialcalendarview.CalendarMode r3 = r7.calendarMode
            com.prolificinteractive.materialcalendarview.CalendarMode r4 = r8.calendarMode
            if (r3 == r4) goto L_0x007c
            com.prolificinteractive.materialcalendarview.CalendarDay r3 = r7.getSelectedDate()
            com.prolificinteractive.materialcalendarview.CalendarMode r4 = r7.calendarMode
            com.prolificinteractive.materialcalendarview.CalendarMode r5 = com.prolificinteractive.materialcalendarview.CalendarMode.MONTHS
            if (r4 != r5) goto L_0x004a
            if (r3 == 0) goto L_0x004a
            java.util.Calendar r4 = r0.getCalendar()
            r4.add(r1, r2)
            com.prolificinteractive.materialcalendarview.CalendarDay r4 = com.prolificinteractive.materialcalendarview.CalendarDay.from((java.util.Calendar) r4)
            boolean r5 = r3.equals(r0)
            if (r5 != 0) goto L_0x0077
            boolean r5 = r3.isAfter(r0)
            if (r5 == 0) goto L_0x007c
            boolean r4 = r3.isBefore(r4)
            if (r4 == 0) goto L_0x007c
            goto L_0x0077
        L_0x004a:
            com.prolificinteractive.materialcalendarview.CalendarMode r4 = r7.calendarMode
            com.prolificinteractive.materialcalendarview.CalendarMode r5 = com.prolificinteractive.materialcalendarview.CalendarMode.WEEKS
            if (r4 != r5) goto L_0x007c
            java.util.Calendar r4 = r0.getCalendar()
            r5 = 7
            r6 = 6
            r4.add(r5, r6)
            com.prolificinteractive.materialcalendarview.CalendarDay r4 = com.prolificinteractive.materialcalendarview.CalendarDay.from((java.util.Calendar) r4)
            if (r3 == 0) goto L_0x0079
            boolean r5 = r3.equals(r0)
            if (r5 != 0) goto L_0x0077
            boolean r5 = r3.equals(r4)
            if (r5 != 0) goto L_0x0077
            boolean r0 = r3.isAfter(r0)
            if (r0 == 0) goto L_0x0079
            boolean r0 = r3.isBefore(r4)
            if (r0 == 0) goto L_0x0079
        L_0x0077:
            r0 = r3
            goto L_0x007c
        L_0x0079:
            r0 = r4
            goto L_0x007c
        L_0x007b:
            r0 = 0
        L_0x007c:
            r7.state = r8
            com.prolificinteractive.materialcalendarview.CalendarMode r3 = r8.calendarMode
            r7.calendarMode = r3
            int r3 = r8.firstDayOfWeek
            r7.firstDayOfWeek = r3
            com.prolificinteractive.materialcalendarview.CalendarDay r3 = r8.minDate
            r7.minDate = r3
            com.prolificinteractive.materialcalendarview.CalendarDay r8 = r8.maxDate
            r7.maxDate = r8
            int[] r8 = com.prolificinteractive.materialcalendarview.MaterialCalendarView.C10394.f2523xd5d4e0
            com.prolificinteractive.materialcalendarview.CalendarMode r3 = r7.calendarMode
            int r3 = r3.ordinal()
            r8 = r8[r3]
            if (r8 == r2) goto L_0x00b2
            if (r8 != r1) goto L_0x00aa
            com.prolificinteractive.materialcalendarview.WeekPagerAdapter r8 = new com.prolificinteractive.materialcalendarview.WeekPagerAdapter
            r8.<init>(r7)
            goto L_0x00b7
        L_0x00aa:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Provided display mode which is not yet implemented"
            r8.<init>(r0)
            throw r8
        L_0x00b2:
            com.prolificinteractive.materialcalendarview.MonthPagerAdapter r8 = new com.prolificinteractive.materialcalendarview.MonthPagerAdapter
            r8.<init>(r7)
        L_0x00b7:
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter<?> r1 = r7.adapter
            if (r1 != 0) goto L_0x00be
            r7.adapter = r8
            goto L_0x00c4
        L_0x00be:
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter r8 = r1.migrateStateAndReturn(r8)
            r7.adapter = r8
        L_0x00c4:
            com.prolificinteractive.materialcalendarview.CalendarPager r8 = r7.pager
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter<?> r1 = r7.adapter
            r8.setAdapter(r1)
            com.prolificinteractive.materialcalendarview.CalendarDay r8 = r7.minDate
            com.prolificinteractive.materialcalendarview.CalendarDay r1 = r7.maxDate
            r7.setRangeDates(r8, r1)
            com.prolificinteractive.materialcalendarview.CalendarPager r8 = r7.pager
            com.prolificinteractive.materialcalendarview.MaterialCalendarView$LayoutParams r1 = new com.prolificinteractive.materialcalendarview.MaterialCalendarView$LayoutParams
            com.prolificinteractive.materialcalendarview.CalendarMode r3 = r7.calendarMode
            int r3 = r3.visibleWeeksCount
            int r3 = r3 + r2
            r1.<init>(r3)
            r8.setLayoutParams(r1)
            int r8 = r7.selectionMode
            if (r8 != r2) goto L_0x00ff
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter<?> r8 = r7.adapter
            java.util.List r8 = r8.getSelectedDates()
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L_0x00ff
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter<?> r8 = r7.adapter
            java.util.List r8 = r8.getSelectedDates()
            r1 = 0
            java.lang.Object r8 = r8.get(r1)
            com.prolificinteractive.materialcalendarview.CalendarDay r8 = (com.prolificinteractive.materialcalendarview.CalendarDay) r8
            goto L_0x0103
        L_0x00ff:
            com.prolificinteractive.materialcalendarview.CalendarDay r8 = com.prolificinteractive.materialcalendarview.CalendarDay.today()
        L_0x0103:
            r7.setCurrentDate((com.prolificinteractive.materialcalendarview.CalendarDay) r8)
            if (r0 == 0) goto L_0x0113
            com.prolificinteractive.materialcalendarview.CalendarPager r8 = r7.pager
            com.prolificinteractive.materialcalendarview.CalendarPagerAdapter<?> r1 = r7.adapter
            int r0 = r1.getIndexForDay(r0)
            r8.setCurrentItem(r0)
        L_0x0113:
            r7.invalidateDecorators()
            r7.updateUi()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.commit(com.prolificinteractive.materialcalendarview.MaterialCalendarView$State):void");
    }

    /* renamed from: com.prolificinteractive.materialcalendarview.MaterialCalendarView$4 */
    static /* synthetic */ class C10394 {

        /* renamed from: $SwitchMap$com$prolificinteractive$materialcalendarview$CalendarMode */
        static final /* synthetic */ int[] f2523xd5d4e0;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.prolificinteractive.materialcalendarview.CalendarMode[] r0 = com.prolificinteractive.materialcalendarview.CalendarMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2523xd5d4e0 = r0
                com.prolificinteractive.materialcalendarview.CalendarMode r1 = com.prolificinteractive.materialcalendarview.CalendarMode.MONTHS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2523xd5d4e0     // Catch:{ NoSuchFieldError -> 0x001d }
                com.prolificinteractive.materialcalendarview.CalendarMode r1 = com.prolificinteractive.materialcalendarview.CalendarMode.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.prolificinteractive.materialcalendarview.MaterialCalendarView.C10394.<clinit>():void");
        }
    }
}
