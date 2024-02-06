package p040o;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import org.threeten.p041bp.DateTimeException;
import org.threeten.p041bp.temporal.UnsupportedTemporalTypeException;
import org.threeten.p041bp.zone.ZoneRulesException;

/* renamed from: o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding */
public abstract class LanguageSettingAdapter$LanguageSettingHolder_ViewBinding implements Serializable {
    public static final EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding> FROM = new EBillAdapter$EBillHolder<LanguageSettingAdapter$LanguageSettingHolder_ViewBinding>() {
        public final LanguageSettingAdapter$LanguageSettingHolder_ViewBinding queryFrom(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
            return LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.from(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        }
    };
    public static final Map<String, String> SHORT_IDS;
    private static final long serialVersionUID = 8352817235686L;

    public abstract String getId();

    public abstract HistoryAdapter$ChildViewHolder getRules();

    /* access modifiers changed from: package-private */
    public abstract void write(DataOutput dataOutput) throws IOException;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("ACT", "Australia/Darwin");
        hashMap.put("AET", "Australia/Sydney");
        hashMap.put("AGT", "America/Argentina/Buenos_Aires");
        hashMap.put("ART", "Africa/Cairo");
        hashMap.put("AST", "America/Anchorage");
        hashMap.put("BET", "America/Sao_Paulo");
        hashMap.put("BST", "Asia/Dhaka");
        hashMap.put("CAT", "Africa/Harare");
        hashMap.put("CNT", "America/St_Johns");
        hashMap.put("CST", "America/Chicago");
        hashMap.put("CTT", "Asia/Shanghai");
        hashMap.put("EAT", "Africa/Addis_Ababa");
        hashMap.put("ECT", "Europe/Paris");
        hashMap.put("IET", "America/Indiana/Indianapolis");
        hashMap.put("IST", "Asia/Kolkata");
        hashMap.put("JST", "Asia/Tokyo");
        hashMap.put("MIT", "Pacific/Apia");
        hashMap.put("NET", "Asia/Yerevan");
        hashMap.put("NST", "Pacific/Auckland");
        hashMap.put("PLT", "Asia/Karachi");
        hashMap.put("PNT", "America/Phoenix");
        hashMap.put("PRT", "America/Puerto_Rico");
        hashMap.put("PST", "America/Los_Angeles");
        hashMap.put("SST", "Pacific/Guadalcanal");
        hashMap.put("VST", "Asia/Ho_Chi_Minh");
        hashMap.put("EST", "-05:00");
        hashMap.put("MST", "-07:00");
        hashMap.put("HST", "-10:00");
        SHORT_IDS = Collections.unmodifiableMap(hashMap);
    }

    public static LanguageSettingAdapter$LanguageSettingHolder_ViewBinding systemDefault() {
        return m3071of(TimeZone.getDefault().getID(), SHORT_IDS);
    }

    public static Set<String> getAvailableZoneIds() {
        return new HashSet(HistoryAdapter$GroupItemViewHolder.getAvailableZoneIds());
    }

    /* renamed from: of */
    public static LanguageSettingAdapter$LanguageSettingHolder_ViewBinding m3071of(String str, Map<String, String> map) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "zoneId");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(map, "aliasMap");
        String str2 = map.get(str);
        if (str2 != null) {
            str = str2;
        }
        return m3070of(str);
    }

    /* renamed from: of */
    public static LanguageSettingAdapter$LanguageSettingHolder_ViewBinding m3070of(String str) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "zoneId");
        if (str.equals("Z")) {
            return ManageAccountInboundViewHolder_ViewBinding.UTC;
        }
        if (str.length() == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid zone: ");
            sb.append(str);
            throw new DateTimeException(sb.toString());
        } else if (str.startsWith("+") || str.startsWith("-")) {
            return ManageAccountInboundViewHolder_ViewBinding.m3529of(str);
        } else {
            if (str.equals("UTC") || str.equals("GMT") || str.equals("UT")) {
                return new LanguageSettingAdapter$LanguageSettingHolder(str, ManageAccountInboundViewHolder_ViewBinding.UTC.getRules());
            }
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
                return LanguageSettingAdapter$LanguageSettingHolder.ofId(str, true);
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

    public static LanguageSettingAdapter$LanguageSettingHolder_ViewBinding ofOffset(String str, ManageAccountInboundViewHolder_ViewBinding manageAccountInboundViewHolder_ViewBinding) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "prefix");
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(manageAccountInboundViewHolder_ViewBinding, "offset");
        if (str.length() == 0) {
            return manageAccountInboundViewHolder_ViewBinding;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid prefix, must be GMT, UTC or UT: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (manageAccountInboundViewHolder_ViewBinding.getTotalSeconds() == 0) {
            return new LanguageSettingAdapter$LanguageSettingHolder(str, manageAccountInboundViewHolder_ViewBinding.getRules());
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(manageAccountInboundViewHolder_ViewBinding.getId());
            return new LanguageSettingAdapter$LanguageSettingHolder(sb2.toString(), manageAccountInboundViewHolder_ViewBinding.getRules());
        }
    }

    public static LanguageSettingAdapter$LanguageSettingHolder_ViewBinding from(DenominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding) {
        LanguageSettingAdapter$LanguageSettingHolder_ViewBinding languageSettingAdapter$LanguageSettingHolder_ViewBinding = (LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.query(DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zone());
        if (languageSettingAdapter$LanguageSettingHolder_ViewBinding != null) {
            return languageSettingAdapter$LanguageSettingHolder_ViewBinding;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unable to obtain ZoneId from TemporalAccessor: ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding);
        sb.append(", type ");
        sb.append(denominatorAmountAdapter$BubbleViewDisableHolder_ViewBinding.getClass().getName());
        throw new DateTimeException(sb.toString());
    }

    LanguageSettingAdapter$LanguageSettingHolder_ViewBinding() {
        if (getClass() != ManageAccountInboundViewHolder_ViewBinding.class && getClass() != LanguageSettingAdapter$LanguageSettingHolder.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public String getDisplayName(C7010xce0f74d9 questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding, Locale locale) {
        return new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendZoneText(questionnaireRecyclerViewAdapter$QuestionnaireViewHolder_ViewBinding).toFormatter(locale).format(new TierPricingInstallmentAdapter$InstallmentViewHolder_ViewBinding() {
            public final boolean isSupported(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
                return false;
            }

            public final long getLong(DenominatorAmountAdapter$PencilViewHolder denominatorAmountAdapter$PencilViewHolder) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported field: ");
                sb.append(denominatorAmountAdapter$PencilViewHolder);
                throw new UnsupportedTemporalTypeException(sb.toString());
            }

            public final <R> R query(EBillAdapter$EBillHolder<R> eBillAdapter$EBillHolder) {
                if (eBillAdapter$EBillHolder == DenominatorAmountAdapter$BubbleViewHolder_ViewBinding.zoneId()) {
                    return LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.this;
                }
                return super.query(eBillAdapter$EBillHolder);
            }
        });
    }

    public LanguageSettingAdapter$LanguageSettingHolder_ViewBinding normalized() {
        try {
            HistoryAdapter$ChildViewHolder rules = getRules();
            if (rules.isFixedOffset()) {
                return rules.getOffset(QuickAccountSelectAdapter$HeaderHolder_ViewBinding.EPOCH);
            }
        } catch (ZoneRulesException unused) {
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) {
            return getId().equals(((LanguageSettingAdapter$LanguageSettingHolder_ViewBinding) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    public String toString() {
        return getId();
    }
}
