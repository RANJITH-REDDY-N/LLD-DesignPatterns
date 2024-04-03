package factory.UIFactory;

import factory.Flutter.SupportedPlatform;

public class UIFactoryFactory {
    /**
     * This method is a practical design pattern
     * This method has a Single Responsibility to manage the type of UIFactory (i.e., Type of Operating System)
     * @param supportedPlatform
     * @return UIFactory
     */
    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform){
        return switch (supportedPlatform) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            default -> new MacUIFactory();
        };
    }
}
