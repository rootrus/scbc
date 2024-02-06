package p040o;

import java.util.Locale;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder */
abstract class SequentialSearchAdapter$ItemViewHolder {
    public abstract GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder getFormatter(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2, C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, Locale locale);

    SequentialSearchAdapter$ItemViewHolder() {
    }

    static SequentialSearchAdapter$ItemViewHolder getInstance() {
        return new MoneyPresentAdapter$MoneyPresentViewHolder();
    }

    public Locale[] getAvailableLocales() {
        throw new UnsupportedOperationException();
    }
}
