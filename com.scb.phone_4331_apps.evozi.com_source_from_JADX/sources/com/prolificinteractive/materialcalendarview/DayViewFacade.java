package com.prolificinteractive.materialcalendarview;

import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class DayViewFacade {
    private Drawable backgroundDrawable = null;
    private boolean daysDisabled = false;
    private boolean isDecorated = false;
    private Drawable selectionDrawable = null;
    private final LinkedList<Span> spans = new LinkedList<>();

    DayViewFacade() {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            this.backgroundDrawable = drawable;
            this.isDecorated = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    public void setSelectionDrawable(Drawable drawable) {
        if (drawable != null) {
            this.selectionDrawable = drawable;
            this.isDecorated = true;
            return;
        }
        throw new IllegalArgumentException("Cannot be null");
    }

    public void addSpan(Object obj) {
        LinkedList<Span> linkedList = this.spans;
        if (linkedList != null) {
            linkedList.add(new Span(obj));
            this.isDecorated = true;
        }
    }

    public void setDaysDisabled(boolean z) {
        this.daysDisabled = z;
        this.isDecorated = true;
    }

    /* access modifiers changed from: package-private */
    public void reset() {
        this.backgroundDrawable = null;
        this.selectionDrawable = null;
        this.spans.clear();
        this.isDecorated = false;
        this.daysDisabled = false;
    }

    /* access modifiers changed from: package-private */
    public void applyTo(DayViewFacade dayViewFacade) {
        Drawable drawable = this.selectionDrawable;
        if (drawable != null) {
            dayViewFacade.setSelectionDrawable(drawable);
        }
        Drawable drawable2 = this.backgroundDrawable;
        if (drawable2 != null) {
            dayViewFacade.setBackgroundDrawable(drawable2);
        }
        dayViewFacade.spans.addAll(this.spans);
        dayViewFacade.isDecorated |= this.isDecorated;
        dayViewFacade.daysDisabled = this.daysDisabled;
    }

    /* access modifiers changed from: package-private */
    public boolean isDecorated() {
        return this.isDecorated;
    }

    /* access modifiers changed from: package-private */
    public Drawable getSelectionDrawable() {
        return this.selectionDrawable;
    }

    /* access modifiers changed from: package-private */
    public Drawable getBackgroundDrawable() {
        return this.backgroundDrawable;
    }

    /* access modifiers changed from: package-private */
    public List<Span> getSpans() {
        return Collections.unmodifiableList(this.spans);
    }

    public boolean areDaysDisabled() {
        return this.daysDisabled;
    }

    static class Span {
        final Object span;

        public Span(Object obj) {
            this.span = obj;
        }
    }
}
