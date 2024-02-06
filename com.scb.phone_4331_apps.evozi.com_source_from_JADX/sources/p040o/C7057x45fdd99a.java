package p040o;

import p040o.SequentialSearchAdapter$ItemViewHolder_ViewBinding;

/* renamed from: o.SequentialSearchAdapter$ItemViewHolder_ViewBinding$MediaSessionCompat$ResultReceiverWrapper */
final class C7057x45fdd99a implements SequentialSearchAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer {
    private final String literal;

    C7057x45fdd99a(String str) {
        this.literal = str;
    }

    public final boolean print(GiftTutorialViewPagerAdapter$TutorialItemHolder giftTutorialViewPagerAdapter$TutorialItemHolder, StringBuilder sb) {
        sb.append(this.literal);
        return true;
    }

    public final int parse(C6877xfa77ad04 giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding, CharSequence charSequence, int i) {
        if (i > charSequence.length() || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.literal;
        if (!giftSelectRecipientFromFavouriteAdapter$RecipientViewHolder_ViewBinding.subSequenceEquals(charSequence, i, str, 0, str.length())) {
            return ~i;
        }
        return i + this.literal.length();
    }

    public final String toString() {
        String replace = this.literal.replace("'", "''");
        StringBuilder sb = new StringBuilder();
        sb.append("'");
        sb.append(replace);
        sb.append("'");
        return sb.toString();
    }
}
