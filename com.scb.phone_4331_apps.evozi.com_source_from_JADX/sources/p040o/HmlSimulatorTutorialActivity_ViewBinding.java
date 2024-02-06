package p040o;

import android.content.SharedPreferences;

/* renamed from: o.HmlSimulatorTutorialActivity_ViewBinding */
public final class HmlSimulatorTutorialActivity_ViewBinding implements setCvv {
    private final SharedPreferences read;

    public HmlSimulatorTutorialActivity_ViewBinding() {
    }

    @HmlPinActivity
    public HmlSimulatorTutorialActivity_ViewBinding(SharedPreferences sharedPreferences) {
        this.read = sharedPreferences;
    }

    public final String IconCompatParcelizer() {
        return this.read.getString("randomDeviceId", (String) null);
    }
}
