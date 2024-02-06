package com.thunderhead.android.infrastructure.server.entitys;

import java.util.Arrays;

public class InteractionData {
    public Captures[] capturePoints;
    public CustomerKeyConfiguration customerKeyConfiguration;
    public String eventTypeId;
    public String eventTypeName;

    /* renamed from: id */
    public String f3111id;
    public boolean injectionEnabled;
    public String name;
    public Optimizations[] optimizationPoints;
    public int optimizationPointsCount;
    public String path;
    public boolean propositionCompleted;
    public String propositionId;
    public String propositionName;
    public Object[] pullActionPoints;
    public Object[] pushActionPoints;
    public String touchpointId;
    public boolean trackingEnabled;
    public TrackingPointData[] trackingPoints;
    public int trackingPointsCount;
    public boolean verifiedIfVisited;

    public String getName() {
        return this.name;
    }

    public boolean isTrackingEnabled() {
        return this.trackingEnabled;
    }

    public boolean isInjectionEnabled() {
        return this.injectionEnabled;
    }

    public boolean isPropositionCompleted() {
        return this.propositionCompleted;
    }

    public boolean isVerifiedIfVisited() {
        return this.verifiedIfVisited;
    }

    public Optimizations[] getOptimizationPoints() {
        return this.optimizationPoints;
    }

    public Captures[] getCapturePoints() {
        return this.capturePoints;
    }

    public TrackingPointData[] getTrackingPoints() {
        return this.trackingPoints;
    }

    public String getPropositionId() {
        return this.propositionId;
    }

    public String getPropositionName() {
        return this.propositionName;
    }

    public String getEventTypeId() {
        return this.eventTypeId;
    }

    public String getEventTypeName() {
        return this.eventTypeName;
    }

    public String getPath() {
        return this.path;
    }

    public String getTouchpointId() {
        return this.touchpointId;
    }

    public CustomerKeyConfiguration getCustomerKeyConfiguration() {
        return this.customerKeyConfiguration;
    }

    public Object[] getPushActionPoints() {
        return this.pushActionPoints;
    }

    public int getOptimizationPointsCount() {
        return this.optimizationPointsCount;
    }

    public int getTrackingPointsCount() {
        return this.trackingPointsCount;
    }

    public Object[] getPullActionPoints() {
        return this.pullActionPoints;
    }

    public String getId() {
        return this.f3111id;
    }

    public void setId(String str) {
        this.f3111id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InteractionData{name='");
        sb.append(this.name);
        sb.append('\'');
        sb.append(", trackingEnabled=");
        sb.append(this.trackingEnabled);
        sb.append(", injectionEnabled=");
        sb.append(this.injectionEnabled);
        sb.append(", propositionCompleted=");
        sb.append(this.propositionCompleted);
        sb.append(", verifiedIfVisited=");
        sb.append(this.verifiedIfVisited);
        sb.append(", optimizationPoints=");
        sb.append(Arrays.toString(this.optimizationPoints));
        sb.append(", capturePoints=");
        sb.append(Arrays.toString(this.capturePoints));
        sb.append(", trackingPoints=");
        sb.append(Arrays.toString(this.trackingPoints));
        sb.append(", propositionId='");
        sb.append(this.propositionId);
        sb.append('\'');
        sb.append(", propositionName='");
        sb.append(this.propositionName);
        sb.append('\'');
        sb.append(", eventTypeId='");
        sb.append(this.eventTypeId);
        sb.append('\'');
        sb.append(", eventTypeName='");
        sb.append(this.eventTypeName);
        sb.append('\'');
        sb.append(", path='");
        sb.append(this.path);
        sb.append('\'');
        sb.append(", touchpointId='");
        sb.append(this.touchpointId);
        sb.append('\'');
        sb.append(", customerKeyConfiguration=");
        sb.append(this.customerKeyConfiguration);
        sb.append(", pushActionPoints=");
        sb.append(Arrays.toString(this.pushActionPoints));
        sb.append(", optimizationPointsCount=");
        sb.append(this.optimizationPointsCount);
        sb.append(", trackingPointsCount=");
        sb.append(this.trackingPointsCount);
        sb.append(", pullActionPoints=");
        sb.append(Arrays.toString(this.pullActionPoints));
        sb.append(", id='");
        sb.append(this.f3111id);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
