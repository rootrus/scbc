package com.prolificinteractive.materialcalendarview;

class DecoratorResult {
    public final DayViewDecorator decorator;
    public final DayViewFacade result;

    DecoratorResult(DayViewDecorator dayViewDecorator, DayViewFacade dayViewFacade) {
        this.decorator = dayViewDecorator;
        this.result = dayViewFacade;
    }
}
