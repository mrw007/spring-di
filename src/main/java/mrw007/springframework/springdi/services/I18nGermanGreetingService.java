package mrw007.springframework.springdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("de")
@Service("i18nService")
public class I18nGermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo Welt -- DE";
    }
}
