package p040o;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: o.MoneyPresentAdapter$MoneyPresentViewHolder */
final class MoneyPresentAdapter$MoneyPresentViewHolder extends SequentialSearchAdapter$ItemViewHolder {
    private static final ConcurrentMap<String, Object> FORMATTER_CACHE = new ConcurrentHashMap(16, 0.75f, 2);

    MoneyPresentAdapter$MoneyPresentViewHolder() {
    }

    public final Locale[] getAvailableLocales() {
        return DateFormat.getAvailableLocales();
    }

    public final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder getFormatter(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2, C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, Locale locale) {
        DateFormat dateFormat;
        if (giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding == null && giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2 == null) {
            throw new IllegalArgumentException("Date and Time style must not both be null");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding.getId());
        sb.append('|');
        sb.append(locale.toString());
        sb.append('|');
        sb.append(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding);
        sb.append(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2);
        String obj = sb.toString();
        Object obj2 = FORMATTER_CACHE.get(obj);
        if (obj2 == null) {
            if (giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding == null) {
                dateFormat = DateFormat.getTimeInstance(convertStyle(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2), locale);
            } else if (giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2 != null) {
                dateFormat = DateFormat.getDateTimeInstance(convertStyle(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding), convertStyle(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2), locale);
            } else {
                dateFormat = DateFormat.getDateInstance(convertStyle(giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding), locale);
            }
            if (dateFormat instanceof SimpleDateFormat) {
                GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder formatter = new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendPattern(((SimpleDateFormat) dateFormat).toPattern()).toFormatter(locale);
                FORMATTER_CACHE.putIfAbsent(obj, formatter);
                return formatter;
            }
            FORMATTER_CACHE.putIfAbsent(obj, "");
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        } else if (!obj2.equals("")) {
            return (GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder) obj2;
        } else {
            throw new IllegalArgumentException("Unable to convert DateFormat to DateTimeFormatter");
        }
    }

    private int convertStyle(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding) {
        return giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding.ordinal();
    }
}
