package p040o;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.threeten.p041bp.zone.ZoneRulesException;

/* renamed from: o.HistoryAdapter$GroupItemViewHolder */
public abstract class HistoryAdapter$GroupItemViewHolder {
    private static final CopyOnWriteArrayList<HistoryAdapter$GroupItemViewHolder> PROVIDERS = new CopyOnWriteArrayList<>();
    private static final ConcurrentMap<String, HistoryAdapter$GroupItemViewHolder> ZONES = new ConcurrentHashMap(512, 0.75f, 2);

    /* access modifiers changed from: protected */
    public boolean provideRefresh() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract HistoryAdapter$ChildViewHolder provideRules(String str, boolean z);

    /* access modifiers changed from: protected */
    public abstract NavigableMap<String, HistoryAdapter$ChildViewHolder> provideVersions(String str);

    /* access modifiers changed from: protected */
    public abstract Set<String> provideZoneIds();

    static {
        FixedTransferDepositSuccessTransactionAdapter$DepositViewHolder.initialize();
    }

    public static Set<String> getAvailableZoneIds() {
        return Collections.unmodifiableSet(ZONES.keySet());
    }

    public static HistoryAdapter$ChildViewHolder getRules(String str, boolean z) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "zoneId");
        return getProvider(str).provideRules(str, z);
    }

    public static NavigableMap<String, HistoryAdapter$ChildViewHolder> getVersions(String str) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(str, "zoneId");
        return getProvider(str).provideVersions(str);
    }

    private static HistoryAdapter$GroupItemViewHolder getProvider(String str) {
        HistoryAdapter$GroupItemViewHolder historyAdapter$GroupItemViewHolder = (HistoryAdapter$GroupItemViewHolder) ZONES.get(str);
        if (historyAdapter$GroupItemViewHolder != null) {
            return historyAdapter$GroupItemViewHolder;
        }
        if (ZONES.isEmpty()) {
            throw new ZoneRulesException("No time-zone data files registered");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown time-zone ID: ");
        sb.append(str);
        throw new ZoneRulesException(sb.toString());
    }

    public static void registerProvider(HistoryAdapter$GroupItemViewHolder historyAdapter$GroupItemViewHolder) {
        RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(historyAdapter$GroupItemViewHolder, "provider");
        registerProvider0(historyAdapter$GroupItemViewHolder);
        PROVIDERS.add(historyAdapter$GroupItemViewHolder);
    }

    private static void registerProvider0(HistoryAdapter$GroupItemViewHolder historyAdapter$GroupItemViewHolder) {
        for (String next : historyAdapter$GroupItemViewHolder.provideZoneIds()) {
            RiskSummaryRecyclerViewAdapter$RiskSummaryViewHolder.requireNonNull(next, "zoneId");
            if (ZONES.putIfAbsent(next, historyAdapter$GroupItemViewHolder) != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to register zone as one already registered with that ID: ");
                sb.append(next);
                sb.append(", currently loading from provider: ");
                sb.append(historyAdapter$GroupItemViewHolder);
                throw new ZoneRulesException(sb.toString());
            }
        }
    }

    public static boolean refresh() {
        Iterator<HistoryAdapter$GroupItemViewHolder> it = PROVIDERS.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= it.next().provideRefresh();
        }
        return z;
    }

    protected HistoryAdapter$GroupItemViewHolder() {
    }
}
