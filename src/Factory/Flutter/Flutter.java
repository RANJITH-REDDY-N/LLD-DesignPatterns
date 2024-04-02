package Factory.Flutter;

import Factory.UIFactory.*;

public class Flutter{
    private final SupportedPlatform supportedPlatform;
    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public static void setTheme() {
        System.out.println("This is to set theme for the application");
    }

    public static void setReferenceRate() {
        System.out.println("This is to set reference rate of the screen while app is open.");
    }

    public UIFactory createUIFactory() {
        return UIFactoryFactory.createUIFactory(supportedPlatform);
    }
}
