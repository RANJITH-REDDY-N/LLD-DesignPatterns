package Factory.UIFactory;

import Factory.Flutter.SupportedPlatform;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform){
        return switch (supportedPlatform) {
            case ANDROID -> new AndroidUIFactory();
            case IOS -> new IosUIFactory();
            default -> new MacUIFactory();
        };
    }
}
