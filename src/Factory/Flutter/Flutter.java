package Factory.Flutter;

import Factory.UIFactory.UIFactory;
import Factory.UIFactory.CommonUIFactory;

public class Flutter{
    private final SupportedPlatform supportedPlatform;
    public Flutter(SupportedPlatform supportedPlatform){
        this.supportedPlatform = supportedPlatform;
    }

    public UIFactory createUIFactory() {
        return CommonUIFactory.getUIFactory(supportedPlatform);
    }
}
