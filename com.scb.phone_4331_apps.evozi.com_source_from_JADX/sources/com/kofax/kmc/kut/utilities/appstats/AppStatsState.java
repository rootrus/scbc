package com.kofax.kmc.kut.utilities.appstats;

import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public enum AppStatsState {
    APP_STATS_UNINITIALIZED(C0485a.STATE_UNINITIALIZED),
    APP_STATS_INITIALIZING(C0485a.STATE_INITIALIZING),
    APP_STATS_INITIALIZED(C0485a.STATE_INITIALIZED),
    APP_STATS_PURGING(C0485a.STATE_PURGING),
    APP_STATS_RECORDING(C0485a.STATE_RECORDING),
    APP_STATS_WRITING(C0485a.STATE_WRITING),
    APP_STATS_RECORDING_WRITING(C0485a.STATE_RECORDING_WRITING),
    APP_STATS_EXPORTING(C0485a.STATE_EXPORTING),
    APP_STATS_BEGINNING_SESSION(C0485a.STATE_BEGINNING_SESSION),
    APP_STATS_LOGGING_SESSION(C0485a.STATE_LOGGING_SESSION),
    APP_STATS_ENDING_SESSION(C0485a.STATE_ENDING_SESSION),
    APP_STATS_UPGRADING(C0485a.STATE_UPGRADING);
    

    /* renamed from: qe */
    private final String f805qe;

    /* renamed from: qf */
    C0485a f806qf;

    /* renamed from: qg */
    private Set<C0486b> f807qg;

    /* renamed from: qh */
    private Map<C0486b, Map<C0485a, C0485a>> f808qh;

    /* renamed from: qi */
    private Map<C0486b, Map<C0485a, C0485a>> f809qi;

    /* renamed from: qj */
    private Map<C0485a, ErrorInfo> f810qj;

    private AppStatsState(C0485a aVar) {
        this.f805qe = "task parameter '%s' does not represent a supported action for AppStatsState %s";
        this.f808qh = new HashMap();
        this.f809qi = new HashMap();
        this.f810qj = new HashMap();
        this.f806qf = aVar;
        switch (C04841.f811ql[aVar.ordinal()]) {
            case 1:
                this.f807qg = EnumSet.of(C0486b.TASK_NONE);
                break;
            case 2:
                this.f807qg = EnumSet.of(C0486b.TASK_INIT_APPSTATS);
                this.f808qh.put(C0486b.TASK_INIT_APPSTATS, new HashMap());
                this.f809qi.put(C0486b.TASK_INIT_APPSTATS, new HashMap());
                this.f808qh.get(C0486b.TASK_INIT_APPSTATS).put(C0485a.STATE_UNINITIALIZED, C0485a.STATE_INITIALIZED);
                C0485a aVar2 = C0485a.STATE_INITIALIZED;
                this.f808qh.get(C0486b.TASK_INIT_APPSTATS).put(aVar2, aVar2);
                C0485a aVar3 = C0485a.STATE_UNINITIALIZED;
                this.f809qi.get(C0486b.TASK_INIT_APPSTATS).put(aVar3, aVar3);
                this.f809qi.get(C0486b.TASK_INIT_APPSTATS).put(C0485a.STATE_INITIALIZED, C0485a.STATE_UNINITIALIZED);
                this.f810qj.put(C0485a.STATE_RECORDING, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_RECORDING_WRITING, ErrorInfo.KMC_UT_STATS_INIT_NOT_ALLOWED);
                break;
            case 3:
                this.f807qg = EnumSet.of(C0486b.TASK_STOP_RECORD);
                this.f808qh.put(C0486b.TASK_STOP_RECORD, new HashMap());
                this.f808qh.get(C0486b.TASK_STOP_RECORD).put(C0485a.STATE_RECORDING, C0485a.STATE_INITIALIZED);
                break;
            case 4:
                this.f807qg = EnumSet.of(C0486b.TASK_PURGE);
                this.f808qh.put(C0486b.TASK_PURGE, new HashMap());
                this.f809qi.put(C0486b.TASK_PURGE, new HashMap());
                this.f808qh.get(C0486b.TASK_PURGE).put(C0485a.STATE_INITIALIZED, C0485a.STATE_UNINITIALIZED);
                this.f809qi.get(C0486b.TASK_PURGE).put(C0485a.STATE_INITIALIZED, C0485a.STATE_UNINITIALIZED);
                this.f810qj.put(C0485a.STATE_RECORDING, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_RECORDING_WRITING, ErrorInfo.KMC_UT_STATS_PURGE_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_UNINITIALIZED, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
                break;
            case 5:
                this.f807qg = EnumSet.of(C0486b.TASK_START_RECORD);
                this.f808qh.put(C0486b.TASK_START_RECORD, new HashMap());
                this.f808qh.get(C0486b.TASK_START_RECORD).put(C0485a.STATE_INITIALIZED, C0485a.STATE_RECORDING);
                this.f810qj.put(C0485a.STATE_RECORDING, ErrorInfo.KMC_UT_STATS_ALREADY_RECORDING);
                this.f810qj.put(C0485a.STATE_RECORDING_WRITING, ErrorInfo.KMC_UT_STATS_ALREADY_RECORDING);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_RECORD_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_UNINITIALIZED, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
                break;
            case 6:
                this.f807qg = EnumSet.of(C0486b.TASK_WRITE, C0486b.TASK_STOP_RECORD);
                this.f808qh.put(C0486b.TASK_WRITE, new HashMap());
                this.f808qh.put(C0486b.TASK_STOP_RECORD, new HashMap());
                this.f809qi.put(C0486b.TASK_WRITE, new HashMap());
                this.f809qi.put(C0486b.TASK_STOP_RECORD, new HashMap());
                C0485a aVar4 = C0485a.STATE_INITIALIZED;
                this.f808qh.get(C0486b.TASK_WRITE).put(aVar4, aVar4);
                this.f808qh.get(C0486b.TASK_STOP_RECORD).put(C0485a.STATE_RECORDING_WRITING, C0485a.STATE_WRITING);
                this.f808qh.get(C0486b.TASK_WRITE).put(C0485a.STATE_WRITING, C0485a.STATE_INITIALIZED);
                C0485a aVar5 = C0485a.STATE_INITIALIZED;
                this.f809qi.get(C0486b.TASK_WRITE).put(aVar5, aVar5);
                C0485a aVar6 = C0485a.STATE_RECORDING;
                this.f809qi.get(C0486b.TASK_WRITE).put(aVar6, aVar6);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_ALREADY_WRITING);
                this.f810qj.put(C0485a.STATE_RECORDING_WRITING, ErrorInfo.KMC_UT_STATS_ALREADY_WRITING);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_WRITING_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_UNINITIALIZED, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
                break;
            case 7:
                this.f807qg = EnumSet.of(C0486b.TASK_START_RECORD, C0486b.TASK_WRITE);
                this.f808qh.put(C0486b.TASK_START_RECORD, new HashMap());
                this.f808qh.put(C0486b.TASK_WRITE, new HashMap());
                this.f808qh.get(C0486b.TASK_START_RECORD).put(C0485a.STATE_WRITING, C0485a.STATE_RECORDING_WRITING);
                this.f808qh.get(C0486b.TASK_WRITE).put(C0485a.STATE_RECORDING, C0485a.STATE_RECORDING_WRITING);
                this.f808qh.get(C0486b.TASK_WRITE).put(C0485a.STATE_WRITING, C0485a.STATE_RECORDING);
                this.f808qh.get(C0486b.TASK_WRITE).put(C0485a.STATE_RECORDING_WRITING, C0485a.STATE_RECORDING);
                break;
            case 8:
                this.f807qg = EnumSet.of(C0486b.TASK_EXPORT);
                this.f808qh.put(C0486b.TASK_EXPORT, new HashMap());
                this.f809qi.put(C0486b.TASK_EXPORT, new HashMap());
                C0485a aVar7 = C0485a.STATE_INITIALIZED;
                this.f808qh.get(C0486b.TASK_EXPORT).put(aVar7, aVar7);
                this.f809qi.get(C0486b.TASK_EXPORT).put(C0485a.STATE_RECORDING, C0485a.STATE_INITIALIZED);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_ALREADY_EXPORTING);
                this.f810qj.put(C0485a.STATE_RECORDING, ErrorInfo.KMC_UT_STATS_EXPORT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_RECORDING_WRITING, ErrorInfo.KMC_UT_STATS_EXPORT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_EXPORT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_UNINITIALIZED, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
                break;
            case 9:
                this.f807qg = EnumSet.of(C0486b.TASK_UPGRADE);
                this.f808qh.put(C0486b.TASK_UPGRADE, new HashMap());
                this.f809qi.put(C0486b.TASK_UPGRADE, new HashMap());
                C0485a aVar8 = C0485a.STATE_UNINITIALIZED;
                this.f808qh.get(C0486b.TASK_UPGRADE).put(aVar8, aVar8);
                C0485a aVar9 = C0485a.STATE_UNINITIALIZED;
                this.f809qi.get(C0486b.TASK_UPGRADE).put(aVar9, aVar9);
                this.f810qj.put(C0485a.STATE_INITIALIZED, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
                this.f810qj.put(C0485a.STATE_RECORDING, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
                this.f810qj.put(C0485a.STATE_RECORDING_WRITING, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_DATASTORE_UPGRADE_WRONG_STATE);
                break;
            case 10:
                this.f807qg = EnumSet.of(C0486b.TASK_BEGIN_SESSION);
                this.f808qh.put(C0486b.TASK_BEGIN_SESSION, new HashMap());
                this.f809qi.put(C0486b.TASK_BEGIN_SESSION, new HashMap());
                C0485a aVar10 = C0485a.STATE_RECORDING;
                this.f808qh.get(C0486b.TASK_BEGIN_SESSION).put(aVar10, aVar10);
                C0485a aVar11 = C0485a.STATE_RECORDING_WRITING;
                this.f808qh.get(C0486b.TASK_BEGIN_SESSION).put(aVar11, aVar11);
                C0485a aVar12 = C0485a.STATE_RECORDING;
                this.f809qi.get(C0486b.TASK_BEGIN_SESSION).put(aVar12, aVar12);
                C0485a aVar13 = C0485a.STATE_RECORDING_WRITING;
                this.f809qi.get(C0486b.TASK_BEGIN_SESSION).put(aVar13, aVar13);
                this.f810qj.put(C0485a.STATE_UNINITIALIZED, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_INITIALIZED, ErrorInfo.KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_BEGIN_SESSION_NOT_ALLOWED);
                break;
            case 11:
                this.f807qg = EnumSet.of(C0486b.TASK_LOG_SESSION);
                this.f808qh.put(C0486b.TASK_LOG_SESSION, new HashMap());
                this.f809qi.put(C0486b.TASK_LOG_SESSION, new HashMap());
                C0485a aVar14 = C0485a.STATE_RECORDING;
                this.f808qh.get(C0486b.TASK_LOG_SESSION).put(aVar14, aVar14);
                C0485a aVar15 = C0485a.STATE_RECORDING_WRITING;
                this.f808qh.get(C0486b.TASK_LOG_SESSION).put(aVar15, aVar15);
                C0485a aVar16 = C0485a.STATE_RECORDING;
                this.f809qi.get(C0486b.TASK_LOG_SESSION).put(aVar16, aVar16);
                C0485a aVar17 = C0485a.STATE_RECORDING_WRITING;
                this.f809qi.get(C0486b.TASK_LOG_SESSION).put(aVar17, aVar17);
                this.f810qj.put(C0485a.STATE_UNINITIALIZED, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_INITIALIZED, ErrorInfo.KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_LOG_SESSION_EVENT_NOT_ALLOWED);
                break;
            case 12:
                this.f807qg = EnumSet.of(C0486b.TASK_END_SESSION);
                this.f808qh.put(C0486b.TASK_END_SESSION, new HashMap());
                this.f809qi.put(C0486b.TASK_END_SESSION, new HashMap());
                C0485a aVar18 = C0485a.STATE_RECORDING;
                this.f808qh.get(C0486b.TASK_END_SESSION).put(aVar18, aVar18);
                C0485a aVar19 = C0485a.STATE_RECORDING_WRITING;
                this.f808qh.get(C0486b.TASK_END_SESSION).put(aVar19, aVar19);
                C0485a aVar20 = C0485a.STATE_RECORDING;
                this.f809qi.get(C0486b.TASK_END_SESSION).put(aVar20, aVar20);
                C0485a aVar21 = C0485a.STATE_RECORDING_WRITING;
                this.f809qi.get(C0486b.TASK_END_SESSION).put(aVar21, aVar21);
                this.f810qj.put(C0485a.STATE_UNINITIALIZED, ErrorInfo.KMC_UT_STATS_UNINITIALIZED);
                this.f810qj.put(C0485a.STATE_WRITING, ErrorInfo.KMC_UT_STATS_END_SESSION_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_INITIALIZED, ErrorInfo.KMC_UT_STATS_END_SESSION_NOT_ALLOWED);
                this.f810qj.put(C0485a.STATE_EXPORTING, ErrorInfo.KMC_UT_STATS_END_SESSION_NOT_ALLOWED);
                break;
        }
        this.f810qj.put(C0485a.STATE_ANY, ErrorInfo.KMC_UT_STATS_INVALID_STATE_TRANSITION);
    }

    /* renamed from: com.kofax.kmc.kut.utilities.appstats.AppStatsState$1 */
    static /* synthetic */ class C04841 {

        /* renamed from: ql */
        static final /* synthetic */ int[] f811ql = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.kofax.kmc.kut.utilities.appstats.a[] r0 = com.kofax.kmc.kut.utilities.appstats.C0485a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f811ql = r0
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_UNINITIALIZED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_INITIALIZING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_PURGING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x003e }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_RECORDING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_WRITING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_RECORDING_WRITING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_EXPORTING     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x006c }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_UPGRADING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_BEGINNING_SESSION     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_LOGGING_SESSION     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f811ql     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.kofax.kmc.kut.utilities.appstats.a r1 = com.kofax.kmc.kut.utilities.appstats.C0485a.STATE_ENDING_SESSION     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.kmc.kut.utilities.appstats.AppStatsState.C04841.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ErrorInfo mo10922a(C0486b bVar, C0485a aVar) {
        boolean contains = this.f807qg.contains(bVar);
        boolean containsKey = this.f808qh.get(bVar).containsKey(aVar);
        ErrorInfo errorInfo = ErrorInfo.KMC_SUCCESS;
        if (!contains || !containsKey) {
            errorInfo = this.f810qj.get(aVar);
        }
        return errorInfo == null ? this.f810qj.get(C0485a.STATE_ANY) : errorInfo;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final AppStatsState mo10923b(C0486b bVar, C0485a aVar) {
        if (this.f807qg.contains(bVar)) {
            AppStatsState aV = ((C0485a) this.f808qh.get(bVar).get(aVar)).mo10933aV();
            if (aV != null) {
                return aV;
            }
            String name = aVar.name();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to map AppStatsState nextState from StateID=");
            sb.append(aVar);
            throw new TypeNotPresentException(name, new Throwable(sb.toString()));
        }
        throw new IllegalArgumentException(String.format("task parameter '%s' does not represent a supported action for AppStatsState %s", new Object[]{bVar, this}));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AppStatsState mo10924c(C0486b bVar, C0485a aVar) {
        if (this.f807qg.contains(bVar)) {
            AppStatsState aV = ((C0485a) this.f809qi.get(bVar).get(aVar)).mo10933aV();
            if (aV != null) {
                return aV;
            }
            String name = aVar.name();
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to map AppStatsState errorState from StateID=");
            sb.append(aVar);
            throw new TypeNotPresentException(name, new Throwable(sb.toString()));
        }
        throw new IllegalArgumentException("task parameter '%s' does not represent a supported action for AppStatsState %s");
    }
}
