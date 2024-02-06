package p040o;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.regex.Pattern;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.zone.ZoneRulesException;

/* renamed from: o.LanguageSettingAdapter$LanguageSettingHolder */
final class LanguageSettingAdapter$LanguageSettingHolder extends LanguageSettingAdapter$LanguageSettingHolder_ViewBinding implements Serializable {
    private static final Pattern PATTERN = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");
    private static final long serialVersionUID = 8386373296231747096L;

    /* renamed from: id */
    private final String f3157id;
    private final transient HistoryAdapter$ChildViewHolder rules;

    private static LanguageSettingAdapter$LanguageSettingHolder ofLenient(String str) {
        if (str.equals("Z") || str.startsWith("+") || str.startsWith("-")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ID for region-based ZoneId, invalid format: ");
            sb.append(str);
            throw new DateTimeException(sb.toString());
        } else if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
            return new LanguageSettingAdapter$LanguageSettingHolder(str, ManageAccountInboundViewHolder_ViewBinding.UTC.getRules());
        } else {
            if (str.startsWith("UTC+") || str.startsWith("GMT+") || str.startsWith("UTC-") || str.startsWith("GMT-")) {
                ManageAccountInboundViewHolder_ViewBinding of = ManageAccountInboundViewHolder_ViewBinding.m3529of(str.substring(3));
                if (of.getTotalSeconds() == 0) {
                    return new LanguageSettingAdapter$LanguageSettingHolder(str.substring(0, 3), of.getRules());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, 3));
                sb2.append(of.getId());
                return new LanguageSettingAdapter$LanguageSettingHolder(sb2.toString(), of.getRules());
            } else if (!str.startsWith("UT+") && !str.startsWith("UT-")) {
                return ofId(str, false);
            } else {
                ManageAccountInboundViewHolder_ViewBinding of2 = ManageAccountInboundViewHolder_ViewBinding.m3529of(str.substring(2));
                if (of2.getTotalSeconds() == 0) {
                    return new LanguageSettingAdapter$LanguageSettingHolder("UT", of2.getRules());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("UT");
                sb3.append(of2.getId());
                return new LanguageSettingAdapter$LanguageSettingHolder(sb3.toString(), of2.getRules());
            }
        }
    }

    static LanguageSettingAdapter$LanguageSettingHolder ofId(String str, boolean z) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "zoneId");
        if (str.length() < 2 || !PATTERN.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid ID for region-based ZoneId, invalid format: ");
            sb.append(str);
            throw new DateTimeException(sb.toString());
        }
        HistoryAdapter$ChildViewHolder historyAdapter$ChildViewHolder = null;
        try {
            historyAdapter$ChildViewHolder = HistoryAdapter$GroupItemViewHolder.getRules(str, true);
        } catch (ZoneRulesException e) {
            if (str.equals("GMT0")) {
                historyAdapter$ChildViewHolder = ManageAccountInboundViewHolder_ViewBinding.UTC.getRules();
            } else if (z) {
                throw e;
            }
        }
        return new LanguageSettingAdapter$LanguageSettingHolder(str, historyAdapter$ChildViewHolder);
    }

    LanguageSettingAdapter$LanguageSettingHolder(String str, HistoryAdapter$ChildViewHolder historyAdapter$ChildViewHolder) {
        this.f3157id = str;
        this.rules = historyAdapter$ChildViewHolder;
    }

    public final String getId() {
        return this.f3157id;
    }

    public final HistoryAdapter$ChildViewHolder getRules() {
        HistoryAdapter$ChildViewHolder historyAdapter$ChildViewHolder = this.rules;
        return historyAdapter$ChildViewHolder == null ? HistoryAdapter$GroupItemViewHolder.getRules(this.f3157id, false) : historyAdapter$ChildViewHolder;
    }

    private Object writeReplace() {
        return new PrepaidTransactionAdapter$ChildViewHolder_ViewBinding((byte) 7, this);
    }

    private Object readResolve() throws ObjectStreamException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* access modifiers changed from: package-private */
    public final void write(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(7);
        writeExternal(dataOutput);
    }

    /* access modifiers changed from: package-private */
    public final void writeExternal(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.f3157id);
    }

    static LanguageSettingAdapter$LanguageSettingHolder_ViewBinding readExternal(DataInput dataInput) throws IOException {
        return ofLenient(dataInput.readUTF());
    }
}
