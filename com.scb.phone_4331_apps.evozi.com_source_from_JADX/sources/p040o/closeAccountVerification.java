package p040o;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.DayViewDecorator;
import com.prolificinteractive.materialcalendarview.DayViewFacade;
import java.util.Calendar;

/* renamed from: o.closeAccountVerification */
public final class closeAccountVerification implements DayViewDecorator {
    private final Calendar read = Calendar.getInstance();

    public final boolean shouldDecorate(CalendarDay calendarDay) {
        calendarDay.copyTo(this.read);
        int i = this.read.get(7);
        return i == 7 || i == 1;
    }

    public final void decorate(DayViewFacade dayViewFacade) {
        dayViewFacade.setDaysDisabled(true);
    }
}
