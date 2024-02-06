package p040o;

import java.util.List;
import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver */
final class C7052x1ebac7ce implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    private final boolean optional;
    private final SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer[] printerParsers;

    C7052x1ebac7ce(List<SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer> list, boolean z) {
        this((SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer[]) list.toArray(new SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer[list.size()]), z);
    }

    C7052x1ebac7ce(SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer[] iconCompatParcelizerArr, boolean z) {
        this.printerParsers = iconCompatParcelizerArr;
        this.optional = z;
    }

    public final C7052x1ebac7ce withOptional(boolean z) {
        if (z == this.optional) {
            return this;
        }
        return new C7052x1ebac7ce(this.printerParsers, z);
    }

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        int length = sb.length();
        if (this.optional) {
            giftTutorialViewPagerAdapter$TutorialItemHolder.startOptional();
        }
        try {
            for (SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer print : this.printerParsers) {
                if (!print.print(giftTutorialViewPagerAdapter$TutorialItemHolder, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (this.optional) {
                giftTutorialViewPagerAdapter$TutorialItemHolder.endOptional();
            }
            return true;
        } finally {
            if (this.optional) {
                giftTutorialViewPagerAdapter$TutorialItemHolder.endOptional();
            }
        }
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        if (this.optional) {
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.startOptional();
            int i2 = i;
            for (SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer parse : this.printerParsers) {
                i2 = parse.parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i2);
                if (i2 < 0) {
                    giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.endOptional(false);
                    return i;
                }
            }
            giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.endOptional(true);
            return i2;
        }
        for (SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer parse2 : this.printerParsers) {
            i = parse2.parse(giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, charSequence, i);
            if (i < 0) {
                break;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.printerParsers != null) {
            sb.append(this.optional ? "[" : "(");
            for (SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer append : this.printerParsers) {
                sb.append(append);
            }
            sb.append(this.optional ? "]" : ")");
        }
        return sb.toString();
    }
}
