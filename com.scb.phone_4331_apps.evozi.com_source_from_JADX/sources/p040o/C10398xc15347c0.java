package p040o;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParseException;
import java.text.ParsePosition;
import org.threeten.p041bp.format.DateTimeParseException;
import p040o.C6877xfa77ad04;

/* renamed from: o.GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder$MediaBrowserCompat$CustomActionResultReceiver */
class C10398xc15347c0 extends Format {
    private final GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder formatter;
    private final EBillAdapter$EBillHolder<?> query;

    public C10398xc15347c0(GifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder, EBillAdapter$EBillHolder<?> eBillAdapter$EBillHolder) {
        this.formatter = gifShareMomentBackgroundAdapter$GifShareMomentBackgroundHolder;
        this.query = eBillAdapter$EBillHolder;
    }

    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(obj, "obj");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(stringBuffer, "toAppendTo");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(fieldPosition, "pos");
        if (obj instanceof DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            fieldPosition.setBeginIndex(0);
            fieldPosition.setEndIndex(0);
            try {
                this.formatter.formatTo((DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) obj, stringBuffer);
                return stringBuffer;
            } catch (RuntimeException e) {
                throw new IllegalArgumentException(e.getMessage(), e);
            }
        } else {
            throw new IllegalArgumentException("Format target must implement TemporalAccessor");
        }
    }

    public final Object parseObject(String str) throws ParseException {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "text");
        try {
            if (this.query == null) {
                return this.formatter.parseToBuilder(str, (ParsePosition) null).resolve(this.formatter.getResolverStyle(), this.formatter.getResolverFields());
            }
            return this.formatter.parse((CharSequence) str, this.query);
        } catch (DateTimeParseException e) {
            throw new ParseException(e.getMessage(), e.getErrorIndex());
        } catch (RuntimeException e2) {
            throw ((ParseException) new ParseException(e2.getMessage(), 0).initCause(e2));
        }
    }

    public final Object parseObject(String str, ParsePosition parsePosition) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "text");
        try {
            C6877xfa77ad04.IconCompatParcelizer access$100 = this.formatter.parseUnresolved0(str, parsePosition);
            if (access$100 == null) {
                if (parsePosition.getErrorIndex() < 0) {
                    parsePosition.setErrorIndex(0);
                }
                return null;
            }
            try {
                ScheduleListAdapter$ScheduleListWithHeaderViewHolder_ViewBinding resolve = access$100.toBuilder().resolve(this.formatter.getResolverStyle(), this.formatter.getResolverFields());
                if (this.query == null) {
                    return resolve;
                }
                return resolve.build(this.query);
            } catch (RuntimeException unused) {
                parsePosition.setErrorIndex(0);
                return null;
            }
        } catch (IndexOutOfBoundsException unused2) {
            if (parsePosition.getErrorIndex() < 0) {
                parsePosition.setErrorIndex(0);
            }
            return null;
        }
    }
}
