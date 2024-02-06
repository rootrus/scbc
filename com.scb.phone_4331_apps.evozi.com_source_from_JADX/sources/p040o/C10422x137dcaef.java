package p040o;

import java.util.Locale;
import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$SearchResultReceiver */
final class C10422x137dcaef implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    private final GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding dateStyle;
    private final GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding timeStyle;

    C10422x137dcaef(GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding, GiftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2) {
        this.dateStyle = giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding;
        this.timeStyle = giftTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding2;
    }

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        return formatter(giftTutorialViewPagerAdapter$TutorialItemHolder.getLocale(), C7022x6c0e8d61.from(giftTutorialViewPagerAdapter$TutorialItemHolder.getTemporal())).toPrinterParser(false).print(giftTutorialViewPagerAdapter$TutorialItemHolder, sb);
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        return formatter(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getLocale(), giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.getEffectiveChronology()).toPrinterParser(false).parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i);
    }

    private GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder formatter(Locale locale, C7022x6c0e8d61 registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding) {
        return SequentialSearchAdapter$ItemViewHolder.getInstance().getFormatter(this.dateStyle, this.timeStyle, registrationCountrySearchAdapter$CountryItemViewHolder_ViewBinding, locale);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Localized(");
        Object obj = this.dateStyle;
        Object obj2 = "";
        if (obj == null) {
            obj = obj2;
        }
        sb.append(obj);
        sb.append(",");
        Object obj3 = this.timeStyle;
        if (obj3 != null) {
            obj2 = obj3;
        }
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }
}
