package com.thunderhead.android.infrastructure.server.entitys;

import android.util.Base64;
import p040o.MyECouponActivity_ViewBinding;

public class ReleaseData {
    Long decodedId = null;

    /* renamed from: id */
    String f3113id;
    Person lastModifiedBy;
    long lastModifiedDate;
    boolean launchpad;
    boolean live;
    String name;
    int numItemsIncluded;

    public String getId() {
        return this.f3113id;
    }

    public Long getDecodedId() {
        Long l = this.decodedId;
        if (l != null) {
            return l;
        }
        try {
            this.decodedId = Long.valueOf(Long.parseLong(new String(Base64.decode(this.f3113id.getBytes("UTF-8"), 0), "UTF-8")));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to decode release id. Encoded value: ");
            sb.append(this.f3113id);
            MyECouponActivity_ViewBinding.write(sb.toString());
        }
        return this.decodedId;
    }

    public String getName() {
        return this.name;
    }

    public boolean isLaunchpad() {
        return this.launchpad;
    }

    public boolean isLive() {
        return this.live;
    }

    public int getNumItemsIncluded() {
        return this.numItemsIncluded;
    }

    public long getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public Person getLastModifiedBy() {
        return this.lastModifiedBy;
    }
}
