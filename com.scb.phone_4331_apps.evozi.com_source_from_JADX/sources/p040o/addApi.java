package p040o;

import java.util.List;

/* renamed from: o.addApi */
public final class addApi extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.addApi$read */
    public static final class read {
        public final rsnScriptSetVarI IconCompatParcelizer;
        public final List<rsnScriptForEach[]> MediaBrowserCompat$ItemReceiver;

        private read() {
        }

        public read(rsnScriptSetVarI rsnscriptsetvari, List<rsnScriptForEach[]> list) {
            this.IconCompatParcelizer = rsnscriptsetvari;
            this.MediaBrowserCompat$ItemReceiver = list;
        }
    }

    @HmlPinActivity
    public addApi(registerConnectionCallbacks registerconnectioncallbacks, stopAutoManage stopautomanage, setHandler sethandler) {
        onGetStartedClick.write((Object) registerconnectioncallbacks, "accountFromEntityMapper");
        onGetStartedClick.write((Object) stopautomanage, "accountToEntityMapper");
        onGetStartedClick.write((Object) sethandler, "txnDetailsEntityMapper");
    }
}
