package p040o;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: o.GiftingBaseListAdapter$GiftViewHolder */
public abstract class GiftingBaseListAdapter$GiftViewHolder {
    /* access modifiers changed from: private */
    public static final AtomicReference<GiftingBaseListAdapter$GiftViewHolder> MUTABLE_PROVIDER = new AtomicReference<>();

    public abstract String getText(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, long j, C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale);

    public abstract Iterator<Map.Entry<String, Long>> getTextIterator(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder, C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale);

    static GiftingBaseListAdapter$GiftViewHolder getInstance() {
        return IconCompatParcelizer.PROVIDER;
    }

    public static void setInitializer(GiftingBaseListAdapter$GiftViewHolder giftingBaseListAdapter$GiftViewHolder) {
        if (!MUTABLE_PROVIDER.compareAndSet((Object) null, giftingBaseListAdapter$GiftViewHolder)) {
            throw new IllegalStateException("Provider was already set, possibly with a default during initialization");
        }
    }

    /* renamed from: o.GiftingBaseListAdapter$GiftViewHolder$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        static final GiftingBaseListAdapter$GiftViewHolder PROVIDER = initialize();
        public final List<QuickAccountSelectAdapter$FooterHolder> read;
        public final String write;

        IconCompatParcelizer() {
        }

        static GiftingBaseListAdapter$GiftViewHolder initialize() {
            GiftingBaseListAdapter$GiftViewHolder.MUTABLE_PROVIDER.compareAndSet((Object) null, new GiftingBaseListAdapter$GiftViewHolder_ViewBinding());
            return (GiftingBaseListAdapter$GiftViewHolder) GiftingBaseListAdapter$GiftViewHolder.MUTABLE_PROVIDER.get();
        }

        public IconCompatParcelizer(List<QuickAccountSelectAdapter$FooterHolder> list, String str) {
            onGetStartedClick.write((Object) list, "accounts");
            this.read = list;
            this.write = str;
        }
    }
}
