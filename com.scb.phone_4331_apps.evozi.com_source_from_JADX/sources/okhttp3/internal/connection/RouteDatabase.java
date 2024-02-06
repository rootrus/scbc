package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;
import p040o.onGetStartedClick;

public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final void failed(Route route) {
        synchronized (this) {
            onGetStartedClick.write((Object) route, "failedRoute");
            this.failedRoutes.add(route);
        }
    }

    public final void connected(Route route) {
        synchronized (this) {
            onGetStartedClick.write((Object) route, "route");
            this.failedRoutes.remove(route);
        }
    }

    public final boolean shouldPostpone(Route route) {
        boolean contains;
        synchronized (this) {
            onGetStartedClick.write((Object) route, "route");
            contains = this.failedRoutes.contains(route);
        }
        return contains;
    }
}
