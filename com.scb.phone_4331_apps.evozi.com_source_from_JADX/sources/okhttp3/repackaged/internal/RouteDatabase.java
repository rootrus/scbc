package okhttp3.repackaged.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.repackaged.Route;

public final class RouteDatabase {
    private final Set<Route> ajy = new LinkedHashSet();

    public final void failed(Route route) {
        synchronized (this) {
            this.ajy.add(route);
        }
    }

    public final void connected(Route route) {
        synchronized (this) {
            this.ajy.remove(route);
        }
    }

    public final boolean shouldPostpone(Route route) {
        boolean contains;
        synchronized (this) {
            contains = this.ajy.contains(route);
        }
        return contains;
    }

    public final int failedRoutesCount() {
        int size;
        synchronized (this) {
            size = this.ajy.size();
        }
        return size;
    }
}
