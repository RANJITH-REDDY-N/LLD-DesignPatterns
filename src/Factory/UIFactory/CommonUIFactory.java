package Factory.UIFactory;

import Factory.Flutter.SupportedPlatform;

public class CommonUIFactory {
    public static void setTheme() {
        System.out.println("This is to set theme for the application");
    }

    public static int setReferenceRate() {
        System.out.println("This is to set reference rate of the screen while app is open.");
        return 144;
    }
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform){
        return switch (supportedPlatform) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            default -> new MacUIFactory();
        };
    }
}
