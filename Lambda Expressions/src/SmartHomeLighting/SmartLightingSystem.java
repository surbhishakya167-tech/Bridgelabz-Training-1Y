package SmartHomeLighting;

public class SmartLightingSystem {

    public static void main(String[] args) {

        LightAction motionTrigger = () ->
                System.out.println("Lights ON at full brightness");

        LightAction timeTrigger = () ->
                System.out.println("Lights ON at warm dim brightness");

        LightAction voiceTrigger = () ->
                System.out.println("Lights ON in party mode");

        activateLight(motionTrigger);
        activateLight(timeTrigger);
        activateLight(voiceTrigger);
    }

    public static void activateLight(LightAction action) {
        action.execute();
    }
}