package p040o;

import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaBrowserCompat$ItemReceiver */
final class C7053xeaf271d implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    private final char literal;

    C7053xeaf271d(char c) {
        this.literal = c;
    }

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        sb.append(this.literal);
        return true;
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        return !giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.charEquals(this.literal, charSequence.charAt(i)) ? ~i : i + 1;
    }

    public final String toString() {
        if (this.literal == '\'') {
            return "''";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(this.literal);
        sb.append("'");
        return sb.toString();
    }
}
