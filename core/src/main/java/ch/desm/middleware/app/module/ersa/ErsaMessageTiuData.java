package ch.desm.middleware.app.module.ersa;

public class ErsaMessageTiuData {
    private final boolean tractionCutOff;
    private final boolean emergencybrake;
    private final boolean serviceBrake;

    public ErsaMessageTiuData(boolean tractionCutOff, boolean emergencybrake, boolean serviceBrake) {
        this.tractionCutOff = tractionCutOff;
        this.emergencybrake = emergencybrake;
        this.serviceBrake = serviceBrake;
    }

    public boolean isTractionCutOff() {
        return tractionCutOff;
    }

    public boolean isEmergencybrake() {
        return emergencybrake;
    }

    public boolean isServiceBrake() {
        return serviceBrake;
    }
}
