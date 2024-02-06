package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class AutoValue_CrashlyticsReport_Session extends CrashlyticsReport.Session {
    private final CrashlyticsReport.Session.Application app;
    private final boolean crashed;
    private final CrashlyticsReport.Session.Device device;
    private final Long endedAt;
    private final ImmutableList<CrashlyticsReport.Session.Event> events;
    private final String generator;
    private final int generatorType;
    private final String identifier;

    /* renamed from: os */
    private final CrashlyticsReport.Session.OperatingSystem f53os;
    private final long startedAt;
    private final CrashlyticsReport.Session.User user;

    private AutoValue_CrashlyticsReport_Session(String str, String str2, long j, Long l, boolean z, CrashlyticsReport.Session.Application application, CrashlyticsReport.Session.User user2, CrashlyticsReport.Session.OperatingSystem operatingSystem, CrashlyticsReport.Session.Device device2, ImmutableList<CrashlyticsReport.Session.Event> immutableList, int i) {
        this.generator = str;
        this.identifier = str2;
        this.startedAt = j;
        this.endedAt = l;
        this.crashed = z;
        this.app = application;
        this.user = user2;
        this.f53os = operatingSystem;
        this.device = device2;
        this.events = immutableList;
        this.generatorType = i;
    }

    public final String getGenerator() {
        return this.generator;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    public final Long getEndedAt() {
        return this.endedAt;
    }

    public final boolean isCrashed() {
        return this.crashed;
    }

    public final CrashlyticsReport.Session.Application getApp() {
        return this.app;
    }

    public final CrashlyticsReport.Session.User getUser() {
        return this.user;
    }

    public final CrashlyticsReport.Session.OperatingSystem getOs() {
        return this.f53os;
    }

    public final CrashlyticsReport.Session.Device getDevice() {
        return this.device;
    }

    public final ImmutableList<CrashlyticsReport.Session.Event> getEvents() {
        return this.events;
    }

    public final int getGeneratorType() {
        return this.generatorType;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Session{generator=");
        sb.append(this.generator);
        sb.append(", identifier=");
        sb.append(this.identifier);
        sb.append(", startedAt=");
        sb.append(this.startedAt);
        sb.append(", endedAt=");
        sb.append(this.endedAt);
        sb.append(", crashed=");
        sb.append(this.crashed);
        sb.append(", app=");
        sb.append(this.app);
        sb.append(", user=");
        sb.append(this.user);
        sb.append(", os=");
        sb.append(this.f53os);
        sb.append(", device=");
        sb.append(this.device);
        sb.append(", events=");
        sb.append(this.events);
        sb.append(", generatorType=");
        sb.append(this.generatorType);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.Session.User user2;
        CrashlyticsReport.Session.OperatingSystem operatingSystem;
        CrashlyticsReport.Session.Device device2;
        ImmutableList<CrashlyticsReport.Session.Event> immutableList;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session)) {
            return false;
        }
        CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
        if (!this.generator.equals(session.getGenerator()) || !this.identifier.equals(session.getIdentifier()) || this.startedAt != session.getStartedAt() || ((l = this.endedAt) != null ? !l.equals(session.getEndedAt()) : session.getEndedAt() != null) || this.crashed != session.isCrashed() || !this.app.equals(session.getApp()) || ((user2 = this.user) != null ? !user2.equals(session.getUser()) : session.getUser() != null) || ((operatingSystem = this.f53os) != null ? !operatingSystem.equals(session.getOs()) : session.getOs() != null) || ((device2 = this.device) != null ? !device2.equals(session.getDevice()) : session.getDevice() != null) || ((immutableList = this.events) != null ? !immutableList.equals(session.getEvents()) : session.getEvents() != null) || this.generatorType != session.getGeneratorType()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.generator.hashCode();
        int hashCode2 = this.identifier.hashCode();
        long j = this.startedAt;
        int i = (int) (j ^ (j >>> 32));
        Long l = this.endedAt;
        int i2 = 0;
        int hashCode3 = l == null ? 0 : l.hashCode();
        int i3 = this.crashed ? 1231 : 1237;
        int hashCode4 = this.app.hashCode();
        CrashlyticsReport.Session.User user2 = this.user;
        int hashCode5 = user2 == null ? 0 : user2.hashCode();
        CrashlyticsReport.Session.OperatingSystem operatingSystem = this.f53os;
        int hashCode6 = operatingSystem == null ? 0 : operatingSystem.hashCode();
        CrashlyticsReport.Session.Device device2 = this.device;
        int hashCode7 = device2 == null ? 0 : device2.hashCode();
        ImmutableList<CrashlyticsReport.Session.Event> immutableList = this.events;
        if (immutableList != null) {
            i2 = immutableList.hashCode();
        }
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ i) * 1000003) ^ hashCode3) * 1000003) ^ i3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ i2) * 1000003) ^ this.generatorType;
    }

    public final CrashlyticsReport.Session.Builder toBuilder() {
        return new Builder(this);
    }

    static final class Builder extends CrashlyticsReport.Session.Builder {
        private CrashlyticsReport.Session.Application app;
        private Boolean crashed;
        private CrashlyticsReport.Session.Device device;
        private Long endedAt;
        private ImmutableList<CrashlyticsReport.Session.Event> events;
        private String generator;
        private Integer generatorType;
        private String identifier;

        /* renamed from: os */
        private CrashlyticsReport.Session.OperatingSystem f54os;
        private Long startedAt;
        private CrashlyticsReport.Session.User user;

        Builder() {
        }

        private Builder(CrashlyticsReport.Session session) {
            this.generator = session.getGenerator();
            this.identifier = session.getIdentifier();
            this.startedAt = Long.valueOf(session.getStartedAt());
            this.endedAt = session.getEndedAt();
            this.crashed = Boolean.valueOf(session.isCrashed());
            this.app = session.getApp();
            this.user = session.getUser();
            this.f54os = session.getOs();
            this.device = session.getDevice();
            this.events = session.getEvents();
            this.generatorType = Integer.valueOf(session.getGeneratorType());
        }

        public final CrashlyticsReport.Session.Builder setGenerator(String str) {
            if (str != null) {
                this.generator = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        public final CrashlyticsReport.Session.Builder setIdentifier(String str) {
            if (str != null) {
                this.identifier = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public final CrashlyticsReport.Session.Builder setStartedAt(long j) {
            this.startedAt = Long.valueOf(j);
            return this;
        }

        public final CrashlyticsReport.Session.Builder setEndedAt(Long l) {
            this.endedAt = l;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setCrashed(boolean z) {
            this.crashed = Boolean.valueOf(z);
            return this;
        }

        public final CrashlyticsReport.Session.Builder setApp(CrashlyticsReport.Session.Application application) {
            if (application != null) {
                this.app = application;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public final CrashlyticsReport.Session.Builder setUser(CrashlyticsReport.Session.User user2) {
            this.user = user2;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setOs(CrashlyticsReport.Session.OperatingSystem operatingSystem) {
            this.f54os = operatingSystem;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setDevice(CrashlyticsReport.Session.Device device2) {
            this.device = device2;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setEvents(ImmutableList<CrashlyticsReport.Session.Event> immutableList) {
            this.events = immutableList;
            return this;
        }

        public final CrashlyticsReport.Session.Builder setGeneratorType(int i) {
            this.generatorType = Integer.valueOf(i);
            return this;
        }

        public final CrashlyticsReport.Session build() {
            String str;
            if (this.generator == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(" generator");
                str = sb.toString();
            } else {
                str = "";
            }
            if (this.identifier == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" identifier");
                str = sb2.toString();
            }
            if (this.startedAt == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" startedAt");
                str = sb3.toString();
            }
            if (this.crashed == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" crashed");
                str = sb4.toString();
            }
            if (this.app == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" app");
                str = sb5.toString();
            }
            if (this.generatorType == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" generatorType");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session(this.generator, this.identifier, this.startedAt.longValue(), this.endedAt, this.crashed.booleanValue(), this.app, this.user, this.f54os, this.device, this.events, this.generatorType.intValue());
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }
}
